package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d4a0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ op8 c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;
    public final /* synthetic */ imf0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long i;

    public d4a0(boolean z, Function2 function2, op8 op8Var, Function2 function3, imf0 imf0Var, long j, long j2) {
        this.a = z;
        this.b = function2;
        this.c = op8Var;
        this.d = function3;
        this.e = imf0Var;
        this.f = j;
        this.i = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.a;
            op8 op8Var = this.c;
            if (!z || this.b == null) {
                aVar2.N(-168976609);
                f4a0.b(op8Var, this.b, this.d, this.e, this.f, this.i, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.N(-168990288);
                f4a0.a(op8Var, this.b, this.d, this.e, this.f, this.i, aVar2, 0);
                aVar2.H();
            }
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
