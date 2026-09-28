package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import uyr.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class syr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ syr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                uyr uyrVar = (uyr) obj2;
                int iIntValue = ((Integer) obj).intValue();
                c cVarInvoke = uyrVar.D.invoke();
                if (iIntValue < 0 || iIntValue >= cVarInvoke.a()) {
                    StringBuilder sbA = efe0.a(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbA.append(cVarInvoke.a());
                    sbA.append(')');
                    zkn.a(sbA.toString());
                }
                ej5.c(uyrVar.d2(), null, null, uyrVar.new a(iIntValue, null), 3);
                return Boolean.TRUE;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                ((Function1) obj2).invoke(new b.s.a(zrd0Var));
                return Unit.a;
        }
    }
}
