package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.yandex.div.core.timer.TimerController;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47289a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f47296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f47297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Surface f47298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceHolder f47299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f47300l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerThread f47302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f47303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f47304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f47305q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.enums.b f47290b = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47291c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47292d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47293e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47294f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47295g = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f47301m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f47306r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f47307s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f47308t = 0;

    public p(Context context, n nVar, Handler handler) {
        this.f47289a = context;
        this.f47297i = nVar;
        this.f47296h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f47302n = handlerThread;
        handlerThread.start();
        this.f47303o = new Handler(this.f47302n.getLooper());
        this.f47305q = new b(this);
    }

    public static void b(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.e(strB + "timelog: release took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public static void c(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f47290b;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress) {
            super.start();
            pVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        } else {
            IAlog.a("%s Start called in wrong mState! %s", pVar.b(), bVar);
            if (pVar.f47290b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                pVar.f47291c = true;
            }
        }
        IAlog.e(strB + "timelog: start took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final boolean a() {
        return (this.f47290b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.f47290b == com.fyber.inneractive.sdk.player.enums.b.Preparing) ? false : true;
    }

    public final void d() {
        this.f47292d = true;
        if (a()) {
            a(new l(this));
        } else {
            IAlog.a("%s mute called when player is not ready!", b());
        }
        IAlog.a("%s mute", b());
    }

    public final void e() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = this.f47290b;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Idle;
        if (bVar == bVar2) {
            IAlog.a("%s reset called, but player is already resetted. Do nothing", b());
            return;
        }
        a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.e(strB + "timelog: " + TimerController.RESET_COMMAND + " took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.f47306r;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.f47308t;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.f47307s;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        return a() && this.f47290b != com.fyber.inneractive.sdk.player.enums.b.Paused && super.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        a(com.fyber.inneractive.sdk.player.enums.b.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.f("%s onError code = %d code2 = %d", b(), Integer.valueOf(i10), Integer.valueOf(i11));
        e();
        this.f47296h.post(new a(this, i10, i11));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("%s onPrepared %s gotPrepared = %s", b(), this, Boolean.valueOf(this.f47295g));
        IAlog.a("%sMedia prepare time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f47300l));
        if (this.f47290b != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.f47290b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.f("%s onPrepared: previous error encountered. Aborting", b());
        } else if (this.f47295g) {
            IAlog.a("%s onPrepared called again??? We are already prepared", b());
        } else {
            this.f47295g = true;
            c();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.a("%s onSeekComplete called current position = %d", b(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f47290b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.a("%s onSeekComplete called when Story is not seeking", b());
            return;
        }
        if (this.f47292d) {
            d();
        }
        if (!this.f47291c) {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = false", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Paused);
        } else {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = true", b());
            this.f47290b = com.fyber.inneractive.sdk.player.enums.b.Paused;
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.a("%s onVideoSizeChanged %d, %d", b(), Integer.valueOf(i10), Integer.valueOf(i11));
        if (this.f47294f) {
            return;
        }
        c cVar = this.f47304p;
        if (cVar != null) {
            r.f47892b.removeCallbacks(cVar);
            IAlog.a("%s onVideoSizeChanged cancelling prepared runnable", b());
        }
        this.f47294f = true;
        if (i10 == 0 || i11 == 0) {
            IAlog.f("%s onVideoSizeChanged - Invalid video size!", b());
            onError(this, 0, 0);
        } else {
            IAlog.a("%sMedia got video size time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f47300l));
            this.f47307s = i10;
            this.f47308t = i11;
            c();
        }
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.f47290b != com.fyber.inneractive.sdk.player.enums.b.Idle && this.f47290b != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f47290b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Paused;
            if (bVar != bVar2 && this.f47290b != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                a(bVar2);
                if (a()) {
                    a(new k(this));
                } else {
                    IAlog.a("%s paused called when player is not ready!", b());
                }
                IAlog.a("%s pause", b());
                return;
            }
        }
        IAlog.a("%s paused called when player is in mState: %s ignoring", b(), this.f47290b);
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.f47293e) {
            a(new g(this));
        }
        this.f47297i = null;
        this.f47305q = null;
        this.f47293e = true;
        IAlog.a("%s release called", b());
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        IAlog.a("%s reset called", b());
        c cVar = this.f47304p;
        if (cVar != null) {
            r.f47892b.removeCallbacks(cVar);
        }
        a(new h(this));
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.a("%s setDisplay called", b());
        if (!a()) {
            IAlog.a("%s setDisplay called when player is not ready!", b());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f47299k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.a("%s setDisplay called with existing surface. ignoring!", b());
        } else {
            this.f47299k = surfaceHolder;
            a(new e(this, surfaceHolder));
        }
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(Surface surface) {
        IAlog.a("%s setSurface called", b());
        Surface surface2 = this.f47298j;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.a("%s setSurface called with existing surface. ignoring!", b());
        } else {
            this.f47298j = surface;
            a(new f(this, surface));
        }
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        IAlog.a("%s Start called", b());
        if (!a()) {
            IAlog.a("%s MediaPlayer: Start called when player is not ready! - mState = %s", b(), this.f47290b);
            return;
        }
        if (this.f47290b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            this.f47291c = true;
        } else if (isPlaying()) {
            IAlog.a("%s MediaPlayer: Start called when player is already playing. do nothing", b());
        } else {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            a(new i(this));
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a()) {
            super.stop();
        }
        IAlog.a("%s stop called", b());
        IAlog.e(strB + "timelog: " + TimerController.STOP_COMMAND + " took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final void a(String str) {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f47294f = false;
        this.f47295g = false;
        if (isPlaying()) {
            IAlog.a("%s loadUri stopping play before refresh", b());
            stop();
        }
        this.f47300l = System.currentTimeMillis();
        e();
        IAlog.a("%s calling setDataSource with %s", b(), str);
        try {
            setDataSource(str);
            IAlog.a("%s setDataSource succeeded, calling prepareAsync", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e10) {
                IAlog.b("%s prepareAsync failed with illegal mState exception: %s", b(), e10.getMessage());
                this.f47301m++;
                if (this.f47301m < 5) {
                    a(str);
                }
                this.f47301m = 0;
            }
            IAlog.e(strB + "timelog: loadUri took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e11) {
            IAlog.b("%s error setting data source %s", b(), str);
            IAlog.b("%s exception message: %s", b(), e11.getMessage());
        }
    }

    public static void d(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.a("%s paused called cannot set to pause, canceled", pVar.b());
        }
        IAlog.e(strB + "timelog: delayed pause took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final String b() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + TokenBuilder.TOKEN_DELIMITER + Thread.currentThread().getName() + ": ";
    }

    public final void c() {
        if (this.f47295g) {
            if (this.f47294f) {
                IAlog.a("%sMedia load time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f47300l));
                this.f47306r = super.getDuration();
                a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                if (this.f47292d) {
                    d();
                    return;
                }
                return;
            }
            IAlog.a("%sGot prepared only, waiting for video size", b());
            if (this.f47304p == null) {
                this.f47304p = new c(this);
            }
            r.f47892b.postDelayed(this.f47304p, 2000L);
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%s updatePlayerState - %s", b(), bVar);
        if (this.f47290b == bVar) {
            IAlog.a("%s updatePlayerState - mState didn't change!", b());
            return;
        }
        IAlog.a("%s updatePlayerState - changing from %s to %s", b(), this.f47290b, bVar);
        this.f47290b = bVar;
        this.f47296h.post(new d(this, bVar));
    }

    public static void a(p pVar, Surface surface) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setSurface called with %s", pVar.b(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.a("%s setSurface with null! current surface cleared", pVar.b());
            } else {
                IAlog.a("%s setSurface - replacing surface!", pVar.b());
            }
            IAlog.e(strB + "timelog: setSurface took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setSurface threw exception!", pVar.b());
        }
    }

    public static void a(p pVar, SurfaceHolder surfaceHolder) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setDisplay called with %s", pVar.b(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.a("%s setDisplay with null! current display cleared", pVar.b());
            } else {
                IAlog.a("%s setDisplay - replacing surface holder!", pVar.b());
            }
            IAlog.e(strB + "timelog: setDisplayInternal took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setDisplay threw exception!", pVar.b());
        }
    }

    public final void a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f47302n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f47302n.isInterrupted() && (handler2 = this.f47303o) != null) {
            handler2.post(runnable);
        }
        if ((this.f47307s == 0 || this.f47308t == 0 || this.f47306r == 0) && (handler = this.f47303o) != null) {
            handler.post(this.f47305q);
        }
    }

    public static void a(p pVar) {
        if (pVar.a()) {
            pVar.f47307s = super.getVideoWidth();
            pVar.f47308t = super.getVideoHeight();
            pVar.f47306r = super.getDuration();
        }
    }
}
