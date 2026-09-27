package tk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f137030b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f137031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<Class<?>, Object> f137032b = null;

        public b(String str) {
            this.f137031a = str;
        }

        @NonNull
        public d a() {
            return new d(this.f137031a, this.f137032b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f137032b)));
        }

        @NonNull
        public <T extends Annotation> b b(@NonNull T t10) {
            if (this.f137032b == null) {
                this.f137032b = new HashMap();
            }
            this.f137032b.put(t10.annotationType(), t10);
            return this;
        }
    }

    @NonNull
    public static b a(@NonNull String str) {
        return new b(str);
    }

    @NonNull
    public static d d(@NonNull String str) {
        return new d(str, Collections.EMPTY_MAP);
    }

    @NonNull
    public String b() {
        return this.f137029a;
    }

    @Nullable
    public <T extends Annotation> T c(@NonNull Class<T> cls) {
        return (T) this.f137030b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f137029a.equals(dVar.f137029a) && this.f137030b.equals(dVar.f137030b);
    }

    public int hashCode() {
        return (this.f137029a.hashCode() * 31) + this.f137030b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f137029a + ", properties=" + this.f137030b.values() + "}";
    }

    public d(String str, Map<Class<?>, Object> map) {
        this.f137029a = str;
        this.f137030b = map;
    }
}
