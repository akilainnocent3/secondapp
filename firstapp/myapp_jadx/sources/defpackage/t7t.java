package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderDetailsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class t7t {
    public static final void a(final d dVar, final LobbyV2ProviderDetailsModel lobbyV2ProviderDetailsModel, final int i, final Function2 function2, a aVar, final int i2) {
        dVar.getClass();
        b bVarI = aVar.i(1052062245);
        int i3 = i2 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.A(lobbyV2ProviderDetailsModel) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d dVarA = androidx.compose.ui.platform.d.a(dVar, "lobby_v2_provider_item_" + lobbyV2ProviderDetailsModel.getId());
            jg6 jg6VarC = gg6.c(62, fw20.a(R.dimen._8sdp, bVarI));
            fg6 fg6VarB = gg6.b(((th60) bVarI.O(vh60.a)).a0, 0L, bVarI, 0, 14);
            boolean zA = bVarI.A(lobbyV2ProviderDetailsModel) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: r7t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function2 function3 = function2;
                        if (function3 != null) {
                            function3.invoke(lobbyV2ProviderDetailsModel, Integer.valueOf(i));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            op8 op8VarB = pp8.b(-1462882800, new tv0(lobbyV2ProviderDetailsModel, 1), bVarI);
            bVarI = bVarI;
            rg6.b((Function0) objY, dVarA, false, null, fg6VarB, jg6VarC, null, null, op8VarB, bVarI, 100663296, 204);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(lobbyV2ProviderDetailsModel, i, function2, i2) { // from class: s7t
                public final /* synthetic */ LobbyV2ProviderDetailsModel b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Function2 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    t7t.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
