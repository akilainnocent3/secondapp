package com.sportybet.android.social.data.local;

import defpackage.am5;
import defpackage.b2c;
import defpackage.dq7;
import defpackage.g2c;
import defpackage.hwr;
import defpackage.i1c;
import defpackage.jq40;
import defpackage.m1c;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.uv50;
import defpackage.xl5;
import defpackage.ygp;
import defpackage.yl5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/social/data/local/CCPDatabase_Impl;", "Lcom/sportybet/android/social/data/local/CCPDatabase;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CCPDatabase_Impl extends CCPDatabase {
    public final mpe0 l = hwr.b(new Function0() { // from class: wl5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new o1c(this.a);
        }
    });
    public final mpe0 m = hwr.b(new xl5(this, 0));
    public final mpe0 n = hwr.b(new yl5(this, 0));
    public final mpe0 o = hwr.b(new Function0() { // from class: zl5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new f2c(this.a);
        }
    });

    @Override // com.sportybet.android.social.data.local.CCPDatabase
    public final g2c A() {
        return (g2c) this.n.getValue();
    }

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "creator_credit_table", "creator_credits_cursor_table", "creator_credit_history_table", "creator_credits_history_cursor_table");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new am5(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dq7 dq7VarA = jq40.a(m1c.class);
        m2g m2gVar = m2g.a;
        linkedHashMap.put(dq7VarA, m2gVar);
        linkedHashMap.put(jq40.a(i1c.class), m2gVar);
        linkedHashMap.put(jq40.a(g2c.class), m2gVar);
        linkedHashMap.put(jq40.a(b2c.class), m2gVar);
        return linkedHashMap;
    }

    @Override // com.sportybet.android.social.data.local.CCPDatabase
    public final i1c x() {
        return (i1c) this.m.getValue();
    }

    @Override // com.sportybet.android.social.data.local.CCPDatabase
    public final m1c y() {
        return (m1c) this.l.getValue();
    }

    @Override // com.sportybet.android.social.data.local.CCPDatabase
    public final b2c z() {
        return (b2c) this.o.getValue();
    }
}
