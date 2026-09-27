package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f70487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f70488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f70489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f70490d = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f70491a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f70491a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f70491a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f70491a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public void a() {
        a aVar = this.f70489c;
        if (aVar != null) {
            aVar.cancel();
            this.f70489c = null;
        }
    }

    public b b(long j10) {
        this.f70490d = j10;
        return this;
    }

    public void c() {
        if (this.f70489c == null) {
            b();
        }
        this.f70489c.start();
    }

    public void b() {
        a aVar = this.f70489c;
        if (aVar != null) {
            aVar.cancel();
            this.f70489c = null;
        }
        if (this.f70488b <= 0) {
            this.f70488b = this.f70490d + 1000;
        }
        a aVar2 = new a(this.f70490d, this.f70488b);
        this.f70489c = aVar2;
        aVar2.a(this.f70487a);
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f70488b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f70487a = aVar;
        return this;
    }
}
