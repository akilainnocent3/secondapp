package w3;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f142083b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f142085d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f142090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f142091j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f142099r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f142084c = new MediaPlayer();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f142086e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f142087f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f142088g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f142089h = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f142092k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MediaPlayer.OnCompletionListener f142093l = new C1497c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaPlayer.OnBufferingUpdateListener f142094m = new d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MediaPlayer.OnVideoSizeChangedListener f142095n = new e();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MediaPlayer.OnErrorListener f142096o = new f();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MediaPlayer.OnSeekCompleteListener f142097p = new g();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MediaPlayer.OnInfoListener f142098q = new h();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.c().c(c.this);
            c cVar = c.this;
            cVar.f142087f.postDelayed(this, cVar.w());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            c cVar = c.this;
            cVar.f142088g = true;
            cVar.x();
            c cVar2 = c.this;
            if (cVar2.f142085d == null || cVar2.f142090i) {
                cVar2.c().i(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: w3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C1497c implements MediaPlayer.OnCompletionListener {
        public C1497c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            c.this.c().h(c.this);
            c.this.c().g(c.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements MediaPlayer.OnBufferingUpdateListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            c cVar = c.this;
            cVar.f142091j = (cVar.e() * ((long) i10)) / 100;
            c.this.c().a(c.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements MediaPlayer.OnVideoSizeChangedListener {
        public e() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            c.this.c().j(c.this, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements MediaPlayer.OnErrorListener {
        public f() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            k.a aVarC = c.this.c();
            c cVar = c.this;
            aVarC.e(cVar, i10, cVar.f142083b.getString(s3.a.l.f128860e, Integer.valueOf(i10), Integer.valueOf(i11)));
            return c.this.y(i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g implements MediaPlayer.OnSeekCompleteListener {
        public g() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            c.this.A();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements MediaPlayer.OnInfoListener {
        public h() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            boolean z10;
            if (i10 != 701) {
                if (i10 != 702) {
                    z10 = false;
                } else {
                    c cVar = c.this;
                    cVar.f142099r = false;
                    cVar.x();
                }
                return !z10 || c.this.z(i10, i11);
            }
            c cVar2 = c.this;
            cVar2.f142099r = true;
            cVar2.x();
            z10 = true;
            if (z10) {
            }
        }
    }

    public c(Context context) {
        this.f142083b = context;
    }

    public final void B() {
        D();
        try {
            Uri uri = this.f142089h;
            if (uri != null) {
                this.f142084c.setDataSource(this.f142083b, uri);
                this.f142084c.setAudioStreamType(3);
                this.f142084c.setOnPreparedListener(this.f142092k);
                this.f142084c.setOnVideoSizeChangedListener(this.f142095n);
                this.f142084c.setOnErrorListener(this.f142096o);
                this.f142084c.setOnSeekCompleteListener(this.f142097p);
                this.f142084c.setOnCompletionListener(this.f142093l);
                this.f142084c.setOnInfoListener(this.f142098q);
                this.f142084c.setOnBufferingUpdateListener(this.f142094m);
                x();
                this.f142084c.prepareAsync();
                c().h(this);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new RuntimeException(e10);
        }
    }

    public void C() {
        u();
        this.f142090i = false;
        this.f142084c.release();
    }

    public void D() {
        u();
        this.f142084c.reset();
    }

    public boolean E(Uri uri) {
        Uri uri2 = this.f142089h;
        if (uri2 != null) {
            if (uri2.equals(uri)) {
                return false;
            }
        } else if (uri == null) {
            return false;
        }
        this.f142089h = uri;
        B();
        return true;
    }

    public void F(SurfaceHolder surfaceHolder) {
        boolean z10 = this.f142090i;
        boolean z11 = surfaceHolder != null;
        this.f142090i = z11;
        if (z10 == z11) {
            return;
        }
        this.f142084c.setDisplay(surfaceHolder);
        if (this.f142090i) {
            if (this.f142088g) {
                c().i(this);
            }
        } else if (this.f142088g) {
            c().i(this);
        }
    }

    @Override // w3.k
    public long b() {
        return this.f142091j;
    }

    @Override // w3.k
    public long d() {
        if (this.f142088g) {
            return this.f142084c.getCurrentPosition();
        }
        return -1L;
    }

    @Override // w3.k
    public long e() {
        if (this.f142088g) {
            return this.f142084c.getDuration();
        }
        return -1L;
    }

    @Override // w3.k
    public boolean g() {
        return this.f142088g && this.f142084c.isPlaying();
    }

    @Override // w3.k
    public boolean h() {
        if (this.f142088g) {
            return this.f142085d == null || this.f142090i;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w3.k
    public void j(w3.i iVar) {
        if (iVar instanceof l) {
            l lVar = (l) iVar;
            this.f142085d = lVar;
            lVar.a(new i());
        }
    }

    @Override // w3.k
    public void k() {
        l lVar = this.f142085d;
        if (lVar != null) {
            lVar.a(null);
            this.f142085d = null;
        }
        D();
        C();
    }

    @Override // w3.k
    public void l() {
        if (g()) {
            this.f142084c.pause();
            c().h(this);
        }
    }

    @Override // w3.k
    public void m() {
        if (!this.f142088g || this.f142084c.isPlaying()) {
            return;
        }
        this.f142084c.start();
        c().h(this);
        c().c(this);
    }

    @Override // w3.k
    public void p(long j10) {
        if (this.f142088g) {
            this.f142084c.seekTo((int) j10);
        }
    }

    @Override // w3.k
    public void r(boolean z10) {
        this.f142087f.removeCallbacks(this.f142086e);
        if (z10) {
            this.f142087f.postDelayed(this.f142086e, w());
        }
    }

    public void u() {
        if (this.f142088g) {
            this.f142088g = false;
            x();
            if (this.f142090i) {
                c().i(this);
            }
        }
    }

    public final MediaPlayer v() {
        return this.f142084c;
    }

    public int w() {
        return 16;
    }

    public void x() {
        c().b(this, this.f142099r || !this.f142088g);
    }

    public boolean y(int i10, int i11) {
        return false;
    }

    public boolean z(int i10, int i11) {
        return false;
    }

    public void A() {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class i implements SurfaceHolder.Callback {
        public i() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            c.this.F(surfaceHolder);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            c.this.F(null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        }
    }
}
