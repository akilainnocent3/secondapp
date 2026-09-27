package wn;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f143464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f143465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f143466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f143467g;

    public k(String sku, String title, String price, String description, String type, long price_amount_micros, String billingPeriod) {
        this.f143461a = sku;
        this.f143462b = title;
        this.f143463c = price;
        this.f143464d = description;
        this.f143465e = type;
        this.f143467g = price_amount_micros;
        this.f143466f = billingPeriod;
    }

    public String a() {
        return this.f143466f;
    }

    public String b() {
        return this.f143465e;
    }

    public String c() {
        return this.f143464d;
    }

    public String d() {
        return this.f143463c;
    }

    public long e() {
        return this.f143467g;
    }

    public String f() {
        return this.f143461a;
    }

    public String g() {
        return this.f143462b;
    }
}
