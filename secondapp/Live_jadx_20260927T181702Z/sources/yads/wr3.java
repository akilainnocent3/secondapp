package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wr3 implements uh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstreamAdBreakEventListener f157491a;

    public wr3(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f157491a = instreamAdBreakEventListener;
    }

    @Override // yads.uh1
    public final void onInstreamAdBreakCompleted() {
        new CallbackStackTraceMarker(new sr3(this));
    }

    @Override // yads.uh1
    public final void onInstreamAdBreakError(String str) {
        new CallbackStackTraceMarker(new tr3(this, str));
    }

    @Override // yads.uh1
    public final void onInstreamAdBreakPrepared() {
        new CallbackStackTraceMarker(new ur3(this));
    }

    @Override // yads.uh1
    public final void onInstreamAdBreakStarted() {
        new CallbackStackTraceMarker(new vr3(this));
    }
}
