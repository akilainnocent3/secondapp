package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$onLoyaltyClick$1", f = "MeViewModel.kt", l = {719}, m = "invokeSuspend", v = 2)
public final class ehv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;
    public final /* synthetic */ vdv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehv(rhv rhvVar, vdv vdvVar, v1b<? super ehv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
        this.c = vdvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ehv(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ehv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pdd0 kgvVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        rhv rhvVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            hfv hfvVar = ((cgv) rhvVar.O.getValue()).f;
            int iOrdinal = this.c.ordinal();
            if (iOrdinal == 0) {
                kgvVar = new kgv(hfvVar.d, hfvVar.e);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                kgvVar = jgv.a;
            }
            rhvVar.B.a(kgvVar, k00.d);
            lfv lfvVar = rhvVar.d;
            this.a = 1;
            obj = lfvVar.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        rhvVar.M.a((iev) obj);
        return Unit.a;
    }
}
