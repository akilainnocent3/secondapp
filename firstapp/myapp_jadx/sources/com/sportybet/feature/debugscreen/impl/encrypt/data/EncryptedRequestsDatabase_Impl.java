package com.sportybet.feature.debugscreen.impl.encrypt.data;

import defpackage.hwr;
import defpackage.jq40;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.t4g;
import defpackage.uv50;
import defpackage.x4g;
import defpackage.y4g;
import defpackage.ygp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/debugscreen/impl/encrypt/data/EncryptedRequestsDatabase_Impl;", "Lcom/sportybet/feature/debugscreen/impl/encrypt/data/EncryptedRequestsDatabase;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EncryptedRequestsDatabase_Impl extends EncryptedRequestsDatabase {
    public final mpe0 l = hwr.b(new x4g(this, 0));

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "debug_screen_encrypted_requests");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new y4g(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(jq40.a(t4g.class), m2g.a);
        return linkedHashMap;
    }

    @Override // com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequestsDatabase
    public final t4g x() {
        return (t4g) this.l.getValue();
    }
}
