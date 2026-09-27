package androidx.media;

import k.y0;
import w9.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(e eVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f13563a = eVar.M(audioAttributesImplBase.f13563a, 1);
        audioAttributesImplBase.f13564b = eVar.M(audioAttributesImplBase.f13564b, 2);
        audioAttributesImplBase.f13565c = eVar.M(audioAttributesImplBase.f13565c, 3);
        audioAttributesImplBase.f13566d = eVar.M(audioAttributesImplBase.f13566d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, e eVar) {
        eVar.j0(false, false);
        eVar.M0(audioAttributesImplBase.f13563a, 1);
        eVar.M0(audioAttributesImplBase.f13564b, 2);
        eVar.M0(audioAttributesImplBase.f13565c, 3);
        eVar.M0(audioAttributesImplBase.f13566d, 4);
    }
}
