package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e4b implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d A;
    public final /* synthetic */ ia5 B;
    public final /* synthetic */ iif0 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function1<ukf0, Unit> F;
    public final /* synthetic */ mly G;
    public final /* synthetic */ mmd H;
    public final /* synthetic */ gaj<Function2<? super a, ? super Integer, Unit>, a, Integer, Unit> a;
    public final /* synthetic */ n6s b;
    public final /* synthetic */ imf0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ yhf0 f;
    public final /* synthetic */ ijf0 i;
    public final /* synthetic */ uni0 v;
    public final /* synthetic */ d w;
    public final /* synthetic */ d y;
    public final /* synthetic */ d z;

    /* JADX WARN: Multi-variable type inference failed */
    public e4b(gaj<? super Function2<? super a, ? super Integer, Unit>, ? super a, ? super Integer, Unit> gajVar, n6s n6sVar, imf0 imf0Var, int i, int i2, yhf0 yhf0Var, ijf0 ijf0Var, uni0 uni0Var, d dVar, d dVar2, d dVar3, d dVar4, ia5 ia5Var, iif0 iif0Var, boolean z, boolean z2, Function1<? super ukf0, Unit> function1, mly mlyVar, mmd mmdVar) {
        this.a = gajVar;
        this.b = n6sVar;
        this.c = imf0Var;
        this.d = i;
        this.e = i2;
        this.f = yhf0Var;
        this.i = ijf0Var;
        this.v = uni0Var;
        this.w = dVar;
        this.y = dVar2;
        this.z = dVar3;
        this.A = dVar4;
        this.B = ia5Var;
        this.C = iif0Var;
        this.D = z;
        this.E = z2;
        this.F = function1;
        this.G = mlyVar;
        this.H = mmdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.invoke(pp8.b(-44346382, new d4b(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H), aVar2), aVar2, 6);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
