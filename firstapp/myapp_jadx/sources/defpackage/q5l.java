package defpackage;

import com.google.android.recaptcha.RecaptchaTasksClient;
import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q5l implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ c6l b;
    public final /* synthetic */ au90.a c;

    public /* synthetic */ q5l(String str, c6l c6lVar, au90.a aVar) {
        this.a = str;
        this.b = c6lVar;
        this.c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecaptchaTasksClient recaptchaTasksClient = (RecaptchaTasksClient) obj;
        recaptchaTasksClient.getClass();
        c6l.a aVar = new c6l.a(this.a, recaptchaTasksClient);
        f00 f00Var = vgb0.a;
        vgb0.a("recaptcha_ent_client_success_android");
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_CAPTCHA);
        aVar2.a("GoogleRecaptchaEnterprise init Success", new Object[0]);
        this.b.b = aVar;
        iu90.a(this.c, aVar);
        return Unit.a;
    }
}
