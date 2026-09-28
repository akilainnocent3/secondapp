package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class wqk0 extends fqk0 {
    public final transient Object c;

    public wqk0(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.spk0
    public final void a(Object[] objArr) {
        objArr[0] = this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // defpackage.fqk0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new jqk0(this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return tug.a("[", this.c.toString(), "]");
    }
}
