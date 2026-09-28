package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z5a0<T> extends znz<T> {
    public final znz<T> y;

    public z5a0(znz<T> znzVar) {
        super(znzVar.e(), znzVar.b, znzVar.c, new hoz(znzVar.d), znzVar.e);
        this.y = znzVar;
    }

    @Override // defpackage.znz
    public final void c(Function2<? super kxs, ? super hxs, Unit> function2) {
        function2.getClass();
    }

    @Override // defpackage.znz
    public final Object d() {
        return this.y.d();
    }

    @Override // defpackage.znz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.znz
    public final boolean h() {
        return true;
    }

    @Override // defpackage.znz
    public final void j(int i) {
    }
}
