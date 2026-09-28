package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cj20 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cj20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ej20) obj).p.c();
                break;
            default:
                kab0 kab0Var = (kab0) obj;
                GameDetails gameDetails = kab0Var.b;
                wz.a("HamMenuClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                fo80 fo80Var = kab0Var.c;
                if (fo80Var != null) {
                    fo80Var.z.n(8388613);
                }
                break;
        }
        return Unit.a;
    }
}
