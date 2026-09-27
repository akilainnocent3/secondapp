package com.monetization.ads.mediation.nativeads.assets;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedFeedbackFactory;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedSponsoredFactory;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class DefaultMediatedAssetFactory implements MediatedAssetFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f71932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DefaultMediatedSponsoredFactory f71933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DefaultMediatedFeedbackFactory f71934c;

    public DefaultMediatedAssetFactory(@l Context context, @l DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, @l DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory) {
        this.f71932a = context;
        this.f71933b = defaultMediatedSponsoredFactory;
        this.f71934c = defaultMediatedFeedbackFactory;
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    @l
    public MediatedNativeAdImage makeDefaultFeedback() {
        return this.f71934c.makeFeedback(this.f71932a, R.drawable.monetization_ads_mediation_api_feedback_icon);
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    @l
    public String makeDefaultSponsored() {
        return this.f71933b.makeSponsored(this.f71932a, R.string.monetization_ads_mediation_api_sponsored_text);
    }

    public /* synthetic */ DefaultMediatedAssetFactory(Context context, DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory, int i10, x xVar) {
        this(context, (i10 & 2) != 0 ? new DefaultMediatedSponsoredFactory() : defaultMediatedSponsoredFactory, (i10 & 4) != 0 ? new DefaultMediatedFeedbackFactory() : defaultMediatedFeedbackFactory);
    }
}
