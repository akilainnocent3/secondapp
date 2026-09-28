package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gqz implements svh {
    public final l5f0 a;
    public final zpz b;

    @c0d(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {385}, m = "performFling")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return gqz.this.a(null, 0.0f, this);
        }
    }

    public gqz(l5f0 l5f0Var, zpz zpzVar) {
        this.a = l5f0Var;
        this.b = zpzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.svh
    public final Object a(final tp70 tp70Var, float f, v1b<? super Float> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object objB = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        if (i2 == 0) {
            uj50.b(objB);
            Function1 function1 = new Function1() { // from class: fqz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    float fFloatValue = ((Float) obj).floatValue();
                    zpz zpzVar = this.a.b;
                    ((u5a0) zpzVar.s).k(zpzVar.j(zpzVar.k() + ycv.b(zpzVar.p() != 0 ? fFloatValue / zpzVar.p() : 0.0f)));
                    return Unit.a;
                }
            };
            aVar.c = 1;
            objB = this.a.b(tp70Var, f, function1, aVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objB);
        }
        float fFloatValue = ((Number) objB).floatValue();
        zpz zpzVar = this.b;
        if (zpzVar.l() != 0.0f && Math.abs(zpzVar.l()) < 0.001d) {
            int iK = zpzVar.k();
            if (zpzVar.k.c()) {
                ej5.c(((npz) ((x5a0) zpzVar.p).getValue()).s, null, null, new ypz(zpzVar, null), 3);
            }
            zpzVar.w(iK, 0.0f, false);
        } else {
            new Float(zpzVar.l());
        }
        return new Float(fFloatValue);
    }
}
