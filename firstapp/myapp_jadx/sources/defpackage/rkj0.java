package defpackage;

import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rkj0 implements Function0 {
    public final /* synthetic */ xkj0 a;
    public final /* synthetic */ WithDrawInfo b;

    public /* synthetic */ rkj0(xkj0 xkj0Var, WithDrawInfo withDrawInfo) {
        this.a = xkj0Var;
        this.b = withDrawInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = this.b.message;
        str.getClass();
        qxd0<wg8> qxd0VarG1 = this.a.G1();
        if (qxd0VarG1 != null) {
            wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
            wg8VarInvoke.getClass();
            qxd0VarG1.a(wg8.a(wg8VarInvoke, false, str, null, null, null, 61));
        }
        return Unit.a;
    }
}
