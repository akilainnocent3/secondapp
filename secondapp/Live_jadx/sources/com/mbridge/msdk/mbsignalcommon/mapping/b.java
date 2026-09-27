package com.mbridge.msdk.mbsignalcommon.mapping;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Class<C> f68184a;

        public a(Class<C> cls) {
            this.f68184a = cls;
        }

        public C0658b a(String str, Class<?>... clsArr) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
            return new C0658b(this.f68184a, str, clsArr, 0);
        }
    }

    public static <T> a<T> a(ClassLoader classLoader, String str) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
        try {
            return new a<>(classLoader.loadClass(str));
        } catch (Exception e10) {
            b(new com.mbridge.msdk.mbsignalcommon.mapping.a(e10));
            return new a<>(null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mapping.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0658b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Method f68185a;

        public C0658b(Class<?> cls, String str, Class<?>[] clsArr, int i10) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
            Method declaredMethod = null;
            if (cls == null) {
                this.f68185a = null;
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e10) {
                    if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                        e10.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e11) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                                e11.printStackTrace();
                            }
                            cls = cls.getSuperclass();
                        } catch (Exception e12) {
                            com.mbridge.msdk.mbsignalcommon.mapping.a aVar = new com.mbridge.msdk.mbsignalcommon.mapping.a(e12);
                            aVar.a(cls);
                            aVar.a(str);
                            b.b(aVar);
                            this.f68185a = declaredMethod;
                            return;
                        }
                    } catch (Throwable th2) {
                        this.f68185a = declaredMethod;
                        throw th2;
                    }
                }
            }
            if (declaredMethod != null) {
                if (i10 > 0 && (declaredMethod.getModifiers() & i10) != i10) {
                    b.b(new com.mbridge.msdk.mbsignalcommon.mapping.a(declaredMethod + " does not match modifiers: " + i10));
                }
                declaredMethod.setAccessible(true);
            }
            this.f68185a = declaredMethod;
        }

        public Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f68185a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e10) {
                q0.a("MappingedMethod", "invoke error:" + e10.getMessage());
                return null;
            }
        }

        public Method a() {
            return this.f68185a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.mbsignalcommon.mapping.a aVar) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
        throw aVar;
    }
}
