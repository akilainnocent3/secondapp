package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f44447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f44448b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44449c;

    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0172  */
    public static e a(JSONObject jSONObject) {
        a aVar;
        int i10;
        String str;
        String str2;
        Object obj;
        String str3;
        ArrayList arrayList;
        g gVar;
        String str4 = null;
        String strOptString = jSONObject.optString("updateHash", null);
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        e eVar = new e();
        eVar.f44449c = strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("app");
        int iOptInt = jSONObjectOptJSONObject == null ? -1 : jSONObjectOptJSONObject.optInt("id", -1);
        String str5 = "isActive";
        if (iOptInt == -1) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.f44436a = String.valueOf(iOptInt);
            aVar.f44437b = jSONObjectOptJSONObject.optString("publisherId", null);
            aVar.f44438c = f.a(jSONObjectOptJSONObject.optJSONObject(kp.b.f102821a));
            aVar.f44439d = j.a(jSONObjectOptJSONObject.optJSONObject("video"));
            aVar.f44440e = b.a(jSONObjectOptJSONObject.optJSONObject("display"));
            aVar.f44441f = k.a(jSONObjectOptJSONObject.optJSONObject("viewability"));
            aVar.f44442g = jSONObjectOptJSONObject.optString("isActive", null);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("native");
            if (jSONObjectOptJSONObject2 != null) {
                UnitDisplayType.fromValue(jSONObjectOptJSONObject2.optString("unitDisplayType"));
            }
        }
        if (aVar == null) {
            return null;
        }
        eVar.f44447a = aVar;
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("spots");
        if (jSONArrayOptJSONArray != null) {
            int i11 = 0;
            while (i11 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject3 == null) {
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    String str6 = str4;
                    i10 = i11;
                    str = str5;
                    str2 = str6;
                    obj = str6;
                } else {
                    String strOptString2 = jSONObjectOptJSONObject3.optString("id", str4);
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        String str7 = str4;
                        i10 = i11;
                        str = str5;
                        str2 = str7;
                        obj = str7;
                    } else {
                        h hVar = new h();
                        hVar.f44451a = strOptString2;
                        hVar.f44452b = jSONObjectOptJSONObject3.optString(str5, str4);
                        hVar.f44453c = b.a(jSONObjectOptJSONObject3.optJSONObject("display"));
                        hVar.f44454d = f.a(jSONObjectOptJSONObject3.optJSONObject(kp.b.f102821a));
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("native");
                        if (jSONObjectOptJSONObject4 != null) {
                            UnitDisplayType.fromValue(jSONObjectOptJSONObject4.optString("unitDisplayType"));
                        }
                        hVar.f44455e = j.a(jSONObjectOptJSONObject3.optJSONObject("video"));
                        hVar.f44456f = k.a(jSONObjectOptJSONObject3.optJSONObject("viewability"));
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("units");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            i10 = i11;
                            str = str5;
                            str3 = str4;
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            int i12 = 0;
                            while (i12 < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i12);
                                int i13 = i12;
                                if (jSONObjectOptJSONObject5 != null) {
                                    i iVar = new i();
                                    iVar.f44458a = jSONObjectOptJSONObject5.optString("id", null);
                                    iVar.f44459b = jSONObjectOptJSONObject5.optString("spotId", null);
                                    iVar.f44460c = b.a(jSONObjectOptJSONObject5.optJSONObject("display"));
                                    iVar.f44461d = f.a(jSONObjectOptJSONObject5.optJSONObject(kp.b.f102821a));
                                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("native");
                                    if (jSONObjectOptJSONObject6 == null) {
                                        gVar = null;
                                    } else {
                                        g gVar2 = new g();
                                        if (UnitDisplayType.fromValue(jSONObjectOptJSONObject6.optString("unitDisplayType")) != null) {
                                            gVar = gVar2;
                                        } else {
                                            gVar = null;
                                        }
                                    }
                                    iVar.f44462e = gVar;
                                    iVar.f44463f = j.a(jSONObjectOptJSONObject5.optJSONObject("video"));
                                    iVar.f44464g = k.a(jSONObjectOptJSONObject5.optJSONObject("viewability"));
                                    arrayList.add(iVar);
                                }
                                i12 = i13 + 1;
                                str5 = str5;
                                i11 = i11;
                            }
                            i10 = i11;
                            str = str5;
                            str3 = null;
                        }
                        hVar.f44457g = arrayList;
                        obj = hVar;
                        str2 = str3;
                    }
                }
                if (obj != null) {
                    arrayList2.add(obj);
                }
                str4 = str2;
                str5 = str;
                i11 = i10 + 1;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
        }
        eVar.f44448b = arrayList2;
        return eVar;
    }
}
