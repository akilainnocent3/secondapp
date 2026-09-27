package yads;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f153985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153988d;

    public pl2(String str, long j10, long j11) {
        this.f153987c = str == null ? "" : str;
        this.f153985a = j10;
        this.f153986b = j11;
    }

    public final pl2 a(pl2 pl2Var, String str) {
        String strA = oa3.a(str, this.f153987c);
        if (pl2Var == null || !strA.equals(oa3.a(str, pl2Var.f153987c))) {
            return null;
        }
        long j10 = this.f153986b;
        if (j10 != -1) {
            long j11 = this.f153985a;
            if (j11 + j10 == pl2Var.f153985a) {
                long j12 = pl2Var.f153986b;
                return new pl2(strA, j11, j12 != -1 ? j10 + j12 : -1L);
            }
        }
        long j13 = pl2Var.f153986b;
        if (j13 == -1) {
            return null;
        }
        long j14 = pl2Var.f153985a;
        if (j14 + j13 == this.f153985a) {
            return new pl2(strA, j14, j10 != -1 ? j13 + j10 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pl2.class == obj.getClass()) {
            pl2 pl2Var = (pl2) obj;
            if (this.f153985a == pl2Var.f153985a && this.f153986b == pl2Var.f153986b && this.f153987c.equals(pl2Var.f153987c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f153988d == 0) {
            this.f153988d = this.f153987c.hashCode() + ((((((int) this.f153985a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f153986b)) * 31);
        }
        return this.f153988d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f153987c + ", start=" + this.f153985a + ", length=" + this.f153986b + gi.j.f86771d;
    }

    public final Uri a(String str) {
        return Uri.parse(oa3.a(str, this.f153987c));
    }
}
