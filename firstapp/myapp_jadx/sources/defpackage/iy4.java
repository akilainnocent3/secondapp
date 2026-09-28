package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iy4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iy4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ky4 ky4Var = (ky4) obj;
                ky4Var.c.invoke(Integer.valueOf(ky4Var.getBindingAdapterPosition()));
                break;
            default:
                ((ytw) obj).setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
