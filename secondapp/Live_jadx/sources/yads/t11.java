package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f155668a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f155669b;

    public final synchronized Map a() {
        try {
            if (this.f155669b == null) {
                this.f155669b = Collections.unmodifiableMap(new HashMap(this.f155668a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f155669b;
    }
}
