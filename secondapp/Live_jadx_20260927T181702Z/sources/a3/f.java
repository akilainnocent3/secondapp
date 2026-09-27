package a3;

import androidx.datastore.preferences.protobuf.f5;
import androidx.datastore.preferences.protobuf.l1;
import androidx.datastore.preferences.protobuf.m3;
import androidx.datastore.preferences.protobuf.o2;
import androidx.datastore.preferences.protobuf.p2;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w2;
import androidx.datastore.preferences.protobuf.y1;
import androidx.datastore.preferences.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3600a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f3600a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3600a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3600a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3600a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3600a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3600a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3600a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        private static volatile m3<b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private p2<String, C0004f> preferences_ = p2.g();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends l1.b<b, a> implements c {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a F5() {
                v5();
                ((b) this.f10089c).u6().clear();
                return this;
            }

            public a G5(Map<String, C0004f> map) {
                v5();
                ((b) this.f10089c).u6().putAll(map);
                return this;
            }

            public a H5(String str, C0004f c0004f) {
                str.getClass();
                c0004f.getClass();
                v5();
                ((b) this.f10089c).u6().put(str, c0004f);
                return this;
            }

            @Override // a3.f.c
            public boolean I2(String str) {
                str.getClass();
                return ((b) this.f10089c).W4().containsKey(str);
            }

            public a I5(String str) {
                str.getClass();
                v5();
                ((b) this.f10089c).u6().remove(str);
                return this;
            }

            @Override // a3.f.c
            public int U() {
                return ((b) this.f10089c).W4().size();
            }

            @Override // a3.f.c
            public C0004f W1(String str) {
                str.getClass();
                Map<String, C0004f> mapW4 = ((b) this.f10089c).W4();
                if (mapW4.containsKey(str)) {
                    return mapW4.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // a3.f.c
            public Map<String, C0004f> W4() {
                return Collections.unmodifiableMap(((b) this.f10089c).W4());
            }

            @Override // a3.f.c
            @Deprecated
            public Map<String, C0004f> e4() {
                return W4();
            }

            @Override // a3.f.c
            public C0004f o1(String str, C0004f c0004f) {
                str.getClass();
                Map<String, C0004f> mapW4 = ((b) this.f10089c).W4();
                return mapW4.containsKey(str) ? mapW4.get(str) : c0004f;
            }

            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: a3.f$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0003b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final o2<String, C0004f> f3601a = o2.f(f5.b.f9958l, "", f5.b.f9960n, C0004f.U6());
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            l1.o6(b.class, bVar);
        }

        public static b A6(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.X5(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b B6(u uVar) throws y1 {
            return (b) l1.Y5(DEFAULT_INSTANCE, uVar);
        }

        public static b C6(u uVar, v0 v0Var) throws y1 {
            return (b) l1.Z5(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b D6(z zVar) throws IOException {
            return (b) l1.a6(DEFAULT_INSTANCE, zVar);
        }

        public static b E6(z zVar, v0 v0Var) throws IOException {
            return (b) l1.b6(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b F6(InputStream inputStream) throws IOException {
            return (b) l1.c6(DEFAULT_INSTANCE, inputStream);
        }

        public static b G6(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.d6(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b H6(ByteBuffer byteBuffer) throws y1 {
            return (b) l1.e6(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b I6(ByteBuffer byteBuffer, v0 v0Var) throws y1 {
            return (b) l1.f6(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b J6(byte[] bArr) throws y1 {
            return (b) l1.g6(DEFAULT_INSTANCE, bArr);
        }

        public static b K6(byte[] bArr, v0 v0Var) throws y1 {
            return (b) l1.h6(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static m3<b> L6() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static b t6() {
            return DEFAULT_INSTANCE;
        }

        public static a x6() {
            return DEFAULT_INSTANCE.m5();
        }

        public static a y6(b bVar) {
            return DEFAULT_INSTANCE.n5(bVar);
        }

        public static b z6(InputStream inputStream) throws IOException {
            return (b) l1.W5(DEFAULT_INSTANCE, inputStream);
        }

        @Override // a3.f.c
        public boolean I2(String str) {
            str.getClass();
            return w6().containsKey(str);
        }

        @Override // a3.f.c
        public int U() {
            return w6().size();
        }

        @Override // a3.f.c
        public C0004f W1(String str) {
            str.getClass();
            p2<String, C0004f> p2VarW6 = w6();
            if (p2VarW6.containsKey(str)) {
                return p2VarW6.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // a3.f.c
        public Map<String, C0004f> W4() {
            return Collections.unmodifiableMap(w6());
        }

        @Override // a3.f.c
        @Deprecated
        public Map<String, C0004f> e4() {
            return W4();
        }

        @Override // a3.f.c
        public C0004f o1(String str, C0004f c0004f) {
            str.getClass();
            p2<String, C0004f> p2VarW6 = w6();
            return p2VarW6.containsKey(str) ? p2VarW6.get(str) : c0004f;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        public final Object q5(l1.i iVar, Object obj, Object obj2) {
            m3 cVar;
            a aVar = null;
            switch (a.f3600a[iVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.S5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0003b.f3601a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m3<b> m3Var = PARSER;
                    if (m3Var != null) {
                        return m3Var;
                    }
                    synchronized (b.class) {
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

        public final Map<String, C0004f> u6() {
            return v6();
        }

        public final p2<String, C0004f> v6() {
            if (!this.preferences_.m()) {
                this.preferences_ = this.preferences_.r();
            }
            return this.preferences_;
        }

        public final p2<String, C0004f> w6() {
            return this.preferences_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c extends w2 {
        boolean I2(String str);

        int U();

        C0004f W1(String str);

        Map<String, C0004f> W4();

        @Deprecated
        Map<String, C0004f> e4();

        C0004f o1(String str, C0004f c0004f);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends l1<d, a> implements e {
        private static final d DEFAULT_INSTANCE;
        private static volatile m3<d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private t1.l<String> strings_ = l1.w5();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends l1.b<d, a> implements e {
            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // a3.f.e
            public String F4(int i10) {
                return ((d) this.f10089c).F4(i10);
            }

            public a F5(Iterable<String> iterable) {
                v5();
                ((d) this.f10089c).x6(iterable);
                return this;
            }

            public a G5(String str) {
                v5();
                ((d) this.f10089c).y6(str);
                return this;
            }

            public a H5(u uVar) {
                v5();
                ((d) this.f10089c).z6(uVar);
                return this;
            }

            public a I5() {
                v5();
                ((d) this.f10089c).A6();
                return this;
            }

            @Override // a3.f.e
            public u J3(int i10) {
                return ((d) this.f10089c).J3(i10);
            }

            public a J5(int i10, String str) {
                v5();
                ((d) this.f10089c).S6(i10, str);
                return this;
            }

            @Override // a3.f.e
            public List<String> U1() {
                return Collections.unmodifiableList(((d) this.f10089c).U1());
            }

            @Override // a3.f.e
            public int s1() {
                return ((d) this.f10089c).s1();
            }

            public a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            l1.o6(d.class, dVar);
        }

        public static d C6() {
            return DEFAULT_INSTANCE;
        }

        public static a D6() {
            return DEFAULT_INSTANCE.m5();
        }

        public static a E6(d dVar) {
            return DEFAULT_INSTANCE.n5(dVar);
        }

        public static d F6(InputStream inputStream) throws IOException {
            return (d) l1.W5(DEFAULT_INSTANCE, inputStream);
        }

        public static d G6(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.X5(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d H6(u uVar) throws y1 {
            return (d) l1.Y5(DEFAULT_INSTANCE, uVar);
        }

        public static d I6(u uVar, v0 v0Var) throws y1 {
            return (d) l1.Z5(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d J6(z zVar) throws IOException {
            return (d) l1.a6(DEFAULT_INSTANCE, zVar);
        }

        public static d K6(z zVar, v0 v0Var) throws IOException {
            return (d) l1.b6(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d L6(InputStream inputStream) throws IOException {
            return (d) l1.c6(DEFAULT_INSTANCE, inputStream);
        }

        public static d M6(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.d6(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d N6(ByteBuffer byteBuffer) throws y1 {
            return (d) l1.e6(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d O6(ByteBuffer byteBuffer, v0 v0Var) throws y1 {
            return (d) l1.f6(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d P6(byte[] bArr) throws y1 {
            return (d) l1.g6(DEFAULT_INSTANCE, bArr);
        }

        public static d Q6(byte[] bArr, v0 v0Var) throws y1 {
            return (d) l1.h6(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static m3<d> R6() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final void A6() {
            this.strings_ = l1.w5();
        }

        public final void B6() {
            t1.l<String> lVar = this.strings_;
            if (lVar.isModifiable()) {
                return;
            }
            this.strings_ = l1.Q5(lVar);
        }

        @Override // a3.f.e
        public String F4(int i10) {
            return this.strings_.get(i10);
        }

        @Override // a3.f.e
        public u J3(int i10) {
            return u.u(this.strings_.get(i10));
        }

        public final void S6(int i10, String str) {
            str.getClass();
            B6();
            this.strings_.set(i10, str);
        }

        @Override // a3.f.e
        public List<String> U1() {
            return this.strings_;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        public final Object q5(l1.i iVar, Object obj, Object obj2) {
            m3 cVar;
            a aVar = null;
            switch (a.f3600a[iVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.S5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m3<d> m3Var = PARSER;
                    if (m3Var != null) {
                        return m3Var;
                    }
                    synchronized (d.class) {
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

        @Override // a3.f.e
        public int s1() {
            return this.strings_.size();
        }

        public final void x6(Iterable<String> iterable) {
            B6();
            androidx.datastore.preferences.protobuf.a.R0(iterable, this.strings_);
        }

        public final void y6(String str) {
            str.getClass();
            B6();
            this.strings_.add(str);
        }

        public final void z6(u uVar) {
            B6();
            this.strings_.add(uVar.j0());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e extends w2 {
        String F4(int i10);

        u J3(int i10);

        List<String> U1();

        int s1();
    }

    /* JADX INFO: renamed from: a3.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0004f extends l1<C0004f, a> implements g {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final C0004f DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile m3<C0004f> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private Object value_;

        /* JADX INFO: renamed from: a3.f$f$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends l1.b<C0004f, a> implements g {
            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // a3.f.g
            public double E3() {
                return ((C0004f) this.f10089c).E3();
            }

            public a F5() {
                v5();
                ((C0004f) this.f10089c).L6();
                return this;
            }

            @Override // a3.f.g
            public boolean G1() {
                return ((C0004f) this.f10089c).G1();
            }

            public a G5() {
                v5();
                ((C0004f) this.f10089c).M6();
                return this;
            }

            public a H5() {
                v5();
                ((C0004f) this.f10089c).N6();
                return this;
            }

            @Override // a3.f.g
            public boolean I0() {
                return ((C0004f) this.f10089c).I0();
            }

            @Override // a3.f.g
            public String I3() {
                return ((C0004f) this.f10089c).I3();
            }

            public a I5() {
                v5();
                ((C0004f) this.f10089c).O6();
                return this;
            }

            public a J5() {
                v5();
                ((C0004f) this.f10089c).P6();
                return this;
            }

            public a K5() {
                v5();
                ((C0004f) this.f10089c).Q6();
                return this;
            }

            @Override // a3.f.g
            public boolean L0() {
                return ((C0004f) this.f10089c).L0();
            }

            @Override // a3.f.g
            public boolean L3() {
                return ((C0004f) this.f10089c).L3();
            }

            public a L5() {
                v5();
                ((C0004f) this.f10089c).R6();
                return this;
            }

            public a M5() {
                v5();
                ((C0004f) this.f10089c).S6();
                return this;
            }

            public a N5() {
                v5();
                ((C0004f) this.f10089c).T6();
                return this;
            }

            @Override // a3.f.g
            public boolean O4() {
                return ((C0004f) this.f10089c).O4();
            }

            public a O5(d dVar) {
                v5();
                ((C0004f) this.f10089c).V6(dVar);
                return this;
            }

            public a P5(boolean z10) {
                v5();
                ((C0004f) this.f10089c).l7(z10);
                return this;
            }

            public a Q5(u uVar) {
                v5();
                ((C0004f) this.f10089c).m7(uVar);
                return this;
            }

            public a R5(double d10) {
                v5();
                ((C0004f) this.f10089c).n7(d10);
                return this;
            }

            @Override // a3.f.g
            public u S() {
                return ((C0004f) this.f10089c).S();
            }

            public a S5(float f10) {
                v5();
                ((C0004f) this.f10089c).o7(f10);
                return this;
            }

            public a T5(int i10) {
                v5();
                ((C0004f) this.f10089c).p7(i10);
                return this;
            }

            @Override // a3.f.g
            public boolean U3() {
                return ((C0004f) this.f10089c).U3();
            }

            public a U5(long j10) {
                v5();
                ((C0004f) this.f10089c).q7(j10);
                return this;
            }

            public a V5(String str) {
                v5();
                ((C0004f) this.f10089c).r7(str);
                return this;
            }

            public a W5(u uVar) {
                v5();
                ((C0004f) this.f10089c).s7(uVar);
                return this;
            }

            public a X5(d.a aVar) {
                v5();
                ((C0004f) this.f10089c).t7(aVar.build());
                return this;
            }

            public a Y5(d dVar) {
                v5();
                ((C0004f) this.f10089c).t7(dVar);
                return this;
            }

            @Override // a3.f.g
            public boolean a4() {
                return ((C0004f) this.f10089c).a4();
            }

            @Override // a3.f.g
            public float e3() {
                return ((C0004f) this.f10089c).e3();
            }

            @Override // a3.f.g
            public int g1() {
                return ((C0004f) this.f10089c).g1();
            }

            @Override // a3.f.g
            public b getValueCase() {
                return ((C0004f) this.f10089c).getValueCase();
            }

            @Override // a3.f.g
            public d j1() {
                return ((C0004f) this.f10089c).j1();
            }

            @Override // a3.f.g
            public boolean j3() {
                return ((C0004f) this.f10089c).j3();
            }

            @Override // a3.f.g
            public boolean s2() {
                return ((C0004f) this.f10089c).s2();
            }

            @Override // a3.f.g
            public long v1() {
                return ((C0004f) this.f10089c).v1();
            }

            @Override // a3.f.g
            public u y() {
                return ((C0004f) this.f10089c).y();
            }

            public a() {
                super(C0004f.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: a3.f$f$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum b {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            BYTES(8),
            VALUE_NOT_SET(0);


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f3612b;

            b(int i10) {
                this.f3612b = i10;
            }

            public static b e(int i10) {
                switch (i10) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    case 8:
                        return BYTES;
                    default:
                        return null;
                }
            }

            @Deprecated
            public static b f(int i10) {
                return e(i10);
            }

            public int getNumber() {
                return this.f3612b;
            }
        }

        static {
            C0004f c0004f = new C0004f();
            DEFAULT_INSTANCE = c0004f;
            l1.o6(C0004f.class, c0004f);
        }

        public static C0004f U6() {
            return DEFAULT_INSTANCE;
        }

        public static a W6() {
            return DEFAULT_INSTANCE.m5();
        }

        public static a X6(C0004f c0004f) {
            return DEFAULT_INSTANCE.n5(c0004f);
        }

        public static C0004f Y6(InputStream inputStream) throws IOException {
            return (C0004f) l1.W5(DEFAULT_INSTANCE, inputStream);
        }

        public static C0004f Z6(InputStream inputStream, v0 v0Var) throws IOException {
            return (C0004f) l1.X5(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static C0004f a7(u uVar) throws y1 {
            return (C0004f) l1.Y5(DEFAULT_INSTANCE, uVar);
        }

        public static C0004f b7(u uVar, v0 v0Var) throws y1 {
            return (C0004f) l1.Z5(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static C0004f c7(z zVar) throws IOException {
            return (C0004f) l1.a6(DEFAULT_INSTANCE, zVar);
        }

        public static C0004f d7(z zVar, v0 v0Var) throws IOException {
            return (C0004f) l1.b6(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static C0004f e7(InputStream inputStream) throws IOException {
            return (C0004f) l1.c6(DEFAULT_INSTANCE, inputStream);
        }

        public static C0004f f7(InputStream inputStream, v0 v0Var) throws IOException {
            return (C0004f) l1.d6(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static C0004f g7(ByteBuffer byteBuffer) throws y1 {
            return (C0004f) l1.e6(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C0004f h7(ByteBuffer byteBuffer, v0 v0Var) throws y1 {
            return (C0004f) l1.f6(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static C0004f i7(byte[] bArr) throws y1 {
            return (C0004f) l1.g6(DEFAULT_INSTANCE, bArr);
        }

        public static C0004f j7(byte[] bArr, v0 v0Var) throws y1 {
            return (C0004f) l1.h6(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static m3<C0004f> k7() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // a3.f.g
        public double E3() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // a3.f.g
        public boolean G1() {
            return this.valueCase_ == 7;
        }

        @Override // a3.f.g
        public boolean I0() {
            return this.valueCase_ == 5;
        }

        @Override // a3.f.g
        public String I3() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        @Override // a3.f.g
        public boolean L0() {
            return this.valueCase_ == 2;
        }

        @Override // a3.f.g
        public boolean L3() {
            return this.valueCase_ == 4;
        }

        public final void L6() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void M6() {
            if (this.valueCase_ == 8) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void N6() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // a3.f.g
        public boolean O4() {
            return this.valueCase_ == 6;
        }

        public final void O6() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void P6() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void Q6() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void R6() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // a3.f.g
        public u S() {
            return u.u(this.valueCase_ == 5 ? (String) this.value_ : "");
        }

        public final void S6() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void T6() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        @Override // a3.f.g
        public boolean U3() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        public final void V6(d dVar) {
            dVar.getClass();
            if (this.valueCase_ != 6 || this.value_ == d.C6()) {
                this.value_ = dVar;
            } else {
                this.value_ = d.E6((d) this.value_).A5(dVar).buildPartial();
            }
            this.valueCase_ = 6;
        }

        @Override // a3.f.g
        public boolean a4() {
            return this.valueCase_ == 8;
        }

        @Override // a3.f.g
        public float e3() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // a3.f.g
        public int g1() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // a3.f.g
        public b getValueCase() {
            return b.e(this.valueCase_);
        }

        @Override // a3.f.g
        public d j1() {
            return this.valueCase_ == 6 ? (d) this.value_ : d.C6();
        }

        @Override // a3.f.g
        public boolean j3() {
            return this.valueCase_ == 3;
        }

        public final void l7(boolean z10) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z10);
        }

        public final void m7(u uVar) {
            uVar.getClass();
            this.valueCase_ = 8;
            this.value_ = uVar;
        }

        public final void n7(double d10) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d10);
        }

        public final void o7(float f10) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f10);
        }

        public final void p7(int i10) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        public final Object q5(l1.i iVar, Object obj, Object obj2) {
            m3 cVar;
            a aVar = null;
            switch (a.f3600a[iVar.ordinal()]) {
                case 1:
                    return new C0004f();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.S5(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", d.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m3<C0004f> m3Var = PARSER;
                    if (m3Var != null) {
                        return m3Var;
                    }
                    synchronized (C0004f.class) {
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

        public final void q7(long j10) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j10);
        }

        public final void r7(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        @Override // a3.f.g
        public boolean s2() {
            return this.valueCase_ == 1;
        }

        public final void s7(u uVar) {
            this.value_ = uVar.j0();
            this.valueCase_ = 5;
        }

        public final void t7(d dVar) {
            dVar.getClass();
            this.value_ = dVar;
            this.valueCase_ = 6;
        }

        @Override // a3.f.g
        public long v1() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // a3.f.g
        public u y() {
            return this.valueCase_ == 8 ? (u) this.value_ : u.f10242g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g extends w2 {
        double E3();

        boolean G1();

        boolean I0();

        String I3();

        boolean L0();

        boolean L3();

        boolean O4();

        u S();

        boolean U3();

        boolean a4();

        float e3();

        int g1();

        C0004f.b getValueCase();

        d j1();

        boolean j3();

        boolean s2();

        long v1();

        u y();
    }

    public static void a(v0 v0Var) {
    }
}
