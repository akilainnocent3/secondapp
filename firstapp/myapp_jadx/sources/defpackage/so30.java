package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class so30 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ so30(int i, int i2, String str, List list) {
        this.b = i;
        this.c = str;
        this.d = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        String str = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xo30.a((LayoutWeightElement) obj3, str, (a) obj, qj40.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                w1g0.c(i2, str, (List) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ so30(LayoutWeightElement layoutWeightElement, String str, int i) {
        this.d = layoutWeightElement;
        this.c = str;
        this.b = i;
    }
}
