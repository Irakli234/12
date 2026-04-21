from flask import Flask, request, jsonify
from pydantic import ValidationError
from model import Spieler
import json
import os

app = Flask(__name__)
JSON_FILE = "spieler.json"

def lade_spieler():
    if not os.path.exists(JSON_FILE):
        return []
    try:
        with open(JSON_FILE, "r", encoding="utf-8") as f:
            return json.load(f)
    except json.JSONDecodeError:
        return []

def speichere_spieler(spieler_liste):
    with open(JSON_FILE, "w", encoding="utf-8") as f:
        json.dump(spieler_liste, f, indent=4, ensure_ascii=False)

@app.route('/spieler', methods=['POST'])
def add_spieler():
    json_data = request.json
    print("Vom Client erhalten:", json_data)  # Debug

    try:
        spieler = Spieler(**json_data)
        alle_spieler = lade_spieler()
        alle_spieler.append(spieler.model_dump(exclude_unset=False))
        speichere_spieler(alle_spieler)

        return jsonify({
            "message": "Spieler erfolgreich angelegt",
            "spieler": spieler.model_dump(exclude_unset=False)
        }), 201

    except ValidationError as e:
        return jsonify({"error": e.errors()}), 400

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=12345)


