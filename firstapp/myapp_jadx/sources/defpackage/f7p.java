package defpackage;

import com.sportybet.android.data.SimpleConverterResponseWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class f7p extends SimpleConverterResponseWrapper<Object, Long> {
    public final /* synthetic */ c7p a;

    public f7p(c7p c7pVar) {
        this.a = c7pVar;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final Long convert(bcp bcpVar) {
        return Long.valueOf(dc8.e(0, bcpVar, 0L) / 10000);
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String getIdentifier() {
        return c7p.class.getSimpleName();
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final void onSuccessData(Long l) {
        long jLongValue = l.longValue();
        c7p c7pVar = this.a;
        c7pVar.W = jLongValue;
        if (jLongValue > 0) {
            c7pVar.p0();
            return;
        }
        c7pVar.f.a();
        c7pVar.v.setVisibility(8);
        c7pVar.G.setVisibility(0);
    }
}
