package defpackage;

import android.view.View;
import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.SGHamburgerMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w920 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w920(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BookingData bookingData;
        String str;
        String str2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                x920 x920Var = (x920) obj2;
                jox joxVar = (jox) obj;
                if (joxVar instanceof jox.a) {
                    zha0 zha0Var = (zha0) ((jox.a) joxVar).a;
                    Object value = ((ei20) x920Var.F.getValue()).f.a.getValue();
                    UIState.Success success = value instanceof UIState.Success ? (UIState.Success) value : null;
                    if (zha0Var == null || success == null || (str = (bookingData = (BookingData) success.getData()).shareURL) == null || (str2 = bookingData.shareCode) == null) {
                        zyf0.b(R.string.common_feedback__something_went_wrong_tip, 0);
                    } else {
                        x920Var.n0(zha0Var, str, str2);
                    }
                } else if (joxVar instanceof jox.c) {
                    zyf0.c(1, ((jox.c) joxVar).a.getMessage());
                }
                break;
            default:
                int i2 = SGHamburgerMenu.M;
                ((View) obj).getClass();
                Function0<Unit> function0 = ((SGHamburgerMenu.b) obj2).i;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
