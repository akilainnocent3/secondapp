package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kf2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kf2(int i, int i2, Function0 function0, Function0 function1) {
        this.a = 1;
        this.b = i;
        this.c = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                xf2.d((sy4) obj4, (Function2) obj3, (a) obj, qj40.a(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                x1g.b(i2, iA, (a) obj, (Function0) obj4, (Function0) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                tsj0.a((String) obj4, (String) obj3, (a) obj, qj40.a(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kf2(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
