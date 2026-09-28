package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface zg00<E> extends vcn<E>, Collection, dhp {
    @Override // java.util.Set, defpackage.zg00
    qg00 add(Object obj);

    @Override // java.util.Set, defpackage.zg00
    zg00<E> addAll(Collection<? extends E> collection);

    tg00 builder();

    @Override // java.util.Set, defpackage.zg00
    qg00 remove(Object obj);

    @Override // java.util.Set, defpackage.zg00
    zg00<E> removeAll(Collection<? extends E> collection);
}
