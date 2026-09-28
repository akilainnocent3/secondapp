package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cvk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ haj e;

    public /* synthetic */ cvk(int i, int i2, haj hajVar, Object obj, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = hajVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        haj hajVar = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fvk.b((d) obj4, (dok) obj3, (Function1) hajVar, (a) obj, qj40.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                f6q.b((y5q.b) obj4, (Function0) obj3, (Function0) hajVar, (a) obj, qj40.a(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
