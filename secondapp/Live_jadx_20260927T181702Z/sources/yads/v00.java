package yads;

import com.yandex.mobile.ads.instream.InstreamAd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class v00 {
    public static m00 a(InstreamAd instreamAd) {
        if (instreamAd instanceof qr3) {
            return ((qr3) instreamAd).f154572a;
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }
}
