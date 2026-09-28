package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y6p implements Function1 {
    public final /* synthetic */ c7p a;

    public /* synthetic */ y6p(c7p c7pVar) {
        this.a = c7pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        nvk nvkVar;
        ArrayList arrayList;
        Object next;
        Object value2;
        Object value3;
        String str;
        Object value4;
        nvk nvkVar2;
        ArrayList arrayList2;
        Object value5;
        mvk mvkVar = (mvk) obj;
        j7p j7pVar = this.a.e0;
        wwd0 wwd0Var = j7pVar.e;
        wwd0 wwd0Var2 = j7pVar.e;
        wwd0 wwd0Var3 = j7pVar.d;
        mvkVar.getClass();
        if (mvkVar.equals(mvk.a.a)) {
            do {
                value5 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value5, nvk.a((nvk) value5, null, 2)));
        } else if (mvkVar instanceof mvk.b) {
            String str2 = ((ayk) wwd0Var3.getValue()).d;
            Iterator<T> it = ((ayk) wwd0Var3.getValue()).c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((GiftDetails) next).getGiftId(), ((mvk.b) mvkVar).a));
            GiftDetails giftDetails = (GiftDetails) next;
            if ((giftDetails != null ? giftDetails.getGiftId() : null) != null && !Intrinsics.g(giftDetails.getGiftId(), str2)) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(giftDetails.getCurrentBalance());
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimalB = p54.b(bigDecimalValueOf);
                String strN = bjb0.N(bigDecimalB);
                UiText resourceUiText = bigDecimalB.compareTo(BigDecimal.ZERO) > 0 ? new ResourceUiText(R.string.component_coupon__max_vamount, ay0.S(new Object[]{strN})) : vch0.a;
                do {
                    value3 = wwd0Var3.getValue();
                    str = ((mvk.b) mvkVar).a;
                } while (!wwd0Var3.g(value3, ayk.a((ayk) value3, false, false, null, str, strN, dyk.a.a, false, !StringsKt.U(strN), resourceUiText, 71)));
                do {
                    value4 = wwd0Var.getValue();
                    nvkVar2 = (nvk) value4;
                    qcn<dok> qcnVar = nvkVar2.b;
                    arrayList2 = new ArrayList(l48.r(qcnVar, 10));
                    for (dok dokVar : qcnVar) {
                        arrayList2.add(dok.a(dokVar, Intrinsics.g(dokVar.a, str), false, 1535));
                    }
                } while (!wwd0Var.g(value4, nvk.a(nvkVar2, a4h.b(arrayList2), 1)));
            }
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, nvk.a((nvk) value2, null, 2)));
        } else {
            if (!(mvkVar instanceof mvk.c)) {
                uhc.a();
                return null;
            }
            do {
                value = wwd0Var.getValue();
                nvkVar = (nvk) value;
                qcn<dok> qcnVar2 = nvkVar.b;
                arrayList = new ArrayList(l48.r(qcnVar2, 10));
                for (dok dokVar2 : qcnVar2) {
                    boolean zG = Intrinsics.g(dokVar2.a, ((mvk.c) mvkVar).a);
                    boolean z = dokVar2.k;
                    if (zG) {
                        z = !z;
                    }
                    arrayList.add(dok.a(dokVar2, false, z, 1023));
                }
            } while (!wwd0Var.g(value, nvk.a(nvkVar, a4h.b(arrayList), 1)));
        }
        return Unit.a;
    }
}
