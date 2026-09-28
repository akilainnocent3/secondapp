package com.sportybet.roomcache;

import defpackage.dlg;
import defpackage.dq7;
import defpackage.hwr;
import defpackage.jhb0;
import defpackage.jq40;
import defpackage.kib0;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.pa2;
import defpackage.uv50;
import defpackage.ybb;
import defpackage.ygp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/roomcache/SportyBetCacheDB_Impl;", "Lcom/sportybet/roomcache/SportyBetCacheDB;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyBetCacheDB_Impl extends SportyBetCacheDB {
    public final mpe0 l = hwr.b(new ybb(this, 2));
    public final mpe0 m = hwr.b(new pa2(this, 1));

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "CacheEvent", "CacheMarketGroup", "CacheFavoriteMarketIds", "CacheBetBuilderMarkets", "sporty_bet_table");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new kib0(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dq7 dq7VarA = jq40.a(dlg.class);
        m2g m2gVar = m2g.a;
        linkedHashMap.put(dq7VarA, m2gVar);
        linkedHashMap.put(jq40.a(jhb0.class), m2gVar);
        return linkedHashMap;
    }

    @Override // com.sportybet.roomcache.SportyBetCacheDB
    public final dlg x() {
        return (dlg) this.l.getValue();
    }

    @Override // com.sportybet.roomcache.SportyBetCacheDB
    public final jhb0 y() {
        return (jhb0) this.m.getValue();
    }
}
