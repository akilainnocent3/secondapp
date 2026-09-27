package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(26)
@y0({y0.a.LIBRARY})
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(26)
    public static class a extends AudioAttributesImplApi21.a {
        public a() {
        }

        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f13562a.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.a
        @NonNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f13562a.setUsage(i10);
            return this;
        }

        public a(Object obj) {
            super(obj);
        }
    }

    @y0({y0.a.LIBRARY})
    public AudioAttributesImplApi26() {
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int h() {
        return this.f13560a.getVolumeControlStream();
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
