package com.sporty.android.core.antest.room;

import defpackage.gvh0;
import defpackage.hwr;
import defpackage.jq40;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.uv50;
import defpackage.wy;
import defpackage.ygp;
import defpackage.zy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/core/antest/room/AnTestOverrideDB_Impl;", "Lcom/sporty/android/core/antest/room/AnTestOverrideDB;", "<init>", "()V", "antest"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AnTestOverrideDB_Impl extends AnTestOverrideDB {
    public final mpe0 l = hwr.b(new wy(this, 0));

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "an_test_variant_override", "an_test_override_setting");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new zy(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(jq40.a(gvh0.class), m2g.a);
        return linkedHashMap;
    }

    @Override // com.sporty.android.core.antest.room.AnTestOverrideDB
    public final gvh0 x() {
        return (gvh0) this.l.getValue();
    }
}
