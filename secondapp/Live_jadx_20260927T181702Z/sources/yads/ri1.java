package yads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ri1 extends AbstractMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient l f154978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient qi1 f154979c;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f154978b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l((n) this);
        this.f154978b = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        qi1 qi1Var = this.f154979c;
        if (qi1Var != null) {
            return qi1Var;
        }
        qi1 qi1Var2 = new qi1(this);
        this.f154979c = qi1Var2;
        return qi1Var2;
    }
}
