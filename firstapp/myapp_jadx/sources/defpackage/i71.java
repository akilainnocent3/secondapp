package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.autobet.AutoBetRequest;
import com.sporty.android.core.model.autobet.AutoBetRequestSelection;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i71 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        fb1 fb1Var = (fb1) this.receiver;
        twb twbVar = (twb) fb1Var.V.getValue();
        if (twbVar instanceof twb.a) {
            ia50 ia50Var = fb1Var.y;
            twb.a aVar = (twb.a) twbVar;
            int value = aVar.a.getValue();
            kmn kmnVar = aVar.j;
            String str = kmnVar.c.a;
            String str2 = kmnVar.a.a;
            String str3 = kmnVar.b.a;
            ArrayList arrayListU = fb1Var.b.U();
            ia50Var.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            arrayListU.getClass();
            long jLongValue = new BigDecimal(str).multiply(BigDecimal.valueOf(10000L)).longValue();
            String strValueOf = String.valueOf(gky.a.c(Double.parseDouble(str2)));
            String strValueOf2 = String.valueOf(gky.a.c(Double.parseDouble(str3)));
            strValueOf.getClass();
            strValueOf2.getClass();
            ArrayList arrayList = new ArrayList(l48.r(arrayListU, 10));
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                Selection selection = (Selection) obj;
                Event event = selection.a;
                Market market = selection.b;
                String str4 = event.eventId;
                str4.getClass();
                String str5 = strValueOf2;
                String str6 = event.productStatus;
                str6.getClass();
                String str7 = event.sport.id;
                str7.getClass();
                String str8 = market.id;
                str8.getClass();
                String str9 = market.specifier;
                String str10 = (str9 == null || str9.length() <= 0) ? null : str9;
                String str11 = selection.c.id;
                str11.getClass();
                arrayList.add(new AutoBetRequestSelection(str4, str6, str7, str8, str10, str11));
                strValueOf2 = str5;
            }
            AutoBetRequest autoBetRequest = new AutoBetRequest(jLongValue, value, strValueOf, strValueOf2, arrayList);
            swb swbVar = ia50Var.a;
            g1i g1iVar = new g1i(ozh.c(new or60(new rwb(swbVar, autoBetRequest, null)), swbVar.a), new jb1(fb1Var, null));
            StringUiText stringUiText = vch0.a;
            kzh.d(ozh.c(new ib1(bm50.b(g1iVar, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), fb1Var, aVar, aVar), fb1Var.a), o8i0.d(fb1Var));
        }
        return Unit.a;
    }
}
