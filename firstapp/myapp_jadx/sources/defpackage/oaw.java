package defpackage;

import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
public final class oaw {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final EmailChangeConfigResponse d;
    public final o9w e;

    public /* synthetic */ oaw(int i) {
        this("", false, false, new EmailChangeConfigResponse(0, false, false, false, false, 31, null), null);
    }

    public static oaw a(oaw oawVar, String str, boolean z, boolean z2, EmailChangeConfigResponse emailChangeConfigResponse, o9w o9wVar, int i) {
        if ((i & 1) != 0) {
            str = oawVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = oawVar.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = oawVar.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            emailChangeConfigResponse = oawVar.d;
        }
        EmailChangeConfigResponse emailChangeConfigResponse2 = emailChangeConfigResponse;
        if ((i & 16) != 0) {
            o9wVar = oawVar.e;
        }
        oawVar.getClass();
        str2.getClass();
        emailChangeConfigResponse2.getClass();
        return new oaw(str2, z3, z4, emailChangeConfigResponse2, o9wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaw)) {
            return false;
        }
        oaw oawVar = (oaw) obj;
        return Intrinsics.g(this.a, oawVar.a) && this.b == oawVar.b && this.c == oawVar.c && Intrinsics.g(this.d, oawVar.d) && Intrinsics.g(this.e, oawVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        o9w o9wVar = this.e;
        return iHashCode + (o9wVar == null ? 0 : o9wVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = z620.a("MultiFactorAuthState(email=", this.a, ", isTwoFactorAuthEnabled=", ", isEmailBound=", this.b);
        sbA.append(this.c);
        sbA.append(", emailChangeConfig=");
        sbA.append(this.d);
        sbA.append(Chyeyik.YpdIWfNCGrsYe);
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }

    public oaw(String str, boolean z, boolean z2, EmailChangeConfigResponse emailChangeConfigResponse, o9w o9wVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = emailChangeConfigResponse;
        this.e = o9wVar;
    }

    public oaw() {
        this(0);
    }
}
