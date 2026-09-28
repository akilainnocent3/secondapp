package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lsn implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ lsn(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            default:
                uxs uxsVar = uxs.LOADING;
                f.c cVar = (f.c) obj;
                cVar.getClass();
                return f.c.a(cVar, null, 0.0d, null, null, null, null, qpi.a(cVar.g, uxsVar, false, false, 6), null, 191);
        }
    }
}
