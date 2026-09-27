package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Window;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3944qg extends AbstractC4004t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f57449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f57450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3944qg(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        kotlin.jvm.internal.m0.p(window, "window");
        kotlin.jvm.internal.m0.p(config, "config");
        this.f57449b = window;
        this.f57450c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        System.currentTimeMillis();
        int width = this.f57449b.getDecorView().getWidth();
        int height = this.f57449b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.m0.o(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final kotlin.jvm.internal.l1.a aVar = new kotlin.jvm.internal.l1.a();
        int layerType = this.f57449b.getDecorView().getLayerType();
        this.f57449b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f57449b, rect, bitmapCreateBitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: com.inmobi.media.o00
            public final void onPixelCopyFinished(int i10) {
                C3944qg.a(aVar, this, i10);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f57450c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.f57449b.getDecorView().setLayerType(layerType, null);
        if (aVar.f102742b) {
            return a(bitmapCreateBitmap);
        }
        return null;
    }

    public static final void a(kotlin.jvm.internal.l1.a aVar, C3944qg c3944qg, int i10) {
        if (i10 == 0) {
            aVar.f102742b = true;
        }
        boolean z10 = aVar.f102742b;
        c3944qg.f57450c.set(true);
    }
}
