package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uz6 {
    public final String a;
    public final UiText b;
    public final uf00<a27> c;
    public final UiText d;
    public final uf00<r27> e;

    public uz6(String str, UiText uiText, uf00<a27> uf00Var, UiText uiText2, uf00<r27> uf00Var2) {
        str.getClass();
        uiText.getClass();
        uf00Var.getClass();
        uf00Var2.getClass();
        this.a = str;
        this.b = uiText;
        this.c = uf00Var;
        this.d = uiText2;
        this.e = uf00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz6)) {
            return false;
        }
        uz6 uz6Var = (uz6) obj;
        return Intrinsics.g(this.a, uz6Var.a) && Intrinsics.g(this.b, uz6Var.b) && Intrinsics.g(this.c, uz6Var.c) && this.d.equals(uz6Var.d) && Intrinsics.g(this.e, uz6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + yvf.a(yvz.a(this.c, yvf.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "ChallengeDetailUiModel(challengeDescription=", this.a, ", challengeNote=", ", prizes=");
        sbA.append(this.c);
        sbA.append(", period=");
        sbA.append(this.d);
        sbA.append(", rules=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
