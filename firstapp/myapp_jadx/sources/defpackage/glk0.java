package defpackage;

import android.os.Binder;
import com.google.android.gms.auth.api.signin.RevocationBoundService;

/* JADX INFO: loaded from: classes4.dex */
public final class glk0 extends alk0 {
    public final RevocationBoundService a;

    public glk0(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = revocationBoundService;
    }

    public final void b() {
        if (adh0.a(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
