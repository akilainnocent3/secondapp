package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel$onViewInitialized$3", f = "GlobalDepositViewModel.kt", l = {136}, m = "invokeSuspend", v = 2)
public final class g1l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a1l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1l(a1l a1lVar, v1b<? super g1l> v1bVar) {
        super(2, v1bVar);
        this.b = a1lVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g1l(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g1l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            a1l a1lVar = this.b;
            f1i f1iVar = a1lVar.d.g;
            lyh<Integer> intFlow = a1lVar.c.a.getIntFlow("last_successful_deposit_channel_id");
            Object objA = r78.a(this, new i1l(a1lVar), new o1i(new b1l(a1lVar, null), null), q1i.a, new lyh[]{f1iVar, intFlow});
            if (objA != y5b.a) {
                objA = Unit.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ib5.a(CaBJCMnsV.tytWoLPYZmKe);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
