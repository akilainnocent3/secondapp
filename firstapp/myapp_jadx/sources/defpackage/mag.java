package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mag implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mag(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                nag.b((String) this.b, (String) this.c, (a) obj, qj40.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                v7q.a((Function0) this.b, (Function0) this.c, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                dk70.a((d) this.b, (ek70) this.c, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
