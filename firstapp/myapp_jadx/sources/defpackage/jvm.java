package defpackage;

import android.os.Bundle;
import com.sportybet.android.account.international.login.INTLoginFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jvm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jvm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ohp<Object>[] ohpVarArr = INTLoginFragment.E;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                ((INTLoginFragment) obj3).t0();
                break;
            default:
                String str = (String) obj;
                z7a0.d dVar = (z7a0.d) obj2;
                str.getClass();
                dVar.getClass();
                ((Function2) obj3).invoke(str, dVar);
                break;
        }
        return Unit.a;
    }
}
