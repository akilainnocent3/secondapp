package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
import u4.i1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class a extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f136108f = "APIC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f136110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f136112e;

    public a(String str, @Nullable String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f136109b = str;
        this.f136110c = str2;
        this.f136111d = i10;
        this.f136112e = bArr;
    }

    @Override // t6.i, u4.k1.a
    public void a(i1.b bVar) {
        bVar.M(this.f136112e, this.f136111d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f136111d == aVar.f136111d && Objects.equals(this.f136109b, aVar.f136109b) && Objects.equals(this.f136110c, aVar.f136110c) && Arrays.equals(this.f136112e, aVar.f136112e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f136111d) * 31;
        String str = this.f136109b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136110c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f136112e);
    }

    @Override // t6.i
    public String toString() {
        return this.f136156a + ": mimeType=" + this.f136109b + ", description=" + this.f136110c;
    }
}
