package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f136174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136175c;

    public o(String str, @Nullable String str2, String str3) {
        super(str);
        this.f136174b = str2;
        this.f136175c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f136156a.equals(oVar.f136156a) && Objects.equals(this.f136174b, oVar.f136174b) && Objects.equals(this.f136175c, oVar.f136175c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f136156a.hashCode()) * 31;
        String str = this.f136174b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136175c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // t6.i
    public String toString() {
        return this.f136156a + ": url=" + this.f136175c;
    }
}
