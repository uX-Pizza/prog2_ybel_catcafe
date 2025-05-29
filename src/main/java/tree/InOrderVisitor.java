package tree;

import catcafe.FelineOverLord;

public class InOrderVisitor implements TreeVisitor<FelineOverLord> {
    @Override
    public String visit(Empty<FelineOverLord> node) {
        return "";
    }

    @Override
    public String visit(Node<FelineOverLord> node) {
        return node.leftChild().accept(this).concat("\n" + node.data().name()).concat(node.rightChild().accept(this));
    }
}
