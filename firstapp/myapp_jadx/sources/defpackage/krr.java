package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: loaded from: classes.dex */
public final class krr implements hrr {
    public static final krr a = new krr();

    @Override // defpackage.hrr
    public final Object a(v6l v6lVar, v1b<? super Bitmap> v1bVar) {
        return Bitmap.createBitmap(new a(v6lVar));
    }

    public static final class a extends Picture {
        public final v6l a;

        public a(v6l v6lVar) {
            this.a = v6lVar;
        }

        @Override // android.graphics.Picture
        public final Canvas beginRecording(int i, int i2) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public final void draw(Canvas canvas) {
            this.a.c(i40.b(canvas), null);
        }

        @Override // android.graphics.Picture
        public final int getHeight() {
            return (int) (this.a.u & 4294967295L);
        }

        @Override // android.graphics.Picture
        public final int getWidth() {
            return (int) (this.a.u >> 32);
        }

        @Override // android.graphics.Picture
        public final boolean requiresHardwareAcceleration() {
            return true;
        }

        @Override // android.graphics.Picture
        public final void endRecording() {
        }
    }
}
