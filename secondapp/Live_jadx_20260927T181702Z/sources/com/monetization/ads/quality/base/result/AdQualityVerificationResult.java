package com.monetization.ads.quality.base.result;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface AdQualityVerificationResult {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class NotImplemented implements AdQualityVerificationResult {

        @l
        public static final NotImplemented INSTANCE = new NotImplemented();

        private NotImplemented() {
        }

        public boolean equals(@m Object obj) {
            return this == obj || (obj instanceof NotImplemented);
        }

        public int hashCode() {
            return -293539646;
        }

        @l
        public String toString() {
            return "NotImplemented";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class NotVerified implements AdQualityVerificationResult {

        @l
        private final AdQualityVerificationError reason;

        public NotVerified(@l AdQualityVerificationError adQualityVerificationError) {
            this.reason = adQualityVerificationError;
        }

        public static /* synthetic */ NotVerified copy$default(NotVerified notVerified, AdQualityVerificationError adQualityVerificationError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adQualityVerificationError = notVerified.reason;
            }
            return notVerified.copy(adQualityVerificationError);
        }

        @l
        public final AdQualityVerificationError component1() {
            return this.reason;
        }

        @l
        public final NotVerified copy(@l AdQualityVerificationError adQualityVerificationError) {
            return new NotVerified(adQualityVerificationError);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotVerified) && m0.g(this.reason, ((NotVerified) obj).reason);
        }

        @l
        public final AdQualityVerificationError getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @l
        public String toString() {
            return "NotVerified(reason=" + this.reason + j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Verified implements AdQualityVerificationResult {

        @l
        private final AdQualityVerificationStateFlow verifiedAd;

        public Verified(@l AdQualityVerificationStateFlow adQualityVerificationStateFlow) {
            this.verifiedAd = adQualityVerificationStateFlow;
        }

        public static /* synthetic */ Verified copy$default(Verified verified, AdQualityVerificationStateFlow adQualityVerificationStateFlow, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adQualityVerificationStateFlow = verified.verifiedAd;
            }
            return verified.copy(adQualityVerificationStateFlow);
        }

        @l
        public final AdQualityVerificationStateFlow component1() {
            return this.verifiedAd;
        }

        @l
        public final Verified copy(@l AdQualityVerificationStateFlow adQualityVerificationStateFlow) {
            return new Verified(adQualityVerificationStateFlow);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && m0.g(this.verifiedAd, ((Verified) obj).verifiedAd);
        }

        @l
        public final AdQualityVerificationStateFlow getVerifiedAd() {
            return this.verifiedAd;
        }

        public int hashCode() {
            return this.verifiedAd.hashCode();
        }

        @l
        public String toString() {
            return "Verified(verifiedAd=" + this.verifiedAd + j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class WaitingForVerification implements AdQualityVerificationResult {

        @l
        public static final WaitingForVerification INSTANCE = new WaitingForVerification();

        private WaitingForVerification() {
        }

        public boolean equals(@m Object obj) {
            return this == obj || (obj instanceof WaitingForVerification);
        }

        public int hashCode() {
            return 393213194;
        }

        @l
        public String toString() {
            return "WaitingForVerification";
        }
    }
}
