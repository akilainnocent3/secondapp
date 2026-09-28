package defpackage;

import android.net.Uri;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.account.KycNativeCameraActivity;
import com.sportybet.android.gp.tz.R;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class utp implements h8n.f {
    public final /* synthetic */ KycNativeCameraActivity a;
    public final /* synthetic */ File b;

    public utp(KycNativeCameraActivity kycNativeCameraActivity, File file) {
        this.a = kycNativeCameraActivity;
        this.b = file;
    }

    @Override // h8n.f
    public final void a(k8n k8nVar) {
        k8nVar.getClass();
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        KycNativeCameraActivity.a aVar2 = KycNativeCameraActivity.i;
        final KycNativeCameraActivity kycNativeCameraActivity = this.a;
        aVar.p(k8nVar, "nativeCamera takePhoto failed, %s", kycNativeCameraActivity.y1());
        aVar.q(MyLog.TAG_FILE_PROVIDER);
        aVar.p(k8nVar, "Failed to capture KYC native photo", new Object[0]);
        kycNativeCameraActivity.runOnUiThread(new Runnable() { // from class: ttp
            @Override // java.lang.Runnable
            public final void run() {
                KycNativeCameraActivity.a aVar3 = KycNativeCameraActivity.i;
                ((x5a0) kycNativeCameraActivity.e).setValue(Boolean.FALSE);
                zyf0.a(R.string.common_feedback__something_went_wrong);
            }
        });
    }

    @Override // h8n.f
    public final void b(h8n.h hVar) {
        hVar.getClass();
        final KycNativeCameraActivity kycNativeCameraActivity = this.a;
        String strH = yrh0.h(kycNativeCameraActivity);
        File file = this.b;
        final Uri uriC = mkh.c(kycNativeCameraActivity, strH, file);
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("nativeCamera imageSaved, result=%s, fileSize=%s, %s", KycNativeCameraActivity.A1(uriC), Long.valueOf(file.length()), kycNativeCameraActivity.y1());
        kycNativeCameraActivity.runOnUiThread(new Runnable() { // from class: stp
            @Override // java.lang.Runnable
            public final void run() {
                KycNativeCameraActivity.a aVar2 = KycNativeCameraActivity.i;
                KycNativeCameraActivity kycNativeCameraActivity2 = kycNativeCameraActivity;
                ((x5a0) kycNativeCameraActivity2.e).setValue(Boolean.FALSE);
                Uri uri = uriC;
                uri.getClass();
                ((x5a0) kycNativeCameraActivity2.d).setValue(uri);
            }
        });
    }
}
