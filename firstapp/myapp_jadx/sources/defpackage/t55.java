package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t55 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ gaj<v3a0, a, Integer, Unit> A;
    public final /* synthetic */ l65 a;
    public final /* synthetic */ op8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qx80 f;
    public final /* synthetic */ long i;
    public final /* synthetic */ long v;
    public final /* synthetic */ float w;
    public final /* synthetic */ Function2<a, Integer, Unit> y;
    public final /* synthetic */ op8 z;

    public t55(l65 l65Var, op8 op8Var, float f, float f2, boolean z, qx80 qx80Var, long j, long j2, float f3, Function2 function2, op8 op8Var2, gaj gajVar) {
        this.a = l65Var;
        this.b = op8Var;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = qx80Var;
        this.i = j;
        this.v = j2;
        this.w = f3;
        this.y = function2;
        this.z = op8Var2;
        this.A = gajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            l65 l65Var = this.a;
            j590 j590Var = l65Var.a;
            op8 op8VarB = pp8.b(-519581786, new q55(this.c, this.b), aVar2);
            op8 op8VarB2 = pp8.b(-815624571, new r55(this.a, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z), aVar2);
            op8 op8VarB3 = pp8.b(-1111667356, new s55(this.A, l65Var), aVar2);
            boolean zM = aVar2.M(l65Var);
            Object objY = aVar2.y();
            if (zM || objY == a.C0041a.a) {
                objY = new r10(l65Var, 1);
                aVar2.r(objY);
            }
            k65.b(op8VarB, op8VarB2, op8VarB3, (Function0) objY, j590Var, aVar2, 3504);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
