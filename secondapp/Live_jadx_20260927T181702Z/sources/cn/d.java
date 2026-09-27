package cn;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d {
    public static void a(AdapterAdViewListener adapterAdViewListener, Map map) {
        adapterAdViewListener.onAdLeftApplication();
    }

    public static void b(AdapterAdViewListener adapterAdViewListener, @l View view, @l FrameLayout.LayoutParams layoutParams, Map map) {
        adapterAdViewListener.onAdLoadSuccess(view, layoutParams);
    }

    public static void c(AdapterAdViewListener adapterAdViewListener, Map map) {
        adapterAdViewListener.onAdScreenDismissed();
    }

    public static void d(AdapterAdViewListener adapterAdViewListener, Map map) {
        adapterAdViewListener.onAdScreenPresented();
    }
}
