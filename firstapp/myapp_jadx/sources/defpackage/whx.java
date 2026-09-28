package defpackage;

import androidx.compose.animation.d;
import com.sporty.android.core.model.pocket.common.BankAccountNameWrapper;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class whx implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ygx ygxVar = ((ifx) ((d) obj).a()).b;
                ygxVar.getClass();
                int i = ygx.f;
                for (ygx ygxVar2 : ygx.a.b((sga.a) ygxVar)) {
                }
                return null;
            default:
                BankAccountNameWrapper bankAccountNameWrapper = (BankAccountNameWrapper) obj;
                bankAccountNameWrapper.getClass();
                return bankAccountNameWrapper.getBankAccName();
        }
    }
}
