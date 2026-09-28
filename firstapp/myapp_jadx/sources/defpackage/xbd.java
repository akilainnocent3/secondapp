package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xbd implements kcf {
    public final Function1<Float, Unit> a;
    public final a b = new a();
    public final puw c = new puw();

    public static final class a implements l9f {
        public a() {
        }

        @Override // defpackage.l9f
        public final void a(float f) {
            xbd.this.a.invoke(Float.valueOf(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xbd(Function1<? super Float, Unit> function1) {
        this.a = function1;
    }

    @Override // defpackage.kcf
    public final void a(float f) {
        this.a.invoke(Float.valueOf(f));
    }

    @Override // defpackage.kcf
    public final Object b(icf icfVar, g9f g9fVar) {
        huw huwVar = huw.a;
        Object objD = w5b.d(new wbd(this, icfVar, null), g9fVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
