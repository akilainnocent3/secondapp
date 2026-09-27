package dg;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import eh.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79159d;

    public i(@Nullable String str, long j10, long j11) {
        this.f79158c = str == null ? "" : str;
        this.f79156a = j10;
        this.f79157b = j11;
    }

    @Nullable
    public i a(@Nullable i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f79157b;
            if (j10 != -1) {
                long j11 = this.f79156a;
                if (j11 + j10 == iVar.f79156a) {
                    long j12 = iVar.f79157b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f79157b;
            if (j13 != -1) {
                long j14 = iVar.f79156a;
                if (j14 + j13 == this.f79156a) {
                    iVar2 = new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return i1.f(str, this.f79158c);
    }

    public String c(String str) {
        return i1.e(str, this.f79158c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f79156a == iVar.f79156a && this.f79157b == iVar.f79157b && this.f79158c.equals(iVar.f79158c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f79159d == 0) {
            this.f79159d = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f79156a)) * 31) + ((int) this.f79157b)) * 31) + this.f79158c.hashCode();
        }
        return this.f79159d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f79158c + ", start=" + this.f79156a + ", length=" + this.f79157b + gi.j.f86771d;
    }
}
