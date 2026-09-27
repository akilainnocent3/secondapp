package yads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class z extends x implements List {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f158541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Object obj, List list, x xVar) {
        super(a0Var, obj, list, xVar);
        this.f158541g = a0Var;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        c();
        boolean zIsEmpty = this.f157593c.isEmpty();
        ((List) this.f157593c).add(i10, obj);
        this.f158541g.f146595g++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f157593c.size();
        boolean zAddAll = ((List) this.f157593c).addAll(i10, collection);
        if (zAddAll) {
            int size2 = this.f157593c.size();
            a0 a0Var = this.f158541g;
            a0Var.f146595g = (size2 - size) + a0Var.f146595g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final List e() {
        return (List) this.f157593c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c();
        return ((List) this.f157593c).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f157593c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f157593c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new y(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        c();
        Object objRemove = ((List) this.f157593c).remove(i10);
        this.f158541g.f146595g--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        c();
        return ((List) this.f157593c).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        c();
        a0 a0Var = this.f158541g;
        Object obj = this.f157592b;
        List listSubList = ((List) this.f157593c).subList(i10, i11);
        x xVar = this.f157594d;
        if (xVar == null) {
            xVar = this;
        }
        a0Var.getClass();
        return listSubList instanceof RandomAccess ? new t(a0Var, obj, listSubList, xVar) : new z(a0Var, obj, listSubList, xVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        c();
        return new y(this, i10);
    }
}
