package yads;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x7 implements AdQualityVerificationStateFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityVerificationMode f157699a = AdQualityVerificationMode.LONG_VERIFICATION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nv.k0 f157700b;

    public x7(nv.k0 k0Var) {
        kotlin.jvm.internal.m0.n(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<com.monetization.ads.quality.base.state.AdQualityVerificationState>");
        this.f157700b = k0Var;
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    public final AdQualityVerificationMode getVerificationMode() {
        return this.f157699a;
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    public final nv.z0 getVerificationResultStateFlow() {
        return this.f157700b;
    }
}
