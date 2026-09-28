package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c5a0;
import defpackage.e48;
import defpackage.ib5;
import defpackage.jhp;
import defpackage.n5a0;
import defpackage.nxd0;
import defpackage.qg00;
import defpackage.rxd0;
import defpackage.s6a0;
import defpackage.tg00;
import defpackage.txd0;
import defpackage.uxd0;
import defpackage.zg00;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "Lnxd0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateSet<T> implements Parcelable, nxd0, Set<T>, RandomAccess, jhp {
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new a();
    public uxd0 a;

    public SnapshotStateSet() {
        qg00 qg00Var = qg00.e;
        uxd0 uxd0Var = new uxd0(n5a0.g().g(), qg00Var);
        c5a0.e.getClass();
        if (n5a0.b.a() != null) {
            uxd0Var.b = new uxd0(1L, qg00Var);
        }
        this.a = uxd0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        int i;
        zg00<? extends T> zg00Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (s6a0.a) {
                uxd0 uxd0Var = this.a;
                uxd0Var.getClass();
                uxd0 uxd0Var2 = (uxd0) n5a0.e(uxd0Var);
                i = uxd0Var2.d;
                zg00Var = uxd0Var2.c;
                Unit unit = Unit.a;
            }
            zg00Var.getClass();
            qg00 qg00VarAdd = zg00Var.add(t);
            if (qg00VarAdd.equals(zg00Var)) {
                return false;
            }
            uxd0 uxd0Var3 = this.a;
            uxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = s6a0.a((uxd0) n5a0.v(uxd0Var3, this, c5a0VarG), i, qg00VarAdd);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        zg00<? extends T> zg00Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (s6a0.a) {
                uxd0 uxd0Var = this.a;
                uxd0Var.getClass();
                uxd0 uxd0Var2 = (uxd0) n5a0.e(uxd0Var);
                i = uxd0Var2.d;
                zg00Var = uxd0Var2.c;
                Unit unit = Unit.a;
            }
            zg00Var.getClass();
            zg00<? extends T> zg00VarAddAll = zg00Var.addAll((Collection<? extends Object>) collection);
            if (Intrinsics.g(zg00VarAddAll, zg00Var)) {
                return false;
            }
            uxd0 uxd0Var3 = this.a;
            uxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = s6a0.a((uxd0) n5a0.v(uxd0Var3, this, c5a0VarG), i, zg00VarAddAll);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        c5a0 c5a0VarG;
        uxd0 uxd0Var = this.a;
        uxd0Var.getClass();
        synchronized (n5a0.c) {
            c5a0.e.getClass();
            c5a0VarG = n5a0.g();
            uxd0 uxd0Var2 = (uxd0) n5a0.v(uxd0Var, this, c5a0VarG);
            synchronized (s6a0.a) {
                uxd0Var2.c = qg00.e;
                uxd0Var2.d++;
            }
        }
        n5a0.k(c5a0VarG, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return s6a0.b(this).c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return s6a0.b(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return s6a0.b(this).c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new txd0(this, s6a0.b(this).c.iterator());
    }

    @Override // defpackage.nxd0
    public final void n(rxd0 rxd0Var) {
        rxd0Var.b = this.a;
        this.a = (uxd0) rxd0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zg00<? extends T> zg00Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (s6a0.a) {
                uxd0 uxd0Var = this.a;
                uxd0Var.getClass();
                uxd0 uxd0Var2 = (uxd0) n5a0.e(uxd0Var);
                i = uxd0Var2.d;
                zg00Var = uxd0Var2.c;
                Unit unit = Unit.a;
            }
            zg00Var.getClass();
            qg00 qg00VarRemove = zg00Var.remove(obj);
            if (qg00VarRemove.equals(zg00Var)) {
                return false;
            }
            uxd0 uxd0Var3 = this.a;
            uxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = s6a0.a((uxd0) n5a0.v(uxd0Var3, this, c5a0VarG), i, qg00VarRemove);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        zg00<? extends T> zg00Var;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (s6a0.a) {
                uxd0 uxd0Var = this.a;
                uxd0Var.getClass();
                uxd0 uxd0Var2 = (uxd0) n5a0.e(uxd0Var);
                i = uxd0Var2.d;
                zg00Var = uxd0Var2.c;
                Unit unit = Unit.a;
            }
            zg00Var.getClass();
            zg00<? extends T> zg00VarRemoveAll = zg00Var.removeAll((Collection<? extends Object>) collection);
            if (Intrinsics.g(zg00VarRemoveAll, zg00Var)) {
                return false;
            }
            uxd0 uxd0Var3 = this.a;
            uxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = s6a0.a((uxd0) n5a0.v(uxd0Var3, this, c5a0VarG), i, zg00VarRemoveAll);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        zg00<? extends T> zg00Var;
        boolean zRetainAll;
        c5a0 c5a0VarG;
        boolean zA;
        do {
            synchronized (s6a0.a) {
                uxd0 uxd0Var = this.a;
                uxd0Var.getClass();
                uxd0 uxd0Var2 = (uxd0) n5a0.e(uxd0Var);
                i = uxd0Var2.d;
                zg00Var = uxd0Var2.c;
                Unit unit = Unit.a;
            }
            if (zg00Var == null) {
                ib5.a("No set to mutate");
                return false;
            }
            tg00 tg00VarBuilder = zg00Var.builder();
            zRetainAll = tg00VarBuilder.retainAll(CollectionsKt.E0(collection));
            qg00 qg00VarC = tg00VarBuilder.c();
            if (qg00VarC.equals(zg00Var)) {
                break;
            }
            uxd0 uxd0Var3 = this.a;
            uxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = s6a0.a((uxd0) n5a0.v(uxd0Var3, this, c5a0VarG), i, qg00VarC);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zA);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return s6a0.b(this).c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return e48.a(this);
    }

    public final String toString() {
        uxd0 uxd0Var = this.a;
        uxd0Var.getClass();
        return "SnapshotStateSet(value=" + ((uxd0) n5a0.e(uxd0Var)).c + ")@" + hashCode();
    }

    @Override // defpackage.nxd0
    public final rxd0 v() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zg00<? extends T> zg00Var = s6a0.b(this).c;
        parcel.writeInt(size());
        Iterator<? extends T> it = zg00Var.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) e48.b(this, tArr);
    }

    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateSet<Object>> {
        /* JADX WARN: Multi-variable type inference failed */
        public static SnapshotStateSet a(Parcel parcel, ClassLoader classLoader) {
            SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
            if (classLoader == null) {
                classLoader = SnapshotStateSet.class.getClassLoader();
            }
            int i = parcel.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                snapshotStateSet.add(parcel.readValue(classLoader));
            }
            return snapshotStateSet;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SnapshotStateSet[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ SnapshotStateSet<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }
}
