package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class d1l0 implements gs0.a {
    public final /* synthetic */ b3l0 a;

    public d1l0(b3l0 b3l0Var) {
        this.a = b3l0Var;
    }

    @Override // defpackage.rbl0
    public final void a(long j, Bundle bundle, String str, String str2) {
        if (str == null || wuk0.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.a.a.a(3, bundle2);
    }
}
