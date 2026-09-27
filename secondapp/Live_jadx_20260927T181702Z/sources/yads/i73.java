package yads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i73 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i73 f150458e = new i73(new h73[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wq f150459f = new wq() { // from class: yads.a24
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return i73.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sm2 f150461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f150462d;

    public i73(h73... h73VarArr) {
        this.f150461c = p51.b(h73VarArr);
        this.f150460b = h73VarArr.length;
        a();
    }

    public final h73 a(int i10) {
        return (h73) this.f150461c.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i73.class == obj.getClass()) {
            i73 i73Var = (i73) obj;
            if (this.f150460b == i73Var.f150460b && this.f150461c.equals(i73Var.f150461c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f150462d == 0) {
            this.f150462d = this.f150461c.hashCode();
        }
        return this.f150462d;
    }

    public static i73 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return parcelableArrayList == null ? new i73(new h73[0]) : new i73((h73[]) yq.a(h73.f149960g, parcelableArrayList).toArray(new h73[0]));
    }

    public final void a() {
        int i10 = 0;
        while (i10 < this.f150461c.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f150461c.size(); i12++) {
                if (((h73) this.f150461c.get(i10)).equals(this.f150461c.get(i12))) {
                    ih1.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }
}
