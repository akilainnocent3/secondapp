package defpackage;

import com.sportybet.plugin.realsports.data.CashOut;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes6.dex */
public final class jaa0 {
    public static final DecimalFormat a;
    public static final SimpleDateFormat b;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        a = decimalFormat;
        b = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
    }

    public static String a(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        DecimalFormat decimalFormat = a;
        if (i < 10000) {
            String str = decimalFormat.format(((double) i) / 1000.0d);
            str.getClass();
            return StringsKt.c0(str, ".0").concat("K");
        }
        if (i < 1000000) {
            return m58.a(i / 1000, "K");
        }
        if (i >= 10000000) {
            return i < 1000000000 ? m58.a(i / CashOut.BIG_NUMBER, "M") : m58.a(i / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, "B");
        }
        String str2 = decimalFormat.format(((double) i) / 1000000.0d);
        str2.getClass();
        return StringsKt.c0(str2, ".0").concat("M");
    }
}
