package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lm(d dVar, Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = dVar;
        this.e = obj;
        this.c = function1;
        this.f = obj2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                rm.a(this.b, (z2q) this.e, this.c, (List) this.f, (a) obj, qj40.a(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ut4.a(this.b, (nt4) this.e, this.c, (Function1) this.f, (a) obj, qj40.a(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
