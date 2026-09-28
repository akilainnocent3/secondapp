package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.domain.model.b;
import com.sportybet.core.domain.model.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ytv {
    public final uti a;
    public final psm b;

    public static final class a {
        public final List<cuv> a;
        public final ResourceUiText b;
        public final wae c;
        public final boolean d;
        public final boolean e;

        public a(List list, ResourceUiText resourceUiText, wae waeVar, boolean z, boolean z2) {
            list.getClass();
            this.a = list;
            this.b = resourceUiText;
            this.c = waeVar;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + mtg0.a((this.c.hashCode() + wh8.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RewardUi(formattedRewards=");
            sb.append(this.a);
            sb.append(", missionCompleteDesc=");
            sb.append(this.b);
            sb.append(", completedDestination=");
            sb.append(this.c);
            sb.append(", hasSportyTVWorldCupPass=");
            sb.append(this.d);
            sb.append(", containsBetslipTheme=");
            return mq0.a(sb, this.e, ")");
        }
    }

    public ytv(uti utiVar, d04 d04Var, psm psmVar) {
        psmVar.getClass();
        this.a = utiVar;
        this.b = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bb -> B:31:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.ArrayList r23, java.lang.String r24, java.lang.String r25, defpackage.x1b r26) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytv.a(java.util.ArrayList, java.lang.String, java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(rtv rtvVar, String str, x1b x1bVar) {
        buv buvVar;
        String str2;
        ResourceUiText resourceUiTextA;
        ResourceUiText resourceUiTextA2;
        ResourceUiText resourceUiTextA3;
        Object resourceUiText;
        if (x1bVar instanceof buv) {
            buvVar = (buv) x1bVar;
            int i = buvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                buvVar.e = i - Integer.MIN_VALUE;
            } else {
                buvVar = new buv(this, x1bVar);
            }
        } else {
            buvVar = new buv(this, x1bVar);
        }
        buv buvVar2 = buvVar;
        Object obj = buvVar2.c;
        y5b y5bVar = y5b.a;
        int i2 = buvVar2.e;
        UiText resourceUiText2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            if (!(rtvVar instanceof rtv.b)) {
                if (rtvVar instanceof rtv.c) {
                    bxt[] bxtVarArr = bxt.b;
                    StringUiText stringUiText = vch0.a;
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.gift__rakeback_boost_gift);
                    rtv.c cVar = (rtv.c) rtvVar;
                    Integer num = cVar.b;
                    Integer num2 = cVar.a;
                    if (num2 != null && num != null) {
                        resourceUiText2 = new ResourceUiText(R.string.gift__mission_boost_gift_detail, ay0.S(new Object[]{String.valueOf(num2), String.valueOf(num)}));
                    }
                    return new cuv("https://s.sporty.net/cms/rakeback_boost_gift_icon_55fed3d788.png", resourceUiText3, resourceUiText2, wtv.b);
                }
                if (rtvVar instanceof rtv.d) {
                    bxt[] bxtVarArr2 = bxt.b;
                    StringUiText stringUiText2 = vch0.a;
                    return new cuv("https://s.sporty.net/cms/fifa_world_cup_open_bet_tab_header_trophy_118d8d286c.webp", new ResourceUiText(R.string.world_cup_mission__wc_pass_bundle_tv_title), new ResourceUiText(R.string.world_cup_mission__wc_pass_reward_expires_vdate), wtv.c);
                }
                if (!(rtvVar instanceof rtv.a)) {
                    uhc.a();
                    return null;
                }
                bxt[] bxtVarArr3 = bxt.b;
                StringUiText stringUiText3 = vch0.a;
                ResourceUiText resourceUiText4 = new ResourceUiText(R.string.gift__betslip_theme);
                Integer num3 = ((rtv.a) rtvVar).a;
                return new cuv("https://s.sporty.net/cms/img_betslip_theme_reward_symbol_26124e26d2.png", resourceUiText4, num3 != null ? new ConcatUiText(new UiText[]{new StringUiText(String.valueOf(num3)), new ResourceUiText(R.string.page_loyalty__x_pick)}) : null, wtv.d);
            }
            bxt[] bxtVarArr4 = bxt.b;
            rtv.b bVar = (rtv.b) rtvVar;
            String strD = s5y.d(new Long(bVar.a));
            buvVar2.a = bVar;
            buvVar2.b = "https://s.sporty.net/cms/ic_golden_coin_3dc3c52f1f.png";
            buvVar2.e = 1;
            Object objG = uti.g(this.a, strD, str, false, buvVar2, 28);
            if (objG == y5bVar) {
                return y5bVar;
            }
            obj = objG;
            str2 = "https://s.sporty.net/cms/ic_golden_coin_3dc3c52f1f.png";
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = buvVar2.b;
            rtvVar = buvVar2.a;
            uj50.b(obj);
        }
        StringUiText stringUiTextD = vch0.d((CharSequence) obj);
        rtv.b bVar2 = (rtv.b) rtvVar;
        ArrayList arrayList = bVar2.b;
        ArrayList arrayList2 = bVar2.c;
        ArrayList arrayList3 = bVar2.d;
        if (!arrayList.isEmpty() || !arrayList2.isEmpty() || !arrayList3.isEmpty()) {
            boolean z = arrayList.contains(b.All) || (arrayList.size() == 1 && arrayList.contains(b.RealSports));
            boolean z2 = arrayList2.contains(c.All) || arrayList2.size() > 1;
            boolean z3 = arrayList3.contains(com.sportybet.core.domain.model.a.All) || arrayList3.size() > 1;
            if (z) {
                resourceUiTextA = new ResourceUiText(R.string.common_games__real_sport);
            } else {
                b bVar3 = (b) CollectionsKt.firstOrNull(arrayList);
                resourceUiTextA = bVar3 != null ? d04.a(bVar3) : null;
            }
            if (z2) {
                resourceUiTextA2 = new ResourceUiText(R.string.page_loyalty__instant_virtual);
            } else {
                c cVar2 = (c) CollectionsKt.firstOrNull(arrayList2);
                resourceUiTextA2 = cVar2 != null ? d04.a(cVar2) : null;
            }
            if (z3) {
                resourceUiTextA3 = new ResourceUiText(R.string.page_loyalty__casino_games);
            } else {
                com.sportybet.core.domain.model.a aVar = (com.sportybet.core.domain.model.a) CollectionsKt.firstOrNull(arrayList3);
                resourceUiTextA3 = aVar != null ? d04.a(aVar) : null;
            }
            if (z && z2 && z3) {
                resourceUiText = new ResourceUiText(R.string.page_loyalty__all_types);
            } else {
                List<UiText> listK = kotlin.collections.b.k(resourceUiTextA, resourceUiTextA2, resourceUiTextA3);
                ArrayList arrayList4 = new ArrayList();
                for (UiText uiText : listK) {
                    if (uiText != null) {
                        arrayList4.add(uiText);
                    }
                }
                if (arrayList4.isEmpty()) {
                    resourceUiText = vch0.a;
                } else {
                    StringUiText stringUiText4 = vch0.a;
                    Iterator it = t38.a(arrayList4, new StringUiText(" / ")).iterator();
                    if (!it.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = ((UiText) next).h((UiText) it.next());
                    }
                    resourceUiText = (UiText) next;
                }
            }
            if (Intrinsics.g(resourceUiText, vch0.a)) {
                resourceUiText = null;
            }
            if (resourceUiText != null) {
                resourceUiText2 = new ResourceUiText(R.string.page_loyalty__usable_in, ay0.S(new Object[]{resourceUiText}));
            }
        }
        return new cuv(str2, stringUiTextD, resourceUiText2, wtv.a);
    }
}
