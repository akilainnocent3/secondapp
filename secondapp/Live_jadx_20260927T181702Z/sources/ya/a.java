package ya;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import gb.g;
import java.util.HashMap;
import java.util.Map;
import za.i;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AssetManager f146583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.c f146584e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<String> f146580a = new i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<i<String>, Typeface> f146581b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Typeface> f146582c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f146585f = ".ttf";

    public a(Drawable.Callback callback, @Nullable com.airbnb.lottie.c cVar) {
        this.f146584e = cVar;
        if (callback instanceof View) {
            this.f146583d = ((View) callback).getContext().getAssets();
        } else {
            g.e("LottieDrawable must be inside of a view for images to work.");
            this.f146583d = null;
        }
    }

    public final Typeface a(za.c cVar) {
        Typeface typefaceCreateFromAsset;
        String strB = cVar.b();
        Typeface typeface = this.f146582c.get(strB);
        if (typeface != null) {
            return typeface;
        }
        String strD = cVar.d();
        String strC = cVar.c();
        com.airbnb.lottie.c cVar2 = this.f146584e;
        if (cVar2 != null) {
            typefaceCreateFromAsset = cVar2.b(strB, strD, strC);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f146584e.a(strB);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        com.airbnb.lottie.c cVar3 = this.f146584e;
        if (cVar3 != null && typefaceCreateFromAsset == null) {
            String strD2 = cVar3.d(strB, strD, strC);
            if (strD2 == null) {
                strD2 = this.f146584e.c(strB);
            }
            if (strD2 != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f146583d, strD2);
            }
        }
        if (cVar.e() != null) {
            return cVar.e();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.f146583d, "fonts/" + strB + this.f146585f);
        }
        this.f146582c.put(strB, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public Typeface b(za.c cVar) {
        this.f146580a.b(cVar.b(), cVar.d());
        Typeface typeface = this.f146581b.get(this.f146580a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.d());
        this.f146581b.put(this.f146580a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f146585f = str;
    }

    public void d(@Nullable com.airbnb.lottie.c cVar) {
        this.f146584e = cVar;
    }

    public final Typeface e(Typeface typeface, String str) {
        int i10;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
