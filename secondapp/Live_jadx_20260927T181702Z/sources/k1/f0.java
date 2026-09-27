package k1;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import dr.w2;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class f0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeBitmap$1\n*L\n1#1,56:1\n*E\n"})
    public static final class a implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ds.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, w2> f101664a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ds.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, w2> qVar) {
            this.f101664a = qVar;
        }

        public final void onHeaderDecoded(@oy.l ImageDecoder imageDecoder, @oy.l ImageDecoder.ImageInfo imageInfo, @oy.l ImageDecoder.Source source) {
            this.f101664a.invoke(imageDecoder, imageInfo, source);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeDrawable$1\n*L\n1#1,56:1\n*E\n"})
    public static final class b implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ds.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, w2> f101665a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ds.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, w2> qVar) {
            this.f101665a = qVar;
        }

        public final void onHeaderDecoded(@oy.l ImageDecoder imageDecoder, @oy.l ImageDecoder.ImageInfo imageInfo, @oy.l ImageDecoder.Source source) {
            this.f101665a.invoke(imageDecoder, imageInfo, source);
        }
    }

    @k.t0(28)
    @oy.l
    public static final Bitmap a(@oy.l ImageDecoder.Source source, @oy.l ds.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, w2> qVar) {
        return ImageDecoder.decodeBitmap(source, c0.a(new a(qVar)));
    }

    @k.t0(28)
    @oy.l
    public static final Drawable b(@oy.l ImageDecoder.Source source, @oy.l ds.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, w2> qVar) {
        return ImageDecoder.decodeDrawable(source, c0.a(new b(qVar)));
    }
}
