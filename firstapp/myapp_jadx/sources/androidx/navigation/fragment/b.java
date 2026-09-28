package androidx.navigation.fragment;

import defpackage.dq7;
import defpackage.tgp;
import defpackage.ygx;
import defpackage.zgx;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zgx<a.b> {
    public dq7 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, dq7 dq7Var) {
        super(aVar, -1, str);
        str.getClass();
        this.i = dq7Var;
    }

    @Override // defpackage.zgx
    public final ygx a() {
        a.b bVar = (a.b) super.a();
        bVar.i = tgp.b(this.i).getName();
        return bVar;
    }
}
