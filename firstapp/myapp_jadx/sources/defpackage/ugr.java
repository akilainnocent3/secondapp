package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ugr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ugr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                igr igrVar = (igr) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (igrVar == igr.c) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue);
            default:
                hfc0 hfc0Var = (hfc0) obj;
                hfc0Var.getClass();
                ((Function1) obj2).invoke(new b.i.f(hfc0Var));
                return Unit.a;
        }
    }
}
