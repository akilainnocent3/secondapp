package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k02 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k02(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m02 m02Var = (m02) obj;
                return new m02.a(m02Var.T, m02Var);
            case 1:
                ((phx) obj).k();
                return Unit.a;
            default:
                ((Function1) obj).invoke(wae.HOME);
                return Unit.a;
        }
    }
}
