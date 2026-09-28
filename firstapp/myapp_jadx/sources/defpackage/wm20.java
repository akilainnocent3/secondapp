package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class wm20<T> {
    public final String a;
    public final dq7 b;
    public final dn20 c;
    public final boolean d;

    public static final class a implements lyh<T> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ wm20 b;

        /* JADX INFO: renamed from: wm20$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.core.datastore.Preference$flow$$inlined$map$1", f = "PreferenceDataStoreExt.kt", l = {109}, m = "collect", v = 2)
        public static final class C1250a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1250a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ wm20 b;

            /* JADX INFO: renamed from: wm20$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.core.datastore.Preference$flow$$inlined$map$1$2", f = "PreferenceDataStoreExt.kt", l = {50}, m = "emit", v = 2)
            public static final class C1251a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1251a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, wm20 wm20Var) {
                this.a = myhVar;
                this.b = wm20Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1251a c1251a;
                if (v1bVar instanceof C1251a) {
                    c1251a = (C1251a) v1bVar;
                    int i = c1251a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1251a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1251a = new C1251a(v1bVar);
                    }
                } else {
                    c1251a = new C1251a(v1bVar);
                }
                Object obj2 = c1251a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1251a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Enum enumB = this.b.b((String) obj);
                    enumB.getClass();
                    c1251a.b = 1;
                    if (this.a.emit(enumB, c1251a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(lyh lyhVar, wm20 wm20Var) {
            this.a = lyhVar;
            this.b = wm20Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh myhVar, v1b v1bVar) {
            C1250a c1250a;
            if (v1bVar instanceof C1250a) {
                c1250a = (C1250a) v1bVar;
                int i = c1250a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1250a.b = i - Integer.MIN_VALUE;
                } else {
                    c1250a = new C1250a(v1bVar);
                }
            } else {
                c1250a = new C1250a(v1bVar);
            }
            Object obj = c1250a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1250a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c1250a.b = 1;
                if (this.a.collect(bVar, c1250a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<T> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ wm20 b;

        @c0d(c = "com.sportybet.core.datastore.Preference$flow$$inlined$map$2", f = "PreferenceDataStoreExt.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: wm20$b$b, reason: collision with other inner class name */
        public static final class C1252b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ wm20 b;

            /* JADX INFO: renamed from: wm20$b$b$a */
            @c0d(c = "com.sportybet.core.datastore.Preference$flow$$inlined$map$2$2", f = "PreferenceDataStoreExt.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1252b.this.emit(null, this);
                }
            }

            public C1252b(myh myhVar, wm20 wm20Var) {
                this.a = myhVar;
                this.b = wm20Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Enum enumB = this.b.b((String) obj);
                    aVar.b = 1;
                    if (this.a.emit(enumB, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(lyh lyhVar, wm20 wm20Var) {
            this.a = lyhVar;
            this.b = wm20Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                C1252b c1252b = new C1252b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(c1252b, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.core.datastore.Preference", f = "PreferenceDataStoreExt.kt", l = {47, 51, 52, 53, 54, 55, 56}, m = "get", v = 2)
    public static final class c extends x1b {
        public /* synthetic */ Object a;
        public final /* synthetic */ wm20<Object> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wm20<Object> wm20Var, v1b<? super c> v1bVar) {
            super(v1bVar);
            this.b = wm20Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.e(this, null);
        }
    }

    public wm20(String str, dq7 dq7Var, dn20 dn20Var) {
        str.getClass();
        dn20Var.getClass();
        this.a = str;
        this.b = dq7Var;
        this.c = dn20Var;
        this.d = tgp.b(dq7Var).isEnum();
    }

    public final Object a(x1b x1bVar) {
        boolean z = this.d;
        String str = this.a;
        dn20 dn20Var = this.c;
        if (z) {
            return dn20Var.clearPreference(co20.f(str), x1bVar);
        }
        dq7 dq7VarA = jq40.a(String.class);
        dq7 dq7Var = this.b;
        if (dq7Var.equals(dq7VarA)) {
            return dn20Var.clearPreference(co20.f(str), x1bVar);
        }
        if (dq7Var.equals(jq40.a(Integer.TYPE))) {
            return dn20Var.clearPreference(co20.d(str), x1bVar);
        }
        if (dq7Var.equals(jq40.a(Long.TYPE))) {
            return dn20Var.clearPreference(co20.e(str), x1bVar);
        }
        if (dq7Var.equals(jq40.a(Boolean.TYPE))) {
            return dn20Var.clearPreference(co20.a(str), x1bVar);
        }
        if (dq7Var.equals(jq40.a(Float.TYPE))) {
            return dn20Var.clearPreference(co20.c(str), x1bVar);
        }
        if (dq7Var.equals(jq40.a(Double.TYPE))) {
            return dn20Var.clearPreference(co20.b(str), x1bVar);
        }
        z9l.a(dq7Var, "Unsupported type: ");
        return null;
    }

    public final Enum b(String str) {
        if (str == null) {
            return null;
        }
        Enum enumValueOf = Enum.valueOf(tgp.b(this.b), str);
        enumValueOf.getClass();
        return enumValueOf;
    }

    public final lyh<T> c() {
        boolean z = this.d;
        String str = this.a;
        dn20 dn20Var = this.c;
        if (z) {
            return new b(dn20Var.getStringByFlow(str), this);
        }
        dq7 dq7VarA = jq40.a(String.class);
        dq7 dq7Var = this.b;
        if (dq7Var.equals(dq7VarA)) {
            lyh<T> lyhVar = (lyh<T>) dn20Var.getStringByFlow(str);
            lyhVar.getClass();
            return lyhVar;
        }
        if (dq7Var.equals(jq40.a(Integer.TYPE))) {
            lyh<T> lyhVar2 = (lyh<T>) dn20Var.getIntFlow(str);
            lyhVar2.getClass();
            return lyhVar2;
        }
        if (dq7Var.equals(jq40.a(Long.TYPE))) {
            lyh<T> lyhVar3 = (lyh<T>) dn20Var.getLongByFlow(str);
            lyhVar3.getClass();
            return lyhVar3;
        }
        if (dq7Var.equals(jq40.a(Boolean.TYPE))) {
            lyh<T> lyhVar4 = (lyh<T>) dn20Var.getBooleanByFlow(str);
            lyhVar4.getClass();
            return lyhVar4;
        }
        if (dq7Var.equals(jq40.a(Float.TYPE))) {
            lyh<T> lyhVar5 = (lyh<T>) dn20Var.getFloatByFlow(str);
            lyhVar5.getClass();
            return lyhVar5;
        }
        if (!dq7Var.equals(jq40.a(Double.TYPE))) {
            z9l.a(dq7Var, "Unsupported type: ");
            return null;
        }
        lyh<T> lyhVar6 = (lyh<T>) dn20Var.getDoubleByFlow(str);
        lyhVar6.getClass();
        return lyhVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lyh<T> d(T t) {
        t.getClass();
        boolean z = this.d;
        String str = this.a;
        dn20 dn20Var = this.c;
        if (z) {
            return new a(dn20Var.getStringByFlow(str, ((Enum) t).name()), this);
        }
        dq7 dq7VarA = jq40.a(String.class);
        dq7 dq7Var = this.b;
        if (dq7Var.equals(dq7VarA)) {
            lyh<T> lyhVar = (lyh<T>) dn20Var.getStringByFlow(str, (String) t);
            lyhVar.getClass();
            return lyhVar;
        }
        if (dq7Var.equals(jq40.a(Integer.TYPE))) {
            lyh<T> lyhVar2 = (lyh<T>) dn20Var.getIntFlow(str, ((Integer) t).intValue());
            lyhVar2.getClass();
            return lyhVar2;
        }
        if (dq7Var.equals(jq40.a(Long.TYPE))) {
            lyh<T> lyhVar3 = (lyh<T>) dn20Var.getLongByFlow(str, ((Long) t).longValue());
            lyhVar3.getClass();
            return lyhVar3;
        }
        if (dq7Var.equals(jq40.a(Boolean.TYPE))) {
            lyh<T> lyhVar4 = (lyh<T>) dn20Var.getBooleanByFlow(str, ((Boolean) t).booleanValue());
            lyhVar4.getClass();
            return lyhVar4;
        }
        if (dq7Var.equals(jq40.a(Float.TYPE))) {
            lyh<T> lyhVar5 = (lyh<T>) dn20Var.getFloatByFlow(str, ((Float) t).floatValue());
            lyhVar5.getClass();
            return lyhVar5;
        }
        if (!dq7Var.equals(jq40.a(Double.TYPE))) {
            z9l.a(dq7Var, "Unsupported type: ");
            return null;
        }
        lyh<T> lyhVar6 = (lyh<T>) dn20Var.getDoubleByFlow(str, ((Double) t).doubleValue());
        lyhVar6.getClass();
        return lyhVar6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r6 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r6 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r6 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        if (r6 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        if (r6 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011a, code lost:
    
        if (r6 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        if (r6 == r1) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.v1b r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm20.e(v1b, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r6 == r1) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.x1b r6) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm20.f(x1b):java.lang.Object");
    }

    public final Object g(v1b v1bVar, Object obj) {
        boolean z = this.d;
        String str = this.a;
        dn20 dn20Var = this.c;
        if (z) {
            obj.getClass();
            return dn20Var.putString(str, ((Enum) obj).name(), v1bVar);
        }
        if (obj instanceof String) {
            return dn20Var.putString(str, (String) obj, v1bVar);
        }
        if (obj instanceof Integer) {
            return dn20Var.putInt(str, (Integer) obj, v1bVar);
        }
        if (obj instanceof Long) {
            return dn20Var.putLong(str, (Long) obj, v1bVar);
        }
        if (obj instanceof Boolean) {
            return dn20Var.putBoolean(str, (Boolean) obj, v1bVar);
        }
        if (obj instanceof Float) {
            return dn20Var.putFloat(str, (Float) obj, v1bVar);
        }
        if (obj instanceof Double) {
            return dn20Var.putDouble(str, (Double) obj, v1bVar);
        }
        hoc.a(jq40.a(obj.getClass()), "Unsupported type: ");
        return null;
    }
}
