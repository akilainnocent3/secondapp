package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q32(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((w32) obj).n0(false);
                break;
            case 1:
                kab0 kab0Var = (kab0) obj;
                kab0Var.C0(kab0Var.g0, kab0Var.h0);
                break;
            default:
                ((mjj0) obj).L1();
                break;
        }
        return Unit.a;
    }
}
