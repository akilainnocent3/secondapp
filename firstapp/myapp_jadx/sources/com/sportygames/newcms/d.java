package com.sportygames.newcms;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import defpackage.aq5;
import defpackage.b5;
import defpackage.bo5;
import defpackage.bq40;
import defpackage.bq5;
import defpackage.do5;
import defpackage.dq40;
import defpackage.ft7;
import defpackage.hb5;
import defpackage.hzh;
import defpackage.ib5;
import defpackage.inm;
import defpackage.j26;
import defpackage.jp5;
import defpackage.jpu;
import defpackage.k5b;
import defpackage.kzs;
import defpackage.l48;
import defpackage.nn5;
import defpackage.ocx;
import defpackage.on5;
import defpackage.ozh;
import defpackage.q3;
import defpackage.qcn;
import defpackage.tuw;
import defpackage.uag;
import defpackage.uf80;
import defpackage.uj50;
import defpackage.uuw;
import defpackage.v1b;
import defpackage.wzh;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.yp5;
import defpackage.yzh;
import defpackage.zn5;
import defpackage.zp5;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public final qcn<bo5<do5>> a;
    public final k5b b;
    public final k5b c;
    public final b5 d;
    public final String e;
    public final XmlPullParserFactory f;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements on5 {
        public final ArrayList a = new ArrayList();
        public final LinkedHashMap b = new LinkedHashMap();

        @Override // defpackage.on5
        public final List<CMSRes> d() {
            return this.a;
        }

        @Override // defpackage.on5
        public final CMSRes r(jp5 jp5Var, String str, String str2, nn5 nn5Var, Integer num) {
            jp5Var.getClass();
            nn5Var.getClass();
            Integer numValueOf = Integer.valueOf(jp5Var.t());
            LinkedHashMap linkedHashMap = this.b;
            Integer num2 = (Integer) linkedHashMap.get(numValueOf);
            int iIntValue = num2 != null ? num2.intValue() : 0;
            linkedHashMap.put(Integer.valueOf(jp5Var.t()), Integer.valueOf(iIntValue + 1));
            CMSRes.Data data = new CMSRes.Data(jp5Var.t(), iIntValue, str, str2, nn5Var, num);
            this.a.add(data);
            return data;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StringData(key=");
            sb.append(this.a);
            sb.append(", value=");
            return j26.a(sb, this.b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(qcn<? extends bo5<? extends do5>> qcnVar, k5b k5bVar, k5b k5bVar2, b5 b5Var, String str) {
        qcnVar.getClass();
        k5bVar.getClass();
        k5bVar2.getClass();
        b5Var.getClass();
        str.getClass();
        this.a = qcnVar;
        this.b = k5bVar;
        this.c = k5bVar2;
        this.d = b5Var;
        this.e = str;
        this.f = XmlPullParserFactory.newInstance();
    }

    public final kzs<com.sportygames.newcms.b> a(Function1<? super on5, ? extends jp5> function1, Function2<? super com.sportygames.newcms.b, ? super v1b<? super Unit>, ? extends Object> function2) {
        int i;
        List<CMSRes> listD = function1.invoke(new a()).a.d();
        ArrayList arrayList = new ArrayList(l48.r(listD, 10));
        for (CMSRes cMSRes : listD) {
            CMSRes.Data data = cMSRes instanceof CMSRes.Data ? (CMSRes.Data) cMSRes : null;
            if (data == null) {
                hb5.a("CMSData is not Data");
                return null;
            }
            arrayList.add(data);
        }
        int i2 = 0;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            int size = arrayList.size();
            i = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (((CMSRes.Data) obj).e.a && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((CMSRes.Data) obj2).c);
        }
        int size3 = CollectionsKt.A0(CollectionsKt.D0(arrayList2)).size() + i;
        tuw tuwVarA = uuw.a();
        bq40 bq40Var = new bq40();
        dq40 dq40Var = new dq40();
        dq40 dq40Var2 = new dq40();
        return new kzs<>(new wzh(new yzh(ozh.c(hzh.b(new f(this, dq40Var, arrayList, bq40Var, tuwVarA, dq40Var2, null)), this.c), new aq5(this, dq40Var, dq40Var2, null)), new bq5(this, dq40Var, dq40Var2, null)), size3, function2, new zp5(this, dq40Var, dq40Var2, null));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0045 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:24:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.io.Reader r6, com.sportygames.newcms.e r7, defpackage.x1b r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dq5
            if (r0 == 0) goto L13
            r0 = r8
            dq5 r0 = (defpackage.dq5) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dq5 r0 = new dq5
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            org.xmlpull.v1.XmlPullParser r5 = r0.b
            kotlin.jvm.functions.Function2 r6 = r0.a
            defpackage.uj50.b(r8)
            goto L7a
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r4
        L32:
            defpackage.uj50.b(r8)
            org.xmlpull.v1.XmlPullParserFactory r5 = r5.f
            org.xmlpull.v1.XmlPullParser r5 = r5.newPullParser()
            r5.setInput(r6)
            int r6 = r5.getEventType()
        L42:
            if (r6 == r3) goto L80
            r8 = 2
            if (r6 != r8) goto L7b
            java.lang.String r6 = r5.getName()
            java.lang.String r8 = "string"
            boolean r6 = kotlin.jvm.internal.Intrinsics.g(r6, r8)
            if (r6 == 0) goto L7b
            java.lang.String r6 = "name"
            java.lang.String r6 = r5.getAttributeValue(r4, r6)
            java.lang.String r8 = r5.nextText()
            java.lang.String r8 = defpackage.r9e0.a(r8)
            com.sportygames.newcms.d$b r2 = new com.sportygames.newcms.d$b
            r6.getClass()
            r8.getClass()
            r2.<init>(r6, r8)
            r0.a = r7
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r7.invoke(r2, r0)
            if (r6 != r1) goto L79
            return r1
        L79:
            r6 = r7
        L7a:
            r7 = r6
        L7b:
            int r6 = r5.next()
            goto L42
        L80:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportygames.newcms.d.c(java.io.Reader, com.sportygames.newcms.e, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.sportygames.newcms.d] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v18, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    public final Serializable b(x1b x1bVar, String str, List list) throws IOException {
        yp5 yp5Var;
        ?? Execute;
        LinkedHashMap linkedHashMap;
        Object next;
        Throwable th;
        Reader reader;
        ?? r0;
        Pair pair;
        if (x1bVar instanceof yp5) {
            yp5Var = (yp5) x1bVar;
            int i = yp5Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                yp5Var.i = i - Integer.MIN_VALUE;
            } else {
                yp5Var = new yp5(this, x1bVar);
            }
        } else {
            yp5Var = new yp5(this, x1bVar);
        }
        Object obj = yp5Var.e;
        y5b y5bVar = y5b.a;
        int i2 = yp5Var.i;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                int iA = jpu.a(l48.r(list, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
                for (Object obj2 : list) {
                    linkedHashMap2.put(obj2, null);
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap2);
                String languageCode = this.d.getLanguageCode();
                uag uagVar = zn5.d;
                q3.b bVarA = ocx.a(uagVar, uagVar);
                do {
                    if (!bVarA.hasNext()) {
                        next = null;
                        break;
                    }
                    next = bVarA.next();
                } while (!((zn5) next).a.equals(languageCode));
                zn5 zn5Var = (zn5) next;
                if (zn5Var == null) {
                    hb5.a(inm.a("Invalid language code: ", languageCode));
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.e);
                sb.append("cms/app/");
                sb.append((String) str);
                sb.append('/');
                Execute = FirebasePerfOkHttpClient.execute(new OkHttpClient.Builder().build().newCall(new Request.Builder().url(uf80.a(sb, zn5Var.b, "/strings.xml")).build()));
                try {
                    if (!Execute.getIsSuccessful()) {
                        throw new IOException("Unexpected code " + Execute);
                    }
                    Reader readerCharStream = Execute.body().charStream();
                    try {
                        e eVar = new e(str, linkedHashMap, null);
                        yp5Var.a = str;
                        yp5Var.b = linkedHashMap;
                        yp5Var.c = Execute;
                        yp5Var.d = readerCharStream;
                        yp5Var.i = 1;
                        if (c(readerCharStream, eVar, yp5Var) == y5bVar) {
                            return y5bVar;
                        }
                        r0 = str;
                        reader = readerCharStream;
                        str = Execute;
                    } catch (Throwable th2) {
                        str = Execute;
                        th = th2;
                        reader = readerCharStream;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        ft7.a(Execute, th);
                        throw th4;
                    }
                }
            } else {
                if (i2 != 1) {
                    ib5.a(oLsIjJCWb.jtxnovpdb);
                    return null;
                }
                reader = yp5Var.d;
                str = yp5Var.c;
                linkedHashMap = yp5Var.b;
                String str2 = yp5Var.a;
                try {
                    uj50.b(obj);
                    r0 = str2;
                    str = str;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        ft7.a(reader, th);
                        throw th6;
                    }
                }
            }
            Unit unit = Unit.a;
            ft7.a(reader, null);
            ft7.a(str, null);
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                CMSRes.Data data = (CMSRes.Data) entry.getKey();
                String str3 = (String) entry.getValue();
                if (str3 != null) {
                    pair = new Pair(data, str3);
                } else {
                    if (data.e != nn5.String) {
                        throw new IOException(data + " not found in page: " + r0);
                    }
                    pair = new Pair(data, "");
                }
                arrayList.add(pair);
            }
            return arrayList;
        } catch (Throwable th7) {
            th = th7;
            Execute = str;
            throw th;
        }
    }
}
