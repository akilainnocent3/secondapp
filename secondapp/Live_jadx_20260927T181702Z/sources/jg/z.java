package jg;

import android.net.Uri;
import cj.v6;
import com.ironsource.C4235d4;
import eh.i1;
import eh.o1;
import k.h1;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f100473c;

    public z(long j10, int i10, Uri uri) {
        this.f100471a = j10;
        this.f100472b = i10;
        this.f100473c = uri;
    }

    public static v6<z> a(String str, Uri uri) throws d4 {
        v6.a aVar = new v6.a();
        String[] strArrJ1 = o1.J1(str, ",");
        int length = strArrJ1.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArrJ1[i10];
            String[] strArrJ2 = o1.J1(str2, ";");
            int length2 = strArrJ2.length;
            int i11 = i10;
            long j10 = -9223372036854775807L;
            int i12 = 0;
            Uri uriB = null;
            int i13 = -1;
            while (true) {
                if (i12 < length2) {
                    String str3 = strArrJ2[i12];
                    try {
                        String[] strArrK1 = o1.K1(str3, C4235d4.j.f61456b);
                        String str4 = strArrK1[0];
                        String str5 = strArrK1[1];
                        int iHashCode = str4.hashCode();
                        String[] strArr = strArrJ1;
                        if (iHashCode != 113759) {
                            if (iHashCode != 116079) {
                                if (iHashCode != 1524180539 || !str4.equals("rtptime")) {
                                    throw d4.c(str4, null);
                                }
                                j10 = Long.parseLong(str5);
                                i12++;
                                strArrJ1 = strArr;
                            } else {
                                if (!str4.equals("url")) {
                                    throw d4.c(str4, null);
                                }
                                uriB = b(str5, uri);
                                i12++;
                                strArrJ1 = strArr;
                            }
                        } else {
                            if (!str4.equals("seq")) {
                                throw d4.c(str4, null);
                            }
                            i13 = Integer.parseInt(str5);
                            i12++;
                            strArrJ1 = strArr;
                        }
                    } catch (Exception e10) {
                        throw d4.c(str3, e10);
                    }
                } else {
                    String[] strArr2 = strArrJ1;
                    if (uriB == null || uriB.getScheme() == null || (i13 == -1 && j10 == -9223372036854775807L)) {
                        throw d4.c(str2, null);
                    }
                    aVar.g(new z(j10, i13, uriB));
                    i10 = i11 + 1;
                    strArrJ1 = strArr2;
                }
            }
        }
        return aVar.e();
    }

    @h1
    public static Uri b(String str, Uri uri) {
        eh.a.a(((String) eh.a.g(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) eh.a.g(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        if (string.endsWith(to.c.userBaseDel)) {
            return i1.f(string, str);
        }
        return i1.f(string + to.c.userBaseDel, str);
    }
}
