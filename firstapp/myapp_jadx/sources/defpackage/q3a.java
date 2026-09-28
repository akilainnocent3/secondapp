package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q3a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q3a(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (z) {
                    function0.invoke();
                }
                break;
            default:
                u6j u6jVar = (u6j) obj;
                if (z) {
                    ej5.c(o8i0.d(u6jVar.t0()), null, null, new z6j(u6jVar, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
