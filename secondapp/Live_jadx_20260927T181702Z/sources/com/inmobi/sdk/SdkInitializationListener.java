package com.inmobi.sdk;

import androidx.annotation.Keep;
import com.inmobi.media.Li;
import k.g1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public interface SdkInitializationListener {

    @l
    public static final Li Companion = Li.f55073a;

    @l
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";

    @l
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";

    @l
    public static final String MISSING_CONTEXT = "Context cannot be null. Please provide a valid context object.";

    @l
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";

    @l
    public static final String MISSING_WEBVIEW_DEPENDENCY = "SDK could not be initialized; Required WebView dependency could not be found.";

    @l
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";

    @g1
    void onInitializationComplete(@m Error error);
}
