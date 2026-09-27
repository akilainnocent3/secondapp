package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.ironsource.C4235d4;
import e2.s;
import e2.x;
import gi.j;
import h1.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import k.c0;
import k.h1;
import k.k;
import k.t;
import k.t0;
import k.u;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    @h1
    public static final String A = "obj";

    @h1
    public static final String B = "int1";

    @h1
    public static final String C = "int2";

    @h1
    public static final String D = "tint_list";

    @h1
    public static final String E = "tint_mode";

    @h1
    public static final String F = "string1";
    public static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f9254k = "IconCompat";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9255l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9256m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f9257n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9258o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9259p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9260q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f9261r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f9262s = 0.25f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f9263t = 0.6666667f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f9264u = 0.9166667f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f9265v = 0.010416667f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f9266w = 0.020833334f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f9267x = 61;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f9268y = 30;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @h1
    public static final String f9269z = "type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public int f9270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @y0({y0.a.LIBRARY})
    public byte[] f9272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    @y0({y0.a.LIBRARY})
    public Parcelable f9273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public int f9274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public int f9275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    @y0({y0.a.LIBRARY})
    public ColorStateList f9276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    @y0({y0.a.LIBRARY})
    public String f9278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    @y0({y0.a.LIBRARY})
    public String f9279j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(23)
    public static class a {
        @Nullable
        public static IconCompat a(@NonNull Context context, @NonNull Icon icon) {
            int iE = e(icon);
            if (iE == 2) {
                String strD = d(icon);
                try {
                    return IconCompat.y(IconCompat.C(context, strD), strD, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (iE == 4) {
                return IconCompat.u(f(icon));
            }
            if (iE == 6) {
                return IconCompat.r(f(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f9271b = icon;
            return iconCompat;
        }

        public static IconCompat b(@NonNull Object obj) {
            x.l(obj);
            int iE = e(obj);
            if (iE == 2) {
                return IconCompat.y(null, d(obj), c(obj));
            }
            if (iE == 4) {
                return IconCompat.u(f(obj));
            }
            if (iE == 6) {
                return IconCompat.r(f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f9271b = obj;
            return iconCompat;
        }

        @c0
        @u
        public static int c(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f9254k, "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f9254k, "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f9254k, "Unable to get icon resource", e12);
                return 0;
            }
        }

        @Nullable
        public static String d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f9254k, "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f9254k, "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f9254k, "Unable to get icon package", e12);
                return null;
            }
        }

        public static int e(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f9254k, "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f9254k, "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f9254k, "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        @Nullable
        @t
        public static Uri f(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f9254k, "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f9254k, "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f9254k, "Unable to get icon uri", e12);
                return null;
            }
        }

        @t
        public static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @t
        public static Icon h(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f9270a) {
                case -1:
                    return (Icon) iconCompat.f9271b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f9271b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.B(), iconCompat.f9274e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f9271b, iconCompat.f9274e, iconCompat.f9275f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f9271b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.p((Bitmap) iconCompat.f9271b, false)) : b.b((Bitmap) iconCompat.f9271b);
                    break;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.E());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.E());
                        }
                        InputStream inputStreamF = iconCompat.F(context);
                        if (inputStreamF == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.E());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.p(BitmapFactory.decodeStream(inputStreamF), false));
                        } else {
                            iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamF));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f9276g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f9277h;
            if (mode != IconCompat.G) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(26)
    public static class b {
        @t
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @t
        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static class c {
        @t
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @t
        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @t
        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        @t
        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(30)
    public static class d {
        @t
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface e {
    }

    @y0({y0.a.LIBRARY})
    public IconCompat() {
        this.f9270a = -1;
        this.f9272c = null;
        this.f9273d = null;
        this.f9274e = 0;
        this.f9275f = 0;
        this.f9276g = null;
        this.f9277h = G;
        this.f9278i = null;
    }

    public static Resources C(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f9254k, String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    public static String O(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return androidx.media3.exoplayer.hls.a.f14142b;
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @Nullable
    public static IconCompat l(@NonNull Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f9274e = bundle.getInt(B);
        iconCompat.f9275f = bundle.getInt(C);
        iconCompat.f9279j = bundle.getString(F);
        if (bundle.containsKey(D)) {
            iconCompat.f9276g = (ColorStateList) bundle.getParcelable(D);
        }
        if (bundle.containsKey(E)) {
            iconCompat.f9277h = PorterDuff.Mode.valueOf(bundle.getString(E));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f9271b = bundle.getParcelable(A);
                return iconCompat;
            case 0:
            default:
                Log.w(f9254k, "Unknown type " + i10);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f9271b = bundle.getString(A);
                return iconCompat;
            case 3:
                iconCompat.f9271b = bundle.getByteArray(A);
                return iconCompat;
        }
    }

    @Nullable
    @t0(23)
    public static IconCompat m(@NonNull Context context, @NonNull Icon icon) {
        x.l(icon);
        return a.a(context, icon);
    }

    @Nullable
    @t0(23)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat n(@NonNull Icon icon) {
        return a.b(icon);
    }

    @Nullable
    @t0(23)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat o(@NonNull Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @h1
    public static Bitmap p(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, androidx.swiperefreshlayout.widget.a.f19314f);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, androidx.swiperefreshlayout.widget.a.f19315g);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @NonNull
    public static IconCompat q(@NonNull Bitmap bitmap) {
        s.d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f9271b = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat r(@NonNull Uri uri) {
        s.d(uri);
        return s(uri.toString());
    }

    @NonNull
    public static IconCompat s(@NonNull String str) {
        s.d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f9271b = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat t(@NonNull Bitmap bitmap) {
        s.d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f9271b = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat u(@NonNull Uri uri) {
        s.d(uri);
        return v(uri.toString());
    }

    @NonNull
    public static IconCompat v(@NonNull String str) {
        s.d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f9271b = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat w(@NonNull byte[] bArr, int i10, int i11) {
        s.d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f9271b = bArr;
        iconCompat.f9274e = i10;
        iconCompat.f9275f = i11;
        return iconCompat;
    }

    @NonNull
    public static IconCompat x(@NonNull Context context, @u int i10) {
        s.d(context);
        return y(context.getResources(), context.getPackageName(), i10);
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat y(@Nullable Resources resources, @NonNull String str, @u int i10) {
        s.d(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f9274e = i10;
        if (resources != null) {
            try {
                iconCompat.f9271b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f9271b = str;
        }
        iconCompat.f9279j = str;
        return iconCompat;
    }

    @u
    public int A() {
        int i10 = this.f9270a;
        if (i10 == -1) {
            return a.c(this.f9271b);
        }
        if (i10 == 2) {
            return this.f9274e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String B() {
        int i10 = this.f9270a;
        if (i10 == -1) {
            return a.d(this.f9271b);
        }
        if (i10 == 2) {
            String str = this.f9279j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f9271b).split(":", -1)[0] : this.f9279j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int D() {
        int i10 = this.f9270a;
        return i10 == -1 ? a.e(this.f9271b) : i10;
    }

    @NonNull
    public Uri E() {
        int i10 = this.f9270a;
        if (i10 == -1) {
            return a.f(this.f9271b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f9271b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Nullable
    @y0({y0.a.LIBRARY_GROUP})
    public InputStream F(@NonNull Context context) {
        Uri uriE = E();
        String scheme = uriE.getScheme();
        if ("content".equals(scheme) || C4235d4.i.f61404b.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriE);
            } catch (Exception e10) {
                Log.w(f9254k, "Unable to load image from URI: " + uriE, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f9271b));
        } catch (FileNotFoundException e11) {
            Log.w(f9254k, "Unable to load image from path: " + uriE, e11);
            return null;
        }
    }

    @Nullable
    public Drawable G(@NonNull Context context) {
        k(context);
        return a.g(N(context), context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Drawable H(Context context) {
        switch (this.f9270a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f9271b);
            case 2:
                String strB = B();
                if (TextUtils.isEmpty(strB)) {
                    strB = context.getPackageName();
                }
                try {
                    return i.g(C(context, strB), this.f9274e, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e(f9254k, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f9274e), this.f9271b), e10);
                }
                break;
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f9271b, this.f9274e, this.f9275f));
            case 4:
                InputStream inputStreamF = F(context);
                if (inputStreamF != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamF));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), p((Bitmap) this.f9271b, false));
            case 6:
                InputStream inputStreamF2 = F(context);
                if (inputStreamF2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamF2))) : new BitmapDrawable(context.getResources(), p(BitmapFactory.decodeStream(inputStreamF2), false));
                }
                return null;
            default:
                return null;
        }
    }

    @NonNull
    public IconCompat I(@k int i10) {
        return J(ColorStateList.valueOf(i10));
    }

    @NonNull
    public IconCompat J(@Nullable ColorStateList colorStateList) {
        this.f9276g = colorStateList;
        return this;
    }

    @NonNull
    public IconCompat K(@Nullable PorterDuff.Mode mode) {
        this.f9277h = mode;
        return this;
    }

    @NonNull
    public Bundle L() {
        Bundle bundle = new Bundle();
        switch (this.f9270a) {
            case -1:
                bundle.putParcelable(A, (Parcelable) this.f9271b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(A, (Bitmap) this.f9271b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(A, (String) this.f9271b);
                break;
            case 3:
                bundle.putByteArray(A, (byte[]) this.f9271b);
                break;
        }
        bundle.putInt("type", this.f9270a);
        bundle.putInt(B, this.f9274e);
        bundle.putInt(C, this.f9275f);
        bundle.putString(F, this.f9279j);
        ColorStateList colorStateList = this.f9276g;
        if (colorStateList != null) {
            bundle.putParcelable(D, colorStateList);
        }
        PorterDuff.Mode mode = this.f9277h;
        if (mode != G) {
            bundle.putString(E, mode.name());
        }
        return bundle;
    }

    @NonNull
    @t0(23)
    @Deprecated
    public Icon M() {
        return N(null);
    }

    @NonNull
    @t0(23)
    public Icon N(@Nullable Context context) {
        return a.h(this, context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void a() {
        this.f9277h = PorterDuff.Mode.valueOf(this.f9278i);
        switch (this.f9270a) {
            case -1:
                Parcelable parcelable = this.f9273d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f9271b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f9273d;
                if (parcelable2 != null) {
                    this.f9271b = parcelable2;
                    return;
                }
                byte[] bArr = this.f9272c;
                this.f9271b = bArr;
                this.f9270a = 3;
                this.f9274e = 0;
                this.f9275f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f9272c, Charset.forName("UTF-16"));
                this.f9271b = str;
                if (this.f9270a == 2 && this.f9279j == null) {
                    this.f9279j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f9271b = this.f9272c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void i(boolean z10) {
        this.f9278i = this.f9277h.name();
        switch (this.f9270a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f9273d = (Parcelable) this.f9271b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f9273d = (Parcelable) this.f9271b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f9271b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f9272c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f9272c = ((String) this.f9271b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f9272c = (byte[]) this.f9271b;
                return;
            case 4:
            case 6:
                this.f9272c = this.f9271b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public void j(@NonNull Intent intent, @Nullable Drawable drawable, @NonNull Context context) {
        Bitmap bitmapCopy;
        k(context);
        int i10 = this.f9270a;
        if (i10 == 1) {
            bitmapCopy = (Bitmap) this.f9271b;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i10 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(B(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f9274e));
                    return;
                }
                Drawable drawable2 = f1.d.getDrawable(contextCreatePackageContext, this.f9274e);
                if (drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService(androidx.appcompat.widget.c.f6970r)).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawable2.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawable2.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException("Can't find package " + this.f9271b, e10);
            }
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = p((Bitmap) this.f9271b, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public void k(@NonNull Context context) {
        Object obj;
        if (this.f9270a != 2 || (obj = this.f9271b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split(to.c.userBaseDel, -1)[0];
            String str4 = str2.split(to.c.userBaseDel, -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(f9254k, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strB = B();
            int identifier = C(context, strB).getIdentifier(str4, str3, str5);
            if (this.f9274e != identifier) {
                Log.i(f9254k, "Id has changed for " + strB + " " + str);
                this.f9274e = identifier;
            }
        }
    }

    @NonNull
    public String toString() {
        if (this.f9270a == -1) {
            return String.valueOf(this.f9271b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(O(this.f9270a));
        switch (this.f9270a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f9271b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f9271b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f9279j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(A())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f9274e);
                if (this.f9275f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f9275f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f9271b);
                break;
        }
        if (this.f9276g != null) {
            sb2.append(" tint=");
            sb2.append(this.f9276g);
        }
        if (this.f9277h != G) {
            sb2.append(" mode=");
            sb2.append(this.f9277h);
        }
        sb2.append(j.f86771d);
        return sb2.toString();
    }

    @Nullable
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public Bitmap z() {
        int i10 = this.f9270a;
        if (i10 == -1) {
            Object obj = this.f9271b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f9271b;
        }
        if (i10 == 5) {
            return p((Bitmap) this.f9271b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public IconCompat(int i10) {
        this.f9272c = null;
        this.f9273d = null;
        this.f9274e = 0;
        this.f9275f = 0;
        this.f9276g = null;
        this.f9277h = G;
        this.f9278i = null;
        this.f9270a = i10;
    }
}
