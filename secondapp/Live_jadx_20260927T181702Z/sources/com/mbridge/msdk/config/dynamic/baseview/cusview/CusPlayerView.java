package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.gms.internal.ads.v;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f65812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f65813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f65814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f65815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f65816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f65817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceHolder f65818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f65819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f65820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f65821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f65822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MediaEvents f65823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f65824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AudioManager f65825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f65826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f65827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f65828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f65829r;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            CusPlayerView.this.a(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements SurfaceHolder.Callback {
        private b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f65812a != null && surfaceHolder != null && CusPlayerView.this.f65818g != surfaceHolder) {
                    CusPlayerView.this.f65818g = surfaceHolder;
                    CusPlayerView.this.f65812a.a(surfaceHolder);
                }
                CusPlayerView.this.f65815d = false;
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f65812a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f65818g = surfaceHolder;
                CusPlayerView.this.f65812a.a(surfaceHolder);
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f65815d = true;
                CusPlayerView.this.f65817f = true;
                CusPlayerView.this.f65812a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        public /* synthetic */ b(CusPlayerView cusPlayerView, a aVar) {
            this();
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65814c = false;
        this.f65815d = false;
        this.f65816e = false;
        this.f65817f = false;
        this.f65821j = 1;
        this.f65822k = false;
        this.f65824m = "";
        this.f65827p = false;
        this.f65828q = false;
        this.f65829r = true;
        b();
    }

    private void c() {
        try {
            this.f65825n = (AudioManager) getContext().getSystemService("audio");
            this.f65826o = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e10) {
            q0.b("PlayerView", "Failed to initialize AudioManager: " + e10.getMessage());
        }
    }

    private void d() {
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f65818g = holder;
        holder.setKeepScreenOn(true);
        this.f65818g.addCallback(new b(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f65812a = bVar;
        bVar.a(getContext(), this.f65818g);
        addView(surfaceView, -1, -1);
    }

    private boolean e() {
        int i10;
        try {
            if (this.f65825n == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z10 = true;
            if (this.f65828q) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i10 = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i10 = 1;
            }
            if (this.f65825n.requestAudioFocus(this.f65826o, 3, i10) != 1) {
                z10 = false;
            }
            this.f65827p = z10;
            return z10;
        } catch (Exception e10) {
            q0.b("PlayerView", "Error requesting audio focus: " + e10.getMessage());
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f65812a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (this.f65812a.f() && !this.f65817f) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public int getCurPosition() {
        long jC;
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
            jC = bVar != null ? bVar.c() : 0L;
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
        return v.a(jC);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f65824m;
    }

    public MediaEvents getVideoEvents() {
        return this.f65823l;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.f65813b = str;
        this.f65812a.a(aVar);
        this.f65812a.c(this.f65813b);
        this.f65814c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
            return bVar != null && bVar.g();
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f65828q;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f65829r;
    }

    public boolean isSilent() {
        return this.f65812a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f65819h = motionEvent.getRawX();
        this.f65820i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f65812a == null || this.f65815d || isComplete() || this.f65816e) {
                return;
            }
            q0.c("PlayerView", "onresume========");
            if (this.f65812a.f()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
            if (bVar != null) {
                bVar.m();
            }
            pauseOmsdk();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.f65823l == null || this.f65822k) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.f65822k = true;
            this.f65823l.pause();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean playVideo(int i10) {
        try {
            if (this.f65812a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f65814c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f65812a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.f65829r) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f65812a.j();
                }
            }
            this.f65812a.a(i10);
            this.f65817f = false;
            return true;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.f65823l != null) {
                this.f65823l = null;
            }
            a();
            if (this.f65818g != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.f65818g.getSurface().release();
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.f65823l;
            if (mediaEvents != null) {
                this.f65822k = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f65812a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
            if (bVar != null) {
                bVar.a(i10);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsCovered(boolean z10) {
        try {
            this.f65816e = z10;
            q0.b("PlayerView", "mIsCovered:" + z10);
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i10) {
        this.f65828q = i10 == 1;
    }

    public void setPlayWithoutAudioFocus(boolean z10) {
        this.f65829r = z10;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z10);
    }

    public void setPlaybackParams(float f10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f65824m = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f65823l = mediaEvents;
    }

    public void setVolume(float f10, float f11) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
        if (bVar != null) {
            bVar.a(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            if (this.f65812a != null) {
                if (z10) {
                    if (e()) {
                        this.f65812a.t();
                    } else {
                        this.f65812a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
                if (bVar == null || this.f65816e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.f65823l != null) {
                this.f65823l = null;
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        try {
            if (i10 == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f65812a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                    return;
                }
                return;
            }
            if (i10 == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.f65827p = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f65812a;
                if (bVar2 == null || !bVar2.h()) {
                    return;
                }
                this.f65812a.m();
                return;
            }
            if (i10 == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.f65827p = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f65812a;
                if (bVar3 == null || !bVar3.h()) {
                    return;
                }
                this.f65812a.m();
                return;
            }
            if (i10 != 1) {
                return;
            }
            q0.c("PlayerView", "Audio focus gained");
            this.f65827p = true;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f65812a;
            if (bVar4 != null) {
                bVar4.a(1.0f, 1.0f);
                if (this.f65812a.h()) {
                    return;
                }
                this.f65812a.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", "Error handling audio focus change: " + e10.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    private void a() {
        try {
            AudioManager audioManager = this.f65825n;
            if (audioManager == null || !this.f65827p) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f65826o);
            this.f65827p = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e10) {
            q0.b("PlayerView", "Error abandoning audio focus: " + e10.getMessage());
        }
    }
}
