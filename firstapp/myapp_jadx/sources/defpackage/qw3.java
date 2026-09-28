package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qw3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qw3(oo3.d dVar, Function1 function1, Function1 function2, int i) {
        this.d = dVar;
        this.b = function1;
        this.e = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                int iA = qj40.a(this.c | 1);
                vw3.b((oo3.d) this.d, this.b, (Function1) this.e, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(this.c | 1);
                vhh.c((d) this.d, (bhh) this.e, this.b, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qw3(d dVar, bhh bhhVar, Function1 function1, int i) {
        this.d = dVar;
        this.e = bhhVar;
        this.b = function1;
        this.c = i;
    }
}
