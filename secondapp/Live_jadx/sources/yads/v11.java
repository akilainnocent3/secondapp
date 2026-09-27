package yads;

import com.ironsource.C4235d4;
import com.ironsource.Y1;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class v11 {
    public static lr a(e82 e82Var) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = e82Var.f148573c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals(jl.c.f100615u) || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA2 = str3 != null ? a(str3) : j10;
        String str4 = (String) map.get(kj.d.f102507r0);
        long jA3 = str4 != null ? a(str4) : j10;
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            j14 = (j11 * 1000) + jCurrentTimeMillis;
            if (z10) {
                j13 = j14;
            } else {
                Long.signum(j12);
                j13 = (j12 * 1000) + j14;
            }
        } else {
            j13 = (jA <= j10 || jA2 < jA) ? j10 : (jA2 - jA) + jCurrentTimeMillis;
            j14 = j13;
        }
        lr lrVar = new lr();
        lrVar.f152089a = e82Var.f148572b;
        lrVar.f152090b = str5;
        lrVar.f152094f = j14;
        lrVar.f152093e = j13;
        lrVar.f152091c = jA;
        lrVar.f152092d = jA3;
        lrVar.f152095g = map;
        lrVar.f152096h = e82Var.f148574d;
        return lrVar;
    }

    public static String a(Map map) {
        String str;
        if (map == null || (str = (String) map.get("Content-Type")) == null) {
            return CharEncoding.ISO_8859_1;
        }
        String[] strArrSplit = str.split(";", 0);
        for (int i10 = 1; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].trim().split(C4235d4.j.f61456b, 0);
            if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                return strArrSplit2[1];
            }
        }
        return CharEncoding.ISO_8859_1;
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!"0".equals(str) && !Y1.f60333f.equals(str)) {
                boolean z10 = lm3.f152057a;
                boolean z11 = ad1.f146762a;
                return 0L;
            }
            boolean z12 = lm3.f152057a;
            boolean z13 = ad1.f146762a;
            return 0L;
        }
    }
}
