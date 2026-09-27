package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class HandleDebugSettings {

    @l
    private final Logger logger;

    public HandleDebugSettings(@l Logger logger) {
        m0.p(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(@l NativeConfigurationOuterClass.DebugSettings debugSettings) {
        m0.p(debugSettings, "debugSettings");
        if (debugSettings.getEnableTracing()) {
            this.logger.setLogLevel(LogLevelInternal.TRACE);
        }
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
