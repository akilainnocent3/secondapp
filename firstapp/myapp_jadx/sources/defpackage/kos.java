package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kos implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kos(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                oos oosVar = (oos) obj;
                aos aosVar = oosVar.b;
                jqu jquVarB = lqu.b(aosVar.f);
                if (jquVarB == null) {
                    jquVarB = jqu.a;
                }
                eqs eqsVar = oosVar.i;
                if (eqsVar != null) {
                    eqsVar.b(jquVarB);
                }
                aosVar.f.setVisibility(8);
                break;
            default:
                ((Function1) obj).invoke(cp50.p.a);
                break;
        }
        return Unit.a;
    }
}
