package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vhr implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sir.l((a4r) obj3, (a) obj, qj40.a(1));
                break;
            default:
                kq00 kq00Var = (kq00) obj3;
                String str = (String) obj;
                y7i y7iVar = (y7i) obj2;
                str.getClass();
                y7iVar.getClass();
                if (y7iVar instanceof y7i.a) {
                    bba0.h hVar = new bba0.h(str, true);
                    kq00Var.getClass();
                    kq00Var.F.a(hVar);
                } else if (y7iVar instanceof y7i.c) {
                    bba0.d dVar = new bba0.d(str, true);
                    kq00Var.getClass();
                    kq00Var.F.a(dVar);
                }
                break;
        }
        return Unit.a;
    }
}
