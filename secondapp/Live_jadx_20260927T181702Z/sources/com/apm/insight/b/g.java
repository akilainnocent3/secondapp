package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.p;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f25811r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f25812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f25814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f25817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f25818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f25821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f25822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f25823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f25824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f25825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f25827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f25828q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f25829s;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f25838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f25839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f25840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f25841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        StackTraceElement[] f25843f;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f25844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25845b;

        public final void a(a aVar) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f25846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f25847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f25848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f25851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f25852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f25853h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f25854i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f25855j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f25856k;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, g.a(this.f25853h));
                jSONObject.put("cpuDuration", this.f25852g);
                jSONObject.put("duration", this.f25851f);
                jSONObject.put("type", this.f25849d);
                jSONObject.put("count", this.f25850e);
                jSONObject.put("messageCount", this.f25850e);
                jSONObject.put("lastDuration", this.f25847b - this.f25848c);
                jSONObject.put("start", this.f25846a);
                jSONObject.put("end", this.f25847b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }

        public final void b() {
            this.f25849d = -1;
            this.f25850e = -1;
            this.f25851f = -1L;
            this.f25853h = null;
            this.f25855j = null;
            this.f25856k = null;
            this.f25854i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ p e() {
        return null;
    }

    private g(byte b10) {
        this.f25813b = 0;
        this.f25814c = 0;
        this.f25815d = 100;
        this.f25816e = 200;
        this.f25818g = -1L;
        this.f25819h = -1L;
        this.f25820i = -1;
        this.f25821j = -1L;
        this.f25825n = false;
        this.f25826o = false;
        this.f25828q = false;
        this.f25829s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f25832b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f25831a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f25833c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f25834d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f25835e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f25844a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f25833c == g.this.f25814c) {
                    this.f25834d++;
                } else {
                    this.f25834d = 0;
                    this.f25835e = 0;
                    this.f25832b = jUptimeMillis;
                }
                this.f25833c = g.this.f25814c;
                int i10 = this.f25834d;
                if (i10 > 0 && i10 - this.f25835e >= g.f25811r && this.f25831a != 0 && jUptimeMillis - this.f25832b > 700 && g.this.f25828q) {
                    aVar.f25843f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f25835e = this.f25834d;
                }
                aVar.f25841d = g.this.f25828q;
                aVar.f25840c = (jUptimeMillis - this.f25831a) - 300;
                aVar.f25838a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f25831a = jUptimeMillis2;
                aVar.f25839b = jUptimeMillis2 - jUptimeMillis;
                aVar.f25842e = g.this.f25814c;
                g.e().a(g.this.f25829s, 300L);
                g.c().a(aVar);
            }
        };
        this.f25812a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f25827p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f25813b;
        gVar.f25813b = i10 + 1;
        return i10;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f25817f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f25825n) {
            return;
        }
        this.f25825n = true;
        this.f25815d = 100;
        this.f25816e = 300;
        this.f25817f = new f(100);
        this.f25824m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f25805a);
                g gVar = g.this;
                gVar.f25822k = gVar.f25823l;
                g.this.f25823l = "no message running";
                g.this.f25828q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f25828q = true;
                g.this.f25823l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f25805a);
            }
        };
        h.a();
        h.a(this.f25824m);
        j.a(j.a());
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f25859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<e> f25860d = new ArrayList();

        public f(int i10) {
            this.f25857a = i10;
        }

        public final e a(int i10) {
            e eVar = this.f25859c;
            if (eVar != null) {
                eVar.f25849d = i10;
                this.f25859c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f25849d = i10;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.f25860d.size();
            int i10 = this.f25857a;
            if (size < i10) {
                this.f25860d.add(eVar);
                this.f25858b = this.f25860d.size();
                return;
            }
            int i11 = this.f25858b % i10;
            this.f25858b = i11;
            e eVar2 = this.f25860d.set(i11, eVar);
            eVar2.b();
            this.f25859c = eVar2;
            this.f25858b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f25860d.size() == this.f25857a) {
                for (int i11 = this.f25858b; i11 < this.f25860d.size(); i11++) {
                    arrayList.add(this.f25860d.get(i11));
                }
                while (i10 < this.f25858b - 1) {
                    arrayList.add(this.f25860d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f25860d.size()) {
                    arrayList.add(this.f25860d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f25826o = true;
        e eVarA = this.f25817f.a(i10);
        eVarA.f25851f = j10 - this.f25818g;
        if (z10) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f25852g = jCurrentThreadTimeMillis - this.f25821j;
            this.f25821j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f25852g = -1L;
        }
        eVarA.f25850e = this.f25813b;
        eVarA.f25853h = str;
        eVarA.f25854i = this.f25822k;
        eVarA.f25846a = this.f25818g;
        eVarA.f25847b = j10;
        eVarA.f25848c = this.f25819h;
        this.f25817f.a(eVarA);
        this.f25813b = 0;
        this.f25818g = j10;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f25853h = this.f25823l;
        eVar.f25854i = this.f25822k;
        eVar.f25851f = j10 - this.f25819h;
        eVar.f25852g = 0 - this.f25821j;
        eVar.f25850e = this.f25813b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(":");
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains(to.c.phraseDel)) {
                String[] strArrSplit2 = str.split(to.c.phraseDel);
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains(gi.j.f86770c) && str.contains(gi.j.f86771d) && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(gi.j.f86771d, "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z10, long j10) {
        int i10 = gVar.f25814c + 1;
        gVar.f25814c = i10;
        gVar.f25814c = i10 & 65535;
        gVar.f25826o = false;
        if (gVar.f25818g < 0) {
            gVar.f25818g = j10;
        }
        if (gVar.f25819h < 0) {
            gVar.f25819h = j10;
        }
        if (gVar.f25820i < 0) {
            gVar.f25820i = Process.myTid();
            gVar.f25821j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f25818g;
        int i11 = gVar.f25816e;
        if (j11 > i11) {
            long j12 = gVar.f25819h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f25823l);
            } else if (z10) {
                if (gVar.f25813b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f25822k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f25813b == 0) {
                gVar.a(8, j10, gVar.f25823l, true);
            } else {
                gVar.a(9, j12, gVar.f25822k, false);
                gVar.a(8, j10, gVar.f25823l, true);
            }
        }
        gVar.f25819h = j10;
    }
}
