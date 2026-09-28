package com.sportybet.android.globalpay.pixBtg.deposit;

import com.sportybet.android.globalpay.pixBtg.deposit.g;
import defpackage.c0d;
import defpackage.guh0;
import defpackage.ib5;
import defpackage.o910;
import defpackage.sli;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.whn;
import defpackage.xz4;
import defpackage.y5b;
import defpackage.zi50;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$showDepositConfirmationIfCpfIsValid$1", f = "PixBtgDepositViewModel.kt", l = {626, 627}, m = "invokeSuspend", v = 2)
public final class n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public whn a;
    public int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g gVar, v1b<? super n> v1bVar) {
        super(2, v1bVar);
        this.c = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        final whn whnVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        final g gVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            this.b = 1;
            obj = gVar.x1(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            whnVar = this.a;
            uj50.b(obj);
            obj2 = ((zi50) obj).a;
        }
        if (zi50.a(obj2) != null) {
            gVar.getClass();
            gVar.I1(new sli(gVar, 1));
            gVar.H1(new o910());
        }
        if (!(obj2 instanceof zi50.b)) {
            if (((Boolean) obj2).booleanValue()) {
                gVar.H1(new Function1() { // from class: p910
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        kme kmeVar = (kme) obj3;
                        whn whnVar2 = whnVar;
                        boolean z = whnVar2.d;
                        List<p610> list = whnVar2.c;
                        g gVar2 = gVar;
                        boolean zD1 = gVar2.D1(list, z);
                        String str = whnVar2.b;
                        str.getClass();
                        String strD = fsa0.d(3, 2, str);
                        s9e0 s9e0Var = s9e0.a;
                        xsm xsmVar = gVar2.i;
                        String str2 = (String) gVar2.G.a.b("pix_btg_current_amount");
                        if (str2 == null) {
                            str2 = "";
                        }
                        String strD2 = xsmVar.d(str2, false);
                        s9e0Var.getClass();
                        strD2.getClass();
                        return kme.a(kmeVar, null, new vvd(16, strD, c.p(strD2, " ", "", false), true, zD1), false, false, false, false, false, false, null, 509);
                    }
                });
                gVar.I1(new sli(gVar, 1));
            } else {
                gVar.Q = false;
                gVar.I1(new sli(gVar, 1));
                gVar.I1(new xz4(1));
            }
        }
        return Unit.a;
        whn whnVar2 = (whn) obj;
        guh0 guh0Var = gVar.v;
        String str = whnVar2.b;
        this.a = whnVar2;
        this.b = 2;
        Serializable serializableA = guh0Var.a(str, this);
        if (serializableA != y5bVar) {
            obj2 = serializableA;
            whnVar = whnVar2;
            if (zi50.a(obj2) != null) {
                gVar.getClass();
                gVar.I1(new sli(gVar, 1));
                gVar.H1(new o910());
            }
            if (!(obj2 instanceof zi50.b)) {
                if (((Boolean) obj2).booleanValue()) {
                    gVar.H1(new Function1() { // from class: p910
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            kme kmeVar = (kme) obj3;
                            whn whnVar3 = whnVar;
                            boolean z = whnVar3.d;
                            List<p610> list = whnVar3.c;
                            g gVar2 = gVar;
                            boolean zD1 = gVar2.D1(list, z);
                            String str2 = whnVar3.b;
                            str2.getClass();
                            String strD = fsa0.d(3, 2, str2);
                            s9e0 s9e0Var = s9e0.a;
                            xsm xsmVar = gVar2.i;
                            String str3 = (String) gVar2.G.a.b("pix_btg_current_amount");
                            if (str3 == null) {
                                str3 = "";
                            }
                            String strD2 = xsmVar.d(str3, false);
                            s9e0Var.getClass();
                            strD2.getClass();
                            return kme.a(kmeVar, null, new vvd(16, strD, c.p(strD2, " ", "", false), true, zD1), false, false, false, false, false, false, null, 509);
                        }
                    });
                    gVar.I1(new sli(gVar, 1));
                } else {
                    gVar.Q = false;
                    gVar.I1(new sli(gVar, 1));
                    gVar.I1(new xz4(1));
                }
            }
            return Unit.a;
        }
        return y5bVar;
    }
}
