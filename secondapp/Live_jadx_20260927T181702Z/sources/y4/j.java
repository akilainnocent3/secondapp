package y4;

import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import x4.m1;
import x4.u0;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f146110a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f146111b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f146112c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f146113d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f146114e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f146115f = 15;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f146116b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f146117c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f146118d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f146119e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f146120a;

        public b(e eVar, d dVar) throws c {
            int i10 = dVar.f146121a;
            l0.d(i10 == 6 || i10 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f146122b.remaining())];
            dVar.f146122b.asReadOnlyBuffer().get(bArr);
            u0 u0Var = new u0(bArr);
            j.f(eVar.f146123a);
            if (u0Var.g()) {
                this.f146120a = false;
                return;
            }
            int iH = u0Var.h(2);
            boolean zG = u0Var.g();
            j.f(eVar.f146124b);
            if (!zG) {
                this.f146120a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : u0Var.g();
            u0Var.r();
            j.f(!eVar.f146126d);
            if (u0Var.g()) {
                j.f(!eVar.f146127e);
                u0Var.r();
            }
            j.f(eVar.f146125c);
            if (iH != 3) {
                u0Var.r();
            }
            u0Var.s(eVar.f146128f);
            if (iH != 2 && iH != 0 && !zG2) {
                u0Var.s(3);
            }
            this.f146120a = ((iH == 3 || iH == 0) ? 255 : u0Var.h(8)) != 0;
        }

        @Nullable
        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f146120a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends Exception {
        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f146121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f146122b;

        public d(int i10, ByteBuffer byteBuffer) {
            this.f146121a = i10;
            this.f146122b = byteBuffer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f146123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f146124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f146125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f146126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f146127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f146128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f146129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f146130h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f146131i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f146132j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f146133k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f146134l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f146135m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f146136n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f146137o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f146138p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f146139q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final byte f146140r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final byte f146141s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte f146142t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        public e(d dVar) throws c {
            int iH;
            int iH2;
            boolean zG;
            ?? r10;
            l0.d(dVar.f146121a == 1);
            byte[] bArr = new byte[dVar.f146122b.remaining()];
            dVar.f146122b.asReadOnlyBuffer().get(bArr);
            u0 u0Var = new u0(bArr);
            this.f146129g = u0Var.h(3);
            u0Var.r();
            boolean zG2 = u0Var.g();
            this.f146123a = zG2;
            if (zG2) {
                iH2 = u0Var.h(5);
                this.f146124b = false;
                this.f146132j = false;
                r10 = 0;
                iH = 0;
            } else {
                if (u0Var.g()) {
                    b(u0Var);
                    boolean zG3 = u0Var.g();
                    this.f146124b = zG3;
                    if (zG3) {
                        u0Var.s(47);
                    }
                } else {
                    this.f146124b = false;
                }
                this.f146132j = u0Var.g();
                int iH3 = u0Var.h(5);
                int iH4 = 0;
                int i10 = 0;
                boolean z10 = false;
                iH = 0;
                while (i10 <= iH3) {
                    u0Var.s(12);
                    if (i10 == 0) {
                        iH4 = u0Var.h(5);
                        if (iH4 > 7) {
                            zG = z10;
                            zG = u0Var.g();
                        }
                    } else if (u0Var.h(5) > 7) {
                        zG = z10;
                        u0Var.r();
                        zG = z10;
                    }
                    zG = z10;
                    zG = z10;
                    if (this.f146124b) {
                        u0Var.r();
                    }
                    if (this.f146132j && u0Var.g()) {
                        if (i10 == 0) {
                            iH = u0Var.h(4);
                        } else {
                            u0Var.s(4);
                        }
                    }
                    i10++;
                    z10 = zG;
                }
                iH2 = iH4;
                r10 = z10;
            }
            int iH5 = u0Var.h(4);
            int iH6 = u0Var.h(4);
            u0Var.s(iH5 + 1);
            u0Var.s(iH6 + 1);
            if (this.f146123a) {
                this.f146125c = false;
            } else {
                this.f146125c = u0Var.g();
            }
            if (this.f146125c) {
                u0Var.s(4);
                u0Var.s(3);
            }
            u0Var.s(3);
            if (this.f146123a) {
                this.f146127e = true;
                this.f146126d = true;
                this.f146128f = 0;
            } else {
                u0Var.s(4);
                boolean zG4 = u0Var.g();
                if (zG4) {
                    u0Var.s(2);
                }
                if (u0Var.g()) {
                    this.f146126d = true;
                } else {
                    this.f146126d = u0Var.g();
                }
                if (!this.f146126d || u0Var.g()) {
                    this.f146127e = true;
                } else {
                    this.f146127e = u0Var.g();
                }
                if (zG4) {
                    this.f146128f = u0Var.h(3) + 1;
                } else {
                    this.f146128f = 0;
                }
            }
            this.f146130h = iH2;
            this.f146131i = r10;
            this.f146133k = iH;
            u0Var.s(3);
            boolean zG5 = u0Var.g();
            this.f146134l = zG5;
            if (this.f146129g == 2 && zG5) {
                this.f146135m = u0Var.g();
            } else {
                this.f146135m = false;
            }
            if (this.f146129g != 1) {
                this.f146136n = u0Var.g();
            } else {
                this.f146136n = false;
            }
            if (u0Var.g()) {
                this.f146140r = (byte) u0Var.h(8);
                this.f146141s = (byte) u0Var.h(8);
                this.f146142t = (byte) u0Var.h(8);
            } else {
                this.f146140r = (byte) 0;
                this.f146141s = (byte) 0;
                this.f146142t = (byte) 0;
            }
            if (this.f146136n) {
                u0Var.r();
                this.f146137o = false;
                this.f146138p = false;
                this.f146139q = 0;
            } else if (this.f146140r == 1 && this.f146141s == 13 && this.f146142t == 0) {
                this.f146137o = false;
                this.f146138p = false;
                this.f146139q = 0;
            } else {
                u0Var.r();
                int i11 = this.f146129g;
                if (i11 == 0) {
                    this.f146137o = true;
                    this.f146138p = true;
                } else if (i11 == 1) {
                    this.f146137o = false;
                    this.f146138p = false;
                } else if (this.f146135m) {
                    boolean zG6 = u0Var.g();
                    this.f146137o = zG6;
                    if (zG6) {
                        this.f146138p = u0Var.g();
                    } else {
                        this.f146138p = false;
                    }
                } else {
                    this.f146137o = true;
                    this.f146138p = false;
                }
                if (this.f146137o && this.f146138p) {
                    this.f146139q = u0Var.h(2);
                } else {
                    this.f146139q = 0;
                }
            }
            u0Var.r();
        }

        @Nullable
        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        public static void b(u0 u0Var) {
            u0Var.s(64);
            if (u0Var.g()) {
                j.d(u0Var);
            }
        }
    }

    public static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & 127) << (i11 * 7);
            if ((b10 & 128) == 0) {
                return i10;
            }
        }
        return i10;
    }

    public static void d(u0 u0Var) {
        int i10 = 0;
        while (!u0Var.g()) {
            i10++;
        }
        if (i10 < 32) {
            u0Var.s(i10);
        }
    }

    public static List<d> e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b10 = byteBufferAsReadOnlyBuffer.get();
                int i10 = (b10 >> 3) & 15;
                if (((b10 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iC = ((b10 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iC > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
                arrayList.add(new d(i10, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static void f(boolean z10) throws c {
        if (z10) {
            throw new c();
        }
    }
}
