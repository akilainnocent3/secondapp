package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import k.y0;
import w9.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e eVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(eVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e eVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, eVar);
    }
}
