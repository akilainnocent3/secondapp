package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f96084a = C4959c4.l().g().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5536z0 f96085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Re f96086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ue f96087d;

    public L0() {
        C5536z0 c5536z0 = new C5536z0();
        this.f96085b = c5536z0;
        this.f96086c = new Re(c5536z0);
        this.f96087d = new Ue();
    }

    public final void a(final PluginErrorDetails pluginErrorDetails) {
        Re re2 = this.f96086c;
        re2.f96411a.a(null);
        re2.f96412b.a(pluginErrorDetails);
        Ue ue2 = this.f96087d;
        kotlin.jvm.internal.m0.m(pluginErrorDetails);
        ue2.getClass();
        this.f96084a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.lp
            @Override // java.lang.Runnable
            public final void run() {
                L0.a(this.f97856b, pluginErrorDetails);
            }
        });
    }

    public final void a(final PluginErrorDetails pluginErrorDetails, final String str) {
        Re re2 = this.f96086c;
        re2.f96411a.a(null);
        re2.f96412b.a(pluginErrorDetails);
        if (re2.f96414d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f98247a) {
            Ue ue2 = this.f96087d;
            kotlin.jvm.internal.m0.m(pluginErrorDetails);
            ue2.getClass();
            this.f96084a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.mp
                @Override // java.lang.Runnable
                public final void run() {
                    L0.a(this.f97922b, pluginErrorDetails, str);
                }
            });
        }
    }

    public final void a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        Re re2 = this.f96086c;
        re2.f96411a.a(null);
        re2.f96413c.a(str);
        Ue ue2 = this.f96087d;
        kotlin.jvm.internal.m0.m(str);
        ue2.getClass();
        this.f96084a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.kp
            @Override // java.lang.Runnable
            public final void run() {
                L0.a(this.f97775b, str, str2, pluginErrorDetails);
            }
        });
    }

    public static final void a(L0 l10, PluginErrorDetails pluginErrorDetails, String str) {
        l10.f96085b.getClass();
        C5511y0 c5511y0 = C5511y0.f98631e;
        kotlin.jvm.internal.m0.m(c5511y0);
        C5173kc c5173kcI = c5511y0.f().i();
        kotlin.jvm.internal.m0.m(c5173kcI);
        c5173kcI.f97721a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(L0 l10, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        l10.f96085b.getClass();
        C5511y0 c5511y0 = C5511y0.f98631e;
        kotlin.jvm.internal.m0.m(c5511y0);
        C5173kc c5173kcI = c5511y0.f().i();
        kotlin.jvm.internal.m0.m(c5173kcI);
        c5173kcI.f97721a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(L0 l10, PluginErrorDetails pluginErrorDetails) {
        l10.f96085b.getClass();
        C5511y0 c5511y0 = C5511y0.f98631e;
        kotlin.jvm.internal.m0.m(c5511y0);
        C5173kc c5173kcI = c5511y0.f().i();
        kotlin.jvm.internal.m0.m(c5173kcI);
        c5173kcI.f97721a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
