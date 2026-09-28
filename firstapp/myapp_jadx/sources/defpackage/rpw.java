package defpackage;

import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.components.MultiplierComponentsKt$MovingCircles$1$1", f = "MultiplierComponents.kt", l = {99, 107, 110}, m = "invokeSuspend", v = 1)
public final class rpw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public float a;
    public int b;
    public int c;
    public final /* synthetic */ ytw<MultiplierResponse> d;
    public final /* synthetic */ wd0<Float, ij0> e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpw(int i, wd0 wd0Var, v1b v1bVar, ytw ytwVar) {
        super(2, v1bVar);
        this.d = ytwVar;
        this.e = wd0Var;
        this.f = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rpw(this.f, this.e, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rpw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r4.f(r11, r13) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r4.g(r13) == r0) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:21:0x0089). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r13.c
            r2 = 3
            r3 = 1
            wd0<java.lang.Float, ij0> r4 = r13.e
            r5 = 2
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L22
            if (r1 == r5) goto L1d
            if (r1 != r2) goto L16
            defpackage.uj50.b(r14)
            goto L95
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            r13 = 0
            return r13
        L1d:
            defpackage.uj50.b(r14)
            r11 = r13
            goto L89
        L22:
            int r1 = r13.b
            float r2 = r13.a
            defpackage.uj50.b(r14)
            r11 = r13
            goto L76
        L2b:
            defpackage.uj50.b(r14)
            ytw<com.sportygames.crash.remote.models.MultiplierResponse> r14 = r13.d
            java.lang.Object r14 = r14.getValue()
            com.sportygames.crash.remote.models.MultiplierResponse r14 = (com.sportygames.crash.remote.models.MultiplierResponse) r14
            java.lang.String r14 = r14.getMessageType()
            java.lang.String r1 = "ROUND_ONGOING"
            boolean r14 = kotlin.jvm.internal.Intrinsics.g(r14, r1)
            if (r14 == 0) goto L8b
        L42:
            java.lang.Object r14 = r4.d()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1 - r14
            int r14 = r13.f
            float r14 = (float) r14
            float r14 = r14 * r2
            int r14 = (int) r14
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r1)
            r1 = 0
            wkf r6 = defpackage.xkf.d
            gzg0 r8 = defpackage.yi0.e(r14, r1, r6, r5)
            r13.a = r2
            r13.b = r14
            r13.c = r3
            wd0<java.lang.Float, ij0> r6 = r13.e
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto L75
            goto L94
        L75:
            r1 = r14
        L76:
            java.lang.Float r13 = new java.lang.Float
            r14 = 0
            r13.<init>(r14)
            r11.a = r2
            r11.b = r1
            r11.c = r5
            java.lang.Object r13 = r4.f(r11, r13)
            if (r13 != r0) goto L89
            goto L94
        L89:
            r13 = r11
            goto L42
        L8b:
            r11 = r13
            r11.c = r2
            java.lang.Object r13 = r4.g(r11)
            if (r13 != r0) goto L95
        L94:
            return r0
        L95:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
