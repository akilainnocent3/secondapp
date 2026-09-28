package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class a850 implements eg4 {
    public final RenderScript b;
    public final ScriptIntrinsicBlur c;
    public Allocation d;
    public final Paint a = new Paint(2);
    public int e = -1;
    public int f = -1;

    public a850(Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.b = renderScriptCreate;
        this.c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    @Override // defpackage.eg4
    public final void a() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    @Override // defpackage.eg4
    public final void b(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
    }

    @Override // defpackage.eg4
    public final Bitmap c(Bitmap bitmap, float f) {
        RenderScript renderScript = this.b;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        if (bitmap.getHeight() != this.f || bitmap.getWidth() != this.e) {
            Allocation allocation = this.d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.d = Allocation.createTyped(renderScript, allocationCreateFromBitmap.getType());
            this.e = bitmap.getWidth();
            this.f = bitmap.getHeight();
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.c;
        scriptIntrinsicBlur.setRadius(f);
        scriptIntrinsicBlur.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlur.forEach(this.d);
        this.d.copyTo(bitmap);
        allocationCreateFromBitmap.destroy();
        return bitmap;
    }

    @Override // defpackage.eg4
    public final void destroy() {
        this.c.destroy();
        this.b.destroy();
        Allocation allocation = this.d;
        if (allocation != null) {
            allocation.destroy();
        }
    }
}
