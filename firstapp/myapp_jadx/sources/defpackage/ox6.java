package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ox6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ox6(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ay6.e((r27) this.b, (d) this.c, (a) obj, qj40.a(1));
                break;
            default:
                String str = (String) this.b;
                Function0 function0 = (Function0) this.c;
                ((Integer) obj2).getClass();
                x0b.a(qj40.a(1), (a) obj, str, function0);
                break;
        }
        return Unit.a;
    }
}
