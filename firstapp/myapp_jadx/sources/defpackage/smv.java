package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class smv implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, Unit> a;
    public final /* synthetic */ hmv b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;
    public final /* synthetic */ op8 e;

    public smv(Function2 function2, hmv hmvVar, boolean z, Function2 function3, op8 op8Var) {
        this.a = function2;
        this.b = hmvVar;
        this.c = z;
        this.d = function3;
        this.e = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.c;
            hmv hmvVar = this.b;
            Function2<a, Integer, Unit> function2 = this.a;
            if (function2 != null) {
                aVar2.N(-864613220);
                hna.a(tp0.a(z ? hmvVar.b : hmvVar.e, iza.a), pp8.b(1241781204, new pmv(function2), aVar2), aVar2, 56);
                aVar2.H();
            } else {
                aVar2.N(-864293207);
                aVar2.H();
            }
            chf chfVar = iza.a;
            j730 j730VarA = tp0.a(z ? hmvVar.a : hmvVar.d, chfVar);
            op8 op8Var = this.e;
            Function2<a, Integer, Unit> function3 = this.d;
            hna.a(j730VarA, pp8.b(-893579015, new qmv(function2, function3, op8Var), aVar2), aVar2, 56);
            if (function3 != null) {
                aVar2.N(-863394951);
                hna.a(tp0.a(z ? hmvVar.c : hmvVar.f, chfVar), pp8.b(-782441013, new rmv(function3), aVar2), aVar2, 56);
                aVar2.H();
            } else {
                aVar2.N(-863072055);
                aVar2.H();
            }
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
