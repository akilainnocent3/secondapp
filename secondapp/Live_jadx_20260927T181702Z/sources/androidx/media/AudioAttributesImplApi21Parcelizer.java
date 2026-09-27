package androidx.media;

import android.media.AudioAttributes;
import k.y0;
import w9.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(e eVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f13560a = (AudioAttributes) eVar.W(audioAttributesImplApi21.f13560a, 1);
        audioAttributesImplApi21.f13561b = eVar.M(audioAttributesImplApi21.f13561b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, e eVar) {
        eVar.j0(false, false);
        eVar.X0(audioAttributesImplApi21.f13560a, 1);
        eVar.M0(audioAttributesImplApi21.f13561b, 2);
    }
}
