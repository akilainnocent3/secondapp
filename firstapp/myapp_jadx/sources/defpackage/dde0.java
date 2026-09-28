package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class dde0 implements ree0 {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList<String> b = new ArrayList<>();
    public final nsz c = new nsz();

    public static long d(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    public static j4c c(Spanned spanned, String str) {
        char c;
        float f;
        j4c.a aVar = new j4c.a();
        aVar.a = spanned;
        aVar.b = null;
        if (str == null) {
            return aVar.a();
        }
        int iHashCode = str.hashCode();
        String str2 = vZBMKENANSz.psYChcHbKVZd;
        switch (iHashCode) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                aVar.i = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                aVar.i = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 2;
                }
                break;
            case -685620524:
                if (!str.equals(str2)) {
                    aVar.i = 1;
                } else {
                    aVar.i = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                aVar.i = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 2;
                }
                break;
            default:
                aVar.i = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    aVar.g = 1;
                    c = 1;
                } else {
                    aVar.g = 2;
                    c = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    aVar.g = 1;
                    c = 1;
                } else {
                    aVar.g = 2;
                    c = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    aVar.g = 1;
                    c = 1;
                } else {
                    aVar.g = 2;
                    c = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                aVar.g = 1;
                c = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                aVar.g = 1;
                c = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                aVar.g = 1;
                c = 1;
                break;
            case -685620524:
                if (!str.equals(str2)) {
                    aVar.g = 1;
                    c = 1;
                } else {
                    aVar.g = 0;
                    c = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    aVar.g = 1;
                    c = 1;
                } else {
                    aVar.g = 0;
                    c = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    aVar.g = 1;
                    c = 1;
                } else {
                    aVar.g = 0;
                    c = 0;
                }
                break;
            default:
                aVar.g = 1;
                c = 1;
                break;
        }
        int i = aVar.i;
        float f2 = 0.08f;
        if (i == 0) {
            f = 0.08f;
        } else if (i == 1) {
            f = 0.5f;
        } else {
            if (i != 2) {
                d580.a();
                return null;
            }
            f = 0.92f;
        }
        aVar.h = f;
        if (c != 0) {
            if (c == 1) {
                f2 = 0.5f;
            } else {
                if (c != 2) {
                    d580.a();
                    return null;
                }
                f2 = 0.92f;
            }
        }
        aVar.e = f2;
        aVar.f = 0;
        return aVar.a();
    }

    @Override // defpackage.ree0
    public final void a(byte[] bArr, int i, int i2, ree0.b bVar, oya<q4c> oyaVar) {
        String str;
        dde0 dde0Var = this;
        long j = bVar.a;
        nsz nszVar = dde0Var.c;
        nszVar.G(i + i2, bArr);
        nszVar.I(i);
        Charset charsetE = nszVar.E();
        if (charsetE == null) {
            charsetE = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !bVar.b) ? null : new ArrayList();
        while (true) {
            String strK = nszVar.k(charsetE);
            if (strK == null) {
                break;
            }
            if (!strK.isEmpty()) {
                try {
                    Integer.parseInt(strK);
                    String strK2 = nszVar.k(charsetE);
                    if (strK2 == null) {
                        cft.g("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = d.matcher(strK2);
                    if (matcher.matches()) {
                        long jD = d(matcher, 1);
                        long jD2 = d(matcher, 6);
                        StringBuilder sb = dde0Var.a;
                        sb.setLength(0);
                        long j3 = j2;
                        ArrayList<String> arrayList2 = dde0Var.b;
                        arrayList2.clear();
                        for (String strK3 = nszVar.k(charsetE); !TextUtils.isEmpty(strK3); strK3 = nszVar.k(charsetE)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strK3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = e.matcher(strTrim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i3;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i3 += length;
                                j = j;
                            }
                            sb.append(sb2.toString());
                        }
                        long j4 = j;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (j4 == j3 || jD2 >= j4) {
                            oyaVar.accept(new q4c(jD, jD2 - jD, pcn.n(c(spannedFromHtml, str))));
                        } else if (arrayList != null) {
                            arrayList.add(new q4c(jD, jD2 - jD, pcn.n(c(spannedFromHtml, str))));
                        }
                        dde0Var = this;
                        j2 = j3;
                        j = j4;
                    } else {
                        cft.g("SubripParser", "Skipping invalid timing: ".concat(strK2));
                        dde0Var = this;
                    }
                } catch (NumberFormatException unused) {
                    cft.g("SubripParser", QWvyvNzGsBpRT.Lpp.concat(strK));
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                oyaVar.accept((q4c) obj);
            }
        }
    }
}
