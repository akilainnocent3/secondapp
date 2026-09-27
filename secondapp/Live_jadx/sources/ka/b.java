package ka;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f102117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f102118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f102120d;

    public b(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming) {
        this.f102117a = isConnected;
        this.f102118b = isValidated;
        this.f102119c = isMetered;
        this.f102120d = isNotRoaming;
    }

    public boolean a() {
        return this.f102117a;
    }

    public boolean b() {
        return this.f102119c;
    }

    public boolean c() {
        return this.f102120d;
    }

    public boolean d() {
        return this.f102118b;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof b)) {
            return false;
        }
        b bVar = (b) o10;
        return this.f102117a == bVar.f102117a && this.f102118b == bVar.f102118b && this.f102119c == bVar.f102119c && this.f102120d == bVar.f102120d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r10 = this.f102117a;
        int i10 = r10;
        if (this.f102118b) {
            i10 = r10 + 16;
        }
        int i11 = i10;
        if (this.f102119c) {
            i11 = i10 + 256;
        }
        return this.f102120d ? i11 + 4096 : i11;
    }

    @NonNull
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f102117a), Boolean.valueOf(this.f102118b), Boolean.valueOf(this.f102119c), Boolean.valueOf(this.f102120d));
    }
}
