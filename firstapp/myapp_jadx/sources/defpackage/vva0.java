package defpackage;

import com.sportybet.android.globalpay.stp.spei.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel$loadMinRequiredTier$1", f = "SpeiByStpDepositViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
public final class vva0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vva0(b bVar, v1b<? super vva0> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vva0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vva0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object obj2 = y5b.a;
        int i = this.a;
        b bVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            d9k d9kVar = bVar.a;
            this.a = 1;
            objA = d9kVar.a(this);
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            int iIntValue = ((Number) objA).intValue();
            wwd0 wwd0Var = bVar.w;
            Integer num = new Integer(iIntValue);
            wwd0Var.getClass();
            wwd0Var.k(null, num);
        }
        return Unit.a;
    }
}
