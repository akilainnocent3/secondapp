package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tc6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tc6(d dVar, Object obj, int i, int i2) {
        this.a = i2;
        this.c = dVar;
        this.d = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.d;
        d dVar = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                rxo.b(dVar, (Function1) obj3, (a) obj, qj40.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                pe60.a((LayoutWeightElement) dVar, (String) obj3, (a) obj, qj40.a(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
