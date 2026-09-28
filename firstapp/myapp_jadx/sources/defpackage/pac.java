package defpackage;

import android.view.View;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pac implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pac(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bdc bdcVar = (bdc) obj2;
                gdc gdcVar = (gdc) obj;
                gdcVar.getClass();
                bdcVar.getClass();
                kzh.d(new g1i(new gzh(new fac.b(gdcVar, false)), new adc(bdcVar, null)), o8i0.d(bdcVar));
                break;
            case 1:
                TimePickerItem timePickerItem = (TimePickerItem) obj;
                timePickerItem.getClass();
                ((Function2) obj2).invoke(timePickerItem, Boolean.TRUE);
                break;
            default:
                ((View) obj).getClass();
                ((a6c0) obj2).e(b6c0.a);
                break;
        }
        return Unit.a;
    }
}
