package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;
import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ob10 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e.c cVar = (e.c) obj;
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                cVar.getClass();
                return cVar.a;
            default:
                return new ij0(((Float) obj).floatValue());
        }
    }
}
