package gf;

import af.n;
import java.io.IOException;
import java.util.ArrayDeque;
import re.d4;
import ux.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86436h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86437i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86438j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f86439k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f86440l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f86441m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f86442n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f86443o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f86444a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f86445b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f86446c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gf.b f86447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f86450g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f86452b;

        public b(int i10, long j10) {
            this.f86451a = i10;
            this.f86452b = j10;
        }
    }

    public static String f(n nVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        nVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // gf.c
    public boolean a(n nVar) throws IOException {
        eh.a.k(this.f86447d);
        while (true) {
            b bVarPeek = this.f86445b.peek();
            if (bVarPeek != null && nVar.getPosition() >= bVarPeek.f86452b) {
                this.f86447d.endMasterElement(this.f86445b.pop().f86451a);
                return true;
            }
            if (this.f86448e == 0) {
                long jD = this.f86446c.d(nVar, true, false, 4);
                if (jD == -2) {
                    jD = c(nVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f86449f = (int) jD;
                this.f86448e = 1;
            }
            if (this.f86448e == 1) {
                this.f86450g = this.f86446c.d(nVar, false, true, 8);
                this.f86448e = 2;
            }
            int elementType = this.f86447d.getElementType(this.f86449f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = nVar.getPosition();
                    this.f86445b.push(new b(this.f86449f, this.f86450g + position));
                    this.f86447d.startMasterElement(this.f86449f, position, this.f86450g);
                    this.f86448e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f86450g;
                    if (j10 <= 8) {
                        this.f86447d.integerElement(this.f86449f, e(nVar, (int) j10));
                        this.f86448e = 0;
                        return true;
                    }
                    throw d4.a("Invalid integer size: " + this.f86450g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f86450g;
                    if (j11 <= 2147483647L) {
                        this.f86447d.stringElement(this.f86449f, f(nVar, (int) j11));
                        this.f86448e = 0;
                        return true;
                    }
                    throw d4.a("String element size: " + this.f86450g, null);
                }
                if (elementType == 4) {
                    this.f86447d.a(this.f86449f, (int) this.f86450g, nVar);
                    this.f86448e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw d4.a("Invalid element type " + elementType, null);
                }
                long j12 = this.f86450g;
                if (j12 == 4 || j12 == 8) {
                    this.f86447d.floatElement(this.f86449f, d(nVar, (int) j12));
                    this.f86448e = 0;
                    return true;
                }
                throw d4.a("Invalid float size: " + this.f86450g, null);
            }
            nVar.skipFully((int) this.f86450g);
            this.f86448e = 0;
        }
    }

    @Override // gf.c
    public void b(gf.b bVar) {
        this.f86447d = bVar;
    }

    @m({"processor"})
    public final long c(n nVar) throws IOException {
        nVar.resetPeekPosition();
        while (true) {
            nVar.peekFully(this.f86444a, 0, 4);
            int iC = g.c(this.f86444a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f86444a, iC, false);
                if (this.f86447d.isLevel1Element(iA)) {
                    nVar.skipFully(iC);
                    return iA;
                }
            }
            nVar.skipFully(1);
        }
    }

    public final double d(n nVar, int i10) throws IOException {
        long jE = e(nVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    public final long e(n nVar, int i10) throws IOException {
        nVar.readFully(this.f86444a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f86444a[i11] & 255));
        }
        return j10;
    }

    @Override // gf.c
    public void reset() {
        this.f86448e = 0;
        this.f86445b.clear();
        this.f86446c.e();
    }
}
