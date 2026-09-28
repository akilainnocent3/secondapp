package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$special$$inlined$flatMapLatest$2", f = "LNLobbyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class nqq extends tje0 implements gaj<myh<? super mmq>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ spq d;
    public final /* synthetic */ b8k e;
    public final /* synthetic */ nnb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqq(v1b v1bVar, nnb nnbVar, b8k b8kVar, spq spqVar) {
        super(3, v1bVar);
        this.d = spqVar;
        this.e = b8kVar;
        this.f = nnbVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super mmq> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        nqq nqqVar = new nqq(v1bVar, this.f, this.e, this.d);
        nqqVar.b = myhVar;
        nqqVar.c = bool;
        return nqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((Boolean) this.c).booleanValue()) {
                spq spqVar = this.d;
                i6u i6uVar = spqVar.d;
                ss5[] ss5VarArr = {i6uVar.k, i6uVar.h};
                ArrayList arrayList = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    ss5 ss5Var = ss5VarArr[i2];
                    arrayList.add(uzh.b(r0i.e(new yzh(new hqq(ss5Var.a()), new gqq(3, null)), new iqq(ss5Var.b()))));
                }
                gzhVar = r0i.f(uzh.b(r0i.f(new eqq(spqVar.A), new fqq(null, arrayList))), new vpq(null, this.f, this.e, spqVar));
            } else {
                gzhVar = new gzh(mmq.b.a);
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
