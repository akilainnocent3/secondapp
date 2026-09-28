package defpackage;

import com.sportybet.android.social.data.remote.entity.AliasCode;
import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import com.sportybet.android.social.domain.CustomCodes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbdc;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bdc extends c82 {
    public jdc A;
    public final v340 B;
    public final wwd0 C;
    public final v340 D;
    public final wwd0 E;
    public final v340 F;
    public final wwd0 G;
    public final v340 H;
    public final wuw<h8c> I;
    public final vu60 d;
    public final x2b e;
    public final x4k f;
    public final sbc i;
    public final psm v;
    public final v340 w;
    public final wwd0 y;
    public final v340 z;

    public static final class a implements lyh<jdc> {
        public final /* synthetic */ o0i a;
        public final /* synthetic */ bdc b;

        /* JADX INFO: renamed from: bdc$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$loadCustomCodeList$$inlined$map$1", f = "CustomCodeViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0121a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0121a(v1b v1bVar) {
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
            public final /* synthetic */ bdc b;

            /* JADX INFO: renamed from: bdc$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$loadCustomCodeList$$inlined$map$1$2", f = "CustomCodeViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0122a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0122a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, bdc bdcVar) {
                this.a = myhVar;
                this.b = bdcVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0122a c0122a;
                jdc cVar;
                jdc aVar;
                bdc bdcVar = this.b;
                psm psmVar = bdcVar.v;
                if (v1bVar instanceof C0122a) {
                    c0122a = (C0122a) v1bVar;
                    int i = c0122a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0122a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0122a = new C0122a(v1bVar);
                    }
                } else {
                    c0122a = new C0122a(v1bVar);
                }
                Object obj2 = c0122a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0122a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        x8c x8cVar = (x8c) ((lk50.c) lk50Var).a;
                        AliasCodeList aliasCodeList = x8cVar.a;
                        j8c j8cVar = x8cVar.b;
                        boolean z = j8cVar.b;
                        int i3 = j8cVar.c;
                        String str = x8cVar.c;
                        boolean z2 = x8cVar.d;
                        ((CustomCodes) bdcVar.w.a.getValue()).getClass();
                        str.getClass();
                        bdcVar.d.e(new CustomCodes(str), "arg_custom_codes_data");
                        if (aliasCodeList.getCode().isEmpty()) {
                            cVar = new jdc.b(new hdc(m2g.a, false, j8cVar.c, j8cVar.b, false), z2);
                        } else {
                            List<AliasCode> code = aliasCodeList.getCode();
                            if (code != null && code.isEmpty()) {
                                aVar = new jdc.d(k9c.b(aliasCodeList, psmVar.getCountryCode(), i3, z), z2);
                                break;
                            }
                            Iterator<T> it = code.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    aVar = new jdc.d(k9c.b(aliasCodeList, psmVar.getCountryCode(), i3, z), z2);
                                    break;
                                }
                                if (((AliasCode) it.next()).isShareCodeValid()) {
                                    aVar = new jdc.a(k9c.b(aliasCodeList, psmVar.getCountryCode(), i3, z), z2);
                                    break;
                                }
                            }
                            cVar = aVar;
                        }
                    } else if (lk50Var instanceof lk50.a) {
                        lk50.a aVar2 = (lk50.a) lk50Var;
                        cVar = new jdc.c(aVar2.a, aVar2.b);
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        cVar = jdc.e.a;
                    }
                    c0122a.b = 1;
                    if (this.a.emit(cVar, c0122a) == y5bVar) {
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

        public a(o0i o0iVar, bdc bdcVar) {
            this.a = o0iVar;
            this.b = bdcVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super jdc> myhVar, v1b v1bVar) {
            C0121a c0121a;
            if (v1bVar instanceof C0121a) {
                c0121a = (C0121a) v1bVar;
                int i = c0121a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0121a.b = i - Integer.MIN_VALUE;
                } else {
                    c0121a = new C0121a(v1bVar);
                }
            } else {
                c0121a = new C0121a(v1bVar);
            }
            Object obj = c0121a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0121a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0121a.b = 1;
                if (this.a.collect(bVar, c0121a) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$loadCustomCodeList$2", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<jdc, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = bdc.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jdc jdcVar, v1b<? super Unit> v1bVar) {
            return ((b) create(jdcVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jdc jdcVar = (jdc) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bdc bdcVar = bdc.this;
            wwd0 wwd0Var = bdcVar.y;
            bdcVar.A = (jdc) wwd0Var.getValue();
            wwd0Var.setValue(jdcVar);
            return Unit.a;
        }
    }

    public static final class c implements lyh<k7c> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ bdc b;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$special$$inlined$map$1", f = "CustomCodeViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ bdc b;

            @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$special$$inlined$map$1$2", f = "CustomCodeViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, bdc bdcVar) {
                this.a = myhVar;
                this.b = bdcVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                k7c k7cVar;
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
                    jdc jdcVar = (jdc) obj;
                    jdcVar.getClass();
                    if ((jdcVar instanceof jdc.b) || (jdcVar instanceof jdc.d) || (jdcVar instanceof jdc.a)) {
                        k7cVar = i8c.b(jdcVar) ? k7c.a : k7c.b;
                    } else {
                        bdc bdcVar = this.b;
                        jdc jdcVar2 = bdcVar.A;
                        jdcVar2.getClass();
                        if ((jdcVar2 instanceof jdc.b) || (jdcVar2 instanceof jdc.d) || (jdcVar2 instanceof jdc.a)) {
                            k7cVar = i8c.b(bdcVar.A) ? k7c.a : k7c.b;
                        } else {
                            k7cVar = k7c.c;
                        }
                    }
                    aVar.b = 1;
                    if (this.a.emit(k7cVar, aVar) == y5bVar) {
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

        public c(wwd0 wwd0Var, bdc bdcVar) {
            this.a = wwd0Var;
            this.b = bdcVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super k7c> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$viewState$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super jdc>, v1b<? super Unit>, Object> {
        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return bdc.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super jdc> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bdc.this.y1(false);
            return Unit.a;
        }
    }

    public bdc(vu60 vu60Var, x2b x2bVar, x4k x4kVar, sbc sbcVar, psm psmVar) {
        vu60Var.getClass();
        psmVar.getClass();
        this.d = vu60Var;
        this.e = x2bVar;
        this.f = x4kVar;
        this.i = sbcVar;
        this.v = psmVar;
        CustomCodes.INSTANCE.getClass();
        this.w = vu60Var.d(CustomCodes.c, "arg_custom_codes_data");
        jdc.e eVar = jdc.e.a;
        wwd0 wwd0VarA = xwd0.a(eVar);
        this.y = wwd0VarA;
        this.z = e1i.e(new xzh(wwd0VarA, new d(null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), eVar);
        this.A = (jdc) wwd0VarA.getValue();
        this.B = e1i.e(new c(wwd0VarA, this), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), k7c.c);
        wwd0 wwd0VarA2 = xwd0.a(l7c.a.a);
        this.C = wwd0VarA2;
        this.D = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(f8c.a.a);
        this.E = wwd0VarA3;
        this.F = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(fac.a.a);
        this.G = wwd0VarA4;
        this.H = e1i.b(wwd0VarA4);
        this.I = new wuw<>();
    }

    public static String x1(String str, String str2, List list) {
        Object bVar;
        int size = list.size();
        String strValueOf = size > 0 ? String.valueOf(size) : "";
        String strA = i8c.a(strValueOf, str, str2);
        loop0: while (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.g(((gdc) it.next()).b, strA)) {
                    if (strValueOf.length() > 0) {
                        try {
                            zi50.a aVar = zi50.b;
                            strValueOf = String.valueOf(Integer.parseInt(strValueOf) + 1);
                            strA = i8c.a(strValueOf, str, str2);
                            bVar = Unit.a;
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        if (zi50.a(bVar) != null) {
                            strA = i8c.a("", str, str2);
                            strValueOf = "";
                        }
                    } else {
                        strValueOf = "1";
                        strA = i8c.a("1", str, str2);
                    }
                }
            }
        }
        return strValueOf;
    }

    public final void y1(boolean z) {
        sbc sbcVar = this.i;
        kzh.d(new g1i(new a(r0i.a(new s78(r0i.a(sbcVar.c.b(), new zbc(sbcVar, null)), new s78(ozh.c(bm50.a(new dzh(new xbc(sbcVar, null))), sbcVar.h), bm50.b(sbcVar.b.g(), vch0.b), new tbc(3, null)), new ubc(3, null)), new wbc(sbcVar, z, null)), this), new b(null)), o8i0.d(this));
    }
}
