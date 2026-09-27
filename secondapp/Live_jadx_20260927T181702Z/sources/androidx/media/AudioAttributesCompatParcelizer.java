package androidx.media;

import k.y0;
import w9.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e eVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f13554a = (AudioAttributesImpl) eVar.h0(audioAttributesCompat.f13554a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e eVar) {
        eVar.j0(false, false);
        eVar.m1(audioAttributesCompat.f13554a, 1);
    }
}
