package en;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b {
    public static void a(InterstitialSmashListener interstitialSmashListener, Map map) {
        interstitialSmashListener.onInterstitialAdClicked();
    }

    public static void b(InterstitialSmashListener interstitialSmashListener, Map map) {
        interstitialSmashListener.onInterstitialAdClosed();
    }

    public static void c(InterstitialSmashListener interstitialSmashListener, IronSourceError ironSourceError, Map map) {
        interstitialSmashListener.onInterstitialAdLoadFailed(ironSourceError);
    }

    public static void d(InterstitialSmashListener interstitialSmashListener, Map map) {
        interstitialSmashListener.onInterstitialAdOpened();
    }

    public static void e(InterstitialSmashListener interstitialSmashListener, Map map) {
        interstitialSmashListener.onInterstitialAdReady();
    }

    public static void f(InterstitialSmashListener interstitialSmashListener, IronSourceError ironSourceError, Map map) {
        interstitialSmashListener.onInterstitialAdShowFailed(ironSourceError);
    }

    public static void g(InterstitialSmashListener interstitialSmashListener, Map map) {
        interstitialSmashListener.onInterstitialAdShowSucceeded();
    }

    public static void h(InterstitialSmashListener interstitialSmashListener, Map map) {
        interstitialSmashListener.onInterstitialAdVisible();
    }

    public static void i(InterstitialSmashListener interstitialSmashListener, IronSourceError ironSourceError, Map map) {
        interstitialSmashListener.onInterstitialInitFailed(ironSourceError);
    }

    public static void j(InterstitialSmashListener interstitialSmashListener, Map map) {
        interstitialSmashListener.onInterstitialInitSuccess();
    }
}
