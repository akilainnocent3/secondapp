package io.appmetrica.analytics.impl;

import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5424ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f98410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98411b;

    public C5424ud(List list, long j10) {
        this.f98410a = list;
        this.f98411b = j10;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C4968cd> list = this.f98410a;
            ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
            for (C4968cd c4968cd : list) {
                c4968cd.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c4968cd.f97112a);
                    jSONObject.put(C4235d4.i.f61436r, c4968cd.f97113b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f98411b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5424ud)) {
            return false;
        }
        C5424ud c5424ud = (C5424ud) obj;
        return kotlin.jvm.internal.m0.g(this.f98410a, c5424ud.f98410a) && this.f98411b == c5424ud.f98411b;
    }

    public final int hashCode() {
        return f0.p.a(this.f98411b) + (this.f98410a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f98410a + ", lastSendTime=" + this.f98411b + ')';
    }
}
