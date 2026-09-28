package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t3f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t3f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(sfj0.a);
                break;
            default:
                a1b0 a1b0Var = (a1b0) obj;
                if (a1b0Var.I) {
                    wxi wxiVar = a1b0Var.v;
                    if (wxiVar != null) {
                        wxiVar.w.n(8388613);
                    }
                    GameDetails gameDetails = a1b0Var.i;
                    wz.a("HamMenuClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                }
                break;
        }
        return Unit.a;
    }
}
