package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o6s implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ o6s(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                mt00 mt00Var = (mt00) obj;
                mt00Var.getClass();
                return mt00Var.getKey();
        }
    }
}
