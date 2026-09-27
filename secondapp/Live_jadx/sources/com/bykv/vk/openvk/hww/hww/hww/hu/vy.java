package com.bykv.vk.openvk.hww.hww.hww.hu;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vy extends TextureView implements TextureView.SurfaceTextureListener, tq {
    private hww hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private tq.hww f31559tq;

    public vy(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hu.tq
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hu.tq
    public void hww(hww hwwVar) {
        this.hww = hwwVar;
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        hww hwwVar = this.hww;
        if (hwwVar != null) {
            hwwVar.hww(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        hww hwwVar = this.hww;
        if (hwwVar != null) {
            return hwwVar.hww(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        hww hwwVar = this.hww;
        if (hwwVar != null) {
            hwwVar.tq(surfaceTexture);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(tq.hww hwwVar) {
        this.f31559tq = hwwVar;
    }

    public vy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hu.tq
    public void hww(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hu.tq
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
