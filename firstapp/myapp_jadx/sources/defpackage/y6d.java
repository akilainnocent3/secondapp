package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y6d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y6d(dxr dxrVar, nxr nxrVar) {
        this.a = 1;
        this.b = dxrVar;
        this.c = nxrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m7d.b((Function0) obj4, (Function2) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            case 1:
                return ((nxr) obj3).a(new oxr((dxr) obj4, (rce0) obj), ((kxa) obj2).a);
            default:
                ((Integer) obj2).getClass();
                int iA = qj40.a(7);
                xy40.c(iA, (a) obj, (d) obj4, (String) obj3);
                return Unit.a;
        }
    }

    public /* synthetic */ y6d(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
