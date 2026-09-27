package sg.bigo.ads.controller.b;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.api.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public h f133913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f133914b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private Map<Integer, Map<Integer, a>> f133915c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f133916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f133918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f133919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f133921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f133922g;
    }

    private a a(l lVar) {
        int iB;
        Map<Integer, a> map;
        if (lVar == null) {
            return null;
        }
        int iV = lVar.v();
        if (iV == 0) {
            iV = 1;
        }
        if (iV == 3 || (iB = lVar.b()) == 2 || (map = this.f133915c.get(Integer.valueOf(iV))) == null) {
            return null;
        }
        return map.get(Integer.valueOf(iB));
    }

    private a k(String str) {
        h hVar;
        if (TextUtils.isEmpty(str) || (hVar = this.f133913a) == null) {
            return null;
        }
        return a(hVar.a(str));
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        a(parcel.readString());
    }

    @Override // sg.bigo.ads.api.a.b
    public final boolean c(String str) {
        h hVar;
        l lVarA;
        int iB;
        if (TextUtils.isEmpty(str) || (hVar = this.f133913a) == null || (lVarA = hVar.a(str)) == null) {
            return false;
        }
        int iV = lVarA.v();
        if (iV == 0) {
            iV = 1;
        }
        return (iV == 3 || (iB = lVarA.b()) == 2 || iB == 12) ? false : true;
    }

    @Override // sg.bigo.ads.api.a.b
    public final String d(String str) {
        h hVar;
        l lVarA;
        if (TextUtils.isEmpty(str) || (hVar = this.f133913a) == null || (lVarA = hVar.a(str)) == null) {
            return null;
        }
        return String.valueOf(lVarA.b());
    }

    @Override // sg.bigo.ads.api.a.b
    public final long e(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.f133916a;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.a.b
    public final int f(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.f133921f;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.b
    public final int g(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.f133922g;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.b
    public final int h(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.f133917b;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.b
    public final boolean i(String str) {
        a aVarK = k(str);
        return aVarK != null && aVarK.f133918c == 1;
    }

    @Override // sg.bigo.ads.api.a.b
    public final long j(String str) {
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.f133919d;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f133914b);
    }

    @Override // sg.bigo.ads.api.a.b
    public final boolean b(String str) {
        a aVarK = k(str);
        return aVarK != null && aVarK.f133920e == 1;
    }

    @Override // sg.bigo.ads.api.a.b
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f133915c.isEmpty()) {
                return;
            }
            this.f133915c = new HashMap();
            return;
        }
        this.f133914b = str;
        try {
            JSONArray jSONArray = new JSONArray(str);
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    a aVar = new a();
                    aVar.f133916a = jSONObjectOptJSONObject.optLong("tmax", 15L);
                    aVar.f133917b = jSONObjectOptJSONObject.optInt("cache_num", 2);
                    aVar.f133918c = jSONObjectOptJSONObject.optInt("single_ad", 0);
                    aVar.f133919d = jSONObjectOptJSONObject.optLong("single_tmax", 15L);
                    aVar.f133920e = jSONObjectOptJSONObject.optInt("tmax_switch", 0);
                    aVar.f133921f = jSONObjectOptJSONObject.optInt("tmax_strategy", 0);
                    aVar.f133922g = jSONObjectOptJSONObject.optInt("assign_strategy", 0);
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("auc_type");
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("ad_type");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                            int iOptInt = jSONArrayOptJSONArray.optInt(i11);
                            if (iOptInt == 0) {
                                iOptInt = 1;
                            }
                            Map map2 = (Map) map.get(Integer.valueOf(iOptInt));
                            if (map2 == null) {
                                map2 = new HashMap();
                                map.put(Integer.valueOf(iOptInt), map2);
                            }
                            for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                                int iOptInt2 = jSONArrayOptJSONArray2.optInt(i12);
                                if (((a) map2.get(Integer.valueOf(iOptInt2))) == null) {
                                    map2.put(Integer.valueOf(iOptInt2), aVar);
                                }
                            }
                        }
                    }
                }
            }
            this.f133915c = map;
        } catch (JSONException unused) {
        }
    }
}
