package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dkm {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final float d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;

    public dkm(boolean z, boolean z2, String str, float f, boolean z3, int i, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        str = (i2 & 4) != 0 ? null : str;
        f = (i2 & 8) != 0 ? 20.0f : f;
        z3 = (i2 & 16) != 0 ? false : z3;
        i = (i2 & 32) != 0 ? R.string.page_horse_racing__horse_racing : i;
        int i3 = (i2 & 64) != 0 ? R.drawable.ic_close_white_24dp : R.drawable.arrow_back;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = f;
        this.e = z3;
        this.f = i;
        this.g = i3;
        this.h = R.drawable.ic__horseracing__bet_history;
        this.i = R.drawable.ic_home;
        this.j = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkm)) {
            return false;
        }
        dkm dkmVar = (dkm) obj;
        return this.a == dkmVar.a && this.b == dkmVar.b && Intrinsics.g(this.c, dkmVar.c) && Float.compare(this.d, dkmVar.d) == 0 && this.e == dkmVar.e && this.f == dkmVar.f && this.g == dkmVar.g && this.h == dkmVar.h && this.i == dkmVar.i && Intrinsics.g(this.j, dkmVar.j);
    }

    public final int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iA2 = gpp.a(this.i, gpp.a(this.h, gpp.a(this.g, gpp.a(this.f, mtg0.a(tvh.a(this.d, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31), 31), 31), 31);
        String str2 = this.j;
        return iA2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("HorseRacingUiState(isLoading=", ", isBetHistoryPage=", ", userBalance=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", toolbarTitleTextSize=");
        sbA.append(this.d);
        sbA.append(", isToolbarBetHistoryButtonVisible=");
        sbA.append(this.e);
        sbA.append(", toolbarTitle=");
        sbA.append(this.f);
        sbA.append(", toolbarLeftButtonResource=");
        d5d.a(sbA, this.g, tYcQsJyaojE.aADbbKgBQ, this.h, ", toolbarSecondRightButtonResource=");
        sbA.append(this.i);
        sbA.append(", error=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }

    public dkm() {
        this(false, false, null, 0.0f, false, 0, 1023);
    }
}
