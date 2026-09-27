package com.mbridge.msdk.config.component.common.kit;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.omsdk.b;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdSession f65183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdEvents f65184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaEvents f65185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f65186d;

    private void b() {
        if (this.f65185c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSDKResume");
            this.f65185c.resume();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void c() {
        if (this.f65185c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffEnd");
            this.f65185c.bufferFinish();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void d() {
        if (this.f65185c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffStart");
            this.f65185c.bufferStart();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void f() {
        if (this.f65185c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkClick");
            this.f65185c.adUserInteraction(InteractionType.CLICK);
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void g() {
        if (this.f65183a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkDestory");
                this.f65183a.removeAllFriendlyObstructions();
                this.f65183a.finish();
                this.f65183a = null;
            } catch (Exception e10) {
                q0.b("OmSdkKit", e10.getMessage(), e10);
            }
        }
    }

    private void h() {
        if (this.f65185c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkPause");
            this.f65185c.pause();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void j() {
        if (this.f65185c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkSkipped");
            this.f65185c.skipped();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void k() {
        if (this.f65183a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkStart");
                this.f65183a.start();
                if (this.f65184b != null) {
                    this.f65184b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    this.f65184b.impressionOccurred();
                }
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f65186d;
                if (aVar != null && !aVar.d()) {
                    Object objB = this.f65186d.b("viewTag");
                    Object objB2 = this.f65186d.b("rootView");
                    if ((objB instanceof String) && (objB2 instanceof ViewGroup)) {
                        String strValueOf = String.valueOf(objB);
                        ViewGroup viewGroup = (ViewGroup) objB2;
                        this.f65183a.registerAdView(viewGroup.findViewWithTag(strValueOf));
                        Iterator<View> it = c.a(viewGroup, strValueOf).iterator();
                        while (it.hasNext()) {
                            this.f65183a.addFriendlyObstruction(it.next(), FriendlyObstructionPurpose.OTHER, null);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b("OmSdkKit", e10.getMessage(), e10);
            }
        }
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f65186d = aVar;
        a(str);
    }

    private void a(String str) {
        if (this.f65186d == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                g();
                break;
            case "PlayerPlayPlaying":
                b();
                break;
            case "PlayerPlayPause":
                h();
                break;
            case "PlayerPlayStart":
                k();
                break;
            case "onAdClick":
                f();
                break;
            case "onBufferingEnd":
                c();
                break;
            case "onCreate":
                a();
                break;
            case "PlayerPlayMuteChanged":
                e();
                break;
            case "PlayerProgressChanged":
                i();
                break;
            case "onBufferingStart":
                d();
                break;
            case "skipped":
                j();
                break;
        }
    }

    private void a() {
        try {
            if (this.f65186d.a((Object) "g0")) {
                Object objB = this.f65186d.b("g0");
                if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB;
                    AdSession adSessionA = b.a(com.mbridge.msdk.foundation.controller.c.n().d(), false, String.valueOf(aVar.b(CampaignEx.KEY_OMID)), String.valueOf(aVar.b("requestId")), String.valueOf(aVar.b("id")), String.valueOf(aVar.b("campaignUnitId")), String.valueOf(aVar.b("videoURL")), String.valueOf(aVar.b("requestNoticeId")));
                    this.f65183a = adSessionA;
                    if (adSessionA != null) {
                        this.f65184b = AdEvents.createAdEvents(adSessionA);
                        this.f65185c = MediaEvents.createMediaEvents(this.f65183a);
                    }
                }
            }
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void e() {
    }

    private void i() {
    }
}
