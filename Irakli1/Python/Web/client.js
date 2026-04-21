const apiUrl = "/spieler";

document.getElementById("spielerForm").addEventListener("submit", async function(event) {
    event.preventDefault();

    const spieler = {
        name: document.getElementById("name").value,
        alter: parseInt(document.getElementById("alter").value),
        verein: document.getElementById("verein").value,
        position: document.getElementById("position").value
    };

    try {
        const response = await fetch(apiUrl, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(spieler)
        });

        const result = await response.json();
        document.getElementById("serverAntwort").textContent = JSON.stringify(result, null, 2);
        ladeSpieler(); 
    } catch (err) {
        document.getElementById("serverAntwort").textContent = "Fehler: " + err.message;
    }
});

async function ladeSpieler() {
    try {
        const response = await fetch(apiUrl);
        const daten = await response.json();
        const liste = document.getElementById("spielerListe");
        liste.innerHTML = "";
        daten.forEach(s => {
            const li = document.createElement("li");
            li.textContent = `${s.name} (${s.alter}) - ${s.verein} ${s.position}`;
            liste.appendChild(li);
        });
    } catch (err) {
        console.error("Fehler beim Laden der Spieler:", err);
    }
}

ladeSpieler();
