package com.inmobi.ads;

import com.inmobi.media.R8;
import java.util.Objects;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class InMobiAdRequestStatus {

    @l
    public static final String AD_ACTIVE_MESSAGE = "The Ad Request could not be submitted as the user is viewing another Ad.";

    @l
    public static final R8 Companion = new R8();

    @l
    public static final String DEVICE_AUDIO_LEVEL_LOW = "The Ad Request could not be processed as the device volume level is below threshold.";

    @l
    public static final String FEATURE_DISABLED = "The Ad Request could not be submitted as the Feature is disabled";

    @l
    public static final String REQUEST_INVALID_MESSAGE = "An invalid ad request was sent and was rejected by the Ad Network. Please validate the ad request and try again";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusCode f54249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54250b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum StatusCode {
        NO_ERROR,
        NETWORK_UNREACHABLE,
        NO_FILL,
        REQUEST_INVALID,
        REQUEST_PENDING,
        REQUEST_TIMED_OUT,
        INTERNAL_ERROR,
        SERVER_ERROR,
        AD_ACTIVE,
        EARLY_REFRESH_REQUEST,
        AD_NO_LONGER_AVAILABLE,
        MISSING_REQUIRED_DEPENDENCIES,
        REPETITIVE_LOAD,
        GDPR_COMPLIANCE_ENFORCED,
        GET_SIGNALS_CALLED_WHILE_LOADING,
        LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING,
        INVALID_RESPONSE_IN_LOAD,
        MONETIZATION_DISABLED,
        CALLED_FROM_WRONG_THREAD,
        CONFIGURATION_ERROR,
        LOW_MEMORY,
        FEATURE_DISABLED,
        DEVICE_AUDIO_LEVEL_LOW;

        private static final /* synthetic */ sr.a $ENTRIES = sr.c.c(values());

        @l
        public static sr.a<StatusCode> getEntries() {
            return $ENTRIES;
        }
    }

    public InMobiAdRequestStatus(@l StatusCode statusCode) {
        m0.p(statusCode, "statusCode");
        this.f54249a = statusCode;
        a();
    }

    public final void a() {
        switch (c.f54287a[this.f54249a.ordinal()]) {
            case 1:
                this.f54250b = "The InMobi SDK encountered an internal error.";
                break;
            case 2:
                this.f54250b = "The Internet is unreachable. Please check your Internet connection.";
                break;
            case 3:
                this.f54250b = REQUEST_INVALID_MESSAGE;
                break;
            case 4:
                this.f54250b = "The SDK is pending response to a previous ad request. Please wait for the previous ad request to complete before requesting for another ad.";
                break;
            case 5:
                this.f54250b = "The Ad Request timed out waiting for a response from the network. This can be caused due to a bad network connection. Please try again after a few minutes.";
                break;
            case 6:
                this.f54250b = "The Ad Server encountered an error when processing the ad request. This may be a transient issue. Please try again in a few minutes";
                break;
            case 7:
                this.f54250b = "Ad request successful but no ad served.";
                break;
            case 8:
                this.f54250b = AD_ACTIVE_MESSAGE;
                break;
            case 9:
                this.f54250b = "The Ad Request cannot be done so frequently. Please wait for some time before loading another ad.";
                break;
            case 10:
                this.f54250b = "An ad is no longer available. Please call load() to fetch a fresh ad.";
                break;
            case 11:
                this.f54250b = "The SDK rejected the ad request as one or more required dependencies could not be found. Please ensure you have included the required dependencies.";
                break;
            case 12:
                this.f54250b = "The SDK rejected the ad load request. Multiple load() call on the same object is not allowed if the previous ad request was successful.";
                break;
            case 13:
                this.f54250b = "Network Request dropped as current request is not GDPR compliant.";
                break;
            case 14:
                this.f54250b = "An ad load is already in progress, getSignals() call in this state is not allowed.";
                break;
            case 15:
                this.f54250b = "An ad load is already in progress, load(response) call in this state is not allowed.";
                break;
            case 16:
                this.f54250b = "Null or empty response as parameter is not allowed in load(response).";
                break;
            case 17:
                this.f54250b = "The Ad Request is terminated because monetization is disabled.";
                break;
            case 18:
                this.f54250b = "An API call is made from non-ui thread.";
                break;
            case 19:
                this.f54250b = "InMobi Ad Object is not configured properly Please check if setBannerSize(int widthInDp, int heightInDp) or setLayoutParams(<Layout_Params>) have been configured correctly";
                break;
            case 20:
                this.f54250b = "The app is running low on memory, hence resulting in failure";
                break;
            case 21:
                this.f54250b = FEATURE_DISABLED;
                break;
            case 22:
                this.f54250b = DEVICE_AUDIO_LEVEL_LOW;
                break;
            default:
                m0.o("InMobiAdRequestStatus", "TAG");
                Objects.toString(this.f54249a);
                break;
        }
    }

    @m
    public final String getMessage() {
        return this.f54250b;
    }

    @l
    public final StatusCode getStatusCode() {
        return this.f54249a;
    }

    @l
    public final InMobiAdRequestStatus setCustomMessage(@m String str) {
        if (str != null) {
            this.f54250b = str;
        }
        return this;
    }
}
