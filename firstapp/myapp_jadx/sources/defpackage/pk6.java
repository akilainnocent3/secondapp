package defpackage;

import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$initLoadCodeViewModel$3", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pk6 extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk6(b bVar, v1b<? super pk6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pk6 pk6Var = new pk6(this.b, v1bVar);
        pk6Var.a = obj;
        return pk6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
        return ((pk6) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tzs tzsVar = (tzs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(tzsVar, tzs.b.a);
        String str = UccrWswQGaIj.XjhVWbbGQ;
        b bVar = this.b;
        if (zG) {
            h330 h330Var = bVar.v0;
            if (h330Var == null) {
                Intrinsics.n(str);
                throw null;
            }
            h330Var.b();
        } else {
            if (!Intrinsics.g(tzsVar, tzs.a.a)) {
                uhc.a();
                return null;
            }
            h330 h330Var2 = bVar.v0;
            if (h330Var2 == null) {
                Intrinsics.n(str);
                throw null;
            }
            h330Var2.a();
        }
        return Unit.a;
    }
}
