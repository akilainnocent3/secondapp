package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes7.dex */
public class IconAdsRequest extends sg.bigo.ads.api.b implements sg.bigo.ads.api.b.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f132685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final sg.bigo.ads.api.core.b f132686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f132687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f132688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f132689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f132690n;

    public static class a extends c<a, IconAdsRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f132691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sg.bigo.ads.api.core.b f132692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f132693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f132694d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f132695e = 20;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f132696f;

        @Override // sg.bigo.ads.api.c
        public final /* synthetic */ sg.bigo.ads.api.b createAdRequest() {
            if (this.f132691a == null) {
                return null;
            }
            return new IconAdsRequest(this, (byte) 0);
        }
    }

    public interface b {
        int a();
    }

    private IconAdsRequest(@NonNull a aVar) {
        super(aVar.mSlotId, null);
        this.f132685i = aVar.f132691a;
        this.f132686j = aVar.f132692b;
        this.f132687k = aVar.f132693c;
        this.f132688l = aVar.f132694d;
        this.f132689m = aVar.f132695e;
        this.f132690n = aVar.f132696f;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return this.f132685i.b();
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sg.bigo.ads.api.core.b bVar = this.f132686j;
        if (bVar != null) {
            linkedHashMap.put("host_slot", bVar.b());
            linkedHashMap.put("host_placement", this.f132686j.c());
            linkedHashMap.put("host_ad_type", Integer.valueOf(this.f132686j.x()));
            linkedHashMap.put("host_adx_type", Integer.valueOf(this.f132686j.w()));
            linkedHashMap.put("dsp_source", this.f132686j.v());
            linkedHashMap.put("main_domain", this.f132686j.i());
            linkedHashMap.put("main_bundle", this.f132686j.n());
            linkedHashMap.put("main_adx_sid", Long.valueOf(this.f132686j.y()));
            linkedHashMap.put("main_ad_id", this.f132686j.r());
            linkedHashMap.put("dsp_extra", this.f132686j.an());
        }
        linkedHashMap.put("adx_type", 5);
        linkedHashMap.put("ad_type", Integer.valueOf(c()));
        linkedHashMap.put("icon_ads_type", Integer.valueOf(this.f132688l));
        linkedHashMap.put("scene_page", Integer.valueOf(this.f132687k));
        linkedHashMap.put("icon_num", Integer.valueOf(this.f132689m));
        return linkedHashMap;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean g() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final l h() {
        return this.f132685i;
    }

    @Override // sg.bigo.ads.api.b.b
    public final sg.bigo.ads.api.core.b i() {
        return this.f132686j;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int j() {
        return this.f132689m;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int k() {
        return this.f132687k;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int l() {
        b bVar = this.f132690n;
        if (bVar != null) {
            return bVar.a();
        }
        return 1;
    }

    public /* synthetic */ IconAdsRequest(a aVar, byte b10) {
        this(aVar);
    }
}
