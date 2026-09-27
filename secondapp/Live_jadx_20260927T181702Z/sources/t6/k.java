package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class k extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f136158e = "----";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136161d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f136159b = str;
        this.f136160c = str2;
        this.f136161d = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f136160c, kVar.f136160c) && Objects.equals(this.f136159b, kVar.f136159b) && Objects.equals(this.f136161d, kVar.f136161d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f136159b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136160c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f136161d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // t6.i
    public String toString() {
        return this.f136156a + ": domain=" + this.f136159b + ", description=" + this.f136160c;
    }
}
