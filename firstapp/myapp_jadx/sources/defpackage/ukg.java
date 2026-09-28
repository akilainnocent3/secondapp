package defpackage;

import android.widget.Toast;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.event.EventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ukg extends saj implements Function1<UiText, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UiText uiText) {
        UiText uiText2 = uiText;
        uiText2.getClass();
        EventActivity eventActivity = (EventActivity) this.receiver;
        int i = EventActivity.U0;
        eventActivity.getClass();
        Toast.makeText(eventActivity, uiText2.e(eventActivity), 0).show();
        return Unit.a;
    }
}
