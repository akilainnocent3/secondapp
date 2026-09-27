package com.unity3d.ads.core.data.model;

import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class LoadResult {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";

    @l
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";

    @l
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";

    @l
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";

    @l
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";

    @l
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";

    @l
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";

    @l
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";

    @l
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";

    @l
    public static final String MSG_NO_FILL = "[UnityAds] No fill";

    @l
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";

    @l
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";

    @l
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Failure extends LoadResult {

        @l
        private final ErrorOuterClass.PublicErrorCode error;
        private final boolean isScarAd;

        @m
        private final String message;

        @l
        private final String reason;

        @m
        private final String reasonDebug;

        @m
        private final Throwable throwable;

        public /* synthetic */ Failure(ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th2, String str2, String str3, boolean z10, int i10, x xVar) {
            this(publicErrorCode, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : th2, str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th2, String str2, String str3, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                publicErrorCode = failure.error;
            }
            if ((i10 & 2) != 0) {
                str = failure.message;
            }
            if ((i10 & 4) != 0) {
                th2 = failure.throwable;
            }
            if ((i10 & 8) != 0) {
                str2 = failure.reason;
            }
            if ((i10 & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            if ((i10 & 32) != 0) {
                z10 = failure.isScarAd;
            }
            String str4 = str3;
            boolean z11 = z10;
            return failure.copy(publicErrorCode, str, th2, str2, str4, z11);
        }

        @l
        public final ErrorOuterClass.PublicErrorCode component1() {
            return this.error;
        }

        @m
        public final String component2() {
            return this.message;
        }

        @m
        public final Throwable component3() {
            return this.throwable;
        }

        @l
        public final String component4() {
            return this.reason;
        }

        @m
        public final String component5() {
            return this.reasonDebug;
        }

        public final boolean component6() {
            return this.isScarAd;
        }

        @l
        public final Failure copy(@l ErrorOuterClass.PublicErrorCode error, @m String str, @m Throwable th2, @l String reason, @m String str2, boolean z10) {
            m0.p(error, "error");
            m0.p(reason, "reason");
            return new Failure(error, str, th2, reason, str2, z10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && m0.g(this.message, failure.message) && m0.g(this.throwable, failure.throwable) && m0.g(this.reason, failure.reason) && m0.g(this.reasonDebug, failure.reasonDebug) && this.isScarAd == failure.isScarAd;
        }

        @l
        public final ErrorOuterClass.PublicErrorCode getError() {
            return this.error;
        }

        @m
        public final String getMessage() {
            return this.message;
        }

        @l
        public final String getReason() {
            return this.reason;
        }

        @m
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @m
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v14 */
        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th2 = this.throwable;
            int iHashCode3 = (((iHashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31) + this.reason.hashCode()) * 31;
            String str2 = this.reasonDebug;
            int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z10 = this.isScarAd;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode4 + r10;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        @l
        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", isScarAd=" + this.isScarAd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@l ErrorOuterClass.PublicErrorCode error, @m String str, @m Throwable th2, @l String reason, @m String str2, boolean z10) {
            super(null);
            m0.p(error, "error");
            m0.p(reason, "reason");
            this.error = error;
            this.message = str;
            this.throwable = th2;
            this.reason = reason;
            this.reasonDebug = str2;
            this.isScarAd = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Success extends LoadResult {

        @l
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@l AdObject adObject) {
            super(null);
            m0.p(adObject, "adObject");
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        @l
        public final AdObject component1() {
            return this.adObject;
        }

        @l
        public final Success copy(@l AdObject adObject) {
            m0.p(adObject, "adObject");
            return new Success(adObject);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && m0.g(this.adObject, ((Success) obj).adObject);
        }

        @l
        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        @l
        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    public /* synthetic */ LoadResult(x xVar) {
        this();
    }

    private LoadResult() {
    }
}
