package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class nkk0 extends x3l {
    public final GoogleSignInOptions B;

    public nkk0(Context context, Looper looper, hs7 hs7Var, GoogleSignInOptions googleSignInOptions, kgk0 kgk0Var, kgk0 kgk0Var2) {
        GoogleSignInOptions.a aVar;
        super(context, looper, 91, hs7Var, kgk0Var, kgk0Var2);
        Set<Scope> set = hs7Var.c;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
            aVar.a = new HashSet(googleSignInOptions.b);
            aVar.b = googleSignInOptions.e;
            aVar.c = googleSignInOptions.f;
            aVar.d = googleSignInOptions.d;
            aVar.e = googleSignInOptions.i;
            aVar.f = googleSignInOptions.c;
            aVar.g = googleSignInOptions.v;
            aVar.h = GoogleSignInOptions.K0(googleSignInOptions.w);
            aVar.i = googleSignInOptions.y;
        } else {
            aVar = new GoogleSignInOptions.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
        }
        byte[] bArr = new byte[16];
        tjk0.a.nextBytes(bArr);
        aVar.i = Base64.encodeToString(bArr, 11);
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.a;
        if (hashSet2.contains(GoogleSignInOptions.C)) {
            Scope scope2 = GoogleSignInOptions.B;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.A);
        }
        this.B = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f, aVar.d, aVar.b, aVar.c, aVar.e, aVar.g, aVar.h, aVar.i);
    }

    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 12451000;
    }

    @Override // defpackage.r12
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof elk0 ? (elk0) iInterfaceQueryLocalInterface : new elk0(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // defpackage.r12
    public final String w() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
