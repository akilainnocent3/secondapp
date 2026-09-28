package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.redblack.remote.models.enums.BetCardDecision;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class htc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ htc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                lb80.d(pb80Var, 0);
                lb80.c(pb80Var, (String) obj2);
                break;
            default:
                nn40 nn40Var = (nn40) obj2;
                ((View) obj).getClass();
                try {
                    if (nn40Var.C0().d.d() != null) {
                        String string = nn40Var.getString(R.string.black);
                        string.getClass();
                        nn40Var.p0(string, BetCardDecision.BLACK);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        return Unit.a;
    }
}
