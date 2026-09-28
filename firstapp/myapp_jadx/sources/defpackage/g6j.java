package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g6j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g6j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final u6j u6jVar = (u6j) obj;
                u6jVar.n0(new Function0() { // from class: l6j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        u6jVar.k1();
                        return Unit.a;
                    }
                });
                return Unit.a;
            case 1:
                return mr10.b((Context) obj);
            default:
                kr10 kr10Var = (kr10) obj;
                return Integer.valueOf(hgo.a(kr10Var, (pd80[]) kr10Var.j.getValue()));
        }
    }
}
