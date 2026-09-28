package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y020 extends qlr implements Function1<MotionEvent, Boolean> {
    public final /* synthetic */ ViewFactoryHolder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y020(ViewFactoryHolder viewFactoryHolder) {
        super(1);
        this.a = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        ViewFactoryHolder viewFactoryHolder = this.a;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = viewFactoryHolder.dispatchTouchEvent(motionEvent2);
                break;
            default:
                zDispatchTouchEvent = viewFactoryHolder.dispatchGenericMotionEvent(motionEvent2);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
