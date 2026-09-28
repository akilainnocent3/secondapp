package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class t70 implements c8n {
    public final Bitmap a;

    public t70(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        config.getClass();
        return w70.c(config);
    }

    @Override // defpackage.c8n
    public final int b() {
        return this.a.getHeight();
    }

    @Override // defpackage.c8n
    public final int c() {
        return this.a.getWidth();
    }

    public final void d() {
        this.a.prepareToDraw();
    }
}
