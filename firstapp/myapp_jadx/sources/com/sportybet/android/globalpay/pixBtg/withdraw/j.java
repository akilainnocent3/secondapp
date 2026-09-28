package com.sportybet.android.globalpay.pixBtg.withdraw;

import defpackage.bmj0;
import defpackage.c0d;
import defpackage.ed10;
import defpackage.hsi;
import defpackage.ib5;
import defpackage.jd10;
import defpackage.jsi;
import defpackage.kd10;
import defpackage.ld10;
import defpackage.msj0;
import defpackage.p610;
import defpackage.s0i;
import defpackage.sc10;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vhn;
import defpackage.xoj0;
import defpackage.xsm;
import defpackage.y5b;
import defpackage.zc10;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$makeWithdrawal$1", f = "PixBtgWithdrawViewModel.kt", l = {584, 589}, m = "invokeSuspend", v = 2)
public final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public p610 a;
    public int b;
    public final /* synthetic */ h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, v1b<? super j> v1bVar) {
        super(2, v1bVar);
        this.c = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object obj2;
        p610 p610Var;
        final xoj0 xoj0Var;
        String str;
        h hVar = this.c;
        sc10 sc10Var = hVar.C;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.b = 1;
            objA = s0i.a(new ed10(hVar.G), this);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
            objA = obj;
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p610Var = this.a;
            uj50.b(obj);
            obj2 = ((zi50) obj).a;
        }
        if (zi50.a(obj2) != null) {
            hVar.D1(new kd10());
            hVar.D1(new ld10());
        }
        if (!(obj2 instanceof zi50.b)) {
            xoj0Var = (xoj0) obj2;
            hVar.D1(new hsi(1));
            if (xoj0Var instanceof xoj0.d.h) {
                hVar.D1(new jsi(1));
            } else if (xoj0Var instanceof xoj0.d.j) {
                xsm xsmVar = hVar.f;
                str = (String) sc10Var.a.b("pix_btg_withdraw_current_amount");
                if (str == null) {
                    str = "";
                }
                String strB = xsmVar.b(str, false);
                String str2 = ((xoj0.d.j) xoj0Var).c;
                hVar.x1(new d.i(strB, str2 != null ? str2 : "", p610Var.g));
            } else if (xoj0Var instanceof xoj0.d.v) {
                final xoj0.d.v vVar = (xoj0.d.v) xoj0Var;
                hVar.D1(new Function1() { // from class: md10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return jme.a((jme) obj3, false, null, false, false, false, null, new gmj0(vVar.a, hmj0.a), 63);
                    }
                });
            } else if (xoj0Var instanceof xoj0.d.t) {
                final xoj0.d.t tVar = (xoj0.d.t) xoj0Var;
                hVar.D1(new Function1() { // from class: nd10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return jme.a((jme) obj3, false, null, false, false, false, null, new gmj0(tVar.a, hmj0.b), 63);
                    }
                });
            } else {
                hVar.D1(new Function1() { // from class: od10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return jme.a((jme) obj3, false, null, false, false, false, new fmj0(xoj0Var.getMessage()), null, 95);
                    }
                });
            }
        }
        return Unit.a;
        vhn vhnVar = (vhn) objA;
        p610 p610Var2 = hVar.J;
        if (p610Var2 == null) {
            return Unit.a;
        }
        String str3 = p610Var2.h;
        if (str3 == null) {
            return Unit.a;
        }
        hVar.D1(new zc10());
        hVar.D1(new jd10());
        bmj0 bmj0Var = hVar.A;
        String str4 = (String) sc10Var.a.b("pix_btg_withdraw_current_amount");
        if (str4 == null) {
            str4 = "";
        }
        msj0.c cVar = new msj0.c(str4, vhnVar.a, p610Var2.b, p610Var2.f, p610Var2.g, str3);
        this.a = p610Var2;
        this.b = 2;
        Object objA2 = bmj0Var.a(cVar, this);
        if (objA2 != y5bVar) {
            obj2 = objA2;
            p610Var = p610Var2;
            if (zi50.a(obj2) != null) {
                hVar.D1(new kd10());
                hVar.D1(new ld10());
            }
            if (!(obj2 instanceof zi50.b)) {
                xoj0Var = (xoj0) obj2;
                hVar.D1(new hsi(1));
                if (xoj0Var instanceof xoj0.d.h) {
                    hVar.D1(new jsi(1));
                } else if (xoj0Var instanceof xoj0.d.j) {
                    xsm xsmVar2 = hVar.f;
                    str = (String) sc10Var.a.b("pix_btg_withdraw_current_amount");
                    if (str == null) {
                        str = "";
                    }
                    String strB2 = xsmVar2.b(str, false);
                    String str5 = ((xoj0.d.j) xoj0Var).c;
                    hVar.x1(new d.i(strB2, str5 != null ? str5 : "", p610Var.g));
                } else if (xoj0Var instanceof xoj0.d.v) {
                    final xoj0.d.v vVar2 = (xoj0.d.v) xoj0Var;
                    hVar.D1(new Function1() { // from class: md10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return jme.a((jme) obj3, false, null, false, false, false, null, new gmj0(vVar2.a, hmj0.a), 63);
                        }
                    });
                } else if (xoj0Var instanceof xoj0.d.t) {
                    final xoj0.d.t tVar2 = (xoj0.d.t) xoj0Var;
                    hVar.D1(new Function1() { // from class: nd10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return jme.a((jme) obj3, false, null, false, false, false, null, new gmj0(tVar2.a, hmj0.b), 63);
                        }
                    });
                } else {
                    hVar.D1(new Function1() { // from class: od10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return jme.a((jme) obj3, false, null, false, false, false, new fmj0(xoj0Var.getMessage()), null, 95);
                        }
                    });
                }
            }
            return Unit.a;
        }
        return y5bVar;
    }
}
