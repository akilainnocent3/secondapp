package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uir implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ uir(int i, d dVar, String str, Function0 function0, boolean z) {
        this.d = dVar;
        this.c = z;
        this.e = function0;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vir.a(qj40.a(1), (a) obj, (d) obj3, this.b, this.e, this.c);
                break;
            default:
                tp00 tp00Var = (tp00) obj3;
                up00 up00Var = (up00) this.e;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bq00.a(this.b, this.c, tp00Var, up00Var, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ uir(String str, boolean z, tp00 tp00Var, up00 up00Var) {
        this.b = str;
        this.c = z;
        this.d = tp00Var;
        this.e = up00Var;
    }
}
