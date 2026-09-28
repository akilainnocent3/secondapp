package com.sportybet.android.globalpay.pixBtg.withdraw;

import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import defpackage.abk;
import defpackage.ahk;
import defpackage.bmj0;
import defpackage.c0d;
import defpackage.c100;
import defpackage.dd10;
import defpackage.dzn;
import defpackage.ed10;
import defpackage.ej5;
import defpackage.et7;
import defpackage.fd10;
import defpackage.g010;
import defpackage.g1i;
import defpackage.i2i;
import defpackage.ib5;
import defpackage.iri;
import defpackage.itf0;
import defpackage.iym;
import defpackage.j8i0;
import defpackage.jme;
import defpackage.k5k;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.mgk;
import defpackage.o8i0;
import defpackage.p610;
import defpackage.psm;
import defpackage.q7h;
import defpackage.q8d0;
import defpackage.rd10;
import defpackage.s0i;
import defpackage.sc10;
import defpackage.shl;
import defpackage.ssw;
import defpackage.tc10;
import defpackage.tje0;
import defpackage.u6h;
import defpackage.ud10;
import defpackage.uj50;
import defpackage.uy0;
import defpackage.v1b;
import defpackage.v4c;
import defpackage.v5b;
import defpackage.vhn;
import defpackage.w9e;
import defpackage.wwd0;
import defpackage.xhn;
import defpackage.xsm;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.yak;
import defpackage.z600;
import defpackage.zc10;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/globalpay/pixBtg/withdraw/h;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h extends j8i0 {
    public final bmj0 A;
    public final iym B;
    public final sc10 C;
    public final wwd0 D;
    public final ku90<d> E;
    public c100 F;
    public final wwd0 G;
    public boolean H;
    public Double I;
    public p610 J;
    public final psm a;
    public final abk b;
    public final k5k c;
    public final mgk d;
    public final yak e;
    public final xsm f;
    public final w9e i;
    public final ahk v;
    public final uy0 w;
    public final g010 y;
    public final q8d0 z;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$emitSideEffectEvent$1", f = "PixBtgWithdrawViewModel.kt", l = {686}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = dVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return h.this.new a(this.c, v1bVar);
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
                ku90<d> ku90Var = h.this.E;
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

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$navigateToFacialRecognitionScreen$1", f = "PixBtgWithdrawViewModel.kt", l = {564}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return h.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            h hVar = h.this;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                obj = s0i.a(new ed10(hVar.G), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            hVar.x1(new d.C0240d(new u6h(((vhn) obj).b, q7h.WITHDRAW)));
            return Unit.a;
        }
    }

    public h(psm psmVar, abk abkVar, k5k k5kVar, mgk mgkVar, yak yakVar, w9e w9eVar, ahk ahkVar, uy0 uy0Var, g010 g010Var, bmj0 bmj0Var, iym iymVar, sc10 sc10Var) {
        v4c v4cVar = v4c.a;
        psmVar.getClass();
        w9eVar.getClass();
        uy0Var.getClass();
        bmj0Var.getClass();
        iymVar.getClass();
        sc10Var.getClass();
        this.a = psmVar;
        this.b = abkVar;
        this.c = k5kVar;
        this.d = mgkVar;
        this.e = yakVar;
        this.f = v4cVar;
        this.i = w9eVar;
        this.v = ahkVar;
        this.w = uy0Var;
        this.y = g010Var;
        this.z = q8d0.a;
        this.A = bmj0Var;
        this.B = iymVar;
        this.C = sc10Var;
        this.D = xwd0.a(e.d.a);
        this.E = new ku90<>();
        this.F = c100.e;
        this.G = xwd0.a(xhn.a);
        ssw<Boolean> sswVar = z600.a().f;
        sswVar.getClass();
        kzh.d(new g1i(i2i.a(sswVar), new dd10(this, null)), o8i0.d(this));
        w9eVar.a = o8i0.d(this);
        ej5.c(o8i0.d(this), null, null, new i(this, null), 3);
    }

    public final void A1(Throwable th) {
        wwd0 wwd0Var;
        Object value;
        itf0.a.f(th, "Failed to load required data", new Object[0]);
        do {
            wwd0Var = this.D;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, th instanceof ud10 ? e.a.a : e.b.a));
    }

    public final void B1() {
        x1(d.a.a);
        y1(new rd10(this, null));
        ej5.c(o8i0.d(this), null, null, new l(this, null), 3);
    }

    public final void C1(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((p610) next).a, str));
        p610 p610Var = (p610) next;
        this.J = p610Var;
        this.C.a.e(p610Var != null ? p610Var.a : null, "pix_btg_withdraw_selected_bank_account_id");
        E1(new dzn(str, 1));
        g.a(this.D, o8i0.d(this), new iri(this, 1));
    }

    public final void D1(Function1<? super jme, jme> function1) {
        et7 et7VarD = o8i0.d(this);
        wwd0 wwd0Var = this.D;
        wwd0Var.getClass();
        g.a(wwd0Var, et7VarD, new tc10(function1, 0));
    }

    public final void E1(final Function1<? super shl, shl> function1) {
        et7 et7VarD = o8i0.d(this);
        wwd0 wwd0Var = this.D;
        wwd0Var.getClass();
        g.a(wwd0Var, et7VarD, new Function1() { // from class: uc10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                e.c cVar = (e.c) obj;
                cVar.getClass();
                return e.c.a(cVar, null, 0.0d, (shl) function1.invoke(cVar.c), null, null, null, 59);
            }
        });
    }

    public final void x1(d dVar) {
        ej5.c(o8i0.d(this), null, null, new a(dVar, null), 3);
    }

    public final void y1(Function1<? super v1b<? super Unit>, ? extends Object> function1) {
        ej5.c(o8i0.d(this), null, null, new fd10(function1, null), 3);
    }

    public final void z1() {
        D1(new zc10());
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }
}
