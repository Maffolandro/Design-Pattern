class Husband:
  #### NON MODIFICARE ####
  def __init__(self, *args):
    self._initialized = false;
    self._data = args;
  
  def _callInit(self):
    if not self._initialized:
      self._initialized = true;
      _lazyInit(*self._data); #(check how to unzip?)
  
  #### MODIFICARE DA QUI IN POI ####
  # Inserire qui eventuali variabili statiche
  
  
  def _lazyInit(self, *args):
    self.trash = [arg for arg in args];

  def takeOutTrash(self):
    _callInit();
    if (self.trash.length > 10):
      print(trash.pop() + " thrown away.");
    else:
      print("Already done!");
      
#### CODICE PER VEDERE IL FUNZIONAMENTO ####
mark = Husband(["Bottle", "Bottle", "Pizza's leftover", "Diaper", "Tin", "Tin", "Rotten apple", "Plastic bag"]);
for i in range(10):
  mark.takeOutTrash();
