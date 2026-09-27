package com.bykv.vk.openvk.hww.hww.tq.sd;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ironsource.C4235d4;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq extends com.bykv.vk.openvk.hww.hww.tq.sd.hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final Object f31622hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Surface f31623hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final hww f31624sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final MediaPlayer f31625tq;
    private volatile boolean vgm;
    private com.bykv.vk.openvk.hww.hww.tq.hww.hww vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<tq> hww;

        public hww(tq tqVar) {
            this.hww = new WeakReference<>(tqVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                tq tqVar = this.hww.get();
                if (tqVar != null) {
                    tqVar.hww(i10);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                tq tqVar = this.hww.get();
                if (tqVar != null) {
                    tqVar.sd();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                tq tqVar = this.hww.get();
                return tqVar != null && tqVar.hww(i10, i11);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                tq tqVar = this.hww.get();
                return tqVar != null && tqVar.tq(i10, i11);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                tq tqVar = this.hww.get();
                if (tqVar != null) {
                    tqVar.tq();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                tq tqVar = this.hww.get();
                if (tqVar != null) {
                    tqVar.vy();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                tq tqVar = this.hww.get();
                if (tqVar != null) {
                    tqVar.hww(i10, i11, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public tq() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f31622hu = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f31625tq = mediaPlayer;
        }
        hww(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.f31624sd = new hww(this);
        bs();
    }

    private void bs() {
        this.f31625tq.setOnPreparedListener(this.f31624sd);
        this.f31625tq.setOnBufferingUpdateListener(this.f31624sd);
        this.f31625tq.setOnCompletionListener(this.f31624sd);
        this.f31625tq.setOnSeekCompleteListener(this.f31624sd);
        this.f31625tq.setOnVideoSizeChangedListener(this.f31624sd);
        this.f31625tq.setOnErrorListener(this.f31624sd);
        this.f31625tq.setOnInfoListener(this.f31624sd);
    }

    private void hww(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.hww.hww.hww.sd.hww(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    private void jpb() {
        try {
            Surface surface = this.f31623hv;
            if (surface != null) {
                surface.release();
                this.f31623hv = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void wgt() {
        com.bykv.vk.openvk.hww.hww.tq.hww.hww hwwVar = this.vy;
        if (hwwVar != null) {
            try {
                hwwVar.close();
            } catch (Throwable unused) {
            }
            this.vy = null;
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void ed() throws Throwable {
        try {
            this.f31625tq.reset();
        } catch (Throwable unused) {
        }
        wgt();
        hww();
        bs();
    }

    public void finalize() throws Throwable {
        super.finalize();
        jpb();
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void hu() throws Throwable {
        this.f31625tq.start();
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public PlaybackParams hv() throws IllegalStateException {
        return this.f31625tq.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public int khx() {
        MediaPlayer mediaPlayer = this.f31625tq;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public long nod() {
        try {
            return this.f31625tq.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void ny() throws Throwable {
        synchronized (this.f31622hu) {
            try {
                if (!this.vgm) {
                    this.f31625tq.release();
                    this.vgm = true;
                    jpb();
                    wgt();
                    hww();
                    bs();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void ok() throws Throwable {
        this.f31625tq.pause();
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void rs() {
        MediaPlayer mediaPlayer = this.f31625tq;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void sd(boolean z10) throws Throwable {
        this.f31625tq.setLooping(z10);
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void tq(boolean z10) throws Throwable {
        this.f31625tq.setScreenOnWhilePlaying(z10);
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void vgm() throws Throwable {
        this.f31625tq.stop();
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public long vhb() {
        try {
            return this.f31625tq.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void vy(boolean z10) throws Throwable {
        MediaPlayer mediaPlayer = this.f31625tq;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public int weu() {
        MediaPlayer mediaPlayer = this.f31625tq;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void hww(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f31622hu) {
            try {
                if (!this.vgm && surfaceHolder != null && surfaceHolder.getSurface() != null && this.hww) {
                    this.f31625tq.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    @TargetApi(14)
    public void hww(Surface surface) {
        jpb();
        this.f31623hv = surface;
        this.f31625tq.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    @t0(api = 23)
    public void hww(com.bykv.vk.openvk.hww.hww.hww.tq tqVar) throws Throwable {
        this.f31625tq.setPlaybackParams(this.f31625tq.getPlaybackParams().setSpeed(tqVar.hww()));
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void hww(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase(C4235d4.i.f61404b)) {
            this.f31625tq.setDataSource(uri.getPath());
        } else {
            this.f31625tq.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void hww(FileDescriptor fileDescriptor) throws Throwable {
        this.f31625tq.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    @t0(api = 23)
    public synchronized void hww(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) {
        this.vy = com.bykv.vk.openvk.hww.hww.tq.hww.hww.hww(com.bykv.vk.openvk.hww.hww.hww.sd.hww(), sdVar);
        com.bykv.vk.openvk.hww.hww.tq.hww.tq.sd.hww(sdVar);
        this.f31625tq.setDataSource(this.vy);
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void hww(long j10, int i10) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.f31625tq.seekTo((int) j10);
            return;
        }
        if (i10 == 0) {
            this.f31625tq.seekTo((int) j10, 0);
            return;
        }
        if (i10 == 1) {
            this.f31625tq.seekTo((int) j10, 1);
            return;
        }
        if (i10 == 2) {
            this.f31625tq.seekTo((int) j10, 2);
        } else if (i10 == 3) {
            this.f31625tq.seekTo((int) j10, 3);
        } else {
            this.f31625tq.seekTo((int) j10);
        }
    }
}
