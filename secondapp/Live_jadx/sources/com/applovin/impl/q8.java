package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class q8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q8 f28443f = new q8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q8 f28444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f28446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f28447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final List f28448e;

    public q8(String str, Map map, q8 q8Var) {
        this.f28444a = q8Var;
        this.f28445b = str;
        this.f28446c = Collections.unmodifiableMap(map);
        this.f28448e = new ArrayList();
    }

    public Map a() {
        return this.f28446c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f28448e);
    }

    public String c() {
        return this.f28445b;
    }

    public String d() {
        return this.f28447d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f28445b + "', text='" + this.f28447d + "', attributes=" + this.f28446c + fw.b.f85383j;
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f28448e.size());
        for (q8 q8Var : this.f28448e) {
            if (str.equalsIgnoreCase(q8Var.c())) {
                arrayList.add(q8Var);
            }
        }
        return arrayList;
    }

    public q8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f28448e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            q8 q8Var = (q8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(q8Var.c())) {
                return q8Var;
            }
            arrayList.addAll(q8Var.b());
        }
        return null;
    }

    public q8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (q8 q8Var : this.f28448e) {
            if (str.equalsIgnoreCase(q8Var.c())) {
                return q8Var;
            }
        }
        return null;
    }

    private q8() {
        this.f28444a = null;
        this.f28445b = "";
        this.f28446c = Collections.EMPTY_MAP;
        this.f28447d = "";
        this.f28448e = Collections.EMPTY_LIST;
    }
}
