package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q420 extends qlr implements Function1<Function0<? extends Unit>, Unit> {
    public final /* synthetic */ PopupLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q420(PopupLayout popupLayout) {
        super(1);
        this.a = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function0<? extends Unit> function0) {
        final Function0<? extends Unit> function1 = function0;
        PopupLayout popupLayout = this.a;
        Handler handler = popupLayout.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            function1.invoke();
        } else {
            Handler handler2 = popupLayout.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: p420
                    @Override // java.lang.Runnable
                    public final void run() {
                        function1.invoke();
                    }
                });
            }
        }
        return Unit.a;
    }
}
