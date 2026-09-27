package androidx.databinding;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface z<K, V> extends Map<K, V> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a<T extends z<K, V>, K, V> {
        public abstract void a(T sender, K key);
    }

    void S(a<? extends z<K, V>, K, V> callback);

    void i1(a<? extends z<K, V>, K, V> callback);
}
