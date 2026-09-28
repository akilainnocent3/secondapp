package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class enb0 {
    public static final p8i a = g8i.a(n8i.a(R.font.sporty_cars, null, 0, 14));
    public static final long b = r58.d(4294960224L);

    static {
        r58.d(4293309183L);
    }

    public static final boolean a(String str) {
        if (str == null || StringsKt.U(str)) {
            return false;
        }
        String lowerCase = StringsKt.t0(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strReplace = lowerCase.replace('_', '-');
        strReplace.getClass();
        return strReplace.equals("sporty-cars") || strReplace.equals("sportycars");
    }
}
