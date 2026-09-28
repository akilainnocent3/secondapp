package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class whn {
    public final int a;
    public final String b;
    public final List<p610> c;
    public final boolean d;
    public final boolean e;

    public whn(int i, String str, List<p610> list, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whn)) {
            return false;
        }
        whn whnVar = (whn) obj;
        return this.a == whnVar.a && Intrinsics.g(this.b, whnVar.b) && Intrinsics.g(this.c, whnVar.c) && this.d == whnVar.d && this.e == whnVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(ai50.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "Initialized(channelId=", ", cpf=", this.b, ", registeredBankAccounts=");
        sbA.append(this.c);
        sbA.append(", hasCompletedFirstDeposit=");
        sbA.append(this.d);
        sbA.append(", isFtdEligible=");
        return mq0.a(sbA, this.e, ")");
    }
}
