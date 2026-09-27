package com.bykv.vk.openvk.hww.hww.hww.hu;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd extends hv implements SurfaceHolder.Callback, tq {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static final ArrayList<hu> f31557sd = new ArrayList<>();
    private WeakReference<hww> hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private hu f31558tq;
    private tq.hww vy;

    public sd(Context context) {
        super(context);
        hww();
    }

    private void hww() {
        hu huVar = new hu(this);
        this.f31558tq = huVar;
        f31557sd.add(huVar);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(tq.hww hwwVar) {
        this.vy = hwwVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference<hww> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().hww(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<hww> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().hww(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<hww> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().tq(surfaceHolder);
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hu.tq
    public void hww(hww hwwVar) {
        this.hww = new WeakReference<>(hwwVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<hu> it = f31557sd.iterator();
        while (it.hasNext()) {
            hu next = it.next();
            if (next != null && next.hww() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f31558tq);
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
}
