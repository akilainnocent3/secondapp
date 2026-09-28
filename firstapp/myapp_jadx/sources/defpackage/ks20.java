package defpackage;

import com.sportybet.android.auth.SportyAccountManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ks20 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ks20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function2) obj).invoke(0, vch0.a);
                return Unit.a;
            default:
                return SportyAccountManagerImpl.accountType_delegate$lambda$0((SportyAccountManagerImpl) obj);
        }
    }
}
