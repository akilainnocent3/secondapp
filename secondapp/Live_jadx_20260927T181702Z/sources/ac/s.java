package ac;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f4764e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o<Object, Object> f4765f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b<?, ?>> f4766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f4767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<b<?, ?>> f4768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2.w.a<List<Throwable>> f4769d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements o<Object, Object> {
        @Override // ac.o
        public boolean a(@NonNull Object obj) {
            return false;
        }

        @Override // ac.o
        @Nullable
        public o.a<Object> b(@NonNull Object obj, int i10, int i11, @NonNull tb.i iVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Model> f4770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<Data> f4771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p<? extends Model, ? extends Data> f4772c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
            this.f4770a = cls;
            this.f4771b = cls2;
            this.f4772c = pVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f4770a.isAssignableFrom(cls);
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return a(cls) && this.f4771b.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {
        @NonNull
        public <Model, Data> r<Model, Data> a(@NonNull List<o<Model, Data>> list, @NonNull e2.w.a<List<Throwable>> aVar) {
            return new r<>(list, aVar);
        }
    }

    public s(@NonNull e2.w.a<List<Throwable>> aVar) {
        this(aVar, f4764e);
    }

    @NonNull
    public static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f4765f;
    }

    public final <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f4766a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    public synchronized <Model, Data> void b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    @NonNull
    public final <Model, Data> o<Model, Data> c(@NonNull b<?, ?> bVar) {
        return (o) pc.m.e(bVar.f4772c.c(this));
    }

    @NonNull
    public synchronized <Model, Data> o<Model, Data> d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f4766a) {
                if (this.f4768c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f4768c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f4768c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f4767b.a(arrayList, this.f4769d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z10) {
                throw new com.bumptech.glide.k.c((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f4768c.clear();
            throw th2;
        }
    }

    @NonNull
    public synchronized <Model> List<o<Model, ?>> e(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f4766a) {
                if (!this.f4768c.contains(bVar) && bVar.a(cls)) {
                    this.f4768c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f4768c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f4768c.clear();
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    public synchronized List<Class<?>> g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f4766a) {
            if (!arrayList.contains(bVar.f4771b) && bVar.a(cls)) {
                arrayList.add(bVar.f4771b);
            }
        }
        return arrayList;
    }

    @NonNull
    public final <Model, Data> p<Model, Data> h(@NonNull b<?, ?> bVar) {
        return (p<Model, Data>) bVar.f4772c;
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, false);
    }

    @NonNull
    public synchronized <Model, Data> List<p<? extends Model, ? extends Data>> j(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f4766a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> List<p<? extends Model, ? extends Data>> k(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        List<p<? extends Model, ? extends Data>> listJ;
        listJ = j(cls, cls2);
        b(cls, cls2, pVar);
        return listJ;
    }

    @h1
    public s(@NonNull e2.w.a<List<Throwable>> aVar, @NonNull c cVar) {
        this.f4766a = new ArrayList();
        this.f4768c = new HashSet();
        this.f4769d = aVar;
        this.f4767b = cVar;
    }
}
