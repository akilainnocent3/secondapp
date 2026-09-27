package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Z0 extends C4299ge {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f60385h = "type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f60386i = "numOfAdUnits";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f60387j = "firstCampaignCredits";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f60388k = "totalNumberCredits";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f60389l = "productType";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f60394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f60395g;

    public Z0(String str) {
        super(str);
        if (a(f60385h)) {
            k(d(f60385h));
        }
        if (a(f60386i)) {
            h(d(f60386i));
            a(true);
        } else {
            a(false);
        }
        if (a(f60387j)) {
            g(d(f60387j));
        }
        if (a(f60388k)) {
            j(d(f60388k));
        }
        if (a(f60389l)) {
            i(d(f60389l));
        }
    }

    private void a(boolean z10) {
        this.f60395g = z10;
    }

    public String b() {
        return this.f60393e;
    }

    public String c() {
        return this.f60392d;
    }

    public String d() {
        return this.f60391c;
    }

    public String e() {
        return this.f60394f;
    }

    public String f() {
        return this.f60390b;
    }

    public void g(String str) {
        this.f60393e = str;
    }

    public void h(String str) {
        this.f60392d = str;
    }

    public void i(String str) {
        this.f60391c = str;
    }

    public void j(String str) {
        this.f60394f = str;
    }

    public void k(String str) {
        this.f60390b = str;
    }

    public boolean g() {
        return this.f60395g;
    }
}
