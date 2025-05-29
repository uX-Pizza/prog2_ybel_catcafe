package tree;

import catcafe.FelineOverLord;

public class PostOrderVisitor implements TreeVisitor<FelineOverLord> {
    @Override
    public String visit(Empty<FelineOverLord> node) {
        return "";
    }

    @Override
    public String visit(Node<FelineOverLord> node) {
        return node.rightChild().accept(this).concat("\n" + node.data().name()).concat(node.leftChild().accept(this));
    }
}
