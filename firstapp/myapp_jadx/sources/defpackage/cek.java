package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.e;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class cek implements a5k {
    public final lfb0 a;
    public final psm b;
    public final jrm c;

    public cek(lfb0 lfb0Var, qqe0 qqe0Var, psm psmVar, jrm jrmVar) {
        lfb0Var.getClass();
        psmVar.getClass();
        jrmVar.getClass();
        this.a = lfb0Var;
        this.b = psmVar;
        this.c = jrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029f  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0255  */
    /* JADX WARN: Code duplicated, block: B:91:0x0261  */
    /* JADX WARN: Code duplicated, block: B:99:0x0288  */
    @Override // defpackage.a5k
    public final twb a(OrderBetType orderBetType, List<? extends Selection> list, int i, String str, double d) {
        int i2;
        int i3;
        Object obj;
        m980 m980Var;
        m980 m980Var2;
        boolean z;
        Object bVar;
        UiText uiText;
        List<PreCannedBBOutcome> list2;
        UiText stringUiText;
        String str2;
        String strB;
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        Double dH;
        Sport sport;
        list.getClass();
        str.getClass();
        if (list.size() > 1) {
            int size = list.size();
            StringUiText stringUiText2 = vch0.a;
            return new twb.d(orderBetType, size, new ResourceUiText(R.string.component_betslip__only_1_selection_supported));
        }
        boolean zIsEmpty = list.isEmpty();
        int i4 = 0;
        psm psmVar = this.b;
        if (zIsEmpty) {
            StringUiText stringUiText3 = vch0.a;
            ConcatUiText concatUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.common_functions__balance), new StringUiText(": "), new StringUiText(str)});
            String str3 = b6y.a.format(d);
            str3.getClass();
            return new twb.b(orderBetType, stringUiText3, stringUiText3, stringUiText3, "", concatUiText, new ResourceUiText(R.string.component_betslip__min_vstake, ay0.S(new Object[]{str3})), m980.e.a, new kmn(i4), false, false, false, new ResourceUiText(R.string.component_betslip__place_auto_bet), psmVar.B(), uxs.DISABLE);
        }
        Selection selection = (Selection) CollectionsKt.T(list);
        boolean zT = g880.t(selection);
        Outcome outcome = selection.c;
        Event event = selection.a;
        if (zT) {
            m980Var2 = m980.c.a;
            i2 = 0;
            obj = ": ";
        } else {
            jrm jrmVar = this.c;
            if (jrmVar.M()) {
                i2 = 0;
                if (((Boolean) jrmVar.l1().getOrDefault(selection, Boolean.FALSE)).booleanValue()) {
                    i3 = 1;
                }
                boolean zBooleanValue = ((Boolean) jrmVar.A0().getOrDefault(selection, Boolean.FALSE)).booleanValue();
                boolean zQ = selection.q();
                if (i3 == 0 || zBooleanValue || zQ) {
                    obj = ": ";
                    m980Var = m980.b.a;
                } else {
                    obj = ": ";
                    if (event.estimateStartTime - System.currentTimeMillis() > ((long) (86400 * i)) * 1000) {
                        m980Var = m980.d.a;
                    } else if (qz3.i(selection)) {
                        m980Var = m980.f.a;
                    } else {
                        m980Var = qz3.j(selection) ? m980.g.a : m980.a.a;
                    }
                }
                m980Var2 = m980Var;
            } else {
                i2 = 0;
            }
            i3 = i2;
            boolean zBooleanValue2 = ((Boolean) jrmVar.A0().getOrDefault(selection, Boolean.FALSE)).booleanValue();
            boolean zQ2 = selection.q();
            if (i3 == 0) {
                obj = ": ";
                m980Var = m980.b.a;
            } else {
                obj = ": ";
                m980Var = m980.b.a;
            }
            m980Var2 = m980Var;
        }
        mfb0 mfb0VarE = this.a.e((event == null || (sport = event.sport) == null) ? null : sport.id);
        String strA = mfb0VarE != null ? mfb0VarE.a() : null;
        try {
            zi50.a aVar = zi50.b;
            if (!b3.U(event.eventId)) {
                if (b3.T(event.eventId)) {
                    bVar = vch0.a;
                } else {
                    String str4 = event.homeTeamName;
                    str4.getClass();
                    StringUiText stringUiText4 = vch0.a;
                    StringUiText stringUiText5 = new StringUiText(str4);
                    z = true;
                    try {
                        ColoredUiText coloredUiText = new ColoredUiText(new StringUiText(" vs "), Integer.valueOf(R.color.text_type1_secondary), null);
                        String str5 = event.awayTeamName;
                        str5.getClass();
                        StringUiText stringUiText6 = new StringUiText(str5);
                        UiText[] uiTextArr = new UiText[3];
                        uiTextArr[i2] = stringUiText5;
                        uiTextArr[1] = coloredUiText;
                        uiTextArr[2] = stringUiText6;
                        bVar = new ConcatUiText(uiTextArr);
                    } catch (Throwable th) {
                        th = th;
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                uiText = (UiText) bVar;
                if (uiText == null) {
                    uiText = vch0.a;
                }
                CharSequence charSequenceB = e.b(selection, e.a.C0425a.a);
                StringUiText stringUiText7 = vch0.a;
                StringUiText stringUiText8 = new StringUiText(charSequenceB);
                list2 = outcome.childOutcomes;
                list2.getClass();
                if (list2.isEmpty()) {
                    String str6 = outcome.desc;
                    str6.getClass();
                    stringUiText = new StringUiText(str6);
                } else {
                    stringUiText = new ResourceUiText(R.string.bet_builder__bet_builder);
                }
                str2 = outcome.odds;
                if (str2 == null) {
                    strB = "--";
                } else {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null || (dH = b.h(str2)) == null || (strB = gky.a.b(dH.doubleValue(), z)) == null) {
                        strB = "--";
                    }
                }
                String str7 = strB;
                ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__balance);
                StringUiText stringUiText9 = new StringUiText(obj);
                StringUiText stringUiText10 = new StringUiText(str);
                UiText[] uiTextArr2 = new UiText[3];
                uiTextArr2[i2] = resourceUiText3;
                uiTextArr2[1] = stringUiText9;
                uiTextArr2[2] = stringUiText10;
                ConcatUiText concatUiText2 = new ConcatUiText(uiTextArr2);
                String str8 = b6y.a.format(d);
                str8.getClass();
                ResourceUiText resourceUiText4 = new ResourceUiText(R.string.component_betslip__min_vstake, ay0.S(new Object[]{str8}));
                if (Intrinsics.g(m980Var2, m980.a.a)) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__place_auto_bet);
                } else {
                    if (!Intrinsics.g(m980Var2, m980.c.a) && !Intrinsics.g(m980Var2, m980.b.a)) {
                        if (Intrinsics.g(m980Var2, m980.d.a)) {
                            resourceUiText2 = new ResourceUiText(R.string.component_betslip__auto_bet_exceed_max_days, ay0.S(new Object[]{Integer.valueOf(i)}));
                        } else if (Intrinsics.g(m980Var2, m980.f.a)) {
                            resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_suspended);
                        } else if (Intrinsics.g(m980Var2, m980.g.a)) {
                            resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_unavailable);
                        } else {
                            if (Intrinsics.g(m980Var2, m980.e.a)) {
                                uhc.a();
                                return null;
                            }
                            resourceUiText = new ResourceUiText(R.string.component_betslip__place_auto_bet);
                        }
                        return new twb.a(orderBetType, strA, uiText, stringUiText8, stringUiText, str7, concatUiText2, resourceUiText4, m980Var2, new kmn(i2), false, false, false, resourceUiText2, psmVar.B(), uxs.DISABLE);
                    }
                    resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_not_eligible);
                }
                resourceUiText2 = resourceUiText;
                return new twb.a(orderBetType, strA, uiText, stringUiText8, stringUiText, str7, concatUiText2, resourceUiText4, m980Var2, new kmn(i2), false, false, false, resourceUiText2, psmVar.B(), uxs.DISABLE);
            }
            String str9 = selection.b.desc;
            str9.getClass();
            StringUiText stringUiText11 = vch0.a;
            bVar = new StringUiText(str9);
            z = true;
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        uiText = (UiText) bVar;
        if (uiText == null) {
            uiText = vch0.a;
        }
        CharSequence charSequenceB2 = e.b(selection, e.a.C0425a.a);
        StringUiText stringUiText12 = vch0.a;
        StringUiText stringUiText13 = new StringUiText(charSequenceB2);
        list2 = outcome.childOutcomes;
        list2.getClass();
        if (list2.isEmpty()) {
            stringUiText = new ResourceUiText(R.string.bet_builder__bet_builder);
        } else {
            String str10 = outcome.desc;
            str10.getClass();
            stringUiText = new StringUiText(str10);
        }
        str2 = outcome.odds;
        if (str2 == null) {
            strB = "--";
        } else {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                strB = "--";
            } else {
                strB = "--";
            }
        }
        String str11 = strB;
        ResourceUiText resourceUiText5 = new ResourceUiText(R.string.common_functions__balance);
        StringUiText stringUiText14 = new StringUiText(obj);
        StringUiText stringUiText15 = new StringUiText(str);
        UiText[] uiTextArr3 = new UiText[3];
        uiTextArr3[i2] = resourceUiText5;
        uiTextArr3[1] = stringUiText14;
        uiTextArr3[2] = stringUiText15;
        ConcatUiText concatUiText3 = new ConcatUiText(uiTextArr3);
        String str12 = b6y.a.format(d);
        str12.getClass();
        ResourceUiText resourceUiText6 = new ResourceUiText(R.string.component_betslip__min_vstake, ay0.S(new Object[]{str12}));
        if (Intrinsics.g(m980Var2, m980.a.a)) {
            resourceUiText = new ResourceUiText(R.string.component_betslip__place_auto_bet);
        } else {
            if (!Intrinsics.g(m980Var2, m980.c.a)) {
                if (Intrinsics.g(m980Var2, m980.d.a)) {
                    resourceUiText2 = new ResourceUiText(R.string.component_betslip__auto_bet_exceed_max_days, ay0.S(new Object[]{Integer.valueOf(i)}));
                } else if (Intrinsics.g(m980Var2, m980.f.a)) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_suspended);
                } else if (Intrinsics.g(m980Var2, m980.g.a)) {
                    resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_unavailable);
                } else {
                    if (Intrinsics.g(m980Var2, m980.e.a)) {
                        uhc.a();
                        return null;
                    }
                    resourceUiText = new ResourceUiText(R.string.component_betslip__place_auto_bet);
                }
                return new twb.a(orderBetType, strA, uiText, stringUiText13, stringUiText, str11, concatUiText3, resourceUiText6, m980Var2, new kmn(i2), false, false, false, resourceUiText2, psmVar.B(), uxs.DISABLE);
            }
            resourceUiText = new ResourceUiText(R.string.component_betslip__the_selection_is_not_eligible);
        }
        resourceUiText2 = resourceUiText;
        return new twb.a(orderBetType, strA, uiText, stringUiText13, stringUiText, str11, concatUiText3, resourceUiText6, m980Var2, new kmn(i2), false, false, false, resourceUiText2, psmVar.B(), uxs.DISABLE);
    }
}
