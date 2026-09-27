package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ko3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f151638f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f151640h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f151647o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f151633a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f151634b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f151635c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f151636d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f151637e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f151639g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f151641i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f151642j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f151643k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f151644l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f151645m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f151646n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f151648p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f151649q = false;

    public final int a(String str, String str2, Set set, String str3) {
        int i10;
        if (this.f151633a.isEmpty() && this.f151634b.isEmpty() && this.f151635c.isEmpty() && this.f151636d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f151633a;
        if (str4.isEmpty()) {
            i10 = 0;
        } else {
            i10 = str4.equals(str) ? 1073741824 : -1;
        }
        String str5 = this.f151634b;
        if (!str5.isEmpty() && i10 != -1) {
            i10 = str5.equals(str2) ? i10 + 2 : -1;
        }
        String str6 = this.f151636d;
        if (!str6.isEmpty() && i10 != -1) {
            i10 = str6.equals(str3) ? i10 + 4 : -1;
        }
        if (i10 == -1 || !set.containsAll(this.f151635c)) {
            return 0;
        }
        return (this.f151635c.size() * 4) + i10;
    }
}
