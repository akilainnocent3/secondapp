package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.gp.tz.R;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class x4k {
    public final s05 a;

    public x4k(s05 s05Var) {
        s05Var.getClass();
        this.a = s05Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) throws fk50 {
        w4k w4kVar;
        if (x1bVar instanceof w4k) {
            w4kVar = (w4k) x1bVar;
            int i = w4kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4kVar.d = i - Integer.MIN_VALUE;
            } else {
                w4kVar = new w4k(this, x1bVar);
            }
        } else {
            w4kVar = new w4k(this, x1bVar);
        }
        Object objD = w4kVar.b;
        y5b y5bVar = y5b.a;
        int i2 = w4kVar.d;
        if (i2 == 0) {
            uj50.b(objD);
            w4kVar.a = str;
            w4kVar.d = 1;
            objD = this.a.d(str, w4kVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = w4kVar.a;
            uj50.b(objD);
        }
        BookingData bookingData = (BookingData) objD;
        List listA = i15.a(str, bookingData.outcomes);
        if (!listA.isEmpty()) {
            return new v4k(bookingData, listA);
        }
        StringUiText stringUiText = vch0.a;
        throw new fk50(new ResourceUiText(R.string.page_load_code__all_selections_have_already_settled_and_can_not_be_added));
    }
}
