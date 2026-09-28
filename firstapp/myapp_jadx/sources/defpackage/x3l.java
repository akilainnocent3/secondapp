package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x3l<T extends IInterface> extends r12<T> implements sl0.f {
    public final Account A;
    public final hs7 y;
    public final Set z;

    /* JADX WARN: Illegal instructions before constructor call */
    public x3l(Context context, Looper looper, int i, hs7 hs7Var, x4l.a aVar, x4l.b bVar) {
        wrl0 wrl0VarH = y3l.h(context);
        v4l v4lVar = v4l.d;
        hm20.h(aVar);
        hm20.h(bVar);
        super(context, looper, wrl0VarH, v4lVar, i, new iik0(aVar), new lik0(bVar), hs7Var.f);
        this.y = hs7Var;
        this.A = hs7Var.a;
        Set set = hs7Var.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                ib5.a("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.z = set;
    }

    @Override // sl0.f
    public final Set<Scope> h() {
        return f() ? this.z : Collections.EMPTY_SET;
    }

    @Override // defpackage.r12
    public final Account r() {
        return this.A;
    }

    @Override // defpackage.r12
    public final Set<Scope> u() {
        return this.z;
    }
}
