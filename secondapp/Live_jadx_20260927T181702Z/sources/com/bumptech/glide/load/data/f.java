package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e.a<?> f31433b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f31434a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public e<Object> b(@NonNull Object obj) {
            return new b(obj);
        }
    }

    @NonNull
    public synchronized <T> e<T> a(@NonNull T t10) {
        e.a<?> aVar;
        try {
            pc.m.e(t10);
            aVar = this.f31434a.get(t10.getClass());
            if (aVar == null) {
                for (e.a<?> aVar2 : this.f31434a.values()) {
                    if (aVar2.a().isAssignableFrom(t10.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f31433b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (e<T>) aVar.b(t10);
    }

    public synchronized void b(@NonNull e.a<?> aVar) {
        this.f31434a.put(aVar.a(), aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f31435a;

        public b(@NonNull Object obj) {
            this.f31435a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @NonNull
        public Object a() {
            return this.f31435a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void cleanup() {
        }
    }
}
