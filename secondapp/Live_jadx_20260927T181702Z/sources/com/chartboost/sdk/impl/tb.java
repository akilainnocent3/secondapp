package com.chartboost.sdk.impl;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class tb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40950b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40951a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final tb a(Float f10) {
            String str;
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
                str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
                kotlin.jvm.internal.m0.o(str, "format(...)");
            } else {
                str = fw.b.f85379f;
            }
            return new tb("window.mraidbridge.notifyAudioVolumeChangeEvent(" + str + ");");
        }

        public final tb b() {
            return a("{hostSDKName: 'Chartboost-Android-SDK'}");
        }

        public final tb c(cd screenMetrics) {
            kotlin.jvm.internal.m0.p(screenMetrics, "screenMetrics");
            cb cbVarB = screenMetrics.b().b();
            return new tb("window.mraidbridge.setDefaultPosition(" + cbVarB.c() + ", " + cbVarB.d() + ", " + cbVarB.b() + ", " + cbVarB.a() + ");");
        }

        public final tb d(cd screenMetrics) {
            kotlin.jvm.internal.m0.p(screenMetrics, "screenMetrics");
            cb cbVarB = screenMetrics.c().b();
            return new tb("window.mraidbridge.setMaxSize(" + cbVarB.b() + ", " + cbVarB.a() + ");");
        }

        public final tb e(cd screenMetrics) {
            kotlin.jvm.internal.m0.p(screenMetrics, "screenMetrics");
            cb cbVarB = screenMetrics.d().b();
            return new tb("window.mraidbridge.setScreenSize(" + cbVarB.b() + ", " + cbVarB.a() + ");");
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final tb b(cd screenMetrics) {
            kotlin.jvm.internal.m0.p(screenMetrics, "screenMetrics");
            cb cbVarB = screenMetrics.a().b();
            return new tb("window.mraidbridge.setCurrentPosition(" + cbVarB.c() + ", " + cbVarB.d() + ", " + cbVarB.b() + ", " + cbVarB.a() + ");");
        }

        public final tb a(zc command) {
            kotlin.jvm.internal.m0.p(command, "command");
            return new tb("window.mraidbridge.nativeCallComplete({" + command.b() + "});");
        }

        public final tb a(cd screenMetrics) {
            kotlin.jvm.internal.m0.p(screenMetrics, "screenMetrics");
            cb cbVarB = screenMetrics.c().b();
            return new tb("window.mraidbridge.notifySizeChangeEvent(" + cbVarB.b() + ", " + cbVarB.a() + ");");
        }

        public final tb b(String sdkVersion) {
            kotlin.jvm.internal.m0.p(sdkVersion, "sdkVersion");
            return a("{hostSDKVersion: '" + sdkVersion + "'}");
        }

        public final tb a(tc state) {
            kotlin.jvm.internal.m0.p(state, "state");
            return a("{state: '" + state.b() + "'}");
        }

        public final tb a(boolean z10) {
            String lowerCase = String.valueOf(z10).toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
            return a("{viewable: " + lowerCase + "}");
        }

        public final tb a(rc orientation, boolean z10) {
            kotlin.jvm.internal.m0.p(orientation, "orientation");
            return a("{orientation: '" + orientation.b() + "', locked: " + z10 + "}");
        }

        public final tb a(sc placementType) {
            kotlin.jvm.internal.m0.p(placementType, "placementType");
            return new tb("window.mraidbridge.setPlacementType('" + placementType.b() + "');");
        }

        public final tb a() {
            return new tb("window.mraidbridge.notifyReadyEvent();");
        }

        public final tb a(String str) {
            return new tb("window.mraidbridge.fireChangeEvent(" + str + ");");
        }
    }

    public tb(String javascript) {
        kotlin.jvm.internal.m0.p(javascript, "javascript");
        this.f40951a = javascript;
    }

    public final String a() {
        return this.f40951a;
    }
}
