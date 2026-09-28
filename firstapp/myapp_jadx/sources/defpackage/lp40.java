package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lp40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lp40(int i, int i2, haj hajVar, Object obj, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.d = hajVar;
        this.e = obj2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.e;
        haj hajVar = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                ((Integer) obj2).getClass();
                int iA = qj40.a(i2 | 1);
                mp40.d(iA, aVar, (d) obj3, (Function0) obj4, (Function0) hajVar);
                break;
            default:
                ((Integer) obj2).getClass();
                iqc0.a((qcn) obj4, (Function1) hajVar, (jqc0) obj3, (a) obj, qj40.a(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
