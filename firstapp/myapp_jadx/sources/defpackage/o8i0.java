package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class o8i0 {
    public static final npe0 a = new npe0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r30v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static Pair a(msr msrVar, String str, String str2, String str3, String str4, String str5, uqm uqmVar, tss tssVar) throws Throwable {
        Pair pair;
        ?? r6;
        dl10 dl10Var;
        String strA;
        qn4.b(str, str2, str3, str4, str5);
        int i = 0;
        char c = 'H';
        Throwable th = null;
        if (!StringsKt.N(str5, 'H')) {
            ib5.a("Expected resultSequence to contain 'H', but it did not.");
            return null;
        }
        uqmVar.getLanguageCode().getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iOrdinal = tssVar.ordinal();
        ?? r12 = 1;
        if (iOrdinal == 0) {
            dl10 dl10Var2 = new dl10(msrVar, "https://s.sporty.net/cms/Build_and_Go_start_41085d90d3.gif", true);
            q1z q1zVar = new q1z();
            q1zVar.a = msrVar;
            linkedHashMap.put(0, b.k(dl10Var2, q1zVar));
            pair = new Pair(3, linkedHashMap);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                uhc.a();
                return null;
            }
            pair = new Pair(0, linkedHashMap);
        }
        int iIntValue = ((Number) pair.a).intValue();
        Map map = (Map) pair.b;
        List<h6f0> listA = j6f0.a((String) StringsKt.f0(str5, new char[]{'H'}).get(0));
        int i2 = iIntValue;
        int i3 = 0;
        for (Object obj : listA) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                Throwable th2 = th;
                b.q();
                throw th2;
            }
            h6f0 h6f0Var = (h6f0) obj;
            Integer numValueOf = Integer.valueOf(i2);
            boolean zA = h6f0Var.a.a();
            Throwable th3 = th;
            int i5 = h6f0Var.b;
            map.put(numValueOf, a.c(new dl10(msrVar, zA ? i5 > 0 ? "https://s.sporty.net/ke/main/res/628ce73741b3a369b62052c49548215e.gif" : "https://s.sporty.net/ke/main/res/f38b7911e2770138975cbb2fd238ce5c.gif" : i5 > 0 ? "https://s.sporty.net/ke/main/res/b6284ed38b014df434abedc1a1d09163.gif" : "https://s.sporty.net/ke/main/res/b495be1b87cc9d3135076b2467a0050b.gif", true)));
            int i6 = i2 + 5;
            int i7 = i3;
            int i8 = i;
            char c2 = c;
            map.put(Integer.valueOf(i2 + 4), a.c(new i6f0(msrVar, h6f0Var, str, str2, str3, str4)));
            if (i7 == listA.size() - 1) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (h6f0 h6f0Var2 : listA) {
                    b4l b4lVar = h6f0Var2.a;
                    Object obj2 = linkedHashMap2.get(b4lVar);
                    if (obj2 == null && !linkedHashMap2.containsKey(b4lVar)) {
                        obj2 = 0;
                    }
                    linkedHashMap2.put(b4lVar, Integer.valueOf(((Number) obj2).intValue() + h6f0Var2.b));
                }
                String strA2 = d40.a(((Number) linkedHashMap2.getOrDefault(b4l.HOME, 0)).intValue(), ((Number) linkedHashMap2.getOrDefault(b4l.AWAY, 0)).intValue(), " - ");
                Integer numValueOf2 = Integer.valueOf(i6);
                dl10 dl10Var3 = new dl10(msrVar, "https://s.sporty.net/ke/main/res/d5cdea3de664473f57411dd3b2a122ac.gif", true);
                gbl gblVar = new gbl(msrVar, strA2);
                ess[] essVarArr = new ess[2];
                essVarArr[i8] = dl10Var3;
                essVarArr[1] = gblVar;
                map.put(numValueOf2, b.k(essVarArr));
                i2 += 9;
            } else {
                i2 = i6;
            }
            i3 = i4;
            th = th3;
            c = c2;
            i = i8;
        }
        int i9 = i;
        char c3 = c;
        Throwable th4 = th;
        char[] cArr = new char[1];
        cArr[i9] = c3;
        List listA2 = j6f0.a((String) StringsKt.f0(str5, cArr).get(1));
        int i10 = i9;
        for (Object obj3 : listA2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                b.q();
                throw th4;
            }
            h6f0 h6f0Var3 = (h6f0) obj3;
            Integer numValueOf3 = Integer.valueOf(i2);
            boolean zA2 = h6f0Var3.a.a();
            int i12 = h6f0Var3.b;
            map.put(numValueOf3, a.c(new dl10(msrVar, zA2 ? i12 > 0 ? "https://s.sporty.net/ke/main/res/fcc6276cf1b152d6b02b223d27290e07.gif" : "https://s.sporty.net/ke/main/res/eb6e90be5b670247efc6bcf32980a855.gif" : i12 > 0 ? "https://s.sporty.net/ke/main/res/bcc53cc762c7ecc188cd1fdcfb93bbb7.gif" : "https://s.sporty.net/ke/main/res/453a7bf8028ab6e5592ae457f408c79a.gif", r12)));
            int i13 = i2 + 5;
            int i14 = r12;
            map.put(Integer.valueOf(i2 + 4), a.c(new i6f0(msrVar, h6f0Var3, str, str2, str3, str4)));
            if (i10 == listA2.size() - 1) {
                Integer numValueOf4 = Integer.valueOf(i13);
                ?? r4 = i9;
                dl10 dl10Var4 = new dl10(msrVar, "https://s.sporty.net/ke/main/res/bcc2895659253e0b00d7f606406d6b94.gif", r4);
                char c4 = c3;
                if (StringsKt.N(str5, c4)) {
                    char[] cArr2 = new char[i14];
                    cArr2[r4 == true ? 1 : 0] = c4;
                    List listF0 = StringsKt.f0(str5, cArr2);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listF0.iterator();
                    while (it.hasNext()) {
                        p48.w(j6f0.a((String) it.next()), arrayList);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj4 = arrayList.get(i15);
                        i15++;
                        h6f0 h6f0Var4 = (h6f0) obj4;
                        dl10 dl10Var5 = dl10Var4;
                        b4l b4lVar2 = h6f0Var4.a;
                        Object obj5 = linkedHashMap3.get(b4lVar2);
                        if (obj5 == null && !linkedHashMap3.containsKey(b4lVar2)) {
                            obj5 = 0;
                        }
                        linkedHashMap3.put(b4lVar2, Integer.valueOf(((Number) obj5).intValue() + h6f0Var4.b));
                        dl10Var4 = dl10Var5;
                    }
                    dl10Var = dl10Var4;
                    strA = d40.a(((Number) linkedHashMap3.getOrDefault(b4l.HOME, 0)).intValue(), ((Number) linkedHashMap3.getOrDefault(b4l.AWAY, 0)).intValue(), " - ");
                } else {
                    strA = "";
                    dl10Var = dl10Var4;
                }
                m6g m6gVar = new m6g(msrVar, strA);
                i9 = 0;
                r6 = 1;
                map.put(numValueOf4, b.k(dl10Var, m6gVar));
                i2 += 8;
            } else {
                r6 = i14;
                i2 = i13;
            }
            r12 = r6;
            i10 = i11;
            c3 = 'H';
        }
        return new Pair(Integer.valueOf(i2), map);
    }

    public static Map b(String str, boolean z) {
        if (str == null || str.length() == 0) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return o2gVar;
        }
        if (!StringsKt.N(str, 'H')) {
            o2g o2gVar2 = o2g.a;
            o2gVar2.getClass();
            return o2gVar2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bq40 bq40Var = new bq40();
        bq40 bq40Var2 = new bq40();
        int i = 0;
        List listA = j6f0.a((String) StringsKt.f0(str, new char[]{'H'}).get(0));
        List listA2 = j6f0.a((String) StringsKt.f0(str, new char[]{'H'}).get(1));
        if (z) {
            List listQ0 = CollectionsKt.q0(CollectionsKt.t0(a.d(new IntRange(1, 12, 1)), listA.size()));
            int i2 = 0;
            for (Object obj : listA) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                c(linkedHashMap, bq40Var, bq40Var2, ((Number) listQ0.get(i2)).intValue(), (h6f0) obj);
                i2 = i3;
            }
            List listQ1 = CollectionsKt.q0(CollectionsKt.t0(a.d(new IntRange(18, 29, 1)), listA2.size()));
            for (Object obj2 : listA2) {
                int i4 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                c(linkedHashMap, bq40Var, bq40Var2, ((Number) listQ1.get(i)).intValue(), (h6f0) obj2);
                i = i4;
            }
        } else {
            Iterator it = listA.iterator();
            int i5 = 3;
            while (it.hasNext()) {
                c(linkedHashMap, bq40Var, bq40Var2, i5 + 4, (h6f0) it.next());
                i5 += 5;
            }
            int i6 = i5 + 4;
            Iterator it2 = listA2.iterator();
            while (it2.hasNext()) {
                c(linkedHashMap, bq40Var, bq40Var2, i6 + 4, (h6f0) it2.next());
                i6 += 5;
            }
        }
        return linkedHashMap;
    }

    public static final void c(LinkedHashMap linkedHashMap, bq40 bq40Var, bq40 bq40Var2, int i, h6f0 h6f0Var) {
        int i2 = h6f0Var.b;
        if (i2 <= 0) {
            return;
        }
        b4l b4lVar = h6f0Var.a;
        if (b4lVar == b4l.HOME) {
            Integer numValueOf = Integer.valueOf(i);
            int i3 = bq40Var.a;
            linkedHashMap.put(numValueOf, new ho70(b4lVar, i3, i3 + i2));
            bq40Var.a += i2;
            return;
        }
        if (b4lVar == b4l.AWAY) {
            Integer numValueOf2 = Integer.valueOf(i);
            int i4 = bq40Var2.a;
            linkedHashMap.put(numValueOf2, new ho70(b4lVar, i4, i4 + i2));
            bq40Var2.a += i2;
        }
    }

    public static final et7 d(j8i0 j8i0Var) {
        et7 et7Var;
        CoroutineContext coroutineContextH0;
        j8i0Var.getClass();
        synchronized (a) {
            et7Var = (et7) j8i0Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (et7Var == null) {
                try {
                    try {
                        pfd pfdVar = fse.a;
                        coroutineContextH0 = gku.a.h0();
                    } catch (czx unused) {
                        coroutineContextH0 = e.a;
                    }
                } catch (IllegalStateException unused2) {
                    coroutineContextH0 = e.a;
                }
                et7 et7Var2 = new et7(coroutineContextH0.plus(lfe0.a()));
                j8i0Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", et7Var2);
                et7Var = et7Var2;
            }
        }
        return et7Var;
    }
}
