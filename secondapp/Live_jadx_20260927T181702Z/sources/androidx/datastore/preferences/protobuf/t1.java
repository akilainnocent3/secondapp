package androidx.datastore.preferences.protobuf;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f10214a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f10215b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f10216c = Charset.forName(CharEncoding.ISO_8859_1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10217d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteBuffer f10219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f10220g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a extends l<Boolean> {
        void addBoolean(boolean element);

        boolean getBoolean(int index);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        l<Boolean> mutableCopyWithCapacity(int capacity);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ l<Boolean> mutableCopyWithCapacity2(int capacity);

        @x
        boolean setBoolean(int index, boolean element);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b extends l<Double> {
        void addDouble(double element);

        double getDouble(int index);

        @Override // 
        l<Double> mutableCopyWithCapacity(int capacity);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ l<Double> mutableCopyWithCapacity2(int capacity);

        @x
        double setDouble(int index, double element);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        int getNumber();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d<T extends c> {
        T findValueByNumber(int number);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        boolean isInRange(int number);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f extends l<Float> {
        void addFloat(float element);

        float getFloat(int index);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        l<Float> mutableCopyWithCapacity(int capacity);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ l<Float> mutableCopyWithCapacity2(int capacity);

        @x
        float setFloat(int index, float element);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g extends l<Integer> {
        void addInt(int element);

        int getInt(int index);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        l<Integer> mutableCopyWithCapacity(int capacity);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ l<Integer> mutableCopyWithCapacity2(int capacity);

        @x
        int setInt(int index, int element);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f10221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f10222c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface a<T> {
            T a(int from);
        }

        public h(g fromList, a<T> converter) {
            this.f10221b = fromList;
            this.f10222c = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int index) {
            return this.f10222c.a(this.f10221b.getInt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10221b.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<F> f10223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<F, T> f10224c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface a<F, T> {
            T convert(F from);
        }

        public i(List<F> fromList, a<F, T> converter) {
            this.f10223b = fromList;
            this.f10224c = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return (T) this.f10224c.convert(this.f10223b.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10223b.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface j extends l<Long> {
        void addLong(long element);

        long getLong(int index);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        l<Long> mutableCopyWithCapacity(int capacity);

        @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ l<Long> mutableCopyWithCapacity2(int capacity);

        @x
        long setLong(int index, long element);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class k<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<K, RealValue> f10225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b<RealValue, V> f10226c;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a<T> implements b<Integer, T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f10227a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f10228b;

            public a(final d val$enumMap, final c val$unrecognizedValue) {
                this.f10227a = val$enumMap;
                this.f10228b = val$unrecognizedValue;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // androidx.datastore.preferences.protobuf.t1.k.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer doBackward(c value) {
                return Integer.valueOf(value.getNumber());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // androidx.datastore.preferences.protobuf.t1.k.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c doForward(Integer value) {
                c cVarFindValueByNumber = this.f10227a.findValueByNumber(value.intValue());
                return cVarFindValueByNumber == null ? this.f10228b : cVarFindValueByNumber;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface b<A, B> {
            A doBackward(B object);

            B doForward(A object);
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Map.Entry<K, RealValue> f10229b;

            public c(Map.Entry<K, RealValue> realEntry) {
                this.f10229b = realEntry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object o10) {
                if (o10 == this) {
                    return true;
                }
                return (o10 instanceof Map.Entry) && getKey().equals(((Map.Entry) o10).getKey()) && getValue().equals(getValue());
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.f10229b.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) k.this.f10226c.doForward(this.f10229b.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f10229b.hashCode();
            }

            @Override // java.util.Map.Entry
            public V setValue(V v10) {
                RealValue value = this.f10229b.setValue((RealValue) k.this.f10226c.doBackward(v10));
                if (value == null) {
                    return null;
                }
                return (V) k.this.f10226c.doForward(value);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class d implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<Map.Entry<K, RealValue>> f10231b;

            public d(Iterator<Map.Entry<K, RealValue>> realIterator) {
                this.f10231b = realIterator;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return new c(this.f10231b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10231b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f10231b.remove();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class e extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Set<Map.Entry<K, RealValue>> f10233b;

            public e(Set<Map.Entry<K, RealValue>> realSet) {
                this.f10233b = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f10233b.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f10233b.size();
            }
        }

        public k(Map<K, RealValue> realMap, b<RealValue, V> valueConverter) {
            this.f10225b = realMap;
            this.f10226c = valueConverter;
        }

        public static <T extends c> b<Integer, T> b(final d<T> enumMap, final T unrecognizedValue) {
            return new a(enumMap, unrecognizedValue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f10225b.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object key) {
            RealValue realvalue = this.f10225b.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.f10226c.doForward(realvalue);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            RealValue realvaluePut = this.f10225b.put(k10, this.f10226c.doBackward(v10));
            if (realvaluePut == null) {
                return null;
            }
            return this.f10226c.doForward(realvaluePut);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface l<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        l<E> mutableCopyWithCapacity(int capacity);
    }

    static {
        byte[] bArr = new byte[0];
        f10218e = bArr;
        f10219f = ByteBuffer.wrap(bArr);
        f10220g = z.q(bArr);
    }

    public static byte[] a(String bytes) {
        return bytes.getBytes(f10216c);
    }

    public static ByteBuffer b(String bytes) {
        return ByteBuffer.wrap(a(bytes));
    }

    public static u c(String bytes) {
        return u.s(bytes.getBytes(f10216c));
    }

    public static <T> T d(T obj) {
        obj.getClass();
        return obj;
    }

    public static <T> T e(T obj, String message) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(message);
    }

    public static ByteBuffer f(ByteBuffer source) {
        ByteBuffer byteBufferDuplicate = source.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean g(List<byte[]> a10, List<byte[]> b10) {
        if (a10.size() != b10.size()) {
            return false;
        }
        for (int i10 = 0; i10 < a10.size(); i10++) {
            if (!Arrays.equals(a10.get(i10), b10.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(ByteBuffer a10, ByteBuffer b10) {
        if (a10.capacity() != b10.capacity()) {
            return false;
        }
        ByteBuffer byteBufferDuplicate = a10.duplicate();
        a2.a(byteBufferDuplicate);
        ByteBuffer byteBufferDuplicate2 = b10.duplicate();
        a2.a(byteBufferDuplicate2);
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static boolean i(List<ByteBuffer> a10, List<ByteBuffer> b10) {
        if (a10.size() != b10.size()) {
            return false;
        }
        for (int i10 = 0; i10 < a10.size(); i10++) {
            if (!h(a10.get(i10), b10.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static <T extends v2> T j(Class<T> clazz) {
        try {
            Method method = clazz.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to get default instance for " + clazz, e10);
        }
    }

    public static int k(boolean b10) {
        return b10 ? 1231 : 1237;
    }

    public static int l(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iM = 1;
        while (it.hasNext()) {
            iM = (iM * 31) + m(it.next());
        }
        return iM;
    }

    public static int m(byte[] bytes) {
        return n(bytes, 0, bytes.length);
    }

    public static int n(byte[] bytes, int offset, int length) {
        int iW = w(length, bytes, offset, length);
        if (iW == 0) {
            return 1;
        }
        return iW;
    }

    public static int o(ByteBuffer bytes) {
        if (bytes.hasArray()) {
            int iW = w(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (iW == 0) {
                return 1;
            }
            return iW;
        }
        int iCapacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = bytes.duplicate();
        a2.a(byteBufferDuplicate);
        int iCapacity2 = bytes.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = w(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static int p(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iO = 1;
        while (it.hasNext()) {
            iO = (iO * 31) + o(it.next());
        }
        return iO;
    }

    public static int q(c e10) {
        return e10.getNumber();
    }

    public static int r(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int iQ = 1;
        while (it.hasNext()) {
            iQ = (iQ * 31) + q(it.next());
        }
        return iQ;
    }

    public static int s(long n10) {
        return (int) (n10 ^ (n10 >>> 32));
    }

    public static boolean t(u byteString) {
        return byteString.J();
    }

    public static boolean u(byte[] byteArray) {
        return c5.t(byteArray);
    }

    public static Object v(Object destination, Object source) {
        return ((v2) destination).toBuilder().h((v2) source).buildPartial();
    }

    public static int w(int h10, byte[] bytes, int offset, int length) {
        for (int i10 = offset; i10 < offset + length; i10++) {
            h10 = (h10 * 31) + bytes[i10];
        }
        return h10;
    }

    public static String x(String bytes) {
        return new String(bytes.getBytes(f10216c), f10215b);
    }

    public static byte[] y(String value) {
        return value.getBytes(f10215b);
    }

    public static String z(byte[] bytes) {
        return new String(bytes, f10215b);
    }
}
