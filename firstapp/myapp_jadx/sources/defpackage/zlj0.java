package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zlj0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public zlj0(String str, String str2, String str3, String str4, String str5, boolean z) {
        m.a(str, str4, str5);
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlj0)) {
            return false;
        }
        zlj0 zlj0Var = (zlj0) obj;
        return this.a == zlj0Var.a && Intrinsics.g(this.b, zlj0Var.b) && Intrinsics.g(this.c, zlj0Var.c) && Intrinsics.g(this.d, zlj0Var.d) && Intrinsics.g(this.e, zlj0Var.e) && Intrinsics.g(this.f, zlj0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("WithdrawConfirmationBottomSheetState(isVisible=", ", remainingBalance=", this.b, ", bankLogoUrl=", this.a);
        hxa.c(sbA, this.c, ", bankName=", this.d, ", maskedBankAccountNumber=");
        return kwi.a(sbA, this.e, ", amount=", this.f, ")");
    }

    public /* synthetic */ zlj0(int i) {
        this("", "", "", "", "", false);
    }
}
