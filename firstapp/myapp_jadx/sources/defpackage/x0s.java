package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class x0s extends s4<String> implements y0s, RandomAccess {
    public final ArrayList b;

    static {
        new x0s(10).a = false;
    }

    public x0s(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.s4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof y0s) {
            collection = ((y0s) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ql5) {
            ql5 ql5Var = (ql5) obj;
            String strL = ql5Var.size() == 0 ? "" : ql5Var.l(gyo.a);
            if (ql5Var.f()) {
                arrayList.set(i, strL);
            }
            return strL;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, gyo.a);
        if (yqh0.a.c(bArr, 0, bArr.length)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.y0s
    public final Object getRaw(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.y0s
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.y0s
    public final y0s getUnmodifiableView() {
        return this.a ? new mgh0(this) : this;
    }

    @Override // gyo.c
    public final gyo.c mutableCopyWithCapacity(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            d580.a();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new x0s((ArrayList<Object>) arrayList2);
    }

    @Override // defpackage.y0s
    public final void o1(ql5 ql5Var) {
        a();
        this.b.add(ql5Var);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.s4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ql5)) {
            return new String((byte[]) objRemove, gyo.a);
        }
        ql5 ql5Var = (ql5) objRemove;
        return ql5Var.size() == 0 ? "" : ql5Var.l(gyo.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ql5)) {
            return new String((byte[]) obj2, gyo.a);
        }
        ql5 ql5Var = (ql5) obj2;
        return ql5Var.size() == 0 ? "" : ql5Var.l(gyo.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public x0s(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.b.size(), collection);
    }
}
