package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mp2 extends x<ipc, RecyclerView.d0> {
    public Function0<Unit> b;
    public Function0<Unit> c;
    public final j1b d;

    public mp2() {
        super(new jt2());
        this.d = w5b.a(fse.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        ipc item = getItem(i);
        if (item instanceof ipc.n) {
            return 0;
        }
        if (item instanceof ipc.a) {
            return 2;
        }
        if (item instanceof ipc.h) {
            return 1;
        }
        if (item instanceof ipc.e) {
            return 3;
        }
        if (item instanceof ipc.b) {
            return 4;
        }
        if (item instanceof ipc.f) {
            return 5;
        }
        if (item instanceof ipc.j) {
            return 6;
        }
        if (item instanceof ipc.m) {
            return 7;
        }
        if (item instanceof ipc.l) {
            return 8;
        }
        if (item instanceof ipc.k) {
            return 9;
        }
        if (item instanceof ipc.i) {
            return 10;
        }
        if (item instanceof ipc.g) {
            return 11;
        }
        if (item instanceof ipc.c) {
            return 13;
        }
        return item instanceof ipc.d ? 12 : -1;
    }

    public final void k() {
        Function0<Unit> function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        } else {
            Intrinsics.n("archiveViewMoreListener");
            throw null;
        }
    }

    public final void l() {
        Function0<Unit> function0 = this.b;
        if (function0 != null) {
            function0.invoke();
        } else {
            Intrinsics.n("viewMoreListener");
            throw null;
        }
    }
}
