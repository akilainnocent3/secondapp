package defpackage;

import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class eoi0 {
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    public static nuh0 a(JSONObject jSONObject) {
        Object bVar;
        Object bVar2;
        Object bVar3;
        Object bVar4;
        Object bVar5;
        dv5 dv5Var;
        h0y h0yVar;
        Object bVar6;
        Object bVar7;
        String string;
        jSONObject.getClass();
        if (!jSONObject.has("useTwilioVoice")) {
            return new nuh0.a("Missing field: useTwilioVoice");
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = Boolean.valueOf(jSONObject.getBoolean("useTwilioVoice"));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            return new nuh0.a("Invalid field: useTwilioVoice must be Boolean");
        }
        boolean zBooleanValue = ((Boolean) bVar).booleanValue();
        if (!jSONObject.has("accessToken")) {
            return new nuh0.a("Missing field: accessToken");
        }
        try {
            bVar2 = jSONObject.getString("accessToken");
        } catch (Throwable th2) {
            zi50.a aVar3 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        if (zi50.a(bVar2) != null) {
            return new nuh0.a("Invalid field: accessToken must be String");
        }
        String str = (String) bVar2;
        str.getClass();
        if (StringsKt.U(str)) {
            return new nuh0.a("Invalid field: accessToken is empty");
        }
        if (!jSONObject.has("callParams")) {
            return new nuh0.a("Missing field: callParams");
        }
        try {
            bVar3 = jSONObject.getJSONObject("callParams");
        } catch (Throwable th3) {
            zi50.a aVar4 = zi50.b;
            bVar3 = new zi50.b(th3);
        }
        if (zi50.a(bVar3) != null) {
            return new nuh0.a("Invalid field: callParams is missing");
        }
        JSONObject jSONObject2 = (JSONObject) bVar3;
        jSONObject2.getClass();
        if (jSONObject2.has("voiceChatId") && jSONObject2.has("requesterId")) {
            try {
                bVar4 = jSONObject2.getString("voiceChatId");
            } catch (Throwable th4) {
                zi50.a aVar5 = zi50.b;
                bVar4 = new zi50.b(th4);
            }
            if (bVar4 instanceof zi50.b) {
                bVar4 = null;
            }
            String str2 = (String) bVar4;
            if (str2 == null) {
                dv5Var = null;
            } else {
                try {
                    bVar5 = jSONObject2.getString("requesterId");
                } catch (Throwable th5) {
                    zi50.a aVar6 = zi50.b;
                    bVar5 = new zi50.b(th5);
                }
                if (bVar5 instanceof zi50.b) {
                    bVar5 = null;
                }
                String str3 = (String) bVar5;
                if (str3 == null) {
                    dv5Var = null;
                } else {
                    dv5Var = new dv5(str2, str3);
                }
            }
        } else {
            dv5Var = null;
        }
        if (dv5Var == null) {
            return new nuh0.a("Invalid callParams structure");
        }
        if (jSONObject.has("notification")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("notification");
            try {
                zi50.a aVar7 = zi50.b;
                bVar6 = jSONObject3 != null ? jSONObject3.getString("title") : null;
            } catch (Throwable th6) {
                zi50.a aVar8 = zi50.b;
                bVar6 = new zi50.b(th6);
            }
            if (bVar6 instanceof zi50.b) {
                bVar6 = null;
            }
            String str4 = (String) bVar6;
            if (str4 == null) {
                str4 = "<TITLE>";
            }
            if (jSONObject3 != null) {
                try {
                    string = jSONObject3.getString("text");
                } catch (Throwable th7) {
                    zi50.a aVar9 = zi50.b;
                    bVar7 = new zi50.b(th7);
                }
            } else {
                string = null;
            }
            bVar7 = string;
            String str5 = (String) (bVar7 instanceof zi50.b ? null : bVar7);
            if (str5 == null) {
                str5 = "<TEXT>";
            }
            h0yVar = new h0y(str4, str5);
        } else {
            h0yVar = new h0y("Call in Progress", "Tap to return to call");
        }
        return new nuh0.b(new doi0(zBooleanValue, str, dv5Var, h0yVar));
    }
}
