package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p4b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p4b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((t4b) obj).M.n();
                return Boolean.TRUE;
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                kab0 kab0Var = (kab0) obj;
                kab0Var.Z = 1;
                kab0Var.w0().z1();
                return Unit.a;
        }
    }
}
