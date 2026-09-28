package defpackage;

import android.app.Application;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.sporty.android.core.model.captcha.CaptchaProvider;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class c6l implements jd6 {
    public final Application a;
    public a b;
    public final int c = CaptchaProvider.GoogleRecaptchaEnterprise.getId();

    public static final class a {
        public final String a;
        public final RecaptchaTasksClient b;

        public a(String str, RecaptchaTasksClient recaptchaTasksClient) {
            this.a = str;
            this.b = recaptchaTasksClient;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RClient(siteKey=" + this.a + ", recaptchaTasksClient=" + this.b + ")";
        }
    }

    public c6l(Application application) {
        this.a = application;
    }

    public static void e(String str, Exception exc) {
        String string;
        String errorMessage;
        RecaptchaErrorCode errorCode;
        if (!(exc instanceof RecaptchaException)) {
            exc = null;
        }
        RecaptchaException recaptchaException = (RecaptchaException) exc;
        if (recaptchaException == null || (errorCode = recaptchaException.getErrorCode()) == null || (string = errorCode.toString()) == null) {
            string = "unknown_error_code";
        }
        if (recaptchaException == null || (errorMessage = recaptchaException.getErrorMessage()) == null) {
            errorMessage = "unknown_error_message";
        }
        String strSubstringMsg = AnalyticsParam.INSTANCE.substringMsg(string + " - " + errorMessage);
        f00 f00Var = vgb0.a;
        vgb0.c(str, jpu.b(new Pair("error_code", strSubstringMsg)), false);
    }

    @Override // defpackage.jd6
    public final ct90<String> b(String str, j6c j6cVar) {
        j6cVar.getClass();
        ct90<R> ct90VarD = new lu90(new qu90(Boolean.TRUE), new v5l(new u5l(this, str))).d(va0.a());
        final w5l w5lVar = new w5l(j6cVar, this);
        return new lu90(ct90VarD, new faj() { // from class: x5l
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                obj.getClass();
                return (dw90) w5lVar.invoke(obj);
            }
        });
    }

    @Override // defpackage.jd6
    public final ct90<Boolean> c(String str) {
        return new xu90(new lu90(new qu90(Boolean.TRUE), new v5l(new u5l(this, str))).d(va0.a()), new ifg(new o5l()));
    }

    @Override // defpackage.jd6
    public final int d() {
        return this.c;
    }
}
