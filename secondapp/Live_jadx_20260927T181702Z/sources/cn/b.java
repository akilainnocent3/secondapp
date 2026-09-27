package cn;

import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b {
    public static void a(AdapterAdListener adapterAdListener, @l Map map) {
        adapterAdListener.onAdClicked();
    }

    public static void b(AdapterAdListener adapterAdListener, @l AdapterErrorType adapterErrorType, int i10, String str, @l Map map) {
        adapterAdListener.onAdLoadFailed(adapterErrorType, i10, str);
    }

    public static void c(AdapterAdListener adapterAdListener, @l Map map) {
        adapterAdListener.onAdLoadSuccess();
    }

    public static void d(AdapterAdListener adapterAdListener, @l Map map) {
        adapterAdListener.onAdOpened();
    }

    public static void e(AdapterAdListener adapterAdListener, int i10, String str, @l Map map) {
        adapterAdListener.onAdShowFailed(i10, str);
    }
}
