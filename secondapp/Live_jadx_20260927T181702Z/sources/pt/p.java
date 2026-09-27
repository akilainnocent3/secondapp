package pt;

import cv.p0;
import dr.o0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nmethodSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/JvmTypeFactoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,184:1\n1#2:185\n1282#3,2:186\n*S KotlinDebug\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/JvmTypeFactoryImpl\n*L\n128#1:186,2\n*E\n"})
public final class p implements o<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final p f121054a = new p();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121055a;

        static {
            int[] iArr = new int[ts.i.values().length];
            try {
                iArr[ts.i.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ts.i.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ts.i.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ts.i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ts.i.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ts.i.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ts.i.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ts.i.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f121055a = iArr;
        }
    }

    @Override // pt.o
    @oy.l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public n d(@oy.l n possiblyPrimitiveType) {
        m0.p(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof n.d)) {
            return possiblyPrimitiveType;
        }
        n.d dVar = (n.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String strF = fu.d.c(dVar.i().i()).f();
        m0.o(strF, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return f(strF);
    }

    @Override // pt.o
    @oy.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public n a(@oy.l String representation) {
        fu.e eVar;
        m0.p(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        fu.e[] eVarArrValues = fu.e.values();
        int length = eVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i10];
            if (eVar.d().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (eVar != null) {
            return new n.d(eVar);
        }
        if (cCharAt == 'V') {
            return new n.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            m0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new n.a(a(strSubstring));
        }
        if (cCharAt == 'L') {
            p0.s3(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        m0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new n.c(strSubstring2);
    }

    @Override // pt.o
    @oy.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public n.c f(@oy.l String internalName) {
        m0.p(internalName, "internalName");
        return new n.c(internalName);
    }

    @Override // pt.o
    @oy.l
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public n c(@oy.l ts.i primitiveType) {
        m0.p(primitiveType, "primitiveType");
        switch (a.f121055a[primitiveType.ordinal()]) {
            case 1:
                return n.f121042a.a();
            case 2:
                return n.f121042a.c();
            case 3:
                return n.f121042a.b();
            case 4:
                return n.f121042a.h();
            case 5:
                return n.f121042a.f();
            case 6:
                return n.f121042a.e();
            case 7:
                return n.f121042a.g();
            case 8:
                return n.f121042a.d();
            default:
                throw new o0();
        }
    }

    @Override // pt.o
    @oy.l
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public n b() {
        return f("java/lang/Class");
    }

    @Override // pt.o
    @oy.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String e(@oy.l n type) {
        String strD;
        m0.p(type, "type");
        if (type instanceof n.a) {
            return fw.b.f85384k + e(((n.a) type).i());
        }
        if (type instanceof n.d) {
            fu.e eVarI = ((n.d) type).i();
            return (eVarI == null || (strD = eVarI.d()) == null) ? l3.a.X4 : strD;
        }
        if (!(type instanceof n.c)) {
            throw new o0();
        }
        return 'L' + ((n.c) type).i() + ';';
    }
}
