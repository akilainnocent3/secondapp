package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class hq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private a f2379;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<Field> f2380;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ho f2381;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2383;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ho f2384;

        private a() {
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void m2259(ho hoVar) {
            this.f2384 = hoVar;
            this.f2383 = hoVar.m2229();
        }

        public /* synthetic */ a(hq hqVar) {
            this();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final ho m2258() {
            return this.f2384;
        }

        /* JADX INFO: renamed from: ｋ */
        public boolean mo2257(Field field) {
            boolean zIsAssignableFrom;
            if (this.f2384 == null || (field.getModifiers() & this.f2384.m2245()) != this.f2384.m2245() || (field.getModifiers() & this.f2384.m2246()) != 0 || this.f2384.m2231().contains(field.getType())) {
                return false;
            }
            if (this.f2384.m2228()) {
                zIsAssignableFrom = field.getType().equals(this.f2384.m2230());
            } else {
                zIsAssignableFrom = this.f2384.m2230().isAssignableFrom(field.getType());
            }
            if (zIsAssignableFrom) {
                int i10 = this.f2383;
                if (i10 == 0) {
                    return true;
                }
                this.f2383 = i10 - 1;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m2248(Class cls, ho hoVar) {
        if (hoVar != null && hoVar.m2244()) {
            return m2250(cls, hoVar.m2244(), hoVar.m2247(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Field m2253(Class cls, final String str) {
        a aVar = new a(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hq.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hq.a
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final boolean mo2257(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (hq.class) {
            try {
                if (this.f2380 == null) {
                    this.f2380 = new ArrayList();
                }
                this.f2380.clear();
                m2252(cls, aVar, this.f2380);
                if (this.f2380.isEmpty()) {
                    return null;
                }
                return this.f2380.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Field m2254(Class cls, ho hoVar) {
        synchronized (jx.class) {
            try {
                if (this.f2380 == null) {
                    this.f2380 = new ArrayList();
                }
                this.f2380.clear();
                m2249(cls, hoVar, this.f2380);
                if (this.f2380.isEmpty()) {
                    return null;
                }
                return this.f2380.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> Field m2255(Class cls, Class<T> cls2) {
        Field fieldM2254;
        synchronized (jx.class) {
            try {
                if (this.f2381 == null) {
                    this.f2381 = new ho();
                }
                this.f2381.m2232(cls2);
                fieldM2254 = m2254(cls, this.f2381);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fieldM2254;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<Field> m2256(Class cls, ho hoVar) {
        ArrayList arrayList = new ArrayList();
        m2249(cls, hoVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static ho.a m2251() {
        return new ho.a();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2252(Class cls, a aVar, List<Field> list) {
        for (Field field : m2248(cls, aVar.m2258())) {
            if (aVar.mo2257(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m2250(Class cls, boolean z10, int i10, List<String> list) {
        while (cls != null && !kb.m2800(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM2802 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM2802 = kb.m2802(declaredFields, fields);
            if (!z10) {
                return fieldArrM2802;
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                try {
                    fieldArrM2802 = kb.m2802(fieldArrM2802, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM2802 = kb.m2802(fieldArrM2802, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM2802;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2249(Class cls, ho hoVar, List<Field> list) {
        synchronized (hq.class) {
            try {
                if (this.f2379 == null) {
                    this.f2379 = new a(this);
                }
                this.f2379.m2259(hoVar);
                m2252(cls, this.f2379, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
