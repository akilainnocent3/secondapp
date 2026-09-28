package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class chf0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ n6s a;
    public final /* synthetic */ iif0 b;
    public final /* synthetic */ ijf0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ mly f;
    public final /* synthetic */ odh0 i;
    public final /* synthetic */ Function1<ijf0, Unit> v;
    public final /* synthetic */ int w;

    /* JADX WARN: Multi-variable type inference failed */
    public chf0(n6s n6sVar, iif0 iif0Var, ijf0 ijf0Var, boolean z, boolean z2, mly mlyVar, odh0 odh0Var, Function1<? super ijf0, Unit> function1, int i) {
        this.a = n6sVar;
        this.b = iif0Var;
        this.c = ijf0Var;
        this.d = z;
        this.e = z2;
        this.f = mlyVar;
        this.i = odh0Var;
        this.v = function1;
        this.w = i;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(851809892);
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = new tlf0();
            aVar2.r(objY);
        }
        tlf0 tlf0Var = (tlf0) objY;
        Object objY2 = aVar2.y();
        if (objY2 == c0042a) {
            objY2 = new yzc();
            aVar2.r(objY2);
        }
        Function1<ijf0, Unit> function1 = this.v;
        int i = this.w;
        bhf0 bhf0Var = new bhf0(this.a, this.b, this.c, this.d, this.e, tlf0Var, this.f, this.i, (yzc) objY2, function1, i);
        boolean zA = aVar2.A(bhf0Var);
        Object objY3 = aVar2.y();
        if (zA || objY3 == c0042a) {
            kuk kukVar = new kuk(1, bhf0Var, bhf0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            aVar2.r(kukVar);
            objY3 = kukVar;
        }
        d dVarA = androidx.compose.ui.input.key.a.a(d.a.b, (Function1) ((chp) objY3));
        aVar2.H();
        return dVarA;
    }
}
