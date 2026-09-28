package com.sportybet.plugin.event;

import com.sportybet.android.data.CallbackWrapper;
import com.sportybet.plugin.event.view.LiveEventVideoView;
import com.sportybet.plugin.realsports.data.LiveStreamDataWebView;
import com.sportybet.plugin.realsports.streaming.provider.img.api.data.IMGStreamResp;
import defpackage.agd0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends CallbackWrapper<IMGStreamResp> {
    public final /* synthetic */ EventActivity a;
    public final /* synthetic */ LiveStreamDataWebView b;

    public a(EventActivity eventActivity, LiveStreamDataWebView liveStreamDataWebView) {
        this.a = eventActivity;
        this.b = liveStreamDataWebView;
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseFailure(Throwable th) {
        EventActivity.b bVar = EventActivity.b.b;
        EventActivity eventActivity = this.a;
        eventActivity.q0 = bVar;
        agd0 agd0Var = eventActivity.R;
        if (agd0Var != null) {
            agd0Var.w.E(this.b, th);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseSuccess(IMGStreamResp iMGStreamResp) {
        IMGStreamResp iMGStreamResp2 = iMGStreamResp;
        iMGStreamResp2.getClass();
        String str = iMGStreamResp2.hlsUrl;
        if (str == null || str.length() == 0) {
            onResponseFailure(null);
            return;
        }
        EventActivity eventActivity = this.a;
        agd0 agd0Var = eventActivity.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventVideoView liveEventVideoView = agd0Var.w;
        Boolean boolD = eventActivity.H0.d();
        liveEventVideoView.G(str, this.b, boolD != null ? boolD.booleanValue() : false);
    }
}
