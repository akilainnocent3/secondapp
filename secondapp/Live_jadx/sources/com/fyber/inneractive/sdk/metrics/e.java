package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f45138a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f45139b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f45140c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f45141d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f45142e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f45143f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f45144g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f45145h = null;

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long b() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f45144g = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long c() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f45138a = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long d() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f45141d = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long e() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f45143f = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long f() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f45139b = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long g() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f45140c = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long h() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f45145h = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long i() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f45142e = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final HashMap j() {
        HashMap map = new HashMap();
        Long l10 = this.f45139b;
        if (l10 != null && this.f45138a != null) {
            map.put("sdk_init_network_req", Long.valueOf(l10.longValue() - this.f45138a.longValue()));
        }
        Long l11 = this.f45145h;
        if (l11 != null && this.f45139b != null) {
            map.put("sdk_got_response_from_markup_url", Long.valueOf(l11.longValue() - this.f45139b.longValue()));
        }
        Long l12 = this.f45141d;
        if (l12 != null && this.f45145h != null) {
            map.put("sdk_parsed_res", Long.valueOf(l12.longValue() - this.f45145h.longValue()));
        }
        Long l13 = this.f45140c;
        if (l13 != null && this.f45139b != null) {
            map.put("sdk_got_server_res", Long.valueOf(l13.longValue() - this.f45139b.longValue()));
        }
        Long l14 = this.f45141d;
        if (l14 != null && this.f45140c != null) {
            map.put("sdk_parsed_res", Long.valueOf(l14.longValue() - this.f45140c.longValue()));
        }
        Long l15 = this.f45142e;
        if (l15 != null && this.f45141d != null) {
            map.put("ad_loaded_result", Long.valueOf(l15.longValue() - this.f45141d.longValue()));
        }
        Long l16 = this.f45143f;
        if (l16 != null && this.f45142e != null) {
            map.put("publisher_notified", Long.valueOf(l16.longValue() - this.f45142e.longValue()));
        }
        Long l17 = this.f45144g;
        if (l17 != null && this.f45138a != null) {
            map.put("roundtrip", Long.valueOf(l17.longValue() - this.f45138a.longValue()));
        }
        return map;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricsCollectorData{");
        if (this.f45138a != null && this.f45139b != null) {
            sb2.append(" sdk_init_network_req=");
            sb2.append(this.f45139b.longValue() - this.f45138a.longValue());
        }
        if (this.f45145h != null && this.f45139b != null) {
            sb2.append(", sdk_got_response_from_markup_url=");
            sb2.append(this.f45145h.longValue() - this.f45139b.longValue());
        }
        if (this.f45140c != null && this.f45139b != null) {
            sb2.append(", sdk_got_server_res=");
            sb2.append(this.f45140c.longValue() - this.f45139b.longValue());
        }
        if (this.f45141d != null && this.f45140c != null) {
            sb2.append(", sdk_parsed_res=");
            sb2.append(this.f45141d.longValue() - this.f45140c.longValue());
        }
        if (this.f45142e != null && this.f45141d != null) {
            sb2.append(", ad_loaded_result=");
            sb2.append(this.f45142e.longValue() - this.f45141d.longValue());
        }
        if (this.f45143f != null && this.f45142e != null) {
            sb2.append(", publisher_notified=");
            sb2.append(this.f45143f.longValue() - this.f45142e.longValue());
        }
        if (this.f45144g != null && this.f45138a != null) {
            sb2.append(", roundtrip=");
            sb2.append(this.f45144g.longValue() - this.f45138a.longValue());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
