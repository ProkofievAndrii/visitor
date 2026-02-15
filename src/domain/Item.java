package domain;

import operations.Visitor;

public interface Item {
    void accept(Visitor visitor);
}
