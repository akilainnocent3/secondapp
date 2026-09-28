package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class ypk0 implements Iterable, ipk0 {
    public final String a;

    public ypk0(String str) {
        if (str != null) {
            this.a = str;
        } else {
            hb5.a("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.ipk0
    public final ipk0 a() {
        return new ypk0(this.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02d3 A[PHI: r8
      0x02d3: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02bf, B:101:0x02c1, B:103:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ipk0
    public final ipk0 c(String str, g3l0 g3l0Var, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        g3l0 g3l0Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || AnalyticsParam.SEARCH_KEYWORD.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                hb5.a(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strZzc = "undefined";
        String str3 = this.a;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    r5l0.a(1, "hasOwnProperty", arrayList);
                    ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
                    boolean zEquals = "length".equals(ipk0VarB.zzc());
                    unk0 unk0Var = ipk0.t;
                    if (zEquals) {
                        return unk0Var;
                    }
                    double dDoubleValue = ipk0VarB.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? ipk0.u : unk0Var;
                }
                hb5.a("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    r5l0.a(0, "toString", arrayList);
                    return this;
                }
                hb5.a("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    r5l0.a(0, "toLocaleLowerCase", arrayList);
                    return new ypk0(str3.toLowerCase());
                }
                hb5.a("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    r5l0.c(1, "charAt", arrayList);
                    int iH = arrayList.isEmpty() ? 0 : (int) r5l0.h(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue());
                    return (iH < 0 || iH >= str3.length()) ? ipk0.x : new ypk0(String.valueOf(str3.charAt(iH)));
                }
                hb5.a("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(i4)).zzc());
                        }
                        return new ypk0(sb.toString());
                    }
                    return this;
                }
                hb5.a("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    r5l0.a(0, "toLowerCase", arrayList);
                    return new ypk0(str3.toLowerCase(Locale.ENGLISH));
                }
                hb5.a("Command not supported");
                return null;
            case -906336856:
                if (str.equals(AnalyticsParam.SEARCH_KEYWORD)) {
                    r5l0.c(1, AnalyticsParam.SEARCH_KEYWORD, arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzc()).matcher(str3);
                    return matcher.find() ? new eok0(Double.valueOf(matcher.start())) : new eok0(Double.valueOf(-1.0d));
                }
                hb5.a("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    r5l0.a(0, "toLocaleUpperCase", arrayList);
                    return new ypk0(str3.toUpperCase());
                }
                hb5.a("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    r5l0.c(2, "lastIndexOf", arrayList);
                    String strZzc2 = arrayList.size() > 0 ? g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzc() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue();
                    return new eok0(Double.valueOf(str3.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : r5l0.h(dDoubleValue2)))));
                }
                hb5.a("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    r5l0.a(0, "toUpperCase", arrayList);
                    return new ypk0(str3.toUpperCase(Locale.ENGLISH));
                }
                hb5.a("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    r5l0.a(0, "toUpperCase", arrayList);
                    return new ypk0(str3.trim());
                }
                hb5.a("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    r5l0.c(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzc()).matcher(str3);
                    return matcher2.find() ? new pnk0(Arrays.asList(new ypk0(matcher2.group()))) : ipk0.p;
                }
                hb5.a("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    r5l0.c(2, "slice", arrayList);
                    double dH = r5l0.h(!arrayList.isEmpty() ? g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dH < 0.0d ? Math.max(((double) str3.length()) + dH, 0.0d) : Math.min(dH, str3.length());
                    double dH2 = r5l0.h(arrayList.size() > 1 ? g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new ypk0(str3.substring(i5, Math.max(0, ((int) (dH2 < 0.0d ? Math.max(((double) str3.length()) + dH2, 0.0d) : Math.min(dH2, str3.length()))) - i5) + i5));
                }
                hb5.a("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    r5l0.c(2, "split", arrayList);
                    if (str3.length() == 0) {
                        return new pnk0(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strZzc3 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzc();
                        long jG = arrayList.size() > 1 ? ((long) r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue())) & 4294967295L : 2147483647L;
                        if (jG == 0) {
                            return new pnk0();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strZzc3), ((int) jG) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jG) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new ypk0(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new pnk0(arrayList2);
                }
                hb5.a("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    r5l0.c(2, "substring", arrayList);
                    int iH2 = !arrayList.isEmpty() ? (int) r5l0.h(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int iH3 = arrayList.size() > 1 ? (int) r5l0.h(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iH2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iH3, 0), str3.length());
                    return new ypk0(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                hb5.a("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    r5l0.c(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    ipk0 ipk0VarG = ipk0.o;
                    if (!zIsEmpty2) {
                        strZzc = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            ipk0VarG = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
                        }
                    }
                    String str4 = strZzc;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (ipk0VarG instanceof jok0) {
                            ipk0VarG = ((jok0) ipk0VarG).g(g3l0Var, Arrays.asList(new ypk0(str4), new eok0(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strZzc4 = ipk0VarG.zzc();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new ypk0(pr0.a(new StringBuilder(strSubstring.length() + String.valueOf(strZzc4).length() + strSubstring2.length()), strSubstring, strZzc4, strSubstring2));
                    }
                    return this;
                }
                hb5.a("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    r5l0.c(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        g3l0Var2 = g3l0Var;
                    } else {
                        g3l0Var2 = g3l0Var;
                        strZzc = g3l0Var2.b.b(g3l0Var2, (ipk0) arrayList.get(0)).zzc();
                    }
                    return new eok0(Double.valueOf(str3.indexOf(strZzc, (int) r5l0.h(arrayList.size() < 2 ? 0.0d : g3l0Var2.b.b(g3l0Var2, (ipk0) arrayList.get(1)).zzd().doubleValue()))));
                }
                hb5.a("Command not supported");
                return null;
            default:
                hb5.a("Command not supported");
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ypk0) {
            return this.a.equals(((ypk0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vpk0(this);
    }

    public final String toString() {
        String str = this.a;
        return pr0.a(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // defpackage.ipk0
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.ipk0
    public final Double zzd() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.ipk0
    public final Boolean zze() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.ipk0
    public final Iterator zzf() {
        return new ppk0(this);
    }
}
