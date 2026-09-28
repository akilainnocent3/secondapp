package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class bmj {
    public final Long a;
    public final String b;
    public final boolean c;
    public final bnj d;
    public final double e;
    public final String f;
    public final hu00 g;
    public final List<if80> h;

    public bmj(Long l, String str, boolean z, bnj bnjVar, double d, String str2, hu00 hu00Var, List<if80> list) {
        bnjVar.getClass();
        hu00Var.getClass();
        list.getClass();
        this.a = l;
        this.b = str;
        this.c = z;
        this.d = bnjVar;
        this.e = d;
        this.f = str2;
        this.g = hu00Var;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmj)) {
            return false;
        }
        bmj bmjVar = (bmj) obj;
        return Intrinsics.g(this.a, bmjVar.a) && this.b.equals(bmjVar.b) && this.c == bmjVar.c && Intrinsics.g(this.d, bmjVar.d) && Double.compare(this.e, bmjVar.e) == 0 && this.f.equals(bmjVar.f) && this.g == bmjVar.g && Intrinsics.g(this.h, bmjVar.h);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.h.hashCode() + ((this.g.hashCode() + gmf0.a(nrg0.a((this.d.hashCode() + mtg0.a(gmf0.a((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameOverData(nextRoundRoomConfigId=");
        sb.append(this.a);
        sb.append(", nextRoundRoomName=");
        sb.append(this.b);
        sb.append(", prizeWon=");
        sb.append(this.c);
        sb.append(", gameResult=");
        sb.append(this.d);
        sb.append(", feeForNextRound=");
        sb.append(this.e);
        sb.append(", currency=");
        sb.append(this.f);
        sb.append(", pigType=");
        sb.append(this.g);
        sb.append(", sessionCards=");
        return o8i.a(sb, this.h, ')');
    }
}
