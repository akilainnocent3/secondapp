package defpackage;

import android.util.Base64;
import android.widget.TextView;
import com.sportygames.pocketrocket.model.response.BetDetails;
import com.sportygames.pocketrocket.model.response.RoundBetResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xu10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xu10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zt50 zt50Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj2;
                Object objE = new eal().e(x54.a(Base64.decode((String) obj, 0)), RoundBetResponse.class);
                objE.getClass();
                RoundBetResponse roundBetResponse = (RoundBetResponse) objE;
                zt50 zt50Var2 = zy10Var.b;
                if (zt50Var2 != null) {
                    zt50Var2.e.setBets(roundBetResponse, zt50Var2.M);
                }
                if (Intrinsics.g(roundBetResponse.getMessageType(), "ROUND_TOP_BETS") && (zt50Var = zy10Var.b) != null) {
                    TextView textView = zt50Var.d;
                    StringBuilder sb = new StringBuilder("(");
                    List<BetDetails> topBets = roundBetResponse.getTopBets();
                    sb.append(String.valueOf(topBets != null ? Integer.valueOf(topBets.size()) : null));
                    sb.append(")");
                    textView.setText(sb.toString());
                }
                break;
            default:
                ((Function1) obj2).invoke(new kli0.m(((Integer) obj).intValue()));
                break;
        }
        return Unit.a;
    }
}
