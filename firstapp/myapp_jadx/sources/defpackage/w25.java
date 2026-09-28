package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w25 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w25(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                twd0 twd0Var = (twd0) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.k(((Number) twd0Var.getValue()).floatValue());
                a7lVar.v(((Number) twd0Var.getValue()).floatValue());
                break;
            default:
                ke50 ke50Var = (ke50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ke50Var.b = OtpData.ResetPin.a((OtpData.ResetPin) ke50Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
