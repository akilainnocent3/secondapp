package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l6q implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l6q(int i, d dVar, String str) {
        this.b = dVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r6q.f(qj40.a(7), (a) obj, (d) obj4, (String) obj3);
                break;
            default:
                ezj0 ezj0Var = (ezj0) obj4;
                czj0 czj0Var = (czj0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    azj0.a(ezj0Var.a, ezj0Var.c, null, czj0Var, ezj0Var.b, null, aVar, 0, 36);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l6q(ezj0 ezj0Var, czj0 czj0Var) {
        this.b = ezj0Var;
        this.c = czj0Var;
    }
}
