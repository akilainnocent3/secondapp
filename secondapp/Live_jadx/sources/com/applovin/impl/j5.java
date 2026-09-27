package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f27340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f27341b = new Object();

    public j5(JSONObject jSONObject) {
        this.f27340a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f27341b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f27340a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f27341b) {
            stringList = JsonUtils.getStringList(this.f27340a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f27341b) {
            this.f27340a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f27341b) {
            string = this.f27340a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f27341b) {
            zHas = this.f27340a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f27341b) {
            objOpt = this.f27340a.opt(str);
        }
        return objOpt;
    }

    public void a(e2.e eVar) {
        synchronized (this.f27341b) {
            eVar.accept(this);
        }
    }

    public void b(String str, int i10) {
        synchronized (this.f27341b) {
            JsonUtils.putInt(this.f27340a, str, i10);
        }
    }

    public Object a(w.a aVar) {
        Object objApply;
        synchronized (this.f27341b) {
            objApply = aVar.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j10) {
        synchronized (this.f27341b) {
            JsonUtils.putLong(this.f27340a, str, j10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f27341b) {
            bool2 = JsonUtils.getBoolean(this.f27340a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f27341b) {
            JsonUtils.putString(this.f27340a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f27341b) {
            f11 = JsonUtils.getFloat(this.f27340a, str, f10);
        }
        return f11;
    }

    public double a(String str, double d10) {
        double d11;
        synchronized (this.f27341b) {
            d11 = JsonUtils.getDouble(this.f27340a, str, d10);
        }
        return d11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f27341b) {
            i11 = JsonUtils.getInt(this.f27340a, str, i10);
        }
        return i11;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f27341b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f27340a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f27341b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f27340a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f27341b) {
            j11 = JsonUtils.getLong(this.f27340a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f27341b) {
            string = JsonUtils.getString(this.f27340a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f27341b) {
            integerList = JsonUtils.getIntegerList(this.f27340a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f27341b) {
            JsonUtils.putBoolean(this.f27340a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f27341b) {
            JsonUtils.putObject(this.f27340a, str, obj);
        }
    }
}
