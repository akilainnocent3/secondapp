package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
@y0({y0.a.LIBRARY})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public AudioAttributes f13560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public int f13561b;

    @y0({y0.a.LIBRARY})
    public AudioAttributesImplApi21() {
        this.f13561b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    @Nullable
    public Object b() {
        return this.f13560a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        return this.f13560a.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        int i10 = this.f13561b;
        return i10 != -1 ? i10 : AudioAttributesCompat.i(false, f(), g());
    }

    @Override // androidx.media.AudioAttributesImpl
    public int e() {
        return this.f13561b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f13560a.equals(((AudioAttributesImplApi21) obj).f13560a);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int f() {
        return this.f13560a.getFlags();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int g() {
        return this.f13560a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int h() {
        return AudioAttributesCompat.i(true, f(), g());
    }

    public int hashCode() {
        return this.f13560a.hashCode();
    }

    @NonNull
    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f13560a;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f13562a;

        public a() {
            this.f13562a = new AudioAttributes.Builder();
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f13562a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a d(int i10) {
            this.f13562a.setContentType(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f13562a.setFlags(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f13562a.setLegacyStreamType(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            if (i10 == 16) {
                i10 = 12;
            }
            this.f13562a.setUsage(i10);
            return this;
        }

        public a(Object obj) {
            this.f13562a = new AudioAttributes.Builder((AudioAttributes) obj);
        }
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f13560a = audioAttributes;
        this.f13561b = i10;
    }
}
