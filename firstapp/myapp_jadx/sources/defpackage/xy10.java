package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xy10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xy10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj;
                GameDetails gameDetails = zy10Var.B;
                wz.a("HamMenuClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                zt50 zt50Var = zy10Var.b;
                if (zt50Var != null) {
                    zt50Var.F.n(8388613);
                }
                break;
            default:
                ((Function1) obj).invoke(bri0.c.a);
                break;
        }
        return Unit.a;
    }
}
