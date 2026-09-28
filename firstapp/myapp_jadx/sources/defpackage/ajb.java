package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ajb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ajb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zqy zqyVar = (zqy) obj;
                zqyVar.b0 = 1;
                zqyVar.w0().z1();
                return Unit.a;
            default:
                yhf0 yhf0Var = (yhf0) obj;
                return Boolean.valueOf(((t5a0) yhf0Var.a).j() < ((t5a0) yhf0Var.b).j());
        }
    }
}
