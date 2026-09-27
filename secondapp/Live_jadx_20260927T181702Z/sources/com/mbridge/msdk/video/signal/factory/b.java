package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Activity f71526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebView f71527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f71528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f71529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CampaignEx f71530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f71531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.a.InterfaceC0714a f71532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f71533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f71534p;

    public b(Activity activity) {
        this.f71526h = activity;
    }

    public void a(k kVar) {
        this.f71520b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f71527i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f71519a == null) {
            this.f71519a = new i(webView);
        }
        return this.f71519a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f71529k;
        if (mBridgeContainerView == null || (activity = this.f71526h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f71524f == null) {
            this.f71524f = new o(activity, mBridgeContainerView);
        }
        return this.f71524f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f71526h == null || this.f71531m == null) {
            return super.getJSBTModule();
        }
        if (this.f71525g == null) {
            this.f71525g = new j(this.f71526h, this.f71531m);
        }
        return this.f71525g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f71526h;
        if (activity == null || (campaignEx = this.f71530l) == null) {
            return super.getJSCommon();
        }
        if (this.f71520b == null) {
            this.f71520b = new k(activity, campaignEx);
        }
        if (this.f71530l.getDynamicTempCode() == 5 && (list = this.f71534p) != null) {
            d dVar = this.f71520b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f71520b.setActivity(this.f71526h);
        this.f71520b.setUnitId(this.f71533o);
        this.f71520b.a(this.f71532n);
        return this.f71520b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f71529k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f71523e == null) {
            this.f71523e = new m(mBridgeContainerView);
        }
        return this.f71523e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f71527i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f71522d == null) {
            this.f71522d = new n(webView);
        }
        return this.f71522d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f71528j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f71521c == null) {
            this.f71521c = new q(mBridgeVideoView);
        }
        return this.f71521c;
    }

    public void a(List<CampaignEx> list) {
        this.f71534p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f71526h = activity;
        this.f71531m = mBridgeBTContainer;
        this.f71527i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a) {
        this.f71526h = activity;
        this.f71527i = webView;
        this.f71528j = mBridgeVideoView;
        this.f71529k = mBridgeContainerView;
        this.f71530l = campaignEx;
        this.f71532n = interfaceC0714a;
        this.f71533o = mBridgeVideoView.getUnitId();
    }
}
