package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class a1 implements Comparable<a1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f9539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f9540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f9541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f9543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j3 f9547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f9548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Class<?> f9549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f9550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t1.e f9551n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9552a;

        static {
            int[] iArr = new int[g1.values().length];
            f9552a = iArr;
            try {
                iArr[g1.f10004p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9552a[g1.f10012x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9552a[g1.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9552a[g1.f9990d0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Field f9553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g1 f9554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Field f9556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9558f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f9559g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public j3 f9560h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Class<?> f9561i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f9562j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public t1.e f9563k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Field f9564l;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public a1 a() {
            j3 j3Var = this.f9560h;
            if (j3Var != null) {
                return a1.h(this.f9555c, this.f9554b, j3Var, this.f9561i, this.f9559g, this.f9563k);
            }
            Object obj = this.f9562j;
            if (obj != null) {
                return a1.g(this.f9553a, this.f9555c, obj, this.f9563k);
            }
            Field field = this.f9556d;
            if (field != null) {
                return this.f9558f ? a1.f(this.f9553a, this.f9555c, this.f9554b, field, this.f9557e, this.f9559g, this.f9563k) : a1.c(this.f9553a, this.f9555c, this.f9554b, field, this.f9557e, this.f9559g, this.f9563k);
            }
            t1.e eVar = this.f9563k;
            if (eVar != null) {
                Field field2 = this.f9564l;
                return field2 == null ? a1.e(this.f9553a, this.f9555c, this.f9554b, eVar) : a1.j(this.f9553a, this.f9555c, this.f9554b, eVar, field2);
            }
            Field field3 = this.f9564l;
            return field3 == null ? a1.d(this.f9553a, this.f9555c, this.f9554b, this.f9559g) : a1.i(this.f9553a, this.f9555c, this.f9554b, field3);
        }

        public b b(Field cachedSizeField) {
            this.f9564l = cachedSizeField;
            return this;
        }

        public b c(boolean enforceUtf8) {
            this.f9559g = enforceUtf8;
            return this;
        }

        public b d(t1.e enumVerifier) {
            this.f9563k = enumVerifier;
            return this;
        }

        public b e(Field field) {
            if (this.f9560h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f9553a = field;
            return this;
        }

        public b f(int fieldNumber) {
            this.f9555c = fieldNumber;
            return this;
        }

        public b g(Object mapDefaultEntry) {
            this.f9562j = mapDefaultEntry;
            return this;
        }

        public b h(j3 oneof, Class<?> oneofStoredType) {
            if (this.f9553a != null || this.f9556d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f9560h = oneof;
            this.f9561i = oneofStoredType;
            return this;
        }

        public b i(Field presenceField, int presenceMask) {
            this.f9556d = (Field) t1.e(presenceField, "presenceField");
            this.f9557e = presenceMask;
            return this;
        }

        public b j(boolean required) {
            this.f9558f = required;
            return this;
        }

        public b k(g1 type) {
            this.f9554b = type;
            return this;
        }

        public b() {
        }
    }

    public a1(Field field, int fieldNumber, g1 type, Class<?> messageClass, Field presenceField, int presenceMask, boolean required, boolean enforceUtf8, j3 oneof, Class<?> oneofStoredType, Object mapDefaultEntry, t1.e enumVerifier, Field cachedSizeField) {
        this.f9539b = field;
        this.f9540c = type;
        this.f9541d = messageClass;
        this.f9542e = fieldNumber;
        this.f9543f = presenceField;
        this.f9544g = presenceMask;
        this.f9545h = required;
        this.f9546i = enforceUtf8;
        this.f9547j = oneof;
        this.f9549l = oneofStoredType;
        this.f9550m = mapDefaultEntry;
        this.f9551n = enumVerifier;
        this.f9548k = cachedSizeField;
    }

    public static boolean A(int value) {
        return value != 0 && (value & (value + (-1))) == 0;
    }

    public static b C() {
        return new b(null);
    }

    public static void a(int fieldNumber) {
        if (fieldNumber > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + fieldNumber);
    }

    public static a1 c(Field field, int fieldNumber, g1 fieldType, Field presenceField, int presenceMask, boolean enforceUtf8, t1.e enumVerifier) {
        a(fieldNumber);
        t1.e(field, "field");
        t1.e(fieldType, "fieldType");
        t1.e(presenceField, "presenceField");
        if (presenceField == null || A(presenceMask)) {
            return new a1(field, fieldNumber, fieldType, null, presenceField, presenceMask, false, enforceUtf8, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
    }

    public static a1 d(Field field, int fieldNumber, g1 fieldType, boolean enforceUtf8) {
        a(fieldNumber);
        t1.e(field, "field");
        t1.e(fieldType, "fieldType");
        if (fieldType == g1.H || fieldType == g1.f9990d0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new a1(field, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, null, null, null, null, null);
    }

    public static a1 e(Field field, int fieldNumber, g1 fieldType, t1.e enumVerifier) {
        a(fieldNumber);
        t1.e(field, "field");
        return new a1(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static a1 f(Field field, int fieldNumber, g1 fieldType, Field presenceField, int presenceMask, boolean enforceUtf8, t1.e enumVerifier) {
        a(fieldNumber);
        t1.e(field, "field");
        t1.e(fieldType, "fieldType");
        t1.e(presenceField, "presenceField");
        if (presenceField == null || A(presenceMask)) {
            return new a1(field, fieldNumber, fieldType, null, presenceField, presenceMask, true, enforceUtf8, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
    }

    public static a1 g(Field field, int fieldNumber, Object mapDefaultEntry, t1.e enumVerifier) {
        t1.e(mapDefaultEntry, "mapDefaultEntry");
        a(fieldNumber);
        t1.e(field, "field");
        return new a1(field, fieldNumber, g1.f9991e0, null, null, 0, false, true, null, null, mapDefaultEntry, enumVerifier, null);
    }

    public static a1 h(int fieldNumber, g1 fieldType, j3 oneof, Class<?> oneofStoredType, boolean enforceUtf8, t1.e enumVerifier) {
        a(fieldNumber);
        t1.e(fieldType, "fieldType");
        t1.e(oneof, "oneof");
        t1.e(oneofStoredType, "oneofStoredType");
        if (fieldType.k()) {
            return new a1(null, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, oneof, oneofStoredType, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + fieldNumber + " is of type " + fieldType);
    }

    public static a1 i(Field field, int fieldNumber, g1 fieldType, Field cachedSizeField) {
        a(fieldNumber);
        t1.e(field, "field");
        t1.e(fieldType, "fieldType");
        if (fieldType == g1.H || fieldType == g1.f9990d0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new a1(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, null, cachedSizeField);
    }

    public static a1 j(Field field, int fieldNumber, g1 fieldType, t1.e enumVerifier, Field cachedSizeField) {
        a(fieldNumber);
        t1.e(field, "field");
        return new a1(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, cachedSizeField);
    }

    public static a1 k(Field field, int fieldNumber, g1 fieldType, Class<?> messageClass) {
        a(fieldNumber);
        t1.e(field, "field");
        t1.e(fieldType, "fieldType");
        t1.e(messageClass, "messageClass");
        return new a1(field, fieldNumber, fieldType, messageClass, null, 0, false, false, null, null, null, null, null);
    }

    public boolean B() {
        return this.f9545h;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(a1 o10) {
        return this.f9542e - o10.f9542e;
    }

    public Field l() {
        return this.f9548k;
    }

    public t1.e m() {
        return this.f9551n;
    }

    public Field n() {
        return this.f9539b;
    }

    public int o() {
        return this.f9542e;
    }

    public Class<?> q() {
        return this.f9541d;
    }

    public Object s() {
        return this.f9550m;
    }

    public Class<?> t() {
        int i10 = a.f9552a[this.f9540c.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Field field = this.f9539b;
            return field != null ? field.getType() : this.f9549l;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f9541d;
        }
        return null;
    }

    public j3 u() {
        return this.f9547j;
    }

    public Class<?> v() {
        return this.f9549l;
    }

    public Field w() {
        return this.f9543f;
    }

    public int x() {
        return this.f9544g;
    }

    public g1 y() {
        return this.f9540c;
    }

    public boolean z() {
        return this.f9546i;
    }
}
