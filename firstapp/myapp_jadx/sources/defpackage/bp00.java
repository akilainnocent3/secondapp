package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bp00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bp00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kq00 kq00Var = (kq00) obj;
                bba0.c cVar = bba0.c.a;
                kq00Var.getClass();
                cVar.getClass();
                kq00Var.F.a(cVar);
                break;
            default:
                xo40 xo40Var = (xo40) ((nn40) obj).b;
                if (xo40Var != null) {
                    xo40Var.B.d();
                }
                break;
        }
        return Unit.a;
    }
}
