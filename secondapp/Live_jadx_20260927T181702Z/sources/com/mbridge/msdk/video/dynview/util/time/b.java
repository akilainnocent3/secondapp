package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f70837a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f70838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f70839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f70840d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f70841a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f70841a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f70841a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f70841a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f70838b = j10;
        return this;
    }

    public b b(long j10) {
        this.f70837a = j10;
        return this;
    }

    public void c() {
        if (this.f70840d == null) {
            b();
        }
        this.f70840d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f70839c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.f70840d;
        if (aVar != null) {
            aVar.cancel();
            this.f70840d = null;
        }
        if (this.f70838b <= 0) {
            this.f70838b = this.f70837a + 1000;
        }
        a aVar2 = new a(this.f70837a, this.f70838b);
        this.f70840d = aVar2;
        aVar2.a(this.f70839c);
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f70837a = j10;
        this.f70839c = aVar;
        b();
        a aVar2 = this.f70840d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.f70840d;
        if (aVar != null) {
            aVar.cancel();
            this.f70840d = null;
        }
    }
}
