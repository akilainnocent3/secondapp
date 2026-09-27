package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class e extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f136127e = "COMM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136130d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f136128b = str;
        this.f136129c = str2;
        this.f136130d = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f136129c, eVar.f136129c) && Objects.equals(this.f136128b, eVar.f136128b) && Objects.equals(this.f136130d, eVar.f136130d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f136128b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136129c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f136130d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // t6.i
    public String toString() {
        return this.f136156a + ": language=" + this.f136128b + ", description=" + this.f136129c + ", text=" + this.f136130d;
    }
}
