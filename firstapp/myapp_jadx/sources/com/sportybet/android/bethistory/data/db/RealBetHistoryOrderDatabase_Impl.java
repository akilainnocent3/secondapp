package com.sportybet.android.bethistory.data.db;

import defpackage.hwr;
import defpackage.jq40;
import defpackage.l640;
import defpackage.lq3;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.uv50;
import defpackage.x540;
import defpackage.ygp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/bethistory/data/db/RealBetHistoryOrderDatabase_Impl;", "Lcom/sportybet/android/bethistory/data/db/RealBetHistoryOrderDatabase;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RealBetHistoryOrderDatabase_Impl extends RealBetHistoryOrderDatabase {
    public final mpe0 l = hwr.b(new lq3(this, 1));

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "real_bet_history_order_table");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new l640(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(jq40.a(x540.class), m2g.a);
        return linkedHashMap;
    }

    @Override // com.sportybet.android.bethistory.data.db.RealBetHistoryOrderDatabase
    public final x540 x() {
        return (x540) this.l.getValue();
    }
}
