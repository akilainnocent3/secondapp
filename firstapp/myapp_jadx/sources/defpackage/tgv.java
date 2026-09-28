package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$bindToLoyaltyState$1", f = "MeViewModel.kt", l = {439, 441}, m = "invokeSuspend", v = 2)
public final class tgv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;

    public static final class a<T> implements myh {
        public final /* synthetic */ rhv a;

        public a(rhv rhvVar) {
            this.a = rhvVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            rhv rhvVar;
            hfv hfvVar = (hfv) obj;
            rhv rhvVar2 = this.a;
            wwd0 wwd0Var = rhvVar2.O;
            while (true) {
                Object value = wwd0Var.getValue();
                wwd0 wwd0Var2 = wwd0Var;
                rhvVar = rhvVar2;
                if (wwd0Var2.g(value, cgv.a((cgv) value, false, null, null, null, null, hfvVar, 0, 0, null, null, null, false, false, null, 131007))) {
                    break;
                }
                wwd0Var = wwd0Var2;
                rhvVar2 = rhvVar;
            }
            if (!rhvVar.T && hfvVar.a) {
                rhvVar.T = true;
                rhvVar.B.a(new lgv(hfvVar.d, hfvVar.e), k00.d);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgv(rhv rhvVar, v1b<? super tgv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tgv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tgv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e7, code lost:
    
        if (r2.collect(r3, r18) == r1) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
