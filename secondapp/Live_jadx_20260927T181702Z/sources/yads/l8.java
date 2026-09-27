package yads;

import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l8 {
    public static String a(AdQualityVerificationState adQualityVerificationState) {
        String str;
        if (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) {
            str = "Blocked: " + ((AdQualityVerificationState.Blocked) adQualityVerificationState).getReason().getBlockReasons();
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.Error) {
            str = "Error occurred during verification: " + ((AdQualityVerificationState.Error) adQualityVerificationState).getError().getDescription();
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.NotStarted) {
            str = "Not verification started for the ad object";
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay) {
            str = "Should be blocked on display: " + ((AdQualityVerificationState.ShouldBeBlockedOnDisplay) adQualityVerificationState).getReason().getBlockReasons();
        } else {
            if (!(adQualityVerificationState instanceof AdQualityVerificationState.Verified)) {
                throw new dr.o0();
            }
            str = "Verified";
        }
        return "Verification Completed. With result: " + str;
    }

    public static String a(AdQualityVerificationResult adQualityVerificationResult) {
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotImplemented) {
            return "Not implemented by design";
        }
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) {
            return "Verification not started";
        }
        if (!(adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified)) {
            if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
                return a(((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue());
            }
            throw new dr.o0();
        }
        return "Not verified by reason: " + ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason().getDescription();
    }
}
