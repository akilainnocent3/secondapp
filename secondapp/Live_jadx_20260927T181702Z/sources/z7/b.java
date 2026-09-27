package z7;

import android.os.Bundle;
import androidx.navigation.r;
import java.util.Map;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Bundle f160832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Map<String, r<?>> f160833b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@oy.l Bundle bundle, @oy.l Map<String, ? extends r<?>> typeMap) {
        m0.p(bundle, "bundle");
        m0.p(typeMap, "typeMap");
        this.f160832a = bundle;
        this.f160833b = typeMap;
    }

    @Override // z7.a
    public boolean a(@oy.l String key) {
        m0.p(key, "key");
        return this.f160832a.containsKey(key);
    }

    @Override // z7.a
    @oy.m
    public Object b(@oy.l String key) {
        m0.p(key, "key");
        r<?> rVar = this.f160833b.get(key);
        if (rVar != null) {
            return rVar.b(this.f160832a, key);
        }
        return null;
    }
}
