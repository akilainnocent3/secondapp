package qc;

import android.util.Log;
import androidx.annotation.NonNull;
import e2.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f122158a = "FactoryPools";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f122159b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g<Object> f122160c = new C1181a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b<T> implements d<List<T>> {
        @Override // qc.a.d
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c<T> implements g<List<T>> {
        @Override // qc.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e<T> implements w.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<T> f122161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g<T> f122162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w.a<T> f122163c;

        public e(@NonNull w.a<T> aVar, @NonNull d<T> dVar, @NonNull g<T> gVar) {
            this.f122163c = aVar;
            this.f122161a = dVar;
            this.f122162b = gVar;
        }

        @Override // e2.w.a
        public T a() {
            T tA = this.f122163c.a();
            if (tA == null) {
                tA = this.f122161a.a();
                if (Log.isLoggable(a.f122158a, 2)) {
                    Log.v(a.f122158a, "Created new " + tA.getClass());
                }
            }
            if (tA instanceof f) {
                ((f) tA).d().b(false);
            }
            return tA;
        }

        @Override // e2.w.a
        public boolean b(@NonNull T t10) {
            if (t10 instanceof f) {
                ((f) t10).d().b(true);
            }
            this.f122162b.a(t10);
            return this.f122163c.b(t10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        @NonNull
        qc.c d();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g<T> {
        void a(@NonNull T t10);
    }

    @NonNull
    public static <T extends f> w.a<T> a(@NonNull w.a<T> aVar, @NonNull d<T> dVar) {
        return b(aVar, dVar, c());
    }

    @NonNull
    public static <T> w.a<T> b(@NonNull w.a<T> aVar, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @NonNull
    public static <T> g<T> c() {
        return (g<T>) f122160c;
    }

    @NonNull
    public static <T extends f> w.a<T> d(int i10, @NonNull d<T> dVar) {
        return a(new w.b(i10), dVar);
    }

    @NonNull
    public static <T extends f> w.a<T> e(int i10, @NonNull d<T> dVar) {
        return a(new w.c(i10), dVar);
    }

    @NonNull
    public static <T extends f> w.a<T> f(int i10, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return b(new w.c(i10), dVar, gVar);
    }

    @NonNull
    public static <T> w.a<List<T>> g() {
        return h(20);
    }

    @NonNull
    public static <T> w.a<List<T>> h(int i10) {
        return b(new w.c(i10), new b(), new c());
    }

    /* JADX INFO: renamed from: qc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C1181a implements g<Object> {
        @Override // qc.a.g
        public void a(@NonNull Object obj) {
        }
    }
}
