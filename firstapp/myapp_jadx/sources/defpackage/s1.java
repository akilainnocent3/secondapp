package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.twilio.voice.AudioFormat;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {
    public static final int[] a = {96000, 88200, 64000, AudioFormat.AUDIO_SAMPLE_RATE_48000, AudioFormat.AUDIO_SAMPLE_RATE_44100, AudioFormat.AUDIO_SAMPLE_RATE_32000, AudioFormat.AUDIO_SAMPLE_RATE_24000, 22050, AudioFormat.AUDIO_SAMPLE_RATE_16000, 12000, 11025, AudioFormat.AUDIO_SAMPLE_RATE_8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static int a(msz mszVar) throws ssz {
        int iG = mszVar.g(4);
        if (iG == 15) {
            if (mszVar.b() >= 24) {
                return mszVar.g(24);
            }
            throw ssz.a(null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return a[iG];
        }
        throw ssz.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static a b(msz mszVar, boolean z) throws ssz {
        int iG = mszVar.g(5);
        if (iG == 31) {
            iG = mszVar.g(6) + 32;
        }
        int iA = a(mszVar);
        int iG2 = mszVar.g(4);
        String strA = hce0.a(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iA = a(mszVar);
            int iG3 = mszVar.g(5);
            if (iG3 == 31) {
                iG3 = mszVar.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = mszVar.g(4);
            }
        }
        if (z) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        break;
                    default:
                        throw ssz.c("Unsupported audio object type: " + iG);
                }
            }
            if (mszVar.f()) {
                cft.g("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (mszVar.f()) {
                mszVar.o(14);
            }
            boolean zF = mszVar.f();
            if (iG2 == 0) {
                bl0.a();
                return null;
            }
            if (iG == 6 || iG == 20) {
                mszVar.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    mszVar.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    mszVar.o(3);
                }
                mszVar.o(1);
            }
            switch (iG) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    int iG4 = mszVar.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw ssz.c("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i = b[iG2];
        if (i != -1) {
            return new a(iA, i, strA);
        }
        throw ssz.a(null, null);
    }
}
