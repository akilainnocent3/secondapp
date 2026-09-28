package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.book.domain.entity.UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r220 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r220(Object obj, Function1 function1, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                u220.b((UIState) obj3, function1, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                he60.a((xw2.a) obj3, function1, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
