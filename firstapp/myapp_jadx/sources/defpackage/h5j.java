package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                try {
                    ajh ajhVarL1 = u6jVar.l1();
                    if (ajhVarL1 != null) {
                        ajhVarL1.C.removeView(u6jVar.k0);
                    }
                    u6jVar.F0.cancel();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                ((qy50.a) obj).b.performClick();
                break;
        }
        return Unit.a;
    }
}
