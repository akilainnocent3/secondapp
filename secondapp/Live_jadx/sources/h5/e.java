package h5;

import androidx.annotation.Nullable;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f87701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f87702c;

    public e(String str, @Nullable String str2, @Nullable String str3) {
        this.f87700a = str;
        this.f87701b = str2;
        this.f87702c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f87700a, eVar.f87700a) && Objects.equals(this.f87701b, eVar.f87701b) && Objects.equals(this.f87702c, eVar.f87702c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f87700a.hashCode() * 31;
        String str = this.f87701b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f87702c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
