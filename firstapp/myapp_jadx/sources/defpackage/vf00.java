package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface vf00<K, V> extends Map, dhp {

    public interface a<K, V> extends Map<K, V>, ghp {
        vf00<K, V> build();
    }

    a<K, V> builder();
}
