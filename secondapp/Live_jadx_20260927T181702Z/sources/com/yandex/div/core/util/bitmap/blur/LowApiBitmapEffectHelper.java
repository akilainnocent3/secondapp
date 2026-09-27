package com.yandex.div.core.util.bitmap.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import kotlin.jvm.internal.x;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LowApiBitmapEffectHelper extends BitmapEffectHelper {

    @l
    private static final Companion Companion = new Companion(null);
    private static final float MAX_BLUR = 25.0f;
    private static final float MIN_BLUR = 1.0f;

    @m
    private RenderScript cachedRenderScript;

    @l
    private final Context context;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public LowApiBitmapEffectHelper(@l Context context) {
        this.context = context;
    }

    private final RenderScript getOrCreateRenderScript() {
        RenderScript renderScript = this.cachedRenderScript;
        if (renderScript != null) {
            return renderScript;
        }
        Context context = this.context;
        RenderScript renderScriptCreateMultiContext = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
        this.cachedRenderScript = renderScriptCreateMultiContext;
        return renderScriptCreateMultiContext;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @l
    public Bitmap blurBitmap(@l Bitmap bitmap, float f10) {
        float f11;
        Bitmap bitmapCreateScaledBitmap;
        if (!BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f10)) {
            return bitmap;
        }
        RenderScript orCreateRenderScript = getOrCreateRenderScript();
        if (f10 > 25.0f) {
            f11 = (f10 * 1.0f) / 25.0f;
            f10 = 25.0f;
        } else {
            f11 = 1.0f;
        }
        if (f11 == 1.0f) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmapCreateScaledBitmap = bitmap.copy(config, false);
        } else {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f11), (int) (bitmap.getHeight() / f11), false);
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(orCreateRenderScript, bitmapCreateScaledBitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(orCreateRenderScript, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(orCreateRenderScript, Element.U8_4(orCreateRenderScript));
        scriptIntrinsicBlurCreate.setRadius(f10);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCreateScaledBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateTyped.destroy();
        scriptIntrinsicBlurCreate.destroy();
        return bitmapCreateScaledBitmap;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @l
    public Bitmap blurShadow(@l Bitmap bitmap, float f10) {
        if (!BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f10)) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ALPHA_8);
        RenderScript orCreateRenderScript = getOrCreateRenderScript();
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(orCreateRenderScript, Element.A_8(orCreateRenderScript));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(orCreateRenderScript, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(orCreateRenderScript, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(f10);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap2.destroy();
        allocationCreateFromBitmap.destroy();
        scriptIntrinsicBlurCreate.destroy();
        return bitmapCreateBitmap;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float f10) {
        if (f10 <= 25.0f) {
            return 1.0f;
        }
        return 25.0f / f10;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float f10) {
        return u.H(f10, 1.0f, 25.0f);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderScript renderScript = this.cachedRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
        }
        this.cachedRenderScript = null;
    }
}
