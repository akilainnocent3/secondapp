package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class th50 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<b, SparseArray<a>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    public static class a {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class b {
        public final Resources a;
        public final Resources.Theme b;

        public b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && Objects.equals(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b);
        }
    }

    public static abstract class c {
        public final void a(final int i) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: vh50
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(i);
                }
            });
        }

        public abstract void b(int i);

        public abstract void c(Typeface typeface);
    }

    public static ColorStateList a(int i, Resources.Theme theme, Resources resources) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        a aVar;
        b bVar = new b(resources, theme);
        synchronized (c) {
            try {
                SparseArray<a> sparseArray = b.get(bVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (aVar.b.equals(resources.getConfiguration())) {
                        if (theme != null || aVar.c != 0) {
                            if (theme == null || aVar.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = aVar.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = y68.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (c) {
            try {
                WeakHashMap<b, SparseArray<a>> weakHashMap = b;
                SparseArray<a> sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i, new a(colorStateListA, bVar.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, c cVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            s4u<String, Typeface> s4uVar = j9h0.b;
            Typeface typefaceB = s4uVar.b(j9h0.b(resources, i, string, i3, i2));
            if (typefaceB != null) {
                if (cVar != null) {
                    new Handler(Looper.getMainLooper()).post(new uh50(cVar, typefaceB));
                }
                typefaceA = typefaceB;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        e9i.a aVarA = e9i.a(resources.getXml(i), resources);
                        if (aVarA == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (cVar != null) {
                                cVar.a(-3);
                            }
                        } else {
                            typefaceA = j9h0.a(context, aVarA, resources, i, string, typedValue.assetCookie, i2, cVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceD = j9h0.a.d(context, resources, i, string, i2);
                        if (typefaceD != null) {
                            s4uVar.c(j9h0.b(resources, i, string, i4, i2), typefaceD);
                        }
                        if (cVar != null) {
                            if (typefaceD != null) {
                                new Handler(Looper.getMainLooper()).post(new uh50(cVar, typefaceD));
                            } else {
                                cVar.a(-3);
                            }
                        }
                        typefaceA = typefaceD;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (cVar != null) {
                        cVar.a(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (cVar != null) {
                        cVar.a(-3);
                    }
                }
            }
        } else if (cVar != null) {
            cVar.a(-3);
        }
        if (typefaceA != null || cVar != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
