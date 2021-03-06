package com.microchip.apps.ezbl;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;





















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































class DecodedNodeList
{
  List<DecodedNode> list = new ArrayList();
  DecodedNode first = null;
  DecodedNode firstDefault = null;
  

  public DecodedNodeList() {}
  
  public DecodedNodeList(boolean setFirstDefault)
  {
    if (setFirstDefault)
      firstDefault = new DecodedNode();
  }
  
  public DecodedNodeList(DecodedNode firstDecodedNode) {
    list.add(first);
    firstDefault = firstDecodedNode;
    first = firstDecodedNode;
  }
  
  public void putAll(List<DecodedNode> decodedNodes) {
    list.addAll(decodedNodes);
  }
  
  public void putAll(DecodedNodeList decodedNodes) {
    list.addAll(list);
  }
  
  public void put(DecodedNode decodedNode) {
    list.add(decodedNode);
  }
  
  public void put(Node node) {
    list.add(new DecodedNode(node));
  }
}
