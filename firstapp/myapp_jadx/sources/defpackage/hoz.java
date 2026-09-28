package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class hoz<T> extends AbstractList<T> implements r5s.a<Object>, mi10<T> {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int i;

    public hoz(hoz<T> hozVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = true;
        arrayList.addAll(hozVar.a);
        this.b = hozVar.b;
        this.c = hozVar.c;
        this.d = hozVar.d;
        this.e = hozVar.e;
        this.f = hozVar.f;
        this.i = hozVar.i;
    }

    @Override // defpackage.mi10
    public final int a() {
        return this.b + this.f + this.c;
    }

    @Override // defpackage.mi10
    public final int b() {
        return this.f;
    }

    @Override // r5s.a
    public final Object c() {
        if (!this.e || this.c > 0) {
            return ((wqz.b.c) CollectionsKt.b0(this.a)).c;
        }
        return null;
    }

    @Override // defpackage.mi10
    public final int d() {
        return this.b;
    }

    @Override // r5s.a
    public final Object e() {
        if (!this.e || this.b + this.d > 0) {
            return ((wqz.b.c) CollectionsKt.T(this.a)).b;
        }
        return null;
    }

    @Override // defpackage.mi10
    public final int f() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        int i2 = i - this.b;
        if (i < 0 || i >= a()) {
            ks40.a(a(), efe0.a(i, "Index: ", ", Size: "));
            return null;
        }
        if (i2 < 0 || i2 >= this.f) {
            return null;
        }
        return getItem(i2);
    }

    @Override // defpackage.mi10
    public final T getItem(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((wqz.b.c) arrayList.get(i2)).a.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return (T) ((wqz.b.c) arrayList.get(i2)).a.get(i);
    }

    public final void h(int i, wqz.b.c cVar, int i2, int i3, u1b u1bVar, boolean z) {
        cVar.getClass();
        this.b = i;
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(cVar);
        this.c = i2;
        this.d = i3;
        List<Value> list = cVar.a;
        this.f = list.size();
        this.e = z;
        this.i = list.size() / 2;
        u1bVar.l(0, a());
        hoz<T> hozVar = u1bVar.d;
        u1bVar.G = hozVar.b > 0 || hozVar.c > 0;
    }

    public final boolean i(int i, int i2) {
        ArrayList arrayList = this.a;
        return this.f > Integer.MAX_VALUE && arrayList.size() > 2 && this.f - ((wqz.b.c) arrayList.get(i2)).a.size() >= i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "leading " + this.b + ", dataCount " + this.f + ", trailing " + this.c + ' ' + CollectionsKt.a0(this.a, " ", null, null, null, 62);
    }

    public hoz() {
        this.a = new ArrayList();
        this.e = true;
    }
}
