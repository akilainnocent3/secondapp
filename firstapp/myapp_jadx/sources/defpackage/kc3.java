package defpackage;

import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kc3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ kc3(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v800 v800Var;
        et7 et7Var;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) fragment;
                BookingCodeInfoDto bookingCodeInfoDtoZ1 = betSuccessfulPageFragment.K.z1();
                if (bookingCodeInfoDtoZ1 != null) {
                    betSuccessfulPageFragment.K.B1(new ez4.a(bookingCodeInfoDtoZ1.getBookingCode(), bookingCodeInfoDtoZ1.getOutcomeInfos() != null ? bookingCodeInfoDtoZ1.getOutcomeInfos().size() : 0));
                }
                break;
            default:
                c000 c000Var = (c000) fragment;
                if (!rvi.b(c000Var) && (et7Var = (v800Var = ((c2l) c000Var.E.getValue()).c).m) != null) {
                    ej5.c(et7Var, null, null, new t800(v800Var, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
