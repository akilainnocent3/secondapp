package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zg8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zg8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dh8.a aVar = dh8.y;
                Bundle arguments = ((dh8) obj).getArguments();
                if (arguments != null) {
                    return (PaymentChannel) arguments.getParcelable("payChannel");
                }
                return null;
            case 1:
                ((Function1) obj).invoke(buq.c.a);
                return Unit.a;
            default:
                return ((a880) obj).d.a;
        }
    }
}
