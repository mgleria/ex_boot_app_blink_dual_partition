package com.microchip.apps.ezbl;

import java.text.Collator;
import java.util.Comparator;































































































































































































































class SymbolNameComparator
  implements Comparator<Symbol>
{
  SymbolNameComparator() {}
  
  public int compare(Symbol x, Symbol y)
  {
    return Collator.getInstance().compare(name, name);
  }
}
