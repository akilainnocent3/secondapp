package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ic50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ic50(Object obj, int i) {
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
                jc50 jc50Var = (jc50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                jc50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) jc50Var.B1(), oTPResult);
                break;
            default:
                vad0 vad0Var = (vad0) obj2;
                cgb.a(vad0Var.e1(), (String) ((x5a0) vad0Var.c1().v).getValue(), "cashout", (String) obj);
                break;
        }
        return Unit.a;
    }
}
