package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.MxDepositBaseViewModel$getMinRequiredTier$1", f = "MxDepositBaseViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class dvw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ evw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvw(evw evwVar, v1b<? super dvw> v1bVar) {
        super(2, v1bVar);
        this.b = evwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dvw(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dvw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        evw evwVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            d9k d9kVar = evwVar.Y;
            this.a = 1;
            objA = d9kVar.a(this);
            if (objA == y5bVar) {
                return y5bVar;
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
            evwVar.O1().t = new Integer(iIntValue);
        }
        Throwable thA = zi50.a(objA);
        if (thA != null) {
            itf0.a.f(thA, "Failed to get min required tier for MX", new Object[0]);
        }
        return Unit.a;
    }
}
