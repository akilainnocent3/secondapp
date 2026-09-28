package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ldc implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ldc(int i, d dVar, String str) {
        this.b = dVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Calendar calendar = (Calendar) obj;
                Calendar calendar2 = (Calendar) obj2;
                calendar.getClass();
                calendar2.getClass();
                ((ytw) obj3).setValue(Boolean.FALSE);
                TimePickerItem.INSTANCE.getClass();
                ((Function1) obj4).invoke(TimePickerItem.Companion.b(calendar, calendar2));
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                f5h.a(iA, (a) obj, (d) obj4, (String) obj3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ldc(ytw ytwVar, Function1 function1) {
        this.b = function1;
        this.c = ytwVar;
    }
}
