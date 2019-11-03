package MyFarm.menu;

import MyFarm.visitor.MyVisitor;

public interface MyAccept {
    public void accept(MyVisitor myVisitor);
}
