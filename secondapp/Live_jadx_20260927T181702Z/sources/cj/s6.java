package cj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(serializable = true)
@j4
public class s6<K, V> extends g<K, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f24497d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n9
    public final K f24498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n9
    public final V f24499c;

    public s6(@n9 K key, @n9 V value) {
        this.f24498b = key;
        this.f24499c = value;
    }

    @Override // cj.g, java.util.Map.Entry
    @n9
    public final K getKey() {
        return this.f24498b;
    }

    @Override // cj.g, java.util.Map.Entry
    @n9
    public final V getValue() {
        return this.f24499c;
    }

    @Override // cj.g, java.util.Map.Entry
    @n9
    public final V setValue(@n9 V value) {
        throw new UnsupportedOperationException();
    }
}
