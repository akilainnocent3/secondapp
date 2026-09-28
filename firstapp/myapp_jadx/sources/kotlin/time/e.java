package kotlin.time;

import com.sportybet.plugin.realsports.data.CashOut;
import defpackage.mq0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final int[] a = {1, 10, 100, 1000, 10000, 100000, CashOut.BIG_NUMBER, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};
    public static final int[] b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] c = {3, 6};
    public static final int[] d = {1, 2, 4, 5, 7, 8};

    public static final void a(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    public static final f.a b(CharSequence charSequence, String str, int i, Function1<? super Character, Boolean> function1) {
        char cCharAt = charSequence.charAt(i);
        if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
            return null;
        }
        return c(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i);
    }

    public static final f.a c(CharSequence charSequence, String str) {
        StringBuilder sbB = mq0.b(str, " when parsing an Instant from \"");
        sbB.append(e(64, charSequence));
        sbB.append('\"');
        return new f.a(charSequence, sbB.toString());
    }

    public static final int d(int i, CharSequence charSequence) {
        return (charSequence.charAt(i + 1) - '0') + ((charSequence.charAt(i) - '0') * 10);
    }

    public static final String e(int i, CharSequence charSequence) {
        if (charSequence.length() <= i) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i).toString() + "...";
    }
}
