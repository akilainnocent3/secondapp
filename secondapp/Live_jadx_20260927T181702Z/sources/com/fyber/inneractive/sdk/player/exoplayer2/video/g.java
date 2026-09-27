package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f47204e = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f47205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f47206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Choreographer f47207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47208d;

    public g() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f47206b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f47205a = j10;
        this.f47207c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f47207c = Choreographer.getInstance();
            return true;
        }
        if (i10 == 1) {
            int i11 = this.f47208d + 1;
            this.f47208d = i11;
            if (i11 == 1) {
                this.f47207c.postFrameCallback(this);
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        int i12 = this.f47208d - 1;
        this.f47208d = i12;
        if (i12 == 0) {
            this.f47207c.removeFrameCallback(this);
            this.f47205a = 0L;
        }
        return true;
    }
}
