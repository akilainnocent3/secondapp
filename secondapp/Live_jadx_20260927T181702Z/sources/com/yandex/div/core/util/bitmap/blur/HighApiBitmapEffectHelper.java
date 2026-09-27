package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import gb.n;
import k.t0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import rc.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@t0(31)
public final class HighApiBitmapEffectHelper extends BitmapEffectHelper {

    @Deprecated
    public static final float BLUR_COMPATIBILITY_DIVIDER = 1.5f;

    @l
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_BLURRED_IMAGES = 1;

    @m
    private HardwareRenderer cachedHardwareRenderer;

    @m
    private RenderNode cachedRenderNode;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0086 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0067, B:17:0x0076, B:19:0x007e, B:32:0x00a9, B:22:0x0086, B:24:0x0090, B:26:0x0096, B:27:0x0098, B:28:0x009d, B:30:0x00a3, B:31:0x00a5), top: B:36:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0090 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0067, B:17:0x0076, B:19:0x007e, B:32:0x00a9, B:22:0x0086, B:24:0x0090, B:26:0x0096, B:27:0x0098, B:28:0x009d, B:30:0x00a3, B:31:0x00a5), top: B:36:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0067, B:17:0x0076, B:19:0x007e, B:32:0x00a9, B:22:0x0086, B:24:0x0090, B:26:0x0096, B:27:0x0098, B:28:0x009d, B:30:0x00a3, B:31:0x00a5), top: B:36:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x009d A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0067, B:17:0x0076, B:19:0x007e, B:32:0x00a9, B:22:0x0086, B:24:0x0090, B:26:0x0096, B:27:0x0098, B:28:0x009d, B:30:0x00a3, B:31:0x00a5), top: B:36:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0067, B:17:0x0076, B:19:0x007e, B:32:0x00a9, B:22:0x0086, B:24:0x0090, B:26:0x0096, B:27:0x0098, B:28:0x009d, B:30:0x00a3, B:31:0x00a5), top: B:36:0x0067 }] */
    private final Bitmap blur(Bitmap bitmap, float f10, boolean z10) {
        HardwareBuffer hardwareBuffer;
        Bitmap.Config config;
        Bitmap.Config config2;
        HardwareRenderer orCreateHardwareRenderer = getOrCreateHardwareRenderer();
        RenderNode orCreateRenderNode = getOrCreateRenderNode();
        ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
        orCreateHardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
        orCreateHardwareRenderer.setContentRoot(orCreateRenderNode);
        orCreateRenderNode.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
        float f11 = f10 / 1.5f;
        orCreateRenderNode.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, z10 ? Shader.TileMode.DECAL : Shader.TileMode.MIRROR));
        orCreateRenderNode.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        orCreateRenderNode.endRecording();
        orCreateHardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
        Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
        if (imageAcquireNextImage == null || (hardwareBuffer = imageAcquireNextImage.getHardwareBuffer()) == null) {
            return bitmap;
        }
        try {
            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            if (bitmapWrapHardwareBuffer != null) {
                if (z10) {
                    Bitmap.Config config3 = bitmapWrapHardwareBuffer.getConfig();
                    Bitmap.Config config4 = Bitmap.Config.ALPHA_8;
                    if (config3 != config4) {
                        bitmap = bitmapWrapHardwareBuffer.copy(config4, false);
                    } else if (bitmapWrapHardwareBuffer.getConfig() != bitmap.getConfig()) {
                        config2 = bitmap.getConfig();
                        if (config2 == null) {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        bitmap = bitmapWrapHardwareBuffer.copy(config2, false);
                    } else {
                        config = bitmapWrapHardwareBuffer.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        bitmap = bitmapWrapHardwareBuffer.copy(config, false);
                    }
                } else if (bitmapWrapHardwareBuffer.getConfig() != bitmap.getConfig()) {
                    config2 = bitmap.getConfig();
                    if (config2 == null) {
                        config2 = Bitmap.Config.ARGB_8888;
                    }
                    bitmap = bitmapWrapHardwareBuffer.copy(config2, false);
                } else {
                    config = bitmapWrapHardwareBuffer.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmap = bitmapWrapHardwareBuffer.copy(config, false);
                }
                bitmapWrapHardwareBuffer.recycle();
            }
            return bitmap;
        } finally {
            hardwareBuffer.close();
            imageAcquireNextImage.close();
        }
    }

    private final HardwareRenderer getOrCreateHardwareRenderer() {
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            return hardwareRenderer;
        }
        HardwareRenderer hardwareRendererA = f.a();
        this.cachedHardwareRenderer = hardwareRendererA;
        return hardwareRendererA;
    }

    private final RenderNode getOrCreateRenderNode() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = n.a("BlurEffect");
        this.cachedRenderNode = renderNodeA;
        return renderNodeA;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @l
    public Bitmap blurBitmap(@l Bitmap bitmap, float f10) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f10) ? bitmap : blur(bitmap, f10, false);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @l
    public Bitmap blurShadow(@l Bitmap bitmap, float f10) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f10) ? bitmap : blur(bitmap, f10, true);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float f10) {
        return 1.0f;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.cachedRenderNode = null;
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            hardwareRenderer.destroy();
        }
        this.cachedHardwareRenderer = null;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float f10) {
        return f10;
    }
}
