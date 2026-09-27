package fk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends o0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84733c;

    public c(String str, @Nullable String str2, @Nullable String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f84731a = str;
        this.f84732b = str2;
        this.f84733c = str3;
    }

    @Override // fk.o0.a
    @NonNull
    public String c() {
        return this.f84731a;
    }

    @Override // fk.o0.a
    @Nullable
    public String d() {
        return this.f84733c;
    }

    @Override // fk.o0.a
    @Nullable
    public String e() {
        return this.f84732b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0.a) {
            o0.a aVar = (o0.a) obj;
            if (this.f84731a.equals(aVar.c()) && ((str = this.f84732b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.f84733c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f84731a.hashCode() ^ 1000003) * 1000003;
        String str = this.f84732b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f84733c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f84731a + ", firebaseInstallationId=" + this.f84732b + ", firebaseAuthenticationToken=" + this.f84733c + "}";
    }
}
