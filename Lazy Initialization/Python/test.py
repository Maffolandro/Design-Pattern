import pytest
import time

def test_checkBeforeCall():
  mark = Husband();
  assert (not mark._initialized);

def test_checkAfterCall():
  mark = Husband();
  mark.takeOutTrash();
  assert (mark._initialized);

def test_checkTiming():
  mark = Husband(["apple", "apple", "apple", "apple"]);
  initTime = 0;
  
  for i in range(4):
    start = time.time();
    mark.takeOutTrash();
    end = time.time();
    if (i == 0):
      initTime = end - start;
    else:
      assert initTime > (end - start);
