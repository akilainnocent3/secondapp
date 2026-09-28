package defpackage;

import com.twilio.voice.AudioFormat;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class huh {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    public final uov l;

    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public huh(int i, byte[] bArr) {
        msz mszVar = new msz(bArr.length, bArr);
        mszVar.m(i * 8);
        this.a = mszVar.g(16);
        this.b = mszVar.g(16);
        this.c = mszVar.g(24);
        this.d = mszVar.g(24);
        int iG = mszVar.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = mszVar.g(3) + 1;
        int iG2 = mszVar.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = mszVar.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case AudioFormat.AUDIO_SAMPLE_RATE_8000 /* 8000 */:
                return 4;
            case AudioFormat.AUDIO_SAMPLE_RATE_16000 /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case AudioFormat.AUDIO_SAMPLE_RATE_24000 /* 24000 */:
                return 7;
            case AudioFormat.AUDIO_SAMPLE_RATE_32000 /* 32000 */:
                return 8;
            case AudioFormat.AUDIO_SAMPLE_RATE_44100 /* 44100 */:
                return 9;
            case AudioFormat.AUDIO_SAMPLE_RATE_48000 /* 48000 */:
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

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final androidx.media3.common.a c(byte[] bArr, uov uovVar) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        uov uovVar2 = this.l;
        if (uovVar2 != null) {
            uovVar = uovVar2.b(uovVar);
        }
        androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
        c0062a.m = gqv.m("audio/flac");
        c0062a.n = i;
        c0062a.E = this.g;
        c0062a.F = this.e;
        String str = jrh0.a;
        c0062a.G = jrh0.A(this.h, ByteOrder.LITTLE_ENDIAN);
        c0062a.p = Collections.singletonList(bArr);
        c0062a.k = uovVar;
        return new androidx.media3.common.a(c0062a);
    }

    public huh(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, uov uovVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = uovVar;
    }
}
