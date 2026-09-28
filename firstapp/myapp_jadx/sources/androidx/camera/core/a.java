package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import defpackage.c4f0;
import defpackage.c9n;
import defpackage.si1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    public final Image a;
    public final C0033a[] b;
    public final si1 c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    public static final class C0033a implements c.a {
        public final Image.Plane a;

        public C0033a(Image.Plane plane) {
            this.a = plane;
        }

        @Override // androidx.camera.core.c.a
        public final int a() {
            return this.a.getRowStride();
        }

        @Override // androidx.camera.core.c.a
        public final int b() {
            return this.a.getPixelStride();
        }

        @Override // androidx.camera.core.c.a
        public final ByteBuffer e() {
            return this.a.getBuffer();
        }
    }

    public a(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new C0033a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new C0033a(planes[i]);
            }
        } else {
            this.b = new C0033a[0];
        }
        this.c = new si1(c4f0.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.c
    public final int b() {
        return this.a.getHeight();
    }

    @Override // androidx.camera.core.c
    public final int c() {
        return this.a.getWidth();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // androidx.camera.core.c
    public final int getFormat() {
        return this.a.getFormat();
    }

    @Override // androidx.camera.core.c
    public final c9n m1() {
        return this.c;
    }

    @Override // androidx.camera.core.c
    public final Image t() {
        return this.a;
    }

    @Override // androidx.camera.core.c
    public final c.a[] y0() {
        return this.b;
    }
}
