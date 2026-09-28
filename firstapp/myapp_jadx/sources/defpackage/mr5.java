package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mr5 implements mmd {
    public aj5 a = t1g.a;
    public scf b;

    public static final class a extends qlr implements Function1<lza, Unit> {
        public final /* synthetic */ Function1<tcf, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super tcf, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lza lzaVar) {
            lza lzaVar2 = lzaVar;
            this.a.invoke(lzaVar2);
            lzaVar2.b2();
            return Unit.a;
        }
    }

    public final scf e(Function1<? super tcf, Unit> function1) {
        return g(new a(function1));
    }

    public final scf g(Function1<? super lza, Unit> function1) {
        scf scfVar = new scf();
        scfVar.a = function1;
        this.b = scfVar;
        return scfVar;
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.a.getDensity().y1();
    }
}
