package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bgj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bgj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gvi gviVar = ((tgj) obj).z;
                if (gviVar != null) {
                    gviVar.V.setVisibility(8);
                }
                return Unit.a;
            case 1:
                GameDetails gameDetails = ((usx) obj).a;
                if (gameDetails == null) {
                    Intrinsics.n("gameDetails");
                    throw null;
                }
                String name = gameDetails.getName();
                if (name == null) {
                    name = "";
                }
                return new wrz(2, ay0.U(new Object[]{new amj(name)}));
            default:
                wwd0 wwd0Var = ((goi0) obj).e;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, new j7z.c(q5z.l.a), null, null, null, null, false, 2015)));
                return Unit.a;
        }
    }
}
