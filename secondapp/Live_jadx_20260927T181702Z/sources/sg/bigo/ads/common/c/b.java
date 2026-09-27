package sg.bigo.ads.common.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import k.t0;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(17)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f132895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RenderScript f132896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScriptIntrinsicBlur f132897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Allocation f132898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Allocation f132899e;

    @t0(api = 17)
    public b(Context context) {
        this.f132895a = context;
    }

    private boolean b() {
        return (this.f132896b == null || this.f132897c == null) ? false : true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f132897c;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f132897c = null;
        }
        RenderScript renderScript = this.f132896b;
        if (renderScript != null) {
            renderScript.destroy();
            this.f132896b = null;
        }
        Allocation allocation = this.f132898d;
        if (allocation != null) {
            allocation.destroy();
            this.f132898d = null;
        }
        Allocation allocation2 = this.f132899e;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f132899e = null;
        }
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        if (b()) {
            if (this.f132898d == null) {
                this.f132898d = Allocation.createFromBitmap(this.f132896b, bitmap);
            }
            if (this.f132899e == null) {
                this.f132899e = Allocation.createFromBitmap(this.f132896b, bitmap2);
            }
            this.f132898d.copyFrom(bitmap);
            this.f132897c.setInput(this.f132898d);
            this.f132897c.forEach(this.f132899e);
            this.f132899e.copyTo(bitmap2);
        }
    }

    public final boolean a(float f10) {
        if (!b()) {
            try {
                RenderScript renderScriptCreate = RenderScript.create(this.f132895a);
                this.f132896b = renderScriptCreate;
                this.f132897c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            } catch (Exception unused) {
                a();
                return false;
            }
        }
        this.f132897c.setRadius(f10);
        return true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final boolean a(Bitmap bitmap, float f10) {
        if (!a(f10)) {
            return false;
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f132896b, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.f132898d = allocationCreateFromBitmap;
        this.f132899e = Allocation.createTyped(this.f132896b, allocationCreateFromBitmap.getType());
        return true;
    }
}
