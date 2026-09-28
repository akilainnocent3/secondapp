package androidx.compose.foundation.selection;

import androidx.compose.foundation.g;
import androidx.compose.ui.d;
import defpackage.gaj;
import defpackage.gnn;
import defpackage.ifn;
import defpackage.mfn;
import defpackage.pr7;
import defpackage.psw;
import defpackage.su50;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.a$a, reason: collision with other inner class name */
    public static final class C0040a implements gaj<d, androidx.compose.runtime.a, Integer, d> {
        public final /* synthetic */ ifn a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ su50 d;
        public final /* synthetic */ Function0 e;

        public C0040a(ifn ifnVar, boolean z, boolean z2, su50 su50Var, Function0 function0) {
            this.a = ifnVar;
            this.b = z;
            this.c = z2;
            this.d = su50Var;
            this.e = function0;
        }

        @Override // defpackage.gaj
        public final d invoke(d dVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(-1525724089);
            Object objY = aVar2.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = pr7.a(aVar2);
            }
            psw pswVar = (psw) objY;
            d dVarN = g.a(d.a.b, pswVar, this.a).n(new SelectableElement(this.b, pswVar, null, false, this.c, this.d, this.e));
            aVar2.H();
            return dVarN;
        }
    }

    public static final d a(d dVar, boolean z, psw pswVar, ifn ifnVar, boolean z2, su50 su50Var, Function0<Unit> function0) {
        d dVarA;
        if (ifnVar instanceof mfn) {
            dVarA = new SelectableElement(z, pswVar, (mfn) ifnVar, false, z2, su50Var, function0);
        } else if (ifnVar == null) {
            dVarA = new SelectableElement(z, pswVar, null, false, z2, su50Var, function0);
        } else {
            d.a aVar = d.a.b;
            if (pswVar != null) {
                dVarA = g.a(aVar, pswVar, ifnVar).n(new SelectableElement(z, pswVar, null, false, z2, su50Var, function0));
            } else {
                dVarA = androidx.compose.ui.c.a(aVar, gnn.a, new C0040a(ifnVar, z, z2, su50Var, function0));
            }
        }
        return dVar.n(dVarA);
    }

    public static d b(d dVar, boolean z, boolean z2, su50 su50Var, Function0 function0, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            su50Var = null;
        }
        return dVar.n(new SelectableElement(z, null, null, true, z3, su50Var, function0));
    }
}
