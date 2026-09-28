package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hu3 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                iu3.a((ju3) obj3, (a) obj, qj40.a(1));
                break;
            default:
                Function1 function1 = (Function1) obj3;
                s9s.a aVar = (s9s.a) obj2;
                ((ibs) obj).getClass();
                aVar.getClass();
                int i2 = sj00.e.a[aVar.ordinal()];
                if (i2 == 1) {
                    function1.invoke(Boolean.TRUE);
                } else if (i2 == 2) {
                    ftg.a(new t8a0(true));
                } else if (i2 == 3) {
                    ftg.a(new t8a0(false));
                }
                break;
        }
        return Unit.a;
    }
}
