package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class d3l0 extends kmk0 {
    public final /* synthetic */ r12 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3l0(r12 r12Var, int i, Bundle bundle) {
        super(r12Var, i, bundle);
        this.g = r12Var;
    }

    @Override // defpackage.kmk0
    public final void c(ConnectionResult connectionResult) {
        this.g.j.a(connectionResult);
        System.currentTimeMillis();
    }

    @Override // defpackage.kmk0
    public final boolean d() {
        this.g.j.a(ConnectionResult.e);
        return true;
    }
}
