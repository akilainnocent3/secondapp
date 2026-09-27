package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l1<f, b> implements g {
    private static final f DEFAULT_INSTANCE;
    private static volatile m3<f> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private u value_ = u.f10242g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9908a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f9908a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9908a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9908a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9908a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9908a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9908a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9908a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends l1.b<f, b> implements g {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b F5() {
            v5();
            ((f) this.f10089c).x6();
            return this;
        }

        public b G5() {
            v5();
            ((f) this.f10089c).y6();
            return this;
        }

        public b H5(String value) {
            v5();
            ((f) this.f10089c).P6(value);
            return this;
        }

        public b I5(u value) {
            v5();
            ((f) this.f10089c).Q6(value);
            return this;
        }

        public b J5(u value) {
            v5();
            ((f) this.f10089c).R6(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public String getTypeUrl() {
            return ((f) this.f10089c).getTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public u getTypeUrlBytes() {
            return ((f) this.f10089c).getTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public u getValue() {
            return ((f) this.f10089c).getValue();
        }

        public b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        l1.o6(f.class, fVar);
    }

    public static b A6() {
        return DEFAULT_INSTANCE.m5();
    }

    public static b B6(f prototype) {
        return DEFAULT_INSTANCE.n5(prototype);
    }

    public static f C6(InputStream input) throws IOException {
        return (f) l1.W5(DEFAULT_INSTANCE, input);
    }

    public static f D6(InputStream input, v0 extensionRegistry) throws IOException {
        return (f) l1.X5(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f E6(u data) throws y1 {
        return (f) l1.Y5(DEFAULT_INSTANCE, data);
    }

    public static f F6(u data, v0 extensionRegistry) throws y1 {
        return (f) l1.Z5(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f G6(z input) throws IOException {
        return (f) l1.a6(DEFAULT_INSTANCE, input);
    }

    public static f H6(z input, v0 extensionRegistry) throws IOException {
        return (f) l1.b6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f I6(InputStream input) throws IOException {
        return (f) l1.c6(DEFAULT_INSTANCE, input);
    }

    public static f J6(InputStream input, v0 extensionRegistry) throws IOException {
        return (f) l1.d6(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f K6(ByteBuffer data) throws y1 {
        return (f) l1.e6(DEFAULT_INSTANCE, data);
    }

    public static f L6(ByteBuffer data, v0 extensionRegistry) throws y1 {
        return (f) l1.f6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f M6(byte[] data) throws y1 {
        return (f) l1.g6(DEFAULT_INSTANCE, data);
    }

    public static f N6(byte[] data, v0 extensionRegistry) throws y1 {
        return (f) l1.h6(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static m3<f> O6() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y6() {
        this.value_ = z6().getValue();
    }

    public static f z6() {
        return DEFAULT_INSTANCE;
    }

    public final void P6(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    public final void Q6(u value) {
        androidx.datastore.preferences.protobuf.a.C2(value);
        this.typeUrl_ = value.j0();
    }

    public final void R6(u value) {
        value.getClass();
        this.value_ = value;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public u getTypeUrlBytes() {
        return u.u(this.typeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public u getValue() {
        return this.value_;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public final Object q5(l1.i method, Object arg0, Object arg1) {
        m3 cVar;
        a aVar = null;
        switch (a.f9908a[method.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return l1.S5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m3<f> m3Var = PARSER;
                if (m3Var != null) {
                    return m3Var;
                }
                synchronized (f.class) {
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

    public final void x6() {
        this.typeUrl_ = z6().getTypeUrl();
    }
}
