package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.OpenBetsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t0z implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t0z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                int i2 = OpenBetsActivity.J;
                dz50 dz50Var = ((OpenBetsActivity) obj2).G;
                dz50Var.getClass();
                str.getClass();
                ihi ihiVar = dz50Var.d;
                ihiVar.getClass();
                ihiVar.c.a(str);
                break;
            default:
                Function2 function2 = (Function2) obj2;
                prg prgVar = (prg) obj;
                prgVar.getClass();
                String str2 = prgVar.o;
                if (str2 != null) {
                    function2.invoke(prgVar.a, str2);
                }
                break;
        }
        return Unit.a;
    }
}
