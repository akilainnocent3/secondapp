package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class vxk implements uxk {
    public static final Pattern k;
    public final psm a;
    public final nzm b;
    public final rdd0 c;
    public final y8j d;
    public final wwd0 e;
    public final v340 f;
    public wwd0 g;
    public wwd0 h;
    public ri90 i;
    public boolean j;

    public static final class a {
        public final GiftDetails a;
        public final boolean b;
        public final cyk c;
        public final String d;
        public final String e;
        public final boolean f;
        public final List<GiftDetails> g;
        public final boolean h;

        public a(GiftDetails giftDetails, boolean z, cyk cykVar, String str, String str2, boolean z2, List<GiftDetails> list, boolean z3) {
            this.a = giftDetails;
            this.b = z;
            this.c = cykVar;
            this.d = str;
            this.e = str2;
            this.f = z2;
            this.g = list;
            this.h = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f == aVar.f && this.g.equals(aVar.g) && this.h == aVar.h;
        }

        public final int hashCode() {
            GiftDetails giftDetails = this.a;
            return Boolean.hashCode(this.h) + ai50.a(mtg0.a(gmf0.a(gmf0.a((this.c.hashCode() + mtg0.a((giftDetails == null ? 0 : giftDetails.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftEditUiAggregate(selectedGift=");
            sb.append(this.a);
            sb.append(", isVisible=");
            sb.append(this.b);
            sb.append(", giftValueOption=");
            sb.append(this.c);
            sb.append(", totalOdds=");
            sb.append(this.d);
            sb.append(", bonusRate=");
            uts.b(this.e, ", isAddToStakeChecked=", ", applicableGiftList=", sb, this.f);
            sb.append(this.g);
            sb.append(", isAddToStakeConfigEnabled=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("^\\d{0,10}(\\.\\d{0,2})?$");
        patternCompile.getClass();
        k = patternCompile;
    }

    public vxk(psm psmVar, nzm nzmVar, rdd0 rdd0Var, y8j y8jVar) {
        psmVar.getClass();
        nzmVar.getClass();
        rdd0Var.getClass();
        y8jVar.getClass();
        this.a = psmVar;
        this.b = nzmVar;
        this.c = rdd0Var;
        this.d = y8jVar;
        wwd0 wwd0VarA = xwd0.a(byk.j);
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
    }

    @Override // defpackage.uxk
    public final void a(yxk yxkVar) {
        UiText resourceUiText;
        if (this.j) {
            if (yxkVar instanceof yxk.a) {
                c(li90.f.a, AnalyticsEvent.SIM_BETSLIP_GIFT_VALUE_TOGGLE_BTN);
                ri90 ri90Var = this.i;
                if (ri90Var != null) {
                    ri90Var.invoke(new smk.b.C1096b(((yxk.a) yxkVar).a));
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (yxkVar instanceof yxk.e) {
                ri90 ri90Var2 = this.i;
                if (ri90Var2 != null) {
                    ri90Var2.invoke(smk.b.d.a);
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (yxkVar.equals(yxk.c.a)) {
                c(li90.c.a, AnalyticsEvent.SIM_BETSLIP_GIFT_VALUE_CANCEL_BTN);
                ri90 ri90Var3 = this.i;
                if (ri90Var3 != null) {
                    ri90Var3.invoke(smk.b.a.a);
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (yxkVar.equals(yxk.b.a)) {
                c(li90.b.a, AnalyticsEvent.SIM_BETSLIP_GIFT_VALUE_ALL_BTN);
                ri90 ri90Var4 = this.i;
                if (ri90Var4 != null) {
                    ri90Var4.invoke(new smk.b.c(cyk.a.a));
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (yxkVar.equals(yxk.d.a)) {
                c(li90.e.a, AnalyticsEvent.SIM_BETSLIP_GIFT_VALUE_PARTIAL_BTN);
                ri90 ri90Var5 = this.i;
                if (ri90Var5 != null) {
                    ri90Var5.invoke(new smk.b.c(new cyk.b(0)));
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (yxkVar.equals(yxk.f.a)) {
                c(li90.g.a, AnalyticsEvent.SIM_BETSLIP_GIFT_VALUE_USE_BTN);
                ri90 ri90Var6 = this.i;
                if (ri90Var6 != null) {
                    ri90Var6.invoke(smk.b.e.a);
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (yxkVar.equals(yxk.g.a)) {
                c(li90.d.a, AnalyticsEvent.SIM_BETSLIP_GIFT_VALUE_OTHER_GIFTS_BTN);
                ri90 ri90Var7 = this.i;
                if (ri90Var7 != null) {
                    ri90Var7.invoke(smk.b.f.a);
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (!(yxkVar instanceof yxk.h)) {
                uhc.a();
                return;
            }
            ijf0 ijf0Var = ((yxk.h) yxkVar).a;
            if (k.matcher(ijf0Var.a.b).matches()) {
                wwd0 wwd0Var = this.g;
                if (wwd0Var == null) {
                    Intrinsics.n("selectedGiftDetailStateFlow");
                    throw null;
                }
                GiftDetails giftDetails = (GiftDetails) wwd0Var.getValue();
                Integer numValueOf = giftDetails != null ? Integer.valueOf(giftDetails.getKind()) : null;
                if (numValueOf != null && numValueOf.intValue() == 3) {
                    BigDecimal bigDecimalG = b.g(ijf0Var.a.b);
                    if (bigDecimalG == null) {
                        bigDecimalG = BigDecimal.ZERO;
                    }
                    BigDecimal bigDecimalB = p54.b(new BigDecimal(giftDetails.getCurrentBalance()));
                    if (bigDecimalG.compareTo(bigDecimalB) > 0) {
                        StringUiText stringUiText = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.component_coupon__value_cannot_exceed_max_vamount, ay0.S(new Object[]{bigDecimalB}));
                    } else {
                        resourceUiText = vch0.a;
                    }
                    wwd0 wwd0Var2 = this.h;
                    if (wwd0Var2 == null) {
                        Intrinsics.n("giftValueOptionStateFlow");
                        throw null;
                    }
                    cyk bVar = (cyk) wwd0Var2.getValue();
                    if (bVar instanceof cyk.b) {
                        resourceUiText.getClass();
                        bVar = new cyk.b(ijf0Var, resourceUiText);
                    }
                    ri90 ri90Var8 = this.i;
                    if (ri90Var8 != null) {
                        ri90Var8.invoke(new smk.b.c(bVar));
                    } else {
                        Intrinsics.n("emitCommand");
                        throw null;
                    }
                }
            }
        }
    }

    @Override // defpackage.uxk
    public final v340 b() {
        return this.f;
    }

    public final void c(li90 li90Var, String str) {
        this.c.a(li90Var, k00.d);
        y8j.a(this.d, str);
    }
}
