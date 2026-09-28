package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j130 {
    public final AccountInfo a;
    public final PrimaryPhoneConfig b;
    public final EmailChangeConfigResponse c;
    public final boolean d;
    public final gwe e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final jz20 i;

    public static j130 a(j130 j130Var, AccountInfo accountInfo, PrimaryPhoneConfig primaryPhoneConfig, EmailChangeConfigResponse emailChangeConfigResponse, boolean z, gwe gweVar, boolean z2, boolean z3, boolean z4, jz20 jz20Var, int i) {
        if ((i & 1) != 0) {
            accountInfo = j130Var.a;
        }
        AccountInfo accountInfo2 = accountInfo;
        if ((i & 2) != 0) {
            primaryPhoneConfig = j130Var.b;
        }
        PrimaryPhoneConfig primaryPhoneConfig2 = primaryPhoneConfig;
        if ((i & 4) != 0) {
            emailChangeConfigResponse = j130Var.c;
        }
        EmailChangeConfigResponse emailChangeConfigResponse2 = emailChangeConfigResponse;
        if ((i & 8) != 0) {
            z = j130Var.d;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            gweVar = j130Var.e;
        }
        gwe gweVar2 = gweVar;
        boolean z6 = (i & 32) != 0 ? j130Var.f : z2;
        boolean z7 = (i & 64) != 0 ? j130Var.g : z3;
        boolean z8 = (i & 128) != 0 ? j130Var.h : z4;
        jz20 jz20Var2 = (i & 256) != 0 ? j130Var.i : jz20Var;
        j130Var.getClass();
        accountInfo2.getClass();
        primaryPhoneConfig2.getClass();
        emailChangeConfigResponse2.getClass();
        gweVar2.getClass();
        return new j130(accountInfo2, primaryPhoneConfig2, emailChangeConfigResponse2, z5, gweVar2, z6, z7, z8, jz20Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j130)) {
            return false;
        }
        j130 j130Var = (j130) obj;
        return Intrinsics.g(this.a, j130Var.a) && Intrinsics.g(this.b, j130Var.b) && Intrinsics.g(this.c, j130Var.c) && this.d == j130Var.d && Intrinsics.g(this.e, j130Var.e) && this.f == j130Var.f && this.g == j130Var.g && this.h == j130Var.h && Intrinsics.g(this.i, j130Var.i);
    }

    public final int hashCode() {
        int iA = mtg0.a(mtg0.a(mtg0.a((this.e.hashCode() + mtg0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h);
        jz20 jz20Var = this.i;
        return iA + (jz20Var == null ? 0 : jz20Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileScreenState(accountInfo=");
        sb.append(this.a);
        sb.append(", primaryPhoneConfig=");
        sb.append(this.b);
        sb.append(", emailChangeConfig=");
        sb.append(this.c);
        sb.append(", showNINSection=");
        sb.append(this.d);
        sb.append(", dobSectionUiState=");
        sb.append(this.e);
        sb.append(", isEmailBound=");
        sb.append(this.f);
        sb.append(", isLoading=");
        nng.a(", isError=", ", currentDialog=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ j130(int i) {
        this(new AccountInfo(null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, 0, 0, null, false, false, 0L, null, false, false, 0L, -1, 127, null), new PrimaryPhoneConfig(false, false, false, 0, false, 0, false, 0, null, 0, 1023, null), new EmailChangeConfigResponse(0, false, false, false, false, 31, null), false, new gwe(dLRYz.LeVyMIjXhwELx, false, eye.a, false), false, false, false, null);
    }

    public j130(AccountInfo accountInfo, PrimaryPhoneConfig primaryPhoneConfig, EmailChangeConfigResponse emailChangeConfigResponse, boolean z, gwe gweVar, boolean z2, boolean z3, boolean z4, jz20 jz20Var) {
        this.a = accountInfo;
        this.b = primaryPhoneConfig;
        this.c = emailChangeConfigResponse;
        this.d = z;
        this.e = gweVar;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = jz20Var;
    }

    public j130() {
        this(0);
    }
}
