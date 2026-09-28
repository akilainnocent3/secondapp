package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eie {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final aie h;
    public final Integer i;
    public final List<obe> j;

    /* JADX WARN: Multi-variable type inference failed */
    public eie(String str, String str2, String str3, String str4, int i, String str5, String str6, aie aieVar, Integer num, List<? extends obe> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = aieVar;
        this.i = num;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eie)) {
            return false;
        }
        eie eieVar = (eie) obj;
        return Intrinsics.g(this.a, eieVar.a) && Intrinsics.g(this.b, eieVar.b) && Intrinsics.g(this.c, eieVar.c) && Intrinsics.g(this.d, eieVar.d) && this.e == eieVar.e && Intrinsics.g(this.f, eieVar.f) && Intrinsics.g(this.g, eieVar.g) && this.h == eieVar.h && Intrinsics.g(this.i, eieVar.i) && Intrinsics.g(this.j, eieVar.j);
    }

    public final int hashCode() {
        int iA = gpp.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        String str = this.f;
        int iHashCode = (this.h.hashCode() + gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.g)) * 31;
        Integer num = this.i;
        return this.j.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("DeviceUiModel(deviceId=", this.a, ", name=", this.b, ", ipAddress=");
        hxa.c(sbA, this.c, ", platform=", this.d, ", deviceTypeIcon=");
        f78.b(this.e, ", location=", this.f, ", lastActiveTime=", sbA);
        sbA.append(this.g);
        sbA.append(", deviceStatus=");
        sbA.append(this.h);
        sbA.append(", numberOfDaysInactive=");
        sbA.append(this.i);
        sbA.append(", availableActions=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
