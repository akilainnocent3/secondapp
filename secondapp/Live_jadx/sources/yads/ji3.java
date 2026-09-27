package yads;

import android.view.SurfaceView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public interface ji3 {
    void a(si3 si3Var);

    void a(zh3 zh3Var);

    boolean a();

    void b(si3 si3Var);

    void clearMediaItems();

    void clearVideoSurfaceView(SurfaceView surfaceView);

    long getCurrentPosition();

    long getDuration();

    float getVolume();

    boolean isPlaying();

    void prepare();

    void setPlayWhenReady(boolean z10);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVolume(float f10);

    void stop();
}
