package defpackage;

import com.esotericsoftware.spine.android.b;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class wni implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wni(Object obj, int i) {
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
                doi.d((b) ((ytw) obj2).getValue());
                break;
            default:
                vd50 vd50Var = (vd50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                vd50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) vd50Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
