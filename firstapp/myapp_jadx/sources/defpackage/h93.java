package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.TournamentConfigVO;
import com.sportygames.commons.tournament.model.TournamentHistoryResponse;
import java.util.HashSet;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h93 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h93(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Resources resources;
        Resources resources2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(!((HashSet) obj2).contains(str));
            default:
                h4g0 h4g0Var = (h4g0) obj2;
                TournamentHistoryResponse tournamentHistoryResponse = (TournamentHistoryResponse) obj;
                if (tournamentHistoryResponse != null) {
                    Long tournamentId = tournamentHistoryResponse.getTournamentId();
                    TournamentConfigVO tournamentConfigVO = h4g0Var.b;
                    if (Intrinsics.g(tournamentId, tournamentConfigVO != null ? tournamentConfigVO.getId() : null)) {
                        i4g0 i4g0Var = h4g0Var.d;
                        if (i4g0Var != null) {
                            i4g0Var.cancel();
                        }
                        h4g0Var.d = null;
                        kyi kyiVar = h4g0Var.a;
                        if (kyiVar == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar.d.setVisibility(8);
                        kyi kyiVar2 = h4g0Var.a;
                        if (kyiVar2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar2.e.setVisibility(8);
                        kyi kyiVar3 = h4g0Var.a;
                        if (kyiVar3 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar3.f.setVisibility(8);
                        kyi kyiVar4 = h4g0Var.a;
                        if (kyiVar4 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar4.B.setVisibility(8);
                        kyi kyiVar5 = h4g0Var.a;
                        if (kyiVar5 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar5.w.setVisibility(0);
                        kyi kyiVar6 = h4g0Var.a;
                        if (kyiVar6 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar6.b.setVisibility(0);
                        kyi kyiVar7 = h4g0Var.a;
                        if (kyiVar7 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar7.i.setVisibility(8);
                        kyi kyiVar8 = h4g0Var.a;
                        if (kyiVar8 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar8.v.setVisibility(8);
                        h4g0Var.e = "stopped";
                        kyi kyiVar9 = h4g0Var.a;
                        if (kyiVar9 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams = kyiVar9.C.getLayoutParams();
                        Context context = h4g0Var.getContext();
                        layoutParams.width = (context == null || (resources2 = context.getResources()) == null) ? 0 : resources2.getDimensionPixelSize(R.dimen._35sdp);
                        Context context2 = h4g0Var.getContext();
                        layoutParams.height = (context2 == null || (resources = context2.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen._33sdp);
                        kyi kyiVar10 = h4g0Var.a;
                        if (kyiVar10 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kyiVar10.C.setLayoutParams(layoutParams);
                        kyi kyiVar11 = h4g0Var.a;
                        if (kyiVar11 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        TextView textView = kyiVar11.W;
                        String name = tournamentHistoryResponse.getName();
                        if (name == null) {
                            name = "";
                        }
                        textView.setText(name.concat("! "));
                        if (tournamentHistoryResponse.getWinAmount() == null || Intrinsics.c(tournamentHistoryResponse.getWinAmount(), 0.0d)) {
                            kyi kyiVar12 = h4g0Var.a;
                            if (kyiVar12 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            kyiVar12.V.setText(pm5.GOOD_EFFORT.a());
                            kyi kyiVar13 = h4g0Var.a;
                            if (kyiVar13 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            kyiVar13.U.setText("");
                            kyi kyiVar14 = h4g0Var.a;
                            if (kyiVar14 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            kyiVar14.F.setBackgroundResource(R.drawable.tournament_banner_bg);
                        } else {
                            kyi kyiVar15 = h4g0Var.a;
                            if (kyiVar15 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            kyiVar15.V.setText(pm5.YOU_WON.a());
                            String strP = c.p(String.valueOf(tournamentHistoryResponse.getWinAmount().doubleValue()), "!", "", false);
                            kyi kyiVar16 = h4g0Var.a;
                            if (kyiVar16 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            TextView textView2 = kyiVar16.U;
                            op5 op5Var = op5.a;
                            TournamentConfigVO tournamentConfigVO2 = h4g0Var.b;
                            String currency = tournamentConfigVO2 != null ? tournamentConfigVO2.getCurrency() : null;
                            String str2 = currency != null ? currency : "";
                            op5Var.getClass();
                            String strI = op5.i(str2);
                            TreeMap treeMap = pw.a;
                            textView2.setText(strI + " " + pw.c(pw.n(Double.parseDouble(strP))) + "!");
                            kyi kyiVar17 = h4g0Var.a;
                            if (kyiVar17 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            kyiVar17.F.setBackgroundResource(R.drawable.tournament_banner_bg_gold);
                        }
                        h4g0.n0("tournament_end_carousel_banner");
                    }
                }
                return Unit.a;
        }
    }
}
