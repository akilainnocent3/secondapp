package jm;

import gm.k0;
import gm.y;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? super T> f100637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f100638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100639c;

    public a() {
        Type typeH = h();
        this.f100638b = typeH;
        this.f100637a = (Class<? super T>) y.k(typeH);
        this.f100639c = typeH.hashCode();
    }

    public static IllegalArgumentException a(Type type, Class<?>... clsArr) {
        StringBuilder sb2 = new StringBuilder("Unsupported type, expected one of: ");
        for (Class<?> cls : clsArr) {
            sb2.append(cls.getName());
            sb2.append(", ");
        }
        sb2.append("but got: ");
        sb2.append(type.getClass().getName());
        sb2.append(", for type token: ");
        sb2.append(type.toString());
        return new IllegalArgumentException(sb2.toString());
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> c(Type type) {
        return new a<>(type);
    }

    public static a<?> d(Type type) {
        return new a<>(y.a(type));
    }

    public static a<?> e(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
        }
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        if (typeArr.length == 0) {
            return b(cls);
        }
        if (y.o(type)) {
            throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
        }
        for (int i10 = 0; i10 < length; i10++) {
            Type type2 = typeArr[i10];
            Objects.requireNonNull(type2, "Type argument must not be null");
            Type type3 = type2;
            Class<?> clsK = y.k(type3);
            TypeVariable<Class<T>> typeVariable = typeParameters[i10];
            for (Type type4 : typeVariable.getBounds()) {
                if (!y.k(type4).isAssignableFrom(clsK)) {
                    throw new IllegalArgumentException("Type argument " + type3 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                }
            }
        }
        return new a<>(y.n(null, cls, typeArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static boolean k(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return l(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    public static boolean l(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> clsK = y.k(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = clsK.getTypeParameters();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                Type type2 = actualTypeArguments[i10];
                TypeVariable<Class<?>> typeVariable = typeParameters[i10];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (p(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : clsK.getGenericInterfaces()) {
            if (l(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return l(clsK.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    public static boolean n() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true");
    }

    public static boolean o(Type type, Type type2, Map<String, Type> map) {
        if (type2.equals(type)) {
            return true;
        }
        return (type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName()));
    }

    public static boolean p(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            if (!o(actualTypeArguments[i10], actualTypeArguments2[i10], map)) {
                return false;
            }
        }
        return true;
    }

    public static void q(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + k0.a("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            q(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i10 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                q(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i10 < length) {
                q(actualTypeArguments[i10]);
                i10++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            q(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i10 < length2) {
            q(upperBounds[i10]);
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && y.f(this.f100638b, ((a) obj).f100638b);
    }

    public final Class<? super T> f() {
        return this.f100637a;
    }

    public final Type g() {
        return this.f100638b;
    }

    public final Type h() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeB = y.b(parameterizedType.getActualTypeArguments()[0]);
                if (n()) {
                    q(typeB);
                }
                return typeB;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + k0.a("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final int hashCode() {
        return this.f100639c;
    }

    @Deprecated
    public boolean i(Class<?> cls) {
        return j(cls);
    }

    @Deprecated
    public boolean j(Type type) {
        if (type == null) {
            return false;
        }
        if (this.f100638b.equals(type)) {
            return true;
        }
        Type type2 = this.f100638b;
        if (type2 instanceof Class) {
            return this.f100637a.isAssignableFrom(y.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return l(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.f100637a.isAssignableFrom(y.k(type)) && k(type, (GenericArrayType) this.f100638b);
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean m(a<?> aVar) {
        return j(aVar.g());
    }

    public final String toString() {
        return y.u(this.f100638b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeB = y.b(type);
        this.f100638b = typeB;
        this.f100637a = (Class<? super T>) y.k(typeB);
        this.f100639c = typeB.hashCode();
    }
}
