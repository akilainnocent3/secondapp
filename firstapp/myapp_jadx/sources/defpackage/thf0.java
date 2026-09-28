package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class thf0 implements fr70 {
    public final /* synthetic */ fr70 a;
    public final mae b;
    public final mae c;

    public thf0(fr70 fr70Var, yhf0 yhf0Var) {
        this.a = fr70Var;
        this.b = a6a0.b(new ajb(yhf0Var, 1));
        this.c = a6a0.b(new nh70(yhf0Var, 1));
    }

    @Override // defpackage.fr70
    public final float a(float f) {
        return this.a.a(f);
    }

    @Override // defpackage.fr70
    public final Object b(huw huwVar, Function2<? super tp70, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super Unit> v1bVar) {
        return this.a.b(huwVar, function2, v1bVar);
    }

    @Override // defpackage.fr70
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.fr70
    public final boolean d() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.fr70
    public final boolean e() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
