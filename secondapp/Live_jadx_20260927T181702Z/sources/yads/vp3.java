package yads;

import com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vp3 implements AdBreakRequestData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b00 f157056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157057b;

    public vp3(b00 b00Var) {
        this.f157056a = b00Var;
        this.f157057b = (b00Var.b() == null || b00Var.a() == null) ? false : true;
    }

    @Override // com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData
    public final String getImpId() {
        b00 b00Var = this.f157056a;
        if (!this.f157057b) {
            b00Var = null;
        }
        if (b00Var != null) {
            return b00Var.f146996b;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData
    public final String getPageId() {
        b00 b00Var = this.f157056a;
        if (!this.f157057b) {
            b00Var = null;
        }
        if (b00Var != null) {
            return b00Var.f146995a;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData
    public final String getUrl() {
        return this.f157056a.f146997c;
    }
}
