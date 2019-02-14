class Lazy:
  def __init__(self, *args):
    self._initialized = false;
    self._data = args;
  
  def _callInit(self):
    if not self._initialized:
      self._initialized = true;
      _lazyInit(*self._data); #(check how to unzip?)
  
  # Inserire qui eventuali variabili statiche
  
  def _lazyInit(self, *args):
    # Inserire qui l'inizializzazione
    pass;
  
  def wakeup(self):
    _callInit();
    # Inserire logica metodo
