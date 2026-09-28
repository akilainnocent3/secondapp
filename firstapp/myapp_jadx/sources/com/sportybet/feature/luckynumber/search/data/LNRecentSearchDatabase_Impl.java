package com.sportybet.feature.luckynumber.search.data;

import defpackage.d6r;
import defpackage.hwr;
import defpackage.jq40;
import defpackage.kq3;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.uv50;
import defpackage.w5r;
import defpackage.ygp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/luckynumber/search/data/LNRecentSearchDatabase_Impl;", "Lcom/sportybet/feature/luckynumber/search/data/LNRecentSearchDatabase;", "<init>", "()V", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LNRecentSearchDatabase_Impl extends LNRecentSearchDatabase {
    public final mpe0 l = hwr.b(new kq3(this, 1));

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "recent_search");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new d6r(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(jq40.a(w5r.class), m2g.a);
        return linkedHashMap;
    }

    @Override // com.sportybet.feature.luckynumber.search.data.LNRecentSearchDatabase
    public final w5r x() {
        return (w5r) this.l.getValue();
    }
}
