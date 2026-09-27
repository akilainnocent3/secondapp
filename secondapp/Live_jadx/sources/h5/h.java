package h5;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f87713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f87714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f87715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f87716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f87717e;

    public h(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f87713a = str;
        this.f87714b = str2;
        this.f87715c = str3;
        this.f87716d = str4;
        this.f87717e = str5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f87713a, hVar.f87713a) && Objects.equals(this.f87714b, hVar.f87714b) && Objects.equals(this.f87715c, hVar.f87715c) && Objects.equals(this.f87716d, hVar.f87716d) && Objects.equals(this.f87717e, hVar.f87717e);
    }

    public int hashCode() {
        String str = this.f87713a;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f87714b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f87715c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f87716d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f87717e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
