package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
public final class pvd0 {
    public static final b a = new b();
    public static final c b = new c();
    public static final d c = new d();
    public static final e d = new e();
    public static final f e = new f();
    public static final g f = new g();
    public static final h g = new h();
    public static final i h = new i();
    public static final j i = new j();
    public static final a j = new a();

    public class a extends ybp<String> {
        @Override // defpackage.ybp
        public final String a(jep jepVar) {
            return jepVar.H();
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, String str) {
            rfpVar.V(str);
        }

        public final String toString() {
            return "JsonAdapter(String)";
        }
    }

    public class b implements ybp.a {
        @Override // ybp.a
        public final ybp<?> a(Type type, Set<? extends Annotation> set, h5w h5wVar) {
            j5y j5yVarB;
            Class<?> cls;
            Constructor<?> declaredConstructor;
            Object[] objArr;
            if (set.isEmpty()) {
                if (type == Boolean.TYPE) {
                    return pvd0.b;
                }
                if (type == Byte.TYPE) {
                    return pvd0.c;
                }
                if (type == Character.TYPE) {
                    return pvd0.d;
                }
                if (type == Double.TYPE) {
                    return pvd0.e;
                }
                if (type == Float.TYPE) {
                    return pvd0.f;
                }
                if (type == Integer.TYPE) {
                    return pvd0.g;
                }
                if (type == Long.TYPE) {
                    return pvd0.h;
                }
                if (type == Short.TYPE) {
                    return pvd0.i;
                }
                if (type == Boolean.class) {
                    return pvd0.b.b();
                }
                if (type == Byte.class) {
                    return pvd0.c.b();
                }
                if (type == Character.class) {
                    return pvd0.d.b();
                }
                if (type == Double.class) {
                    return pvd0.e.b();
                }
                if (type == Float.class) {
                    return pvd0.f.b();
                }
                if (type == Integer.class) {
                    return pvd0.g.b();
                }
                if (type == Long.class) {
                    return pvd0.h.b();
                }
                if (type == Short.class) {
                    return pvd0.i.b();
                }
                if (type == String.class) {
                    return pvd0.j.b();
                }
                if (type == Object.class) {
                    return new l(h5wVar).b();
                }
                Class<?> clsC = dah0.c(type);
                Set<Annotation> set2 = irh0.a;
                dcp dcpVar = (dcp) clsC.getAnnotation(dcp.class);
                if (dcpVar == null || !dcpVar.generateAdapter()) {
                    j5yVarB = null;
                } else {
                    try {
                        try {
                            cls = Class.forName(clsC.getName().replace("$", "_") + "JsonAdapter", true, clsC.getClassLoader());
                            try {
                                if (type instanceof ParameterizedType) {
                                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls.getDeclaredConstructor(h5w.class, Type[].class);
                                        objArr = new Object[]{h5wVar, actualTypeArguments};
                                    } catch (NoSuchMethodException unused) {
                                        declaredConstructor = cls.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls.getDeclaredConstructor(h5w.class);
                                        objArr = new Object[]{h5wVar};
                                    } catch (NoSuchMethodException unused2) {
                                        declaredConstructor = cls.getDeclaredConstructor(null);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                j5yVarB = ((ybp) declaredConstructor.newInstance(objArr)).b();
                            } catch (NoSuchMethodException e) {
                                e = e;
                                if ((type instanceof ParameterizedType) || cls.getTypeParameters().length == 0) {
                                    eyo.a("Failed to find the generated JsonAdapter constructor for ", type, e);
                                    return null;
                                }
                                StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                                sb.append(type);
                                String canonicalName = cls.getCanonicalName();
                                sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                                sb.append(canonicalName);
                                sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                                throw new RuntimeException(sb.toString(), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            cls = null;
                        }
                    } catch (ClassNotFoundException e3) {
                        eyo.a("Failed to find the generated JsonAdapter class for ", type, e3);
                        return null;
                    } catch (IllegalAccessException e4) {
                        eyo.a("Failed to access the generated JsonAdapter for ", type, e4);
                        return null;
                    } catch (InstantiationException e5) {
                        eyo.a("Failed to instantiate the generated JsonAdapter for ", type, e5);
                        return null;
                    } catch (InvocationTargetException e6) {
                        irh0.f(e6);
                        throw null;
                    }
                }
                if (j5yVarB != null) {
                    return j5yVarB;
                }
                if (clsC.isEnum()) {
                    return new k(clsC).b();
                }
            }
            return null;
        }
    }

    public class c extends ybp<Boolean> {
        @Override // defpackage.ybp
        public final Boolean a(jep jepVar) {
            gfp gfpVar = (gfp) jepVar;
            int iC0 = gfpVar.i;
            if (iC0 == 0) {
                iC0 = gfpVar.c0();
            }
            boolean z = false;
            if (iC0 == 5) {
                gfpVar.i = 0;
                int[] iArr = gfpVar.d;
                int i = gfpVar.a - 1;
                iArr[i] = iArr[i] + 1;
                z = true;
            } else {
                if (iC0 != 6) {
                    StringBuilder sb = new StringBuilder("Expected a boolean but was ");
                    sb.append(gfpVar.J());
                    hxa.b(sb, gfpVar.m());
                    return null;
                }
                gfpVar.i = 0;
                int[] iArr2 = gfpVar.d;
                int i2 = gfpVar.a - 1;
                iArr2[i2] = iArr2[i2] + 1;
            }
            return Boolean.valueOf(z);
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Boolean bool) {
            rfpVar.Y(bool.booleanValue());
        }

        public final String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    public class d extends ybp<Byte> {
        @Override // defpackage.ybp
        public final Byte a(jep jepVar) {
            return Byte.valueOf((byte) pvd0.a(jepVar, "a byte", -128, 255));
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Byte b) {
            rfpVar.J(b.intValue() & 255);
        }

        public final String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    public class e extends ybp<Character> {
        @Override // defpackage.ybp
        public final Character a(jep jepVar) {
            String strH = jepVar.H();
            if (strH.length() <= 1) {
                return Character.valueOf(strH.charAt(0));
            }
            throw new lcp(lx5.a("Expected a char but was ", zdf0.a('\"', "\"", strH), " at path ", jepVar.m()));
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Character ch) {
            rfpVar.V(ch.toString());
        }

        public final String toString() {
            return "JsonAdapter(Character)";
        }
    }

    public class f extends ybp<Double> {
        @Override // defpackage.ybp
        public final Double a(jep jepVar) {
            return Double.valueOf(jepVar.u());
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Double d) {
            rfpVar.H(d.doubleValue());
        }

        public final String toString() {
            return "JsonAdapter(Double)";
        }
    }

    public class g extends ybp<Float> {
        @Override // defpackage.ybp
        public final Float a(jep jepVar) {
            float fU = (float) jepVar.u();
            if (!Float.isInfinite(fU)) {
                return Float.valueOf(fU);
            }
            throw new lcp("JSON forbids NaN and infinities: " + fU + " at path " + jepVar.m());
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Float f) {
            Float f2 = f;
            f2.getClass();
            rfpVar.P(f2);
        }

        public final String toString() {
            return "JsonAdapter(Float)";
        }
    }

    public class h extends ybp<Integer> {
        @Override // defpackage.ybp
        public final Integer a(jep jepVar) {
            return Integer.valueOf(jepVar.F());
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Integer num) {
            rfpVar.J(num.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    public class i extends ybp<Long> {
        @Override // defpackage.ybp
        public final Long a(jep jepVar) {
            long j;
            gfp gfpVar = (gfp) jepVar;
            int iC0 = gfpVar.i;
            if (iC0 == 0) {
                iC0 = gfpVar.c0();
            }
            if (iC0 == 16) {
                gfpVar.i = 0;
                int[] iArr = gfpVar.d;
                int i = gfpVar.a - 1;
                iArr[i] = iArr[i] + 1;
                j = gfpVar.v;
            } else {
                if (iC0 == 17) {
                    lb5 lb5Var = gfpVar.f;
                    long j2 = gfpVar.w;
                    lb5Var.getClass();
                    gfpVar.y = lb5Var.V(j2, Charsets.UTF_8);
                } else if (iC0 == 9 || iC0 == 8) {
                    String strL0 = iC0 == 9 ? gfpVar.l0(gfp.A) : gfpVar.l0(gfp.z);
                    gfpVar.y = strL0;
                    try {
                        long j3 = Long.parseLong(strL0);
                        gfpVar.i = 0;
                        int[] iArr2 = gfpVar.d;
                        int i2 = gfpVar.a - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                        j = j3;
                    } catch (NumberFormatException unused) {
                        gfpVar.i = 11;
                        long jLongValueExact = new BigDecimal(gfpVar.y).longValueExact();
                        gfpVar.y = null;
                        gfpVar.i = 0;
                        int[] iArr3 = gfpVar.d;
                        int i3 = gfpVar.a - 1;
                        iArr3[i3] = iArr3[i3] + 1;
                        j = jLongValueExact;
                    }
                } else if (iC0 != 11) {
                    StringBuilder sb = new StringBuilder("Expected a long but was ");
                    sb.append(gfpVar.J());
                    hxa.b(sb, gfpVar.m());
                    return null;
                }
                gfpVar.i = 11;
                try {
                    long jLongValueExact2 = new BigDecimal(gfpVar.y).longValueExact();
                    gfpVar.y = null;
                    gfpVar.i = 0;
                    int[] iArr4 = gfpVar.d;
                    int i4 = gfpVar.a - 1;
                    iArr4[i4] = iArr4[i4] + 1;
                    j = jLongValueExact2;
                } catch (ArithmeticException | NumberFormatException unused2) {
                    dfp.a(gfpVar.y, "Expected a long but was ", gfpVar.m());
                    return null;
                }
            }
            return Long.valueOf(j);
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Long l) {
            rfpVar.J(l.longValue());
        }

        public final String toString() {
            return "JsonAdapter(Long)";
        }
    }

    public class j extends ybp<Short> {
        @Override // defpackage.ybp
        public final Short a(jep jepVar) {
            return Short.valueOf((short) pvd0.a(jepVar, "a short", -32768, 32767));
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Short sh) {
            rfpVar.J(sh.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Short)";
        }
    }

    public static final class l extends ybp<Object> {
        public final h5w a;
        public final ybp<List> b;
        public final ybp<Map> c;
        public final ybp<String> d;
        public final ybp<Double> e;
        public final ybp<Boolean> f;

        public l(h5w h5wVar) {
            this.a = h5wVar;
            Set<Annotation> set = irh0.a;
            this.b = h5wVar.a(List.class, set, null);
            this.c = h5wVar.a(Map.class, set, null);
            this.d = h5wVar.a(String.class, set, null);
            this.e = h5wVar.a(Double.class, set, null);
            this.f = h5wVar.a(Boolean.class, set, null);
        }

        @Override // defpackage.ybp
        public final Object a(jep jepVar) {
            int iOrdinal = jepVar.J().ordinal();
            if (iOrdinal == 0) {
                return this.b.a(jepVar);
            }
            if (iOrdinal == 2) {
                return this.c.a(jepVar);
            }
            if (iOrdinal == 5) {
                return this.d.a(jepVar);
            }
            if (iOrdinal == 6) {
                return this.e.a(jepVar);
            }
            if (iOrdinal == 7) {
                return this.f.a(jepVar);
            }
            if (iOrdinal == 8) {
                jepVar.G();
                return null;
            }
            StringBuilder sb = new StringBuilder("Expected a value but was ");
            sb.append(jepVar.J());
            emy.a(sb, " at path ", jepVar.m());
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0017 A[PHI: r1
          0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                rfpVar.f();
                rfpVar.l();
                return;
            }
            Class<?> cls2 = Map.class;
            if (cls2.isAssignableFrom(cls)) {
                cls = cls2;
            } else {
                cls2 = Collection.class;
                if (cls2.isAssignableFrom(cls)) {
                    cls = cls2;
                }
            }
            this.a.a(cls, irh0.a, null).c(rfpVar, obj);
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(jep jepVar, String str, int i2, int i3) {
        int iF = jepVar.F();
        if (iF >= i2 && iF <= i3) {
            return iF;
        }
        String strM = jepVar.m();
        StringBuilder sbA = ml5.a(iF, "Expected ", str, " but was ", " at path ");
        sbA.append(strM);
        throw new lcp(sbA.toString());
    }

    public static final class k<T extends Enum<T>> extends ybp<T> {
        public final Class<T> a;
        public final String[] b;
        public final T[] c;
        public final jep.a d;

        @Override // defpackage.ybp
        public final Object a(jep jepVar) {
            int iE0;
            gfp gfpVar = (gfp) jepVar;
            int iC0 = gfpVar.i;
            if (iC0 == 0) {
                iC0 = gfpVar.c0();
            }
            if (iC0 < 8 || iC0 > 11) {
                iE0 = -1;
            } else {
                jep.a aVar = this.d;
                if (iC0 == 11) {
                    iE0 = gfpVar.e0(gfpVar.y, aVar);
                } else {
                    int iH0 = gfpVar.e.H0(aVar.b);
                    if (iH0 != -1) {
                        gfpVar.i = 0;
                        int[] iArr = gfpVar.d;
                        int i = gfpVar.a - 1;
                        iArr[i] = iArr[i] + 1;
                        iE0 = iH0;
                    } else {
                        String strH = gfpVar.H();
                        int iE1 = gfpVar.e0(strH, aVar);
                        if (iE1 == -1) {
                            gfpVar.i = 11;
                            gfpVar.y = strH;
                            int[] iArr2 = gfpVar.d;
                            int i2 = gfpVar.a - 1;
                            iArr2[i2] = iArr2[i2] - 1;
                        }
                        iE0 = iE1;
                    }
                }
            }
            if (iE0 != -1) {
                return this.c[iE0];
            }
            String strM = jepVar.m();
            String strH2 = jepVar.H();
            StringBuilder sb = new StringBuilder("Expected one of ");
            gfs.a(" but was ", strH2, " at path ", sb, Arrays.asList(this.b));
            sb.append(strM);
            throw new lcp(sb.toString());
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, Object obj) {
            rfpVar.V(this.b[((Enum) obj).ordinal()]);
        }

        public final String toString() {
            return "JsonAdapter(" + this.a.getName() + ")";
        }

        public k(Class<T> cls) {
            this.a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.c = enumConstants;
                this.b = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.c;
                    if (i < tArr.length) {
                        String strName = tArr[i].name();
                        String[] strArr = this.b;
                        Field field = cls.getField(strName);
                        Set<Annotation> set = irh0.a;
                        xbp xbpVar = (xbp) field.getAnnotation(xbp.class);
                        if (xbpVar != null) {
                            String strName2 = xbpVar.name();
                            if (!"\u0000".equals(strName2)) {
                                strName = strName2;
                            }
                        }
                        strArr[i] = strName;
                        i++;
                    } else {
                        this.d = jep.a.a(this.b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(oLsIjJCWb.VuKXSxM.concat(cls.getName()), e);
            }
        }
    }
}
