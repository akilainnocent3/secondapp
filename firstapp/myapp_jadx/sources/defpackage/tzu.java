package defpackage;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderRequest;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import com.sportygames.commons.SportyGamesManager;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tzu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tzu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Event event;
        BetBuilderOutcome betBuilderOutcome;
        List<BetBuilderRequest> list;
        qq80 binding;
        qq80 binding2;
        qq80 binding3;
        qq80 binding4;
        w3c0 w3c0Var;
        qq80 binding5;
        qq80 binding6;
        CharSequence text;
        w3c0 w3c0Var2;
        qq80 binding7;
        String str;
        qq80 binding8;
        CharSequence text2;
        qq80 binding9;
        CharSequence text3;
        w3c0 w3c0Var3;
        qq80 binding10;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) obj;
                int i2 = MatchEventDetailActivity.U;
                if (matchEventDetailActivity.I1().b.K() && (event = matchEventDetailActivity.F) != null && (betBuilderOutcome = matchEventDetailActivity.E) != null) {
                    String cMSString = matchEventDetailActivity.getCMSString(R.string.page_instant_virtual__bet_builder, new Object[0]);
                    String str2 = event.eventId;
                    String strA = matchEventDetailActivity.z1().a();
                    String str3 = betBuilderOutcome.id;
                    matchEventDetailActivity.z1();
                    List<BetBuilderRequest> list2 = betBuilderOutcome.originalData;
                    ArrayList arrayListA = kw5.a(list2);
                    for (BetBuilderRequest betBuilderRequest : list2) {
                        String str4 = betBuilderRequest.marketId;
                        if (str4 == null) {
                            str4 = "";
                        }
                        Market marketD = sqo.d(event, str4);
                        String str5 = betBuilderRequest.outcomeId;
                        if (str5 == null) {
                            str5 = "";
                        }
                        Outcome outcomeH = sqo.h(marketD, str5);
                        if (marketD != null && outcomeH != null) {
                            String str6 = event.eventId;
                            String str7 = str6 == null ? "" : str6;
                            String str8 = betBuilderRequest.marketId;
                            String str9 = str8 == null ? "" : str8;
                            String str10 = betBuilderRequest.outcomeId;
                            String str11 = str10 == null ? "" : str10;
                            String str12 = marketD.title;
                            String str13 = str12 == null ? "" : str12;
                            String str14 = outcomeH.desc;
                            String str15 = str14 == null ? "" : str14;
                            String str16 = outcomeH.odds;
                            String str17 = str16 == null ? "" : str16;
                            String str18 = event.homeTeamName;
                            String str19 = str18 == null ? "" : str18;
                            String str20 = event.awayTeamName;
                            String str21 = str20 == null ? "" : str20;
                            String str22 = outcomeH.probability;
                            arrayListA.add(new BetSlipData(str7, str9, str11, str13, str15, str17, str19, str21, str22 == null ? "" : str22, false));
                        }
                    }
                    int size = arrayListA.size();
                    int i3 = 0;
                    String strA2 = "";
                    while (i3 < size) {
                        Object obj2 = arrayListA.get(i3);
                        i3++;
                        BetSlipData betSlipData = (BetSlipData) obj2;
                        String str23 = betSlipData.marketId;
                        if (str23 == null) {
                            str23 = "";
                        }
                        Market marketD2 = sqo.d(event, str23);
                        String str24 = betSlipData.outcomeId;
                        if (str24 == null) {
                            str24 = "";
                        }
                        Outcome outcomeH2 = sqo.h(marketD2, str24);
                        if (!TextUtils.isEmpty(strA2)) {
                            strA2 = strA2.concat("::");
                        }
                        String str25 = outcomeH2.desc;
                        String str26 = marketD2.title;
                        if (str26 == null) {
                            str26 = "";
                        }
                        strA2 = lx5.a(strA2, str25, "---", str26);
                    }
                    BetSlipData betSlipData2 = new BetSlipData(str2, strA, str3, strA2, cMSString, betBuilderOutcome.odds, event.homeTeamName, event.awayTeamName, betBuilderOutcome.probability, false);
                    BigDecimal bigDecimal = sqo.a;
                    String strB = sqo.b(betSlipData2.eventId, betSlipData2.marketId, betSlipData2.outcomeId);
                    if (((n4p) matchEventDetailActivity.C1()).q(strB) != null) {
                        b.a title = new b.a(matchEventDetailActivity).setTitle(matchEventDetailActivity.getCMSString(R.string.page_instant_virtual__warning, new Object[0]));
                        title.a.f = matchEventDetailActivity.getCMSString(R.string.page_instant_virtual__you_have_the_duplicate_betslip, new Object[0]);
                        title.c(matchEventDetailActivity.getCMSString(R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: nzu
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                int i5 = MatchEventDetailActivity.U;
                                matchEventDetailActivity.I1().A1();
                            }
                        });
                        title.create().show();
                    } else {
                        int size2 = 0;
                        o4p o4pVar = ((n4p) matchEventDetailActivity.C1()).A().c;
                        ((n4p) matchEventDetailActivity.C1()).v(strB, betSlipData2);
                        tlo tloVarC1 = matchEventDetailActivity.C1();
                        BetBuilderOutcome betBuilderOutcome2 = matchEventDetailActivity.E;
                        String str27 = betBuilderOutcome2 != null ? betBuilderOutcome2.id : null;
                        if (betBuilderOutcome2 != null && (list = betBuilderOutcome2.originalData) != null) {
                            size2 = list.size();
                        }
                        ((n4p) tloVarC1).J(size2, str27);
                        ((n4p) matchEventDetailActivity.C1()).x(null);
                        matchEventDetailActivity.S1();
                        matchEventDetailActivity.a2();
                        matchEventDetailActivity.U1(o4pVar);
                        matchEventDetailActivity.I1().A1();
                    }
                    matchEventDetailActivity.W1(new a5o.e(((n4p) matchEventDetailActivity.C1()).c()));
                    y8j.a(matchEventDetailActivity.getFullStoryCommonManager(), AnalyticsEvent.IV__BET_BUILDER__ADD_TO_BETSLIP_BTN);
                }
                break;
            case 1:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(17);
                }
                if (window != null) {
                    window.setWindowAnimations(R.style.AnimBottom);
                }
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                if (w3c0Var4 != null && w3c0Var4.R.getVisibility() == 0) {
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && (binding9 = w3c0Var5.d.getBinding()) != null && (text3 = binding9.G.getText()) != null && text3.equals("0") && (w3c0Var3 = (w3c0) q1c0Var.b) != null && (binding10 = w3c0Var3.d.getBinding()) != null) {
                        binding10.G.setText("1.01");
                    }
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    String str28 = "0.00";
                    if (c.l((w3c0Var6 == null || (binding8 = w3c0Var6.e.getBinding()) == null || (text2 = binding8.b.getText()) == null) ? null : text2.toString(), "0", false) && (w3c0Var2 = (w3c0) q1c0Var.b) != null && (binding7 = w3c0Var2.e.getBinding()) != null) {
                        TextView textView = binding7.b;
                        try {
                            str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(q1c0Var.G.get(1).getMinAmount());
                            str.getClass();
                        } catch (Exception unused) {
                            str = "0.00";
                        }
                        textView.setText(str);
                    }
                    w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                    if (c.l((w3c0Var7 == null || (binding6 = w3c0Var7.d.getBinding()) == null || (text = binding6.b.getText()) == null) ? null : text.toString(), "0", false) && (w3c0Var = (w3c0) q1c0Var.b) != null && (binding5 = w3c0Var.d.getBinding()) != null) {
                        TextView textView2 = binding5.b;
                        try {
                            String str29 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(q1c0Var.G.get(0).getMinAmount());
                            str29.getClass();
                            str28 = str29;
                        } catch (Exception unused2) {
                        }
                        textView2.setText(str28);
                    }
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (w3c0Var8 != null && (binding4 = w3c0Var8.e.getBinding()) != null) {
                        binding4.i.setEnabled(false);
                    }
                    w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                    if (w3c0Var9 != null && (binding3 = w3c0Var9.d.getBinding()) != null) {
                        binding3.i.setEnabled(false);
                    }
                    w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                    if (w3c0Var10 != null && (binding2 = w3c0Var10.d.getBinding()) != null) {
                        binding2.H.setEnabled(false);
                    }
                }
                w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                if (w3c0Var11 != null && (binding = w3c0Var11.e.getBinding()) != null) {
                    binding.H.setEnabled(true);
                }
                q1c0Var.s1 = q1c0Var.w1;
                q1c0Var.r0 = false;
                w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                if (w3c0Var12 != null) {
                    w3c0Var12.R.setVisibility(0);
                }
                q1c0Var.n2();
                break;
        }
        return Unit.a;
    }
}
