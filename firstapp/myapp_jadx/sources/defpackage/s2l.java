package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s2l extends wtw {

    public static final class a implements Function1<i5a0, wtw> {
        public final /* synthetic */ Function1<Object, Unit> a;
        public final /* synthetic */ Function1<Object, Unit> b;

        public a(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
            this.a = function1;
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final wtw invoke(i5a0 i5a0Var) {
            long j;
            i5a0 i5a0Var2 = i5a0Var;
            synchronized (n5a0.c) {
                j = n5a0.e;
                n5a0.e = 1 + j;
            }
            return new wtw(j, i5a0Var2, this.a, this.b);
        }
    }

    public static final class b implements Function1<i5a0, u340> {
        public final /* synthetic */ Function1<Object, Unit> a;

        public b(Function1<Object, Unit> function1) {
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final u340 invoke(i5a0 i5a0Var) {
            long j;
            i5a0 i5a0Var2 = i5a0Var;
            synchronized (n5a0.c) {
                j = n5a0.e;
                n5a0.e = 1 + j;
            }
            return new u340(j, i5a0Var2, this.a);
        }
    }

    @Override // defpackage.wtw
    public final wtw C(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        return (wtw) ((c5a0) n5a0.b(new m5a0(new a(function1, function2))));
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void c() {
        synchronized (n5a0.c) {
            o();
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void k() {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void l() {
        n6a0.a();
        throw null;
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void m() {
        n5a0.b(n5a0.a);
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final c5a0 u(Function1<Object, Unit> function1) {
        return (u340) ((c5a0) n5a0.b(new m5a0(new b(function1))));
    }

    @Override // defpackage.wtw
    public final e5a0 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
