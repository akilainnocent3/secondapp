package defpackage;

import android.view.View;
import com.sportybet.android.multimaker.domain.model.MultiMakerSport;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class ciw implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ MultiMakerSport b;
    public final /* synthetic */ eiw c;

    public ciw(cq40 cq40Var, MultiMakerSport multiMakerSport, eiw eiwVar) {
        this.a = cq40Var;
        this.b = multiMakerSport;
        this.c = eiwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        MultiMakerSport multiMakerSport = this.b;
        if (multiMakerSport.d) {
            bfw bfwVar = this.c.b;
            String str = multiMakerSport.a;
            bfwVar.getClass();
            str.getClass();
            MultiMakerActivity multiMakerActivity = bfwVar.a;
            int i = MultiMakerActivity.E;
            tjw tjwVarZ1 = multiMakerActivity.z1();
            ej5.c(o8i0.d(tjwVarZ1), null, null, new siw(tjwVarZ1, str, null), 3);
        }
    }
}
