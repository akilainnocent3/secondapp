package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class cex implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cex(Object obj, int i) {
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
                dex dexVar = (dex) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                dexVar.b = OtpData.NameUpdate.a((OtpData.NameUpdate) dexVar.B1(), oTPResult);
                break;
            default:
                ((brd0) obj2).a.b((Throwable) obj);
                break;
        }
        return Unit.a;
    }
}
