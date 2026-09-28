package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yii implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                zii.d(gly.b(fFloatValue, 0.0f, 2, zii.c(ytwVar)), ytwVar);
                break;
            default:
                ((Integer) obj2).getClass();
                e8s.h(qj40.a(7), (op8) obj3, (a) obj);
                break;
        }
        return Unit.a;
    }
}
