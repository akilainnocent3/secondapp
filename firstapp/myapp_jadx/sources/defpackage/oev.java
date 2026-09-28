package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.appsflyer.internal.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oev {
    public final int a;
    public final long b;
    public final int c;
    public final boolean d;
    public final zsp e;

    public oev(int i, long j, int i2, boolean z, zsp zspVar) {
        zspVar.getClass();
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = z;
        this.e = zspVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oev)) {
            return false;
        }
        oev oevVar = (oev) obj;
        return this.a == oevVar.a && this.b == oevVar.b && this.c == oevVar.c && this.d == oevVar.d && Intrinsics.g(this.e, oevVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + mtg0.a(gpp.a(this.c, f87.a(Integer.hashCode(this.a) * 31, this.b, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = a0.a("MeScreenAssetsData(tickets=", ", balance=", this.a, this.b);
        sbA.append(", gifts=");
        sbA.append(this.c);
        sbA.append(", showBalance=");
        sbA.append(this.d);
        sbA.append(QWvyvNzGsBpRT.iHfWHHVsNvuQii);
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
