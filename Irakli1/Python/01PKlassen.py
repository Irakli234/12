class ListStatistik:
    
   
    def __init__(self, data_list):
        self.data_list = data_list
    
  
    def list_max(self):
        return max(self.data_list)
    
  
    def list_min(self):
        return min(self.data_list)
    
   
    def list_sum(self):
        return sum(self.data_list)
    
   
    def list_mean(self):
        return sum(self.data_list) / len(self.data_list)
    
   
    def list_median(self):
        sorted_list = sorted(self.data_list)
        n = len(sorted_list)
        mid = n // 2
        if n % 2 == 0:
            return (sorted_list[mid - 1] + sorted_list[mid]) / 2.0
        return sorted_list[mid]
    


numbers = [1, 12, -5, -23, 19,7]
print(numbers)                      
numbers_sorted = numbers.copy()     
numbers_sorted.sort()
print(numbers_sorted)               

ls = ListStatistik(numbers)
print("Max: ", ls.list_max())       
print("Min: ", ls.list_min())       
print("Sum: ", ls.list_sum())       
print("Mean: ", ls.list_mean())     
print("Median: ", ls.list_median()) 