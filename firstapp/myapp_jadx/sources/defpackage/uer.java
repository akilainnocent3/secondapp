package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class uer implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uer(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                twd0 twd0Var = (twd0) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.k(((Number) twd0Var.getValue()).floatValue());
                a7lVar.v(((Number) twd0Var.getValue()).floatValue());
                a7lVar.z0(n09.a(0.5f, 0.0f));
                return Unit.a;
            case 1:
                ov80 ov80Var = (ov80) obj2;
                e eVar = ov80Var.a;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = ov80.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    c28 c28Var = ov80Var.b;
                    String string = eVar.getString(R.string.next_round);
                    string.getClass();
                    c28Var.y1(string);
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    ov80Var.dismiss();
                    us80 us80Var = us80.d;
                    e eVar2 = ov80Var.a;
                    ResultWrapper.GenericError error = loadingState.getError();
                    kv80 kv80Var = new kv80(ov80Var, 0);
                    mv80 mv80Var = new mv80();
                    yu80 yu80Var = new yu80();
                    eVar.getColor(R.color.try_again_color);
                    us80Var.c(eVar2, error, kv80Var, mv80Var, yu80Var, 0, (1024 & 128) != 0 ? new ita(1) : null, (1024 & 512) != 0 ? new pm60() : null, new qm60());
                }
                return Unit.a;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                ((Function1) obj2).invoke(new b.r.a(zrd0Var));
                return Unit.a;
        }
    }
}
