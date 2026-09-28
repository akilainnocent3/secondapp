package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lu3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lu3(qcn qcnVar, String str, int i, int i2) {
        this.c = qcnVar;
        this.d = str;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                nu3.b((qcn) this.c, (String) this.d, this.b, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                ckc.a((TimePickerItem) this.c, (Function2) this.d, (a) obj, qj40.a(this.b | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lu3(TimePickerItem timePickerItem, Function2 function2, int i) {
        this.c = timePickerItem;
        this.d = function2;
        this.b = i;
    }
}
