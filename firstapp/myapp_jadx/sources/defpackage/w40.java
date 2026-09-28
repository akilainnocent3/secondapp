package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class w40 extends qlr implements Function0<Boolean> {
    public final /* synthetic */ AndroidComposeView a;
    public final /* synthetic */ MotionEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        super(0);
        this.a = androidComposeView;
        this.b = motionEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AndroidComposeView.D(this.b, this.a));
    }
}
