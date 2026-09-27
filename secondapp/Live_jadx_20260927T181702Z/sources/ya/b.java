package ya;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.d;
import gb.g;
import gb.z;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f146586e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Context f146587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public d f146589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, c1> f146590d;

    public b(Drawable.Callback callback, String str, d dVar, Map<String, c1> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f146588b = str;
        } else {
            this.f146588b = str + '/';
        }
        this.f146590d = map;
        e(dVar);
        if (callback instanceof View) {
            this.f146587a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f146587a = null;
        }
    }

    @Nullable
    public Bitmap a(String str) {
        c1 c1Var = this.f146590d.get(str);
        if (c1Var == null) {
            return null;
        }
        Bitmap bitmapB = c1Var.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        d dVar = this.f146589c;
        if (dVar != null) {
            Bitmap bitmapA = dVar.a(c1Var);
            if (bitmapA != null) {
                d(str, bitmapA);
            }
            return bitmapA;
        }
        Context context = this.f146587a;
        if (context == null) {
            return null;
        }
        String strD = c1Var.d();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strD.startsWith("data:") && strD.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strD.substring(strD.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return d(str, z.n(bitmapDecodeByteArray, c1Var.g(), c1Var.e()));
                    }
                    g.e("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e10) {
                    g.f("Unable to decode image `" + str + "`.", e10);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                g.f("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f146588b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f146588b + strD), null, options);
                if (bitmapDecodeStream != null) {
                    return d(str, z.n(bitmapDecodeStream, c1Var.g(), c1Var.e()));
                }
                g.e("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                g.f("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            g.f("Unable to open asset.", e13);
            return null;
        }
    }

    @Nullable
    public c1 b(String str) {
        return this.f146590d.get(str);
    }

    public boolean c(Context context) {
        if (context == null) {
            return this.f146587a == null;
        }
        if (this.f146587a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f146587a;
    }

    public final Bitmap d(String str, @Nullable Bitmap bitmap) {
        synchronized (f146586e) {
            this.f146590d.get(str).i(bitmap);
        }
        return bitmap;
    }

    public void e(@Nullable d dVar) {
        this.f146589c = dVar;
    }

    @Nullable
    public Bitmap f(String str, @Nullable Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapB = this.f146590d.get(str).b();
            d(str, bitmap);
            return bitmapB;
        }
        c1 c1Var = this.f146590d.get(str);
        Bitmap bitmapB2 = c1Var.b();
        c1Var.i(null);
        return bitmapB2;
    }
}
