package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.components.SportyHeroAllBetsComposeUiKt$SportyHeroAllBetsComposeContent$1$1$1", f = "SportyHeroAllBetsComposeUi.kt", l = {365, 370, 375, 381, 383, 388}, m = "invokeSuspend", v = 1)
public final class nqb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ SharedPreferences d;
    public final /* synthetic */ ytw<Boolean> e;
    public final /* synthetic */ twd0<Boolean> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqb0(boolean z, wd0<Float, ij0> wd0Var, SharedPreferences sharedPreferences, ytw<Boolean> ytwVar, twd0<Boolean> twd0Var, v1b<? super nqb0> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = wd0Var;
        this.d = sharedPreferences;
        this.e = ytwVar;
        this.f = twd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(wd0 wd0Var, ytw ytwVar, x1b x1bVar) {
        mqb0 mqb0Var;
        if (x1bVar instanceof mqb0) {
            mqb0Var = (mqb0) x1bVar;
            int i = mqb0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqb0Var.b = i - Integer.MIN_VALUE;
            } else {
                mqb0Var = new mqb0(x1bVar);
            }
        } else {
            mqb0Var = new mqb0(x1bVar);
        }
        Object obj = mqb0Var.a;
        Object obj2 = y5b.a;
        int i2 = mqb0Var.b;
        if (i2 == 0) {
            uj50.b(obj);
            i060 i060Var = lqb0.m;
            ytwVar.setValue(Boolean.TRUE);
            Object f = new Float(0.16f);
            mqb0Var.b = 1;
            if (wd0Var.f(mqb0Var, f) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        gci0.a();
        return Unit.a;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nqb0(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nqb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[PHI: r12
      0x00d0: PHI (r12v1 nqb0) = (r12v0 nqb0), (r12v2 nqb0) binds: [B:40:0x00cd, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r7.f(r14, r15) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (k(r7, r4, r14) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        if (defpackage.wd0.a(r12.c, r8, r9, null, null, r12, 12) == r0) goto L44;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
