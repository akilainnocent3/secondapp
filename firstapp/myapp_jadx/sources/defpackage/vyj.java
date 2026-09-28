package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vyj implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vyj(h9 h9Var, maa maaVar, ytw ytwVar) {
        this.b = maaVar;
        this.c = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                ((maa) obj2).dismiss();
                break;
            default:
                ((Function1) obj2).invoke(new zxq.l(((zsq.g) obj).c));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vyj(Function1 function1, zsq.g gVar) {
        this.b = function1;
        this.c = gVar;
    }
}
