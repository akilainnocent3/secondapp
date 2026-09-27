package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface g4 extends w2 {
    d5 a3(String key, d5 defaultValue);

    boolean containsFields(String key);

    @Deprecated
    Map<String, d5> getFields();

    int getFieldsCount();

    Map<String, d5> getFieldsMap();

    d5 getFieldsOrThrow(String key);
}
