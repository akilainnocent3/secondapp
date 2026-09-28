package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.data.SimpleConverterResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class x7 extends SimpleConverterResponseWrapper<Object, Boolean> {
    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final Boolean convert(bcp bcpVar) {
        bcpVar.getClass();
        return Boolean.valueOf(dc8.b(bcpVar, false));
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String getIdentifier() {
        psm psmVar = y7.a;
        return y7.class.getSimpleName();
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final void onSuccessData(Boolean bool) {
        Boolean bool2 = bool;
        boolean zBooleanValue = bool2.booleanValue();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.a("Account activation entrance config %b -> %b", Boolean.valueOf(y7.b), bool2);
        y7.b = zBooleanValue;
        zu7.a aVar2 = zu7.a;
        ej5.c(zu7.b(null), null, null, new w7(zBooleanValue, null), 3);
    }
}
