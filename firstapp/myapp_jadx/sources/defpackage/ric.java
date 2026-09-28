package defpackage;

import androidx.compose.animation.a;
import androidx.compose.animation.d;
import androidx.compose.animation.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ric implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ric(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                d dVar = (d) obj;
                fkd0 fkd0Var = y7r.a;
                dVar.getClass();
                return dVar.b(((a8r) dVar.a()).ordinal() > ((a8r) dVar.c()).ordinal() ? a.d(f.n(fkd0Var, new qoz()), f.r(fkd0Var, new dic(1))) : a.d(f.n(fkd0Var, new k7r()), f.r(fkd0Var, new qoz())), a.c(2));
        }
    }
}
