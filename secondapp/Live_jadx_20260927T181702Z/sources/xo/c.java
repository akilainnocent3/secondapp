package xo;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.x;
import wo.b0;
import wo.g;
import wo.i;
import wo.j;
import wo.l;
import wo.m;
import zq.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Annotation> f145478a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type[] f145479b = new Type[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @h
    public static final Class<?> f145480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @h
    public static final Class<? extends Annotation> f145481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f145482e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f145483b;

        public a(Type type) {
            this.f145483b = c.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b0.e(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f145483b;
        }

        public int hashCode() {
            return this.f145483b.hashCode();
        }

        public String toString() {
            return c.z(this.f145483b) + "[]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @h
        public final Type f145484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Type f145485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Type[] f145486d;

        public b(@h Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || b0.j(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f145484b = type == null ? null : c.b(type);
            this.f145485c = c.b(type2);
            this.f145486d = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f145486d;
                if (i10 >= typeArr2.length) {
                    return;
                }
                typeArr2[i10].getClass();
                c.c(this.f145486d[i10]);
                Type[] typeArr3 = this.f145486d;
                typeArr3[i10] = c.b(typeArr3[i10]);
                i10++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b0.e(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f145486d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @h
        public Type getOwnerType() {
            return this.f145484b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f145485c;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f145486d) ^ this.f145485c.hashCode()) ^ c.i(this.f145484b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f145486d.length + 1) * 30);
            sb2.append(c.z(this.f145485c));
            if (this.f145486d.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(c.z(this.f145486d[0]));
            for (int i10 = 1; i10 < this.f145486d.length; i10++) {
                sb2.append(", ");
                sb2.append(c.z(this.f145486d[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: xo.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1529c implements WildcardType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f145487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @h
        public final Type f145488c;

        public C1529c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                c.c(typeArr[0]);
                this.f145488c = null;
                this.f145487b = c.b(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            c.c(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f145488c = c.b(typeArr2[0]);
            this.f145487b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b0.e(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f145488c;
            return type != null ? new Type[]{type} : c.f145479b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f145487b};
        }

        public int hashCode() {
            Type type = this.f145488c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f145487b.hashCode() + 31);
        }

        public String toString() {
            if (this.f145488c != null) {
                return "? super " + c.z(this.f145488c);
            }
            if (this.f145487b == Object.class) {
                return "?";
            }
            return "? extends " + c.z(this.f145487b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f145481d = cls;
        f145480c = x.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f145482e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static boolean A(Type type, Type type2) {
        return b0.e(type, type2);
    }

    public static j B(String str, String str2, m mVar) {
        String path = mVar.getPath();
        return new j(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, path) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path));
    }

    public static <T> Class<T> a(Class<T> cls) {
        Class<T> cls2 = (Class) f145482e.get(cls);
        return cls2 == null ? cls : cls2;
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C1529c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C1529c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    @h
    public static Class<?> d(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static <T> Constructor<T> e(Class<T> cls) {
        for (Object obj : cls.getDeclaredConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length != 0 && parameterTypes[parameterTypes.length - 1].equals(f145480c)) {
                return constructor;
            }
        }
        throw new IllegalStateException("No defaults constructor found for " + cls);
    }

    @h
    public static wo.h<?> f(wo.x xVar, Type type, Class<?> cls) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        i iVar = (i) cls.getAnnotation(i.class);
        Class<?> cls2 = null;
        if (iVar == null || !iVar.generateAdapter()) {
            return null;
        }
        try {
            try {
                Class<?> cls3 = Class.forName(b0.g(cls.getName()), true, cls.getClassLoader());
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(wo.x.class, Type[].class);
                            objArr = new Object[]{xVar, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(wo.x.class);
                            objArr = new Object[]{xVar};
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls3.getDeclaredConstructor(null);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((wo.h) declaredConstructor.newInstance(objArr)).j();
                } catch (NoSuchMethodException e10) {
                    e = e10;
                    cls2 = cls3;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
            } catch (NoSuchMethodException e11) {
                e = e11;
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e12);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e14);
        } catch (InvocationTargetException e15) {
            throw x(e15);
        }
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return g(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return g(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static boolean h(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    public static int i(@h Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int j(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean k(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (set.isEmpty()) {
            return false;
        }
        Iterator<? extends Annotation> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().annotationType() == cls) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(Class<?> cls) {
        Class<? extends Annotation> cls2 = f145481d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean m(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> n(AnnotatedElement annotatedElement) {
        return o(annotatedElement.getAnnotations());
    }

    public static Set<? extends Annotation> o(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f145478a;
    }

    public static String p(String str, AnnotatedElement annotatedElement) {
        return q(str, (g) annotatedElement.getAnnotation(g.class));
    }

    public static String q(String str, @h g gVar) {
        if (gVar != null) {
            String strName = gVar.name();
            if (!g.f143517x2.equals(strName)) {
                return strName;
            }
        }
        return str;
    }

    public static <T> Constructor<T> r(Class<T> cls) {
        if (f145480c == null) {
            throw new IllegalStateException("DefaultConstructorMarker not on classpath. Make sure the Kotlin stdlib is on the classpath.");
        }
        Constructor<T> constructorE = e(cls);
        constructorE.setAccessible(true);
        return constructorE;
    }

    public static j s(String str, String str2, m mVar) {
        String path = mVar.getPath();
        return new j(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, path) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path));
    }

    public static Type t(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type u(Type type, Class<?> cls, Type type2) {
        return v(type, cls, type2, new LinkedHashSet());
    }

    public static Type v(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        Type type3;
        WildcardType wildcardType;
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = w(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeV = v(type, cls, componentType, collection);
                return componentType == typeV ? cls2 : b0.b(typeV);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeV2 = v(type, cls, genericComponentType, collection);
            return genericComponentType == typeV2 ? genericArrayType : b0.b(typeV2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeV3 = v(type, cls, ownerType, collection);
            boolean z10 = typeV3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeV4 = v(type, cls, actualTypeArguments[i10], collection);
                if (typeV4 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeV4;
                }
            }
            return z10 ? new b(typeV3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeV5 = v(type, cls, lowerBounds[0], collection);
                if (typeV5 != lowerBounds[0]) {
                    type3 = type2;
                    type3 = wildcardType;
                    return b0.q(typeV5);
                }
            } else if (upperBounds.length == 1) {
                type3 = type2;
                type3 = wildcardType;
                Type typeV6 = v(type, cls, upperBounds[0], collection);
                type3 = wildcardType;
                if (typeV6 != upperBounds[0]) {
                    return b0.p(typeV6);
                }
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    public static Type w(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsD = d(typeVariable);
        if (clsD != null) {
            Type typeG = g(type, cls, clsD);
            if (typeG instanceof ParameterizedType) {
                return ((ParameterizedType) typeG).getActualTypeArguments()[j(clsD.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static RuntimeException x(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static String y(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String z(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
