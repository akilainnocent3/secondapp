package com.sportybet.android.globalpay.pixBtg.deposit;

import com.sportybet.android.globalpay.pixBtg.antest.BrDepositHotButtonConversionData;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import defpackage.a910;
import defpackage.abk;
import defpackage.b910;
import defpackage.bag;
import defpackage.c0d;
import defpackage.c0e;
import defpackage.c910;
import defpackage.ch30;
import defpackage.d100;
import defpackage.ej5;
import defpackage.g1i;
import defpackage.g810;
import defpackage.g910;
import defpackage.guh0;
import defpackage.hpx;
import defpackage.hsn;
import defpackage.hwr;
import defpackage.i2i;
import defpackage.i9e;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.j8i0;
import defpackage.k5k;
import defpackage.k910;
import defpackage.kme;
import defpackage.ksn;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.lbk;
import defpackage.lw40;
import defpackage.ly4;
import defpackage.mgb0;
import defpackage.mgk;
import defpackage.mpe0;
import defpackage.o8i0;
import defpackage.pjd;
import defpackage.psm;
import defpackage.q7h;
import defpackage.qe10;
import defpackage.r810;
import defpackage.rdd0;
import defpackage.s0i;
import defpackage.shl;
import defpackage.ssw;
import defpackage.tje0;
import defpackage.u6h;
import defpackage.ud10;
import defpackage.uj50;
import defpackage.uy0;
import defpackage.v1b;
import defpackage.v4c;
import defpackage.v5b;
import defpackage.v75;
import defpackage.v7e;
import defpackage.w9e;
import defpackage.whn;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.x7e;
import defpackage.xe10;
import defpackage.xsm;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.yak;
import defpackage.yhn;
import defpackage.yqm;
import defpackage.z600;
import defpackage.z810;
import defpackage.zi50;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/globalpay/pixBtg/deposit/g;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g extends j8i0 {
    public final yak A;
    public final qe10.a B;
    public final uy0 C;
    public final k5k D;
    public final v7e E;
    public final c0e F;
    public final g810 G;
    public final yqm H;
    public final rdd0 I;
    public final v75 J;
    public final wwd0 K;
    public final ku90<com.sportybet.android.globalpay.pixBtg.deposit.c> L;
    public final mpe0 M;
    public final pjd N;
    public int O;
    public final wwd0 P;
    public boolean Q;
    public int R;
    public bag S;
    public final abk a;
    public final mgk b;
    public final d100 c;
    public final ch30 d;
    public final w9e e;
    public final psm f;
    public final xsm i;
    public final guh0 v;
    public final i9e w;
    public final mgb0 y;
    public final lbk z;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$emitSideEffectEvent$1", f = "PixBtgDepositViewModel.kt", l = {859}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.android.globalpay.pixBtg.deposit.c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.sportybet.android.globalpay.pixBtg.deposit.c cVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = cVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<com.sportybet.android.globalpay.pixBtg.deposit.c> ku90Var = g.this.L;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$launchIgnoringErrors$1", f = "PixBtgDepositViewModel.kt", l = {848}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<v1b<? super Unit>, Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super v1b<? super Unit>, ? extends Object> function1, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    Function1<v1b<? super Unit>, Object> function1 = this.b;
                    this.a = 1;
                    if (function1.invoke(this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (Exception e) {
                itf0.a.f(e, "Ignored error", new Object[0]);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$navigateToFacialRecognitionScreen$1", f = "PixBtgDepositViewModel.kt", l = {824}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public g a;
        public int b;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.d = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g.this.new c(this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            g gVar;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                g gVar2 = g.this;
                this.a = gVar2;
                this.b = 1;
                Object objX1 = gVar2.x1(this);
                if (objX1 == y5bVar) {
                    return y5bVar;
                }
                gVar = gVar2;
                obj = objX1;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = this.a;
                uj50.b(obj);
            }
            gVar.y1(new com.sportybet.android.globalpay.pixBtg.deposit.c.C0233c(new u6h(((whn) obj).b, this.d ? q7h.REGISTRATION : q7h.BANK_ACCOUNT)));
            return Unit.a;
        }
    }

    public g(abk abkVar, mgk mgkVar, d100 d100Var, ch30 ch30Var, w9e w9eVar, psm psmVar, guh0 guh0Var, i9e i9eVar, mgb0 mgb0Var, lbk lbkVar, yak yakVar, qe10.a aVar, uy0 uy0Var, k5k k5kVar, v7e v7eVar, c0e c0eVar, g810 g810Var, yqm yqmVar, rdd0 rdd0Var, v75 v75Var) {
        v4c v4cVar = v4c.a;
        d100Var.getClass();
        ch30Var.getClass();
        w9eVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uy0Var.getClass();
        v7eVar.getClass();
        c0eVar.getClass();
        g810Var.getClass();
        yqmVar.getClass();
        rdd0Var.getClass();
        this.a = abkVar;
        this.b = mgkVar;
        this.c = d100Var;
        this.d = ch30Var;
        this.e = w9eVar;
        this.f = psmVar;
        this.i = v4cVar;
        this.v = guh0Var;
        this.w = i9eVar;
        this.y = mgb0Var;
        this.z = lbkVar;
        this.A = yakVar;
        this.B = aVar;
        this.C = uy0Var;
        this.D = k5kVar;
        this.E = v7eVar;
        this.F = c0eVar;
        this.G = g810Var;
        this.H = yqmVar;
        this.I = rdd0Var;
        this.J = v75Var;
        this.K = xwd0.a(f.d.a);
        this.L = new ku90<>();
        this.M = hwr.b(new Function0() { // from class: t810
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                g gVar = this.a;
                qe10.a aVar2 = gVar.B;
                et7 et7VarD = o8i0.d(gVar);
                wwd0 wwd0Var = gVar.K;
                n910 n910Var = new n910(1, gVar, g.class, "emitSideEffectEvent", "emitSideEffectEvent(Lcom/sportybet/android/globalpay/pixBtg/deposit/PixBtgDepositSideEffect;)V", 0);
                aVar2.getClass();
                wwd0Var.getClass();
                ebk ebkVar = aVar2.a;
                us7.a aVar3 = aVar2.b;
                v4c v4cVar2 = v4c.a;
                return new qe10(et7VarD, wwd0Var, n910Var, ebkVar, aVar3);
            }
        });
        this.N = ej5.a(o8i0.d(this), null, new c910(this, null), 3);
        this.P = xwd0.a(yhn.a);
        this.R = 3;
        ssw<Boolean> sswVar = z600.a().f;
        sswVar.getClass();
        kzh.d(new g1i(i2i.a(sswVar), new z810(this, null)), o8i0.d(this));
        w9eVar.a = o8i0.d(this);
        ej5.c(o8i0.d(this), null, null, new g910(this, null), 3);
    }

    public final qe10 A1() {
        return (qe10) this.M.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final <T> T B1(Object obj) {
        wwd0 wwd0Var;
        Object value;
        Throwable thA = zi50.a(obj);
        if (thA != null) {
            itf0.a.f(thA, "Failed to load required data", new Object[0]);
            do {
                wwd0Var = this.K;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, thA instanceof ud10 ? f.a.a : f.b.a));
        }
        if (obj instanceof zi50.b) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C1(x7e x7eVar, BrDepositHotButtonConversionData brDepositHotButtonConversionData, x1b x1bVar) {
        b910 b910Var;
        if (x1bVar instanceof b910) {
            b910Var = (b910) x1bVar;
            int i = b910Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b910Var.c = i - Integer.MIN_VALUE;
            } else {
                b910Var = new b910(this, x1bVar);
            }
        } else {
            b910Var = new b910(this, x1bVar);
        }
        Object obj = b910Var.a;
        Object obj2 = y5b.a;
        int i2 = b910Var.c;
        int i3 = 1;
        if (i2 == 0) {
            uj50.b(obj);
            String strM = x7eVar.m();
            if (x7eVar instanceof x7e.d.c) {
                H1(new r810());
            } else if (!(x7eVar instanceof x7e.d.o)) {
                H1(new ly4(x7eVar, i3));
            } else if (strM == null || StringsKt.U(strM)) {
                H1(new hsn(1));
            } else {
                b910Var.c = 1;
                if (G1(strM, brDepositHotButtonConversionData, b910Var) == obj2) {
                    return obj2;
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        Object obj3 = ((zi50) obj).a;
        return Unit.a;
    }

    public final boolean D1(List list, boolean z) {
        shl shlVar;
        lw40 lw40Var;
        hpx hpxVar;
        f.c cVarZ1 = z1();
        return !(cVarZ1 == null || (shlVar = cVarZ1.c) == null || (lw40Var = shlVar.f) == null || (hpxVar = lw40Var.b) == null || !hpxVar.a) || (z && list.isEmpty());
    }

    public final void E1(Function1<? super v1b<? super Unit>, ? extends Object> function1) {
        ej5.c(o8i0.d(this), null, null, new b(function1, null), 3);
    }

    public final void F1(boolean z) {
        ej5.c(o8i0.d(this), null, null, new c(z, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G1(String str, BrDepositHotButtonConversionData brDepositHotButtonConversionData, x1b x1bVar) {
        k910 k910Var;
        Object obj;
        whn whnVar;
        BrDepositHotButtonConversionData brDepositHotButtonConversionData2;
        Throwable thA;
        if (x1bVar instanceof k910) {
            k910Var = (k910) x1bVar;
            int i = k910Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                k910Var.f = i - Integer.MIN_VALUE;
            } else {
                k910Var = new k910(this, x1bVar);
            }
        } else {
            k910Var = new k910(this, x1bVar);
        }
        Object objX1 = k910Var.d;
        Object obj2 = y5b.a;
        int i2 = k910Var.f;
        if (i2 == 0) {
            uj50.b(objX1);
            k910Var.a = str;
            k910Var.b = brDepositHotButtonConversionData;
            k910Var.f = 1;
            objX1 = x1(k910Var);
            if (objX1 != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            brDepositHotButtonConversionData = k910Var.b;
            str = k910Var.a;
            uj50.b(objX1);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            whnVar = k910Var.c;
            brDepositHotButtonConversionData = k910Var.b;
            uj50.b(objX1);
            obj = ((zi50) objX1).a;
        }
        brDepositHotButtonConversionData2 = brDepositHotButtonConversionData;
        thA = zi50.a(obj);
        if (thA != null) {
            itf0.a.f(thA, "Failed to get PIX QR code", new Object[0]);
            H1(new ksn(1));
        }
        if (!(obj instanceof zi50.b)) {
            xe10 xe10Var = (xe10) obj;
            y1(new com.sportybet.android.globalpay.pixBtg.deposit.c.e(xe10Var.a, xe10Var.b, xe10Var.c, whnVar.b, brDepositHotButtonConversionData2));
        }
        return obj;
        whn whnVar2 = (whn) objX1;
        k910Var.a = null;
        k910Var.b = brDepositHotButtonConversionData;
        k910Var.c = whnVar2;
        k910Var.f = 2;
        Object objA = this.z.a(str, k910Var);
        if (objA != obj2) {
            obj = objA;
            whnVar = whnVar2;
            brDepositHotButtonConversionData2 = brDepositHotButtonConversionData;
            thA = zi50.a(obj);
            if (thA != null) {
                itf0.a.f(thA, "Failed to get PIX QR code", new Object[0]);
                H1(new ksn(1));
            }
            if (!(obj instanceof zi50.b)) {
                xe10 xe10Var2 = (xe10) obj;
                y1(new com.sportybet.android.globalpay.pixBtg.deposit.c.e(xe10Var2.a, xe10Var2.b, xe10Var2.c, whnVar.b, brDepositHotButtonConversionData2));
            }
            return obj;
        }
        return obj2;
    }

    public final void H1(final Function1<? super kme, kme> function1) {
        e.a(this.K, o8i0.d(this), new Function1() { // from class: v810
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kme kmeVar = (kme) obj;
                kmeVar.getClass();
                kme kmeVar2 = (kme) function1.invoke(kmeVar);
                this.G.a.e(Boolean.valueOf(kmeVar2.h), "pix_btg_should_complete_registration_with_facial_recognition");
                return kmeVar2;
            }
        });
    }

    public final void I1(Function1<? super f.c, f.c> function1) {
        e.b(this.K, o8i0.d(this), function1);
    }

    public final Object x1(x1b x1bVar) {
        return s0i.a(new a910(this.P), x1bVar);
    }

    public final void y1(com.sportybet.android.globalpay.pixBtg.deposit.c cVar) {
        ej5.c(o8i0.d(this), null, null, new a(cVar, null), 3);
    }

    public final f.c z1() {
        Object value = this.K.getValue();
        if (value instanceof f.c) {
            return (f.c) value;
        }
        return null;
    }
}
