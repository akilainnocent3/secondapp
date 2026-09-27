package x6;

import f6.v;
import java.io.IOException;
import java.util.ArrayDeque;
import u4.p1;
import ux.m;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f144537h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f144538i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f144539j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f144540k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f144541l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f144542m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f144543n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f144544o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f144545a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f144546b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f144547c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x6.b f144548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f144549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f144550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f144551g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f144552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f144553b;

        public b(int i10, long j10) {
            this.f144552a = i10;
            this.f144553b = j10;
        }
    }

    public static String f(v vVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        vVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // x6.c
    public boolean a(v vVar) throws IOException {
        l0.E(this.f144548d);
        while (true) {
            b bVarPeek = this.f144546b.peek();
            if (bVarPeek != null && vVar.getPosition() >= bVarPeek.f144553b) {
                this.f144548d.endMasterElement(this.f144546b.pop().f144552a);
                return true;
            }
            if (this.f144549e == 0) {
                long jD = this.f144547c.d(vVar, true, false, 4);
                if (jD == -2) {
                    jD = c(vVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f144550f = (int) jD;
                this.f144549e = 1;
            }
            if (this.f144549e == 1) {
                this.f144551g = this.f144547c.d(vVar, false, true, 8);
                this.f144549e = 2;
            }
            int elementType = this.f144548d.getElementType(this.f144550f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = vVar.getPosition();
                    this.f144546b.push(new b(this.f144550f, this.f144551g + position));
                    this.f144548d.startMasterElement(this.f144550f, position, this.f144551g);
                    this.f144549e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f144551g;
                    if (j10 <= 8) {
                        this.f144548d.integerElement(this.f144550f, e(vVar, (int) j10));
                        this.f144549e = 0;
                        return true;
                    }
                    throw p1.a("Invalid integer size: " + this.f144551g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f144551g;
                    if (j11 <= 2147483647L) {
                        this.f144548d.stringElement(this.f144550f, f(vVar, (int) j11));
                        this.f144549e = 0;
                        return true;
                    }
                    throw p1.a("String element size: " + this.f144551g, null);
                }
                if (elementType == 4) {
                    this.f144548d.a(this.f144550f, (int) this.f144551g, vVar);
                    this.f144549e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw p1.a("Invalid element type " + elementType, null);
                }
                long j12 = this.f144551g;
                if (j12 == 4 || j12 == 8) {
                    this.f144548d.floatElement(this.f144550f, d(vVar, (int) j12));
                    this.f144549e = 0;
                    return true;
                }
                throw p1.a("Invalid float size: " + this.f144551g, null);
            }
            vVar.skipFully((int) this.f144551g);
            this.f144549e = 0;
        }
    }

    @Override // x6.c
    public void b(x6.b bVar) {
        this.f144548d = bVar;
    }

    @m({"processor"})
    public final long c(v vVar) throws IOException {
        vVar.resetPeekPosition();
        while (true) {
            vVar.peekFully(this.f144545a, 0, 4);
            int iC = h.c(this.f144545a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) h.a(this.f144545a, iC, false);
                if (this.f144548d.isLevel1Element(iA)) {
                    vVar.skipFully(iC);
                    return iA;
                }
            }
            vVar.skipFully(1);
        }
    }

    public final double d(v vVar, int i10) throws IOException {
        long jE = e(vVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    public final long e(v vVar, int i10) throws IOException {
        vVar.readFully(this.f144545a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f144545a[i11] & 255));
        }
        return j10;
    }

    @Override // x6.c
    public void reset() {
        this.f144549e = 0;
        this.f144546b.clear();
        this.f144547c.e();
    }
}
