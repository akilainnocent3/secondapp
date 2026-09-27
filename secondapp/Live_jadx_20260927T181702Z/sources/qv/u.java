package qv;

import dr.v1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1#2:113\n11158#3:114\n11493#3,3:115\n12727#3,3:132\n1971#4,14:118\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n41#1:114\n41#1:115,3\n78#1:132,3\n59#1:118,14\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f123037a = n(Throwable.class, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final k f123038b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements ds.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f123039b = new a();

        @Override // ds.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th2) {
            return null;
        }
    }

    static {
        k kVar;
        try {
            kVar = w.a() ? q1.f123030a : c.f122952a;
        } catch (Throwable unused) {
            kVar = q1.f123030a;
        }
        f123038b = kVar;
    }

    public static final <E extends Throwable> ds.l<Throwable, Throwable> g(Class<E> cls) {
        Object next;
        ds.l<Throwable, Throwable> lVar;
        dr.z0 z0VarA;
        a aVar = a.f123039b;
        if (f123037a == n(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                next = null;
                if (i10 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i10];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    z0VarA = v1.a(o(new ds.l() { // from class: qv.t
                        @Override // ds.l
                        public final Object invoke(Object obj) {
                            return u.k(constructor, (Throwable) obj);
                        }
                    }), 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (kotlin.jvm.internal.m0.g(cls2, String.class)) {
                        z0VarA = v1.a(o(new ds.l() { // from class: qv.r
                            @Override // ds.l
                            public final Object invoke(Object obj) {
                                return u.i(constructor, (Throwable) obj);
                            }
                        }), 2);
                    } else {
                        z0VarA = kotlin.jvm.internal.m0.g(cls2, Throwable.class) ? v1.a(o(new ds.l() { // from class: qv.s
                            @Override // ds.l
                            public final Object invoke(Object obj) {
                                return u.j(constructor, (Throwable) obj);
                            }
                        }), 1) : v1.a(null, -1);
                    }
                } else if (length2 != 2) {
                    z0VarA = v1.a(null, -1);
                } else {
                    z0VarA = (kotlin.jvm.internal.m0.g(parameterTypes[0], String.class) && kotlin.jvm.internal.m0.g(parameterTypes[1], Throwable.class)) ? v1.a(o(new ds.l() { // from class: qv.q
                        @Override // ds.l
                        public final Object invoke(Object obj) {
                            return u.h(constructor, (Throwable) obj);
                        }
                    }), 3) : v1.a(null, -1);
                }
                arrayList.add(z0VarA);
                i10++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((dr.z0) next).k()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((dr.z0) next2).k()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            dr.z0 z0Var = (dr.z0) next;
            if (z0Var != null && (lVar = (ds.l) z0Var.j()) != null) {
                return lVar;
            }
        }
        return aVar;
    }

    public static final Throwable h(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2.getMessage(), th2);
        kotlin.jvm.internal.m0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    public static final Throwable i(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2.getMessage());
        kotlin.jvm.internal.m0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) objNewInstance;
        th3.initCause(th2);
        return th3;
    }

    public static final Throwable j(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2);
        kotlin.jvm.internal.m0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    public static final Throwable k(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(null);
        kotlin.jvm.internal.m0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) objNewInstance;
        th3.initCause(th2);
        return th3;
    }

    public static final int l(Class<?> cls, int i10) {
        do {
            int i11 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    public static /* synthetic */ int m(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return l(cls, i10);
    }

    public static final int n(Class<?> cls, int i10) {
        Object objB;
        cs.b.i(cls);
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(Integer.valueOf(m(cls, 0, 1, null)));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (dr.i1.i(objB)) {
            objB = numValueOf;
        }
        return ((Number) objB).intValue();
    }

    public static final ds.l<Throwable, Throwable> o(final ds.l<? super Throwable, ? extends Throwable> lVar) {
        return new ds.l() { // from class: qv.p
            @Override // ds.l
            public final Object invoke(Object obj) {
                return u.p(lVar, (Throwable) obj);
            }
        };
    }

    public static final Throwable p(ds.l lVar, Throwable th2) {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            Throwable th3 = (Throwable) lVar.invoke(th2);
            if (!kotlin.jvm.internal.m0.g(th2.getMessage(), th3.getMessage()) && !kotlin.jvm.internal.m0.g(th3.getMessage(), th2.toString())) {
                th3 = null;
            }
            objB = dr.i1.b(th3);
        } catch (Throwable th4) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th4));
        }
        return (Throwable) (dr.i1.i(objB) ? null : objB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.m
    public static final <E extends Throwable> E q(@oy.l E e10) {
        Object objB;
        if (!(e10 instanceof jv.h0)) {
            return (E) f123038b.a(e10.getClass()).invoke(e10);
        }
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(((jv.h0) e10).d());
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.i(objB)) {
            objB = null;
        }
        return (E) objB;
    }
}
