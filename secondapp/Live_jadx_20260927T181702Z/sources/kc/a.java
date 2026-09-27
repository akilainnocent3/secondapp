package kc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C0967a<?>> f102125a = new ArrayList();

    /* JADX INFO: renamed from: kc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0967a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f102126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final tb.d<T> f102127b;

        public C0967a(@NonNull Class<T> cls, @NonNull tb.d<T> dVar) {
            this.f102126a = cls;
            this.f102127b = dVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f102126a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@NonNull Class<T> cls, @NonNull tb.d<T> dVar) {
        this.f102125a.add(new C0967a<>(cls, dVar));
    }

    @Nullable
    public synchronized <T> tb.d<T> b(@NonNull Class<T> cls) {
        for (C0967a<?> c0967a : this.f102125a) {
            if (c0967a.a(cls)) {
                return (tb.d<T>) c0967a.f102127b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@NonNull Class<T> cls, @NonNull tb.d<T> dVar) {
        this.f102125a.add(0, new C0967a<>(cls, dVar));
    }
}
