package com.sportybet.core.database;

import defpackage.ccb;
import defpackage.hwr;
import defpackage.jq40;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.sm5;
import defpackage.uv50;
import defpackage.ygp;
import defpackage.yib0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/core/database/SportyBetPersistentDB_Impl;", "Lcom/sportybet/core/database/SportyBetPersistentDB;", "<init>", "()V", "database"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyBetPersistentDB_Impl extends SportyBetPersistentDB {
    public final mpe0 l = hwr.b(new ccb(this, 1));

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "CMSResponseEntity");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new yib0(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(jq40.a(sm5.class), m2g.a);
        return linkedHashMap;
    }

    @Override // com.sportybet.core.database.SportyBetPersistentDB
    public final sm5 x() {
        return (sm5) this.l.getValue();
    }
}
