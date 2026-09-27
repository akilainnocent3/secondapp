package bj;

import java.util.AbstractMap;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@i
public final class a0<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f21488c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f21489b;

    public a0(@zq.a K key, @zq.a V value, v cause) {
        super(key, value);
        this.f21489b = (v) l0.E(cause);
    }

    public static <K, V> a0<K, V> a(@zq.a K key, @zq.a V value, v cause) {
        return new a0<>(key, value, cause);
    }

    public v d() {
        return this.f21489b;
    }

    public boolean g() {
        return this.f21489b.g();
    }
}
