package com.monetization.ads.quality.base.state;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface AdQualityVerificationState {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Blocked implements AdQualityVerificationState {

        @l
        private final AdQualityVerificationBlockingReasons reason;

        public Blocked(@l AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
            this.reason = adQualityVerificationBlockingReasons;
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adQualityVerificationBlockingReasons = blocked.reason;
            }
            return blocked.copy(adQualityVerificationBlockingReasons);
        }

        @l
        public final AdQualityVerificationBlockingReasons component1() {
            return this.reason;
        }

        @l
        public final Blocked copy(@l AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
            return new Blocked(adQualityVerificationBlockingReasons);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Blocked) && m0.g(this.reason, ((Blocked) obj).reason);
        }

        @l
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @l
        public String toString() {
            return "Blocked(reason=" + this.reason + j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Error implements AdQualityVerificationState {

        @l
        private final AdQualityVerificationError error;

        public Error(@l AdQualityVerificationError adQualityVerificationError) {
            this.error = adQualityVerificationError;
        }

        public static /* synthetic */ Error copy$default(Error error, AdQualityVerificationError adQualityVerificationError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adQualityVerificationError = error.error;
            }
            return error.copy(adQualityVerificationError);
        }

        @l
        public final AdQualityVerificationError component1() {
            return this.error;
        }

        @l
        public final Error copy(@l AdQualityVerificationError adQualityVerificationError) {
            return new Error(adQualityVerificationError);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && m0.g(this.error, ((Error) obj).error);
        }

        @l
        public final AdQualityVerificationError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @l
        public String toString() {
            return "Error(error=" + this.error + j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class NotStarted implements AdQualityVerificationState {

        @l
        public static final NotStarted INSTANCE = new NotStarted();

        private NotStarted() {
        }

        public boolean equals(@m Object obj) {
            return this == obj || (obj instanceof NotStarted);
        }

        public int hashCode() {
            return 1691080461;
        }

        @l
        public String toString() {
            return "NotStarted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ShouldBeBlockedOnDisplay implements AdQualityVerificationState {

        @l
        private final AdQualityVerificationBlockingReasons reason;

        public ShouldBeBlockedOnDisplay(@l AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
            this.reason = adQualityVerificationBlockingReasons;
        }

        public static /* synthetic */ ShouldBeBlockedOnDisplay copy$default(ShouldBeBlockedOnDisplay shouldBeBlockedOnDisplay, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adQualityVerificationBlockingReasons = shouldBeBlockedOnDisplay.reason;
            }
            return shouldBeBlockedOnDisplay.copy(adQualityVerificationBlockingReasons);
        }

        @l
        public final AdQualityVerificationBlockingReasons component1() {
            return this.reason;
        }

        @l
        public final ShouldBeBlockedOnDisplay copy(@l AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
            return new ShouldBeBlockedOnDisplay(adQualityVerificationBlockingReasons);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShouldBeBlockedOnDisplay) && m0.g(this.reason, ((ShouldBeBlockedOnDisplay) obj).reason);
        }

        @l
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @l
        public String toString() {
            return "ShouldBeBlockedOnDisplay(reason=" + this.reason + j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Verified implements AdQualityVerificationState {

        @l
        public static final Verified INSTANCE = new Verified();

        private Verified() {
        }

        public boolean equals(@m Object obj) {
            return this == obj || (obj instanceof Verified);
        }

        public int hashCode() {
            return -800540825;
        }

        @l
        public String toString() {
            return "Verified";
        }
    }
}
