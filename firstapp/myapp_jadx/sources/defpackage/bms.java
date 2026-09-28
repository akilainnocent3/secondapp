package defpackage;

import com.sportybet.plugin.event.view.LiveEventVideoView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bms extends saj implements Function2<Integer, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String str2 = str;
        LiveEventVideoView liveEventVideoView = (LiveEventVideoView) this.receiver;
        int i = LiveEventVideoView.W;
        Function2<? super Integer, ? super String, Unit> function2 = liveEventVideoView.onWatchTimeReported;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(iIntValue), str2);
        }
        return Unit.a;
    }
}
