package k1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(26)
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class x0 extends v0 {
    public static final int A = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f101732t = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f101733u = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f101734v = "addFontFromAssetManager";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f101735w = "addFontFromBuffer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f101736x = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f101737y = "freeze";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f101738z = "abortCreation";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class<?> f101739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Constructor<?> f101740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f101741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f101742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f101743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f101744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f101745s;

    public x0() {
        Class<?> clsC;
        Constructor<?> constructorD;
        Method methodZ;
        Method methodA;
        Method methodE;
        Method methodY;
        Method methodB;
        try {
            clsC = C();
            constructorD = D(clsC);
            methodZ = z(clsC);
            methodA = A(clsC);
            methodE = E(clsC);
            methodY = y(clsC);
            methodB = B(clsC);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(f101732t, "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            clsC = null;
            constructorD = null;
            methodZ = null;
            methodA = null;
            methodE = null;
            methodY = null;
            methodB = null;
        }
        this.f101739m = clsC;
        this.f101740n = constructorD;
        this.f101741o = methodZ;
        this.f101742p = methodA;
        this.f101743q = methodE;
        this.f101744r = methodY;
        this.f101745s = methodB;
    }

    public Method A(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f101735w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> C() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> D(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    public Method E(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f101737y, null);
    }

    @Override // k1.v0, k1.a1
    @Nullable
    public Typeface b(Context context, h1.f.d dVar, Resources resources, int i10) {
        if (!x()) {
            return super.b(context, dVar, resources, i10);
        }
        Object objS = s();
        if (objS == null) {
            return null;
        }
        h1.f.e[] eVarArrA = dVar.a();
        int length = eVarArrA.length;
        int i11 = 0;
        while (i11 < length) {
            h1.f.e eVar = eVarArrA[i11];
            Context context2 = context;
            if (!u(context2, objS, eVar.a(), eVar.c(), eVar.e(), eVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.d()))) {
                t(objS);
                return null;
            }
            i11++;
            context = context2;
        }
        if (w(objS)) {
            return p(objS);
        }
        return null;
    }

    @Override // k1.v0, k1.a1
    @Nullable
    public Typeface d(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull v1.l.c[] cVarArr, int i10) {
        Typeface typefaceP;
        Object obj;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!x()) {
            v1.l.c cVarL = l(cVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVarL.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(cVarL.e()).setItalic(cVarL.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapH = b1.h(context, cVarArr, cancellationSignal);
        Object objS = s();
        if (objS == null) {
            return null;
        }
        int length = cVarArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            v1.l.c cVar = cVarArr[i11];
            ByteBuffer byteBuffer = mapH.get(cVar.d());
            if (byteBuffer == null) {
                obj = objS;
            } else {
                boolean zV = v(objS, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0);
                obj = objS;
                if (!zV) {
                    t(obj);
                    return null;
                }
                z10 = true;
            }
            i11++;
            objS = obj;
            z10 = z10;
        }
        Object obj2 = objS;
        if (!z10) {
            t(obj2);
            return null;
        }
        if (w(obj2) && (typefaceP = p(obj2)) != null) {
            return Typeface.create(typefaceP, i10);
        }
        return null;
    }

    @Override // k1.a1
    @Nullable
    public Typeface f(Context context, Resources resources, int i10, String str, int i11) {
        if (!x()) {
            return super.f(context, resources, i10, str, i11);
        }
        Object objS = s();
        if (objS == null) {
            return null;
        }
        if (!u(context, objS, str, 0, -1, -1, null)) {
            t(objS);
            return null;
        }
        if (w(objS)) {
            return p(objS);
        }
        return null;
    }

    @Override // k1.v0, k1.a1
    @NonNull
    public Typeface g(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = e1.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.g(context, typeface, i10, z10) : typefaceB;
    }

    @Nullable
    public Typeface p(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f101739m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f101745s.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public final Object s() {
        try {
            return this.f101740n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void t(Object obj) {
        try {
            this.f101744r.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean u(Context context, Object obj, String str, int i10, int i11, int i12, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f101741o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean v(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f101742p.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean w(Object obj) {
        try {
            return ((Boolean) this.f101743q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean x() {
        if (this.f101741o == null) {
            Log.w(f101732t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f101741o != null;
    }

    public Method y(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f101738z, null);
    }

    public Method z(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f101734v, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }
}
