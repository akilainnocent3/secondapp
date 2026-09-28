package defpackage;

import android.content.Context;
import com.sporty.android.core.model.cms.CMSLanguage;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hug0 {
    public static final a a;
    public static final hug0 b;
    public static final hug0 c;
    public static final hug0 d;
    public static final hug0 e;
    public static final hug0 f;
    public static final hug0 i;
    public static final /* synthetic */ hug0[] v;

    public static final class a {

        /* JADX INFO: renamed from: hug0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lhug0$a$a;", "", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public interface InterfaceC0655a {
            uqm getAccountHelper();
        }

        @fae
        public static hug0 a(Context context) {
            context.getClass();
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            String languageCode = ((InterfaceC0655a) qag.a(applicationContext, InterfaceC0655a.class)).getAccountHelper().getLanguageCode();
            languageCode.getClass();
            if (languageCode.equals(CMSLanguage.PORTUGUESE_BRAZIL.getLanguageCode())) {
                return hug0.e;
            }
            if (languageCode.equals(CMSLanguage.PORTUGUESE_MOZAMBIQUE.getLanguageCode())) {
                return hug0.f;
            }
            if (languageCode.equals(CMSLanguage.SW.getLanguageCode())) {
                return hug0.c;
            }
            if (languageCode.equals(CMSLanguage.SPANISH_MX.getLanguageCode())) {
                return hug0.d;
            }
            return languageCode.equals(CMSLanguage.FR.getLanguageCode()) ? hug0.i : hug0.b;
        }
    }

    static {
        hug0 hug0Var = new hug0("ENG", 0);
        b = hug0Var;
        hug0 hug0Var2 = new hug0("SW", 1);
        c = hug0Var2;
        hug0 hug0Var3 = new hug0("ES_MX", 2);
        d = hug0Var3;
        hug0 hug0Var4 = new hug0("PT_BR", 3);
        e = hug0Var4;
        hug0 hug0Var5 = new hug0("PT_MZ", 4);
        f = hug0Var5;
        hug0 hug0Var6 = new hug0("FR", 5);
        i = hug0Var6;
        v = new hug0[]{hug0Var, hug0Var2, hug0Var3, hug0Var4, hug0Var5, hug0Var6};
        a = new a();
    }

    public hug0() {
        throw null;
    }

    public static hug0 valueOf(String str) {
        return (hug0) Enum.valueOf(hug0.class, str);
    }

    public static hug0[] values() {
        return (hug0[]) v.clone();
    }
}
