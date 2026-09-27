package yads;

import com.yandex.mobile.ads.common.AdAttributes;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kk implements AdAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gc f151564a;

    public kk(gc gcVar) {
        this.f151564a = gcVar;
    }

    @Override // com.yandex.mobile.ads.common.AdAttributes
    public final String getBannerId() {
        jk jkVar;
        gc gcVar = this.f151564a;
        if (gcVar == null || (jkVar = gcVar.f149514b) == null) {
            return null;
        }
        return jkVar.f151131b;
    }

    @Override // com.yandex.mobile.ads.common.AdAttributes
    public final String getCampaignId() {
        jk jkVar;
        gc gcVar = this.f151564a;
        if (gcVar == null || (jkVar = gcVar.f149514b) == null) {
            return null;
        }
        return jkVar.f151130a;
    }

    @Override // com.yandex.mobile.ads.common.AdAttributes
    public final String getPlaceId() {
        jk jkVar;
        gc gcVar = this.f151564a;
        if (gcVar == null || (jkVar = gcVar.f149514b) == null) {
            return null;
        }
        return jkVar.f151132c;
    }
}
