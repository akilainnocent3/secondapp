package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pricing f44556a = new Pricing();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Video f44557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f44559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f44564i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Pricing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f44565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f44566b;

        public String getCurrency() {
            return this.f44566b;
        }

        public double getValue() {
            return this.f44565a;
        }

        public void setValue(double d10) {
            this.f44565a = d10;
        }

        public String toString() {
            return "Pricing{value=" + this.f44565a + ", currency='" + this.f44566b + "'}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Video {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f44567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f44568b;

        public Video(boolean z10, long j10) {
            this.f44567a = z10;
            this.f44568b = j10;
        }

        public long getDuration() {
            return this.f44568b;
        }

        public boolean isSkippable() {
            return this.f44567a;
        }

        public String toString() {
            return "Video{skippable=" + this.f44567a + ", duration=" + this.f44568b + fw.b.f85383j;
        }
    }

    public String getAdvertiserDomain() {
        return this.f44564i;
    }

    public String getCampaignId() {
        return this.f44563h;
    }

    public String getCountry() {
        return this.f44560e;
    }

    public String getCreativeId() {
        return this.f44562g;
    }

    public Long getDemandId() {
        return this.f44559d;
    }

    public String getDemandSource() {
        return this.f44558c;
    }

    public String getImpressionId() {
        return this.f44561f;
    }

    public Pricing getPricing() {
        return this.f44556a;
    }

    public Video getVideo() {
        return this.f44557b;
    }

    public void setAdvertiserDomain(String str) {
        this.f44564i = str;
    }

    public void setCampaignId(String str) {
        this.f44563h = str;
    }

    public void setCountry(String str) {
        this.f44560e = str;
    }

    public void setCpmValue(String str) {
        double d10;
        try {
            d10 = Double.parseDouble(str);
        } catch (Exception unused) {
            d10 = 0.0d;
        }
        this.f44556a.f44565a = d10;
    }

    public void setCreativeId(String str) {
        this.f44562g = str;
    }

    public void setCurrency(String str) {
        this.f44556a.f44566b = str;
    }

    public void setDemandId(Long l10) {
        this.f44559d = l10;
    }

    public void setDemandSource(String str) {
        this.f44558c = str;
    }

    public void setDuration(long j10) {
        this.f44557b.f44568b = j10;
    }

    public void setImpressionId(String str) {
        this.f44561f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f44556a = pricing;
    }

    public void setVideo(Video video) {
        this.f44557b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f44556a + ", video=" + this.f44557b + ", demandSource='" + this.f44558c + "', country='" + this.f44560e + "', impressionId='" + this.f44561f + "', creativeId='" + this.f44562g + "', campaignId='" + this.f44563h + "', advertiserDomain='" + this.f44564i + "'}";
    }
}
