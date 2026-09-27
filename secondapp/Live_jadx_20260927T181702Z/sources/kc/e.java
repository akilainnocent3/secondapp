package kc;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f102134a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f102135b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f102136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f102137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k<T, R> f102138c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, k<T, R> kVar) {
            this.f102136a = cls;
            this.f102137b = cls2;
            this.f102138c = kVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f102136a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f102137b);
        }
    }

    public synchronized <T, R> void a(@NonNull String str, @NonNull k<T, R> kVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, kVar));
    }

    @NonNull
    public synchronized <T, R> List<k<T, R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f102134a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f102135b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f102138c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final synchronized List<a<?, ?>> c(@NonNull String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f102134a.contains(str)) {
                this.f102134a.add(str);
            }
            arrayList = this.f102135b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f102135b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f102134a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f102135b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f102137b)) {
                        arrayList.add(aVar.f102137b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@NonNull String str, @NonNull k<T, R> kVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, kVar));
    }

    public synchronized void f(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f102134a);
            this.f102134a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f102134a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f102134a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
