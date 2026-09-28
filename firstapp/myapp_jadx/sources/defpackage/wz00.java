package defpackage;

import com.sportybet.android.data.SimpleConverterResponseWrapper;

/* JADX INFO: loaded from: classes6.dex */
public final class wz00 extends SimpleConverterResponseWrapper<Object, String> {
    public final /* synthetic */ tz00 a;

    public wz00(tz00 tz00Var) {
        this.a = tz00Var;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String convert(bcp bcpVar) {
        if (bcpVar != null) {
            return dc8.f(0, bcpVar, null);
        }
        return null;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String getIdentifier() {
        return "Sporty PIN Alert";
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        tz00 tz00Var = this.a;
        tz00Var.f.m(null);
        tz00Var.w = null;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final void onSuccessData(String str) {
        tz00 tz00Var = this.a;
        tz00Var.f.m(vch0.d(str));
        tz00Var.w = null;
    }
}
