package com.sporty.android.platform.features.settings.notification.matchalert.data.db;

import defpackage.cuu;
import defpackage.dq7;
import defpackage.duu;
import defpackage.fy2;
import defpackage.hwr;
import defpackage.jq40;
import defpackage.kde0;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.sde0;
import defpackage.uv50;
import defpackage.ygp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/settings/notification/matchalert/data/db/MatchAlertDatabase_Impl;", "Lcom/sporty/android/platform/features/settings/notification/matchalert/data/db/MatchAlertDatabase;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchAlertDatabase_Impl extends MatchAlertDatabase {
    public final mpe0 l = hwr.b(new cuu(this, 0));
    public final mpe0 m = hwr.b(new fy2(this, 1));

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "subscribed_event_table", "match_alert_cursor_table");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new duu(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dq7 dq7VarA = jq40.a(kde0.class);
        m2g m2gVar = m2g.a;
        linkedHashMap.put(dq7VarA, m2gVar);
        linkedHashMap.put(jq40.a(sde0.class), m2gVar);
        return linkedHashMap;
    }

    @Override // com.sporty.android.platform.features.settings.notification.matchalert.data.db.MatchAlertDatabase
    public final kde0 x() {
        return (kde0) this.l.getValue();
    }

    @Override // com.sporty.android.platform.features.settings.notification.matchalert.data.db.MatchAlertDatabase
    public final sde0 y() {
        return (sde0) this.m.getValue();
    }
}
