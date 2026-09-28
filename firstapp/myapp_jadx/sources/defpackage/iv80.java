package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class iv80 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iv80(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nv80 nv80Var = (nv80) obj2;
                e eVar = nv80Var.a;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = nv80.a.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    y720 y720Var = nv80Var.b;
                    String string = eVar.getString(R.string.next_round);
                    string.getClass();
                    y720Var.y1(string);
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    nv80Var.dismiss();
                    vs80 vs80Var = vs80.b;
                    e eVar2 = nv80Var.a;
                    ResultWrapper.GenericError error = loadingState.getError();
                    ln00 ln00Var = new ln00(nv80Var, i3);
                    lmm lmmVar = new lmm(1);
                    zu80 zu80Var = new zu80();
                    eVar.getColor(R.color.try_again_color);
                    vs80Var.c(eVar2, error, ln00Var, lmmVar, zu80Var, 0, (640 & 128) != 0 ? new mm60() : null, (640 & 512) != 0 ? new xvj(2) : null);
                }
                return Unit.a;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                ((Function1) obj2).invoke(new b.r.C0284b(zrd0Var));
                return Unit.a;
        }
    }
}
