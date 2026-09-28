package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.common.Range;
import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.android.ugpay.model.BountyHintUiState;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class af8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ af8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Long lValueOf;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                df8 df8Var = (df8) obj4;
                jlv jlvVar = (jlv) obj3;
                cx cxVar = (cx) obj;
                if (df8Var.X == null) {
                    jlvVar.m(new fsd(!StringsKt.U(cxVar.a) && (cxVar.c instanceof kcg.a), new ResourceUiText(R.string.common_functions__top_up_now), new StringUiText("")));
                    return Unit.a;
                }
                cxVar.getClass();
                xrd xrdVar = df8Var.X;
                xrdVar.getClass();
                String str = xrdVar.c;
                ArrayList arrayList = xrdVar.a;
                ssw<List<ug30>> sswVar = df8Var.P;
                ssw<BountyHintUiState> sswVar2 = df8Var.R;
                jlv<fsd> jlvVar2 = df8Var.V;
                String str2 = cxVar.a;
                kcg kcgVar = cxVar.c;
                if (StringsKt.U(str2) || !(kcgVar instanceof kcg.a)) {
                    jlvVar2.m(new fsd(false, new ResourceUiText(R.string.common_functions__top_up_now), new StringUiText("")));
                    List listT0 = CollectionsKt.t0(arrayList, 6);
                    ArrayList arrayList2 = new ArrayList(l48.r(listT0, 10));
                    Iterator it = listT0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new ug30(false, (QuickInputItem) it.next()));
                    }
                    sswVar.m(arrayList2);
                    if (StringsKt.U(str2)) {
                        String strE = a8b.e();
                        strE.getClass();
                        sswVar2.m(new BountyHintUiState.b(str, strE));
                    } else {
                        sswVar2.m(null);
                    }
                } else {
                    BigDecimal bigDecimal = new BigDecimal(str2);
                    List listT1 = CollectionsKt.t0(arrayList, 6);
                    ArrayList arrayList3 = new ArrayList(l48.r(listT1, 10));
                    Iterator it2 = listT1.iterator();
                    QuickInputItem quickInputItem = null;
                    while (it2.hasNext()) {
                        QuickInputItem quickInputItem2 = (QuickInputItem) it2.next();
                        Iterator it3 = it2;
                        boolean z = p54.b(new BigDecimal(quickInputItem2.amount + quickInputItem2.bounty)).compareTo(bigDecimal) == 0;
                        ug30 ug30Var = new ug30(z, quickInputItem2);
                        if (z) {
                            quickInputItem = quickInputItem2;
                        }
                        arrayList3.add(ug30Var);
                        it2 = it3;
                    }
                    sswVar.m(arrayList3);
                    if (quickInputItem != null) {
                        BigDecimal bigDecimalSubtract = bigDecimal.subtract(p54.b(new BigDecimal(quickInputItem.bounty)));
                        bigDecimalSubtract.getClass();
                        df8Var.M = bigDecimalSubtract;
                    }
                    ArrayList arrayList4 = xrdVar.b;
                    int size = arrayList4.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            obj2 = arrayList4.get(i2);
                            int i3 = i2 + 1;
                            Range range = (Range) obj2;
                            long jLongValue = p54.c(bigDecimal).longValue();
                            int i4 = size;
                            if (range.lower > jLongValue || jLongValue > range.upper) {
                                i2 = i3;
                                size = i4;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Range range2 = (Range) obj2;
                    if (range2 == null) {
                        lValueOf = null;
                    } else {
                        int i5 = range2.feeType;
                        if (i5 == 1) {
                            lValueOf = Long.valueOf(range2.amount);
                        } else if (i5 == 2) {
                            BigDecimal scale = df8Var.M.multiply(new BigDecimal(String.valueOf(range2.ratio))).setScale(1, RoundingMode.FLOOR);
                            scale.getClass();
                            lValueOf = Long.valueOf(p54.c(scale).longValue());
                        } else {
                            lValueOf = null;
                        }
                    }
                    if (lValueOf != null) {
                        String strN = bjb0.N(df8Var.M);
                        String strV = bjb0.V(lValueOf.longValue());
                        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__pay_vnum__KE, ay0.S(new Object[]{strN}));
                        String strE2 = a8b.e();
                        strE2.getClass();
                        jlvVar2.m(new fsd(true, resourceUiText, new ResourceUiText(R.string.page_payment__get_vcurrency_vnum_extra_after_top_up__KE, ay0.S(new Object[]{strE2, strV}))));
                    } else if (quickInputItem != null) {
                        String strN2 = bjb0.N(df8Var.M);
                        String strV2 = bjb0.V(quickInputItem.bounty);
                        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__pay_vnum__KE, ay0.S(new Object[]{strN2}));
                        String strE3 = a8b.e();
                        strE3.getClass();
                        jlvVar2.m(new fsd(true, resourceUiText2, new ResourceUiText(R.string.page_payment__get_vcurrency_vnum_extra_after_top_up__KE, ay0.S(new Object[]{strE3, strV2}))));
                    } else {
                        jlvVar2.m(new fsd(true, new ResourceUiText(R.string.common_functions__top_up_now), new StringUiText("")));
                    }
                    if (bigDecimal.compareTo(p54.b(new BigDecimal(str))) < 0 || lValueOf == null) {
                        String strE4 = a8b.e();
                        strE4.getClass();
                        sswVar2.m(new BountyHintUiState.b(str, strE4));
                    } else {
                        sswVar2.m(new BountyHintUiState.a(bjb0.N(bigDecimal), bjb0.V(lValueOf.longValue())));
                    }
                }
                return Unit.a;
            default:
                return new bxg0((Event) obj4, (Market) obj3, (Outcome) obj);
        }
    }
}
