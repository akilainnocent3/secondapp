package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.onepunch.components.MultiplierComponentKt$CyclicAutoScrollImageColumn$3$1", f = "MultiplierComponent.kt", l = {293, 298}, m = "invokeSuspend", v = 1)
public final class low extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;

    @c0d(c = "com.sportygames.onepunch.components.MultiplierComponentKt$CyclicAutoScrollImageColumn$3$1$1$1", f = "MultiplierComponent.kt", l = {306}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, v1b v1bVar, zzr zzrVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (ts7.b(this.b, this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public low(zzr zzrVar, int i, float f, v1b<? super low> v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
        this.c = i;
        this.d = f;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new low(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((low) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (defpackage.sje0.c(0.0f, 1.0f, 0.0f, r3, r0, r10, 4) == r7) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y5b r7 = defpackage.y5b.a
            int r0 = r10.a
            r1 = 0
            zzr r2 = r10.b
            r3 = 1
            r4 = 2
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r4) goto L13
            defpackage.uj50.b(r11)
            goto L56
        L13:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            r0 = 0
            return r0
        L1a:
            defpackage.uj50.b(r11)
            goto L2e
        L1e:
            defpackage.uj50.b(r11)
            r10.a = r3
            uv60 r0 = defpackage.zzr.x
            int r0 = r10.c
            java.lang.Object r0 = r2.k(r0, r1, r10)
            if (r0 != r7) goto L2e
            goto L55
        L2e:
            r0 = 1000(0x3e8, float:1.401E-42)
            wkf r3 = defpackage.xkf.d
            gzg0 r0 = defpackage.yi0.e(r0, r1, r3, r4)
            l850 r1 = defpackage.l850.a
            r8 = 0
            r3 = 4
            cgn r3 = defpackage.yi0.a(r0, r1, r8, r3)
            kow r0 = new kow
            float r1 = r10.d
            r0.<init>()
            r10.a = r4
            r4 = r0
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r6 = 4
            r5 = r10
            java.lang.Object r0 = defpackage.sje0.c(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L56
        L55:
            return r7
        L56:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.low.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
