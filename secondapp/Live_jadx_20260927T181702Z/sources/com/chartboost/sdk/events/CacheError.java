package com.chartboost.sdk.events;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import sr.a;
import sr.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class CacheError implements CBError {

    @l
    private final Code code;

    @m
    private final Exception exception;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Code {
        INTERNAL(0),
        INTERNET_UNAVAILABLE(1),
        NETWORK_FAILURE(5),
        NO_AD_FOUND(6),
        SESSION_NOT_STARTED(7),
        SERVER_ERROR(8),
        ASSET_DOWNLOAD_FAILURE(16),
        BANNER_DISABLED(36),
        BANNER_VIEW_IS_DETACHED(37),
        TIMEOUT(38),
        DISABLED(39),
        LOAD_IN_PROGRESS(40),
        ALREADY_LOADED(41),
        INVALID_PLACEMENT(42),
        RATE_LIMITED(43),
        INVALID_REQUEST(44),
        INVALID_RESPONSE(45),
        INVALID_ADM(46),
        NO_STORAGE(47),
        NO_MRAID_JS(48),
        INVALID_HTML(49),
        WEBVIEW_FAILED(50),
        WEBVIEW_CRASHED(51),
        INVALID_ASSET_URL(52),
        VAST_ERROR(53),
        UNSUPPORTED_CODEC(54);

        private static final /* synthetic */ a $ENTRIES = c.c(values());
        private final int errorCode;

        Code(int i10) {
            this.errorCode = i10;
        }

        @l
        public static a<Code> getEntries() {
            return $ENTRIES;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public CacheError(@l Code code, @m Exception exc) {
        m0.p(code, "code");
        this.code = code;
        this.exception = exc;
    }

    @l
    public final Code getCode() {
        return this.code;
    }

    @Override // com.chartboost.sdk.events.CBError
    @m
    public Exception getException() {
        return this.exception;
    }

    @l
    public String toString() {
        return "Chartboost CacheError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ CacheError(Code code, Exception exc, int i10, x xVar) {
        this(code, (i10 & 2) != 0 ? null : exc);
    }
}
