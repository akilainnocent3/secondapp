package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mnk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mnk(Function0 function0, cv20 cv20Var, int i) {
        this.a = 1;
        this.b = function0;
        this.c = cv20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                nnk.b((xw2) this.c, (Function0) this.b, (a) obj, qj40.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xu20.b((Function0) this.b, (cv20) this.c, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ujb0.b((hkb0) this.c, (Function1) this.b, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mnk(Object obj, haj hajVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = hajVar;
    }
}
