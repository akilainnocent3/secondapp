package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cce implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cce(Object obj, int i) {
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
                dce dceVar = (dce) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                dceVar.b = OtpData.DeviceBlocking.a((OtpData.DeviceBlocking) dceVar.B1(), oTPResult);
                return Unit.a;
            default:
                ygx ygxVar = (ygx) obj;
                ygxVar.getClass();
                return Boolean.valueOf(!((igx) obj2).m.containsKey(Integer.valueOf(ygxVar.b.e)));
        }
    }
}
