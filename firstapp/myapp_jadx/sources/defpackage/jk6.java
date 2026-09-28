package defpackage;

import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$initFeaturedCodesViewModel$3", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jk6 extends tje0 implements Function2<wz80, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk6(b bVar, v1b<? super jk6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jk6 jk6Var = new jk6(this.b, v1bVar);
        jk6Var.a = obj;
        return jk6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wz80 wz80Var, v1b<? super Unit> v1bVar) {
        return ((jk6) create(wz80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wz80 wz80Var = (wz80) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        xz80 xz80Var = this.b.B;
        if (xz80Var != null) {
            xz80Var.a(wz80Var);
            return Unit.a;
        }
        Intrinsics.n("shareCodeNavigator");
        throw null;
    }
}
