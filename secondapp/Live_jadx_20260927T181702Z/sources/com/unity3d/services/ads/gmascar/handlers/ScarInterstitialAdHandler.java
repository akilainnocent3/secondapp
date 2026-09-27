package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import sp.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ScarInterstitialAdHandler extends ScarAdHandlerBase implements h {
    public ScarInterstitialAdHandler(d dVar, EventSubject<c> eventSubject, GMAEventSender gMAEventSender) {
        super(dVar, eventSubject, gMAEventSender);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.h
    public void onAdFailedToShow(int i10, String str) {
        this._gmaEventSender.send(c.INTERSTITIAL_SHOW_ERROR, this._scarAdMetadata.c(), this._scarAdMetadata.d(), str, Integer.valueOf(i10));
    }

    @Override // com.unity3d.scar.adapter.common.h
    public void onAdImpression() {
        this._gmaEventSender.send(c.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.h
    public void onAdLeftApplication() {
        this._gmaEventSender.send(c.AD_LEFT_APPLICATION, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.h
    public void onAdSkipped() {
        this._gmaEventSender.send(c.AD_SKIPPED, new Object[0]);
    }
}
