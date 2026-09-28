package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n1d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1d(Object obj, int i) {
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
                EncryptedRequest encryptedRequest = (EncryptedRequest) obj;
                encryptedRequest.getClass();
                yfx.h((hjx) obj2, new c2d.h(encryptedRequest), null, 6);
                break;
            default:
                wt40 wt40Var = (wt40) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                wt40Var.b = OtpData.Register.a((OtpData.Register) wt40Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
