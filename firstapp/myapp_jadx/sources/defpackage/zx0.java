package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zx0 implements Iterable<Object>, dhp {
    public final /* synthetic */ Object[] a;

    public zx0(Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new hx0(this.a);
    }
}
