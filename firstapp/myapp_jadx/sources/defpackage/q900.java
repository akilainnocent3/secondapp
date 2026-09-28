package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes4.dex */
public final class q900 implements p900 {
    public final vgn a;
    public final yqm b;
    public final psm c;
    public final k5b d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.KENYA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public q900(com.sporty.android.platform.features.newotp.util.a aVar, d900 d900Var, vgn vgnVar, nel nelVar, yqm yqmVar, psm psmVar, k5b k5bVar) {
        this.a = vgnVar;
        this.b = yqmVar;
        this.c = psmVar;
        this.d = k5bVar;
    }

    public final Intent a(Context context, String str) {
        str.getClass();
        String strS = bjb0.S(str);
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("data_enable_default_action_bar", false);
        intent.putExtra("url", strS);
        return intent;
    }

    public final r900 b(p900.a aVar) {
        aVar.getClass();
        return new r900(aVar, this);
    }

    public final Object c(String str, String str2, x1b x1bVar) {
        return this.a.a(str, "WITHDRAW_CONFIRM", str2, x1bVar);
    }

    public final void d(et7 et7Var) {
        List listK;
        int i = a.a[this.c.getCountryCode().ordinal()];
        if (i != 1) {
            listK = i != 2 ? null : b.k(z76.e, z76.h);
        } else {
            listK = b.k(z76.d, z76.g);
        }
        if (listK != null) {
            ej5.c(et7Var, null, null, new s900(null, this, listK), 3);
        }
    }
}
