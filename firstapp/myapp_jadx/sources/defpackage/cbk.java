package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixDepositPollingConfigUseCase$invoke$2", f = "GetPixDepositPollingConfigUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cbk extends tje0 implements gaj<Integer, Integer, v1b<? super f810>, Object> {
    public /* synthetic */ int a;
    public /* synthetic */ int b;

    @Override // defpackage.gaj
    public final Object invoke(Integer num, Integer num2, v1b<? super f810> v1bVar) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        cbk cbkVar = new cbk(3, v1bVar);
        cbkVar.a = iIntValue;
        cbkVar.b = iIntValue2;
        return cbkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new f810(i, i2);
    }
}
