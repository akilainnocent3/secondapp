package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface uf00<E> extends qcn<E>, Collection, dhp {

    public interface a<E> extends List<E>, Collection, ehp, fhp {
        uf00<E> build();
    }

    @Override // java.util.List, defpackage.uf00
    uf00<E> addAll(Collection<? extends E> collection);

    eh00 builder();

    uf00 g();

    uf00<E> set(int i, E e);

    uf00 u(Integer num);
}
