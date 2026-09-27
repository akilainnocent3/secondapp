package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f68744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f68745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68746c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68747d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68748e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68749f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68750g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68751h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f68744a = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f68744a;
    }

    public int c() {
        return this.f68750g;
    }

    public int d() {
        return this.f68749f;
    }

    public boolean e() {
        return this.f68746c;
    }

    public void a(boolean z10) {
        this.f68746c = z10;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f68745b = campaignEx;
            this.f68747d = campaignEx.getSecondRequestIndex();
            this.f68748e = campaignEx.getSecondShowIndex();
            this.f68749f = campaignEx.getFilterCallBackState();
            this.f68751h = campaignEx.getFilterAdsShowCallState();
            this.f68750g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.f68747d == 1 && this.f68746c;
    }
}
