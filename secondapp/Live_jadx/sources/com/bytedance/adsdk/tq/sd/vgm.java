package com.bytedance.adsdk.tq.sd;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vgm<T> {
    T hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    T f32312tq;

    private static boolean tq(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return tq(pair.first, this.hww) && tq(pair.second, this.f32312tq);
    }

    public int hashCode() {
        T t10 = this.hww;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f32312tq;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public void hww(T t10, T t11) {
        this.hww = t10;
        this.f32312tq = t11;
    }

    public String toString() {
        return "Pair{" + this.hww + " " + this.f32312tq + "}";
    }
}
