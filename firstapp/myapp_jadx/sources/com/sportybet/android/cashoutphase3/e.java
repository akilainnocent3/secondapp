package com.sportybet.android.cashoutphase3;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import com.sportybet.model.cashOut.CashOutData;
import defpackage.mtg0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public final CashOutData a;
    public final boolean b;
    public final a c;
    public final boolean d;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return com.appsflyer.internal.h.a(this.a, "CashOutErrorInfo(bizCode=", ", errorMessage=", this.b, ACKxwYRsuWyGz.ySo);
        }
    }

    public static final class b {
        public static e a() {
            return new e(new CashOutData(0, null, null, null, false, false, null, 127, null), false, new a(10000, ""), true);
        }
    }

    public e(CashOutData cashOutData, boolean z, a aVar, boolean z2) {
        cashOutData.getClass();
        aVar.getClass();
        this.a = cashOutData;
        this.b = z;
        this.c = aVar;
        this.d = z2;
    }

    public static e a(e eVar, CashOutData cashOutData, boolean z, a aVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            cashOutData = eVar.a;
        }
        if ((i & 2) != 0) {
            z = eVar.b;
        }
        if ((i & 4) != 0) {
            aVar = eVar.c;
        }
        if ((i & 8) != 0) {
            z2 = eVar.d;
        }
        eVar.getClass();
        cashOutData.getClass();
        aVar.getClass();
        return new e(cashOutData, z, aVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.g(this.a, eVar.a) && this.b == eVar.b && Intrinsics.g(this.c, eVar.c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "CashOutUIState(cashOutData=" + this.a + ", onError=" + this.b + ", errorInfo=" + this.c + ", onLoading=" + this.d + ")";
    }
}
