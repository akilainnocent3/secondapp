package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.i;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.controller.a.j;
import sw.t;

/* JADX INFO: loaded from: classes7.dex */
public class b implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1364b f133745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1364b f133746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f133748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f133749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<a, C1364b> f133750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<a, List<C1364b>> f133751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f133752h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<a, C1364b> f133753i = b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<a, List<C1364b>> f133754j;

    public static class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final sg.bigo.ads.common.f.a<a> f133756c = new sg.bigo.ads.common.f.a<a>() { // from class: sg.bigo.ads.controller.a.a.b.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a("", 0);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f133757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f133758b;

        public a(String str, int i10) {
            this.f133757a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
            this.f133758b = i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f133757a = n.a(parcel, "");
            this.f133758b = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f133757a, aVar.f133757a) && this.f133758b == aVar.f133758b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f133757a + lk.e.f104695m + this.f133758b).hashCode();
        }

        @NonNull
        public final String toString() {
            return super.toString();
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.f133757a);
            parcel.writeInt(this.f133758b);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.controller.a.a.b$b, reason: collision with other inner class name */
    public static class C1364b extends j implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final sg.bigo.ads.common.f.a<C1364b> f133759e = new sg.bigo.ads.common.f.a<C1364b>() { // from class: sg.bigo.ads.controller.a.a.b.b.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new C1364b("", "", 0);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f133760d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f133761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f133762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f133763h;

        public C1364b(String str, String str2, int i10) {
            super(str, str2, i10);
            this.f133760d = true;
            this.f133761f = 0;
            this.f133762g = 0L;
            this.f133763h = 0;
        }

        public static /* synthetic */ int c(C1364b c1364b) {
            c1364b.f133763h = 0;
            return 0;
        }

        public static /* synthetic */ int e(C1364b c1364b) {
            int i10 = c1364b.f133761f;
            c1364b.f133761f = i10 + 1;
            return i10;
        }

        public static /* synthetic */ int f(C1364b c1364b) {
            c1364b.f133761f = 0;
            return 0;
        }

        public static /* synthetic */ int g(C1364b c1364b) {
            int i10 = c1364b.f133763h;
            c1364b.f133763h = i10 + 1;
            return i10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof j) {
                return TextUtils.equals(this.f133900a, ((j) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f133900a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.f133900a);
            parcel.writeInt(this.f133902c);
            n.a(parcel, this.f133760d);
            parcel.writeString(this.f133901b);
            parcel.writeInt(this.f133761f);
            parcel.writeLong(this.f133762g);
            parcel.writeInt(this.f133763h);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f133900a = n.a(parcel, "");
            this.f133902c = n.a(parcel, 1);
            this.f133760d = n.b(parcel, true);
            this.f133901b = n.a(parcel, "");
            this.f133761f = n.a(parcel, 0);
            this.f133762g = n.a(parcel, 0L);
            this.f133763h = n.a(parcel, 0);
        }

        public final void a(String str) {
            this.f133901b = str;
        }
    }

    public b(@NonNull String str, @Nullable String str2) {
        this.f133748d = str;
        this.f133749e = str2;
    }

    @NonNull
    private Map<a, C1364b> b() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f133748d)) {
            map.put(new a("all", 0), new C1364b(this.f133748d, "", 0));
        }
        if (!TextUtils.isEmpty(this.f133749e)) {
            map.put(new a("ru", 0), new C1364b(this.f133749e, "", 0));
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    public final Pair<String, Integer> a(sg.bigo.ads.api.a.h hVar) {
        synchronized (this) {
            try {
                if (!k.a(this.f133750f) && hVar != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Iterator<Map.Entry<a, C1364b>> it = this.f133750f.entrySet().iterator();
                    while (it.hasNext()) {
                        C1364b value = it.next().getValue();
                        if (!value.f133760d) {
                            if (value.f133761f % hVar.y() == 0) {
                                C1364b.c(value);
                                if (value.f133762g != 0 && Math.round(Math.abs(jCurrentTimeMillis - value.f133762g) / 8.64E7f) <= hVar.A()) {
                                    value = null;
                                }
                            } else if (Math.round(Math.abs(jCurrentTimeMillis - value.f133762g) / 60000.0f) <= hVar.z()) {
                                value = null;
                            }
                            if (value != null) {
                                value.f133762g = jCurrentTimeMillis;
                                C1364b.e(value);
                                return new Pair<>(value.a(), Integer.valueOf(value.f133761f));
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    @NonNull
    private static List<a> a(@NonNull a aVar) {
        ArrayList arrayList = new ArrayList();
        a aVar2 = new a("all", 0);
        if (aVar2.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar2);
        a aVar3 = new a("all", aVar.f133758b);
        if (aVar3.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar3);
        a aVar4 = new a(aVar.f133757a, 0);
        if (aVar4.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar4);
        arrayList.add(0, aVar);
        return arrayList;
    }

    @Nullable
    private C1364b b(Map<a, List<C1364b>> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1364b c1364b = (C1364b) k.a(k.a(map.get(it.next()), new Comparable<C1364b>() { // from class: sg.bigo.ads.controller.a.a.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C1364b c1364b2) {
                        C1364b c1364b3 = c1364b2;
                        return (c1364b3 == null || !c1364b3.f133760d) ? 0 : 1;
                    }
                }));
                if (a(c1364b)) {
                    return c1364b;
                }
            }
        }
        return null;
    }

    @Nullable
    private static C1364b a(Map<a, C1364b> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1364b c1364b = map.get(it.next());
                if (a(c1364b)) {
                    return c1364b;
                }
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.common.f
    @i
    public void b(@NonNull Parcel parcel) {
        synchronized (this) {
            try {
                this.f133750f = n.a(parcel, a.f133756c, C1364b.f133759e);
                this.f133751g = n.b(parcel, a.f133756c, C1364b.f133759e);
                this.f133752h = n.a(parcel, 3);
                Map mapA = n.a(parcel, a.f133756c, C1364b.f133759e);
                this.f133754j = n.b(parcel, a.f133756c, C1364b.f133759e);
                this.f133745a = (C1364b) n.b(parcel, C1364b.f133759e);
                this.f133746b = (C1364b) n.b(parcel, C1364b.f133759e);
                this.f133747c = n.a(parcel, 0);
                this.f133753i = b();
                HashSet hashSet = new HashSet();
                for (C1364b c1364b : this.f133753i.values()) {
                    hashSet.add(c1364b.a());
                    if (!k.a(mapA)) {
                        for (C1364b c1364b2 : mapA.values()) {
                            if (TextUtils.equals(c1364b.a(), c1364b2.a())) {
                                c1364b.f133760d = c1364b2.f133760d;
                            }
                        }
                    }
                }
                C1364b c1364b3 = this.f133746b;
                if (c1364b3 != null && c1364b3.d() == 0 && !hashSet.contains(this.f133746b.a())) {
                    this.f133745a = this.f133746b;
                    this.f133746b = null;
                    this.f133747c = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[PHI: r0
      0x0034: PHI (r0v2 sg.bigo.ads.controller.a.a.b$b) = 
      (r0v1 sg.bigo.ads.controller.a.a.b$b)
      (r0v5 sg.bigo.ads.controller.a.a.b$b)
      (r0v7 sg.bigo.ads.controller.a.a.b$b)
      (r0v9 sg.bigo.ads.controller.a.a.b$b)
     binds: [B:3:0x000b, B:5:0x0017, B:7:0x0023, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    private C1364b a(a aVar, boolean z10) {
        boolean z11;
        C1364b c1364bA = a(this.f133750f, aVar);
        if (a(c1364bA)) {
            z11 = true;
        } else {
            c1364bA = b(this.f133751g, aVar);
            if (a(c1364bA)) {
                z11 = true;
            } else {
                c1364bA = a(this.f133753i, aVar);
                if (a(c1364bA)) {
                    z11 = true;
                } else {
                    c1364bA = b(this.f133754j, aVar);
                    if (a(c1364bA)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("getBestHost ");
        sb2.append(z11 ? "success" : C4235d4.g.f61370e);
        sb2.append(z10 ? " after reset" : "");
        sb2.append(", countryKey=");
        sb2.append(aVar);
        sb2.append(", currentHost=");
        sb2.append(this.f133746b);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBanHost", sb2.toString());
        if (a(c1364bA)) {
            return c1364bA;
        }
        return null;
    }

    @NonNull
    public final sg.bigo.ads.controller.a.e a(String str, int i10) {
        boolean z10;
        sg.bigo.ads.controller.a.e eVar;
        synchronized (this) {
            try {
                C1364b c1364b = this.f133746b;
                if (c1364b == null || this.f133747c >= this.f133752h) {
                    a aVar = new a(str, i10);
                    C1364b c1364bA = a(aVar, false);
                    if (a(c1364bA)) {
                        z10 = false;
                    } else {
                        a();
                        c1364bA = a(aVar, true);
                        z10 = true;
                    }
                    if (a(c1364bA)) {
                        c1364bA.f133760d = false;
                        this.f133745a = this.f133746b;
                        this.f133746b = new C1364b(c1364bA.a(), c1364bA.b(), c1364bA.d());
                        this.f133747c = 0;
                    }
                    if (this.f133746b == null) {
                        this.f133746b = new C1364b(this.f133748d, "", 0);
                    }
                    eVar = new sg.bigo.ads.controller.a.e(this.f133746b, z10, true);
                } else {
                    eVar = new sg.bigo.ads.controller.a.e(c1364b, false, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final void a() {
        Map<a, C1364b> map = this.f133750f;
        if (map != null) {
            Iterator<Map.Entry<a, C1364b>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                C1364b value = it.next().getValue();
                if (value != null) {
                    value.f133760d = true;
                }
            }
        }
        Map<a, List<C1364b>> map2 = this.f133751g;
        if (map2 != null) {
            Iterator<Map.Entry<a, List<C1364b>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                List<C1364b> value2 = it2.next().getValue();
                if (!k.a((Collection) value2)) {
                    Iterator<C1364b> it3 = value2.iterator();
                    while (it3.hasNext()) {
                        it3.next().f133760d = true;
                    }
                }
            }
        }
        Map<a, List<C1364b>> map3 = this.f133754j;
        if (map3 != null) {
            Iterator<Map.Entry<a, List<C1364b>>> it4 = map3.entrySet().iterator();
            while (it4.hasNext()) {
                List<C1364b> value3 = it4.next().getValue();
                if (!k.a((Collection) value3)) {
                    Iterator<C1364b> it5 = value3.iterator();
                    while (it5.hasNext()) {
                        it5.next().f133760d = true;
                    }
                }
            }
        }
        Map<a, C1364b> map4 = this.f133753i;
        if (map4 != null) {
            Iterator<Map.Entry<a, C1364b>> it6 = map4.entrySet().iterator();
            while (it6.hasNext()) {
                C1364b value4 = it6.next().getValue();
                if (value4 != null) {
                    value4.f133760d = true;
                }
            }
        }
        this.f133745a = this.f133746b;
        this.f133746b = null;
        this.f133747c = 0;
    }

    @Override // sg.bigo.ads.common.f
    @i
    public void a(@NonNull Parcel parcel) {
        synchronized (this) {
            n.a(parcel, this.f133750f);
            n.b(parcel, this.f133751g);
            parcel.writeInt(this.f133752h);
            n.a(parcel, this.f133753i);
            n.b(parcel, this.f133754j);
            n.a(parcel, this.f133745a);
            n.a(parcel, this.f133746b);
            parcel.writeInt(this.f133747c);
        }
    }

    private void a(Map<a, C1364b> map, Map<a, List<C1364b>> map2, String str, int i10) {
        C1364b value;
        C1364b c1364b;
        synchronized (this) {
            try {
                if (!k.a(this.f133750f) && !k.a(map)) {
                    for (Map.Entry<a, C1364b> entry : this.f133750f.entrySet()) {
                        a key = entry.getKey();
                        if (key != null && (value = entry.getValue()) != null && (c1364b = map.get(key)) != null && value.equals(c1364b)) {
                            value.a(c1364b.b());
                        }
                    }
                }
                if (!k.a(this.f133751g) && !k.a(map2)) {
                    for (Map.Entry<a, List<C1364b>> entry2 : this.f133751g.entrySet()) {
                        a key2 = entry2.getKey();
                        if (key2 != null) {
                            List<C1364b> value2 = entry2.getValue();
                            if (!k.a((Collection) value2)) {
                                List<C1364b> list = map2.get(key2);
                                if (!k.a((Collection) list)) {
                                    for (C1364b c1364b2 : value2) {
                                        if (c1364b2 != null) {
                                            for (C1364b c1364b3 : list) {
                                                if (c1364b2.equals(c1364b3)) {
                                                    c1364b2.a(c1364b3.b());
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C1364b c1364b4 = this.f133746b;
                if (c1364b4 != null) {
                    if (c1364b4.d() != 1) {
                        if (this.f133746b.d() == 2) {
                            List<C1364b> list2 = this.f133751g.get(new a(str, i10));
                            if (!k.a((Collection) list2)) {
                                for (C1364b c1364b5 : list2) {
                                    if (this.f133746b.equals(c1364b5)) {
                                        this.f133746b.a(c1364b5.b());
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        C1364b c1364b6 = this.f133750f.get(new a(str, i10));
                        if (this.f133746b.equals(c1364b6)) {
                            this.f133746b.a(c1364b6.b());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(@NonNull JSONObject jSONObject, boolean z10, String str, int i10) {
        synchronized (this) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("country_hosts");
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString(t.f135772k, "");
                            if (sg.bigo.ads.controller.a.d.a(strOptString)) {
                                map.put(new a(jSONObjectOptJSONObject.optString("country", "all"), jSONObjectOptJSONObject.optInt("app_flag", 0)), new C1364b(strOptString, jSONObjectOptJSONObject.optString("domain_front", ""), 1));
                            }
                        }
                    }
                }
                HashMap map2 = new HashMap();
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("backup_hosts");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i12);
                        if (jSONObjectOptJSONObject2 != null) {
                            a aVar = new a(jSONObjectOptJSONObject2.optString("country", "all"), jSONObjectOptJSONObject2.optInt("app_flag", 0));
                            List<C1364b> arrayList = map2.get(aVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                map2.put(aVar, arrayList);
                            }
                            String strOptString2 = jSONObjectOptJSONObject2.optString("domain_front", "");
                            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("hosts");
                            if (jSONArrayOptJSONArray3 != null) {
                                for (int i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                                    String strOptString3 = jSONArrayOptJSONArray3.optString(i13, "");
                                    if (sg.bigo.ads.controller.a.d.a(strOptString3)) {
                                        C1364b c1364b = new C1364b(strOptString3, strOptString2, 2);
                                        if (!arrayList.contains(c1364b)) {
                                            arrayList.add(c1364b);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z10) {
                    a(map, map2, str, i10);
                } else {
                    int iOptInt = jSONObject.optInt("threshold", 3);
                    this.f133750f = map;
                    this.f133751g = map2;
                    this.f133752h = iOptInt;
                    this.f133754j = new HashMap();
                    this.f133753i = b();
                    this.f133745a = this.f133746b;
                    this.f133746b = null;
                    this.f133747c = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            try {
                if (sg.bigo.ads.controller.a.d.a(str2)) {
                    a aVar = new a(str, 0);
                    if (this.f133754j == null) {
                        this.f133754j = new HashMap();
                    }
                    List<C1364b> arrayList = this.f133754j.get(aVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.f133754j.put(aVar, arrayList);
                    }
                    C1364b c1364b = new C1364b(str2, "", 3);
                    if (!arrayList.contains(c1364b)) {
                        arrayList.add(c1364b);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(String str, String str2, int i10, sg.bigo.ads.api.a.h hVar, boolean z10) {
        Map<a, C1364b> map;
        C1364b value;
        Map<a, List<C1364b>> map2;
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(str) && (map = this.f133750f) != null && hVar != null) {
                    Iterator<Map.Entry<a, C1364b>> it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            value = it.next().getValue();
                            if (TextUtils.equals(value.a(), str)) {
                                if (!z10) {
                                    C1364b.g(value);
                                    if (value.f133763h != 0 && value.f133763h % hVar.y() == 0) {
                                        break;
                                    }
                                } else {
                                    C1364b.c(value);
                                    C1364b.f(value);
                                }
                            }
                        }
                        value = null;
                        break;
                    }
                    if (value != null) {
                        C1364b.c(value);
                        C1364b.f(value);
                        C1364b c1364bA = a(this.f133750f, new a(str2, i10));
                        if (c1364bA != null) {
                            value = c1364bA;
                        }
                        C1364b c1364b = this.f133746b;
                        if (c1364b != null) {
                            synchronized (this) {
                                try {
                                    ArrayList arrayList = new ArrayList();
                                    int iD = c1364b.d();
                                    if (iD == 0) {
                                        Map<a, C1364b> map3 = this.f133753i;
                                        if (map3 != null) {
                                            for (C1364b c1364b2 : map3.values()) {
                                                if (c1364b2 != null && TextUtils.equals(c1364b2.a(), c1364b.a())) {
                                                    arrayList.add(c1364b2);
                                                }
                                            }
                                        }
                                    } else if (iD == 1) {
                                        Map<a, C1364b> map4 = this.f133750f;
                                        if (map4 != null) {
                                            for (C1364b c1364b3 : map4.values()) {
                                                if (c1364b3 != null && TextUtils.equals(c1364b3.a(), c1364b.a())) {
                                                    arrayList.add(c1364b3);
                                                }
                                            }
                                        }
                                    } else if (iD == 2) {
                                        Map<a, List<C1364b>> map5 = this.f133751g;
                                        if (map5 != null) {
                                            Iterator<List<C1364b>> it2 = map5.values().iterator();
                                            while (it2.hasNext()) {
                                                for (C1364b c1364b4 : it2.next()) {
                                                    if (c1364b4 != null && TextUtils.equals(c1364b4.a(), c1364b.a())) {
                                                        arrayList.add(c1364b4);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (iD == 3 && (map2 = this.f133754j) != null) {
                                        Iterator<List<C1364b>> it3 = map2.values().iterator();
                                        while (it3.hasNext()) {
                                            for (C1364b c1364b5 : it3.next()) {
                                                if (c1364b5 != null && TextUtils.equals(c1364b5.a(), c1364b.a())) {
                                                    arrayList.add(c1364b5);
                                                }
                                            }
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        Iterator it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            ((C1364b) it4.next()).f133760d = true;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        this.f133745a = this.f133746b;
                        this.f133746b = value;
                        this.f133747c = 0;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static boolean a(C1364b c1364b) {
        return c1364b != null && c1364b.f133760d;
    }
}
