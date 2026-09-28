package defpackage;

import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class m420 {
    public final h620 a;
    public final String b;
    public final JSONObject c;
    public final long d;

    public static final class a {
        public static m420 a(JSONObject jSONObject) {
            jSONObject.getClass();
            try {
                String string = jSONObject.getString("type");
                string.getClass();
                h620 h620VarValueOf = h620.valueOf(string);
                String string2 = jSONObject.getString("queueKey");
                string2.getClass();
                return new m420(h620VarValueOf, string2, new JSONObject(jSONObject.getString(EventKeys.PAYLOAD)), jSONObject.getLong("enqueuedAtMillis"));
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q("PopupItem");
                aVar.f(e, "Failed to deserialize PopupItem", new Object[0]);
                return null;
            }
        }
    }

    public m420(h620 h620Var, String str, JSONObject jSONObject, long j) {
        h620Var.getClass();
        str.getClass();
        this.a = h620Var;
        this.b = str;
        this.c = jSONObject;
        this.d = j;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.a.name());
        jSONObject.put("queueKey", this.b);
        jSONObject.put(EventKeys.PAYLOAD, this.c.toString());
        jSONObject.put("enqueuedAtMillis", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m420)) {
            return false;
        }
        m420 m420Var = (m420) obj;
        return this.a == m420Var.a && Intrinsics.g(this.b, m420Var.b) && Intrinsics.g(this.c, m420Var.c) && this.d == m420Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "PopupItem(type=" + this.a + ", queueKey=" + this.b + ", payload=" + this.c + ", enqueuedAtMillis=" + this.d + ")";
    }

    public /* synthetic */ m420(h620 h620Var, String str, JSONObject jSONObject) {
        this(h620Var, str, jSONObject, System.currentTimeMillis());
    }
}
