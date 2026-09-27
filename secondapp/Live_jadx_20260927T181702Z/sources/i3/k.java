package i3;

import f0.j3;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f90369h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f90370i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f90371j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f90372k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f90373l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f90374m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f90375n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f90376o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f90377p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f90378q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ boolean f90379r = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f90380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f90381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, Integer> f90382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, Integer> f90383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f90385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Comparator<b> f90386g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b10;
            byte b11;
            int i10 = bVar.f90393e;
            int i11 = bVar2.f90393e;
            do {
                b10 = k.this.f90380a.get(i10);
                b11 = k.this.f90380a.get(i11);
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
            } while (b10 == b11);
            return b10 - b11;
        }
    }

    public k(int i10) {
        this(new i3.a(i10), 1);
    }

    public static int E(long j10) {
        if (j10 <= j.C0892j.a((byte) -1)) {
            return 0;
        }
        if (j10 <= j.C0892j.c((short) -1)) {
            return 1;
        }
        return j10 <= j.C0892j.b(-1) ? 2 : 3;
    }

    public final void A(String str, long j10) {
        this.f90381b.add(b.w(u(str), j10));
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.f90381b.size();
    }

    public int D() {
        return this.f90381b.size();
    }

    public final void F(b bVar, int i10) {
        int i11 = bVar.f90389a;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                H(bVar.f90391c, i10);
                return;
            } else if (i11 != 26) {
                J(bVar.f90392d, i10);
                return;
            }
        }
        I(bVar.f90392d, i10);
    }

    public final b G(int i10, byte[] bArr, int i11, boolean z10) {
        int iE = E(bArr.length);
        I(bArr.length, b(iE));
        int iK = this.f90380a.k();
        this.f90380a.p(bArr, 0, bArr.length);
        if (z10) {
            this.f90380a.l((byte) 0);
        }
        return b.f(i10, iK, i11, iE);
    }

    public final void H(double d10, int i10) {
        if (i10 == 4) {
            this.f90380a.a((float) d10);
        } else if (i10 == 8) {
            this.f90380a.d(d10);
        }
    }

    public final void I(long j10, int i10) {
        if (i10 == 1) {
            this.f90380a.l((byte) j10);
            return;
        }
        if (i10 == 2) {
            this.f90380a.e((short) j10);
        } else if (i10 == 4) {
            this.f90380a.b((int) j10);
        } else {
            if (i10 != 8) {
                return;
            }
            this.f90380a.c(j10);
        }
    }

    public final void J(long j10, int i10) {
        I((int) (((long) this.f90380a.k()) - j10), i10);
    }

    public final b K(int i10, String str) {
        return G(i10, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public final int b(int i10) {
        int i11 = 1 << i10;
        int iQ = b.q(this.f90380a.k(), i11);
        while (true) {
            int i12 = iQ - 1;
            if (iQ == 0) {
                return i11;
            }
            this.f90380a.l((byte) 0);
            iQ = i12;
        }
    }

    public final b c(int i10, int i11) {
        long j10 = i11;
        int iMax = Math.max(0, E(j10));
        int i12 = i10;
        while (i12 < this.f90381b.size()) {
            int i13 = i12 + 1;
            iMax = Math.max(iMax, b.i(4, 0, this.f90381b.get(i12).f90393e, this.f90380a.k(), i13));
            i12 = i13;
        }
        int iB = b(iMax);
        I(j10, iB);
        int iK = this.f90380a.k();
        while (i10 < this.f90381b.size()) {
            int i14 = this.f90381b.get(i10).f90393e;
            J(this.f90381b.get(i10).f90393e, iB);
            i10++;
        }
        return new b(-1, j.q(4, 0), iMax, iK);
    }

    public final b d(int i10, int i11, int i12, boolean z10, boolean z11, b bVar) {
        int i13;
        int iQ;
        int i14 = i12;
        long j10 = i14;
        int iMax = Math.max(0, E(j10));
        if (bVar != null) {
            iMax = Math.max(iMax, bVar.h(this.f90380a.k(), 0));
            i13 = 3;
        } else {
            i13 = 1;
        }
        int i15 = 4;
        int iMax2 = iMax;
        for (int i16 = i11; i16 < this.f90381b.size(); i16++) {
            iMax2 = Math.max(iMax2, this.f90381b.get(i16).h(this.f90380a.k(), i16 + i13));
            if (z10 && i16 == i11) {
                i15 = this.f90381b.get(i16).f90389a;
                if (!j.l(i15)) {
                    throw new j.b("TypedVector does not support this element type");
                }
            }
        }
        int i17 = i11;
        int iB = b(iMax2);
        if (bVar != null) {
            J(bVar.f90392d, iB);
            I(1 << bVar.f90390b, iB);
        }
        if (!z11) {
            I(j10, iB);
        }
        int iK = this.f90380a.k();
        for (int i18 = i17; i18 < this.f90381b.size(); i18++) {
            F(this.f90381b.get(i18), iB);
        }
        if (!z10) {
            while (i17 < this.f90381b.size()) {
                this.f90380a.l(this.f90381b.get(i17).s(iMax2));
                i17++;
            }
        }
        if (bVar != null) {
            iQ = 9;
        } else if (z10) {
            if (!z11) {
                i14 = 0;
            }
            iQ = j.q(i15, i14);
        } else {
            iQ = 10;
        }
        return new b(i10, iQ, iMax2, iK);
    }

    public int e(String str, int i10) {
        int iU = u(str);
        ArrayList<b> arrayList = this.f90381b;
        Collections.sort(arrayList.subList(i10, arrayList.size()), this.f90386g);
        b bVarD = d(iU, i10, this.f90381b.size() - i10, false, false, c(i10, this.f90381b.size() - i10));
        while (this.f90381b.size() > i10) {
            ArrayList<b> arrayList2 = this.f90381b;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f90381b.add(bVarD);
        return (int) bVarD.f90392d;
    }

    public int f(String str, int i10, boolean z10, boolean z11) {
        b bVarD = d(u(str), i10, this.f90381b.size() - i10, z10, z11, null);
        while (this.f90381b.size() > i10) {
            ArrayList<b> arrayList = this.f90381b;
            arrayList.remove(arrayList.size() - 1);
        }
        this.f90381b.add(bVarD);
        return (int) bVarD.f90392d;
    }

    public ByteBuffer g() {
        int iB = b(this.f90381b.get(0).h(this.f90380a.k(), 0));
        F(this.f90381b.get(0), iB);
        this.f90380a.l(this.f90381b.get(0).r());
        this.f90380a.l((byte) iB);
        this.f90385f = true;
        return ByteBuffer.wrap(this.f90380a.h(), 0, this.f90380a.k());
    }

    public r h() {
        return this.f90380a;
    }

    public int i(String str, byte[] bArr) {
        b bVarG = G(u(str), bArr, 25, false);
        this.f90381b.add(bVarG);
        return (int) bVarG.f90392d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z10) {
        this.f90381b.add(b.g(u(str), z10));
    }

    public void l(boolean z10) {
        k(null, z10);
    }

    public void m(double d10) {
        o(null, d10);
    }

    public void n(float f10) {
        p(null, f10);
    }

    public void o(String str, double d10) {
        this.f90381b.add(b.k(u(str), d10));
    }

    public void p(String str, float f10) {
        this.f90381b.add(b.j(u(str), f10));
    }

    public void q(int i10) {
        s(null, i10);
    }

    public void r(long j10) {
        t(null, j10);
    }

    public void s(String str, int i10) {
        t(str, i10);
    }

    public void t(String str, long j10) {
        int iU = u(str);
        if (-128 <= j10 && j10 <= 127) {
            this.f90381b.add(b.o(iU, (int) j10));
            return;
        }
        if (-32768 <= j10 && j10 <= 32767) {
            this.f90381b.add(b.l(iU, (int) j10));
        } else if (j3.f81979h > j10 || j10 > 2147483647L) {
            this.f90381b.add(b.n(iU, j10));
        } else {
            this.f90381b.add(b.m(iU, (int) j10));
        }
    }

    public final int u(String str) {
        if (str == null) {
            return -1;
        }
        int iK = this.f90380a.k();
        if ((this.f90384e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f90380a.p(bytes, 0, bytes.length);
            this.f90380a.l((byte) 0);
            this.f90382c.put(str, Integer.valueOf(iK));
            return iK;
        }
        Integer num = this.f90382c.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f90380a.p(bytes2, 0, bytes2.length);
        this.f90380a.l((byte) 0);
        this.f90382c.put(str, Integer.valueOf(iK));
        return iK;
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int iU = u(str);
        if ((this.f90384e & 2) == 0) {
            b bVarK = K(iU, str2);
            this.f90381b.add(bVarK);
            return (int) bVarK.f90392d;
        }
        Integer num = this.f90383d.get(str2);
        if (num != null) {
            this.f90381b.add(b.f(iU, num.intValue(), 5, E(str2.length())));
            return num.intValue();
        }
        b bVarK2 = K(iU, str2);
        this.f90383d.put(str2, Integer.valueOf((int) bVarK2.f90392d));
        this.f90381b.add(bVarK2);
        return (int) bVarK2.f90392d;
    }

    public void x(int i10) {
        z(null, i10);
    }

    public void y(long j10) {
        z(null, j10);
    }

    public final void z(String str, long j10) {
        b bVarV;
        int iU = u(str);
        int iE = E(j10);
        if (iE == 0) {
            bVarV = b.x(iU, (int) j10);
        } else if (iE == 1) {
            bVarV = b.u(iU, (int) j10);
        } else {
            bVarV = iE == 2 ? b.v(iU, (int) j10) : b.w(iU, j10);
        }
        this.f90381b.add(bVarV);
    }

    public k() {
        this(256);
    }

    @Deprecated
    public k(ByteBuffer byteBuffer, int i10) {
        this(new i3.a(byteBuffer.array()), i10);
    }

    public k(r rVar, int i10) {
        this.f90381b = new ArrayList<>();
        this.f90382c = new HashMap<>();
        this.f90383d = new HashMap<>();
        this.f90385f = false;
        this.f90386g = new a();
        this.f90380a = rVar;
        this.f90384e = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ boolean f90388f = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f90391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f90392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f90393e;

        public b(int i10, int i11, int i12, long j10) {
            this.f90393e = i10;
            this.f90389a = i11;
            this.f90390b = i12;
            this.f90392d = j10;
            this.f90391c = Double.MIN_VALUE;
        }

        public static b f(int i10, int i11, int i12, int i13) {
            return new b(i10, i12, i13, i11);
        }

        public static b g(int i10, boolean z10) {
            return new b(i10, 26, 0, z10 ? 1L : 0L);
        }

        public static int i(int i10, int i11, long j10, int i12, int i13) {
            if (j.j(i10)) {
                return i11;
            }
            for (int i14 = 1; i14 <= 32; i14 *= 2) {
                int iE = k.E((int) (((long) ((q(i12, i14) + i12) + (i13 * i14))) - j10));
                if ((1 << iE) == i14) {
                    return iE;
                }
            }
            return 3;
        }

        public static b j(int i10, float f10) {
            return new b(i10, 3, 2, f10);
        }

        public static b k(int i10, double d10) {
            return new b(i10, 3, 3, d10);
        }

        public static b l(int i10, int i11) {
            return new b(i10, 1, 1, i11);
        }

        public static b m(int i10, int i11) {
            return new b(i10, 1, 2, i11);
        }

        public static b n(int i10, long j10) {
            return new b(i10, 1, 3, j10);
        }

        public static b o(int i10, int i11) {
            return new b(i10, 1, 0, i11);
        }

        public static byte p(int i10, int i11) {
            return (byte) (i10 | (i11 << 2));
        }

        public static int q(int i10, int i11) {
            return ((~i10) + 1) & (i11 - 1);
        }

        public static b u(int i10, int i11) {
            return new b(i10, 2, 1, i11);
        }

        public static b v(int i10, int i11) {
            return new b(i10, 2, 2, i11);
        }

        public static b w(int i10, long j10) {
            return new b(i10, 2, 3, j10);
        }

        public static b x(int i10, int i11) {
            return new b(i10, 2, 0, i11);
        }

        public final int h(int i10, int i11) {
            return i(this.f90389a, this.f90390b, this.f90392d, i10, i11);
        }

        public final byte r() {
            return s(0);
        }

        public final byte s(int i10) {
            return p(t(i10), this.f90389a);
        }

        public final int t(int i10) {
            return j.j(this.f90389a) ? Math.max(this.f90390b, i10) : this.f90390b;
        }

        public b(int i10, int i11, int i12, double d10) {
            this.f90393e = i10;
            this.f90389a = i11;
            this.f90390b = i12;
            this.f90391c = d10;
            this.f90392d = Long.MIN_VALUE;
        }
    }

    public k(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
