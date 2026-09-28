package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class rel<E> extends d48<E, Set<? extends E>, HashSet<E>> {
    public final qel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rel(php<E> phpVar) {
        super(phpVar);
        phpVar.getClass();
        pd80 descriptor = phpVar.getDescriptor();
        descriptor.getClass();
        this.b = new qel(descriptor);
    }

    @Override // defpackage.r2
    public final Object a() {
        return new HashSet();
    }

    @Override // defpackage.r2
    public final int b(Object obj) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        return hashSet.size();
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.r2
    public final Object h(Object obj) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        return hashSet;
    }

    @Override // defpackage.b48
    public final void i(int i, Object obj, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        hashSet.add(obj2);
    }
}
