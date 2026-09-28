package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class no1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;

    public /* synthetic */ no1(d dVar, Object obj, int i, int i2) {
        this.a = i2;
        this.b = dVar;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                oo1.c(dVar, (op8) obj3, (a) obj, qj40.a(49));
                break;
            default:
                ((Integer) obj2).getClass();
                lre0.d(dVar, (jze0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
