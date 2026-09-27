package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class m extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f136168d = "PRIV";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f136170c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f136169b = str;
        this.f136170c = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f136169b, mVar.f136169b) && Arrays.equals(this.f136170c, mVar.f136170c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f136169b;
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f136170c);
    }

    @Override // t6.i
    public String toString() {
        return this.f136156a + ": owner=" + this.f136169b;
    }
}
