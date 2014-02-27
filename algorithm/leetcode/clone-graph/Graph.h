#ifndef _GRAPH_H_
#define _GRAPH_H_

class Graph
{
private:
  queue<Node*> nodes;

public:
  void clone(Graph* graph);
  void clear();
};

#endif
