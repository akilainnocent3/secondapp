package yads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class p43 extends fz2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f153737o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f153738p = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StringBuilder f153739m = new StringBuilder();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f153740n = new ArrayList();

    public static long a(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) {
        String str;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        o20 o20Var;
        this = this;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        kh1 kh1Var = new kh1(0);
        jb2 jb2Var = new jb2(i10, bArr);
        while (true) {
            String strC = jb2Var.c();
            if (strC != null) {
                if (strC.length() != 0) {
                    try {
                        Integer.parseInt(strC);
                        String strC2 = jb2Var.c();
                        if (strC2 == null) {
                            ih1.d(ug.a.f139549t, "Unexpected end");
                        } else {
                            Matcher matcher = f153737o.matcher(strC2);
                            if (!matcher.matches()) {
                                ih1.d(ug.a.f139549t, "Skipping invalid timing: ".concat(strC2));
                            } else {
                                kh1Var.a(a(matcher, 1));
                                kh1Var.a(a(matcher, 6));
                                this.f153739m.setLength(i14);
                                this.f153740n.clear();
                                for (String strC3 = jb2Var.c(); !TextUtils.isEmpty(strC3); strC3 = jb2Var.c()) {
                                    if (this.f153739m.length() > 0) {
                                        this.f153739m.append("<br>");
                                    }
                                    StringBuilder sb2 = this.f153739m;
                                    ArrayList arrayList2 = this.f153740n;
                                    String strTrim = strC3.trim();
                                    StringBuilder sb3 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f153738p.matcher(strTrim);
                                    int i15 = i14;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i15;
                                        int length = strGroup.length();
                                        sb3.replace(iStart, iStart + length, "");
                                        i15 += length;
                                    }
                                    sb2.append(sb3.toString());
                                }
                                Spanned spannedFromHtml = Html.fromHtml(this.f153739m.toString());
                                int i16 = i14;
                                while (true) {
                                    if (i16 < this.f153740n.size()) {
                                        str = (String) this.f153740n.get(i16);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i16++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    o20Var = new o20(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                i11 = 0;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620679:
                                            str.equals("{\\an2}");
                                            i11 = 1;
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                i11 = 2;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620617:
                                            if (str.equals("{\\an4}")) {
                                                i11 = 0;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620586:
                                            str.equals("{\\an5}");
                                            i11 = 1;
                                            break;
                                        case -685620555:
                                            if (str.equals("{\\an6}")) {
                                                i11 = 2;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                i11 = 0;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        case -685620493:
                                            str.equals("{\\an8}");
                                            i11 = 1;
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                i11 = 2;
                                            } else {
                                                i11 = 1;
                                            }
                                            break;
                                        default:
                                            i11 = 1;
                                            break;
                                    }
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                i12 = 2;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620679:
                                            if (str.equals("{\\an2}")) {
                                                i12 = 2;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                i12 = 2;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620617:
                                            str.equals("{\\an4}");
                                            i12 = 1;
                                            break;
                                        case -685620586:
                                            str.equals("{\\an5}");
                                            i12 = 1;
                                            break;
                                        case -685620555:
                                            str.equals("{\\an6}");
                                            i12 = 1;
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                i12 = 0;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620493:
                                            if (str.equals("{\\an8}")) {
                                                i12 = 0;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                i12 = 0;
                                            } else {
                                                i12 = 1;
                                            }
                                            break;
                                        default:
                                            i12 = 1;
                                            break;
                                    }
                                    if (i11 != 0) {
                                        i13 = 1;
                                        if (i11 == 1) {
                                            f10 = 0.5f;
                                        } else {
                                            if (i11 != 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f10 = 0.92f;
                                        }
                                    } else {
                                        i13 = 1;
                                        f10 = 0.08f;
                                    }
                                    if (i12 == 0) {
                                        f11 = 0.08f;
                                    } else if (i12 == i13) {
                                        f11 = 0.5f;
                                    } else {
                                        if (i12 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        f11 = 0.92f;
                                    }
                                    o20Var = new o20(spannedFromHtml, null, null, null, f11, 0, i12, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                arrayList.add(o20Var);
                                arrayList.add(o20.f153316s);
                                kh1Var = kh1Var;
                            }
                            i14 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        ih1.d(ug.a.f139549t, "Skipping invalid index: ".concat(strC));
                    }
                }
            }
        }
        return new q43((o20[]) arrayList.toArray(new o20[i14]), kh1Var.a());
    }
}
