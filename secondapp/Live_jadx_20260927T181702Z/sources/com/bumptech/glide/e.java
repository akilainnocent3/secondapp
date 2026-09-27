package com.bumptech.glide;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, b> f30422a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, b> f30423a = new HashMap();

        public a b(b bVar) {
            this.f30423a.put(bVar.getClass(), bVar);
            return this;
        }

        public e c() {
            return new e(this);
        }

        public a d(b bVar, boolean z10) {
            if (z10) {
                b(bVar);
                return this;
            }
            this.f30423a.remove(bVar.getClass());
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
    }

    public e(a aVar) {
        this.f30422a = Collections.unmodifiableMap(new HashMap(aVar.f30423a));
    }

    @Nullable
    public <T extends b> T a(Class<T> cls) {
        return (T) this.f30422a.get(cls);
    }

    public boolean b(Class<? extends b> cls) {
        return this.f30422a.containsKey(cls);
    }
}
