package defpackage;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vvd {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final uxs e;

    public vvd(int i, String str, String str2, boolean z, boolean z2) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        str = (i & 4) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        uxs uxsVar = uxs.ENABLE;
        str.getClass();
        str2.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = uxsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvd)) {
            return false;
        }
        vvd vvdVar = (vvd) obj;
        return this.a == vvdVar.a && this.b == vvdVar.b && Intrinsics.g(this.c, vvdVar.c) && Intrinsics.g(this.d, vvdVar.d) && this.e == vvdVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("DepositConfirmationBottomSheetState(isVisible=", ", isFacialRecognitionLabelVisible=", ", maskedCpf=", this.a, this.b);
        hxa.c(sbA, this.c, iKBWavCysVP.KWtpa, this.d, ", confirmButtonStatus=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
