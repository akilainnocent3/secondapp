package defpackage;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mnu {
    public final boolean a;
    public final qcn<gdc> b;
    public final String c;

    public mnu(qcn qcnVar, String str, boolean z) {
        qcnVar.getClass();
        str.getClass();
        this.a = z;
        this.b = qcnVar;
        this.c = str;
    }

    public static mnu a(mnu mnuVar, boolean z) {
        qcn<gdc> qcnVar = mnuVar.b;
        String str = mnuVar.c;
        mnuVar.getClass();
        qcnVar.getClass();
        str.getClass();
        return new mnu(qcnVar, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnu)) {
            return false;
        }
        mnu mnuVar = (mnu) obj;
        return this.a == mnuVar.a && Intrinsics.g(this.b, mnuVar.b) && Intrinsics.g(this.c, mnuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shu.a(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManageCustomCodeUIState(isLoading=");
        sb.append(this.a);
        sb.append(", codes=");
        sb.append(this.b);
        sb.append(jbkEboCkTqmGf.eOWmMxYVMEWJY);
        return uf80.a(sb, this.c, ")");
    }

    public mnu() {
        this(0);
    }

    public mnu(int i) {
        this(n1a0.c, "", true);
    }
}
