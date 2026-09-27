package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class th3 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final th3 f155917f = new th3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f155918b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f155919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Choreographer f155920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f155921e;

    public th3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handlerA = ib3.a(handlerThread.getLooper(), (Handler.Callback) this);
        this.f155919c = handlerA;
        handlerA.sendEmptyMessage(0);
    }

    public static th3 a() {
        return f155917f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f155918b = j10;
        Choreographer choreographer = this.f155920d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.f155920d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                ih1.d("VideoFrameReleaseHelper", ih1.a("Vsync sampling disabled due to platform error", e10));
            }
            return true;
        }
        if (i10 == 1) {
            Choreographer choreographer = this.f155920d;
            if (choreographer != null) {
                int i11 = this.f155921e + 1;
                this.f155921e = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f155920d;
        if (choreographer2 != null) {
            int i12 = this.f155921e - 1;
            this.f155921e = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f155918b = -9223372036854775807L;
            }
        }
        return true;
    }
}
