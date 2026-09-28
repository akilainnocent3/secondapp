package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q83 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ q83(int i, int i2, d dVar) {
        this.a = i2;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a aVar = (a) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                r83.b(this.b, aVar, qj40.a(7));
                break;
            default:
                gmq.a(this.b, aVar, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
