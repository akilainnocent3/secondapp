package com.sportybet.feature.kyc.confirmAccountInfo;

import com.sporty.android.core.model.pay.security.NameUpdateStatus;
import defpackage.fsa;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.uxs;
import defpackage.y45;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public final h a;
    public final uxs b;
    public final boolean c;
    public final boolean d;
    public final NameUpdateStatus e;
    public final fsa f;

    public /* synthetic */ e(int i) {
        this(h.b.a, uxs.DISABLE, false, false, new NameUpdateStatus.Unknown(0), new fsa(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.g(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && Intrinsics.g(this.e, eVar.e) && Intrinsics.g(this.f, eVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + mtg0.a(mtg0.a(y45.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmAccountInfoUiState(userCertInfoUiState=");
        sb.append(this.a);
        sb.append(", buttonStatus=");
        sb.append(this.b);
        sb.append(", isNameFieldEditable=");
        nng.a(", showNotMyName=", ", nameUpdateStatus=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", confirmState=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public e(h hVar, uxs uxsVar, boolean z, boolean z2, NameUpdateStatus nameUpdateStatus, fsa fsaVar) {
        hVar.getClass();
        uxsVar.getClass();
        nameUpdateStatus.getClass();
        this.a = hVar;
        this.b = uxsVar;
        this.c = z;
        this.d = z2;
        this.e = nameUpdateStatus;
        this.f = fsaVar;
    }

    public e() {
        this(0);
    }
}
