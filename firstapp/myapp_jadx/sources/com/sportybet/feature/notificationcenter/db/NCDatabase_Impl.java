package com.sportybet.feature.notificationcenter.db;

import defpackage.dq7;
import defpackage.g3x;
import defpackage.hwr;
import defpackage.jq40;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.o2x;
import defpackage.uv50;
import defpackage.v2x;
import defpackage.ygp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/notificationcenter/db/NCDatabase_Impl;", "Lcom/sportybet/feature/notificationcenter/db/NCDatabase;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NCDatabase_Impl extends NCDatabase {
    public final mpe0 l = hwr.b(new Function0() { // from class: e3x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new b3x(this.a);
        }
    });
    public final mpe0 m = hwr.b(new Function0() { // from class: f3x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new t2x(this.a);
        }
    });

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "notification_center", "notification_cursor");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new g3x(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dq7 dq7VarA = jq40.a(v2x.class);
        m2g m2gVar = m2g.a;
        linkedHashMap.put(dq7VarA, m2gVar);
        linkedHashMap.put(jq40.a(o2x.class), m2gVar);
        return linkedHashMap;
    }

    @Override // com.sportybet.feature.notificationcenter.db.NCDatabase
    public final o2x x() {
        return (o2x) this.m.getValue();
    }

    @Override // com.sportybet.feature.notificationcenter.db.NCDatabase
    public final v2x y() {
        return (v2x) this.l.getValue();
    }
}
