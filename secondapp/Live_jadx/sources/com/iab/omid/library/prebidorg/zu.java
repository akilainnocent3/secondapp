package com.iab.omid.library.prebidorg;

import com.iab.omid.library.prebidorg.utils.zw;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
abstract class zu {
    private static final Pattern zz = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private static final Pattern f53806zr = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private static final Pattern f53807zs = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private static final Pattern f53808zt = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private static final Pattern f53809zu = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: zv, reason: collision with root package name */
    private static final Pattern f53810zv = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: zw, reason: collision with root package name */
    private static final Pattern f53811zw = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static String zr(String str, String str2) {
        return zz(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    public static String zz(String str, String str2) {
        zw.zz(str, "HTML is null or empty");
        int[][] iArrZz = zz(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (!zr(str, sb2, f53806zr, str2, iArrZz) && !zz(str, sb2, zz, str2, iArrZz) && !zr(str, sb2, f53808zt, str2, iArrZz) && !zz(str, sb2, f53807zs, str2, iArrZz) && !zr(str, sb2, f53810zv, str2, iArrZz) && !zz(str, sb2, f53809zu, str2, iArrZz) && !zz(str, sb2, f53811zw, str2, iArrZz)) {
            return str2 + str;
        }
        return sb2.toString();
    }

    private static boolean zr(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!zz(iStart, iArr)) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = iEnd;
        }
        return false;
    }

    private static boolean zz(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i10 >= iArr2[0] && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zz(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!zz(iStart, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = iEnd;
        }
        return false;
    }

    private static int[][] zz(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str.indexOf("<!--", i10);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i10 = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i10 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }
}
