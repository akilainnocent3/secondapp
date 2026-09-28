package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                try {
                    djh djhVar = u6jVar.b;
                    if (djhVar != null) {
                        djhVar.b.setVisibility(0);
                    }
                    ajh ajhVarL1 = u6jVar.l1();
                    if (ajhVarL1 != null) {
                        ajhVarL1.C.removeView(u6jVar.k0);
                    }
                    djh djhVar2 = u6jVar.b;
                    if (djhVar2 != null) {
                        e6i0.g(djhVar2.w.y);
                    }
                    djh djhVar3 = u6jVar.b;
                    if (djhVar3 != null) {
                        e6i0.h(djhVar3.w.d, false);
                    }
                    djh djhVar4 = u6jVar.b;
                    if (djhVar4 != null) {
                        e6i0.h(djhVar4.w.e, true);
                    }
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.a;
            default:
                Pair pair = (Pair) ((pgx) obj).j.getValue();
                if (pair != null) {
                    return (String) pair.b;
                }
                return null;
        }
    }
}
