package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$progressBarVisibility$1$1", f = "CrashInitiatedFragment.kt", l = {983}, m = "invokeSuspend", v = 1)
public final class qnb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ enb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnb(enb enbVar, v1b<? super qnb> v1bVar) {
        super(2, v1bVar);
        this.b = enbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qnb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qnb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hvi hviVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(150L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        enb enbVar = this.b;
        hvi hviVar2 = enbVar.a;
        if (hviVar2 != null) {
            hviVar2.E.setVisibility(8);
        }
        enb.a aVar = enbVar.U;
        enbVar.U = enb.a.a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                enbVar.E0();
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                enbVar.R0();
            }
        }
        hvi hviVar3 = enbVar.a;
        if (hviVar3 != null) {
            hviVar3.E.N();
        }
        if (enbVar.K) {
            enbVar.L0();
            if (!enbVar.isRemoving()) {
                if (yju.a("br")) {
                    ytw<Boolean> ytwVar = enbVar.L;
                    Boolean bool = Boolean.TRUE;
                    ((x5a0) ytwVar).setValue(bool);
                    ((x5a0) enbVar.M).setValue(bool);
                } else {
                    enb.D0(enbVar);
                }
            }
            if (!enbVar.O && (((hviVar = enbVar.a) == null || hviVar.E.getVisibility() != 0) && enbVar.o0)) {
                ((x5a0) enbVar.V).setValue(Boolean.TRUE);
            }
        }
        return Unit.a;
    }
}
