package androidx.compose.ui.layout;

import defpackage.biv;
import defpackage.hb5;
import defpackage.ko20;
import defpackage.kxa;
import defpackage.mma;
import defpackage.qlr;
import defpackage.rce0;
import defpackage.tsr;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final h0 a;
    public k b;
    public final e c;
    public final c d;
    public final d e;

    public interface a {
        b apply();

        boolean c();

        void cancel();
    }

    public static final class c extends qlr implements Function2<tsr, mma, Unit> {
        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, mma mmaVar) {
            g0.this.a().b = mmaVar;
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function2<tsr, Function2<? super rce0, ? super kxa, ? extends biv>, Unit> {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, Function2<? super rce0, ? super kxa, ? extends biv> function2) {
            k kVarA = g0.this.a();
            tsrVar.j(new l(kVarA, function2, kVarA.E));
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function2<tsr, g0, Unit> {
        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, g0 g0Var) {
            tsr tsrVar2 = tsrVar;
            g0 g0Var2 = g0.this;
            h0 h0Var = g0Var2.a;
            k kVar = tsrVar2.W;
            if (kVar == null) {
                kVar = new k(tsrVar2, h0Var);
                tsrVar2.W = kVar;
            }
            g0Var2.b = kVar;
            g0Var2.a().e();
            k kVarA = g0Var2.a();
            if (kVarA.c != h0Var) {
                kVarA.c = h0Var;
                kVarA.f(false);
                tsr.h0(kVarA.a, false, 7);
            }
            return Unit.a;
        }
    }

    public g0(h0 h0Var) {
        this.a = h0Var;
        this.c = new e();
        this.d = new c();
        this.e = new d();
    }

    public final k a() {
        k kVar = this.b;
        if (kVar != null) {
            return kVar;
        }
        hb5.a("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    public interface b {
        default long a(int i) {
            return 0L;
        }

        default int b() {
            return 0;
        }

        default void d(int i, long j) {
        }

        void dispose();

        default void c(ko20 ko20Var) {
        }
    }

    public g0() {
        this(u.a);
    }
}
