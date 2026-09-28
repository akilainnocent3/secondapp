package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sei implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ sei(int i, int i2, Function0 function0) {
        this.a = i2;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a aVar = (a) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                tei.a(this.b, aVar, qj40.a(this.c | 1));
                break;
            default:
                d3s.a(this.b, aVar, qj40.a(this.c | 1));
                break;
        }
        return Unit.a;
    }
}
