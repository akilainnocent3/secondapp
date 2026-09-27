package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f2 extends c<String> implements g2, RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f2 f9922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final g2 f9923f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Object> f9924d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f2 f9925b;

        public a(f2 list) {
            this.f9925b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(int index, byte[] s10) {
            this.f9925b.n(index, s10);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] get(int index) {
            return this.f9925b.getByteArray(index);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int index) {
            String strRemove = this.f9925b.remove(index);
            ((AbstractList) this).modCount++;
            return f2.p(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] set(int index, byte[] s10) {
            Object objY = this.f9925b.y(index, s10);
            ((AbstractList) this).modCount++;
            return f2.p(objY);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9925b.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends AbstractList<u> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f2 f9926b;

        public b(f2 list) {
            this.f9926b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(int index, u s10) {
            this.f9926b.l(index, s10);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u get(int index) {
            return this.f9926b.getByteString(index);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public u remove(int index) {
            String strRemove = this.f9926b.remove(index);
            ((AbstractList) this).modCount++;
            return f2.q(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public u set(int index, u s10) {
            Object objX = this.f9926b.x(index, s10);
            ((AbstractList) this).modCount++;
            return f2.q(objX);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9926b.size();
        }
    }

    static {
        f2 f2Var = new f2(false);
        f9922e = f2Var;
        f9923f = f2Var;
    }

    public f2() {
        this(10);
    }

    public static byte[] p(Object o10) {
        if (o10 instanceof byte[]) {
            return (byte[]) o10;
        }
        return o10 instanceof String ? t1.y((String) o10) : ((u) o10).c0();
    }

    public static u q(Object o10) {
        if (o10 instanceof u) {
            return (u) o10;
        }
        return o10 instanceof String ? u.u((String) o10) : u.s((byte[]) o10);
    }

    public static String r(Object o10) {
        if (o10 instanceof String) {
            return (String) o10;
        }
        return o10 instanceof u ? ((u) o10).j0() : t1.z((byte[]) o10);
    }

    public static f2 s() {
        return f9922e;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void P0(int index, u s10) {
        x(index, s10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> c10) {
        return addAll(size(), c10);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public boolean addAllByteArray(Collection<byte[]> c10) {
        d();
        boolean zAddAll = this.f9924d.addAll(c10);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public boolean addAllByteString(Collection<? extends u> values) {
        d();
        boolean zAddAll = this.f9924d.addAll(values);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public List<byte[]> asByteArrayList() {
        return new a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public List<u> asByteStringList() {
        return new b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        this.f9924d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void d1(g2 other) {
        d();
        for (Object obj : other.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f9924d.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f9924d.add(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object o10) {
        return super.equals(o10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g2
    public byte[] getByteArray(int i10) {
        Object obj = this.f9924d.get(i10);
        byte[] bArrP = p(obj);
        if (bArrP != obj) {
            this.f9924d.set(i10, bArrP);
        }
        return bArrP;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public u getByteString(int index) {
        Object obj = this.f9924d.get(index);
        u uVarQ = q(obj);
        if (uVarQ != obj) {
            this.f9924d.set(index, uVarQ);
        }
        return uVarQ;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public Object getRaw(int index) {
        return this.f9924d.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f9924d);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public g2 getUnmodifiableView() {
        return isModifiable() ? new z4(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.c, androidx.datastore.preferences.protobuf.t1.l
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    public final void l(int index, u element) {
        d();
        this.f9924d.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int index, String element) {
        d();
        this.f9924d.add(index, element);
        ((AbstractList) this).modCount++;
    }

    public final void n(int index, byte[] element) {
        d();
        this.f9924d.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @x
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(String element) {
        d();
        this.f9924d.add(element);
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void o0(u element) {
        d();
        this.f9924d.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection c10) {
        return super.removeAll(c10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection c10) {
        return super.retainAll(c10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9924d.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public String get(int index) {
        Object obj = this.f9924d.get(index);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            String strJ0 = uVar.j0();
            if (uVar.J()) {
                this.f9924d.set(index, strJ0);
            }
            return strJ0;
        }
        byte[] bArr = (byte[]) obj;
        String strZ = t1.z(bArr);
        if (t1.u(bArr)) {
            this.f9924d.set(index, strZ);
        }
        return strZ;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public f2 mutableCopyWithCapacity2(int capacity) {
        if (capacity < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(capacity);
        arrayList.addAll(this.f9924d);
        return new f2((ArrayList<Object>) arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public String remove(int index) {
        d();
        Object objRemove = this.f9924d.remove(index);
        ((AbstractList) this).modCount++;
        return r(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public String set(int index, String s10) {
        d();
        return r(this.f9924d.set(index, s10));
    }

    public final Object x(int index, u s10) {
        d();
        return this.f9924d.set(index, s10);
    }

    public final Object y(int index, byte[] s10) {
        d();
        return this.f9924d.set(index, s10);
    }

    public f2(boolean isMutable) {
        super(isMutable);
        this.f9924d = Collections.EMPTY_LIST;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends String> c10) {
        d();
        if (c10 instanceof g2) {
            c10 = ((g2) c10).getUnderlyingElements();
        }
        boolean zAddAll = this.f9924d.addAll(index, c10);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object o10) {
        return super.remove(o10);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void set(int index, byte[] s10) {
        y(index, s10);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void add(byte[] element) {
        d();
        this.f9924d.add(element);
        ((AbstractList) this).modCount++;
    }

    public f2(int initialCapacity) {
        this((ArrayList<Object>) new ArrayList(initialCapacity));
    }

    public f2(g2 from) {
        this.f9924d = new ArrayList(from.size());
        addAll(from);
    }

    public f2(List<String> from) {
        this((ArrayList<Object>) new ArrayList(from));
    }

    public f2(ArrayList<Object> list) {
        this.f9924d = list;
    }
}
