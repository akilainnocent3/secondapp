package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class ags<E> extends d48<E, Set<? extends E>, LinkedHashSet<E>> {
    public final zfs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ags(php<E> phpVar) {
        super(phpVar);
        phpVar.getClass();
        pd80 descriptor = phpVar.getDescriptor();
        descriptor.getClass();
        this.b = new zfs(descriptor);
    }

    @Override // defpackage.r2
    public final Object a() {
        return new LinkedHashSet();
    }

    @Override // defpackage.r2
    public final int b(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        return linkedHashSet.size();
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
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        return linkedHashSet;
    }

    @Override // defpackage.b48
    public final void i(int i, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        linkedHashSet.add(obj2);
    }
}
