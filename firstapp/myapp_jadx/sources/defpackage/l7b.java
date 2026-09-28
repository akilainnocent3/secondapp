package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.core.model.patron.Country;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l7b implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7b(String str, int i) {
        this.a = 1;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Country country = (Country) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mw90.b(country.getIcon(), "country_flag", j.r(d.a.b, 24.0f), erz.a(R.drawable.ic_sportybet_logo_flag, 0, aVar), null, null, null, null, d0b.a.d, 0.0f, null, aVar, 432, 6, 31728);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                x0u.a((String) obj3, (a) obj, qj40.a(1));
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                fu2 fu2VarS0 = ((kab0) obj3).s0();
                PagingFetchType pagingFetchType = PagingFetchType.ARCHIVE_MORE;
                pagingFetchType.getClass();
                ej5.c(o8i0.d(fu2VarS0), null, null, new ut2(fu2VarS0, pagingFetchType, iIntValue2, iIntValue3, null), 3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l7b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
