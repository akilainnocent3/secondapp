package androidx.compose.animation;

import defpackage.c75;
import defpackage.cuw;
import defpackage.dtg0;
import defpackage.gaj;
import defpackage.gjs;
import defpackage.qlr;
import defpackage.rtw;
import defpackage.t5a0;
import defpackage.t65;
import defpackage.u65;
import defpackage.vtg0;
import defpackage.x5a0;
import defpackage.y290;
import defpackage.y8h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s extends qlr implements gaj<androidx.compose.ui.d, androidx.compose.runtime.a, Integer, androidx.compose.ui.d> {
    public final /* synthetic */ l.d a;
    public final /* synthetic */ dtg0<Object> b;
    public final /* synthetic */ Function1<Object, Boolean> c;
    public final /* synthetic */ n d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ l.a f;
    public final /* synthetic */ c75 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l.d dVar, dtg0 dtg0Var, Function1 function1, n nVar, boolean z, l.a aVar, c75 c75Var) {
        super(3);
        this.a = dVar;
        this.b = dtg0Var;
        this.c = function1;
        this.d = nVar;
        this.e = z;
        this.f = aVar;
        this.i = c75Var;
    }

    @Override // defpackage.gaj
    public final androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2;
        dtg0 dtg0VarE;
        androidx.compose.ui.d dVar2 = dVar;
        androidx.compose.runtime.a aVar3 = aVar;
        num.intValue();
        aVar3.N(-1843478929);
        String str = this.a.a;
        aVar3.C(-2056718552, str);
        Object objY = aVar3.y();
        n nVar = this.d;
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (objY == c0042a) {
            rtw<Object, y290> rtwVar = nVar.y;
            y290 y290VarD = rtwVar.d(str);
            if (y290VarD == null) {
                y290VarD = new y290(str, nVar);
                rtwVar.m(str, y290VarD);
            }
            objY = y290VarD;
            aVar3.r(objY);
        }
        y290 y290Var = (y290) objY;
        dtg0<Object> dtg0Var = this.b;
        aVar3.C(-2056714740, dtg0Var);
        Function1<Object, Boolean> function1 = this.c;
        if (dtg0Var != null) {
            defpackage.o oVar = dtg0Var.a;
            aVar3.N(666402505);
            String string = str.toString();
            boolean zM = aVar3.M(dtg0Var);
            Object objY2 = aVar3.y();
            if (zM || objY2 == c0042a) {
                objY2 = oVar.V();
                aVar3.r(objY2);
            }
            if (dtg0Var.i()) {
                objY2 = oVar.V();
            }
            aVar3.N(1329676753);
            Boolean boolInvoke = function1.invoke(objY2);
            boolInvoke.getClass();
            aVar3.H();
            Object value = ((x5a0) dtg0Var.d).getValue();
            aVar3.N(1329676753);
            Boolean boolInvoke2 = function1.invoke(value);
            boolInvoke2.getClass();
            aVar3.H();
            aVar2 = aVar3;
            dtg0VarE = vtg0.b(dtg0Var, boolInvoke, boolInvoke2, string, aVar2, 0);
            aVar2.H();
        } else {
            aVar2 = aVar3;
            aVar2.N(666654225);
            function1.getClass();
            boolean z = true;
            y8h0.d(1, function1);
            Boolean boolInvoke3 = function1.invoke(Unit.a);
            boolean zBooleanValue = boolInvoke3.booleanValue();
            Object objY3 = aVar2.y();
            if (objY3 == c0042a) {
                if (y290Var.k.isEmpty()) {
                    z = zBooleanValue;
                } else if (zBooleanValue) {
                    z = false;
                }
                objY3 = new cuw(Boolean.valueOf(z));
                aVar2.r(objY3);
            }
            cuw cuwVar = (cuw) objY3;
            cuwVar.o0(boolInvoke3);
            dtg0VarE = vtg0.e(cuwVar, null, aVar2, 0, 2);
            aVar2.H();
        }
        aVar2.C(-2056651003, Boolean.valueOf(nVar.i()));
        androidx.compose.runtime.a aVar4 = aVar2;
        dtg0.a aVarC = vtg0.c(dtg0VarE, gjs.j, null, aVar4, 0, 2);
        aVar4.K();
        boolean zM2 = aVar4.M(dtg0VarE);
        Object objY4 = aVar4.y();
        c75 c75Var = this.i;
        if (zM2 || objY4 == c0042a) {
            objY4 = new t65(nVar, dtg0VarE, aVarC, c75Var);
            aVar4.r(objY4);
        }
        t65 t65Var = (t65) objY4;
        if (!Intrinsics.g((dtg0.a) ((x5a0) t65Var.c).getValue(), aVarC)) {
            ((x5a0) t65Var.c).setValue(aVarC);
            ((x5a0) t65Var.f).setValue(null);
            t65Var.e = u65.a;
        }
        ((x5a0) t65Var.d).setValue(c75Var);
        aVar4.K();
        Object objY5 = aVar4.y();
        boolean z2 = this.e;
        l.d dVar3 = this.a;
        l.a aVar5 = this.f;
        if (objY5 == c0042a) {
            k kVar = new k(y290Var, t65Var, z2, aVar5, dVar3);
            aVar4.r(kVar);
            objY5 = kVar;
        }
        k kVar2 = (k) objY5;
        ((x5a0) dVar3.b).setValue(kVar2);
        ((x5a0) kVar2.c).setValue(y290Var);
        ((x5a0) kVar2.f).setValue(Boolean.valueOf(z2));
        ((x5a0) kVar2.d).setValue(t65Var);
        ((x5a0) kVar2.e).setValue(l.b.a.C0036a.b);
        ((x5a0) kVar2.i).setValue(aVar5);
        ((t5a0) kVar2.a).A(0.0f);
        ((x5a0) kVar2.b).setValue(Boolean.TRUE);
        ((x5a0) kVar2.v).setValue(dVar3);
        aVar4.K();
        androidx.compose.ui.d dVarN = dVar2.n(new SharedBoundsNodeElement(kVar2));
        aVar4.H();
        return dVarN;
    }
}
