package h5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import x4.m1;
import x4.n1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f87718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f87719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f87721d;

    public i(@Nullable String str, long j10, long j11) {
        this.f87720c = str == null ? "" : str;
        this.f87718a = j10;
        this.f87719b = j11;
    }

    @Nullable
    public i a(@Nullable i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f87719b;
            if (j10 != -1) {
                long j11 = this.f87718a;
                if (j11 + j10 == iVar.f87718a) {
                    long j12 = iVar.f87719b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f87719b;
            if (j13 != -1) {
                long j14 = iVar.f87718a;
                if (j14 + j13 == this.f87718a) {
                    iVar2 = new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return n1.g(str, this.f87720c);
    }

    public String c(String str) {
        return n1.f(str, this.f87720c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f87718a == iVar.f87718a && this.f87719b == iVar.f87719b && this.f87720c.equals(iVar.f87720c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f87721d == 0) {
            this.f87721d = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f87718a)) * 31) + ((int) this.f87719b)) * 31) + this.f87720c.hashCode();
        }
        return this.f87721d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f87720c + ", start=" + this.f87718a + ", length=" + this.f87719b + gi.j.f86771d;
    }
}
