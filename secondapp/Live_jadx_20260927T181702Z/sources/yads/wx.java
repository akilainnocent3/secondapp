package yads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wx extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cy f157568b;

    public wx(cy cyVar) {
        this.f157568b = cyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f157568b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapA = this.f157568b.a();
        if (mapA != null) {
            return mapA.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iA = this.f157568b.a(entry.getKey());
            if (iA != -1 && l92.a(this.f157568b.c(iA), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        cy cyVar = this.f157568b;
        Map mapA = cyVar.a();
        return mapA != null ? mapA.entrySet().iterator() : new ux(cyVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10;
        int iA;
        Map mapA = this.f157568b.a();
        if (mapA != null) {
            return mapA.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f157568b.c() || (iA = dy.a(entry.getKey(), entry.getValue(), (i10 = (1 << (this.f157568b.f147943f & 31)) - 1), this.f157568b.f(), this.f157568b.d(), this.f157568b.e(), this.f157568b.g())) == -1) {
            return false;
        }
        this.f157568b.a(iA, i10);
        cy cyVar = this.f157568b;
        cyVar.f147944g--;
        cyVar.f147943f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f157568b.size();
    }
}
