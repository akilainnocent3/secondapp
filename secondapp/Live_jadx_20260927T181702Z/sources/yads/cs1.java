package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
@yv.g
public final class cs1 implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zv.j[] f147883d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f147885c;

    @oy.l
    public static final as1 Companion = new as1();

    @oy.l
    public static final Parcelable.Creator<cs1> CREATOR = new bs1();

    static {
        dw.c3 c3Var = dw.c3.f79541a;
        f147883d = new zv.j[]{null, new dw.e1(c3Var, aw.a.v(c3Var))};
    }

    public /* synthetic */ cs1(int i10, String str, Map map) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, zr1.f159005a.getDescriptor());
        }
        this.f147884b = str;
        this.f147885c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        return kotlin.jvm.internal.m0.g(this.f147884b, cs1Var.f147884b) && kotlin.jvm.internal.m0.g(this.f147885c, cs1Var.f147885c);
    }

    public final int hashCode() {
        return this.f147885c.hashCode() + (this.f147884b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.f147884b + ", networkData=" + this.f147885c + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f147884b);
        Map map = this.f147885c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public cs1(String str, LinkedHashMap linkedHashMap) {
        this.f147884b = str;
        this.f147885c = linkedHashMap;
    }
}
