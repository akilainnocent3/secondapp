package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n46 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n46(db6 db6Var, t46 t46Var) {
        this.b = db6Var;
        this.c = t46Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final db6 db6Var = (db6) obj4;
                final t46 t46Var = (t46) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarC = j.c(d.a.b, 0.75f);
                    String str = db6Var.c;
                    if (str == null) {
                        str = "Campaign";
                    }
                    boolean zA = aVar.A(t46Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new o46(t46Var, 0);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(db6Var) | aVar.A(t46Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: p46
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                t46 t46Var2 = t46Var;
                                String str2 = t46Var2.c;
                                db6 db6Var2 = db6Var;
                                db6Var2.B1(str2, new r46(db6Var2, t46Var2, 0));
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(db6Var) | aVar.A(t46Var);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: q46
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                db6Var.y1(t46Var.c, null, new cb6());
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    t66.a(dVarC, db6Var, str, function0, function1, (Function0) objY3, aVar, 6);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                dpo.b((epo) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ n46(epo epoVar, Function1 function1, int i) {
        this.b = epoVar;
        this.c = function1;
    }
}
