package com.sportygames.newcms;

import defpackage.jp5;
import defpackage.m2g;
import defpackage.nn5;
import defpackage.on5;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements on5 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.on5
    public final List<CMSRes> d() {
        return m2g.a;
    }

    @Override // defpackage.on5
    public final CMSRes r(jp5 jp5Var, String str, String str2, nn5 nn5Var, Integer num) {
        jp5Var.getClass();
        nn5Var.getClass();
        Integer numValueOf = Integer.valueOf(jp5Var.t());
        LinkedHashMap linkedHashMap = this.a;
        Integer num2 = (Integer) linkedHashMap.get(numValueOf);
        int iIntValue = num2 != null ? num2.intValue() : 0;
        linkedHashMap.put(Integer.valueOf(jp5Var.t()), Integer.valueOf(iIntValue + 1));
        return num != null ? new CMSRes.IdWithDefault(jp5Var.t(), iIntValue, num.intValue()) : new CMSRes.Id(jp5Var.t(), iIntValue);
    }
}
