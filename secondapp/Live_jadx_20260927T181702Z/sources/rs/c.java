package rs;

import com.ironsource.G5;
import dr.i0;
import dr.k0;
import fr.a0;
import fr.r0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.m1;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;
import oy.l;
import qs.g0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,181:1\n11335#2:182\n11670#2,3:183\n37#3,2:186\n18#3:195\n1549#4:188\n1620#4,3:189\n1726#4,3:192\n26#5:196\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n*L\n75#1:182\n75#1:183,3\n75#1:186,2\n173#1:195\n102#1:188\n102#1:189,3\n106#1:192,3\n173#1:196\n*E\n"})
public final class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends o0 implements ds.a<Integer> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f127500g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(0);
            this.f127500g = map;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ds.a
        @l
        public final Integer invoke() {
            int iHashCode;
            Iterator<T> it = this.f127500g.entrySet().iterator();
            int iHashCode2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    iHashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    iHashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    iHashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    iHashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    iHashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    iHashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    iHashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    iHashCode = Arrays.hashCode((double[]) value);
                } else {
                    iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                }
                iHashCode2 += iHashCode ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(iHashCode2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends o0 implements ds.a<String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Class<T> f127501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f127502h;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends o0 implements ds.l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final a f127503g = new a();

            public a() {
                super(1);
            }

            @Override // ds.l
            @l
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@l Map.Entry<String, ? extends Object> entry) {
                String string;
                m0.p(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    m0.o(string, "toString(this)");
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    m0.o(string, "toString(this)");
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    m0.o(string, "toString(this)");
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    m0.o(string, "toString(this)");
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    m0.o(string, "toString(this)");
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    m0.o(string, "toString(this)");
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    m0.o(string, "toString(this)");
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    m0.o(string, "toString(this)");
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    m0.o(string, "toString(this)");
                } else {
                    string = value.toString();
                }
                return key + G5.T + string;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f127501g = cls;
            this.f127502h = map;
        }

        @Override // ds.a
        @l
        public final String invoke() throws IOException {
            Class<T> cls = this.f127501g;
            Map<String, Object> map = this.f127502h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(cls.getCanonicalName());
            r0.o3(map.entrySet(), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : gi.j.f86770c, (112 & 8) == 0 ? gi.j.f86771d : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : a.f127503g);
            String string = sb2.toString();
            m0.o(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    @l
    public static final <T> T d(@l Class<T> annotationClass, @l Map<String, ? extends Object> values, @l List<Method> methods) {
        m0.p(annotationClass, "annotationClass");
        m0.p(values, "values");
        m0.p(methods, "methods");
        i0 i0VarB = k0.b(new a(values));
        T t10 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new rs.b(annotationClass, values, k0.b(new b(annotationClass, values)), i0VarB, methods));
        m0.n(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }

    public static /* synthetic */ Object e(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(fr.i0.d0(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return d(cls, map, list);
    }

    public static final <T> boolean f(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zG;
        boolean z10;
        ns.d dVarA;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (m0.g((annotation == null || (dVarA = cs.b.a(annotation)) == null) ? null : cs.b.e(dVarA), cls)) {
            List<Method> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z10 = true;
            } else {
                for (Method method : list2) {
                    Object obj2 = map.get(method.getName());
                    Object objInvoke = method.invoke(obj, null);
                    if (obj2 instanceof boolean[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zG = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zG = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zG = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zG = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zG = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zG = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zG = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zG = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zG = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zG = m0.g(obj2, objInvoke);
                    }
                    if (!zG) {
                        z10 = false;
                    }
                }
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static final int g(i0<Integer> i0Var) {
        return i0Var.getValue().intValue();
    }

    public static final String h(i0<String> i0Var) {
        return i0Var.getValue();
    }

    public static final Object i(Class annotationClass, Map values, i0 toString$delegate, i0 hashCode$delegate, List methods, Object obj, Method method, Object[] args) {
        m0.p(annotationClass, "$annotationClass");
        m0.p(values, "$values");
        m0.p(toString$delegate, "$toString$delegate");
        m0.p(hashCode$delegate, "$hashCode$delegate");
        m0.p(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(g(hashCode$delegate));
                }
            } else if (name.equals("toString")) {
                return h(toString$delegate);
            }
        }
        if (m0.g(name, "equals") && args != null && args.length == 1) {
            m0.o(args, "args");
            return Boolean.valueOf(f(annotationClass, methods, values, a0.rt(args)));
        }
        if (values.containsKey(name)) {
            return values.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (args == null) {
            args = new Object[0];
        }
        sb2.append(a0.Uy(args));
        sb2.append(')');
        throw new g0(sb2.toString());
    }

    public static final Void j(int i10, String str, Class<?> cls) {
        ns.d dVarD;
        String strY;
        if (m0.g(cls, Class.class)) {
            dVarD = m1.d(ns.d.class);
        } else {
            dVarD = (cls.isArray() && m0.g(cls.getComponentType(), Class.class)) ? m1.d(ns.d[].class) : cs.b.i(cls);
        }
        if (m0.g(dVarD.y(), m1.d(Object[].class).y())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVarD.y());
            sb2.append('<');
            Class<?> componentType = cs.b.e(dVarD).getComponentType();
            m0.o(componentType, "kotlinClass.java.componentType");
            sb2.append(cs.b.i(componentType).y());
            sb2.append('>');
            strY = sb2.toString();
        } else {
            strY = dVarD.y();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strY);
    }

    public static final Object k(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof ns.d) {
            obj = cs.b.e((ns.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof ns.d[]) {
                m0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                ns.d[] dVarArr = (ns.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (ns.d dVar : dVarArr) {
                    arrayList.add(cs.b.e(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
