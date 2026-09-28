package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$onRowClick$1", f = "MeViewModel.kt", l = {532}, m = "invokeSuspend", v = 2)
public final class ihv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aev b;
    public final /* synthetic */ rhv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihv(aev aevVar, rhv rhvVar, v1b<? super ihv> v1bVar) {
        super(2, v1bVar);
        this.b = aevVar;
        this.c = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ihv(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ihv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        rhv rhvVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            aev aevVar = this.b;
            int iOrdinal = aevVar.a.ordinal();
            if (iOrdinal == 0) {
                rhvVar.B.a(new kf40.c("me_page"), k00.d, k00.c);
            } else {
                if (iOrdinal == 2) {
                    rhvVar.getClass();
                    ej5.c(o8i0.d(rhvVar), null, null, new dhv(rhvVar, null), 3);
                    rhvVar.B.a(mgv.a, k00.c);
                    return Unit.a;
                }
                if (iOrdinal == 11) {
                    wwd0 wwd0Var = rhvVar.O;
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, cgv.a((cgv) value, false, null, null, null, null, null, 0, 0, null, sev.b, null, false, false, null, 129023)));
                    return Unit.a;
                }
                if (iOrdinal == 12) {
                    rhvVar.getClass();
                    ej5.c(o8i0.d(rhvVar), null, null, new khv(rhvVar, null), 3);
                    return Unit.a;
                }
            }
            lfv lfvVar = rhvVar.d;
            this.a = 1;
            objB = lfvVar.b(aevVar, this);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = obj;
        }
        iev ievVar = (iev) objB;
        if (ievVar != null) {
            rhvVar.M.a(ievVar);
        }
        return Unit.a;
    }
}
