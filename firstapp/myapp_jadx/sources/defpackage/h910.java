package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h910 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h910(Object obj, int i) {
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
                f.c cVar = (f.c) obj;
                return f.c.a(cVar, null, 0.0d, shl.a(cVar.c, (UiText) obj2, null, null, null, 62), null, null, null, null, null, 251);
            default:
                oc50 oc50Var = (oc50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                oc50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) oc50Var.B1(), oTPResult);
                return Unit.a;
        }
    }
}
