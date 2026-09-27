package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class k3 extends l1<k3, b> implements l3 {
    private static final k3 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile m3<k3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private f value_;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10075a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f10075a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10075a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10075a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10075a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10075a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10075a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10075a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends l1.b<k3, b> implements l3 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b F5() {
            v5();
            ((k3) this.f10089c).y6();
            return this;
        }

        public b G5() {
            v5();
            ((k3) this.f10089c).z6();
            return this;
        }

        public b H5(f value) {
            v5();
            ((k3) this.f10089c).B6(value);
            return this;
        }

        public b I5(String value) {
            v5();
            ((k3) this.f10089c).R6(value);
            return this;
        }

        public b J5(u value) {
            v5();
            ((k3) this.f10089c).S6(value);
            return this;
        }

        public b K5(f.b builderForValue) {
            v5();
            ((k3) this.f10089c).T6(builderForValue.build());
            return this;
        }

        public b L5(f value) {
            v5();
            ((k3) this.f10089c).T6(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.l3
        public String getName() {
            return ((k3) this.f10089c).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.l3
        public u getNameBytes() {
            return ((k3) this.f10089c).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.l3
        public f getValue() {
            return ((k3) this.f10089c).getValue();
        }

        @Override // androidx.datastore.preferences.protobuf.l3
        public boolean hasValue() {
            return ((k3) this.f10089c).hasValue();
        }

        public b() {
            super(k3.DEFAULT_INSTANCE);
        }
    }

    static {
        k3 k3Var = new k3();
        DEFAULT_INSTANCE = k3Var;
        l1.o6(k3.class, k3Var);
    }

    public static k3 A6() {
        return DEFAULT_INSTANCE;
    }

    public static b C6() {
        return DEFAULT_INSTANCE.m5();
    }

    public static b D6(k3 prototype) {
        return DEFAULT_INSTANCE.n5(prototype);
    }

    public static k3 E6(InputStream input) throws IOException {
        return (k3) l1.W5(DEFAULT_INSTANCE, input);
    }

    public static k3 F6(InputStream input, v0 extensionRegistry) throws IOException {
        return (k3) l1.X5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static k3 G6(u data) throws y1 {
        return (k3) l1.Y5(DEFAULT_INSTANCE, data);
    }

    public static k3 H6(u data, v0 extensionRegistry) throws y1 {
        return (k3) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static k3 I6(z input) throws IOException {
        return (k3) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static k3 J6(z input, v0 extensionRegistry) throws IOException {
        return (k3) l1.b6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static k3 K6(InputStream input) throws IOException {
        return (k3) l1.c6(DEFAULT_INSTANCE, input);
    }

    public static k3 L6(InputStream input, v0 extensionRegistry) throws IOException {
        return (k3) l1.d6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static k3 M6(ByteBuffer data) throws y1 {
        return (k3) l1.e6(DEFAULT_INSTANCE, data);
    }

    public static k3 N6(ByteBuffer data, v0 extensionRegistry) throws y1 {
        return (k3) l1.f6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static k3 O6(byte[] data) throws y1 {
        return (k3) l1.g6(DEFAULT_INSTANCE, data);
    }

    public static k3 P6(byte[] data, v0 extensionRegistry) throws y1 {
        return (k3) l1.h6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static m3<k3> Q6() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R6(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S6(u value) {
        androidx.datastore.preferences.protobuf.a.C2(value);
        this.name_ = value.j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y6() {
        this.name_ = A6().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z6() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public final void B6(f value) {
        value.getClass();
        f fVar = this.value_;
        if (fVar == null || fVar == f.z6()) {
            this.value_ = value;
        } else {
            this.value_ = f.B6(this.value_).A5(value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public final void T6(f value) {
        value.getClass();
        this.value_ = value;
        this.bitField0_ |= 1;
    }

    @Override // androidx.datastore.preferences.protobuf.l3
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.l3
    public u getNameBytes() {
        return u.u(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.l3
    public f getValue() {
        f fVar = this.value_;
        return fVar == null ? f.z6() : fVar;
    }

    @Override // androidx.datastore.preferences.protobuf.l3
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public final Object q5(l1.i method, Object arg0, Object arg1) {
        m3 cVar;
        a aVar = null;
        switch (a.f10075a[method.ordinal()]) {
            case 1:
                return new k3();
            case 2:
                return new b(aVar);
            case 3:
                return l1.S5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m3<k3> m3Var = PARSER;
                if (m3Var != null) {
                    return m3Var;
                }
                synchronized (k3.class) {
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
