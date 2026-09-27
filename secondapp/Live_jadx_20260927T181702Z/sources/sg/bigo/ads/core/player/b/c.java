package sg.bigo.ads.core.player.b;

import android.media.MediaPlayer;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final AtomicBoolean f135217h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    MediaPlayer f135218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f135219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    a f135220c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f135222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f135223f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Surface f135226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f135227k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135230n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f135221d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Runnable f135224g = new Runnable() { // from class: sg.bigo.ads.core.player.b.c.1
        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.f135220c != null) {
                c.this.f135220c.i();
            }
            if (c.this.f135221d == 3 || c.this.f135221d == 4 || c.this.f135221d == 5) {
                return;
            }
            sg.bigo.ads.common.n.d.a(2, c.this.f135224g, 500L);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f135228l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f135229m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f135225i = 0;

    public interface a {
        void a(int i10, String str, int i11);

        void a(MediaPlayer mediaPlayer, int i10);

        boolean a(int i10);

        boolean a(int i10, int i11);

        void f();

        void g();

        void h();

        void i();

        void j();

        void j_();

        void k();
    }

    public c() {
        this.f135230n = false;
        this.f135230n = i.f132716a.n().a(3);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f135218a = new MediaPlayer();
        f135217h.set(false);
        this.f135218a.setOnCompletionListener(this);
        this.f135218a.setOnErrorListener(this);
        this.f135218a.setOnInfoListener(this);
        this.f135218a.setOnPreparedListener(this);
        this.f135218a.setOnVideoSizeChangedListener(this);
        this.f135218a.setOnBufferingUpdateListener(this);
    }

    private boolean i() {
        return !this.f135230n || this.f135225i >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        try {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "prepareAsync");
            this.f135227k = SystemClock.elapsedRealtime();
            this.f135218a.prepareAsync();
            return true;
        } catch (Exception e10) {
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.a(10, Log.getStackTraceString(e10), this.f135225i);
            }
            b(10);
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "Player prepareAsync failed");
            return false;
        }
    }

    public final int c() {
        try {
            if (this.f135222e) {
                return this.f135218a.getCurrentPosition();
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getCurrentPosition failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e10) {
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.a(5, Log.getStackTraceString(e10), this.f135225i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getCurrentPosition IllegalStateException");
            return 0;
        }
    }

    public final boolean d() {
        try {
            this.f135218a.stop();
            sg.bigo.ads.common.n.d.a(this.f135224g);
            this.f135221d = 4;
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "stop play");
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.h();
            }
            return true;
        } catch (IllegalStateException e10) {
            a aVar2 = this.f135220c;
            if (aVar2 != null) {
                aVar2.a(6, Log.getStackTraceString(e10), this.f135225i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to stop video: " + e10.getMessage());
            return false;
        }
    }

    public final void e() {
        try {
            this.f135218a.release();
            f135217h.set(true);
            sg.bigo.ads.common.n.d.a(this.f135224g);
        } catch (IllegalStateException e10) {
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.a(7, Log.getStackTraceString(e10), this.f135225i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "player release IllegalStateException");
        }
        this.f135221d = 0;
        this.f135222e = false;
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "player release called");
    }

    public final int f() {
        try {
            if (this.f135222e) {
                return this.f135218a.getDuration();
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getDuration failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e10) {
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.a(8, Log.getStackTraceString(e10), this.f135225i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getDuration IllegalStateException");
            return 0;
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "onBufferingUpdate percent = ".concat(String.valueOf(i10)));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        sg.bigo.ads.common.n.d.a(this.f135224g);
        a aVar = this.f135220c;
        if (aVar != null) {
            this.f135221d = 5;
            aVar.j();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        a aVar;
        if (i() && (aVar = this.f135220c) != null) {
            return aVar.a(i10, i11);
        }
        sg.bigo.ads.common.n.d.a(this.f135224g);
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        a aVar = this.f135220c;
        if (aVar != null) {
            return aVar.a(i10);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (!this.f135223f) {
            sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Surface is not available, do prepare cancel");
            return;
        }
        if (this.f135229m.get()) {
            sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Destroy Has Called");
            return;
        }
        this.f135221d = 1;
        this.f135222e = true;
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "onPrepared called cost = " + (SystemClock.elapsedRealtime() - this.f135227k));
        a aVar = this.f135220c;
        if (aVar != null) {
            aVar.a(mediaPlayer, this.f135225i);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        a aVar = this.f135220c;
        if (aVar != null) {
            aVar.k();
        }
    }

    public final void a(Surface surface) {
        try {
            this.f135226j = surface;
            this.f135218a.setSurface(surface);
            this.f135223f = true;
        } catch (Exception e10) {
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.a(12, Log.getStackTraceString(e10), this.f135225i);
            }
            b(12);
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "setSurface IllegalStateException");
        }
    }

    public final void b(final int i10) {
        if (!this.f135230n) {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "createMediaPlayerWhenException switch is off");
            return;
        }
        int i11 = this.f135225i;
        if (i11 >= 3) {
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.a(i10, "retry times has reached limit", i11);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "createMediaPlayer times reach the limit(3 times), stop creating");
            return;
        }
        this.f135225i = i11 + 1;
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "start to create mediaPlayer, retry time: " + this.f135225i);
        e();
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.player.b.c.3
            @Override // java.lang.Runnable
            public final void run() {
                c.this.h();
                int i12 = i10;
                if (i12 != 9 && i12 != 10) {
                    if (i12 == 12) {
                        c cVar = c.this;
                        cVar.a(cVar.f135226j);
                        return;
                    } else if (i12 != 15) {
                        return;
                    }
                }
                c cVar2 = c.this;
                cVar2.a(cVar2.f135226j);
                c cVar3 = c.this;
                cVar3.a(cVar3.f135219b);
            }
        });
    }

    public final void g() {
        this.f135229m.set(true);
    }

    public final void a(final String str) {
        if (q.a((CharSequence) str)) {
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "invalidate file path, set data source failed");
        } else {
            this.f135219b = str;
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.b(str)) {
                        c.this.j();
                    }
                }
            });
        }
    }

    public final boolean b() {
        try {
            this.f135218a.pause();
            sg.bigo.ads.common.n.d.a(this.f135224g);
            this.f135221d = 3;
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "pauseAd play");
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.g();
            }
            return true;
        } catch (IllegalStateException e10) {
            a aVar2 = this.f135220c;
            if (aVar2 != null) {
                aVar2.a(4, Log.getStackTraceString(e10), this.f135225i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to pause video: " + e10.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(@NonNull String str) {
        try {
            if (!this.f135223f) {
                sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Surface is not available, setDataSource cancel");
                return false;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "player setDataSource, path = ".concat(String.valueOf(str)));
            this.f135218a.reset();
            this.f135218a.setDataSource(str);
            return true;
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "Player setDataSource failed");
            if (this.f135220c != null) {
                if (i()) {
                    sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "setDataSource called onError");
                    this.f135220c.a(1, -1004);
                }
                this.f135220c.a(9, Log.getStackTraceString(e10), this.f135225i);
            }
            b(9);
            return false;
        }
    }

    public final boolean a() {
        try {
            if (this.f135222e && this.f135223f) {
                if (this.f135218a.isPlaying()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "startAd but is playing, return.");
                    return true;
                }
                this.f135218a.start();
                if (!this.f135228l) {
                    this.f135228l = true;
                    a aVar = this.f135220c;
                    if (aVar != null) {
                        aVar.j_();
                    }
                }
                this.f135221d = 2;
                sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "startAd play called ");
                sg.bigo.ads.common.n.d.a(this.f135224g);
                sg.bigo.ads.common.n.d.a(2, this.f135224g);
                a aVar2 = this.f135220c;
                if (aVar2 != null) {
                    aVar2.f();
                }
                return true;
            }
            sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Surface is not available or player unprepared, do start play cancel");
            return false;
        } catch (IllegalStateException e10) {
            a aVar3 = this.f135220c;
            if (aVar3 != null) {
                aVar3.a(3, Log.getStackTraceString(e10), this.f135225i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to play video: " + e10.getMessage());
            return false;
        }
    }

    public final boolean a(int i10) {
        try {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "seekTo : ".concat(String.valueOf(i10)));
            this.f135218a.seekTo(i10);
            return true;
        } catch (IllegalStateException e10) {
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.a(1, Log.getStackTraceString(e10), this.f135225i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "The video failed to seek:" + e10.getMessage());
            return false;
        }
    }

    public final boolean a(boolean z10) {
        try {
            if (z10) {
                this.f135218a.setVolume(0.0f, 0.0f);
                return z10;
            }
            this.f135218a.setVolume(1.0f, 1.0f);
            return z10;
        } catch (IllegalStateException e10) {
            a aVar = this.f135220c;
            if (aVar != null) {
                aVar.a(14, Log.getStackTraceString(e10), this.f135225i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "The video failed to set volume: " + e10.getMessage());
            return z10;
        }
    }
}
