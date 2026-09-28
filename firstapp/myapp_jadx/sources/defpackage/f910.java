package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f910 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f910(Object obj, int i) {
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
                return f.c.a((f.c) obj, null, 0.0d, null, (uf00) obj2, null, null, null, null, 247);
            case 1:
                oc50 oc50Var = (oc50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                oc50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) oc50Var.B1(), oTPResult);
                return Unit.a;
            default:
                vad0 vad0Var = (vad0) obj2;
                cgb.a(vad0Var.e1(), (String) ((x5a0) vad0Var.c1().v).getValue(), "placeBet", (String) obj);
                return Unit.a;
        }
    }
}
