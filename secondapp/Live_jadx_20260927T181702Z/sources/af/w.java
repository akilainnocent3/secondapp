package af;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import eh.o1;
import eh.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f4994m = "FlacStreamMetadata";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f4995n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final a f5006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Metadata f5007l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f5008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f5009b;

        public a(long[] jArr, long[] jArr2) {
            this.f5008a = jArr;
            this.f5009b = jArr2;
        }
    }

    public w(byte[] bArr, int i10) {
        s0 s0Var = new s0(bArr);
        s0Var.q(i10 * 8);
        this.f4996a = s0Var.h(16);
        this.f4997b = s0Var.h(16);
        this.f4998c = s0Var.h(24);
        this.f4999d = s0Var.h(24);
        int iH = s0Var.h(20);
        this.f5000e = iH;
        this.f5001f = m(iH);
        this.f5002g = s0Var.h(3) + 1;
        int iH2 = s0Var.h(5) + 1;
        this.f5003h = iH2;
        this.f5004i = f(iH2);
        this.f5005j = s0Var.j(36);
        this.f5006k = null;
        this.f5007l = null;
    }

    @Nullable
    public static Metadata a(List<String> list, List<PictureFrame> list2) {
        Metadata metadataC = j0.c(list);
        if (metadataC == null && list2.isEmpty()) {
            return null;
        }
        return new Metadata(list2).b(metadataC);
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
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
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

    public w b(List<PictureFrame> list) {
        return new w(this.f4996a, this.f4997b, this.f4998c, this.f4999d, this.f5000e, this.f5002g, this.f5003h, this.f5005j, this.f5006k, k(new Metadata(list)));
    }

    public w c(@Nullable a aVar) {
        return new w(this.f4996a, this.f4997b, this.f4998c, this.f4999d, this.f5000e, this.f5002g, this.f5003h, this.f5005j, aVar, this.f5007l);
    }

    public w d(List<String> list) {
        return new w(this.f4996a, this.f4997b, this.f4998c, this.f4999d, this.f5000e, this.f5002g, this.f5003h, this.f5005j, this.f5006k, k(j0.c(list)));
    }

    public long e() {
        long j10;
        long j11;
        int i10 = this.f4999d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f4998c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f4996a;
            j10 = ((((i11 != this.f4997b || i11 <= 0) ? 4096L : i11) * ((long) this.f5002g)) * ((long) this.f5003h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int g() {
        return this.f5003h * this.f5000e * this.f5002g;
    }

    public long h() {
        long j10 = this.f5005j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f5000e);
    }

    public n2 i(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = -128;
        int i10 = this.f4999d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new n2.b().g0("audio/flac").Y(i10).J(this.f5002g).h0(this.f5000e).V(Collections.singletonList(bArr)).Z(k(metadata)).G();
    }

    public int j() {
        return this.f4997b * this.f5002g * (this.f5003h / 8);
    }

    @Nullable
    public Metadata k(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f5007l;
        return metadata2 == null ? metadata : metadata2.b(metadata);
    }

    public long l(long j10) {
        return o1.x((j10 * ((long) this.f5000e)) / 1000000, 0L, this.f5005j - 1);
    }

    public w(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i10, i11, i12, i13, i14, i15, i16, j10, (a) null, a(arrayList, arrayList2));
    }

    public w(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @Nullable a aVar, @Nullable Metadata metadata) {
        this.f4996a = i10;
        this.f4997b = i11;
        this.f4998c = i12;
        this.f4999d = i13;
        this.f5000e = i14;
        this.f5001f = m(i14);
        this.f5002g = i15;
        this.f5003h = i16;
        this.f5004i = f(i16);
        this.f5005j = j10;
        this.f5006k = aVar;
        this.f5007l = metadata;
    }
}
