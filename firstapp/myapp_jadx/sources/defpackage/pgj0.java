package defpackage;

import com.sporty.android.core.model.pocket.common.WhTaxData;
import com.sportybet.android.data.SimpleConverterResponseWrapper;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class pgj0 extends SimpleConverterResponseWrapper<Object, Unit> {
    public final /* synthetic */ rgj0 a;

    public pgj0(rgj0 rgj0Var) {
        this.a = rgj0Var;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final Unit convert(bcp bcpVar) {
        bcpVar.getClass();
        this.a.i.m((WhTaxData) sh8.b().fromJson(dc8.f(0, bcpVar, ""), WhTaxData.class));
        return Unit.a;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String getIdentifier() {
        return this.a.f;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        super.onFailure(th);
        this.a.i.m(new WhTaxData(false, 0, 0L, 0L, 15, null));
    }
}
