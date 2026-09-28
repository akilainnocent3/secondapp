package defpackage;

import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qha implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qha(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
            case 1:
                int i2 = GameMainActivity.N;
                ((GameMainActivity) obj).G1().y1();
                return Unit.a;
            default:
                GameDetails gameDetails = ((hua0) obj).a;
                if (gameDetails == null) {
                    Intrinsics.n("gameDetails");
                    throw null;
                }
                String name = gameDetails.getName();
                if (name == null) {
                    name = "";
                }
                return new wrz(2, ay0.U(new Object[]{new amj(name)}));
        }
    }
}
