package ah;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5365a = "HttpUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f5366b = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f5367c = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @Nullable
    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append(TokenBuilder.TOKEN_DELIMITER);
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long b(@Nullable String str, @Nullable String str2) {
        long j10;
        if (TextUtils.isEmpty(str)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                eh.h0.d("HttpUtil", "Unexpected Content-Length [" + str + C4235d4.j.f61462e);
                j10 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f5366b.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong((String) eh.a.g(matcher.group(2))) - Long.parseLong((String) eh.a.g(matcher.group(1)))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            eh.h0.n("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + C4235d4.j.f61462e);
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            eh.h0.d("HttpUtil", "Unexpected Content-Range [" + str2 + C4235d4.j.f61462e);
            return j10;
        }
    }

    public static long c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f5367c.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) eh.a.g(matcher.group(1)));
        }
        return -1L;
    }
}
