package eh;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f80925d = "LibraryLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f80926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f80928c;

    public d0(String... strArr) {
        this.f80926a = strArr;
    }

    public synchronized boolean a() {
        if (this.f80927b) {
            return this.f80928c;
        }
        this.f80927b = true;
        try {
            for (String str : this.f80926a) {
                b(str);
            }
            this.f80928c = true;
        } catch (UnsatisfiedLinkError unused) {
            h0.n("LibraryLoader", "Failed to load " + Arrays.toString(this.f80926a));
        }
        return this.f80928c;
    }

    public abstract void b(String str);

    public synchronized void c(String... strArr) {
        a.j(!this.f80927b, "Cannot set libraries after loading");
        this.f80926a = strArr;
    }
}
