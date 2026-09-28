package defpackage;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.a;
import androidx.camera.core.c;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z70 implements jan {
    public final ImageReader a;
    public final Object b = new Object();
    public boolean c = true;

    public z70(ImageReader imageReader) {
        this.a = imageReader;
    }

    @Override // defpackage.jan
    public final c a() {
        Image imageAcquireLatestImage;
        synchronized (this.b) {
            try {
                imageAcquireLatestImage = this.a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new a(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.jan
    public final int b() {
        int height;
        synchronized (this.b) {
            height = this.a.getHeight();
        }
        return height;
    }

    @Override // defpackage.jan
    public final int c() {
        int width;
        synchronized (this.b) {
            width = this.a.getWidth();
        }
        return width;
    }

    @Override // defpackage.jan
    public final void close() {
        synchronized (this.b) {
            this.a.close();
        }
    }

    @Override // defpackage.jan
    public final int d() {
        int imageFormat;
        synchronized (this.b) {
            imageFormat = this.a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.jan
    public final void e() {
        synchronized (this.b) {
            this.c = true;
            this.a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.jan
    public final int f() {
        int maxImages;
        synchronized (this.b) {
            maxImages = this.a.getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.jan
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.b) {
            surface = this.a.getSurface();
        }
        return surface;
    }

    @Override // defpackage.jan
    public final void h(final jan.a aVar, final Executor executor) {
        synchronized (this.b) {
            this.c = false;
            this.a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: x70
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    final z70 z70Var = this.a;
                    Executor executor2 = executor;
                    final jan.a aVar2 = aVar;
                    synchronized (z70Var.b) {
                        try {
                            if (!z70Var.c) {
                                executor2.execute(new Runnable() { // from class: y70
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        aVar2.a(z70Var);
                                    }
                                });
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, lku.a());
        }
    }

    @Override // defpackage.jan
    public final c i() {
        Image imageAcquireNextImage;
        synchronized (this.b) {
            try {
                imageAcquireNextImage = this.a.acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new a(imageAcquireNextImage);
        }
    }
}
