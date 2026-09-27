package yads;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f154948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f154951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f154952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f154953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f154954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f154955h;

    public rg0(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f154949b = str;
        this.f154950c = "".equals(str2) ? null : str2;
        this.f154951d = j10;
        this.f154952e = j11;
        this.f154953f = j12;
        this.f154954g = j13;
        this.f154955h = list;
    }

    public static List a(lr lrVar) {
        List list = lrVar.f152096h;
        if (list != null) {
            return list;
        }
        Map map = lrVar.f152095g;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new q01((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static rg0 a(sg0 sg0Var) throws IOException {
        if (tg0.a(sg0Var) == 538247942) {
            String str = new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8");
            String str2 = new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8");
            long jB = tg0.b(sg0Var);
            long jB2 = tg0.b(sg0Var);
            long jB3 = tg0.b(sg0Var);
            long jB4 = tg0.b(sg0Var);
            int iA = tg0.a(sg0Var);
            if (iA >= 0) {
                List arrayList = iA == 0 ? Collections.EMPTY_LIST : new ArrayList();
                int i10 = 0;
                while (i10 < iA) {
                    arrayList.add(new q01(new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8").intern(), new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8").intern()));
                    i10++;
                    str = str;
                    str2 = str2;
                    jB = jB;
                }
                return new rg0(str, str2, jB, jB2, jB3, jB4, arrayList);
            }
            throw new IOException(mg2.a("readHeaderList size=", iA));
        }
        throw new IOException();
    }

    public final lr a(byte[] bArr) {
        lr lrVar = new lr();
        lrVar.f152089a = bArr;
        lrVar.f152090b = this.f154950c;
        lrVar.f152091c = this.f154951d;
        lrVar.f152092d = this.f154952e;
        lrVar.f152093e = this.f154953f;
        lrVar.f152094f = this.f154954g;
        List<q01> list = this.f154955h;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (q01 q01Var : list) {
            treeMap.put(q01Var.f154215a, q01Var.f154216b);
        }
        lrVar.f152095g = treeMap;
        lrVar.f152096h = Collections.unmodifiableList(this.f154955h);
        return lrVar;
    }

    public final boolean a(BufferedOutputStream bufferedOutputStream) {
        try {
            tg0.a(bufferedOutputStream, 538247942);
            byte[] bytes = this.f154949b.getBytes("UTF-8");
            tg0.a(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            String str = this.f154950c;
            if (str == null) {
                str = "";
            }
            byte[] bytes2 = str.getBytes("UTF-8");
            tg0.a(bufferedOutputStream, bytes2.length);
            bufferedOutputStream.write(bytes2, 0, bytes2.length);
            tg0.a(bufferedOutputStream, this.f154951d);
            tg0.a(bufferedOutputStream, this.f154952e);
            tg0.a(bufferedOutputStream, this.f154953f);
            tg0.a(bufferedOutputStream, this.f154954g);
            List<q01> list = this.f154955h;
            if (list != null) {
                tg0.a(bufferedOutputStream, list.size());
                for (q01 q01Var : list) {
                    byte[] bytes3 = q01Var.f154215a.getBytes("UTF-8");
                    tg0.a(bufferedOutputStream, bytes3.length);
                    bufferedOutputStream.write(bytes3, 0, bytes3.length);
                    byte[] bytes4 = q01Var.f154216b.getBytes("UTF-8");
                    tg0.a(bufferedOutputStream, bytes4.length);
                    bufferedOutputStream.write(bytes4, 0, bytes4.length);
                }
            } else {
                tg0.a(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException unused) {
            boolean z10 = lm3.f152057a;
            boolean z11 = ad1.f146762a;
            return false;
        }
    }
}
