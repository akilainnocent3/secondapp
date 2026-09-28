package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class v9i {

    public static class b {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        @Deprecated
        public b(Uri uri, int i, int i2, boolean z, int i3) {
            uri.getClass();
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }
    }

    public static class c {
        public void a(int i) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, List<v8i> list, int i, boolean z, int i2, Handler handler, c cVar) {
        pa50 pa50Var = new pa50(handler);
        qv5 qv5Var = new qv5(cVar, pa50Var);
        if (!z) {
            String strA = a9i.a(i, list);
            Typeface typefaceB = a9i.a.b(strA);
            if (typefaceB != null) {
                pa50Var.execute(new ov5(cVar, typefaceB));
                return typefaceB;
            }
            x8i x8iVar = new x8i(qv5Var);
            synchronized (a9i.c) {
                try {
                    nj90<String, ArrayList<qya<a9i.a>>> nj90Var = a9i.d;
                    ArrayList<qya<a9i.a>> arrayList = nj90Var.get(strA);
                    if (arrayList != null) {
                        arrayList.add(x8iVar);
                        return null;
                    }
                    ArrayList<qya<a9i.a>> arrayList2 = new ArrayList<>();
                    arrayList2.add(x8iVar);
                    nj90Var.put(strA, arrayList2);
                    y8i y8iVar = new y8i(strA, context, list, i);
                    ThreadPoolExecutor threadPoolExecutor = a9i.b;
                    z8i z8iVar = new z8i(strA);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    qa50 qa50Var = new qa50();
                    qa50Var.a = y8iVar;
                    qa50Var.b = z8iVar;
                    qa50Var.c = handler2;
                    threadPoolExecutor.execute(qa50Var);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (list.size() > 1) {
            hb5.a("Fallbacks with blocking fetches are not supported for performance reasons");
            return null;
        }
        v8i v8iVar = list.get(0);
        s4u<String, Typeface> s4uVar = a9i.a;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{v8iVar}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        String strA2 = a9i.a(i, Collections.unmodifiableList(arrayList3));
        Typeface typefaceB2 = a9i.a.b(strA2);
        if (typefaceB2 != null) {
            pa50Var.execute(new ov5(cVar, typefaceB2));
            return typefaceB2;
        }
        if (i2 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{v8iVar}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            a9i.a aVarB = a9i.b(strA2, context, Collections.unmodifiableList(arrayList4), i);
            qv5Var.a(aVarB);
            return aVarB.a;
        }
        try {
            try {
                a9i.a aVar = (a9i.a) a9i.b.submit(new w8i(strA2, context, v8iVar, i)).get(i2, TimeUnit.MILLISECONDS);
                qv5Var.a(aVar);
                return aVar.a;
            } catch (InterruptedException e) {
                throw e;
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            qv5Var.b.execute(new pv5(qv5Var.a, -3));
            return null;
        }
    }

    public static class a {
        public final int a;
        public final List<b[]> b;

        @Deprecated
        public a() {
            this.a = 1;
            this.b = Collections.singletonList(null);
        }

        public a(ArrayList arrayList) {
            this.a = 0;
            this.b = arrayList;
        }
    }
}
