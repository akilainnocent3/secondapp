package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.common_ui.uitext.ColoredUiText;

/* JADX INFO: loaded from: classes2.dex */
public final class zmc0 {
    public final int a;
    public final ColoredUiText b;

    public zmc0(int i, ColoredUiText coloredUiText) {
        this.a = i;
        this.b = coloredUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmc0)) {
            return false;
        }
        zmc0 zmc0Var = (zmc0) obj;
        return this.a == zmc0Var.a && this.b.equals(zmc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SportyLegendsStatsRecordResultState(backgroundColorResId=" + this.a + ", resultUiText=" + this.b + xOgHBQVl.wILfAAEcJwzqErg;
    }
}
