package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class f extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f136131f = "GEOB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f136135e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f136132b = str;
        this.f136133c = str2;
        this.f136134d = str3;
        this.f136135e = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f136132b, fVar.f136132b) && Objects.equals(this.f136133c, fVar.f136133c) && Objects.equals(this.f136134d, fVar.f136134d) && Arrays.equals(this.f136135e, fVar.f136135e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f136132b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136133c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f136134d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f136135e);
    }

    @Override // t6.i
    public String toString() {
        return this.f136156a + ": mimeType=" + this.f136132b + ", filename=" + this.f136133c + ", description=" + this.f136134d;
    }
}
