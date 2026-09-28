package defpackage;

import android.view.View;
import com.sportybet.feature.horseracing.view.HorseRacingActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xjm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xjm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = HorseRacingActivity.e;
                fkm fkmVarH1 = ((HorseRacingActivity) obj).H1();
                ej5.c(o8i0.d(fkmVarH1), null, null, new hkm(fkmVarH1, null), 3);
                break;
            default:
                fng0 fng0Var = (fng0) ((ymg0) obj).v.getValue();
                ej5.c(o8i0.d(fng0Var), null, null, new eng0(fng0Var.b, fng0Var, null), 3);
                break;
        }
    }
}
