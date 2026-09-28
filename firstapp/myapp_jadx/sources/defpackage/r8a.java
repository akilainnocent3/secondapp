package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r8a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ r8a(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                nt4 nt4Var = (nt4) obj;
                nt4Var.getClass();
                function1.invoke(nt4Var);
                break;
            default:
                ajx ajxVar = (ajx) obj;
                ajxVar.getClass();
                td0 td0Var = new td0();
                td0Var.a = R.anim.slide_in_left;
                td0Var.b = R.anim.slide_out_right;
                Unit unit = Unit.a;
                zix.a aVar = ajxVar.a;
                aVar.f = R.anim.slide_in_right;
                aVar.g = R.anim.slide_out_left;
                aVar.h = R.anim.slide_in_left;
                aVar.i = R.anim.slide_out_right;
                function1.invoke(ajxVar);
                break;
        }
        return Unit.a;
    }
}
