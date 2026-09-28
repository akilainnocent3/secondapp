package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerKt$ComposeBetContainer$7$1", f = "ComposeBetContainer.kt", l = {371, 376, 381, 387, 389, 393}, m = "invokeSuspend", v = 1)
public final class j6a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ SharedPreferences d;
    public final /* synthetic */ ytw<Boolean> e;
    public final /* synthetic */ twd0<Boolean> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6a(boolean z, wd0<Float, ij0> wd0Var, SharedPreferences sharedPreferences, ytw<Boolean> ytwVar, twd0<Boolean> twd0Var, v1b<? super j6a> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = wd0Var;
        this.d = sharedPreferences;
        this.e = ytwVar;
        this.f = twd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(wd0 wd0Var, ytw ytwVar, x1b x1bVar) {
        i6a i6aVar;
        if (x1bVar instanceof i6a) {
            i6aVar = (i6a) x1bVar;
            int i = i6aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                i6aVar.b = i - Integer.MIN_VALUE;
            } else {
                i6aVar = new i6a(x1bVar);
            }
        } else {
            i6aVar = new i6a(x1bVar);
        }
        Object obj = i6aVar.a;
        Object obj2 = y5b.a;
        int i2 = i6aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            ytwVar.setValue(Boolean.TRUE);
            Object f = new Float(0.16f);
            i6aVar.b = 1;
            if (wd0Var.f(i6aVar, f) == obj2) {
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
        return new j6a(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j6a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8 A[PHI: r12
      0x00c8: PHI (r12v1 j6a) = (r12v0 j6a), (r12v2 j6a) binds: [B:40:0x00c5, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r7.f(r14, r15) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (k(r7, r4, r14) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (defpackage.wd0.a(r12.c, r8, r9, null, null, r12, 12) == r0) goto L44;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
