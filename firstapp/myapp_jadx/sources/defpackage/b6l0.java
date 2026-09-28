package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b6l0 {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ j6l0 d;

    public b6l0(j6l0 j6l0Var, String str) {
        this.d = j6l0Var;
        hm20.e(str);
        this.a = str;
        this.b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f6 A[Catch: NumberFormatException | JSONException -> 0x0103, NumberFormatException | JSONException -> 0x0103, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0103, blocks: (B:10:0x0029, B:24:0x005d, B:24:0x005d, B:26:0x006a, B:26:0x006a, B:28:0x007c, B:28:0x007c, B:29:0x0085, B:29:0x0085, B:51:0x00f6, B:51:0x00f6, B:33:0x0092, B:33:0x0092, B:35:0x009f, B:35:0x009f, B:37:0x00b1, B:37:0x00b1, B:38:0x00ba, B:38:0x00ba, B:42:0x00c6, B:42:0x00c6, B:46:0x00d6, B:46:0x00d6, B:50:0x00ea, B:50:0x00ea), top: B:63:0x0029, outer: #1 }] */
    public final Bundle a() {
        j6l0 j6l0Var = this.d;
        k8l0 k8l0Var = j6l0Var.a;
        if (this.c == null) {
            String string = j6l0Var.k().getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                kql0.a();
                                                if (k8l0Var.d.q(null, v2l0.Q0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                y4l0 y4l0Var = k8l0Var.f;
                                                k8l0.m(y4l0Var);
                                                y4l0Var.f.b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            kql0.a();
                                            if (k8l0Var.d.q(null, v2l0.Q0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            y4l0 y4l0Var2 = k8l0Var.f;
                                            k8l0.m(y4l0Var2);
                                            y4l0Var2.f.b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        y4l0 y4l0Var3 = k8l0Var.f;
                                        k8l0.m(y4l0Var3);
                                        y4l0Var3.f.b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    y4l0 y4l0Var4 = k8l0Var.f;
                                    k8l0.m(y4l0Var4);
                                    y4l0Var4.f.b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                y4l0 y4l0Var5 = k8l0Var.f;
                                k8l0.m(y4l0Var5);
                                y4l0Var5.f.b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            y4l0 y4l0Var6 = k8l0Var.f;
                            k8l0.m(y4l0Var6);
                            y4l0Var6.f.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    y4l0 y4l0Var7 = k8l0Var.f;
                    k8l0.m(y4l0Var7);
                    y4l0Var7.f.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        Bundle bundle2 = this.c;
        hm20.h(bundle2);
        return new Bundle(bundle2);
    }

    public final void b(Bundle bundle) {
        j6l0 j6l0Var = this.d;
        k8l0 k8l0Var = j6l0Var.a;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor editorEdit = j6l0Var.k().edit();
        int size = bundle2.size();
        String str = this.a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        kql0.a();
                        if (k8l0Var.d.q(null, v2l0.Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                y4l0 y4l0Var = k8l0Var.f;
                                k8l0.m(y4l0Var);
                                y4l0Var.f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                y4l0 y4l0Var2 = k8l0Var.f;
                                k8l0.m(y4l0Var2);
                                y4l0Var2.f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        y4l0 y4l0Var3 = k8l0Var.f;
                        k8l0.m(y4l0Var3);
                        y4l0Var3.f.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.c = bundle2;
    }
}
