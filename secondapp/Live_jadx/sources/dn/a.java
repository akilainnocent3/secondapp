package dn;

import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import java.util.Map;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a {
    public static void a(NetworkInitializationListener networkInitializationListener, int i10, @m String str, Map map) {
        networkInitializationListener.onInitFailed(i10, str);
    }

    public static void b(NetworkInitializationListener networkInitializationListener, Map map) {
        networkInitializationListener.onInitSuccess();
    }
}
