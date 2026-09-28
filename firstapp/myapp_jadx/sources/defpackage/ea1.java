package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ea1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ ea1(d dVar, Object obj, haj hajVar, int i, int i2) {
        this.a = i2;
        this.b = dVar;
        this.c = obj;
        this.d = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.d;
        Object obj3 = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ja1.a(dVar, (rc60) obj3, (Function1) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                x4f.a(dVar, (y4f) obj3, (Function0) hajVar, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
