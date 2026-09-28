package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wbe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wbe(Object obj, int i) {
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
                xbe xbeVar = (xbe) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                xbeVar.b = OtpData.DeviceBlocking.a((OtpData.DeviceBlocking) xbeVar.B1(), oTPResult);
                break;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(ijf0Var);
                break;
        }
        return Unit.a;
    }
}
