package com.cleveradssolutions.mediation;

import fr.n1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.v1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@dr.o(message = "Use new MediationParameters instead")
public final class m extends JSONObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f43891a;

    public m() {
        this(n1.z());
    }

    @oy.l
    public final String a(@oy.l String field) {
        m0.p(field, "field");
        return getString("appopen_" + field);
    }

    @oy.l
    public final String b(@oy.l String field) {
        m0.p(field, "field");
        return getString("banner_" + field);
    }

    @oy.l
    public final String c(@oy.l String field) {
        m0.p(field, "field");
        return getString("inter_" + field);
    }

    @oy.l
    public final Set<String> d() {
        return this.f43891a.keySet();
    }

    @oy.l
    public final String e(@oy.l String field) {
        m0.p(field, "field");
        return getString("native_" + field);
    }

    @Override // org.json.JSONObject
    @oy.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public m put(@oy.l String name, @oy.m Object obj) {
        m0.p(name, "name");
        Map map = this.f43891a;
        if (!v1.H(map)) {
            map = null;
        }
        if (map == null) {
            map = new HashMap(this.f43891a);
            this.f43891a = map;
        }
        if (obj == null) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            m0.o(lowerCase, "toLowerCase(...)");
            map.remove(lowerCase);
            return this;
        }
        String lowerCase2 = name.toLowerCase(Locale.ROOT);
        m0.o(lowerCase2, "toLowerCase(...)");
        map.put(lowerCase2, obj);
        return this;
    }

    @oy.l
    public final String g(@oy.l String field) {
        m0.p(field, "field");
        return getString("reward_" + field);
    }

    @Override // org.json.JSONObject
    @oy.l
    public Object get(@oy.l String name) throws q {
        m0.p(name, "name");
        Object objOpt = super.opt(name);
        if (objOpt != null) {
            return objOpt;
        }
        throw new q(name);
    }

    @Override // org.json.JSONObject
    public int getInt(@oy.l String name) throws q {
        m0.p(name, "name");
        int iOptInt = optInt(name, 0);
        if (iOptInt != 0) {
            return iOptInt;
        }
        throw new q(name);
    }

    @Override // org.json.JSONObject
    public long getLong(@oy.l String name) throws q {
        m0.p(name, "name");
        long jOptLong = optLong(name, 0L);
        if (jOptLong != 0) {
            return jOptLong;
        }
        throw new q(name);
    }

    @Override // org.json.JSONObject
    @oy.l
    public String getString(@oy.l String name) throws q {
        m0.p(name, "name");
        String strOptString = optString(name, "");
        m0.m(strOptString);
        if (strOptString.length() != 0) {
            return strOptString;
        }
        throw new q(name);
    }

    @Override // org.json.JSONObject
    public boolean has(@oy.m String str) {
        String lowerCase;
        Map map = this.f43891a;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            m0.o(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return map.containsKey(lowerCase);
    }

    @Override // org.json.JSONObject
    @oy.l
    public Iterator<String> keys() {
        return d().iterator();
    }

    @Override // org.json.JSONObject
    @oy.m
    public Object opt(@oy.m String str) {
        if (str == null) {
            return null;
        }
        Map map = this.f43891a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        m0.o(lowerCase, "toLowerCase(...)");
        return map.get(lowerCase);
    }

    public m(@oy.l Map<String, ? extends Object> map) {
        m0.p(map, "map");
        this.f43891a = map;
    }
}
