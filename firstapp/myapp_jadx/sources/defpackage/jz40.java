package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jz40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz40(Function1 function1) {
        this.a = 1;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                j050.a((String) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                Function1 function1 = (Function1) obj3;
                zrd0 zrd0Var = (zrd0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zrd0Var.getClass();
                function1.invoke(new b.s.c(zrd0Var, zBooleanValue));
                function1.invoke(b.t.a.a);
                break;
            default:
                ((Integer) obj2).getClass();
                ceh0.b((Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jz40(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }
}
