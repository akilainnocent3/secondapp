package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class na3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj3;
                jj40 jj40Var = (jj40) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zie zieVar = betSuccessfulPageFragment.H;
                if (zBooleanValue) {
                    hj40.c(zieVar.U, jj40Var, new Function0() { // from class: wb3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            BetSuccessfulPageFragment betSuccessfulPageFragment2 = betSuccessfulPageFragment;
                            boolean z = betSuccessfulPageFragment2.M.B.getValue() instanceof krv.c;
                            tch tchVar = betSuccessfulPageFragment2.K;
                            if (z) {
                                tchVar.getClass();
                                ej5.c(o8i0.d(tchVar), null, null, new zch(null, tchVar), 3);
                                Map<String, ? extends Object> map = Collections.EMPTY_MAP;
                                f00 f00Var = vgb0.a;
                                map.getClass();
                                vgb0.c(AnalyticsEvent.BETSLIP_MISSION_REMINDER_CODE_DROPDOWN_CLICK, map, false);
                                betSuccessfulPageFragment2.w.c(AnalyticsEvent.BETSLIP_MISSION_REMINDER_CODE_DROPDOWN_CLICK, map, null);
                            } else {
                                tchVar.C1();
                            }
                            return Unit.a;
                        }
                    });
                    betSuccessfulPageFragment.H.W.setVisibility(jj40Var instanceof jj40.b ? 0 : 8);
                    betSuccessfulPageFragment.H.Z.setVisibility(8);
                    return null;
                }
                zieVar.U.setVisibility(8);
                betSuccessfulPageFragment.H.W.setVisibility(8);
                betSuccessfulPageFragment.H.Z.setVisibility(8);
                return null;
            default:
                ((Integer) obj2).getClass();
                vnq.d((Function0) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ na3(BetSuccessfulPageFragment betSuccessfulPageFragment) {
        this.b = betSuccessfulPageFragment;
    }
}
