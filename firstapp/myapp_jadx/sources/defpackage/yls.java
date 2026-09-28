package defpackage;

import android.app.Activity;
import android.content.Context;
import com.sportybet.plugin.event.view.LiveEventVideoView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yls implements Function0 {
    public final /* synthetic */ LiveEventVideoView a;

    public /* synthetic */ yls(LiveEventVideoView liveEventVideoView) {
        this.a = liveEventVideoView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = LiveEventVideoView.W;
        LiveEventVideoView liveEventVideoView = this.a;
        Context context = liveEventVideoView.getContext();
        context.getClass();
        Activity activityB = wc.b(context);
        liveEventVideoView.H(activityB != null ? activityB.getWindow() : null);
        return Unit.a;
    }
}
