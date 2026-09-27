package h5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f87760d = "RepresentationID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f87761e = "Number";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f87762f = "Bandwidth";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f87763g = "Time";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f87764h = "$$";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f87765i = "%01d";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f87766j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f87767k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f87768l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f87769m = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f87770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Integer> f87771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f87772c;

    public n(List<String> list, List<Integer> list2, List<String> list3) {
        this.f87770a = list;
        this.f87771b = list2;
        this.f87772c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    public static void c(String str, List<String> list, List<Integer> list2, List<String> list3) {
        String strSubstring;
        list.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(length));
                length = str.length();
            } else if (iIndexOf != length) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                list.set(list2.size(), list.get(list2.size()) + "$");
                length += 2;
            } else {
                list3.add("");
                int i10 = length + 1;
                int iIndexOf2 = str.indexOf("$", i10);
                String strSubstring2 = str.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring + "d";
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, strSubstring);
                }
                list.add("");
                length = iIndexOf2 + 1;
            }
        }
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f87771b.size(); i11++) {
            sb2.append(this.f87770a.get(i11));
            if (this.f87771b.get(i11).intValue() == 1) {
                sb2.append(str);
            } else if (this.f87771b.get(i11).intValue() == 2) {
                sb2.append(String.format(Locale.US, this.f87772c.get(i11), Long.valueOf(j10)));
            } else if (this.f87771b.get(i11).intValue() == 3) {
                sb2.append(String.format(Locale.US, this.f87772c.get(i11), Integer.valueOf(i10)));
            } else if (this.f87771b.get(i11).intValue() == 4) {
                sb2.append(String.format(Locale.US, this.f87772c.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append(this.f87770a.get(this.f87771b.size()));
        return sb2.toString();
    }
}
