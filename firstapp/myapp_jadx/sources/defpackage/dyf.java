package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dyf {
    public final uf00<UiText> a;
    public final SportyPinStatus b;

    /* JADX WARN: Multi-variable type inference failed */
    public dyf(uf00<? extends UiText> uf00Var, SportyPinStatus sportyPinStatus) {
        uf00Var.getClass();
        sportyPinStatus.getClass();
        this.a = uf00Var;
        this.b = sportyPinStatus;
    }

    public static dyf a(dyf dyfVar, uf00 uf00Var, SportyPinStatus sportyPinStatus, int i) {
        if ((i & 1) != 0) {
            uf00Var = dyfVar.a;
        }
        if ((i & 2) != 0) {
            sportyPinStatus = dyfVar.b;
        }
        dyfVar.getClass();
        uf00Var.getClass();
        sportyPinStatus.getClass();
        return new dyf(uf00Var, sportyPinStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyf)) {
            return false;
        }
        dyf dyfVar = (dyf) obj;
        return Intrinsics.g(this.a, dyfVar.a) && this.b == dyfVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EmailChangeNoticeScreenState(screenContent=" + this.a + ", sportyPinStatus=" + this.b + ")";
    }

    public dyf(int i) {
        this(n1a0.c, SportyPinStatus.Disabled);
    }

    public dyf() {
        this(0);
    }
}
