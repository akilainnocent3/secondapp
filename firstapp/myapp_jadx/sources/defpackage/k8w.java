package defpackage;

import com.twilio.voice.AudioFormat;

/* JADX INFO: loaded from: classes.dex */
public final class k8w {
    public static final String[] a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = {AudioFormat.AUDIO_SAMPLE_RATE_44100, AudioFormat.AUDIO_SAMPLE_RATE_48000, AudioFormat.AUDIO_SAMPLE_RATE_32000};
    public static final int[] c = {AudioFormat.AUDIO_SAMPLE_RATE_32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {AudioFormat.AUDIO_SAMPLE_RATE_32000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = {AudioFormat.AUDIO_SAMPLE_RATE_32000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {AudioFormat.AUDIO_SAMPLE_RATE_32000, 40000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = {AudioFormat.AUDIO_SAMPLE_RATE_8000, AudioFormat.AUDIO_SAMPLE_RATE_16000, AudioFormat.AUDIO_SAMPLE_RATE_24000, AudioFormat.AUDIO_SAMPLE_RATE_32000, 40000, AudioFormat.AUDIO_SAMPLE_RATE_48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {
        public int a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public final boolean a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.a = i2;
            this.b = k8w.a[3 - i3];
            int i6 = k8w.b[i5];
            this.d = i6;
            if (i2 == 2) {
                i6 /= 2;
                this.d = i6;
            } else if (i2 == 0) {
                i6 /= 4;
                this.d = i6;
            }
            int i7 = (i >>> 9) & 1;
            int i8 = 1152;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        d580.a();
                        return false;
                    }
                    i8 = 384;
                }
            } else if (i2 != 3) {
                i8 = 576;
            }
            this.g = i8;
            if (i3 == 3) {
                int i9 = i2 == 3 ? k8w.c[i4 - 1] : k8w.d[i4 - 1];
                this.f = i9;
                this.c = (((i9 * 12) / i6) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i10 = i3 == 2 ? k8w.e[i4 - 1] : k8w.f[i4 - 1];
                    this.f = i10;
                    this.c = s15.a(i10, 144, i6, i7);
                } else {
                    int i11 = k8w.g[i4 - 1];
                    this.f = i11;
                    this.c = s15.a(i3 == 1 ? 72 : 144, i11, i6, i7);
                }
            }
            this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? e[i4 - 1] : f[i4 - 1];
        } else {
            i6 = g[i4 - 1];
        }
        if (i2 == 3) {
            return s15.a(i6, 144, i7, i8);
        }
        return s15.a(i3 == 1 ? 72 : 144, i6, i7, i8);
    }
}
