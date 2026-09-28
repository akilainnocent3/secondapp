package defpackage;

import android.content.Intent;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class okg extends saj implements Function1<ux4, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ux4 ux4Var) {
        ux4 ux4Var2 = ux4Var;
        ux4Var2.getClass();
        EventActivity eventActivity = (EventActivity) this.receiver;
        int i = EventActivity.U0;
        if (ux4Var2 instanceof ux4.a) {
            String str = ((ux4.a) ux4Var2).a;
            eventActivity.getClass();
            f00 f00Var = vgb0.a;
            Map mapSingletonMap = Collections.singletonMap("from", "LIVE_PREMATCH_CHAT_LOAD_CODE");
            mapSingletonMap.getClass();
            vgb0.c(AnalyticsEvent.COMMENT_LOAD_BOOKING_CODE, mapSingletonMap, false);
            qz3.k(str, "LIVE_PREMATCH_CHAT_LOAD_CODE");
        } else {
            eventActivity.getClass();
            if (!(ux4Var2 instanceof ux4.b)) {
                uhc.a();
                return null;
            }
            Intent intent = new Intent(eventActivity, (Class<?>) ZoomImageActivity.class);
            ux4.b bVar = (ux4.b) ux4Var2;
            intent.putExtra("param_fetch_uri", bVar.a);
            intent.putExtra("param_booking_code", bVar.b);
            intent.putExtra("param_country_code", bVar.c);
            eventActivity.startActivityForResult(intent, 2);
        }
        return Unit.a;
    }
}
