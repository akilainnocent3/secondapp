package androidx.media;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public int f13563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public int f13564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public int f13565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public int f13566d;

    @y0({y0.a.LIBRARY})
    public AudioAttributesImplBase() {
        this.f13563a = 0;
        this.f13564b = 0;
        this.f13565c = 0;
        this.f13566d = -1;
    }

    public static int a(int i10) {
        switch (i10) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    @Nullable
    public Object b() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        return this.f13564b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        int i10 = this.f13566d;
        return i10 != -1 ? i10 : AudioAttributesCompat.i(false, this.f13565c, this.f13563a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int e() {
        return this.f13566d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f13564b == audioAttributesImplBase.c() && this.f13565c == audioAttributesImplBase.f() && this.f13563a == audioAttributesImplBase.g() && this.f13566d == audioAttributesImplBase.f13566d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int f() {
        int i10 = this.f13565c;
        int iD = d();
        if (iD == 6) {
            i10 |= 4;
        } else if (iD == 7) {
            i10 |= 1;
        }
        return i10 & AudioAttributesCompat.O;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int g() {
        return this.f13563a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int h() {
        return AudioAttributesCompat.i(true, this.f13565c, this.f13563a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13564b), Integer.valueOf(this.f13565c), Integer.valueOf(this.f13563a), Integer.valueOf(this.f13566d)});
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f13566d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f13566d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.k(this.f13563a));
        sb2.append(" content=");
        sb2.append(this.f13564b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f13565c).toUpperCase());
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13570d;

        public a() {
            this.f13567a = 0;
            this.f13568b = 0;
            this.f13569c = 0;
            this.f13570d = -1;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f13568b, this.f13569c, this.f13567a, this.f13570d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a d(int i10) {
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                this.f13568b = i10;
                return this;
            }
            this.f13568b = 0;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f13569c = (i10 & 1023) | this.f13569c;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final a g(int i10) {
            switch (i10) {
                case 0:
                    this.f13568b = 1;
                    break;
                case 1:
                    this.f13568b = 4;
                    break;
                case 2:
                    this.f13568b = 4;
                    break;
                case 3:
                    this.f13568b = 2;
                    break;
                case 4:
                    this.f13568b = 4;
                    break;
                case 5:
                    this.f13568b = 4;
                    break;
                case 6:
                    this.f13568b = 1;
                    this.f13569c |= 4;
                    break;
                case 7:
                    this.f13569c = 1 | this.f13569c;
                    this.f13568b = 4;
                    break;
                case 8:
                    this.f13568b = 4;
                    break;
                case 9:
                    this.f13568b = 4;
                    break;
                case 10:
                    this.f13568b = 1;
                    break;
                default:
                    Log.e(AudioAttributesCompat.f13529b, "Invalid stream type " + i10 + " for AudioAttributesCompat");
                    break;
            }
            this.f13567a = AudioAttributesImplBase.a(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            if (i10 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f13570d = i10;
            return g(i10);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            switch (i10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f13567a = i10;
                    break;
                case 16:
                    this.f13567a = 12;
                    break;
                default:
                    this.f13567a = 0;
                    break;
            }
            return this;
        }

        public a(AudioAttributesCompat audioAttributesCompat) {
            this.f13567a = 0;
            this.f13568b = 0;
            this.f13569c = 0;
            this.f13570d = -1;
            this.f13567a = audioAttributesCompat.g();
            this.f13568b = audioAttributesCompat.c();
            this.f13569c = audioAttributesCompat.f();
            this.f13570d = audioAttributesCompat.e();
        }
    }

    public AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f13564b = i10;
        this.f13565c = i11;
        this.f13563a = i12;
        this.f13566d = i13;
    }
}
