package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$special$$inlined$flatMapLatest$4", f = "LNStreamPlayerViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ufr extends tje0 implements gaj<myh<? super lk50<? extends qcn<? extends e3q>>>, lk50<? extends b5q>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mfr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufr(v1b v1bVar, mfr mfrVar) {
        super(3, v1bVar);
        this.d = mfrVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends qcn<? extends e3q>>> myhVar, lk50<? extends b5q> lk50Var, v1b<? super Unit> v1bVar) {
        ufr ufrVar = new ufr(v1bVar, this.d);
        ufrVar.b = myhVar;
        ufrVar.c = lk50Var;
        return ufrVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lk50 lk50Var = (lk50) this.c;
            if (lk50Var instanceof lk50.c) {
                mfr mfrVar = this.d;
                q3k q3kVar = mfrVar.y;
                String str = mfrVar.b;
                String str2 = ((b5q) ((lk50.c) lk50Var).a).a;
                q3kVar.getClass();
                str.getClass();
                str2.getClass();
                gzhVar = bm50.a(new p3k(new or60(new u6q(q3kVar.a, str, str2, null)), q3kVar));
            } else if (lk50Var instanceof lk50.a) {
                gzhVar = new gzh(lk50Var);
            } else {
                lk50.b bVar = lk50.b.a;
                if (!Intrinsics.g(lk50Var, bVar)) {
                    uhc.a();
                    return null;
                }
                gzhVar = new gzh(bVar);
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
