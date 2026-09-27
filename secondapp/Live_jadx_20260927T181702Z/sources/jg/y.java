package jg;

import eh.o1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f100465c = new y(0, -9223372036854775807L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f100466d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f100467e = "npt=%.3f-";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f100468f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100470b;

    public y(long j10, long j11) {
        this.f100469a = j10;
        this.f100470b = j11;
    }

    public static String b(long j10) {
        return o1.M(f100467e, Double.valueOf(j10 / 1000.0d));
    }

    public static y d(String str) throws d4 {
        long j10;
        Matcher matcher = f100466d.matcher(str);
        com.google.android.exoplayer2.source.rtsp.h.a(matcher.matches(), str);
        String strGroup = matcher.group(1);
        com.google.android.exoplayer2.source.rtsp.h.a(strGroup != null, str);
        long j11 = ((String) o1.o(strGroup)).equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j10 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                com.google.android.exoplayer2.source.rtsp.h.a(j10 >= j11, str);
            } catch (NumberFormatException e10) {
                throw d4.c(strGroup2, e10);
            }
        } else {
            j10 = -9223372036854775807L;
        }
        return new y(j11, j10);
    }

    public long a() {
        return this.f100470b - this.f100469a;
    }

    public boolean c() {
        return this.f100470b == -9223372036854775807L;
    }
}
