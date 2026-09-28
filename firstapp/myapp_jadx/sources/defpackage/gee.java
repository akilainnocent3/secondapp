package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gee implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gee(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hee heeVar = (hee) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                heeVar.b = OtpData.DeviceLogout.a((OtpData.DeviceLogout) heeVar.B1(), oTPResult);
                return Unit.a;
            default:
                phx phxVarB = mr10.b((Context) obj2);
                phxVarB.n((Bundle) obj);
                return phxVarB;
        }
    }
}
