package com.bytedance.sdk.openadsdk.core.ny;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final AdEvents f36593hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final AdSession f36594hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected String f36595sd;
    protected VastProperties vy;
    private boolean vgm = false;
    protected boolean hww = false;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected int f36596tq = 0;

    public vgm(AdSession adSession, AdEvents adEvents, View view) {
        this.f36594hv = adSession;
        this.f36593hu = adEvents;
        this.f36595sd = adSession.getAdSessionId();
        hww(view);
    }

    public void hww(float f10, boolean z10) {
    }

    public void sd() {
        hww(4);
    }

    public void tq(int i10) {
    }

    public void vy() {
        hww(3);
    }

    public void hww(boolean z10) {
    }

    public void tq() {
        hww(1);
    }

    public void hww(boolean z10, float f10) {
    }

    public void hww(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.f36594hv) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void hww(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f36594hv;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean hww() {
        return this.hww;
    }

    public void hww(int i10) {
        int i11;
        if (this.f36594hv == null || this.f36593hu == null || !hv.sd()) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 || (i11 = this.f36596tq) == 0 || i11 == 4) {
                        return;
                    }
                    this.f36594hv.finish();
                    this.hww = false;
                } else {
                    if (this.vgm) {
                        return;
                    }
                    int i12 = this.f36596tq;
                    if (i12 != 1 && i12 != 2) {
                        return;
                    }
                    this.f36593hu.impressionOccurred();
                    this.vgm = true;
                }
            } else {
                if (this.f36596tq != 0) {
                    return;
                }
                this.f36594hv.start();
                if (this.vy == null) {
                    this.vy = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.f36593hu.loaded(this.vy);
                this.hww = true;
                this.vy = null;
            }
        } else {
            if (this.f36596tq != 0) {
                return;
            }
            this.f36594hv.start();
            this.f36593hu.loaded();
            this.hww = true;
        }
        this.f36596tq = i10;
    }

    public void hww(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            hww((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
