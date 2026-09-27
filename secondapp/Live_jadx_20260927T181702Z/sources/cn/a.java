package cn;

import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a {
    public static void a(AdapterAdInteractionListener adapterAdInteractionListener, @l Map map) {
        adapterAdInteractionListener.onAdClosed();
    }

    public static void b(AdapterAdInteractionListener adapterAdInteractionListener, @l Map map) {
        adapterAdInteractionListener.onAdEnded();
    }

    public static void c(AdapterAdInteractionListener adapterAdInteractionListener, @l Map map) {
        adapterAdInteractionListener.onAdStarted();
    }

    public static void d(AdapterAdInteractionListener adapterAdInteractionListener, @l Map map) {
        adapterAdInteractionListener.onAdVisible();
    }
}
