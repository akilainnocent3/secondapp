package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ucg implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vcg.a((Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ((t5a0) ((d930) obj3).e).A(fFloatValue);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ucg(d930 d930Var) {
        this.b = d930Var;
    }
}
