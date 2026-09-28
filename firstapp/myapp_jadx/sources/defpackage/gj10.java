package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final class gj10 {
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    public static final <T> php<T> a(ygp<T> ygpVar, php<Object>... phpVarArr) {
        Object obj;
        php<T> phpVar;
        Class<?> cls;
        Object obj2;
        php<T> phpVarB;
        Field field;
        ae80 ae80Var;
        ygpVar.getClass();
        Class clsB = tgp.b(ygpVar);
        php[] phpVarArr2 = (php[]) Arrays.copyOf(phpVarArr, phpVarArr.length);
        if (clsB.isEnum() && clsB.getAnnotation(ae80.class) == null && clsB.getAnnotation(e120.class) == null) {
            Object[] enumConstants = clsB.getEnumConstants();
            String canonicalName = clsB.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new wag(canonicalName, (Enum[]) enumConstants);
        }
        php[] phpVarArr3 = (php[]) Arrays.copyOf(phpVarArr2, phpVarArr2.length);
        i120 i120Var = null;
        try {
            Field declaredField = clsB.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        php<T> phpVarB2 = obj == null ? null : b(obj, (php[]) Arrays.copyOf(phpVarArr3, phpVarArr3.length));
        if (phpVarB2 != null) {
            return phpVarB2;
        }
        String canonicalName2 = clsB.getCanonicalName();
        if (canonicalName2 == null || c.u(canonicalName2, "java.", false) || c.u(canonicalName2, "kotlin.", false)) {
            phpVar = null;
        } else {
            Field[] declaredFields = clsB.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i];
                if (Intrinsics.g(field3.getName(), "INSTANCE") && Intrinsics.g(field3.getType(), clsB) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z) {
                        z = true;
                        field2 = field3;
                    }
                }
                i++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                phpVar = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsB.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (Intrinsics.g(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && Intrinsics.g(method2.getReturnType(), php.class)) {
                            if (!z2) {
                                z2 = true;
                                method = method2;
                            }
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    phpVar = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof php) {
                        phpVar = (php) objInvoke;
                    } else {
                        phpVar = null;
                    }
                }
            }
        }
        if (phpVar != null) {
            return phpVar;
        }
        php[] phpVarArr4 = (php[]) Arrays.copyOf(phpVarArr2, phpVarArr2.length);
        Class<?>[] declaredClasses = clsB.getDeclaredClasses();
        declaredClasses.getClass();
        int length3 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i3];
            if (cls.getAnnotation(mex.class) != null) {
                break;
            }
            i3++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsB.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (phpVarB = b(obj2, (php[]) Arrays.copyOf(phpVarArr4, phpVarArr4.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsB.getDeclaredClasses();
                declaredClasses2.getClass();
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses2[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                phpVarB = obj4 instanceof php ? (php) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (phpVarB != null) {
            return phpVarB;
        }
        if (clsB.getAnnotation(e120.class) != null || ((ae80Var = (ae80) clsB.getAnnotation(ae80.class)) != null && jq40.a(ae80Var.with()).equals(jq40.a(i120.class)))) {
            i120Var = new i120(jq40.a(clsB));
        }
        return i120Var;
    }

    public static final <T> php<T> b(Object obj, php<Object>... phpVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (phpVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = phpVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = php.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(phpVarArr, phpVarArr.length));
            if (objInvoke instanceof php) {
                return (php) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }
}
