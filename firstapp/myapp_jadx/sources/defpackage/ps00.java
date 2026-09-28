package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ps00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ps00(Object obj, int i) {
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
                qs00 qs00Var = (qs00) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                qs00Var.b = OtpData.PhoneMigration.a((OtpData.PhoneMigration) qs00Var.B1(), oTPResult);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((nn40) obj2).v0(str);
                break;
        }
        return Unit.a;
    }
}
