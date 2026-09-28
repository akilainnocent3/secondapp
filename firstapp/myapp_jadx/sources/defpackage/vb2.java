package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vb2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vb2(oo3.d dVar, Function1 function1, int i) {
        this.a = 0;
        this.c = dVar;
        this.d = function1;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(i2 | 1);
                zb2.a((oo3.d) obj4, (Function1) obj3, d.a.b, (a) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                bok.d((fok) obj4, (Function0) obj3, (a) obj, qj40.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xau.i((d) obj4, (nvi0.b) obj3, (a) obj, qj40.a(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vb2(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
