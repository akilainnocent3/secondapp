package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class txd0<T> implements Iterator<T>, dhp {
    public final SnapshotStateSet<T> a;
    public final Iterator<T> b;
    public T c;
    public T d;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    public txd0(SnapshotStateSet<T> snapshotStateSet, Iterator<? extends T> it) {
        this.a = snapshotStateSet;
        this.b = it;
        uxd0 uxd0Var = snapshotStateSet.a;
        uxd0Var.getClass();
        this.e = ((uxd0) n5a0.e(uxd0Var)).d;
        this.c = this.d;
        this.d = it.hasNext() ? (T) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        uxd0 uxd0Var = this.a.a;
        uxd0Var.getClass();
        if (((uxd0) n5a0.e(uxd0Var)).d != this.e) {
            sx0.a();
            return null;
        }
        this.c = this.d;
        Iterator<T> it = this.b;
        this.d = it.hasNext() ? it.next() : null;
        T t = this.c;
        if (t != null) {
            return t;
        }
        fm20.a();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet<T> snapshotStateSet = this.a;
        uxd0 uxd0Var = snapshotStateSet.a;
        uxd0Var.getClass();
        if (((uxd0) n5a0.e(uxd0Var)).d != this.e) {
            sx0.a();
            return;
        }
        T t = this.c;
        if (t == null) {
            fm20.a();
            return;
        }
        snapshotStateSet.remove(t);
        this.c = null;
        Unit unit = Unit.a;
        uxd0 uxd0Var2 = snapshotStateSet.a;
        uxd0Var2.getClass();
        this.e = ((uxd0) n5a0.e(uxd0Var2)).d;
    }
}
