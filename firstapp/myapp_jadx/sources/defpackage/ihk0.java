package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ihk0 extends wgk0 implements x4l.a, x4l.b {
    public static final ofk0 l = phk0.a;
    public final Context a;
    public final Handler b;
    public final ofk0 c;
    public final Set d;
    public final hs7 e;
    public xhk0 f;
    public ngk0 k;

    public ihk0(Context context, ljk0 ljk0Var, hs7 hs7Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.a = context;
        this.b = ljk0Var;
        this.e = hs7Var;
        this.d = hs7Var.b;
        this.c = l;
    }

    @Override // defpackage.lua
    public final void a() {
        this.f.o(this);
    }

    @Override // defpackage.lua
    public final void b(int i) {
        ngk0 ngk0Var = this.k;
        kgk0 kgk0Var = (kgk0) ngk0Var.f.y.get(ngk0Var.b);
        if (kgk0Var != null) {
            if (kgk0Var.m) {
                kgk0Var.q(new ConnectionResult(17));
            } else {
                kgk0Var.b(i);
            }
        }
    }

    @Override // defpackage.yny
    public final void d(ConnectionResult connectionResult) {
        this.k.b(connectionResult);
    }
}
