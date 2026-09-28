package defpackage;

import com.sportybet.plugin.event.view.LiveEventVideoView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cms extends saj implements gaj<Boolean, Float, Boolean, Unit> {
    @Override // defpackage.gaj
    public final Unit invoke(Boolean bool, Float f, Boolean bool2) {
        ((LiveEventVideoView) this.receiver).setPlayerLayout(bool.booleanValue(), f.floatValue(), bool2.booleanValue());
        return Unit.a;
    }
}
