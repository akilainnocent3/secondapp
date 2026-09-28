package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.event.EventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rig implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                tzs tzsVar = (tzs) obj2;
                int i2 = EventActivity.U0;
                tzsVar.getClass();
                if (!zBooleanValue) {
                    eventActivity.findViewById(R.id.match_alert_icon_image_view).setVisibility(4);
                    eventActivity.findViewById(R.id.match_alert_loading_view).setVisibility(4);
                } else if (tzsVar instanceof tzs.a) {
                    eventActivity.findViewById(R.id.match_alert_icon_image_view).setVisibility(0);
                    eventActivity.findViewById(R.id.match_alert_loading_view).setVisibility(4);
                } else {
                    if (!(tzsVar instanceof tzs.b)) {
                        uhc.a();
                        return null;
                    }
                    eventActivity.findViewById(R.id.match_alert_icon_image_view).setVisibility(4);
                    eventActivity.findViewById(R.id.match_alert_loading_view).setVisibility(0);
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                ah30.a((dh30) obj3, (a) obj, qj40.a(9));
                return Unit.a;
        }
    }

    public /* synthetic */ rig(EventActivity eventActivity) {
        this.b = eventActivity;
    }
}
