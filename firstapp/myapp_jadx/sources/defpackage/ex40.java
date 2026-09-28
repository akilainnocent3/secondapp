package defpackage;

import android.os.SystemClock;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ex40 implements ee00 {
    public final /* synthetic */ fx40 a;

    public ex40(fx40 fx40Var) {
        this.a = fx40Var;
    }

    @Override // defpackage.ee00
    public final void onDenied() {
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        fx40 fx40Var = this.a;
        aVar.a("cameraPermission denied, %s", RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) fx40Var.b.b));
        zyf0.a(R.string.common_functions__permission_denied);
        fx40Var.d(null, "camera_permission_denied");
    }

    @Override // defpackage.ee00
    public final void onGranted() {
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        fx40 fx40Var = this.a;
        aVar.a("cameraPermission granted, %s", RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) fx40Var.b.b));
        fx40Var.e = SystemClock.elapsedRealtime();
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("native camera launch, %s", RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) fx40Var.b.b));
        fx40Var.f("native_camera", new g7i(fx40Var, 2));
    }
}
