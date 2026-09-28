package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;
import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wb10 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e.c cVar = (e.c) obj;
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                cVar.getClass();
                return Double.valueOf(cVar.b);
            default:
                jj0 jj0Var = (jj0) obj;
                float f = jj0Var.a;
                return new yw90((((long) Float.floatToRawIntBits(jj0Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        }
    }
}
