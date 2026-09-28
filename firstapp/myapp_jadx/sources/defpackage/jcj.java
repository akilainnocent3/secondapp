package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jcj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jcj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(gdj.b.a);
                break;
            default:
                l560 l560Var = (l560) obj;
                GameDetails gameDetails = l560Var.S;
                wz.a("HamMenuClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                eo80 eo80Var = l560Var.l0;
                if (eo80Var != null) {
                    eo80Var.O.n(8388613);
                }
                break;
        }
        return Unit.a;
    }
}
