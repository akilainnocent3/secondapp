package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import com.sportybet.plugin.realsports.sportssoccer.expandview.TimeFilterPopupView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ucl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ucl(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((vcl) obj3).b.removeCallbacks((tcl) obj2);
                break;
            default:
                TimePickerItem timePickerItem = (TimePickerItem) obj;
                int i2 = TimeFilterPopupView.f;
                timePickerItem.getClass();
                ((ComposeView) obj3).setContent(cx8.c);
                Function2<? super xvf0, ? super Boolean, Unit> function2 = ((TimeFilterPopupView) obj2).b;
                if (function2 != null) {
                    function2.invoke(qwf0.a(timePickerItem, false), Boolean.FALSE);
                }
                break;
        }
        return Unit.a;
    }
}
