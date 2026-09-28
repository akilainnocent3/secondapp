package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oa4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oa4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                azm azmVar = ((pa4) obj).f;
                if (azmVar != null) {
                    azmVar.d(wae.HOME);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            case 1:
                GameDetails gameDetails = ((pr40) obj).a;
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
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
        }
    }
}
