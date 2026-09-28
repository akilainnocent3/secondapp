package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w00 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w00(t00 t00Var, aq40 aq40Var) {
        this.b = t00Var;
        this.c = aq40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((t00) obj4).a(fFloatValue, ((Float) obj2).floatValue());
                ((aq40) obj3).a = fFloatValue;
                break;
            default:
                ((Integer) obj2).getClass();
                uxn.a((vxn) obj4, (Function2) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w00(vxn vxnVar, Function2 function2, int i) {
        this.b = vxnVar;
        this.c = function2;
    }
}
