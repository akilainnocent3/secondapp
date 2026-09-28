package defpackage;

import androidx.fragment.app.Fragment;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rej implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ rej(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                tgj tgjVar = (tgj) fragment;
                BetData betData = (BetData) obj;
                betData.getClass();
                ((BetContainerState) tgjVar.R0().a.getValue()).setBetData(betData);
                ((x5a0) tgjVar.E1).setValue(Boolean.TRUE);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((l560) fragment).z0(str);
                break;
        }
        return Unit.a;
    }
}
