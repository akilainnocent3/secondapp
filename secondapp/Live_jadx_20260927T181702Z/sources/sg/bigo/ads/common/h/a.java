package sg.bigo.ads.common.h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.f;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f133058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f133059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f133060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f133061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f133062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f133063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f133064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f133065i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f133069m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f133072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f133073q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f133075s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f133066j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f133067k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f133068l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f133070n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f133071o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1347a f133074r = new C1347a();

    /* JADX INFO: renamed from: sg.bigo.ads.common.h.a$a, reason: collision with other inner class name */
    public static class C1347a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133076a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f133077b = false;

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("support_pd_flag", Integer.valueOf(this.f133076a));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public a(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z10, boolean z11, boolean z12, @Nullable c cVar) {
        this.f133058b = str;
        this.f133059c = str2;
        this.f133060d = str3;
        this.f133061e = z10 ? 1 : 0;
        this.f133062f = z12;
        this.f133073q = z11;
        String strA = a();
        long jA = f.a(strA, 1);
        this.f133063g = jA <= 0 ? f.a(f.d(strA), 1) : jA;
        String strValueOf = String.valueOf(str.hashCode());
        this.f133057a = strValueOf;
        this.f133075s = cVar;
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", "newInstance mId = " + strValueOf + ", savedSize = " + this.f133063g + ", mIsSupportFillTime = " + c());
    }

    public final String a() {
        return this.f133059c + File.separator + this.f133060d;
    }

    public final boolean b() {
        return this.f133066j == 3;
    }

    public final boolean c() {
        c cVar = this.f133075s;
        return cVar != null && cVar.f133124a;
    }

    public final boolean d() {
        c cVar = this.f133075s;
        return cVar != null && cVar.f133125b;
    }

    public final int e() {
        c cVar = this.f133075s;
        if (cVar != null) {
            return cVar.f133126c;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f133058b.equals(aVar.f133058b) && this.f133060d.equals(aVar.f133060d) && this.f133059c.equals(aVar.f133059c);
    }

    public final int f() {
        c cVar = this.f133075s;
        if (cVar != null) {
            return cVar.f133127d;
        }
        return 5;
    }

    public final int g() {
        c cVar = this.f133075s;
        if (cVar != null) {
            return cVar.f133128e;
        }
        return 20;
    }

    public final boolean h() {
        if (this.f133058b.endsWith(".mp4") && this.f133074r.f133076a == -1) {
            if (f.a(f.d(a()))) {
                this.f133074r.f133076a = 1;
            } else {
                this.f133074r.f133076a = 0;
            }
        }
        return this.f133074r.f133076a == 1;
    }

    @NonNull
    public String toString() {
        return " url = " + this.f133058b + ", fileName = " + this.f133060d + ", filePath = " + this.f133059c + ", downloadCount = " + this.f133067k + ", totalSize = " + this.f133065i + ", loadedSize = " + this.f133063g + ", mState = " + this.f133066j + ", mLastDownloadEndTime = " + this.f133068l + ", mExt = " + this.f133074r.a() + ", contentType = " + this.f133072p + " isSupportFillTime = " + c() + " adFillTime = " + e() + " adCheckProcessTime = " + f() + " adCheckMinProcess = " + g();
    }
}
