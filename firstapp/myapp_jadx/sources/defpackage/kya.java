package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes4.dex */
public final class kya {
    public final Map<Type, vnn<?>> a;
    public final List<kq40> b;

    public kya(Map map, List list) {
        this.a = map;
        this.b = list;
    }

    public static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0166  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    public final <T> tby<T> b(TypeToken<T> typeToken, boolean z) {
        tby<T> tbyVar;
        tby<T> tbyVar2;
        final String str;
        final Type type = typeToken.getType();
        final Class<? super T> rawType = typeToken.getRawType();
        Map<Type, vnn<?>> map = this.a;
        final vnn<?> vnnVar = map.get(type);
        if (vnnVar != null) {
            return new tby(type) { // from class: dya
                @Override // defpackage.tby
                public final Object a() {
                    return this.a.a();
                }
            };
        }
        vnn<?> vnnVar2 = map.get(rawType);
        if (vnnVar2 != null) {
            return new pu6(vnnVar2, type);
        }
        tby<T> ayaVar = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            tbyVar = new tby() { // from class: uxa
                @Override // defpackage.tby
                public final Object a() {
                    Type type2 = type;
                    if (!(type2 instanceof ParameterizedType)) {
                        sxa.a(type2, "Invalid EnumSet type: ");
                        return null;
                    }
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return EnumSet.noneOf((Class) type3);
                    }
                    sxa.a(type2, "Invalid EnumSet type: ");
                    return null;
                }
            };
        } else {
            tbyVar = rawType == EnumMap.class ? new tby() { // from class: vxa
                @Override // defpackage.tby
                public final Object a() {
                    Type type2 = type;
                    if (!(type2 instanceof ParameterizedType)) {
                        sxa.a(type2, "Invalid EnumMap type: ");
                        return null;
                    }
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return new EnumMap((Class) type3);
                    }
                    sxa.a(type2, "Invalid EnumMap type: ");
                    return null;
                }
            } : null;
        }
        if (tbyVar != null) {
            return tbyVar;
        }
        kq40.a aVarA = lq40.a(rawType, this.b);
        boolean zIsAbstract = Modifier.isAbstract(rawType.getModifiers());
        kq40.a aVar = kq40.a.a;
        if (zIsAbstract) {
            tbyVar2 = null;
        } else {
            try {
                final Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(null);
                if (aVarA != aVar && (!lq40.a.a.a(null, declaredConstructor) || (aVarA == kq40.a.d && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    final String str2 = "Unable to invoke no-args constructor of " + rawType + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
                    tbyVar2 = new tby() { // from class: bya
                        @Override // defpackage.tby
                        public final Object a() {
                            throw new kdp(str2);
                        }
                    };
                } else if (aVarA == aVar) {
                    nq40.a aVar2 = nq40.a;
                    try {
                        declaredConstructor.setAccessible(true);
                        str = null;
                    } catch (Exception e) {
                        str = "Failed making constructor '" + nq40.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + nq40.e(e);
                    }
                    if (str != null) {
                        tbyVar2 = new tby() { // from class: cya
                            @Override // defpackage.tby
                            public final Object a() {
                                throw new kdp(str);
                            }
                        };
                    } else {
                        tbyVar2 = new tby() { // from class: eya
                            @Override // defpackage.tby
                            public final Object a() {
                                Constructor constructor = declaredConstructor;
                                try {
                                    return constructor.newInstance(null);
                                } catch (IllegalAccessException e2) {
                                    nq40.a aVar3 = nq40.a;
                                    jk40.a("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                                    return null;
                                } catch (InstantiationException e3) {
                                    throw new RuntimeException("Failed to invoke constructor '" + nq40.b(constructor) + "' with no args", e3);
                                } catch (InvocationTargetException e4) {
                                    jk40.a("Failed to invoke constructor '" + nq40.b(constructor) + "' with no args", e4.getCause());
                                    return null;
                                }
                            }
                        };
                    }
                } else {
                    tbyVar2 = new tby() { // from class: eya
                        @Override // defpackage.tby
                        public final Object a() {
                            Constructor constructor = declaredConstructor;
                            try {
                                return constructor.newInstance(null);
                            } catch (IllegalAccessException e2) {
                                nq40.a aVar3 = nq40.a;
                                jk40.a("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                                return null;
                            } catch (InstantiationException e3) {
                                throw new RuntimeException("Failed to invoke constructor '" + nq40.b(constructor) + "' with no args", e3);
                            } catch (InvocationTargetException e4) {
                                jk40.a("Failed to invoke constructor '" + nq40.b(constructor) + "' with no args", e4.getCause());
                                return null;
                            }
                        }
                    };
                }
            } catch (NoSuchMethodException unused) {
                tbyVar2 = null;
            }
        }
        if (tbyVar2 != null) {
            return tbyVar2;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (rawType.isAssignableFrom(ArrayList.class)) {
                ayaVar = new rr1();
            } else if (rawType.isAssignableFrom(LinkedHashSet.class)) {
                ayaVar = new hya();
            } else if (rawType.isAssignableFrom(TreeSet.class)) {
                ayaVar = new iya();
            } else if (rawType.isAssignableFrom(ArrayDeque.class)) {
                ayaVar = new jya();
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (rawType.isAssignableFrom(hgs.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || ial.e(actualTypeArguments[0]) != String.class) {
                        if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                            ayaVar = new xxa();
                        } else if (rawType.isAssignableFrom(TreeMap.class)) {
                            ayaVar = new yxa();
                        } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                            ayaVar = new zxa();
                        } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            ayaVar = new aya();
                        }
                    }
                }
                ayaVar = new wxa();
            } else if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                ayaVar = new xxa();
            } else if (rawType.isAssignableFrom(TreeMap.class)) {
                ayaVar = new yxa();
            } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                ayaVar = new zxa();
            } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                ayaVar = new aya();
            }
        }
        if (ayaVar != null) {
            return ayaVar;
        }
        final String strA = a(rawType);
        if (strA != null) {
            return new tby() { // from class: fya
                @Override // defpackage.tby
                public final Object a() {
                    throw new kdp(strA);
                }
            };
        }
        if (!z) {
            return new wu6("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.");
        }
        if (aVarA == aVar) {
            return new tby() { // from class: txa
                @Override // defpackage.tby
                public final Object a() {
                    Class cls = rawType;
                    try {
                        return vgh0.a.a(cls);
                    } catch (Exception e2) {
                        throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
                    }
                }
            };
        }
        final String str3 = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new tby() { // from class: gya
            @Override // defpackage.tby
            public final Object a() {
                throw new kdp(str3);
            }
        };
    }

    public final String toString() {
        return this.a.toString();
    }
}
