package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class pgx {
    public static final Regex q = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Regex r = new Regex("\\{(.+?)\\}");
    public static final Regex s = new Regex("http[s]?://");
    public static final Regex t = new Regex(".*");
    public static final Regex u = new Regex("([^/]*?|)");
    public static final Regex v = new Regex("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final mpe0 f;
    public final mpe0 g;
    public final ttr h;
    public boolean i;
    public final ttr j;
    public final ttr k;
    public final ttr l;
    public final mpe0 m;
    public final String n;
    public final mpe0 o;
    public final boolean p;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public String a;
        public String b;
        public String c;
    }

    public static final class b {
        public String a;
        public final ArrayList b = new ArrayList();
    }

    public pgx(String str, String str2, String str3) {
        List listT0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int i = 1;
        this.f = hwr.b(new j5j(this, 1));
        this.g = hwr.b(new mgx(this, 0));
        a1s a1sVar = a1s.c;
        this.h = hwr.a(a1sVar, new l5j(this, i));
        this.j = hwr.a(a1sVar, new m5j(this, 1));
        this.k = hwr.a(a1sVar, new n5j(this, i));
        this.l = hwr.a(a1sVar, new o5j(this, i));
        this.m = hwr.b(new p5j(this, 1));
        this.o = hwr.b(new q5j(this, i));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.a(str)) {
                String strPattern = s.a.pattern();
                strPattern.getClass();
                sb.append(strPattern);
            }
            n8v n8vVarB = new Regex("(\\?|#|$)").b(str);
            if (n8vVarB != null) {
                a(str.substring(0, n8vVarB.b().a), arrayList, sb);
                this.p = (t.a(sb) || u.a(sb)) ? false : true;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.e = h(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!ogx.a("^[\\s\\S]+/[\\s\\S]+$", str3)) {
            kb5.a(tug.a("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        List listH = new Regex("/").h(str3);
        if (listH.isEmpty()) {
            listT0 = m2g.a;
        } else {
            ListIterator listIterator = listH.listIterator(listH.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                }
            }
            listT0 = m2g.a;
        }
        this.n = c.p(tx5.a("^(", (String) listT0.get(0), "|[*]+)/(", (String) listT0.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (n8v n8vVarB = r.b(str); n8vVarB != null; n8vVarB = n8vVarB.next()) {
            MatchGroup matchGroupC = n8vVarB.c.c(1);
            matchGroupC.getClass();
            arrayList.add(matchGroupC.a);
            if (n8vVarB.b().a > i) {
                Regex.Companion companion = Regex.INSTANCE;
                String strSubstring = str.substring(i, n8vVarB.b().a);
                companion.getClass();
                String strQuote = Pattern.quote(strSubstring);
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = u.a.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = n8vVarB.b().b + 1;
        }
        if (i < str.length()) {
            Regex.Companion companion2 = Regex.INSTANCE;
            String strSubstring2 = str.substring(i);
            companion2.getClass();
            String strQuote2 = Pattern.quote(strSubstring2);
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, ffx ffxVar) {
        if (ffxVar == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            djx<Object> djxVar = ffxVar.a;
            str.getClass();
            djxVar.e(bundle, str, djxVar.h(str2));
        }
    }

    public static String h(String str) {
        if (StringsKt.M(str, "\\Q", false) && StringsKt.M(str, "\\E", false)) {
            return c.p(str, ".*", "\\E.*\\Q", false);
        }
        return StringsKt.M(str, "\\.\\*", false) ? c.p(str, "\\.\\*", ".*", false) : str;
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(str);
        uri2.getClass();
        return CollectionsKt.Y(pathSegments, uri2.getPathSegments()).size();
    }

    public final ArrayList c() {
        Collection collectionValues = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            p48.w(((b) it.next()).b, arrayList);
        }
        return CollectionsKt.i0((List) this.k.getValue(), CollectionsKt.i0(arrayList, this.d));
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        n8v n8vVarE;
        n8v n8vVarE2;
        String strDecode;
        String str;
        uri.getClass();
        Regex regex = (Regex) this.f.getValue();
        if (regex != null && (n8vVarE = regex.e(uri.toString())) != null) {
            o2g.a.getClass();
            int i = 0;
            final Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (e(n8vVarE, bundleA, linkedHashMap) && (!((Boolean) this.g.getValue()).booleanValue() || f(uri, bundleA, linkedHashMap))) {
                String fragment = uri.getFragment();
                Regex regex2 = (Regex) this.m.getValue();
                if (regex2 != null && (n8vVarE2 = regex2.e(String.valueOf(fragment))) != null) {
                    List list = (List) this.k.getValue();
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            kotlin.collections.b.q();
                            throw null;
                        }
                        String str2 = (String) obj;
                        MatchGroup matchGroupC = n8vVarE2.c.c(i2);
                        if (matchGroupC == null || (str = matchGroupC.a) == null) {
                            strDecode = null;
                        } else {
                            strDecode = Uri.decode(str);
                            strDecode.getClass();
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleA, str2, strDecode, (ffx) linkedHashMap.get(str2));
                            arrayList.add(Unit.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (hfx.a(linkedHashMap, new Function1() { // from class: ngx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        String str3 = (String) obj2;
                        str3.getClass();
                        return Boolean.valueOf(!bundleA.containsKey(str3));
                    }
                }).isEmpty()) {
                    return bundleA;
                }
            }
        }
        return null;
    }

    public final boolean e(n8v n8vVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        String str;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String strDecode = null;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            String str2 = (String) obj;
            MatchGroup matchGroupC = n8vVar.c.c(i3);
            if (matchGroupC != null && (str = matchGroupC.a) != null) {
                strDecode = Uri.decode(str);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str2, strDecode, (ffx) linkedHashMap.get(str2));
                arrayList2.add(Unit.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof pgx)) {
            pgx pgxVar = (pgx) obj;
            if (Intrinsics.g(this.a, pgxVar.a) && Intrinsics.g(this.b, pgxVar.b) && Intrinsics.g(this.c, pgxVar.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.LinkedHashMap] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        ?? r14;
        Object objValueOf;
        boolean z;
        String query;
        pgx pgxVar = this;
        for (Map.Entry entry : ((Map) pgxVar.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            b bVar = (b) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (pgxVar.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = kotlin.collections.a.c(query);
            }
            o2g.a.getClass();
            boolean z2 = false;
            Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            ArrayList arrayList = bVar.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str2 = (String) obj;
                ffx ffxVar = (ffx) linkedHashMap.get(str2);
                djx<Object> djxVar = ffxVar != null ? ffxVar.a : null;
                if ((djxVar instanceof c48) && !ffxVar.c) {
                    c48 c48Var = (c48) djxVar;
                    c48Var.e(bundleA, str2, c48Var.h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = bVar.a;
                n8v n8vVarE = str4 != null ? new Regex(str4).e(str3) : null;
                if (n8vVarE == null) {
                    return z2;
                }
                ArrayList arrayList2 = bVar.b;
                ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                int size2 = arrayList2.size();
                boolean z3 = z2;
                int i2 = z3 ? 1 : 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    int i3 = r14 + 1;
                    if (r14 < 0) {
                        r14 = z3;
                        kotlin.collections.b.q();
                        throw null;
                    }
                    String str5 = (String) obj2;
                    MatchGroup matchGroupC = n8vVarE.c.c(i3);
                    String str6 = matchGroupC != null ? matchGroupC.a : null;
                    if (str6 == null) {
                        r14 = z3;
                        r14 = z3;
                        str6 = "";
                    }
                    r14 = z3;
                    r14 = z3;
                    ffx ffxVar2 = (ffx) linkedHashMap.get(str5);
                    try {
                        if (hv60.a(str5, bundleA)) {
                            if (bundleA.containsKey(str5)) {
                                if (ffxVar2 != null) {
                                    djx<Object> djxVar2 = ffxVar2.a;
                                    Object objA = djxVar2.a(str5, bundleA);
                                    if (!bundleA.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    djxVar2.e(bundleA, str5, djxVar2.c(objA, str6));
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            g(bundleA, str5, str6, ffxVar2);
                            objValueOf = Unit.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = Unit.a;
                    }
                    arrayList3.add(objValueOf);
                    z2 = false;
                    r14 = i3;
                }
                r14 = z3;
            }
            bundle.putAll(bundleA);
            pgxVar = this;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
