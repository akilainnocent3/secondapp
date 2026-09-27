package kc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import tb.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?>> f102139a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f102140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<T> f102141b;

        public a(@NonNull Class<T> cls, @NonNull l<T> lVar) {
            this.f102140a = cls;
            this.f102141b = lVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f102140a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@NonNull Class<Z> cls, @NonNull l<Z> lVar) {
        this.f102139a.add(new a<>(cls, lVar));
    }

    @Nullable
    public synchronized <Z> l<Z> b(@NonNull Class<Z> cls) {
        int size = this.f102139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f102139a.get(i10);
            if (aVar.a(cls)) {
                return (l<Z>) aVar.f102141b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@NonNull Class<Z> cls, @NonNull l<Z> lVar) {
        this.f102139a.add(0, new a<>(cls, lVar));
    }
}
