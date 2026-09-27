package gp;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f87246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87247b;

    public b(int version, String regexList) {
        this.f87247b = version;
        this.f87246a = regexList;
        if (TextUtils.isEmpty(regexList)) {
            this.f87246a = a.f87219a;
        }
    }

    public String a() {
        return this.f87246a;
    }

    public int b() {
        return this.f87247b;
    }

    public void c(String regexList) {
        this.f87246a = regexList;
    }

    public void d(int version) {
        this.f87247b = version;
    }
}
