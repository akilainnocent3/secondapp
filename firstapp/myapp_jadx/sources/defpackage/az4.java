package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class az4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ az4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dz4 dz4Var = (dz4) obj;
                dz4Var.b.invoke(Integer.valueOf(dz4Var.getBindingAdapterPosition()));
                break;
            default:
                ((ytw) obj).setValue(Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
