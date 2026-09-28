package defpackage;

import com.twilio.voice.AudioFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tff {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, AudioFormat.AUDIO_SAMPLE_RATE_8000, AudioFormat.AUDIO_SAMPLE_RATE_16000, AudioFormat.AUDIO_SAMPLE_RATE_32000, -1, -1, 11025, 22050, AudioFormat.AUDIO_SAMPLE_RATE_44100, -1, -1, 12000, AudioFormat.AUDIO_SAMPLE_RATE_24000, AudioFormat.AUDIO_SAMPLE_RATE_48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {AudioFormat.AUDIO_SAMPLE_RATE_8000, AudioFormat.AUDIO_SAMPLE_RATE_16000, AudioFormat.AUDIO_SAMPLE_RATE_32000, 64000, 128000, 22050, AudioFormat.AUDIO_SAMPLE_RATE_44100, 88200, 176400, 352800, 12000, AudioFormat.AUDIO_SAMPLE_RATE_24000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static final class a {
        public final String a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3, long j, String str) {
            this.a = str;
            this.c = i;
            this.b = i2;
        }
    }

    public static msz a(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new msz(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        msz mszVar = new msz(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            msz mszVar2 = new msz(bArrCopyOf.length, bArrCopyOf);
            while (mszVar2.b() >= 16) {
                mszVar2.o(2);
                int iG = mszVar2.g(14) & 16383;
                int iMin = Math.min(8 - mszVar.c, 14);
                int i4 = mszVar.c;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = mszVar.a;
                int i6 = mszVar.b;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - iMin;
                bArr3[i6] = (byte) (b5 | ((iG >>> i7) << i5));
                int i8 = i6 + 1;
                while (true) {
                    bArr2 = mszVar.a;
                    if (i7 > 8) {
                        bArr2[i8] = (byte) (iG >>> (i7 - 8));
                        i7 -= 8;
                        i8++;
                    }
                }
                int i9 = 8 - i7;
                byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b6;
                bArr2[i8] = (byte) (((iG & ((1 << i7) - 1)) << i9) | b6);
                mszVar.o(14);
                mszVar.a();
            }
        }
        mszVar.k(bArrCopyOf.length, bArrCopyOf);
        return mszVar;
    }

    public static int b(msz mszVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && mszVar.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return mszVar.g(iArr[i2]) + i4;
    }
}
