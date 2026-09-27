package com.bytedance.sdk.openadsdk.kub;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    private SharedPreferences hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f37458sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Context f37459tq;

    public tq(Context context, String str) {
        this.f37459tq = context;
        this.f37458sd = str;
    }

    private SharedPreferences tq() {
        Context context;
        SharedPreferences sharedPreferences = this.hww;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.f37458sd) || (context = this.f37459tq) == null) {
            return null;
        }
        try {
            this.hww = context.getSharedPreferences(this.f37458sd, 0);
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
        return this.hww;
    }

    public void hww(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesTq = tq();
            if (sharedPreferencesTq != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesTq.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                editorEdit.putFloat(next, ((Double) obj).floatValue());
                            }
                        }
                    } catch (Throwable th2) {
                        Log.e("SPUnit", th2.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th3) {
            Log.e("SPUnit", th3.getMessage());
        }
    }

    public long tq(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesTq = tq();
            if (sharedPreferencesTq != null && sharedPreferencesTq.contains(str)) {
                return sharedPreferencesTq.getLong(str, j10);
            }
            return j10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.f37458sd + th2.getMessage());
            return j10;
        }
    }

    public void hww(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesTq = tq();
            if (sharedPreferencesTq != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesTq.edit();
                editorEdit.putLong(str, j10);
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public int hww(String str, int i10) {
        try {
            SharedPreferences sharedPreferencesTq = tq();
            if (sharedPreferencesTq != null && sharedPreferencesTq.contains(str)) {
                return sharedPreferencesTq.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.f37458sd + th2.getMessage());
            return i10;
        }
    }

    public String hww(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesTq = tq();
            if (sharedPreferencesTq != null && sharedPreferencesTq.contains(str)) {
                return sharedPreferencesTq.getString(str, str2);
            }
            return str2;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.f37458sd + th2.getMessage());
            return str2;
        }
    }

    public boolean hww(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferencesTq = tq();
            if (sharedPreferencesTq != null && sharedPreferencesTq.contains(str)) {
                return sharedPreferencesTq.getBoolean(str, z10);
            }
            return z10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.f37458sd + th2.getMessage());
            return z10;
        }
    }

    public void hww() {
        SharedPreferences sharedPreferencesTq = tq();
        if (sharedPreferencesTq != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesTq.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
