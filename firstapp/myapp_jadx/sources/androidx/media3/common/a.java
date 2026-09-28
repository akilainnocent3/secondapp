package androidx.media3.common;

import android.text.TextUtils;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import defpackage.c150;
import defpackage.c40;
import defpackage.cjs;
import defpackage.d40;
import defpackage.gqv;
import defpackage.ib5;
import defpackage.jf;
import defpackage.jrh0;
import defpackage.ly0;
import defpackage.mlr;
import defpackage.n58;
import defpackage.pcn;
import defpackage.tx5;
import defpackage.tze;
import defpackage.uov;
import defpackage.vl5;
import defpackage.w9p;
import defpackage.y4s;
import defpackage.zk1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import okhttp3.internal.http2.Http2;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final float A;
    public final byte[] B;
    public final int C;
    public final n58 D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final String a;
    public final String b;
    public final pcn c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final uov l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List<byte[]> q;
    public final DrmInitData r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    /* JADX INFO: renamed from: androidx.media3.common.a$a, reason: collision with other inner class name */
    public static final class C0062a {
        public byte[] A;
        public int B;
        public n58 C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public String a;
        public String b;
        public pcn c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public String j;
        public uov k;
        public String l;
        public String m;
        public int n;
        public int o;
        public List<byte[]> p;
        public DrmInitData q;
        public long r;
        public boolean s;
        public int t;
        public int u;
        public int v;
        public int w;
        public float x;
        public int y;
        public float z;

        public C0062a() {
            pcn.b bVar = pcn.b;
            this.c = c150.e;
            this.h = -1;
            this.i = -1;
            this.n = -1;
            this.o = -1;
            this.r = Long.MAX_VALUE;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1.0f;
            this.z = 1.0f;
            this.B = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.J = -1;
            this.K = 1;
            this.L = -1;
            this.M = -1;
            this.N = 0;
            this.g = 0;
        }
    }

    static {
        new a(new C0062a());
        jrh0.J(0);
        jrh0.J(1);
        jrh0.J(2);
        jrh0.J(3);
        jf.a(4, 5, 6, 7, 8);
        jf.a(9, 10, 11, 12, 13);
        jf.a(14, 15, 16, 17, 18);
        jf.a(19, 20, 21, 22, 23);
        jf.a(24, 25, 26, 27, 28);
        jf.a(29, 30, 31, 32, 33);
        jrh0.J(34);
        jrh0.J(35);
        jrh0.J(36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(C0062a c0062a) {
        boolean z;
        String str;
        this.a = c0062a.a;
        String strP = jrh0.P(c0062a.d);
        this.d = strP;
        if (c0062a.c.isEmpty() && c0062a.b != null) {
            this.c = pcn.n(new mlr(strP, c0062a.b));
            this.b = c0062a.b;
        } else if (c0062a.c.isEmpty() || c0062a.b != null) {
            if (!c0062a.c.isEmpty() || c0062a.b != null) {
                int i = 0;
                while (true) {
                    if (i >= c0062a.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((mlr) c0062a.c.get(i)).b.equals(c0062a.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            ly0.f(z);
            this.c = c0062a.c;
            this.b = c0062a.b;
        } else {
            pcn pcnVar = c0062a.c;
            this.c = pcnVar;
            int size = pcnVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    str = ((mlr) pcnVar.get(0)).b;
                    break;
                }
                E e = pcnVar.get(i2);
                i2++;
                mlr mlrVar = (mlr) e;
                if (TextUtils.equals(mlrVar.a, strP)) {
                    str = mlrVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = c0062a.e;
        ly0.e("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c0062a.g == 0 || (c0062a.f & 32768) != 0);
        this.f = c0062a.f;
        this.g = c0062a.g;
        int i3 = c0062a.h;
        this.h = i3;
        int i4 = c0062a.i;
        this.i = i4;
        this.j = i4 != -1 ? i4 : i3;
        this.k = c0062a.j;
        this.l = c0062a.k;
        this.m = c0062a.l;
        this.n = c0062a.m;
        this.o = c0062a.n;
        this.p = c0062a.o;
        List<byte[]> list = c0062a.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = c0062a.q;
        this.r = drmInitData;
        this.s = c0062a.r;
        this.t = c0062a.s;
        this.u = c0062a.t;
        this.v = c0062a.u;
        this.w = c0062a.v;
        this.x = c0062a.w;
        this.y = c0062a.x;
        int i5 = c0062a.y;
        this.z = i5 == -1 ? 0 : i5;
        float f = c0062a.z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = c0062a.A;
        this.C = c0062a.B;
        this.D = c0062a.C;
        this.E = c0062a.D;
        this.F = c0062a.E;
        this.G = c0062a.F;
        this.H = c0062a.G;
        int i6 = c0062a.H;
        this.I = i6 == -1 ? 0 : i6;
        int i7 = c0062a.I;
        this.J = i7 != -1 ? i7 : 0;
        this.K = c0062a.J;
        this.L = c0062a.K;
        this.M = c0062a.L;
        this.N = c0062a.M;
        int i8 = c0062a.N;
        if (i8 != 0 || drmInitData == null) {
            this.O = i8;
        } else {
            this.O = 1;
        }
    }

    public final C0062a a() {
        C0062a c0062a = new C0062a();
        c0062a.a = this.a;
        c0062a.b = this.b;
        c0062a.c = this.c;
        c0062a.d = this.d;
        c0062a.e = this.e;
        c0062a.f = this.f;
        c0062a.h = this.h;
        c0062a.i = this.i;
        c0062a.j = this.k;
        c0062a.k = this.l;
        c0062a.l = this.m;
        c0062a.m = this.n;
        c0062a.n = this.o;
        c0062a.o = this.p;
        c0062a.p = this.q;
        c0062a.q = this.r;
        c0062a.r = this.s;
        c0062a.s = this.t;
        c0062a.t = this.u;
        c0062a.u = this.v;
        c0062a.v = this.w;
        c0062a.w = this.x;
        c0062a.x = this.y;
        c0062a.y = this.z;
        c0062a.z = this.A;
        c0062a.A = this.B;
        c0062a.B = this.C;
        c0062a.C = this.D;
        c0062a.D = this.E;
        c0062a.E = this.F;
        c0062a.F = this.G;
        c0062a.G = this.H;
        c0062a.H = this.I;
        c0062a.I = this.J;
        c0062a.J = this.K;
        c0062a.K = this.L;
        c0062a.L = this.M;
        c0062a.M = this.N;
        c0062a.N = this.O;
        return c0062a;
    }

    public final boolean b(a aVar) {
        List<byte[]> list = this.q;
        if (list.size() != aVar.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), aVar.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final a d(a aVar) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == aVar) {
            return this;
        }
        int iH = gqv.h(this.n);
        String str3 = aVar.a;
        pcn pcnVar = aVar.c;
        int i3 = aVar.M;
        int i4 = aVar.N;
        String str4 = aVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (pcnVar.isEmpty()) {
            pcnVar = this.c;
        }
        if ((iH != 3 && iH != 1) || (str = aVar.d) == null) {
            str = this.d;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = aVar.h;
        }
        int i6 = this.i;
        if (i6 == -1) {
            i6 = aVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strV = jrh0.v(iH, aVar.k);
            if (jrh0.Y(strV).length == 1) {
                str5 = strV;
            }
        }
        uov uovVarB = aVar.l;
        uov uovVar = this.l;
        if (uovVar != null) {
            uovVarB = uovVar.b(uovVarB);
        }
        float f = this.y;
        if (f == -1.0f && iH == 2) {
            f = aVar.y;
        }
        int i7 = this.e | aVar.e;
        int i8 = this.f | aVar.f;
        DrmInitData drmInitData = aVar.r;
        ArrayList arrayList = new ArrayList();
        pcn pcnVar2 = pcnVar;
        if (drmInitData != null) {
            String str6 = drmInitData.c;
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.a;
            int length = schemeDataArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                DrmInitData.SchemeData schemeData = schemeDataArr[i10];
                int i11 = length;
                if (schemeData.e != null) {
                    arrayList.add(schemeData);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.r;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.a;
            String str7 = str2;
            int length2 = schemeDataArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                DrmInitData.SchemeData schemeData2 = schemeDataArr2[i13];
                int i14 = length2;
                if (schemeData2.e != null) {
                    UUID uuid = schemeData2.b;
                    i2 = i4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i = size;
                            arrayList.add(schemeData2);
                            break;
                        }
                        i = size;
                        if (((DrmInitData.SchemeData) arrayList.get(i15)).b.equals(uuid)) {
                            break;
                        }
                        i15++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i12 = i13 + 1;
                length2 = i14;
                i4 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i16 = i4;
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
        C0062a c0062aA = a();
        c0062aA.a = str3;
        c0062aA.b = str4;
        c0062aA.c = pcn.j(pcnVar2);
        c0062aA.d = str;
        c0062aA.e = i7;
        c0062aA.f = i8;
        c0062aA.h = i5;
        c0062aA.i = i6;
        c0062aA.j = str5;
        c0062aA.k = uovVarB;
        c0062aA.q = drmInitData3;
        c0062aA.x = f;
        c0062aA.L = i3;
        c0062aA.M = i16;
        return new a(c0062aA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i2 = this.P;
        return (i2 == 0 || (i = aVar.P) == 0 || i2 == i) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.o == aVar.o && this.s == aVar.s && this.u == aVar.u && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && this.z == aVar.z && this.C == aVar.C && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && this.K == aVar.K && this.M == aVar.M && this.N == aVar.N && this.O == aVar.O && Float.compare(this.y, aVar.y) == 0 && Float.compare(this.A, aVar.A) == 0 && Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && this.c.equals(aVar.c) && Objects.equals(this.k, aVar.k) && Objects.equals(this.m, aVar.m) && Objects.equals(this.n, aVar.n) && Objects.equals(this.d, aVar.d) && Arrays.equals(this.B, aVar.B) && Objects.equals(this.l, aVar.l) && Objects.equals(this.D, aVar.D) && Objects.equals(this.r, aVar.r) && b(aVar);
    }

    public final int hashCode() {
        int i = this.P;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str4 = this.k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        uov uovVar = this.l;
        int iHashCode5 = (iHashCode4 + (uovVar == null ? 0 : uovVar.hashCode())) * 961;
        String str5 = this.m;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        this.P = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.D);
        sb.append("], [");
        sb.append(this.F);
        sb.append(", ");
        return zk1.a(this.G, "])", sb);
    }

    public static String c(a aVar) {
        int i;
        String str;
        String strA;
        if (aVar == null) {
            return "null";
        }
        int i2 = aVar.e;
        pcn pcnVar = aVar.c;
        String str2 = aVar.d;
        int i3 = aVar.G;
        int i4 = aVar.F;
        int i5 = aVar.E;
        float f = aVar.y;
        n58 n58Var = aVar.D;
        float f2 = aVar.A;
        int i6 = aVar.x;
        int i7 = aVar.w;
        int i8 = aVar.v;
        int i9 = aVar.u;
        DrmInitData drmInitData = aVar.r;
        String str3 = aVar.k;
        int i10 = aVar.j;
        String str4 = aVar.m;
        int i11 = aVar.f;
        w9p w9pVar = new w9p(String.valueOf(','));
        StringBuilder sbA = y4s.a("id=");
        sbA.append(aVar.a);
        sbA.append(", mimeType=");
        sbA.append(aVar.n);
        if (str4 != null) {
            sbA.append(oLsIjJCWb.IkNkZPRvMqenZj);
            sbA.append(str4);
        }
        if (i10 != -1) {
            sbA.append(", bitrate=");
            sbA.append(i10);
        }
        if (str3 != null) {
            sbA.append(", codecs=");
            sbA.append(str3);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < drmInitData.d; i12++) {
                UUID uuid = drmInitData.a[i12].b;
                if (uuid.equals(vl5.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(vl5.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(vl5.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(vl5.d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(vl5.a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                }
            }
            sbA.append(", drm=[");
            w9pVar.a(sbA, linkedHashSet.iterator());
            sbA.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            sbA.append(", res=");
            sbA.append(i9);
            sbA.append("x");
            sbA.append(i8);
        }
        if (i7 != -1 && i6 != -1) {
            sbA.append(", decRes=");
            sbA.append(i7);
            sbA.append("x");
            sbA.append(i6);
        }
        double d = f2;
        int i13 = tze.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbA.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str5 = jrh0.a;
            sbA.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (n58Var != null) {
            int i14 = n58Var.f;
            int i15 = n58Var.e;
            if ((i15 != -1 && i14 != -1) || n58Var.d()) {
                sbA.append(", color=");
                if (n58Var.d()) {
                    String strB = n58.b(n58Var.a);
                    String strA2 = n58.a(n58Var.b);
                    String strC = n58.c(n58Var.c);
                    Locale locale = Locale.US;
                    strA = tx5.a(strB, "/", strA2, "/", strC);
                } else {
                    strA = "NA/NA/NA";
                }
                sbA.append(strA + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : d40.a(i15, i14, "/")));
            }
        }
        if (f != -1.0f) {
            sbA.append(", fps=");
            sbA.append(f);
        }
        if (i5 != -1) {
            sbA.append(", maxSubLayers=");
            sbA.append(i5);
        }
        if (i4 != -1) {
            sbA.append(", channels=");
            sbA.append(i4);
        }
        if (i3 != -1) {
            sbA.append(", sample_rate=");
            sbA.append(i3);
        }
        if (str2 != null) {
            sbA.append(", language=");
            sbA.append(str2);
        }
        if (!pcnVar.isEmpty()) {
            sbA.append(", labels=[");
            w9pVar.a(sbA, cjs.a(pcnVar, new c40()).iterator());
            sbA.append("]");
        }
        if (i2 != 0) {
            sbA.append(", selectionFlags=[");
            String str6 = jrh0.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add(StompClient.DEFAULT_ACK);
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            w9pVar.a(sbA, arrayList.iterator());
            sbA.append("]");
        }
        if (i11 != 0) {
            sbA.append(", roleFlags=[");
            String str7 = jrh0.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            w9pVar.a(sbA, arrayList2.iterator());
            sbA.append("]");
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            sbA.append(", auxiliaryTrackType=");
            int i16 = aVar.g;
            String str8 = jrh0.a;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    ib5.a("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbA.append(str);
        }
        return sbA.toString();
    }
}
