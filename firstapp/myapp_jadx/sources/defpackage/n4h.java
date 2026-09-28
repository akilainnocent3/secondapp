package defpackage;

import com.twilio.voice.AudioFormat;

/* JADX INFO: loaded from: classes.dex */
public final class n4h implements otk0 {
    public static final /* synthetic */ n4h a = new n4h();

    public static void a(String str, boolean z) throws ssz {
        if (!z) {
            throw ssz.a(null, str);
        }
    }

    public static int b(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return AudioFormat.AUDIO_SAMPLE_RATE_16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return AudioFormat.AUDIO_SAMPLE_RATE_8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    @Override // defpackage.otk0
    public Object zza() {
        return new Boolean(((ipl0) hpl0.b.a.a).zza());
    }
}
