package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aee implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ haj e;
    public final /* synthetic */ haj f;

    public /* synthetic */ aee(Object obj, Object obj2, Object obj3, haj hajVar, haj hajVar2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = hajVar;
        this.f = hajVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.f;
        haj hajVar2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fee.b((d) obj5, (eie) obj4, (String) obj3, (Function1) hajVar2, (Function1) hajVar, (a) obj, qj40.a(65));
                break;
            default:
                ((Integer) obj2).getClass();
                zq10.a((fu70) obj5, (Function0) obj4, (Function0) obj3, (jaj) hajVar2, (gaj) hajVar, (a) obj, qj40.a(9));
                break;
        }
        return Unit.a;
    }
}
