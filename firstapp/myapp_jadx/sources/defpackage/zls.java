package defpackage;

import com.sportybet.plugin.event.view.LiveEventVideoView;
import com.sportybet.plugin.realsports.data.LiveStreamData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zls implements gaj {
    public final /* synthetic */ LiveEventVideoView a;

    public /* synthetic */ zls(LiveEventVideoView liveEventVideoView) {
        this.a = liveEventVideoView;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LiveStreamData liveStreamData = (LiveStreamData) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int i = LiveEventVideoView.W;
        liveStreamData.getClass();
        this.a.G((String) obj, liveStreamData, zBooleanValue);
        return Unit.a;
    }
}
