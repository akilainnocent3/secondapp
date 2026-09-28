package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class o750 implements eg4 {
    public int b;
    public int c;
    public a850 e;
    public Context f;
    public final RenderNode a = n750.a();
    public float d = 1.0f;

    @Override // defpackage.eg4
    public final void a() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    @Override // defpackage.eg4
    public final void b(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.a);
            return;
        }
        a850 a850Var = this.e;
        if (a850Var == null) {
            a850Var = new a850(this.f);
            this.e = a850Var;
        }
        a850Var.c(bitmap, this.d);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.e.a);
    }

    @Override // defpackage.eg4
    public final Bitmap c(Bitmap bitmap, float f) {
        this.d = f;
        if (bitmap.getHeight() != this.b || bitmap.getWidth() != this.c) {
            this.b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.c = width;
            this.a.setPosition(0, 0, width, this.b);
        }
        this.a.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.a.endRecording();
        this.a.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
        return bitmap;
    }

    @Override // defpackage.eg4
    public final void destroy() {
        this.a.discardDisplayList();
        a850 a850Var = this.e;
        if (a850Var != null) {
            a850Var.destroy();
        }
    }
}
