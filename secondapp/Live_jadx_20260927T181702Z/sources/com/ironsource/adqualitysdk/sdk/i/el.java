package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class el extends eg {
    public el(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2068(du duVar, cq cqVar) {
        Object objM2044 = m2111().m2101(duVar, cqVar).m2044();
        Object objM2045 = m2112().m2101(duVar, cqVar).m2044();
        try {
            return new dr(Boolean.valueOf(mo2119(new BigDecimal(objM2044.toString()).compareTo(new BigDecimal(objM2045.toString())))));
        } catch (Exception unused) {
            return ((objM2044 instanceof String) && (objM2045 instanceof String)) ? new dr(Boolean.valueOf(mo2121((String) objM2044, (String) objM2045))) : new dr(Boolean.valueOf(mo2120(objM2044, objM2045)));
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo2119(int i10);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo2120(Object obj, Object obj2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo2121(String str, String str2);
}
