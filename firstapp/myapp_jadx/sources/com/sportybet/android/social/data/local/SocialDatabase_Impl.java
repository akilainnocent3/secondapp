package com.sportybet.android.social.data.local;

import defpackage.dq7;
import defpackage.e9a0;
import defpackage.gha0;
import defpackage.hwr;
import defpackage.j9a0;
import defpackage.jp50;
import defpackage.jq40;
import defpackage.lha0;
import defpackage.m2g;
import defpackage.m7a0;
import defpackage.mp50;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.p8a0;
import defpackage.q7a0;
import defpackage.q7x;
import defpackage.u9a0;
import defpackage.uns;
import defpackage.uv50;
import defpackage.ygp;
import defpackage.z9a0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/social/data/local/SocialDatabase_Impl;", "Lcom/sportybet/android/social/data/local/SocialDatabase;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SocialDatabase_Impl extends SocialDatabase {
    public final mpe0 l = hwr.b(new jp50(this, 1));
    public final mpe0 m = hwr.b(new Function0() { // from class: l8a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new kha0(this.a);
        }
    });
    public final mpe0 n = hwr.b(new Function0() { // from class: m8a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new o9a0(this.a);
        }
    });
    public final mpe0 o = hwr.b(new mp50(this, 1));
    public final mpe0 p = hwr.b(new Function0() { // from class: n8a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new daa0(this.a);
        }
    });
    public final mpe0 q = hwr.b(new Function0() { // from class: o8a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new y9a0(this.a);
        }
    });

    public SocialDatabase_Impl() {
        hwr.b(new uns(this, 2));
        hwr.b(new q7x(this));
    }

    @Override // com.sportybet.android.social.data.local.SocialDatabase
    public final z9a0 A() {
        return (z9a0) this.p.getValue();
    }

    @Override // com.sportybet.android.social.data.local.SocialDatabase
    public final gha0 B() {
        return (gha0) this.m.getValue();
    }

    @Override // com.sportybet.android.social.data.local.SocialDatabase
    public final lha0 C() {
        return (lha0) this.l.getValue();
    }

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "social_share_code_table", "social_share_code_cursor_table", "social_follower_table", "social_following_table", "social_follower_cursor_table", "social_following_cursor_table", "social_following_code_table", "social_following_code_cursor_table");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new p8a0(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dq7 dq7VarA = jq40.a(lha0.class);
        m2g m2gVar = m2g.a;
        linkedHashMap.put(dq7VarA, m2gVar);
        linkedHashMap.put(jq40.a(gha0.class), m2gVar);
        linkedHashMap.put(jq40.a(j9a0.class), m2gVar);
        linkedHashMap.put(jq40.a(e9a0.class), m2gVar);
        linkedHashMap.put(jq40.a(z9a0.class), m2gVar);
        linkedHashMap.put(jq40.a(u9a0.class), m2gVar);
        linkedHashMap.put(jq40.a(q7a0.class), m2gVar);
        linkedHashMap.put(jq40.a(m7a0.class), m2gVar);
        return linkedHashMap;
    }

    @Override // com.sportybet.android.social.data.local.SocialDatabase
    public final e9a0 x() {
        return (e9a0) this.o.getValue();
    }

    @Override // com.sportybet.android.social.data.local.SocialDatabase
    public final j9a0 y() {
        return (j9a0) this.n.getValue();
    }

    @Override // com.sportybet.android.social.data.local.SocialDatabase
    public final u9a0 z() {
        return (u9a0) this.q.getValue();
    }
}
