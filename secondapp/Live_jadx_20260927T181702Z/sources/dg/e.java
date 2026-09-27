package dg;

import androidx.annotation.Nullable;
import eh.o1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f79139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f79140c;

    public e(String str, @Nullable String str2, @Nullable String str3) {
        this.f79138a = str;
        this.f79139b = str2;
        this.f79140c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (o1.g(this.f79138a, eVar.f79138a) && o1.g(this.f79139b, eVar.f79139b) && o1.g(this.f79140c, eVar.f79140c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f79138a.hashCode() * 31;
        String str = this.f79139b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f79140c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
