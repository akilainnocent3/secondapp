package defpackage;

import com.google.android.gms.tasks.OnCanceledListener;
import com.sporty.android.platform.features.captcha.model.CaptchaError;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p5l implements OnCanceledListener, dpy {
    public final /* synthetic */ Object a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        iu90.b((au90.a) this.a, new CaptchaError.CaptchaSDKCancel());
    }
}
