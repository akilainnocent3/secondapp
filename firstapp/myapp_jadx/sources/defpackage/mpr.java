package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mpr implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mpr(d dVar, uxs uxsVar, Function0 function0, int i, int i2) {
        this.d = dVar;
        this.e = uxsVar;
        this.b = function0;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                iqr.b((d) obj4, (uxs) obj3, this.b, (a) obj, iA, this.c);
                break;
            default:
                ((Integer) obj2).intValue();
                int iA2 = qj40.a(this.c | 1);
                z990.d((Map) obj4, (qcn) obj3, this.b, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mpr(Map map, qcn qcnVar, Function0 function0, int i) {
        this.d = map;
        this.e = qcnVar;
        this.b = function0;
        this.c = i;
    }
}
