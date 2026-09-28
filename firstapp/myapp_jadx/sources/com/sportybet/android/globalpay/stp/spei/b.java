package com.sportybet.android.globalpay.stp.spei;

import com.sporty.android.core.model.pocket.common.ClabeResponse;
import defpackage.bag;
import defpackage.c0d;
import defpackage.ca90;
import defpackage.d9k;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.esd;
import defpackage.i9e;
import defpackage.ib5;
import defpackage.j8i0;
import defpackage.k4k;
import defpackage.k5k;
import defpackage.ku90;
import defpackage.lak;
import defpackage.o8i0;
import defpackage.pjd;
import defpackage.qnd;
import defpackage.sb00;
import defpackage.sva0;
import defpackage.t3g;
import defpackage.tje0;
import defpackage.tva0;
import defpackage.uj50;
import defpackage.uva0;
import defpackage.uy0;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v4c;
import defpackage.v5b;
import defpackage.v7e;
import defpackage.v800;
import defpackage.vu60;
import defpackage.vva0;
import defpackage.w9e;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.xsm;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.z600;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/globalpay/stp/spei/b;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b extends j8i0 {
    public final v340 A;
    public final v340 B;
    public final wwd0 C;
    public final v340 D;
    public final wwd0 E;
    public final v340 F;
    public final ku90<com.sportybet.android.globalpay.stp.spei.a> G;
    public final ku90 H;
    public final ku90<ca90> I;
    public final ku90 J;
    public final int K;
    public String L;
    public lak.b M;
    public pjd N;
    public bag O;
    public final d9k a;
    public final xsm b;
    public final uy0 c;
    public final k5k d;
    public final k4k e;
    public final i9e f;
    public final lak i;
    public final v7e v;
    public final wwd0 w;
    public final v340 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel$emitSideEffect$1", f = "SpeiByStpDepositViewModel.kt", l = {309}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.android.globalpay.stp.spei.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.sportybet.android.globalpay.stp.spei.a aVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return b.this.new a(this.c, v1bVar);
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
                ku90<com.sportybet.android.globalpay.stp.spei.a> ku90Var = b.this.G;
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

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.stp.spei.b$b, reason: collision with other inner class name */
    @c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel$makeDepositWithEnteredAmount$2", f = "SpeiByStpDepositViewModel.kt", l = {264, 265, 270, 286}, m = "invokeSuspend", v = 2)
    public static final class C0250b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;

        /* JADX INFO: renamed from: com.sportybet.android.globalpay.stp.spei.b$b$a */
        @c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel$makeDepositWithEnteredAmount$2$depositResult$1", f = "SpeiByStpDepositViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<qnd, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = bVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qnd qndVar, v1b<? super Unit> v1bVar) {
                return ((a) create(qndVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                qnd qndVar = (qnd) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                b bVar = this.b;
                bVar.v.a(bVar.K, bVar.O, qndVar, t3g.a);
                return Unit.a;
            }
        }

        public C0250b(v1b<? super C0250b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            C0250b c0250b = b.this.new C0250b(v1bVar);
            c0250b.c = obj;
            return c0250b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C0250b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00af  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        
            if (r1.a.emit(r14, r13) == r3) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        
            if (r1.a.emit(r14, r13) == r3) goto L43;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.globalpay.stp.spei.b.C0250b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel$onDepositClicked$2", f = "SpeiByStpDepositViewModel.kt", l = {132, 133, 153}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public b a;
        public int b;
        public /* synthetic */ Object c;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = b.this.new c(v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        
            if (r1.a.emit(r3, r16) == r2) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
        
            if (r1.a.emit(r4, r16) == r2) goto L45;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.globalpay.stp.spei.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(w9e w9eVar, vu60 vu60Var, d9k d9kVar, uy0 uy0Var, k5k k5kVar, k4k k4kVar, i9e i9eVar, lak lakVar, v7e v7eVar, v800 v800Var) {
        v4c v4cVar = v4c.a;
        w9eVar.getClass();
        vu60Var.getClass();
        uy0Var.getClass();
        v7eVar.getClass();
        v800Var.getClass();
        this.a = d9kVar;
        this.b = v4cVar;
        this.c = uy0Var;
        this.d = k5kVar;
        this.e = k4kVar;
        this.f = i9eVar;
        this.i = lakVar;
        this.v = v7eVar;
        wwd0 wwd0VarA = xwd0.a(1);
        this.w = wwd0VarA;
        this.y = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.z = wwd0VarA2;
        this.A = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a("");
        this.B = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(new esd(false));
        this.C = wwd0VarA4;
        this.D = e1i.b(wwd0VarA4);
        wwd0 wwd0VarA5 = xwd0.a(new sb00(0));
        this.E = wwd0VarA5;
        this.F = e1i.b(wwd0VarA5);
        ku90<com.sportybet.android.globalpay.stp.spei.a> ku90Var = new ku90<>();
        this.G = ku90Var;
        this.H = ku90Var;
        ku90<ca90> ku90Var2 = new ku90<>();
        this.I = ku90Var2;
        this.J = ku90Var2;
        this.L = "";
        this.N = ej5.a(o8i0.d(this), null, new sva0(this, null), 3);
        w9eVar.a = o8i0.d(this);
        Integer num = (Integer) vu60Var.b("SPEI_BY_STP_CHANNEL_ID");
        if (num == null) {
            x1(com.sportybet.android.globalpay.stp.spei.a.e.a);
            return;
        }
        this.K = num.intValue();
        ej5.c(o8i0.d(this), null, null, new vva0(this, null), 3);
        wwd0VarA3.k(null, v4cVar.e(z600.a().c.a));
    }

    public final void A1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.C;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, esd.a((esd) value, true)));
        ej5.c(o8i0.d(this), null, null, new C0250b(null), 3);
    }

    public final void B1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.C;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, esd.a((esd) value, true)));
        ej5.c(o8i0.d(this), null, null, new c(null), 3);
    }

    public final void x1(com.sportybet.android.globalpay.stp.spei.a aVar) {
        ej5.c(o8i0.d(this), null, null, new a(aVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(v5b v5bVar, x1b x1bVar) throws Throwable {
        tva0 tva0Var;
        if (x1bVar instanceof tva0) {
            tva0Var = (tva0) x1bVar;
            int i = tva0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tva0Var.d = i - Integer.MIN_VALUE;
            } else {
                tva0Var = new tva0(this, x1bVar);
            }
        } else {
            tva0Var = new tva0(this, x1bVar);
        }
        Object objQ = tva0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = tva0Var.d;
        if (i2 == 0) {
            uj50.b(objQ);
            pjd pjdVar = this.N;
            tva0Var.a = v5bVar;
            tva0Var.d = 1;
            objQ = pjdVar.q(tva0Var);
            if (objQ != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objQ);
                return objQ;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        v5bVar = tva0Var.a;
        uj50.b(objQ);
        if (((ClabeResponse) objQ) == null) {
            this.N = ej5.a(v5bVar, null, new uva0(this, null), 3);
        }
        pjd pjdVar2 = this.N;
        tva0Var.a = null;
        tva0Var.d = 2;
        Object objQ2 = pjdVar2.q(tva0Var);
        return objQ2 == y5bVar ? y5bVar : objQ2;
    }

    public final boolean z1() {
        lak.b bVar = this.M;
        return bVar != null && bVar.a.size() >= bVar.b;
    }
}
