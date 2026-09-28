package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.common.business.CommonGameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class ev4 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public ev4(List list, Context context, Function0 function0, Function0 function1) {
        this.a = list;
        this.b = context;
        this.c = function0;
        this.d = function1;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            CommonGameDetails commonGameDetails = (CommonGameDetails) this.a.get(iIntValue);
            aVar2.N(-2043076852);
            String imageUrl = commonGameDetails.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String name = commonGameDetails.getName();
            if (name == null) {
                name = "";
            }
            d dVarI = j.i(d35.a(ls7.a(d.a.b, j060.c(4.0f)), 1.0f, r58.d(4289553620L), j060.c(4.0f)), 44.0f);
            boolean zA = aVar2.A(commonGameDetails);
            Context context = this.b;
            boolean zA2 = zA | aVar2.A(context);
            Function0 function0 = this.c;
            boolean zM = zA2 | aVar2.M(function0);
            Function0 function1 = this.d;
            boolean zM2 = zM | aVar2.M(function1);
            Object objY = aVar2.y();
            if (zM2 || objY == a.C0041a.a) {
                objY = new cv4(commonGameDetails, context, function0, function1);
                aVar2.r(objY);
            }
            mw90.a(imageUrl, name, androidx.compose.foundation.d.d(dVarI, false, null, null, (Function0) objY, 15), null, null, d0b.a.c, null, aVar2, 1572864, 1976);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
