package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class hs {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hs f2397;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dn f2398;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private hr f2399;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f2400;

        private a() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final boolean m2296(Method method) {
            if (this.f2399 == null || (method.getModifiers() & this.f2399.m2245()) != this.f2399.m2245() || (method.getModifiers() & this.f2399.m2246()) != 0 || this.f2399.m2271().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2399.m2266() != -1 && this.f2399.m2266() != parameterTypes.length) {
                return false;
            }
            List<Class> listM2267 = this.f2399.m2267();
            if (listM2267 != null) {
                if (listM2267.size() != parameterTypes.length) {
                    return false;
                }
                for (int i10 = 0; i10 < listM2267.size(); i10++) {
                    if (!listM2267.get(i10).equals(parameterTypes[i10])) {
                        return false;
                    }
                }
            }
            if (this.f2399.m2270() != null ? this.f2399.m2268() ? method.getReturnType().equals(this.f2399.m2270()) : this.f2399.m2270().isAssignableFrom(method.getReturnType()) : true) {
                int i11 = this.f2400;
                if (i11 == 0) {
                    return true;
                }
                this.f2400 = i11 - 1;
            }
            return false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m2297(hr hrVar) {
            this.f2399 = hrVar;
            this.f2400 = hrVar.m2269();
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final hr m2298() {
            return this.f2399;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public hs() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2286(Class cls, a aVar, List<Method> list) {
        hr hrVarM2298 = aVar.m2298();
        for (Method method : (hrVarM2298 == null || !hrVarM2298.m2244()) ? Arrays.asList(cls.getDeclaredMethods()) : m2289(cls, hrVarM2298.m2244(), hrVarM2298.m2247())) {
            if (aVar.m2296(method)) {
                list.add(method);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m2287(Class cls, hr hrVar) {
        ArrayList arrayList = new ArrayList();
        m2288(cls, hrVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2288(Class cls, hr hrVar, List<Method> list) {
        a aVar = new a((byte) 0);
        aVar.m2297(hrVar);
        m2286(cls, aVar, list);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Method> m2289(Class cls, boolean z10, int i10) {
        Method[] methodArrM2810 = new Method[0];
        if (cls != null) {
            methodArrM2810 = kb.m2810(cls.getDeclaredMethods(), cls.getMethods());
            if (!z10) {
                return Arrays.asList(methodArrM2810);
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                methodArrM2810 = kb.m2810(kb.m2810(methodArrM2810, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM2810);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2293() {
        return this.f2398.m1976();
    }

    public hs(dn dnVar, hs hsVar) {
        this.f2398 = dnVar;
        this.f2397 = hsVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ds m2292(String str) {
        ds dsVar;
        hs hsVar = this;
        do {
            dsVar = hsVar.f2398.m1974().get(str);
            if (dsVar != null) {
                break;
            }
            hsVar = hsVar.f2397;
        } while (hsVar != null);
        return dsVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hs m2291() {
        return this.f2397;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method m2285(Class cls, hr hrVar) {
        ArrayList arrayList = new ArrayList();
        m2288(cls, hrVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m2295() {
        ArrayList arrayList = new ArrayList(this.f2398.m1977());
        hs hsVar = this.f2397;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m2295());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<Cdo> m2290() {
        ArrayList arrayList = new ArrayList(this.f2398.m1972());
        hs hsVar = this.f2397;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m2290());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final dl m2294(String str) {
        dl dlVar;
        hs hsVar = this;
        do {
            dlVar = hsVar.f2398.m1971().get(str);
            if (dlVar != null) {
                break;
            }
            hsVar = hsVar.f2397;
        } while (hsVar != null);
        return dlVar;
    }
}
