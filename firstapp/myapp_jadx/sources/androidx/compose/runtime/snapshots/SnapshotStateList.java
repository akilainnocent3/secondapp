package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c5a0;
import defpackage.dxd0;
import defpackage.e48;
import defpackage.fh00;
import defpackage.fhp;
import defpackage.gce0;
import defpackage.gxd0;
import defpackage.l6a0;
import defpackage.lm20;
import defpackage.m4;
import defpackage.n5a0;
import defpackage.nxd0;
import defpackage.o1a0;
import defpackage.o4;
import defpackage.rxd0;
import defpackage.s2l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Lnxd0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateList<T> implements Parcelable, nxd0, List<T>, RandomAccess, fhp {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new a();
    public gxd0 a;

    public SnapshotStateList(o4 o4Var) {
        c5a0 c5a0VarG = n5a0.g();
        gxd0 gxd0Var = new gxd0(c5a0VarG.g(), o4Var);
        if (!(c5a0VarG instanceof s2l)) {
            gxd0Var.b = new gxd0(1L, o4Var);
        }
        this.a = gxd0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = this.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            o4 o4VarD = o4Var.d(t);
            if (o4VarD.equals(o4Var)) {
                return false;
            }
            gxd0 gxd0Var3 = this.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, this, c5a0VarG), i, o4VarD, true);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = this.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            o4 o4VarE = o4Var.e(collection);
            if (Intrinsics.g(o4VarE, o4Var)) {
                return false;
            }
            gxd0 gxd0Var3 = this.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, this, c5a0VarG), i, o4VarE, true);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        c5a0 c5a0VarG;
        gxd0 gxd0Var = this.a;
        gxd0Var.getClass();
        synchronized (n5a0.c) {
            c5a0.e.getClass();
            c5a0VarG = n5a0.g();
            gxd0 gxd0Var2 = (gxd0) n5a0.v(gxd0Var, this, c5a0VarG);
            synchronized (l6a0.a) {
                gxd0Var2.c = o1a0.c;
                gxd0Var2.d++;
                gxd0Var2.e++;
            }
        }
        n5a0.k(c5a0VarG, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return l6a0.b(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return l6a0.b(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2) {
        int i3;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = this.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i3 = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            fh00 fh00VarF = o4Var.f();
            fh00VarF.subList(i, i2).clear();
            o4 o4VarD = fh00VarF.d();
            if (Intrinsics.g(o4VarD, o4Var)) {
                return;
            }
            gxd0 gxd0Var3 = this.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, this, c5a0VarG), i3, o4VarD, true);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) l6a0.b(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return l6a0.b(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return l6a0.b(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return l6a0.b(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new dxd0(this, 0);
    }

    @Override // defpackage.nxd0
    public final void n(rxd0 rxd0Var) {
        rxd0Var.b = this.a;
        this.a = (gxd0) rxd0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = this.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            int iIndexOf = o4Var.indexOf(obj);
            o4 o4VarI = iIndexOf != -1 ? o4Var.i(iIndexOf) : o4Var;
            if (Intrinsics.g(o4VarI, o4Var)) {
                return false;
            }
            gxd0 gxd0Var3 = this.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, this, c5a0VarG), i, o4VarI, true);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = this.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            o4 o4VarH = o4Var.h(new m4(collection, 0));
            if (Intrinsics.g(o4VarH, o4Var)) {
                return false;
            }
            gxd0 gxd0Var3 = this.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, this, c5a0VarG), i, o4VarH, true);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(final Collection<?> collection) {
        return l6a0.e(this, new Function1() { // from class: j6a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).retainAll(collection));
            }
        });
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        T t2 = get(i);
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = this.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i2 = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            o4 o4VarJ = o4Var.j(i, t);
            if (o4VarJ.equals(o4Var)) {
                break;
            }
            gxd0 gxd0Var3 = this.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, this, c5a0VarG), i2, o4VarJ, false);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return l6a0.b(this).c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            lm20.a("fromIndex or toIndex are out of bounds");
        }
        return new gce0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return e48.a(this);
    }

    public final String toString() {
        gxd0 gxd0Var = this.a;
        gxd0Var.getClass();
        return "SnapshotStateList(value=" + ((gxd0) n5a0.e(gxd0Var)).c + ")@" + hashCode();
    }

    @Override // defpackage.nxd0
    public final rxd0 v() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o4 o4Var = l6a0.b(this).c;
        int size = o4Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(o4Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) e48.b(this, tArr);
    }

    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
        public static SnapshotStateList a(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            int i = parcel.readInt();
            if (i == 0) {
                return new SnapshotStateList();
            }
            fh00 fh00VarF = o1a0.c.f();
            for (int i2 = 0; i2 < i; i2++) {
                fh00VarF.add(parcel.readValue(classLoader));
            }
            return new SnapshotStateList(fh00VarF.d());
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SnapshotStateList[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ SnapshotStateList<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new dxd0(this, i);
    }

    public SnapshotStateList() {
        this(o1a0.c);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = this.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i2 = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            o4 o4VarC = o4Var.c(i, t);
            if (o4VarC.equals(o4Var)) {
                return;
            }
            gxd0 gxd0Var3 = this.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, this, c5a0VarG), i2, o4VarC, true);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection<? extends T> collection) {
        return l6a0.e(this, new Function1() { // from class: k6a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        T t = get(i);
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = this.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i2 = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            o4 o4VarI = o4Var.i(i);
            if (o4VarI.equals(o4Var)) {
                break;
            }
            gxd0 gxd0Var3 = this.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, this, c5a0VarG), i2, o4VarI, true);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return t;
    }
}
