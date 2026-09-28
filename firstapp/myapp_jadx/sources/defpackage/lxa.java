package defpackage;

import android.net.NetworkRequest;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lxa {
    public static final lxa j = new lxa();
    public final sox a;
    public final ynx b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set<a> i;

    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(boolean z, Uri uri) {
            uri.getClass();
            this.a = uri;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }
    }

    public lxa(lxa lxaVar) {
        lxaVar.getClass();
        this.c = lxaVar.c;
        this.d = lxaVar.d;
        this.b = lxaVar.b;
        this.a = lxaVar.a;
        this.e = lxaVar.e;
        this.f = lxaVar.f;
        this.i = lxaVar.i;
        this.g = lxaVar.g;
        this.h = lxaVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !lxa.class.equals(obj.getClass())) {
            return false;
        }
        lxa lxaVar = (lxa) obj;
        if (this.c == lxaVar.c && this.d == lxaVar.d && this.e == lxaVar.e && this.f == lxaVar.f && this.g == lxaVar.g && this.h == lxaVar.h && Intrinsics.g(a(), lxaVar.a()) && this.a == lxaVar.a) {
            return Intrinsics.g(this.i, lxaVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public lxa(ynx ynxVar, sox soxVar, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, LinkedHashSet linkedHashSet) {
        this.b = ynxVar;
        this.a = soxVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = linkedHashSet;
    }

    public lxa() {
        t3g t3gVar = t3g.a;
        t3gVar.getClass();
        this.b = new ynx(null);
        this.a = sox.a;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = t3gVar;
    }
}
