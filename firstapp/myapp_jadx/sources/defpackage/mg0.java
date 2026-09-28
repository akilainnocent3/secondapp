package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mg0 {
    public final ArrayList a;
    public final px0 b;

    public static final class a implements qg50<Drawable> {
        public final AnimatedImageDrawable a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.a = animatedImageDrawable;
        }

        @Override // defpackage.qg50
        public final int a() {
            return erh0.d(Bitmap.Config.ARGB_8888) * this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 2;
        }

        @Override // defpackage.qg50
        public final void c() {
            this.a.stop();
            this.a.clearAnimationCallbacks();
        }

        @Override // defpackage.qg50
        public final Class<Drawable> d() {
            return Drawable.class;
        }

        @Override // defpackage.qg50
        public final Drawable get() {
            return this.a;
        }
    }

    public static final class b implements wg50<ByteBuffer, Drawable> {
        public final mg0 a;

        public b(mg0 mg0Var) {
            this.a = mg0Var;
        }

        @Override // defpackage.wg50
        public final boolean a(ByteBuffer byteBuffer, s2z s2zVar) {
            ImageHeaderParser.ImageType imageTypeC = com.bumptech.glide.load.a.c(this.a.a, byteBuffer);
            if (imageTypeC != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeC == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // defpackage.wg50
        public final qg50<Drawable> b(ByteBuffer byteBuffer, int i, int i2, s2z s2zVar) {
            return mg0.a(ImageDecoder.createSource(byteBuffer), i, i2, s2zVar);
        }
    }

    public static final class c implements wg50<InputStream, Drawable> {
        public final mg0 a;

        public c(mg0 mg0Var) {
            this.a = mg0Var;
        }

        @Override // defpackage.wg50
        public final boolean a(InputStream inputStream, s2z s2zVar) throws IOException {
            mg0 mg0Var = this.a;
            ImageHeaderParser.ImageType imageTypeB = com.bumptech.glide.load.a.b(mg0Var.a, inputStream, mg0Var.b);
            if (imageTypeB != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeB == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // defpackage.wg50
        public final qg50<Drawable> b(InputStream inputStream, int i, int i2, s2z s2zVar) {
            return mg0.a(ImageDecoder.createSource(fl5.b(inputStream)), i, i2, s2zVar);
        }
    }

    public mg0(ArrayList arrayList, px0 px0Var) {
        this.a = arrayList;
        this.b = px0Var;
    }

    public static a a(ImageDecoder.Source source, int i, int i2, s2z s2zVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new qed(i, i2, s2zVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        jre.a(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }
}
