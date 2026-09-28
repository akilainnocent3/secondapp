package defpackage;

import android.app.Application;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u5l implements Function1 {
    public final /* synthetic */ c6l a;
    public final /* synthetic */ String b;

    public /* synthetic */ u5l(c6l c6lVar, String str) {
        this.a = c6lVar;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        final c6l c6lVar = this.a;
        c6l.a aVar = c6lVar.b;
        final String str = this.b;
        if (aVar != null) {
            if (!aVar.a.equals(str)) {
                aVar = null;
            }
            if (aVar != null) {
                return new qu90(aVar);
            }
        }
        return new au90(new bv90() { // from class: y5l
            @Override // defpackage.bv90
            public final void a(final au90.a aVar2) {
                c6l c6lVar2 = c6lVar;
                Application application = c6lVar2.a;
                String str2 = str;
                Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient(application, str2);
                final q5l q5lVar = new q5l(str2, c6lVar2, aVar2);
                tasksClient.addOnSuccessListener(new OnSuccessListener() { // from class: r5l
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj2) {
                        q5lVar.invoke(obj2);
                    }
                }).addOnFailureListener(new OnFailureListener(c6lVar2, aVar2) { // from class: s5l
                    public final /* synthetic */ au90.a a;

                    {
                        this.a = aVar2;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        exc.getClass();
                        c6l.e("recaptcha_ent_client_failed_android", exc);
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_CAPTCHA);
                        aVar3.a("GoogleRecaptchaEnterprise init Failure", new Object[0]);
                        iu90.b(this.a, new CaptchaError.CaptchaNeedRetry(null, 1, null));
                    }
                }).addOnCanceledListener(new OnCanceledListener() { // from class: t5l
                    @Override // com.google.android.gms.tasks.OnCanceledListener
                    public final void onCanceled() {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_CAPTCHA);
                        aVar3.a("GoogleRecaptchaEnterprise init Canceled", new Object[0]);
                        iu90.b(aVar2, new CaptchaError.CaptchaSDKCancel());
                    }
                });
            }
        }).d(wm70.c);
    }
}
