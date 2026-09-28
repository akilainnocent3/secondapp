package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llls;", "Lh7v;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lls extends pul {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(870328771, new Function2() { // from class: jls
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final lls llsVar = this.a;
                    or0.a(null, false, false, null, pp8.b(-535199974, new Function2() { // from class: kls
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 1;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                String strA = cb40.a(R.string.bet_history__follow_live_matches, new Object[0], aVar2);
                                List listK = b.k(new ezg0(cb40.a(R.string.bet_history__streaming_widget_hint_img_1, new Object[0], aVar2), cb40.a(R.string.cashout__openbet_live_stream_track_feature_hint_1, new Object[0], aVar2)), new ezg0(cb40.a(R.string.bet_history__streaming_widget_hint_img_2, new Object[0], aVar2), cb40.a(R.string.cashout__openbet_live_stream_track_feature_hint_2, new Object[0], aVar2)));
                                lls llsVar2 = llsVar;
                                boolean zA = aVar2.A(llsVar2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new dwd(llsVar2, i);
                                    aVar2.r(objY);
                                }
                                bzg0.b(strA, listK, (Function0) objY, null, "live_event_tutorial", "open_bets__widget_feature_hint", 0.0f, aVar2, 1769472, 152);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
