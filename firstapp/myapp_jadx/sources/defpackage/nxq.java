package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class nxq {
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    public static mxq a(lxq lxqVar, oxq oxqVar) {
        String strA;
        ekq ekqVar;
        String str = lxqVar.a;
        qcn<ekq> qcnVar = lxqVar.j;
        ekq ekqVar2 = (ekq) CollectionsKt.firstOrNull(qcnVar);
        String str2 = ekqVar2 != null ? ekqVar2.a : null;
        if (str2 == null) {
            str2 = "";
        }
        UiText uiText = lxqVar.c.b;
        BigDecimal bigDecimal = null;
        hlr hlrVar = lxqVar.f;
        String str3 = lxqVar.b;
        String str4 = str2;
        String str5 = lxqVar.g;
        String strA2 = ukd0.a(2, lxqVar.d, true, true);
        BigDecimal bigDecimal2 = lxqVar.e;
        if (bigDecimal2 != null) {
            rkd0 rkd0Var = new rkd0(bigDecimal2);
            if (lxqVar.f == hlr.ONGOING) {
                rkd0Var = null;
            }
            if (rkd0Var != null) {
                bigDecimal = rkd0Var.a;
            }
            if (bigDecimal != null) {
                strA = ukd0.a(2, bigDecimal, true, true);
            } else {
                strA = "--";
            }
        } else {
            strA = "--";
        }
        ekq ekqVar3 = (ekq) CollectionsKt.firstOrNull(qcnVar);
        return new mxq(str, str4, uiText, hlrVar, str3, str5, strA2, strA, ekqVar3 != null ? ekqVar3.b : "", lxqVar.l && (ekqVar = (ekq) CollectionsKt.firstOrNull(qcnVar)) != null && (StringsKt.U(ekqVar.a) ^ true), oxqVar);
    }
}
