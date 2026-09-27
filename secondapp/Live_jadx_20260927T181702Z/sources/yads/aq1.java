package yads;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class aq1 implements lo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediatedRewardedAdapter f146890a;

    @Override // yads.lo1
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        ((MediatedRewardedAdapter) aVar).onInvalidate();
    }

    @Override // yads.lo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedRewardedAdapter mediatedRewardedAdapter = (MediatedRewardedAdapter) aVar;
        this.f146890a = mediatedRewardedAdapter;
        mediatedRewardedAdapter.loadRewardedAd(context, (MediatedRewardedAdapterListener) obj, map, map2);
    }
}
