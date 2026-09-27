package jg;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import eh.o1;
import eh.t0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100347l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100348m = 65507;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f100349n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f100350o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f100351p = 65535;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f100352q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f100353r = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f100354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f100357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f100358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f100359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f100360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f100361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f100362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f100363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f100364k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f100365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f100366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f100367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f100368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f100369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f100370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f100371g = g.f100353r;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f100372h = g.f100353r;

        public g i() {
            return new g(this);
        }

        @qj.a
        public b j(byte[] bArr) {
            eh.a.g(bArr);
            this.f100371g = bArr;
            return this;
        }

        @qj.a
        public b k(boolean z10) {
            this.f100366b = z10;
            return this;
        }

        @qj.a
        public b l(boolean z10) {
            this.f100365a = z10;
            return this;
        }

        @qj.a
        public b m(byte[] bArr) {
            eh.a.g(bArr);
            this.f100372h = bArr;
            return this;
        }

        @qj.a
        public b n(byte b10) {
            this.f100367c = b10;
            return this;
        }

        @qj.a
        public b o(int i10) {
            eh.a.a(i10 >= 0 && i10 <= 65535);
            this.f100368d = i10 & 65535;
            return this;
        }

        @qj.a
        public b p(int i10) {
            this.f100370f = i10;
            return this;
        }

        @qj.a
        public b q(long j10) {
            this.f100369e = j10;
            return this;
        }
    }

    public static int b(int i10) {
        return jj.f.r(i10 + 1, 65536);
    }

    public static int c(int i10) {
        return jj.f.r(i10 - 1, 65536);
    }

    @Nullable
    public static g d(t0 t0Var) {
        byte[] bArr;
        if (t0Var.a() < 12) {
            return null;
        }
        int iL = t0Var.L();
        byte b10 = (byte) (iL >> 6);
        boolean z10 = ((iL >> 5) & 1) == 1;
        byte b11 = (byte) (iL & 15);
        if (b10 != 2) {
            return null;
        }
        int iL2 = t0Var.L();
        boolean z11 = ((iL2 >> 7) & 1) == 1;
        byte b12 = (byte) (iL2 & 127);
        int iR = t0Var.R();
        long jN = t0Var.N();
        int iS = t0Var.s();
        if (b11 > 0) {
            bArr = new byte[b11 * 4];
            for (int i10 = 0; i10 < b11; i10++) {
                t0Var.n(bArr, i10 * 4, 4);
            }
        } else {
            bArr = f100353r;
        }
        byte[] bArr2 = new byte[t0Var.a()];
        t0Var.n(bArr2, 0, t0Var.a());
        return new b().l(z10).k(z11).n(b12).o(iR).q(jN).p(iS).j(bArr).m(bArr2).i();
    }

    @Nullable
    public static g e(byte[] bArr, int i10) {
        return d(new t0(bArr, i10));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f100359f == gVar.f100359f && this.f100360g == gVar.f100360g && this.f100358e == gVar.f100358e && this.f100361h == gVar.f100361h && this.f100362i == gVar.f100362i) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] bArr, int i10, int i11) {
        int length = (this.f100357d * 4) + 12 + this.f100364k.length;
        if (i11 < length || bArr.length - i10 < length) {
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, i11);
        byte b10 = (byte) (((this.f100355b ? 1 : 0) << 5) | 128 | ((this.f100356c ? 1 : 0) << 4) | (this.f100357d & zi.c.f161639q));
        byteBufferWrap.put(b10).put((byte) (((this.f100358e ? 1 : 0) << 7) | (this.f100359f & 127))).putShort((short) this.f100360g).putInt((int) this.f100361h).putInt(this.f100362i).put(this.f100363j).put(this.f100364k);
        return length;
    }

    public int hashCode() {
        int i10 = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f100359f) * 31) + this.f100360g) * 31) + (this.f100358e ? 1 : 0)) * 31;
        long j10 = this.f100361h;
        return ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f100362i;
    }

    public String toString() {
        return o1.M("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f100359f), Integer.valueOf(this.f100360g), Long.valueOf(this.f100361h), Integer.valueOf(this.f100362i), Boolean.valueOf(this.f100358e));
    }

    public g(b bVar) {
        this.f100354a = (byte) 2;
        this.f100355b = bVar.f100365a;
        this.f100356c = false;
        this.f100358e = bVar.f100366b;
        this.f100359f = bVar.f100367c;
        this.f100360g = bVar.f100368d;
        this.f100361h = bVar.f100369e;
        this.f100362i = bVar.f100370f;
        byte[] bArr = bVar.f100371g;
        this.f100363j = bArr;
        this.f100357d = (byte) (bArr.length / 4);
        this.f100364k = bVar.f100372h;
    }
}
