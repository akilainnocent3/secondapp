package f6;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class e0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f83443m = "FlacStreamMetadata";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f83444n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f83449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f83450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f83451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f83452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f83453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f83454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final a f83455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final u4.k1 f83456l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f83457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f83458b;

        public a(long[] jArr, long[] jArr2) {
            this.f83457a = jArr;
            this.f83458b = jArr2;
        }
    }

    public e0(byte[] bArr, int i10) {
        x4.u0 u0Var = new x4.u0(bArr);
        u0Var.q(i10 * 8);
        this.f83445a = u0Var.h(16);
        this.f83446b = u0Var.h(16);
        this.f83447c = u0Var.h(24);
        this.f83448d = u0Var.h(24);
        int iH = u0Var.h(20);
        this.f83449e = iH;
        this.f83450f = m(iH);
        this.f83451g = u0Var.h(3) + 1;
        int iH2 = u0Var.h(5) + 1;
        this.f83452h = iH2;
        this.f83453i = f(iH2);
        this.f83454j = u0Var.j(36);
        this.f83455k = null;
        this.f83456l = null;
    }

    @Nullable
    public static u4.k1 a(List<String> list, List<r6.a> list2) {
        u4.k1 k1VarD = i1.d(list);
        if (k1VarD == null && list2.isEmpty()) {
            return null;
        }
        return new u4.k1(list2).b(k1VarD);
    }

    public static int f(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int m(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public e0 b(List<r6.a> list) {
        return new e0(this.f83445a, this.f83446b, this.f83447c, this.f83448d, this.f83449e, this.f83451g, this.f83452h, this.f83454j, this.f83455k, k(new u4.k1(list)));
    }

    public e0 c(@Nullable a aVar) {
        return new e0(this.f83445a, this.f83446b, this.f83447c, this.f83448d, this.f83449e, this.f83451g, this.f83452h, this.f83454j, aVar, this.f83456l);
    }

    public e0 d(List<String> list) {
        return new e0(this.f83445a, this.f83446b, this.f83447c, this.f83448d, this.f83449e, this.f83451g, this.f83452h, this.f83454j, this.f83455k, k(i1.d(list)));
    }

    public long e() {
        long j10;
        long j11;
        int i10 = this.f83448d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f83447c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f83445a;
            j10 = ((((i11 != this.f83446b || i11 <= 0) ? 4096L : i11) * ((long) this.f83451g)) * ((long) this.f83452h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int g() {
        return this.f83452h * this.f83449e * this.f83451g;
    }

    public long h() {
        long j10 = this.f83454j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f83449e);
    }

    public androidx.media3.common.a i(byte[] bArr, @Nullable u4.k1 k1Var) {
        bArr[4] = -128;
        int i10 = this.f83448d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new androidx.media3.common.a.b().A0("audio/flac").p0(i10).U(this.f83451g).B0(this.f83449e).t0(b2.H0(this.f83452h)).l0(Collections.singletonList(bArr)).s0(k(k1Var)).Q();
    }

    public int j() {
        return this.f83446b * this.f83451g * (this.f83452h / 8);
    }

    @Nullable
    public u4.k1 k(@Nullable u4.k1 k1Var) {
        u4.k1 k1Var2 = this.f83456l;
        return k1Var2 == null ? k1Var : k1Var2.b(k1Var);
    }

    public long l(long j10) {
        return b2.y((j10 * ((long) this.f83449e)) / 1000000, 0L, this.f83454j - 1);
    }

    public e0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<r6.a> arrayList2) {
        this(i10, i11, i12, i13, i14, i15, i16, j10, (a) null, a(arrayList, arrayList2));
    }

    @k.h1
    public e0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @Nullable a aVar, @Nullable u4.k1 k1Var) {
        this.f83445a = i10;
        this.f83446b = i11;
        this.f83447c = i12;
        this.f83448d = i13;
        this.f83449e = i14;
        this.f83450f = m(i14);
        this.f83451g = i15;
        this.f83452h = i16;
        this.f83453i = f(i16);
        this.f83454j = j10;
        this.f83455k = aVar;
        this.f83456l = k1Var;
    }
}
