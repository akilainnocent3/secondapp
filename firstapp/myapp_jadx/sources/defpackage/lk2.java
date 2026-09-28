package defpackage;

import com.sportygames.spinmatch.components.BetChips;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lk2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lk2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Double d = (Double) obj;
                d.getClass();
                Function1<? super Double, Unit> function1 = ((BetChips) obj2).G;
                if (function1 != null) {
                    function1.invoke(d);
                    return Unit.a;
                }
                Intrinsics.n("betChipListener");
                throw null;
            default:
                yhf0 yhf0Var = (yhf0) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                isw iswVar = yhf0Var.a;
                t5a0 t5a0Var = (t5a0) iswVar;
                float fJ = t5a0Var.j() + fFloatValue;
                t5a0 t5a0Var2 = (t5a0) yhf0Var.b;
                if (fJ > t5a0Var2.j()) {
                    fFloatValue = t5a0Var2.j() - t5a0Var.j();
                } else if (fJ < 0.0f) {
                    fFloatValue = -t5a0Var.j();
                }
                ((t5a0) iswVar).A(t5a0Var.j() + fFloatValue);
                return Float.valueOf(fFloatValue);
        }
    }
}
