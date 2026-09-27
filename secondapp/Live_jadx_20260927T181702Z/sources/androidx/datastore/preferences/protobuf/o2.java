package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class o2<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10166d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10167e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<K, V> f10168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f10169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f10170c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10171a;

        static {
            int[] iArr = new int[f5.b.values().length];
            f10171a = iArr;
            try {
                iArr[f5.b.f9960n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10171a[f5.b.f9963q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10171a[f5.b.f9959m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5.b f10172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f10173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f5.b f10174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f10175d;

        public b(f5.b keyType, K defaultKey, f5.b valueType, V defaultValue) {
            this.f10172a = keyType;
            this.f10173b = defaultKey;
            this.f10174c = valueType;
            this.f10175d = defaultValue;
        }
    }

    public o2(f5.b keyType, K defaultKey, f5.b valueType, V defaultValue) {
        this.f10168a = new b<>(keyType, defaultKey, valueType, defaultValue);
        this.f10169b = defaultKey;
        this.f10170c = defaultValue;
    }

    public static <K, V> int b(b<K, V> metadata, K key, V value) {
        return f1.o(metadata.f10172a, 1, key) + f1.o(metadata.f10174c, 2, value);
    }

    public static <K, V> o2<K, V> f(f5.b keyType, K defaultKey, f5.b valueType, V defaultValue) {
        return new o2<>(keyType, defaultKey, valueType, defaultValue);
    }

    public static <K, V> Map.Entry<K, V> h(z input, b<K, V> metadata, v0 extensionRegistry) throws IOException {
        Object objI = metadata.f10173b;
        Object objI2 = metadata.f10175d;
        while (true) {
            int iZ = input.Z();
            if (iZ == 0) {
                break;
            }
            if (iZ == f5.c(1, metadata.f10172a.g())) {
                objI = i(input, extensionRegistry, metadata.f10172a, objI);
            } else if (iZ == f5.c(2, metadata.f10174c.g())) {
                objI2 = i(input, extensionRegistry, metadata.f10174c, objI2);
            } else if (!input.h0(iZ)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objI, objI2);
    }

    public static <T> T i(z zVar, v0 v0Var, f5.b bVar, T t10) throws IOException {
        int i10 = a.f10171a[bVar.ordinal()];
        if (i10 == 1) {
            v2.a builder = ((v2) t10).toBuilder();
            zVar.J(builder, v0Var);
            return (T) builder.buildPartial();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(zVar.A());
        }
        if (i10 != 3) {
            return (T) f1.O(zVar, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static <K, V> void l(b0 output, b<K, V> metadata, K key, V value) throws IOException {
        f1.S(output, metadata.f10172a, 1, key);
        f1.S(output, metadata.f10174c, 2, value);
    }

    public int a(int fieldNumber, K key, V value) {
        return b0.k0(fieldNumber) + b0.Q(b(this.f10168a, key, value));
    }

    public K c() {
        return this.f10169b;
    }

    public b<K, V> d() {
        return this.f10168a;
    }

    public V e() {
        return this.f10170c;
    }

    public Map.Entry<K, V> g(u bytes, v0 extensionRegistry) throws IOException {
        return h(bytes.M(), this.f10168a, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(p2<K, V> map, z input, v0 extensionRegistry) throws IOException {
        int iU = input.u(input.O());
        b<K, V> bVar = this.f10168a;
        Object objI = bVar.f10173b;
        Object objI2 = bVar.f10175d;
        while (true) {
            int iZ = input.Z();
            if (iZ == 0) {
                break;
            }
            if (iZ == f5.c(1, this.f10168a.f10172a.g())) {
                objI = i(input, extensionRegistry, this.f10168a.f10172a, objI);
            } else if (iZ == f5.c(2, this.f10168a.f10174c.g())) {
                objI2 = i(input, extensionRegistry, this.f10168a.f10174c, objI2);
            } else if (!input.h0(iZ)) {
                break;
            }
        }
        input.a(0);
        input.t(iU);
        map.put(objI, objI2);
    }

    public void k(b0 output, int fieldNumber, K key, V value) throws IOException {
        output.t1(fieldNumber, 2);
        output.u1(b(this.f10168a, key, value));
        l(output, this.f10168a, key, value);
    }

    public o2(b<K, V> metadata, K key, V value) {
        this.f10168a = metadata;
        this.f10169b = key;
        this.f10170c = value;
    }
}
