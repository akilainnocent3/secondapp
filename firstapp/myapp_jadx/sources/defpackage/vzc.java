package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vzc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vzc(Object obj, int i) {
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
                wzc wzcVar = (wzc) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                wzcVar.b = OtpData.Deactivate.a((OtpData.Deactivate) wzcVar.B1(), oTPResult);
                break;
            default:
                ((Function1) obj2).invoke(new y3n.a(((Boolean) obj).booleanValue()));
                break;
        }
        return Unit.a;
    }
}
