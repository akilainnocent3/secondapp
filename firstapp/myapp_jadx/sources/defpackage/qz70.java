package defpackage;

import com.appsflyer.internal.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qz70 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public qz70(String str, String str2, String str3, ArrayList arrayList) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz70)) {
            return false;
        }
        qz70 qz70Var = (qz70) obj;
        return Intrinsics.g(this.a, qz70Var.a) && Intrinsics.g(this.b, qz70Var.b) && Intrinsics.g(this.c, qz70Var.c) && this.d.equals(qz70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SearchTeam(teamId=", this.a, ", teamName=", this.b, ", teamIcon=");
        sbA.append(this.c);
        sbA.append(", tournaments=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
