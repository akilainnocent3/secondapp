package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class wa5<T> extends xwa<T> {
    public final va5 f;

    public wa5(Context context, vvj0 vvj0Var) {
        super(context, vvj0Var);
        this.f = new va5(this);
    }

    @Override // defpackage.xwa
    public final void c() {
        jgt.e().a(xa5.a, getClass().getSimpleName().concat(": registering receiver"));
        this.b.registerReceiver(this.f, e());
    }

    @Override // defpackage.xwa
    public final void d() {
        jgt.e().a(xa5.a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.b.unregisterReceiver(this.f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
