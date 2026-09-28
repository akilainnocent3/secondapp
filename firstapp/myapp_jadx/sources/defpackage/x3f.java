package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.spin2win.model.local.BetList;
import com.sportygames.spin2win.model.response.Spin2WinIndividualBetResponse;
import com.sportygames.spin2win.model.response.Spin2WinPlaceBetResponse;
import com.sportygames.spin2win.model.response.WalletInfoResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x3f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<Spin2WinIndividualBetResponse> list;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj2;
                owo owoVar = (owo) obj;
                owoVar.getClass();
                if (!Intrinsics.g((owo) ytwVar.getValue(), owoVar)) {
                    ytwVar.setValue(owoVar);
                }
                break;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.equals("Win")) {
                    ypa0 ypa0VarZ0 = a1b0Var.z0();
                    Context context = a1b0Var.getContext();
                    String string = context != null ? context.getString(R.string.sg_spin2win_sound_win) : null;
                    if (string == null) {
                        string = "";
                    }
                    ypa0VarZ0.A1(0L, string);
                } else if (str.equals("Lost")) {
                    ypa0 ypa0VarZ1 = a1b0Var.z0();
                    Context context2 = a1b0Var.getContext();
                    String string2 = context2 != null ? context2.getString(R.string.sg_spin2win_sound_lose) : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    ypa0VarZ1.A1(0L, string2);
                }
                Spin2WinPlaceBetResponse spin2WinPlaceBetResponse = a1b0Var.W;
                List<Spin2WinIndividualBetResponse> individualBetResponseList = spin2WinPlaceBetResponse != null ? spin2WinPlaceBetResponse.getIndividualBetResponseList() : null;
                ArrayList arrayListV0 = a1b0Var.v0();
                int size = arrayListV0.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayListV0.get(i2);
                    i2++;
                    BetList betList = (BetList) obj3;
                    if (individualBetResponseList != null) {
                        for (Spin2WinIndividualBetResponse spin2WinIndividualBetResponse : individualBetResponseList) {
                            String str2 = "0.00";
                            if (!Intrinsics.g(spin2WinIndividualBetResponse.getBetCategory(), "WHEEL_NUMBERS")) {
                                if (Intrinsics.g(betList.getBetTypeId(), String.valueOf(spin2WinIndividualBetResponse.getBetTypeId()))) {
                                    betList.setBetStatus(spin2WinIndividualBetResponse.getWinStatus() ? "Win" : "Lost");
                                    op5 op5Var = op5.a;
                                    WalletInfoResponse walletInfoResponse = a1b0Var.P;
                                    String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
                                    if (currency == null) {
                                        currency = "";
                                    }
                                    op5Var.getClass();
                                    String strI = op5.i(currency);
                                    TreeMap treeMap = pw.a;
                                    Double payoutAmount = spin2WinIndividualBetResponse.getPayoutAmount();
                                    if (payoutAmount != null) {
                                        try {
                                            list = individualBetResponseList;
                                            try {
                                                String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(payoutAmount.doubleValue());
                                                str3.getClass();
                                                str2 = str3;
                                            } catch (Exception unused) {
                                            }
                                        } catch (Exception unused2) {
                                            list = individualBetResponseList;
                                        }
                                    } else {
                                        list = individualBetResponseList;
                                        str2 = null;
                                    }
                                    betList.setWinAmount(strI + " " + pw.a(str2));
                                }
                                individualBetResponseList = list;
                            } else if (Intrinsics.g(betList.getBetTypeId(), String.valueOf(spin2WinIndividualBetResponse.getBetTypeId())) && Intrinsics.g(betList.getTileText(), spin2WinIndividualBetResponse.getBetType())) {
                                betList.setBetStatus(spin2WinIndividualBetResponse.getWinStatus() ? "Win" : "Lost");
                                op5 op5Var2 = op5.a;
                                WalletInfoResponse walletInfoResponse2 = a1b0Var.P;
                                String currency2 = walletInfoResponse2 != null ? walletInfoResponse2.getCurrency() : null;
                                if (currency2 == null) {
                                    currency2 = "";
                                }
                                op5Var2.getClass();
                                String strI2 = op5.i(currency2);
                                TreeMap treeMap2 = pw.a;
                                Double payoutAmount2 = spin2WinIndividualBetResponse.getPayoutAmount();
                                BetList betList2 = betList;
                                if (payoutAmount2 != null) {
                                    try {
                                        String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(payoutAmount2.doubleValue());
                                        str4.getClass();
                                        str2 = str4;
                                    } catch (Exception unused3) {
                                    }
                                } else {
                                    str2 = null;
                                }
                                betList = betList2;
                                betList.setWinAmount(strI2 + " " + pw.a(str2));
                            }
                            list = individualBetResponseList;
                            individualBetResponseList = list;
                        }
                    }
                    individualBetResponseList = individualBetResponseList;
                }
                wxi wxiVar = a1b0Var.v;
                RecyclerView.f adapter = wxiVar != null ? wxiVar.d.getAdapter() : null;
                pxa0 pxa0Var = adapter instanceof pxa0 ? (pxa0) adapter : null;
                if (pxa0Var != null) {
                    ArrayList arrayList = pxa0Var.a;
                    arrayList.clear();
                    arrayList.addAll(arrayListV0);
                    pxa0Var.notifyDataSetChanged();
                }
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new g1b0(a1b0Var, null), 3);
                break;
        }
        return Unit.a;
    }
}
