package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qv1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qv1(int i, int i2, d dVar) {
        this.c = dVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(7);
                cw1.a(i2, iA, (a) obj, (d) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                shy.d((j040) obj3, (a) obj, qj40.a(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qv1(j040 j040Var, int i) {
        this.c = j040Var;
        this.b = i;
    }
}
