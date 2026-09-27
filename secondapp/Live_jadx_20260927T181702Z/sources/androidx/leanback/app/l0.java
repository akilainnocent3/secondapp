package androidx.leanback.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class l0 extends a0 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f11702h0 = 0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f11703i0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SurfaceView f11704e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SurfaceHolder.Callback f11705f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f11706g0 = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            SurfaceHolder.Callback callback = l0.this.f11705f0;
            if (callback != null) {
                callback.surfaceChanged(surfaceHolder, i10, i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceHolder.Callback callback = l0.this.f11705f0;
            if (callback != null) {
                callback.surfaceCreated(surfaceHolder);
            }
            l0.this.f11706g0 = 1;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SurfaceHolder.Callback callback = l0.this.f11705f0;
            if (callback != null) {
                callback.surfaceDestroyed(surfaceHolder);
            }
            l0.this.f11706g0 = 0;
        }
    }

    public SurfaceView b0() {
        return this.f11704e0;
    }

    public void c0(SurfaceHolder.Callback callback) {
        this.f11705f0 = callback;
        if (callback == null || this.f11706g0 != 1) {
            return;
        }
        callback.surfaceCreated(this.f11704e0.getHolder());
    }

    @Override // androidx.leanback.app.a0, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle);
        SurfaceView surfaceView = (SurfaceView) LayoutInflater.from(r.a(this)).inflate(s3.a.j.f128832h0, viewGroup2, false);
        this.f11704e0 = surfaceView;
        viewGroup2.addView(surfaceView, 0);
        this.f11704e0.getHolder().addCallback(new a());
        z(2);
        return viewGroup2;
    }

    @Override // androidx.leanback.app.a0, android.app.Fragment
    public void onDestroyView() {
        this.f11704e0 = null;
        this.f11706g0 = 0;
        super.onDestroyView();
    }

    @Override // androidx.leanback.app.a0
    public void v(int i10, int i11) {
        int width = getView().getWidth();
        int height = getView().getHeight();
        ViewGroup.LayoutParams layoutParams = this.f11704e0.getLayoutParams();
        int i12 = width * i11;
        int i13 = i10 * height;
        if (i12 > i13) {
            layoutParams.height = height;
            layoutParams.width = i13 / i11;
        } else {
            layoutParams.width = width;
            layoutParams.height = i12 / i10;
        }
        this.f11704e0.setLayoutParams(layoutParams);
    }
}
