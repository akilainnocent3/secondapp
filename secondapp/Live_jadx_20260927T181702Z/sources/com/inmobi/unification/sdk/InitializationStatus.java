package com.inmobi.unification.sdk;

import androidx.annotation.Keep;
import com.inmobi.media.C3612da;
import er.a;
import er.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@e(a.RUNTIME)
@Keep
@Retention(RetentionPolicy.RUNTIME)
public @interface InitializationStatus {

    @l
    public static final C3612da Companion = C3612da.f56258a;

    @l
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";

    @l
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";

    @l
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";

    @l
    public static final String SUCCESS = "Success";

    @l
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
