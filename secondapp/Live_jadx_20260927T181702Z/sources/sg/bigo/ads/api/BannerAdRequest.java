package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class BannerAdRequest extends b<BannerAdRequest> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final List<AdSize> f132682i;

    public static class Builder extends c<Builder, BannerAdRequest> {
        private List<AdSize> mAdSizes;

        @Override // sg.bigo.ads.api.c
        public BannerAdRequest createAdRequest() {
            return new BannerAdRequest(this.mSlotId, this.mAdSizes, this.mServerBidPayload);
        }

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }
    }

    public BannerAdRequest(String str, List<AdSize> list, String str2) {
        super(str, str2);
        this.f132682i = new ArrayList();
        if (list != null) {
            for (AdSize adSize : list) {
                if (adSize != null) {
                    this.f132682i.add(adSize);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final /* synthetic */ b a() {
        BannerAdRequest bannerAdRequest = new BannerAdRequest(this.f132717a, new ArrayList(this.f132682i), this.f132718b);
        bannerAdRequest.a(this.f132724h.f132725a);
        bannerAdRequest.f132719c = this.f132719c;
        bannerAdRequest.f132723g = this.f132723g;
        return bannerAdRequest;
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final sg.bigo.ads.api.core.c b() {
        sg.bigo.ads.api.core.c cVarB = super.b();
        if (cVarB != null) {
            return cVarB;
        }
        if (this.f132682i.isEmpty()) {
            return new sg.bigo.ads.api.core.c(1001, 10003, "Ad sizes cannot be empty.");
        }
        return null;
    }

    @Override // sg.bigo.ads.api.b
    public int c() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> d() {
        HashMap map = new HashMap();
        map.put("ad_size", sg.bigo.ads.ad.banner.a.a(this.f132682i));
        return map;
    }
}
