package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.pingpong.remote.models.RoundBetResponse;
import com.sportygames.pingpong.remote.models.TopBets;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tq4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tq4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        h820 binding;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ar4) obj2).b.b((Throwable) obj);
                return Unit.a;
            default:
                m410 m410Var = (m410) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = m410.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        ixi ixiVar = (ixi) m410Var.b;
                        if (ixiVar != null) {
                            ixiVar.U.P();
                        }
                        if (list.isEmpty()) {
                            ixi ixiVar2 = (ixi) m410Var.b;
                            if (ixiVar2 != null && (binding = ixiVar2.V.getBinding()) != null) {
                                binding.z.setText(String.valueOf(((HTTPResponse) loadingState.getData()).getTotal()));
                            }
                        } else {
                            RoundBetResponse roundBetResponse = new RoundBetResponse(((TopBets) list.get(0)).getRoundId(), ((HTTPResponse) loadingState.getData()).getTotal(), y8h0.b(list), "", 0L, null);
                            ixi ixiVar3 = (ixi) m410Var.b;
                            if (ixiVar3 != null) {
                                ixiVar3.V.setBets(roundBetResponse);
                            }
                        }
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    ixi ixiVar4 = (ixi) m410Var.b;
                    if (ixiVar4 != null) {
                        ixiVar4.U.P();
                    }
                    m410Var.Q0().x1();
                }
                return Unit.a;
        }
    }
}
