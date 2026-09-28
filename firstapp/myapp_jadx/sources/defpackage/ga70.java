package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ga70 {
    public final String a;
    public final String b;
    public final String c;
    public final List<fa70> d;
    public final List<ea70> e;
    public final List<vk70> f;
    public final List<wk70> g;
    public final boolean h;

    public ga70(String str, String str2, String str3, List<fa70> list, List<ea70> list2, List<vk70> list3, List<wk70> list4, boolean z) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga70)) {
            return false;
        }
        ga70 ga70Var = (ga70) obj;
        return this.a.equals(ga70Var.a) && this.b.equals(ga70Var.b) && this.c.equals(ga70Var.c) && Intrinsics.g(this.d, ga70Var.d) && Intrinsics.g(this.e, ga70Var.e) && Intrinsics.g(this.f, ga70Var.f) && Intrinsics.g(this.g, ga70Var.g) && this.h == ga70Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ai50.a(ai50.a(ai50.a(ai50.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballOpenBets(countryCode=", this.a, ", userId=", this.b, ", sportId=");
        kya0.b(this.c, ", tickets=", ", events=", sbA, this.d);
        qpu.a(", markets=", ", outcomes=", sbA, this.e, this.f);
        sbA.append(this.g);
        sbA.append(", reachQueryLimit=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
