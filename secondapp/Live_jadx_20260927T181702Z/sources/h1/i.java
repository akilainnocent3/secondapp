package h1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e2.s;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.a0;
import k.p;
import k.t;
import k.t0;
import k.u;
import k.x;
import k.y0;
import k1.u0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f87624a = "ResourcesCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f87625b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a0("sColorStateCacheLock")
    public static final WeakHashMap<e, SparseArray<d>> f87626c = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f87627d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k.c
    public static final int f87628e = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {
        @t
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        @t
        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(23)
    public static class b {
        @t
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        @NonNull
        @t
        public static ColorStateList b(@NonNull Resources resources, @k.m int i10, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(29)
    public static class c {
        @t
        public static float a(@NonNull Resources resources, @p int i10) {
            return resources.getFloat(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f87629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f87630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f87631c;

        public d(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.f87629a = colorStateList;
            this.f87630b = configuration;
            this.f87631c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f87632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f87633b;

        public e(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.f87632a = resources;
            this.f87633b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f87632a.equals(eVar.f87632a) && s.a(this.f87633b, eVar.f87633b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return s.b(this.f87632a, this.f87633b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class f {
        @NonNull
        @y0({y0.a.LIBRARY})
        public static Handler e(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public final void c(final int i10, @Nullable Handler handler) {
            e(handler).post(new Runnable() { // from class: h1.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87639b.f(i10);
                }
            });
        }

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public final void d(@NonNull final Typeface typeface, @Nullable Handler handler) {
            e(handler).post(new Runnable() { // from class: h1.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87637b.g(typeface);
                }
            });
        }

        public abstract void f(int i10);

        public abstract void g(@NonNull Typeface typeface);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @t0(23)
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f87634a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f87635b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static boolean f87636c;

            /* JADX WARN: Code duplicated, block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @SuppressLint({"BanUncheckedReflection"})
            public static void a(@NonNull Resources.Theme theme) {
                Method method;
                synchronized (f87634a) {
                    if (f87636c) {
                        method = f87635b;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f87635b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i(i.f87624a, "Failed to retrieve rebase() method", e10);
                        }
                        f87636c = true;
                        method = f87635b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i(i.f87624a, "Failed to invoke rebase() method via reflection", e11);
                                f87635b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @t0(29)
        public static class b {
            @t
            public static void a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(@NonNull Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(@NonNull e eVar, @k.m int i10, @NonNull ColorStateList colorStateList, @Nullable Resources.Theme theme) {
        synchronized (f87627d) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = f87626c;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i10, new d(colorStateList, eVar.f87632a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(@NonNull Resources.Theme theme) {
        synchronized (f87627d) {
            try {
                Iterator<e> it = f87626c.keySet().iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next != null && theme.equals(next.f87633b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f87631c == r5.hashCode()) goto L22;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList c(@androidx.annotation.NonNull h1.i.e r5, @k.m int r6) {
        /*
            java.lang.Object r0 = h1.i.f87627d
            monitor-enter(r0)
            java.util.WeakHashMap<h1.i$e, android.util.SparseArray<h1.i$d>> r1 = h1.i.f87626c     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            h1.i$d r2 = (h1.i.d) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f87630b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f87632a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f87633b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f87631c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f87631c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f87629a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.i.c(h1.i$e, int):android.content.res.ColorStateList");
    }

    @Nullable
    public static Typeface d(@NonNull Context context, @x int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    @k.k
    public static int e(@NonNull Resources resources, @k.m int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i10, theme);
    }

    @Nullable
    public static ColorStateList f(@NonNull Resources resources, @k.m int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList colorStateListC = c(eVar, i10);
        if (colorStateListC != null) {
            return colorStateListC;
        }
        ColorStateList colorStateListN = n(resources, i10, theme);
        if (colorStateListN == null) {
            return b.b(resources, i10, theme);
        }
        a(eVar, i10, colorStateListN, theme);
        return colorStateListN;
    }

    @Nullable
    public static Drawable g(@NonNull Resources resources, @u int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i10, theme);
    }

    @Nullable
    public static Drawable h(@NonNull Resources resources, @u int i10, int i11, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i10, i11, theme);
    }

    public static float i(@NonNull Resources resources, @p int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i10);
        }
        TypedValue typedValueM = m();
        resources.getValue(i10, typedValueM, true);
        if (typedValueM.type == 4) {
            return typedValueM.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueM.type) + " is not valid");
    }

    @Nullable
    public static Typeface j(@NonNull Context context, @x int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    @Nullable
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface k(@NonNull Context context, @x int i10, @NonNull TypedValue typedValue, int i11, @Nullable f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, typedValue, i11, fVar, null, true, false);
    }

    public static void l(@NonNull Context context, @x int i10, @NonNull f fVar, @Nullable Handler handler) throws Resources.NotFoundException {
        e2.x.l(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            p(context, i10, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    @NonNull
    public static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = f87625b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @Nullable
    public static ColorStateList n(Resources resources, int i10, @Nullable Resources.Theme theme) {
        if (o(resources, i10)) {
            return null;
        }
        try {
            return h1.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w(f87624a, "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    public static boolean o(@NonNull Resources resources, @k.m int i10) {
        TypedValue typedValueM = m();
        resources.getValue(i10, typedValueM, true);
        int i11 = typedValueM.type;
        return i11 >= 28 && i11 <= 31;
    }

    public static Typeface p(@NonNull Context context, int i10, @NonNull TypedValue typedValue, int i11, @Nullable f fVar, @Nullable Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceQ = q(context, resources, typedValue, i10, i11, fVar, handler, z10, z11);
        if (typefaceQ != null || fVar != null || z11) {
            return typefaceQ;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    public static Typeface q(@NonNull Context context, Resources resources, @NonNull TypedValue typedValue, int i10, int i11, @Nullable f fVar, @Nullable Handler handler, boolean z10, boolean z11) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (fVar != null) {
                fVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceK = u0.k(resources, i10, string, typedValue.assetCookie, i11);
        if (typefaceK != null) {
            if (fVar != null) {
                fVar.d(typefaceK, handler);
            }
            return typefaceK;
        }
        if (z11) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(androidx.appcompat.widget.c.f6977y)) {
                Typeface typefaceH = u0.h(context, resources, i10, string, typedValue.assetCookie, i11);
                if (fVar != null) {
                    if (typefaceH != null) {
                        fVar.d(typefaceH, handler);
                        return typefaceH;
                    }
                    fVar.c(-3, handler);
                }
                return typefaceH;
            }
            h1.f.b bVarB = h1.f.b(resources.getXml(i10), resources);
            if (bVarB == null) {
                Log.e(f87624a, "Failed to find font-family tag");
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            }
            try {
                return u0.f(context, bVarB, resources, i10, string, typedValue.assetCookie, i11, fVar, handler, z10);
            } catch (IOException e10) {
                e = e10;
                string = string;
                Log.e(f87624a, "Failed to read xml resource " + string, e);
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e11) {
                e = e11;
                string = string;
                Log.e(f87624a, "Failed to parse xml resource " + string, e);
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (XmlPullParserException e13) {
            e = e13;
        }
    }
}
