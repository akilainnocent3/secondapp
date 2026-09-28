package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fe50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe50(Object obj, int i) {
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
                he50 he50Var = (he50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                he50Var.b = OtpData.ResetPin.a((OtpData.ResetPin) he50Var.B1(), oTPResult);
                break;
            default:
                lb80.c((pb80) obj, (String) obj2);
                break;
        }
        return Unit.a;
    }
}
