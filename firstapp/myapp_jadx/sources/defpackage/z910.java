package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeActivity;
import com.sportybet.android.globalpay.pixBtg.depositQrCode.b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z910 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z910(Object obj, int i) {
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
                PixBtgQrCodeActivity pixBtgQrCodeActivity = (PixBtgQrCodeActivity) obj2;
                int i2 = PixBtgQrCodeActivity.d;
                ((b.c) obj).getClass();
                fbh0 fbh0Var = pixBtgQrCodeActivity.b;
                if (fbh0Var == null) {
                    Intrinsics.n("uiRouterManager");
                    throw null;
                }
                fbh0Var.c(o7d.a(wae.HOME), vj5.a(new Pair("show_deposit_successful_message", Boolean.TRUE)));
                pixBtgQrCodeActivity.finish();
                return Unit.a;
            default:
                fd50 fd50Var = (fd50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                fd50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) fd50Var.B1(), oTPResult);
                return Unit.a;
        }
    }
}
