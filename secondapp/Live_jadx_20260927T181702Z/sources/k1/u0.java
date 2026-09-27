package k1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f0.f1;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f101712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1<String, Typeface> f101713b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.y0({k.y0.a.LIBRARY})
    public static class a extends v1.l.d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public h1.i.f f101714j;

        public a(@Nullable h1.i.f fVar) {
            this.f101714j = fVar;
        }

        @Override // v1.l.d
        public void a(int i10) {
            h1.i.f fVar = this.f101714j;
            if (fVar != null) {
                fVar.f(i10);
            }
        }

        @Override // v1.l.d
        public void b(@NonNull Typeface typeface) {
            h1.i.f fVar = this.f101714j;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f101712a = new z0();
        } else if (i10 >= 28) {
            f101712a = new y0();
        } else if (i10 >= 26) {
            f101712a = new x0();
        } else if (i10 < 24 || !w0.q()) {
            f101712a = new v0();
        } else {
            f101712a = new w0();
        }
        f101713b = new f1<>(16);
    }

    @h1
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static void a() {
        f101713b.evictAll();
    }

    @NonNull
    public static Typeface b(@NonNull Context context, @Nullable Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @NonNull
    public static Typeface c(@NonNull Context context, @Nullable Typeface typeface, @k.e0(from = 1, to = 1000) int i10, boolean z10) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        e2.x.g(i10, 1, 1000, "weight");
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return f101712a.g(context, typeface, i10, z10);
    }

    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface d(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull v1.l.c[] cVarArr, int i10) {
        return f101712a.d(context, cancellationSignal, cVarArr, i10);
    }

    @Nullable
    @Deprecated
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface e(@NonNull Context context, @NonNull h1.f.b bVar, @NonNull Resources resources, int i10, int i11, @Nullable h1.i.f fVar, @Nullable Handler handler, boolean z10) {
        return f(context, bVar, resources, i10, null, 0, i11, fVar, handler, z10);
    }

    @Nullable
    @k.y0({k.y0.a.LIBRARY})
    public static Typeface f(@NonNull Context context, @NonNull h1.f.b bVar, @NonNull Resources resources, int i10, @Nullable String str, int i11, int i12, @Nullable h1.i.f fVar, @Nullable Handler handler, boolean z10) {
        Typeface typefaceB;
        if (bVar instanceof h1.f.C0866f) {
            h1.f.C0866f c0866f = (h1.f.C0866f) bVar;
            Typeface typefaceM = m(c0866f.c());
            if (typefaceM != null) {
                if (fVar != null) {
                    fVar.d(typefaceM, handler);
                }
                return typefaceM;
            }
            typefaceB = v1.l.f(context, c0866f.b(), i12, !z10 ? fVar != null : c0866f.a() != 0, z10 ? c0866f.d() : -1, h1.i.f.e(handler), new a(fVar));
        } else {
            typefaceB = f101712a.b(context, (h1.f.d) bVar, resources, i12);
            if (fVar != null) {
                if (typefaceB != null) {
                    fVar.d(typefaceB, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f101713b.put(i(resources, i10, str, i11, i12), typefaceB);
        }
        return typefaceB;
    }

    @Nullable
    @Deprecated
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface g(@NonNull Context context, @NonNull Resources resources, int i10, String str, int i11) {
        return h(context, resources, i10, str, 0, i11);
    }

    @Nullable
    @k.y0({k.y0.a.LIBRARY})
    public static Typeface h(@NonNull Context context, @NonNull Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceF = f101712a.f(context, resources, i10, str, i12);
        if (typefaceF != null) {
            f101713b.put(i(resources, i10, str, i11, i12), typefaceF);
        }
        return typefaceF;
    }

    public static String i(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    @Nullable
    @Deprecated
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface j(@NonNull Resources resources, int i10, int i11) {
        return k(resources, i10, null, 0, i11);
    }

    @Nullable
    @k.y0({k.y0.a.LIBRARY})
    public static Typeface k(@NonNull Resources resources, int i10, @Nullable String str, int i11, int i12) {
        return f101713b.get(i(resources, i10, str, i11, i12));
    }

    @Nullable
    public static Typeface l(Context context, Typeface typeface, int i10) {
        a1 a1Var = f101712a;
        h1.f.d dVarM = a1Var.m(typeface);
        if (dVarM == null) {
            return null;
        }
        return a1Var.b(context, dVarM, context.getResources(), i10);
    }

    public static Typeface m(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
