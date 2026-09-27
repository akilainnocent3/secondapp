package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f1.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f1<T extends c<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1<?> f9912d = new f1<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3<T, Object> f9913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9915c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9917b;

        static {
            int[] iArr = new int[f5.b.values().length];
            f9917b = iArr;
            try {
                iArr[f5.b.f9950d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9917b[f5.b.f9951e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9917b[f5.b.f9952f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9917b[f5.b.f9953g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9917b[f5.b.f9954h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9917b[f5.b.f9955i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9917b[f5.b.f9956j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9917b[f5.b.f9957k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9917b[f5.b.f9959m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9917b[f5.b.f9960n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9917b[f5.b.f9958l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9917b[f5.b.f9961o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9917b[f5.b.f9962p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9917b[f5.b.f9964r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9917b[f5.b.f9965s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9917b[f5.b.f9966t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9917b[f5.b.f9967u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9917b[f5.b.f9963q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[f5.c.values().length];
            f9916a = iArr2;
            try {
                iArr2[f5.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9916a[f5.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9916a[f5.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9916a[f5.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9916a[f5.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9916a[f5.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9916a[f5.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9916a[f5.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9916a[f5.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<T extends c<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z3<T, Object> f9918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9921d;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public static <T extends c<T>> b<T> g(f1<T> fieldSet) {
            b<T> bVar = new b<>(f1.l(fieldSet.f9913a, true, false));
            bVar.f9919b = fieldSet.f9915c;
            return bVar;
        }

        public static Object r(Object value, boolean partial) {
            if (!(value instanceof v2.a)) {
                return value;
            }
            v2.a aVar = (v2.a) value;
            return partial ? aVar.buildPartial() : aVar.build();
        }

        public static <T extends c<T>> Object s(T descriptor, Object value, boolean partial) {
            if (value == null || descriptor.getLiteJavaType() != f5.c.MESSAGE) {
                return value;
            }
            if (!descriptor.isRepeated()) {
                return r(value, partial);
            }
            if (!(value instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + value.getClass());
            }
            List arrayList = (List) value;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                Object objR = r(obj, partial);
                if (objR != obj) {
                    if (arrayList == value) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i10, objR);
                }
            }
            return arrayList;
        }

        public static <T extends c<T>> void t(z3<T, Object> fieldMap, boolean partial) {
            int iL = fieldMap.l();
            for (int i10 = 0; i10 < iL; i10++) {
                u(fieldMap.k(i10), partial);
            }
            Iterator it = fieldMap.n().iterator();
            while (it.hasNext()) {
                u((Map.Entry) it.next(), partial);
            }
        }

        public static <T extends c<T>> void u(Map.Entry<T, Object> entry, boolean partial) {
            entry.setValue(s(entry.getKey(), entry.getValue(), partial));
        }

        public void a(final T descriptor, final Object value) {
            List arrayList;
            f();
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f9921d = this.f9921d || (value instanceof v2.a);
            x(descriptor, value);
            Object objJ = j(descriptor);
            if (objJ == null) {
                arrayList = new ArrayList();
                this.f9918a.put(descriptor, arrayList);
            } else {
                arrayList = (List) objJ;
            }
            arrayList.add(value);
        }

        public f1<T> b() {
            return c(false);
        }

        public final f1<T> c(boolean partial) {
            if (this.f9918a.isEmpty()) {
                return f1.s();
            }
            this.f9920c = false;
            z3<T, Object> z3VarL = this.f9918a;
            if (this.f9921d) {
                z3VarL = f1.l(z3VarL, false, false);
                t(z3VarL, partial);
            }
            f1<T> f1Var = new f1<>(z3VarL, null);
            f1Var.f9915c = this.f9919b;
            return f1Var;
        }

        public f1<T> d() {
            return c(true);
        }

        public void e(final T descriptor) {
            f();
            this.f9918a.remove(descriptor);
            if (this.f9918a.isEmpty()) {
                this.f9919b = false;
            }
        }

        public final void f() {
            if (this.f9920c) {
                return;
            }
            this.f9918a = f1.l(this.f9918a, true, false);
            this.f9920c = true;
        }

        public Map<T, Object> h() {
            if (!this.f9919b) {
                return this.f9918a.r() ? this.f9918a : Collections.unmodifiableMap(this.f9918a);
            }
            z3 z3VarL = f1.l(this.f9918a, false, true);
            if (this.f9918a.r()) {
                z3VarL.s();
                return z3VarL;
            }
            t(z3VarL, true);
            return z3VarL;
        }

        public Object i(final T descriptor) {
            return s(descriptor, j(descriptor), true);
        }

        public Object j(final T descriptor) {
            Object obj = this.f9918a.get(descriptor);
            return obj instanceof d2 ? ((d2) obj).p() : obj;
        }

        public Object k(final T descriptor, final int index) {
            if (this.f9921d) {
                f();
            }
            return r(l(descriptor, index), true);
        }

        public Object l(final T descriptor, final int index) {
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objJ = j(descriptor);
            if (objJ != null) {
                return ((List) objJ).get(index);
            }
            throw new IndexOutOfBoundsException();
        }

        public int m(final T descriptor) {
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objJ = j(descriptor);
            if (objJ == null) {
                return 0;
            }
            return ((List) objJ).size();
        }

        public boolean n(final T descriptor) {
            if (descriptor.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f9918a.get(descriptor) != null;
        }

        public boolean o() {
            int iL = this.f9918a.l();
            for (int i10 = 0; i10 < iL; i10++) {
                if (!f1.F(this.f9918a.k(i10))) {
                    return false;
                }
            }
            Iterator it = this.f9918a.n().iterator();
            while (it.hasNext()) {
                if (!f1.F((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void p(final f1<T> other) {
            f();
            int iL = other.f9913a.l();
            for (int i10 = 0; i10 < iL; i10++) {
                q(other.f9913a.k(i10));
            }
            Iterator it = other.f9913a.n().iterator();
            while (it.hasNext()) {
                q((Map.Entry) it.next());
            }
        }

        public final void q(final Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            boolean z10 = value instanceof d2;
            if (key.isRepeated()) {
                if (z10) {
                    throw new IllegalStateException("Lazy fields can not be repeated");
                }
                List arrayList = (List) j(key);
                List list = (List) value;
                int size = list.size();
                if (arrayList == null) {
                    arrayList = new ArrayList(size);
                    this.f9918a.put(key, arrayList);
                }
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(f1.n(list.get(i10)));
                }
                return;
            }
            if (key.getLiteJavaType() != f5.c.MESSAGE) {
                if (z10) {
                    throw new IllegalStateException("Lazy fields must be message-valued");
                }
                this.f9918a.put(key, f1.n(value));
                return;
            }
            Object objJ = j(key);
            if (objJ == null) {
                this.f9918a.put(key, f1.n(value));
                if (z10) {
                    this.f9919b = true;
                    return;
                }
                return;
            }
            if (z10) {
                value = ((d2) value).p();
            }
            if (objJ instanceof v2.a) {
                key.W((v2.a) objJ, (v2) value);
            } else {
                this.f9918a.put(key, key.W(((v2) objJ).toBuilder(), (v2) value).build());
            }
        }

        public void v(T t10, Object obj) {
            f();
            if (!t10.isRepeated()) {
                x(t10, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = arrayList.get(i10);
                    x(t10, obj2);
                    this.f9921d = this.f9921d || (obj2 instanceof v2.a);
                }
                obj = arrayList;
            }
            if (obj instanceof d2) {
                this.f9919b = true;
            }
            this.f9921d = this.f9921d || (obj instanceof v2.a);
            this.f9918a.put(t10, obj);
        }

        public void w(final T descriptor, final int index, final Object value) {
            f();
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f9921d = this.f9921d || (value instanceof v2.a);
            Object objJ = j(descriptor);
            if (objJ == null) {
                throw new IndexOutOfBoundsException();
            }
            x(descriptor, value);
            ((List) objJ).set(index, value);
        }

        public final void x(final T descriptor, final Object value) {
            if (f1.H(descriptor.getLiteType(), value)) {
                return;
            }
            if (descriptor.getLiteType().d() != f5.c.MESSAGE || !(value instanceof v2.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().d(), value.getClass().getName()));
            }
        }

        public b() {
            this(z3.t());
        }

        public b(z3<T, Object> fields) {
            this.f9918a = fields;
            this.f9920c = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c<T extends c<T>> extends Comparable<T> {
        v2.a W(v2.a to2, v2 from);

        t1.d<?> getEnumType();

        f5.c getLiteJavaType();

        f5.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public /* synthetic */ f1(z3 z3Var, a aVar) {
        this(z3Var);
    }

    public static int A(final f5.b type, boolean isPacked) {
        if (isPacked) {
            return 2;
        }
        return type.g();
    }

    public static <T extends c<T>> boolean F(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != f5.c.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return G(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!G(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(Object value) {
        if (value instanceof w2) {
            return ((w2) value).isInitialized();
        }
        if (value instanceof d2) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean H(final f5.b type, final Object value) {
        t1.d(value);
        switch (a.f9916a[type.d().ordinal()]) {
            case 1:
                return value instanceof Integer;
            case 2:
                return value instanceof Long;
            case 3:
                return value instanceof Float;
            case 4:
                return value instanceof Double;
            case 5:
                return value instanceof Boolean;
            case 6:
                return value instanceof String;
            case 7:
                return (value instanceof u) || (value instanceof byte[]);
            case 8:
                return (value instanceof Integer) || (value instanceof t1.c);
            case 9:
                return (value instanceof v2) || (value instanceof d2);
            default:
                return false;
        }
    }

    public static <T extends c<T>> b<T> M() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> f1<T> N() {
        return new f1<>();
    }

    public static Object O(z input, final f5.b type, boolean checkUtf8) throws IOException {
        return checkUtf8 ? f5.d(input, type, f5.d.f9983c) : f5.d(input, type, f5.d.f9982b);
    }

    public static void S(final b0 output, final f5.b type, final int number, final Object value) throws IOException {
        if (type == f5.b.f9959m) {
            output.S0(number, (v2) value);
        } else {
            output.t1(number, A(type, false));
            T(output, type, value);
        }
    }

    public static void T(final b0 output, final f5.b type, final Object value) throws IOException {
        switch (a.f9917b[type.ordinal()]) {
            case 1:
                output.N0(((Double) value).doubleValue());
                break;
            case 2:
                output.R0(((Float) value).floatValue());
                break;
            case 3:
                output.X0(((Long) value).longValue());
                break;
            case 4:
                output.v1(((Long) value).longValue());
                break;
            case 5:
                output.W0(((Integer) value).intValue());
                break;
            case 6:
                output.Q0(((Long) value).longValue());
                break;
            case 7:
                output.P0(((Integer) value).intValue());
                break;
            case 8:
                output.G0(((Boolean) value).booleanValue());
                break;
            case 9:
                output.U0((v2) value);
                break;
            case 10:
                output.a1((v2) value);
                break;
            case 11:
                if (!(value instanceof u)) {
                    output.s1((String) value);
                } else {
                    output.M0((u) value);
                }
                break;
            case 12:
                if (!(value instanceof u)) {
                    output.J0((byte[]) value);
                } else {
                    output.M0((u) value);
                }
                break;
            case 13:
                output.u1(((Integer) value).intValue());
                break;
            case 14:
                output.o1(((Integer) value).intValue());
                break;
            case 15:
                output.p1(((Long) value).longValue());
                break;
            case 16:
                output.q1(((Integer) value).intValue());
                break;
            case 17:
                output.r1(((Long) value).longValue());
                break;
            case 18:
                if (!(value instanceof t1.c)) {
                    output.O0(((Integer) value).intValue());
                } else {
                    output.O0(((t1.c) value).getNumber());
                }
                break;
        }
    }

    public static void U(final c<?> descriptor, final Object value, final b0 output) throws IOException {
        f5.b liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (!descriptor.isRepeated()) {
            if (value instanceof d2) {
                S(output, liteType, number, ((d2) value).p());
                return;
            } else {
                S(output, liteType, number, value);
                return;
            }
        }
        List list = (List) value;
        int size = list.size();
        int i10 = 0;
        if (!descriptor.isPacked()) {
            while (i10 < size) {
                S(output, liteType, number, list.get(i10));
                i10++;
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            output.t1(number, 2);
            int iP = 0;
            for (int i11 = 0; i11 < size; i11++) {
                iP += p(liteType, list.get(i11));
            }
            output.u1(iP);
            while (i10 < size) {
                T(output, liteType, list.get(i10));
                i10++;
            }
        }
    }

    public static <T extends c<T>> z3<T, Object> l(z3<T, Object> fields, boolean copyList, boolean resolveLazyFields) {
        z3<T, Object> z3VarT = z3.t();
        int iL = fields.l();
        for (int i10 = 0; i10 < iL; i10++) {
            m(z3VarT, fields.k(i10), copyList, resolveLazyFields);
        }
        Iterator it = fields.n().iterator();
        while (it.hasNext()) {
            m(z3VarT, (Map.Entry) it.next(), copyList, resolveLazyFields);
        }
        return z3VarT;
    }

    public static <T extends c<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean copyList, boolean resolveLazyFields) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (resolveLazyFields && (value instanceof d2)) {
            map.put(key, ((d2) value).p());
        } else if (copyList && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    public static Object n(Object value) {
        if (!(value instanceof byte[])) {
            return value;
        }
        byte[] bArr = (byte[]) value;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int o(final f5.b type, final int number, final Object value) {
        int iK0 = b0.k0(number);
        if (type == f5.b.f9959m) {
            iK0 *= 2;
        }
        return iK0 + p(type, value);
    }

    public static int p(final f5.b type, final Object value) {
        switch (a.f9917b[type.ordinal()]) {
            case 1:
                return b0.w(((Double) value).doubleValue());
            case 2:
                return b0.E(((Float) value).floatValue());
            case 3:
                return b0.M(((Long) value).longValue());
            case 4:
                return b0.o0(((Long) value).longValue());
            case 5:
                return b0.K(((Integer) value).intValue());
            case 6:
                return b0.C(((Long) value).longValue());
            case 7:
                return b0.A(((Integer) value).intValue());
            case 8:
                return b0.o(((Boolean) value).booleanValue());
            case 9:
                return b0.H((v2) value);
            case 10:
                return value instanceof d2 ? b0.P((d2) value) : b0.U((v2) value);
            case 11:
                return value instanceof u ? b0.u((u) value) : b0.j0((String) value);
            case 12:
                return value instanceof u ? b0.u((u) value) : b0.q((byte[]) value);
            case 13:
                return b0.m0(((Integer) value).intValue());
            case 14:
                return b0.b0(((Integer) value).intValue());
            case 15:
                return b0.d0(((Long) value).longValue());
            case 16:
                return b0.f0(((Integer) value).intValue());
            case 17:
                return b0.h0(((Long) value).longValue());
            case 18:
                return value instanceof t1.c ? b0.y(((t1.c) value).getNumber()) : b0.y(((Integer) value).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int q(final c<?> descriptor, final Object value) {
        f5.b liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (!descriptor.isRepeated()) {
            return o(liteType, number, value);
        }
        List list = (List) value;
        int size = list.size();
        int i10 = 0;
        if (!descriptor.isPacked()) {
            int iO = 0;
            while (i10 < size) {
                iO += o(liteType, number, list.get(i10));
                i10++;
            }
            return iO;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iP = 0;
        while (i10 < size) {
            iP += p(liteType, list.get(i10));
            i10++;
        }
        return b0.k0(number) + iP + b0.m0(iP);
    }

    public static <T extends c<T>> f1<T> s() {
        return (f1<T>) f9912d;
    }

    public boolean B(final T descriptor) {
        if (descriptor.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f9913a.get(descriptor) != null;
    }

    public boolean C() {
        return this.f9913a.isEmpty();
    }

    public boolean D() {
        return this.f9914b;
    }

    public boolean E() {
        int iL = this.f9913a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            if (!F(this.f9913a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f9913a.n().iterator();
        while (it.hasNext()) {
            if (!F((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> I() {
        if (C()) {
            return Collections.emptyIterator();
        }
        return this.f9915c ? new d2.c(this.f9913a.entrySet().iterator()) : this.f9913a.entrySet().iterator();
    }

    public void J() {
        if (this.f9914b) {
            return;
        }
        int iL = this.f9913a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f9913a.k(i10);
            if (entryK.getValue() instanceof l1) {
                ((l1) entryK.getValue()).G5();
            }
        }
        this.f9913a.s();
        this.f9914b = true;
    }

    public void K(final f1<T> other) {
        int iL = other.f9913a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            L(other.f9913a.k(i10));
        }
        Iterator it = other.f9913a.n().iterator();
        while (it.hasNext()) {
            L((Map.Entry) it.next());
        }
    }

    public final void L(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof d2;
        if (key.isRepeated()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objU = u(key);
            if (objU == null) {
                objU = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objU).add(n(it.next()));
            }
            this.f9913a.put(key, objU);
            return;
        }
        if (key.getLiteJavaType() != f5.c.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f9913a.put(key, n(value));
            return;
        }
        Object objU2 = u(key);
        if (objU2 == null) {
            this.f9913a.put(key, n(value));
            if (z10) {
                this.f9915c = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((d2) value).p();
        }
        this.f9913a.put(key, key.W(((v2) objU2).toBuilder(), (v2) value).build());
    }

    public void P(T t10, Object obj) {
        if (!t10.isRepeated()) {
            R(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                R(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof d2) {
            this.f9915c = true;
        }
        this.f9913a.put(t10, obj);
    }

    public void Q(final T descriptor, final int index, final Object value) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(descriptor);
        if (objU == null) {
            throw new IndexOutOfBoundsException();
        }
        R(descriptor, value);
        ((List) objU).set(index, value);
    }

    public final void R(final T descriptor, final Object value) {
        if (!H(descriptor.getLiteType(), value)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().d(), value.getClass().getName()));
        }
    }

    public void V(final b0 output) throws IOException {
        int iL = this.f9913a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            W(this.f9913a.k(i10), output);
        }
        Iterator it = this.f9913a.n().iterator();
        while (it.hasNext()) {
            W((Map.Entry) it.next(), output);
        }
    }

    public final void W(final Map.Entry<T, Object> entry, final b0 output) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() != f5.c.MESSAGE || key.isRepeated() || key.isPacked()) {
            U(key, entry.getValue(), output);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof d2)) {
            output.c1(entry.getKey().getNumber(), (v2) value);
        } else {
            output.l1(entry.getKey().getNumber(), ((d2) value).n());
        }
    }

    public void X(final b0 output) throws IOException {
        int iL = this.f9913a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f9913a.k(i10);
            U((c) entryK.getKey(), entryK.getValue(), output);
        }
        Iterator it = this.f9913a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            U((c) entry.getKey(), entry.getValue(), output);
        }
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 instanceof f1) {
            return this.f9913a.equals(((f1) o10).f9913a);
        }
        return false;
    }

    public void h(final T descriptor, final Object value) {
        List arrayList;
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        R(descriptor, value);
        Object objU = u(descriptor);
        if (objU == null) {
            arrayList = new ArrayList();
            this.f9913a.put(descriptor, arrayList);
        } else {
            arrayList = (List) objU;
        }
        arrayList.add(value);
    }

    public int hashCode() {
        return this.f9913a.hashCode();
    }

    public void i() {
        this.f9913a.clear();
        this.f9915c = false;
    }

    public void j(final T descriptor) {
        this.f9913a.remove(descriptor);
        if (this.f9913a.isEmpty()) {
            this.f9915c = false;
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public f1<T> clone() {
        f1<T> f1VarN = N();
        int iL = this.f9913a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f9913a.k(i10);
            f1VarN.P((c) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f9913a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            f1VarN.P((c) entry.getKey(), entry.getValue());
        }
        f1VarN.f9915c = this.f9915c;
        return f1VarN;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        if (C()) {
            return Collections.emptyIterator();
        }
        return this.f9915c ? new d2.c(this.f9913a.h().iterator()) : this.f9913a.h().iterator();
    }

    public Map<T, Object> t() {
        if (!this.f9915c) {
            return this.f9913a.r() ? this.f9913a : Collections.unmodifiableMap(this.f9913a);
        }
        z3 z3VarL = l(this.f9913a, false, true);
        if (this.f9913a.r()) {
            z3VarL.s();
        }
        return z3VarL;
    }

    public Object u(final T descriptor) {
        Object obj = this.f9913a.get(descriptor);
        return obj instanceof d2 ? ((d2) obj).p() : obj;
    }

    public int v() {
        int iL = this.f9913a.l();
        int iW = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iW += w(this.f9913a.k(i10));
        }
        Iterator it = this.f9913a.n().iterator();
        while (it.hasNext()) {
            iW += w((Map.Entry) it.next());
        }
        return iW;
    }

    public final int w(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != f5.c.MESSAGE || key.isRepeated() || key.isPacked()) {
            return q(key, value);
        }
        return value instanceof d2 ? b0.N(entry.getKey().getNumber(), (d2) value) : b0.R(entry.getKey().getNumber(), (v2) value);
    }

    public Object x(final T descriptor, final int index) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(descriptor);
        if (objU != null) {
            return ((List) objU).get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public int y(final T descriptor) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(descriptor);
        if (objU == null) {
            return 0;
        }
        return ((List) objU).size();
    }

    public int z() {
        int iL = this.f9913a.l();
        int iQ = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f9913a.k(i10);
            iQ += q((c) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f9913a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iQ += q((c) entry.getKey(), entry.getValue());
        }
        return iQ;
    }

    public f1() {
        this.f9913a = z3.t();
    }

    public f1(final boolean dummy) {
        this(z3.t());
        J();
    }

    public f1(z3<T, Object> fields) {
        this.f9913a = fields;
        J();
    }
}
