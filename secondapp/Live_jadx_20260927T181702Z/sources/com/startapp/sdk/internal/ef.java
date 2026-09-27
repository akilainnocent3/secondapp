package com.startapp.sdk.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadataItem;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.io.StringReader;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f74746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3 f74747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RscMetadata f74748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f74749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedList f74750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakHashMap f74751f = new WeakHashMap();

    public ef(Context context, n3 n3Var) {
        this.f74746a = context;
        this.f74747b = n3Var;
    }

    public static JSONArray a(gf gfVar) {
        z2 z2Var = gfVar.f74875a;
        String[] strArr = z2Var.f75947c;
        Object[] objArr = z2Var.f75949e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i10], objArr[i10]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e10) {
                if (gfVar.a(32)) {
                    d9.a(e10);
                }
            }
        } else if (gfVar.a(512)) {
            d9 d9Var = new d9(e9.f74722e);
            d9Var.f74675d = "c690e4ef5365d88b";
            d9Var.f74676e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
            d9Var.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final List a() {
        ArrayList<hf> arrayList;
        z2 z2VarA;
        Object hfVar;
        this.f74747b.getClass();
        RscMetadata rscMetadataS = MetaData.E().S();
        z2 z2Var = null;
        RscMetadata rscMetadata = (rscMetadataS == null || !rscMetadataS.d()) ? null : rscMetadataS;
        if (rscMetadata == null) {
            return a(null, null, null);
        }
        synchronized (this) {
            try {
                if (rscMetadata.equals(this.f74748c)) {
                    return this.f74750e;
                }
                String strC = rscMetadata.c();
                int i10 = 4;
                int i11 = 2;
                int i12 = 8;
                int i13 = 0;
                if (strC == null || strC.length() < 1) {
                    arrayList = null;
                } else {
                    try {
                        try {
                            ArrayList arrayListA = gb.a(new JsonReader(new StringReader(new String(si.a(g.a(Base64.decode(strC, 8)))))));
                            arrayList = new ArrayList();
                            for (Object obj : arrayListA) {
                                if (!(obj instanceof Map)) {
                                    hfVar = new hf();
                                } else {
                                    Map map = (Map) obj;
                                    Object obj2 = map.get("type");
                                    Object obj3 = map.get("params");
                                    if (obj2 instanceof Number) {
                                        int iIntValue = ((Number) obj2).intValue();
                                        if (iIntValue != 1) {
                                            if (iIntValue != 2) {
                                                if (iIntValue != 3) {
                                                    if (iIntValue == 4 && (obj3 instanceof List)) {
                                                        List list = (List) obj3;
                                                        if (list.size() > 0) {
                                                            e9 e9Var = (e9) e9.f74720c.get(String.valueOf(list.get(0)));
                                                            if (e9Var != null) {
                                                                hfVar = new af(e9Var, list.size() > 1 ? String.valueOf(list.get(1)) : null);
                                                            } else {
                                                                hfVar = new hf();
                                                            }
                                                        } else {
                                                            hfVar = new hf();
                                                        }
                                                    } else {
                                                        hfVar = new hf();
                                                    }
                                                } else if (obj3 instanceof Map) {
                                                    Map map2 = (Map) obj3;
                                                    Object obj4 = map2.get("action");
                                                    if (obj4 instanceof String) {
                                                        Object obj5 = map2.get("extras");
                                                        HashMap map3 = new HashMap();
                                                        if (obj5 instanceof Map) {
                                                            for (Map.Entry entry : ((Map) obj5).entrySet()) {
                                                                Object key = entry.getKey();
                                                                if (key instanceof String) {
                                                                    map3.put((String) key, String.valueOf(entry.getValue()));
                                                                }
                                                            }
                                                        }
                                                        hfVar = new ze((String) obj4, map3);
                                                    } else {
                                                        hfVar = new hf();
                                                    }
                                                } else {
                                                    hfVar = new hf();
                                                }
                                            } else if (obj3 instanceof List) {
                                                LinkedList linkedList = new LinkedList();
                                                for (Object obj6 : (List) obj3) {
                                                    if (obj6 instanceof String) {
                                                        e9 e9Var2 = (e9) e9.f74720c.get((String) obj6);
                                                        if (e9Var2 != null) {
                                                            linkedList.add(e9Var2);
                                                        }
                                                    }
                                                }
                                                if (linkedList.size() > 0) {
                                                    hfVar = new bf(linkedList);
                                                } else {
                                                    hfVar = new hf();
                                                }
                                            } else {
                                                hfVar = new hf();
                                            }
                                        } else if (obj3 instanceof Number) {
                                            hfVar = new xe(((Number) obj3).intValue());
                                        } else {
                                            hfVar = new hf();
                                        }
                                    } else {
                                        hfVar = new hf();
                                    }
                                }
                                arrayList.add(hfVar);
                            }
                        } catch (Throwable th2) {
                            if ((rscMetadata.a() & 1) != 0) {
                                d9.a(th2);
                            }
                            arrayList = null;
                        }
                    } catch (Throwable th3) {
                        if ((rscMetadata.a() & 1) != 0) {
                            d9.a(th3);
                        }
                    }
                }
                if (arrayList != null && arrayList.size() >= 1) {
                    List<RscMetadataItem> listB = rscMetadata.b();
                    if (listB != null && listB.size() >= 1) {
                        LinkedList linkedList2 = new LinkedList();
                        for (RscMetadataItem rscMetadataItem : listB) {
                            if (rscMetadataItem != null) {
                                String strA = rscMetadataItem.a();
                                if (strA == null || strA.length() < 1) {
                                    z2VarA = z2Var;
                                } else {
                                    try {
                                        try {
                                            z2VarA = a3.a(new String(si.a(g.a(Base64.decode(strA, i12)))));
                                        } catch (Throwable th4) {
                                            if ((rscMetadata.a(rscMetadataItem) & i10) != 0) {
                                                d9.a(th4);
                                            }
                                            z2VarA = z2Var;
                                        }
                                    } catch (Throwable th5) {
                                        if ((rscMetadata.a(rscMetadataItem) & i11) != 0) {
                                            d9.a(th5);
                                        }
                                    }
                                }
                                if (z2VarA != null) {
                                    int iH = rscMetadataItem.h();
                                    int iD = rscMetadataItem.d();
                                    ArrayList arrayList2 = new ArrayList(Math.min(arrayList.size(), Integer.bitCount(iH)));
                                    int i14 = i13;
                                    for (hf hfVar2 : arrayList) {
                                        int i15 = 1 << i14;
                                        if ((iH & i15) != 0) {
                                            arrayList2.add(new Pair(hfVar2, Boolean.valueOf((iD & i15) != 0 ? 1 : i13)));
                                        }
                                        i14++;
                                        i13 = 0;
                                    }
                                    if (arrayList2.size() >= 1) {
                                        linkedList2.add(new gf(z2VarA, arrayList2, rscMetadataItem.i() != null ? rscMetadataItem.i().intValue() : 300, rscMetadataItem.g(), rscMetadataItem.c(), rscMetadataItem.f(), rscMetadataItem.e() != null ? rscMetadataItem.e().intValue() : 0, rscMetadata.a(rscMetadataItem)));
                                    }
                                    z2Var = null;
                                    i10 = 4;
                                    i11 = 2;
                                    i12 = 8;
                                    i13 = 0;
                                }
                            }
                        }
                        return a(rscMetadata, arrayList, linkedList2);
                    }
                    return a(rscMetadata, null, null);
                }
                return a(rscMetadata, null, null);
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public final synchronized List a(RscMetadata rscMetadata, ArrayList arrayList, LinkedList linkedList) {
        try {
            ArrayList arrayList2 = this.f74749d;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((hf) it.next()).a(this.f74746a);
                    } catch (Throwable th2) {
                        RscMetadata rscMetadata2 = this.f74748c;
                        if (rscMetadata2 != null && (rscMetadata2.a() & 64) != 0) {
                            d9.a(th2);
                        }
                    }
                }
            }
            this.f74748c = rscMetadata;
            this.f74749d = arrayList;
            this.f74750e = linkedList;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((hf) it2.next()).a(this.f74746a, this);
                    } catch (Throwable th3) {
                        if (rscMetadata != null && (rscMetadata.a() & 128) != 0) {
                            d9.a(th3);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return linkedList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0160 A[Catch: JSONException -> 0x0149, TryCatch #3 {JSONException -> 0x0149, blocks: (B:90:0x013a, B:92:0x013f, B:95:0x014b, B:97:0x0151, B:98:0x015a, B:100:0x0160, B:101:0x0165), top: B:148:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:109:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0180  */
    /* JADX WARN: Code duplicated, block: B:113:0x018e A[Catch: JSONException -> 0x0199, TryCatch #2 {JSONException -> 0x0199, blocks: (B:111:0x0186, B:113:0x018e, B:116:0x019b, B:118:0x01a3, B:119:0x01ad), top: B:146:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a3 A[Catch: JSONException -> 0x0199, TryCatch #2 {JSONException -> 0x0199, blocks: (B:111:0x0186, B:113:0x018e, B:116:0x019b, B:118:0x01a3, B:119:0x01ad), top: B:146:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:82:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x013f A[Catch: JSONException -> 0x0149, TryCatch #3 {JSONException -> 0x0149, blocks: (B:90:0x013a, B:92:0x013f, B:95:0x014b, B:97:0x0151, B:98:0x015a, B:100:0x0160, B:101:0x0165), top: B:148:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0151 A[Catch: JSONException -> 0x0149, TryCatch #3 {JSONException -> 0x0149, blocks: (B:90:0x013a, B:92:0x013f, B:95:0x014b, B:97:0x0151, B:98:0x015a, B:100:0x0160, B:101:0x0165), top: B:148:0x013a }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final String a(Object obj) {
        RscMetadata rscMetadata;
        int i10;
        JSONArray jSONArray;
        Iterator it;
        JSONObject jSONObject;
        JSONArray jSONArrayA;
        JSONArray jSONArrayA2;
        Integer num;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        Pair pair;
        List listA = a();
        JSONArray jSONArray2 = null;
        if (listA == null) {
            return null;
        }
        JSONObject jSONObject2 = null;
        for (Iterator it2 = listA.iterator(); it2.hasNext(); it2 = it) {
            gf gfVar = (gf) it2.next();
            try {
                Iterator it3 = gfVar.f74876b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i10 = 0;
                        break;
                    }
                    Pair pair2 = (Pair) it3.next();
                    try {
                        if (((hf) pair2.first).a(obj)) {
                            i10 = (((Boolean) pair2.second).booleanValue() ? 2 : 0) | 1;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (gfVar.a(256)) {
                            d9.a(th);
                        }
                        i10 = 0;
                        break;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if ((i10 & 1) == 0) {
                jSONArray = jSONArray2;
                it = it2;
            } else {
                z2 z2Var = gfVar.f74875a;
                if ((i10 & 2) == 0) {
                    int i11 = gfVar.f74877c;
                    synchronized (this) {
                        pair = (Pair) this.f74751f.get(z2Var);
                    }
                    if (pair == null || (jSONObject = (JSONObject) ((SoftReference) pair.second).get()) == null) {
                        jSONArray = jSONArray2;
                        it = it2;
                    } else {
                        long jLongValue = ((Long) pair.first).longValue();
                        jSONArray = jSONArray2;
                        it = it2;
                        if (jLongValue + ((long) (i11 * 1000)) < SystemClock.elapsedRealtime()) {
                        }
                    }
                    jSONObject = jSONArray;
                } else {
                    jSONArray = jSONArray2;
                    it = it2;
                    jSONObject = jSONArray;
                }
                if (jSONObject == null) {
                    try {
                        jSONArrayA = z2Var.a(this.f74746a, gfVar.f74878d, gfVar.f74879e);
                    } catch (Throwable th4) {
                        if (gfVar.a(8)) {
                            d9.a(th4);
                        }
                        jSONArrayA = jSONArray;
                    }
                    if (jSONArrayA != null && (num = gfVar.f74880f) != null) {
                        try {
                            if ((num.intValue() == 1 ? new ff() : jSONArray) != null) {
                                JSONArray jSONArray3 = new JSONArray();
                                ArrayList arrayList = new ArrayList(jSONArrayA.length());
                                int length = jSONArrayA.length();
                                for (int i12 = 0; i12 < length; i12++) {
                                    JSONObject jSONObject3 = jSONArrayA.getJSONObject(i12);
                                    if (jSONObject3 != null) {
                                        try {
                                            arrayList.add(jSONObject3.getString(ff.f74806a));
                                        } catch (Throwable th5) {
                                            th = th5;
                                            if (gfVar.a(2048)) {
                                                d9.a(th);
                                            }
                                            if (jSONArrayA != null) {
                                                jSONObject = new JSONObject();
                                                try {
                                                    if ((gfVar.f74881g & 1) != 0) {
                                                        jSONObject.put("currentTimeMillis", System.currentTimeMillis());
                                                    }
                                                    if ((gfVar.f74881g & 2) != 0) {
                                                        jSONObject.put("bootTimeMillis", SystemClock.elapsedRealtime());
                                                    }
                                                    jSONArrayA2 = a(gfVar);
                                                    if (jSONArrayA2 != null) {
                                                        jSONObject.put("params", jSONArrayA2);
                                                    }
                                                    jSONObject.put("items", jSONArrayA);
                                                } catch (JSONException e10) {
                                                    if (gfVar.a(32)) {
                                                        d9.a(e10);
                                                    }
                                                }
                                                a(z2Var, jSONObject);
                                            }
                                            if (jSONObject != null) {
                                                if (jSONObject2 == null) {
                                                    jSONObject2 = new JSONObject();
                                                }
                                                try {
                                                    jSONObjectOptJSONObject = jSONObject2.optJSONObject(z2Var.f75945a);
                                                    if (jSONObjectOptJSONObject == null) {
                                                        jSONObjectOptJSONObject = new JSONObject();
                                                        jSONObject2.put(z2Var.f75945a, jSONObjectOptJSONObject);
                                                    }
                                                    jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(z2Var.f75946b);
                                                    if (jSONArrayOptJSONArray == null) {
                                                        jSONArrayOptJSONArray = new JSONArray();
                                                        jSONObjectOptJSONObject.put(z2Var.f75946b, jSONArrayOptJSONArray);
                                                    }
                                                    jSONArrayOptJSONArray.put(jSONObject);
                                                } catch (JSONException e11) {
                                                    if (gfVar.a(32)) {
                                                        d9.a(e11);
                                                    }
                                                }
                                            }
                                            jSONArray2 = jSONArray;
                                        }
                                    }
                                }
                                jSONArray3.put(new BloomFilterCreator().fromKeys(arrayList));
                                jSONArrayA = jSONArray3;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    if (jSONArrayA != null && jSONArrayA.length() > 0) {
                        jSONObject = new JSONObject();
                        if ((gfVar.f74881g & 1) != 0) {
                            jSONObject.put("currentTimeMillis", System.currentTimeMillis());
                        }
                        if ((gfVar.f74881g & 2) != 0) {
                            jSONObject.put("bootTimeMillis", SystemClock.elapsedRealtime());
                        }
                        jSONArrayA2 = a(gfVar);
                        if (jSONArrayA2 != null) {
                            jSONObject.put("params", jSONArrayA2);
                        }
                        jSONObject.put("items", jSONArrayA);
                        a(z2Var, jSONObject);
                    }
                }
                if (jSONObject != null) {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    jSONObjectOptJSONObject = jSONObject2.optJSONObject(z2Var.f75945a);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                        jSONObject2.put(z2Var.f75945a, jSONObjectOptJSONObject);
                    }
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(z2Var.f75946b);
                    if (jSONArrayOptJSONArray == null) {
                        jSONArrayOptJSONArray = new JSONArray();
                        jSONObjectOptJSONObject.put(z2Var.f75946b, jSONArrayOptJSONArray);
                    }
                    jSONArrayOptJSONArray.put(jSONObject);
                }
            }
            jSONArray2 = jSONArray;
        }
        String str = jSONArray2;
        if (jSONObject2 == null) {
            return str;
        }
        try {
            return si.b(jSONObject2.toString());
        } catch (Throwable th7) {
            this.f74747b.getClass();
            RscMetadata rscMetadataS = MetaData.E().S();
            if (rscMetadataS == null || !rscMetadataS.d()) {
                rscMetadata = rscMetadataS;
                rscMetadata = str;
            }
            if (rscMetadata != 0 && (rscMetadata.a() & 16) != 0) {
                d9.a(th7);
            }
            return str;
        }
    }

    public final synchronized void a(z2 z2Var, JSONObject jSONObject) {
        this.f74751f.put(z2Var, new Pair(Long.valueOf(SystemClock.elapsedRealtime()), new SoftReference(jSONObject)));
    }
}
