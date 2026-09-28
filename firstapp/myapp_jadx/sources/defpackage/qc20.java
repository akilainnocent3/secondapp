package defpackage;

import android.view.View;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qc20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qc20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                if (preMatchEventActivity.J0 != 4) {
                    e eVar = preMatchEventActivity.L1;
                    if (eVar != null) {
                        eVar.A1(true, false);
                    }
                    e eVar2 = preMatchEventActivity.L1;
                    if (eVar2 != null) {
                        eVar2.C1();
                    }
                } else {
                    mi20 mi20Var = preMatchEventActivity.M1;
                    if (mi20Var != null) {
                        mi20Var.y1(preMatchEventActivity.S, preMatchEventActivity.P, true);
                    }
                }
                break;
            default:
                int i2 = SHKeypadContainer.F;
                ((Function0) obj).invoke();
                break;
        }
    }
}
