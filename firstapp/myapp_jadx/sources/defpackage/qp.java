package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sq sqVar = (sq) obj;
                sqVar.getClass();
                return Boolean.valueOf(sqVar.a.equals(((ir) obj2).a));
            default:
                jxi jxiVar = (jxi) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                jxiVar.z.setVisibility(!zBooleanValue ? 0 : 8);
                jxiVar.i.setVisibility(zBooleanValue ? 0 : 8);
                return Unit.a;
        }
    }
}
