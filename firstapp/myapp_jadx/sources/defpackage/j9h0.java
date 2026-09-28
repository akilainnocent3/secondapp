package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j9h0 {
    public static final q9h0 a;
    public static final s4u<String, Typeface> b;

    public static class a extends v9i.c {
        public th50.c a;

        @Override // v9i.c
        public final void a(int i) {
            th50.c cVar = this.a;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // v9i.c
        public final void b(Typeface typeface) {
            th50.c cVar = this.a;
            if (cVar != null) {
                cVar.c(typeface);
            }
        }
    }

    static {
        Trace.beginSection(sig0.d("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new p9h0();
        } else if (i >= 28) {
            a = new o9h0();
        } else if (i >= 26) {
            a = new n9h0();
        } else {
            Method method = l9h0.c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new l9h0();
            } else {
                a = new k9h0();
            }
        }
        b = new s4u<>(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, e9i.a aVar, Resources resources, int i, String str, int i2, int i3, th50.c cVar, boolean z) {
        Typeface typefaceA;
        List listUnmodifiableList;
        if (aVar instanceof e9i.d) {
            e9i.d dVar = (e9i.d) aVar;
            String str2 = dVar.e;
            Typeface typeface = null;
            if (str2 != null && !str2.isEmpty()) {
                Typeface typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                    typeface = typefaceCreate;
                }
            }
            if (typeface != null) {
                if (cVar != null) {
                    new Handler(Looper.getMainLooper()).post(new uh50(cVar, typeface));
                }
                return typeface;
            }
            boolean z2 = !z ? cVar != null : dVar.d != 0;
            int i4 = z ? dVar.c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a aVar2 = new a();
            aVar2.a = cVar;
            v8i v8iVar = dVar.b;
            v8i v8iVar2 = dVar.a;
            if (v8iVar != null) {
                Object[] objArr = {v8iVar2, v8iVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    Object obj = objArr[i5];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = new Object[]{v8iVar2}[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            typefaceA = v9i.a(context, listUnmodifiableList, i3, z2, i4, handler, aVar2);
        } else {
            typefaceA = a.a(context, (e9i.b) aVar, resources, i3);
            if (cVar != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new uh50(cVar, typefaceA));
                } else {
                    cVar.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            b.c(b(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
