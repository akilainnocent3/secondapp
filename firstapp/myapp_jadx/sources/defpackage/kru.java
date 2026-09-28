package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kru implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kru(yik yikVar, Function0 function0, d dVar, int i) {
        this.c = yikVar;
        this.d = function0;
        this.e = dVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                pru.b((qcn) obj5, (qcn) obj4, this.b, (Function1) obj3, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                oqf0.b((yik) obj5, (Function0) obj4, (d) obj3, (a) obj, qj40.a(this.b | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kru(qcn qcnVar, qcn qcnVar2, int i, Function1 function1, int i2) {
        this.c = qcnVar;
        this.d = qcnVar2;
        this.b = i;
        this.e = function1;
    }
}
