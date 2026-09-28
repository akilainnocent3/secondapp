package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ofi implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ofi(fn90 fn90Var, vf3 vf3Var) {
        this.b = fn90Var;
        this.c = vf3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pfi.a((String) obj4, (String) obj3, (a) obj, qj40.a(1));
                break;
            default:
                fn90 fn90Var = (fn90) obj4;
                vf3 vf3Var = (vf3) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    en90.a(fn90Var, vf3Var, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ofi(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
    }
}
