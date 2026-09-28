package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fzc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fzc(Object obj, int i) {
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
                gzc gzcVar = (gzc) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                gzcVar.b = OtpData.Deactivate.a((OtpData.Deactivate) gzcVar.B1(), oTPResult);
                break;
            default:
                List list = (List) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szrVar.d(list.size(), new snr(new g79(1), list), new tnr(list), new op8(2039820996, new unr(list), true));
                break;
        }
        return Unit.a;
    }
}
