package x4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public abstract class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f144516d = "LibraryLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f144517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f144519c;

    public z(String... strArr) {
        this.f144517a = strArr;
    }

    public synchronized boolean a() {
        if (this.f144518b) {
            return this.f144519c;
        }
        this.f144518b = true;
        try {
            for (String str : this.f144517a) {
                b(str);
            }
            this.f144519c = true;
        } catch (UnsatisfiedLinkError e10) {
            d0.o("LibraryLoader", "Failed to load " + Arrays.toString(this.f144517a), e10);
        }
        return this.f144519c;
    }

    public abstract void b(String str);

    public synchronized void c(String... strArr) {
        zi.l0.h0(!this.f144518b, "Cannot set libraries after loading");
        this.f144517a = strArr;
    }
}
