package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import cj.gc;
import cj.v6;
import cj.w6;
import eh.o1;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jg.w;
import jg.x;
import re.d4;
import zi.c0;
import zi.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f49086a = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f49093h = "RTSP/1.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f49087b = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f49088c = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f49089d = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f49090e = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f49091f = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f49092g = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f49094i = new String(new byte[]{10});

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f49095j = new String(new byte[]{13, 10});

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49097b;

        public a(String str, String str2) {
            this.f49096a = str;
            this.f49097b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f49099b;

        public b(String str, long j10) {
            this.f49098a = str;
            this.f49099b = j10;
        }
    }

    public static void a(boolean z10, @Nullable String str) throws d4 {
        if (!z10) {
            throw d4.c(str, null);
        }
    }

    public static byte[] b(List<String> list) {
        return c0.p(f49095j).k(list).getBytes(g.f49061h);
    }

    public static String c(int i10) {
        if (i10 == 200) {
            return "OK";
        }
        if (i10 == 461) {
            return "Unsupported Transport";
        }
        if (i10 == 500) {
            return "Internal Server Error";
        }
        if (i10 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i10 == 301) {
            return "Move Permanently";
        }
        if (i10 == 302) {
            return "Move Temporarily";
        }
        if (i10 == 400) {
            return "Bad Request";
        }
        if (i10 == 401) {
            return "Unauthorized";
        }
        if (i10 == 404) {
            return "Not Found";
        }
        if (i10 == 405) {
            return "Method Not Allowed";
        }
        switch (i10) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(g.f49061h);
    }

    public static boolean e(List<String> list) {
        return f49088c.matcher(list.get(0)).matches();
    }

    public static boolean f(String str) {
        return f49087b.matcher(str).matches() || f49088c.matcher(str).matches();
    }

    public static long g(String str) throws d4 {
        try {
            Matcher matcher = f49089d.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) eh.a.g(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e10) {
            throw d4.c(str, e10);
        }
    }

    public static int h(String str) throws d4 {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw d4.c(str, e10);
        }
    }

    public static int i(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static v6<Integer> j(@Nullable String str) {
        if (str == null) {
            return v6.z();
        }
        v6.a aVar = new v6.a();
        for (String str2 : o1.J1(str, ",\\s?")) {
            aVar.g(Integer.valueOf(i(str2)));
        }
        return aVar.e();
    }

    public static w k(List<String> list) {
        Matcher matcher = f49087b.matcher(list.get(0));
        eh.a.a(matcher.matches());
        int i10 = i((String) eh.a.g(matcher.group(1)));
        Uri uri = Uri.parse((String) eh.a.g(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        eh.a.a(iIndexOf > 0);
        return new w(uri, i10, new e.b().c(list.subList(1, iIndexOf)).e(), c0.p(f49095j).k(list.subList(iIndexOf + 1, list.size())));
    }

    public static x l(List<String> list) {
        Matcher matcher = f49088c.matcher(list.get(0));
        eh.a.a(matcher.matches());
        int i10 = Integer.parseInt((String) eh.a.g(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        eh.a.a(iIndexOf > 0);
        return new x(i10, new e.b().c(list.subList(1, iIndexOf)).e(), c0.p(f49095j).k(list.subList(iIndexOf + 1, list.size())));
    }

    public static b m(String str) throws d4 {
        long j10;
        Matcher matcher = f49090e.matcher(str);
        if (!matcher.matches()) {
            throw d4.c(str, null);
        }
        String str2 = (String) eh.a.g(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j10 = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e10) {
                throw d4.c(str, e10);
            }
        } else {
            j10 = 60000;
        }
        return new b(str2, j10);
    }

    @Nullable
    public static a n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrK1 = o1.K1(userInfo, ":");
        return new a(strArrK1[0], strArrK1[1]);
    }

    public static c o(String str) throws d4 {
        Matcher matcher = f49091f.matcher(str);
        if (matcher.find()) {
            return new c(2, (String) eh.a.g(matcher.group(1)), (String) eh.a.g(matcher.group(3)), t0.g(matcher.group(4)));
        }
        Matcher matcher2 = f49092g.matcher(str);
        if (matcher2.matches()) {
            return new c(1, (String) eh.a.g(matcher2.group(1)), "", "");
        }
        throw d4.c("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) eh.a.g(uri.getAuthority());
        eh.a.a(str.contains(to.c.phraseDel));
        return uri.buildUpon().encodedAuthority(o1.J1(str, to.c.phraseDel)[1]).build();
    }

    public static v6<String> q(w wVar) {
        eh.a.a(wVar.f100460c.e(e.f49011o) != null);
        v6.a aVar = new v6.a();
        aVar.g(o1.M("%s %s %s", t(wVar.f100459b), wVar.f100458a, f49093h));
        w6<String, String> w6VarB = wVar.f100460c.b();
        gc<String> it = w6VarB.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            v6<String> v6Var = w6VarB.get(next);
            for (int i10 = 0; i10 < v6Var.size(); i10++) {
                aVar.g(o1.M("%s: %s", next, v6Var.get(i10)));
            }
        }
        aVar.g("");
        aVar.g(wVar.f100461d);
        return aVar.e();
    }

    public static v6<String> r(x xVar) {
        eh.a.a(xVar.f100463b.e(e.f49011o) != null);
        v6.a aVar = new v6.a();
        aVar.g(o1.M("%s %s %s", f49093h, Integer.valueOf(xVar.f100462a), c(xVar.f100462a)));
        w6<String, String> w6VarB = xVar.f100463b.b();
        gc<String> it = w6VarB.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            v6<String> v6Var = w6VarB.get(next);
            for (int i10 = 0; i10 < v6Var.size(); i10++) {
                aVar.g(o1.M("%s: %s", next, v6Var.get(i10)));
            }
        }
        aVar.g("");
        aVar.g(xVar.f100464c);
        return aVar.e();
    }

    public static String[] s(String str) {
        String str2 = f49095j;
        if (!str.contains(str2)) {
            str2 = f49094i;
        }
        return o1.J1(str, str2);
    }

    public static String t(int i10) {
        switch (i10) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
