package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j590 {
    public final boolean a;
    public final Function1<k590, Boolean> b;
    public final boolean c;
    public goh d;
    public final c20<k590> e;
    public goh<Float> f;
    public goh<Float> g;

    /* JADX WARN: Multi-variable type inference failed */
    public j590(boolean z, Function0<Float> function0, Function0<Float> function1, k590 k590Var, Function1<? super k590, Boolean> function2, boolean z2) {
        this.a = z;
        this.b = function2;
        this.c = z2;
        if (z && k590Var == k590.c) {
            hb5.a("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && k590Var == k590.a) {
            hb5.a("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        this.d = b590.a;
        this.e = new c20<>(k590Var, new zxc(function0, 2), function1, new d590(this), function2);
        this.f = yi0.c();
        this.g = yi0.c();
    }

    public static Object a(j590 j590Var, k590 k590Var, goh gohVar, v1b v1bVar) {
        Object objB = j590Var.e.b(k590Var, huw.a, new h590(j590Var, ((t5a0) j590Var.e.k).j(), gohVar, null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    public final Object b(tje0 tje0Var) {
        k590 k590Var = k590.b;
        if (!this.b.invoke(k590Var).booleanValue()) {
            return Unit.a;
        }
        Object objA = a(this, k590Var, this.f, tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    public final k590 c() {
        return (k590) ((x5a0) this.e.g).getValue();
    }

    public final Object d(v1b<? super Unit> v1bVar) {
        if (this.c) {
            ib5.a("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        k590 k590Var = k590.a;
        if (!this.b.invoke(k590Var).booleanValue()) {
            return Unit.a;
        }
        Object objA = a(this, k590Var, this.g, v1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    public final boolean e() {
        return ((x5a0) this.e.g).getValue() != k590.a;
    }

    public final Object f(tje0 tje0Var) {
        if (this.a) {
            ib5.a("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        k590 k590Var = k590.c;
        if (!this.b.invoke(k590Var).booleanValue()) {
            return Unit.a;
        }
        Object objA = a(this, k590Var, this.g, tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    public final Object g(tje0 tje0Var) {
        m9f<k590> m9fVarE = this.e.e();
        k590 k590Var = k590.c;
        if (!m9fVarE.e(k590Var)) {
            k590Var = k590.b;
        }
        if (!this.b.invoke(k590Var).booleanValue()) {
            return Unit.a;
        }
        Object objA = a(this, k590Var, this.f, tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }
}
