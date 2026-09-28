package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jft implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ jft(int i, int i2, haj hajVar, Object obj, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                lft.a((zzr) this.b, (List) this.c, (Function2) this.d, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                aui0.a((pui0) this.b, (Function1) this.c, (Function0) this.d, (a) obj, qj40.a(9));
                break;
        }
        return Unit.a;
    }
}
