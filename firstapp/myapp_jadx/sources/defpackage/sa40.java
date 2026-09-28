package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsa40;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sa40 extends j8i0 {
    public final m2l a;
    public final v340 b;
    public final v340 c;

    public sa40(m2l m2lVar) {
        m2lVar.getClass();
        this.a = m2lVar;
        zed zedVar = m2lVar.a;
        lyh<Boolean> booleanByFlow = zedVar.getBooleanByFlow("realtime_cms_test_mode", false);
        et7 et7VarD = o8i0.d(this);
        Boolean bool = Boolean.FALSE;
        kwd0 kwd0Var = q490.a.a;
        this.b = e1i.e(booleanByFlow, et7VarD, kwd0Var, bool);
        this.c = e1i.e(zedVar.getBooleanByFlow("realtime_cms_display_string_key", false), o8i0.d(this), kwd0Var, bool);
    }
}
