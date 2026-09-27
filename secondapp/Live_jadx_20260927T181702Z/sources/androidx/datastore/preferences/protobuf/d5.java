package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d5 extends l1<d5, b> implements e5 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final d5 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile m3<d5> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9673a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f9673a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9673a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9673a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9673a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9673a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9673a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9673a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends l1.b<d5, b> implements e5 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b F5() {
            v5();
            ((d5) this.f10089c).J6();
            return this;
        }

        public b G5() {
            v5();
            ((d5) this.f10089c).K6();
            return this;
        }

        public b H5() {
            v5();
            ((d5) this.f10089c).L6();
            return this;
        }

        public b I5() {
            v5();
            ((d5) this.f10089c).M6();
            return this;
        }

        public b J5() {
            v5();
            ((d5) this.f10089c).N6();
            return this;
        }

        public b K5() {
            v5();
            ((d5) this.f10089c).O6();
            return this;
        }

        public b L5() {
            v5();
            ((d5) this.f10089c).P6();
            return this;
        }

        public b M5(k2 value) {
            v5();
            ((d5) this.f10089c).R6(value);
            return this;
        }

        public b N5(f4 value) {
            v5();
            ((d5) this.f10089c).S6(value);
            return this;
        }

        public b O5(boolean value) {
            v5();
            ((d5) this.f10089c).i7(value);
            return this;
        }

        public b P5(k2.b builderForValue) {
            v5();
            ((d5) this.f10089c).j7(builderForValue.build());
            return this;
        }

        public b Q5(k2 value) {
            v5();
            ((d5) this.f10089c).j7(value);
            return this;
        }

        public b R5(i3 value) {
            v5();
            ((d5) this.f10089c).k7(value);
            return this;
        }

        public b S5(int value) {
            v5();
            ((d5) this.f10089c).l7(value);
            return this;
        }

        public b T5(double value) {
            v5();
            ((d5) this.f10089c).m7(value);
            return this;
        }

        public b U5(String value) {
            v5();
            ((d5) this.f10089c).n7(value);
            return this;
        }

        public b V5(u value) {
            v5();
            ((d5) this.f10089c).o7(value);
            return this;
        }

        public b W5(f4.b builderForValue) {
            v5();
            ((d5) this.f10089c).p7(builderForValue.build());
            return this;
        }

        public b X5(f4 value) {
            v5();
            ((d5) this.f10089c).p7(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public boolean getBoolValue() {
            return ((d5) this.f10089c).getBoolValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public c getKindCase() {
            return ((d5) this.f10089c).getKindCase();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public k2 getListValue() {
            return ((d5) this.f10089c).getListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public i3 getNullValue() {
            return ((d5) this.f10089c).getNullValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public int getNullValueValue() {
            return ((d5) this.f10089c).getNullValueValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public double getNumberValue() {
            return ((d5) this.f10089c).getNumberValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public String getStringValue() {
            return ((d5) this.f10089c).getStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public u getStringValueBytes() {
            return ((d5) this.f10089c).getStringValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public f4 getStructValue() {
            return ((d5) this.f10089c).getStructValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public boolean hasBoolValue() {
            return ((d5) this.f10089c).hasBoolValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public boolean hasListValue() {
            return ((d5) this.f10089c).hasListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public boolean hasNullValue() {
            return ((d5) this.f10089c).hasNullValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public boolean hasNumberValue() {
            return ((d5) this.f10089c).hasNumberValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public boolean hasStringValue() {
            return ((d5) this.f10089c).hasStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.e5
        public boolean hasStructValue() {
            return ((d5) this.f10089c).hasStructValue();
        }

        public b() {
            super(d5.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9682b;

        c(int value) {
            this.f9682b = value;
        }

        public static c a(int value) {
            switch (value) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Deprecated
        public static c b(int value) {
            return a(value);
        }

        public int getNumber() {
            return this.f9682b;
        }
    }

    static {
        d5 d5Var = new d5();
        DEFAULT_INSTANCE = d5Var;
        l1.o6(d5.class, d5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K6() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O6() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static d5 Q6() {
        return DEFAULT_INSTANCE;
    }

    public static b T6() {
        return DEFAULT_INSTANCE.m5();
    }

    public static b U6(d5 prototype) {
        return DEFAULT_INSTANCE.n5(prototype);
    }

    public static d5 V6(InputStream input) throws IOException {
        return (d5) l1.W5(DEFAULT_INSTANCE, input);
    }

    public static d5 W6(InputStream input, v0 extensionRegistry) throws IOException {
        return (d5) l1.X5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d5 X6(u data) throws y1 {
        return (d5) l1.Y5(DEFAULT_INSTANCE, data);
    }

    public static d5 Y6(u data, v0 extensionRegistry) throws y1 {
        return (d5) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static d5 Z6(z input) throws IOException {
        return (d5) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static d5 a7(z input, v0 extensionRegistry) throws IOException {
        return (d5) l1.b6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d5 b7(InputStream input) throws IOException {
        return (d5) l1.c6(DEFAULT_INSTANCE, input);
    }

    public static d5 c7(InputStream input, v0 extensionRegistry) throws IOException {
        return (d5) l1.d6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d5 d7(ByteBuffer data) throws y1 {
        return (d5) l1.e6(DEFAULT_INSTANCE, data);
    }

    public static d5 e7(ByteBuffer data, v0 extensionRegistry) throws y1 {
        return (d5) l1.f6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static d5 f7(byte[] data) throws y1 {
        return (d5) l1.g6(DEFAULT_INSTANCE, data);
    }

    public static d5 g7(byte[] data, v0 extensionRegistry) throws y1 {
        return (d5) l1.h6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static m3<d5> h7() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void J6() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void L6() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void M6() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void N6() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void P6() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void R6(k2 value) {
        value.getClass();
        if (this.kindCase_ != 6 || this.kind_ == k2.D6()) {
            this.kind_ = value;
        } else {
            this.kind_ = k2.H6((k2) this.kind_).A5(value).buildPartial();
        }
        this.kindCase_ = 6;
    }

    public final void S6(f4 value) {
        value.getClass();
        if (this.kindCase_ != 5 || this.kind_ == f4.t6()) {
            this.kind_ = value;
        } else {
            this.kind_ = f4.y6((f4) this.kind_).A5(value).buildPartial();
        }
        this.kindCase_ = 5;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public c getKindCase() {
        return c.a(this.kindCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public k2 getListValue() {
        return this.kindCase_ == 6 ? (k2) this.kind_ : k2.D6();
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public i3 getNullValue() {
        if (this.kindCase_ != 1) {
            return i3.NULL_VALUE;
        }
        i3 i3VarA = i3.a(((Integer) this.kind_).intValue());
        return i3VarA == null ? i3.UNRECOGNIZED : i3VarA;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public u getStringValueBytes() {
        return u.u(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public f4 getStructValue() {
        return this.kindCase_ == 5 ? (f4) this.kind_ : f4.t6();
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // androidx.datastore.preferences.protobuf.e5
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public final void i7(boolean value) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(value);
    }

    public final void j7(k2 value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 6;
    }

    public final void k7(i3 value) {
        this.kind_ = Integer.valueOf(value.getNumber());
        this.kindCase_ = 1;
    }

    public final void l7(int value) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(value);
    }

    public final void m7(double value) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(value);
    }

    public final void n7(String value) {
        value.getClass();
        this.kindCase_ = 3;
        this.kind_ = value;
    }

    public final void o7(u value) {
        androidx.datastore.preferences.protobuf.a.C2(value);
        this.kind_ = value.j0();
        this.kindCase_ = 3;
    }

    public final void p7(f4 value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 5;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public final Object q5(l1.i method, Object arg0, Object arg1) {
        m3 cVar;
        a aVar = null;
        switch (a.f9673a[method.ordinal()]) {
            case 1:
                return new d5();
            case 2:
                return new b(aVar);
            case 3:
                return l1.S5(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", f4.class, k2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m3<d5> m3Var = PARSER;
                if (m3Var != null) {
                    return m3Var;
                }
                synchronized (d5.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
