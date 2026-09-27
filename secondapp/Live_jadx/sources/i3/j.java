package i3;

import com.ironsource.C4235d4;
import dr.r2;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class j {
    public static final int A = 26;
    public static final int B = 36;
    public static final q C = new i3.a(new byte[]{0}, 1);
    public static final /* synthetic */ boolean D = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f90325a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90326b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90327c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90328d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90329e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f90330f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f90331g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f90332h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f90333i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f90334j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f90335k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f90336l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f90337m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f90338n = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f90339o = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f90340p = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f90341q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f90342r = 17;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f90343s = 18;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f90344t = 19;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f90345u = 20;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f90346v = 21;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f90347w = 22;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f90348x = 23;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f90349y = 24;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f90350z = 25;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f90351e = new a(j.C, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ boolean f90352f = false;

        public a(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
        }

        public static a d() {
            return f90351e;
        }

        @Override // i3.j.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f90356a.n(this.f90357b, b()));
            sb2.append('\"');
            return sb2;
        }

        @Override // i3.j.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public ByteBuffer c() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f90356a.h());
            byteBufferWrap.position(this.f90357b);
            byteBufferWrap.limit(this.f90357b + b());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i10) {
            return this.f90356a.get(this.f90357b + i10);
        }

        public byte[] f() {
            int iB = b();
            byte[] bArr = new byte[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                bArr[i10] = this.f90356a.get(this.f90357b + i10);
            }
            return bArr;
        }

        @Override // i3.j.f
        public String toString() {
            return this.f90356a.n(this.f90357b, b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f90353d = new c(j.C, 0, 0);

        public c(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
        }

        public static c d() {
            return f90353d;
        }

        @Override // i3.j.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        public int c(byte[] bArr) {
            byte b10;
            byte b11;
            int i10 = this.f90357b;
            int i11 = 0;
            do {
                b10 = this.f90356a.get(i10);
                b11 = bArr[i11];
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
                if (i11 == bArr.length) {
                    return b10 - b11;
                }
            } while (b10 == b11);
            return b10 - b11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f90357b == this.f90357b && cVar.f90358c == this.f90358c;
        }

        public int hashCode() {
            return this.f90357b ^ this.f90358c;
        }

        @Override // i3.j.f
        public String toString() {
            int i10 = this.f90357b;
            while (this.f90356a.get(i10) != 0) {
                i10++;
            }
            int i11 = this.f90357b;
            return this.f90356a.n(i11, i10 - i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f90354a;

        public d(i iVar) {
            this.f90354a = iVar;
        }

        public c a(int i10) {
            if (i10 >= b()) {
                return c.f90353d;
            }
            i iVar = this.f90354a;
            int i11 = iVar.f90357b + (i10 * iVar.f90358c);
            i iVar2 = this.f90354a;
            q qVar = iVar2.f90356a;
            return new c(qVar, j.i(qVar, i11, iVar2.f90358c), 1);
        }

        public int b() {
            return this.f90354a.b();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fw.b.f85384k);
            for (int i10 = 0; i10 < this.f90354a.b(); i10++) {
                this.f90354a.d(i10).z(sb2);
                if (i10 != this.f90354a.b() - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(C4235d4.j.f61462e);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends k {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f90355f = new e(j.C, 1, 1);

        public e(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
        }

        public static e g() {
            return f90355f;
        }

        @Override // i3.j.k, i3.j.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("{ ");
            d dVarJ = j();
            int iB = b();
            k kVarK = k();
            for (int i10 = 0; i10 < iB; i10++) {
                sb2.append('\"');
                sb2.append(dVarJ.a(i10).toString());
                sb2.append("\" : ");
                sb2.append(kVarK.d(i10).toString());
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public final int f(d dVar, byte[] bArr) {
            int iB = dVar.b() - 1;
            int i10 = 0;
            while (i10 <= iB) {
                int i11 = (i10 + iB) >>> 1;
                int iC = dVar.a(i11).c(bArr);
                if (iC < 0) {
                    i10 = i11 + 1;
                } else {
                    if (iC <= 0) {
                        return i11;
                    }
                    iB = i11 - 1;
                }
            }
            return -(i10 + 1);
        }

        public g h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public g i(byte[] bArr) {
            d dVarJ = j();
            int iB = dVarJ.b();
            int iF = f(dVarJ, bArr);
            return (iF < 0 || iF >= iB) ? g.f90359f : d(iF);
        }

        public d j() {
            int i10 = this.f90357b - (this.f90358c * 3);
            q qVar = this.f90356a;
            int i11 = j.i(qVar, i10, this.f90358c);
            q qVar2 = this.f90356a;
            int i12 = this.f90358c;
            return new d(new i(qVar, i11, j.n(qVar2, i10 + i12, i12), 4));
        }

        public k k() {
            return new k(this.f90356a, this.f90357b, this.f90358c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f90356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f90357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f90358c;

        public f(q qVar, int i10, int i11) {
            this.f90356a = qVar;
            this.f90357b = i10;
            this.f90358c = i11;
        }

        public abstract StringBuilder a(StringBuilder sb2);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f90359f = new g(j.C, 0, 1, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f90360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f90361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f90362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f90363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f90364e;

        public g(q qVar, int i10, int i11, int i12) {
            this(qVar, i10, i11, 1 << (i12 & 3), i12 >> 2);
        }

        public a b() {
            if (!m() && !v()) {
                return a.d();
            }
            q qVar = this.f90360a;
            return new a(qVar, j.i(qVar, this.f90361b, this.f90362c), this.f90363d);
        }

        public boolean c() {
            if (n()) {
                return this.f90360a.get(this.f90361b) != 0;
            }
            return j() != 0;
        }

        public double d() {
            int i10 = this.f90364e;
            if (i10 == 3) {
                return j.m(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 1) {
                return j.n(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 != 2) {
                if (i10 == 5) {
                    return Double.parseDouble(i());
                }
                if (i10 == 6) {
                    q qVar = this.f90360a;
                    return j.n(qVar, j.i(qVar, this.f90361b, this.f90362c), this.f90363d);
                }
                if (i10 == 7) {
                    q qVar2 = this.f90360a;
                    return j.p(qVar2, j.i(qVar2, this.f90361b, this.f90362c), this.f90363d);
                }
                if (i10 == 8) {
                    q qVar3 = this.f90360a;
                    return j.m(qVar3, j.i(qVar3, this.f90361b, this.f90362c), this.f90363d);
                }
                if (i10 == 10) {
                    return k().b();
                }
                if (i10 != 26) {
                    return 0.0d;
                }
            }
            return j.p(this.f90360a, this.f90361b, this.f90362c);
        }

        public int e() {
            int i10 = this.f90364e;
            if (i10 == 1) {
                return j.n(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 2) {
                return (int) j.p(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 3) {
                return (int) j.m(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 5) {
                return Integer.parseInt(i());
            }
            if (i10 == 6) {
                q qVar = this.f90360a;
                return j.n(qVar, j.i(qVar, this.f90361b, this.f90362c), this.f90363d);
            }
            if (i10 == 7) {
                q qVar2 = this.f90360a;
                return (int) j.p(qVar2, j.i(qVar2, this.f90361b, this.f90362c), this.f90362c);
            }
            if (i10 == 8) {
                q qVar3 = this.f90360a;
                return (int) j.m(qVar3, j.i(qVar3, this.f90361b, this.f90362c), this.f90363d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0;
            }
            return j.n(this.f90360a, this.f90361b, this.f90362c);
        }

        public c f() {
            if (!r()) {
                return c.d();
            }
            q qVar = this.f90360a;
            return new c(qVar, j.i(qVar, this.f90361b, this.f90362c), this.f90363d);
        }

        public long g() {
            int i10 = this.f90364e;
            if (i10 == 1) {
                return j.o(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 2) {
                return j.p(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 3) {
                return (long) j.m(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 5) {
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i10 == 6) {
                q qVar = this.f90360a;
                return j.o(qVar, j.i(qVar, this.f90361b, this.f90362c), this.f90363d);
            }
            if (i10 == 7) {
                q qVar2 = this.f90360a;
                return j.p(qVar2, j.i(qVar2, this.f90361b, this.f90362c), this.f90362c);
            }
            if (i10 == 8) {
                q qVar3 = this.f90360a;
                return (long) j.m(qVar3, j.i(qVar3, this.f90361b, this.f90362c), this.f90363d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0L;
            }
            return j.n(this.f90360a, this.f90361b, this.f90362c);
        }

        public e h() {
            if (!s()) {
                return e.g();
            }
            q qVar = this.f90360a;
            return new e(qVar, j.i(qVar, this.f90361b, this.f90362c), this.f90363d);
        }

        public String i() {
            if (v()) {
                int i10 = j.i(this.f90360a, this.f90361b, this.f90362c);
                q qVar = this.f90360a;
                int i11 = this.f90363d;
                return this.f90360a.n(i10, (int) j.p(qVar, i10 - i11, i11));
            }
            if (!r()) {
                return "";
            }
            int i12 = j.i(this.f90360a, this.f90361b, this.f90363d);
            int i13 = i12;
            while (this.f90360a.get(i13) != 0) {
                i13++;
            }
            return this.f90360a.n(i12, i13 - i12);
        }

        public long j() {
            int i10 = this.f90364e;
            if (i10 == 2) {
                return j.p(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 1) {
                return j.o(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 3) {
                return (long) j.m(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 == 26) {
                return j.n(this.f90360a, this.f90361b, this.f90362c);
            }
            if (i10 == 5) {
                return Long.parseLong(i());
            }
            if (i10 == 6) {
                q qVar = this.f90360a;
                return j.o(qVar, j.i(qVar, this.f90361b, this.f90362c), this.f90363d);
            }
            if (i10 == 7) {
                q qVar2 = this.f90360a;
                return j.p(qVar2, j.i(qVar2, this.f90361b, this.f90362c), this.f90363d);
            }
            if (i10 != 8) {
                return 0L;
            }
            q qVar3 = this.f90360a;
            return (long) j.m(qVar3, j.i(qVar3, this.f90361b, this.f90362c), this.f90362c);
        }

        public k k() {
            if (y()) {
                q qVar = this.f90360a;
                return new k(qVar, j.i(qVar, this.f90361b, this.f90362c), this.f90363d);
            }
            int i10 = this.f90364e;
            if (i10 == 15) {
                q qVar2 = this.f90360a;
                return new i(qVar2, j.i(qVar2, this.f90361b, this.f90362c), this.f90363d, 4);
            }
            if (!j.k(i10)) {
                return k.c();
            }
            q qVar3 = this.f90360a;
            return new i(qVar3, j.i(qVar3, this.f90361b, this.f90362c), this.f90363d, j.r(this.f90364e));
        }

        public int l() {
            return this.f90364e;
        }

        public boolean m() {
            return this.f90364e == 25;
        }

        public boolean n() {
            return this.f90364e == 26;
        }

        public boolean o() {
            int i10 = this.f90364e;
            return i10 == 3 || i10 == 8;
        }

        public boolean p() {
            int i10 = this.f90364e;
            return i10 == 1 || i10 == 6;
        }

        public boolean q() {
            return p() || x();
        }

        public boolean r() {
            return this.f90364e == 4;
        }

        public boolean s() {
            return this.f90364e == 9;
        }

        public boolean t() {
            return this.f90364e == 0;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            return q() || o();
        }

        public boolean v() {
            return this.f90364e == 5;
        }

        public boolean w() {
            return j.k(this.f90364e);
        }

        public boolean x() {
            int i10 = this.f90364e;
            return i10 == 2 || i10 == 7;
        }

        public boolean y() {
            int i10 = this.f90364e;
            return i10 == 10 || i10 == 9;
        }

        public StringBuilder z(StringBuilder sb2) {
            int i10 = this.f90364e;
            if (i10 != 36) {
                switch (i10) {
                    case 0:
                        sb2.append(fw.b.f85379f);
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(g());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(j());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(d());
                        return sb2;
                    case 4:
                        c cVarF = f();
                        sb2.append('\"');
                        StringBuilder sbA = cVarF.a(sb2);
                        sbA.append('\"');
                        return sbA;
                    case 5:
                        sb2.append('\"');
                        sb2.append(i());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        return h().a(sb2);
                    case 10:
                        return k().a(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new b("not_implemented:" + this.f90364e);
                    case 25:
                        return b().a(sb2);
                    case 26:
                        sb2.append(c());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(k());
            return sb2;
        }

        public g(q qVar, int i10, int i11, int i12, int i13) {
            this.f90360a = qVar;
            this.f90361b = i10;
            this.f90362c = i11;
            this.f90363d = i12;
            this.f90364e = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class h extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f90365d;

        public h(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
            this.f90365d = j.n(this.f90356a, i10 - i11, i11);
        }

        public int b() {
            return this.f90365d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final i f90366g = new i(j.C, 1, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f90367f;

        public i(q qVar, int i10, int i11, int i12) {
            super(qVar, i10, i11);
            this.f90367f = i12;
        }

        public static i f() {
            return f90366g;
        }

        @Override // i3.j.k
        public g d(int i10) {
            if (i10 >= b()) {
                return g.f90359f;
            }
            return new g(this.f90356a, this.f90357b + (i10 * this.f90358c), this.f90358c, 1, this.f90367f);
        }

        public int g() {
            return this.f90367f;
        }

        public boolean h() {
            return this == f90366g;
        }
    }

    /* JADX INFO: renamed from: i3.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0892j {
        public static int a(byte b10) {
            return b10 & 255;
        }

        public static long b(int i10) {
            return ((long) i10) & 4294967295L;
        }

        public static int c(short s10) {
            return s10 & r2.f79504e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class k extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final k f90368e = new k(j.C, 1, 1);

        public k(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
        }

        public static k c() {
            return f90368e;
        }

        @Override // i3.j.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("[ ");
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                d(i10).z(sb2);
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" ]");
            return sb2;
        }

        @Override // i3.j.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public g d(int i10) {
            long jB = b();
            long j10 = i10;
            if (j10 >= jB) {
                return g.f90359f;
            }
            return new g(this.f90356a, this.f90357b + (i10 * this.f90358c), this.f90358c, C0892j.a(this.f90356a.get((int) (((long) this.f90357b) + (jB * ((long) this.f90358c)) + j10))));
        }

        public boolean e() {
            return this == f90368e;
        }

        @Override // i3.j.f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static g g(q qVar) {
        int iG = qVar.g();
        byte b10 = qVar.get(iG - 1);
        int i10 = iG - 2;
        return new g(qVar, i10 - b10, b10, C0892j.a(qVar.get(i10)));
    }

    @Deprecated
    public static g h(ByteBuffer byteBuffer) {
        return g(byteBuffer.hasArray() ? new i3.a(byteBuffer.array(), byteBuffer.limit()) : new i3.d(byteBuffer));
    }

    public static int i(q qVar, int i10, int i11) {
        return (int) (((long) i10) - p(qVar, i10, i11));
    }

    public static boolean j(int i10) {
        return i10 <= 3 || i10 == 26;
    }

    public static boolean k(int i10) {
        return (i10 >= 11 && i10 <= 15) || i10 == 36;
    }

    public static boolean l(int i10) {
        return (i10 >= 1 && i10 <= 4) || i10 == 26;
    }

    public static double m(q qVar, int i10, int i11) {
        if (i11 == 4) {
            return qVar.getFloat(i10);
        }
        if (i11 != 8) {
            return -1.0d;
        }
        return qVar.getDouble(i10);
    }

    public static int n(q qVar, int i10, int i11) {
        return (int) o(qVar, i10, i11);
    }

    public static long o(q qVar, int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = qVar.get(i10);
        } else if (i11 == 2) {
            i12 = qVar.getShort(i10);
        } else {
            if (i11 != 4) {
                if (i11 != 8) {
                    return -1L;
                }
                return qVar.getLong(i10);
            }
            i12 = qVar.getInt(i10);
        }
        return i12;
    }

    public static long p(q qVar, int i10, int i11) {
        if (i11 == 1) {
            return C0892j.a(qVar.get(i10));
        }
        if (i11 == 2) {
            return C0892j.c(qVar.getShort(i10));
        }
        if (i11 == 4) {
            return C0892j.b(qVar.getInt(i10));
        }
        if (i11 != 8) {
            return -1L;
        }
        return qVar.getLong(i10);
    }

    public static int q(int i10, int i11) {
        if (i11 == 0) {
            return i10 + 10;
        }
        if (i11 == 2) {
            return i10 + 15;
        }
        if (i11 == 3) {
            return i10 + 18;
        }
        if (i11 != 4) {
            return 0;
        }
        return i10 + 21;
    }

    public static int r(int i10) {
        return i10 - 10;
    }
}
