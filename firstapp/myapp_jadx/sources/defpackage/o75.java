package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o75 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object i;

    public /* synthetic */ o75(d dVar, ht htVar, boolean z, op8 op8Var, int i, int i2) {
        this.b = dVar;
        this.f = htVar;
        this.c = z;
        this.i = op8Var;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.i;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(i2 | 1);
                d dVar = this.b;
                q75.a(dVar, (ht) obj4, this.c, (op8) obj3, (a) obj, iA, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(i2 | 1);
                d dVar2 = this.b;
                boolean z = this.c;
                f0o.a(dVar2, z, (qcn) obj4, (qcn) obj3, (a) obj, iA2, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o75(d dVar, boolean z, qcn qcnVar, qcn qcnVar2, int i, int i2) {
        this.b = dVar;
        this.c = z;
        this.f = qcnVar;
        this.i = qcnVar2;
        this.d = i;
        this.e = i2;
    }
}
