package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vdj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ vdj(Object obj, haj hajVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                Function0 function0 = (Function0) this.c;
                ((Integer) obj2).getClass();
                wdj.a(qj40.a(7), (a) obj, dVar, function0);
                break;
            default:
                ((Integer) obj2).getClass();
                b2e0.a((List) this.b, (Function1) this.c, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
