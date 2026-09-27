package com.chartboost.sdk.internal.Model;

import kotlin.jvm.internal.m0;
import oy.l;
import sr.a;
import sr.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class CBError extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f41771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41772c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Click implements Type {
        URI_INVALID,
        URI_UNRECOGNIZED,
        LOAD_NOT_FINISHED,
        INTERNAL;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f41774c = c.c(a());

        @l
        public static a<Click> getEntries() {
            return f41774c;
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Impression implements Type {
        INTERNAL,
        INTERNET_UNAVAILABLE,
        TOO_MANY_CONNECTIONS,
        WRONG_ORIENTATION,
        FIRST_SESSION_INTERSTITIALS_DISABLED,
        NETWORK_FAILURE,
        NO_AD_FOUND,
        SESSION_NOT_STARTED,
        IMPRESSION_ALREADY_VISIBLE,
        NO_HOST_ACTIVITY,
        USER_CANCELLATION,
        INVALID_LOCATION,
        VIDEO_UNAVAILABLE,
        VIDEO_ID_MISSING,
        ERROR_PLAYING_VIDEO,
        INVALID_RESPONSE,
        ASSETS_DOWNLOAD_FAILURE,
        ERROR_CREATING_VIEW,
        ERROR_DISPLAYING_VIEW,
        INCOMPATIBLE_API_VERSION,
        ERROR_LOADING_WEB_VIEW,
        ASSET_PREFETCH_IN_PROGRESS,
        ACTIVITY_MISSING_IN_MANIFEST,
        EMPTY_LOCAL_VIDEO_LIST,
        END_POINT_DISABLED,
        HARDWARE_ACCELERATION_DISABLED,
        PENDING_IMPRESSION_ERROR,
        VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION,
        ASSET_MISSING,
        WEB_VIEW_PAGE_LOAD_TIMEOUT,
        WEB_VIEW_CLIENT_RECEIVED_ERROR,
        INTERNET_UNAVAILABLE_AT_SHOW,
        INTERNET_UNAVAILABLE_AT_CACHE;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f41776c = c.c(a());

        @l
        public static a<Impression> getEntries() {
            return f41776c;
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Internal implements Type {
        MISCELLANEOUS,
        INTERNET_UNAVAILABLE,
        INVALID_RESPONSE,
        UNEXPECTED_RESPONSE,
        NETWORK_FAILURE,
        HTTP_NOT_FOUND,
        HTTP_NOT_OK,
        UNSUPPORTED_OS_VERSION;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f41778c = c.c(a());

        @l
        public static a<Internal> getEntries() {
            return f41778c;
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Type {
        @l
        String getName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBError(@l Type type, @l String errorDesc) {
        super(errorDesc);
        m0.p(type, "type");
        m0.p(errorDesc, "errorDesc");
        this.f41771b = type;
        this.f41772c = errorDesc;
    }

    @l
    public final String getErrorDesc() {
        return this.f41772c;
    }

    @l
    public final Impression getImpressionError() {
        Type type = this.f41771b;
        if (type == Internal.INTERNET_UNAVAILABLE) {
            return Impression.INTERNET_UNAVAILABLE;
        }
        if (type == Internal.HTTP_NOT_FOUND) {
            return Impression.NO_AD_FOUND;
        }
        if (type == Internal.INVALID_RESPONSE) {
            return Impression.INVALID_RESPONSE;
        }
        return type == Internal.NETWORK_FAILURE ? Impression.NETWORK_FAILURE : Impression.INTERNAL;
    }

    @l
    public final Type getType() {
        return this.f41771b;
    }
}
