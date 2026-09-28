package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zy6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ zy6(int i, d dVar, String str, Function0 function0) {
        this.c = str;
        this.b = dVar;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.d;
        Object obj3 = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                hz6.a(iA, (a) obj, dVar, (String) obj3, (Function0) hajVar);
                break;
            default:
                ((Integer) obj2).getClass();
                mve0.a(dVar, (nve0) obj3, (Function1) hajVar, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zy6(d dVar, nve0 nve0Var, Function1 function1, int i) {
        this.b = dVar;
        this.c = nve0Var;
        this.d = function1;
    }
}
