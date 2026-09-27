package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;
import w9.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements h {
    public static final SparseIntArray A;
    public static boolean B = false;
    public static final int[] C;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 4;
    public static final int G = 8;
    public static final int H = 16;
    public static final int I = 32;
    public static final int J = 64;
    public static final int K = 128;
    public static final int L = 256;
    public static final int M = 512;
    public static final int N = 1023;
    public static final int O = 273;
    public static final int P = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f13529b = "AudioAttributesCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13530c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13531d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13532e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13533f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13534g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f13535h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f13536i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13537j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f13538k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f13539l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f13540m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13541n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f13542o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f13543p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f13544q = 9;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f13545r = 10;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f13546s = 11;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f13547t = 12;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f13548u = 13;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f13549v = 14;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f13550w = 15;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f13551x = 16;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f13552y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f13553z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public AudioAttributesImpl f13554a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f13555a = 6;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f13556b = 7;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f13557c = 9;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f13558d = 10;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        C = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    @y0({y0.a.LIBRARY})
    public AudioAttributesCompat() {
    }

    @y0({y0.a.LIBRARY})
    public static void a(boolean z10) {
        B = z10;
    }

    public static int i(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
    }

    public static String k(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @Nullable
    public static AudioAttributesCompat l(@NonNull Object obj) {
        if (B) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 26 ? new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj)) : new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
    }

    public int c() {
        return this.f13554a.c();
    }

    public int d() {
        return this.f13554a.d();
    }

    public int e() {
        return this.f13554a.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f13554a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f13554a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f13554a);
    }

    public int f() {
        return this.f13554a.f();
    }

    public int g() {
        return this.f13554a.g();
    }

    public int h() {
        return this.f13554a.h();
    }

    public int hashCode() {
        return this.f13554a.hashCode();
    }

    @Nullable
    public Object j() {
        return this.f13554a.b();
    }

    public String toString() {
        return this.f13554a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f13554a = audioAttributesImpl;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributesImpl.a f13559a;

        public d() {
            if (AudioAttributesCompat.B) {
                this.f13559a = new AudioAttributesImplBase.a();
            } else if (Build.VERSION.SDK_INT >= 26) {
                this.f13559a = new AudioAttributesImplApi26.a();
            } else {
                this.f13559a = new AudioAttributesImplApi21.a();
            }
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f13559a.build());
        }

        public d b(int i10) {
            this.f13559a.d(i10);
            return this;
        }

        public d c(int i10) {
            this.f13559a.a(i10);
            return this;
        }

        public d d(int i10) {
            this.f13559a.c(i10);
            return this;
        }

        public d e(int i10) {
            this.f13559a.b(i10);
            return this;
        }

        public d(AudioAttributesCompat audioAttributesCompat) {
            if (AudioAttributesCompat.B) {
                this.f13559a = new AudioAttributesImplBase.a(audioAttributesCompat);
            } else if (Build.VERSION.SDK_INT >= 26) {
                this.f13559a = new AudioAttributesImplApi26.a(audioAttributesCompat.j());
            } else {
                this.f13559a = new AudioAttributesImplApi21.a(audioAttributesCompat.j());
            }
        }
    }
}
