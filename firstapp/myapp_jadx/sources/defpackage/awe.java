package defpackage;

import com.sportygames.crash.remote.models.ProvablySettingRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class awe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ awe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(yve.a.a);
                break;
            case 1:
                ((Function1) obj).invoke(new bri0.b0(kui0.c.a));
                break;
            default:
                m28 m28Var = (m28) obj;
                ssw<String> sswVar = m28Var.i;
                sswVar.m(m28Var.B.d());
                ej5.c(o8i0.d(m28Var), null, null, new l28(m28Var, new ProvablySettingRequest(false, sswVar.d()), null), 3);
                break;
        }
        return Unit.a;
    }
}
