package com.sporty.android.platform.features.homeshortcut.db;

import defpackage.h690;
import defpackage.hwr;
import defpackage.jq40;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o0p;
import defpackage.q690;
import defpackage.r690;
import defpackage.uv50;
import defpackage.ygp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/homeshortcut/db/ShortcutDatabase_Impl;", "Lcom/sporty/android/platform/features/homeshortcut/db/ShortcutDatabase;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ShortcutDatabase_Impl extends ShortcutDatabase {
    public final mpe0 m = hwr.b(new q690(this, 0));

    @Override // defpackage.lv50
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new LinkedHashMap(), new LinkedHashMap(), "shortcut_record", "home_shortcut");
    }

    @Override // defpackage.lv50
    public final uv50 f() {
        return new r690(this);
    }

    @Override // defpackage.lv50
    public final Set<ygp<Object>> l() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lv50
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(jq40.a(h690.class), m2g.a);
        return linkedHashMap;
    }

    @Override // com.sporty.android.platform.features.homeshortcut.db.ShortcutDatabase
    public final h690 x() {
        return (h690) this.m.getValue();
    }
}
