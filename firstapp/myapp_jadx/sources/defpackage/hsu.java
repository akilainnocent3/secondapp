package defpackage;

import android.app.Dialog;
import androidx.compose.runtime.a;
import com.sporty.android.book.domain.entity.MarketingServiceType;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class hsu {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MarketingServiceType.values().length];
            try {
                iArr[MarketingServiceType.BONUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketingServiceType.GIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketingServiceType.LIVE_ODDS_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketingServiceType.MULTIPLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final f8a0 a(final MarketingServiceType marketingServiceType, final Function0 function0) {
        marketingServiceType.getClass();
        return new f8a0(new op8(1618423256, new gaj() { // from class: fsu
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String strA;
                final Dialog dialog = (Dialog) obj;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                dialog.getClass();
                String strA2 = cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], aVar);
                int i = hsu.a.a[marketingServiceType.ordinal()];
                if (i == 1) {
                    aVar.N(526595215);
                    strA = cb40.a(R.string.component_betslip__bonus_apply_failed_temp_issue, new Object[0], aVar);
                    aVar.H();
                } else if (i == 2) {
                    aVar.N(526600526);
                    strA = cb40.a(R.string.component_betslip__gift_apply_failed_temp_issue, new Object[0], aVar);
                    aVar.H();
                } else if (i == 3) {
                    aVar.N(526606169);
                    strA = cb40.a(R.string.component_betslip__live_odds_boost_apply_failed_temp_issue, new Object[0], aVar);
                    aVar.H();
                } else {
                    if (i != 4) {
                        throw rg.a(526593902, aVar);
                    }
                    aVar.N(526611930);
                    strA = cb40.a(R.string.component_betslip__multiple_rewards_apply_failed_temp_issue, new Object[0], aVar);
                    aVar.H();
                }
                boolean zA = aVar.A(dialog);
                final Function0 function1 = function0;
                boolean zM = zA | aVar.M(function1);
                Object objY = aVar.y();
                if (zM || objY == a.C0041a.a) {
                    objY = new Function0() { // from class: gsu
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            dialog.dismiss();
                            function1.invoke();
                            return Unit.a;
                        }
                    };
                    aVar.r(objY);
                }
                nzj.b(null, strA2, strA, null, null, null, null, null, null, null, null, null, (Function0) objY, null, aVar, 0, 0, 12281);
                return Unit.a;
            }
        }, true));
    }
}
