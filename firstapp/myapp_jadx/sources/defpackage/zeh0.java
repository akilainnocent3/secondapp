package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class zeh0 implements wg50<Bitmap, Bitmap> {
    @Override // defpackage.wg50
    public final boolean a(Bitmap bitmap, s2z s2zVar) {
        return true;
    }

    @Override // defpackage.wg50
    public final qg50<Bitmap> b(Bitmap bitmap, int i, int i2, s2z s2zVar) {
        return new a(bitmap);
    }

    public static final class a implements qg50<Bitmap> {
        public final Bitmap a;

        public a(Bitmap bitmap) {
            this.a = bitmap;
        }

        @Override // defpackage.qg50
        public final int a() {
            return erh0.c(this.a);
        }

        @Override // defpackage.qg50
        public final Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // defpackage.qg50
        public final Bitmap get() {
            return this.a;
        }

        @Override // defpackage.qg50
        public final void c() {
        }
    }
}
