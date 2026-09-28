package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x700 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x700(int i, d dVar, String str) {
        this.b = str;
        this.c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                a800.b(iA, (a) obj, (d) obj3, (String) obj4);
                break;
            default:
                j0h j0hVar = (j0h) obj4;
                op8 op8Var = (op8) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tr1.a(false, j0hVar, aVar, 0, 1);
                    orp.a(sjj.a(), pp8.b(1069023495, new y700(op8Var, j0hVar), aVar), aVar, 48);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x700(op8 op8Var, j0h j0hVar) {
        this.b = j0hVar;
        this.c = op8Var;
    }
}
