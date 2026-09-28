package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xbm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xbm(Object obj, int i) {
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
                List<String> list = dfm.v2;
                ((dfm) obj2).C1.y1((zgm) obj);
                break;
            default:
                x240 x240Var = (x240) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                x240Var.b = OtpData.Reactivate.a((OtpData.Reactivate) x240Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
