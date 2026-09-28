package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fj implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ fj() {
        this.a = 1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                gj.a(qj40.a(1), (a) obj);
                return Unit.a;
            case 1:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new k6c0((fum) qn70Var.a(jq40.a(fum.class), null, null));
            default:
                ((Integer) obj2).getClass();
                qpw.d(qj40.a(1), (a) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ fj(int i, int i2) {
        this.a = i2;
    }
}
