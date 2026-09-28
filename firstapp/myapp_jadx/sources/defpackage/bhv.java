package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initWorldCupPassBannerObserver$1", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bhv extends tje0 implements Function2<x1k0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yp40 b;
    public final /* synthetic */ rhv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhv(v1b v1bVar, rhv rhvVar, yp40 yp40Var) {
        super(2, v1bVar);
        this.b = yp40Var;
        this.c = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bhv bhvVar = new bhv(v1bVar, this.c, this.b);
        bhvVar.a = obj;
        return bhvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1k0 x1k0Var, v1b<? super Unit> v1bVar) {
        return ((bhv) create(x1k0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        x1k0 x1k0Var = (x1k0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        rhv rhvVar = this.c;
        ezj0 ezj0VarA = dzj0.a(x1k0Var, new ui3(rhvVar, 1 == true ? 1 : 0), new vi3(rhvVar, 1 == true ? 1 : 0), false);
        boolean z = ezj0VarA != null;
        yp40 yp40Var = this.b;
        if (z && !yp40Var.a) {
            rhvVar.B.a(s2k0.l.a, k00.d);
        }
        yp40Var.a = z;
        wwd0 wwd0Var = rhvVar.O;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cgv.a((cgv) value, false, null, null, null, null, null, 0, 0, null, null, null, false, false, ezj0VarA, Settings.DEFAULT_INITIAL_WINDOW_SIZE)));
        return Unit.a;
    }
}
