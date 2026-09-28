package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1725, 1727, 1734, 1735, 1745}, m = "invokeSuspend")
public final class j2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public boolean a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ip20 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ psw f;
    public final /* synthetic */ g2 i;

    @c0d(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1719, 1722}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public mp20.b a;
        public int b;
        public final /* synthetic */ g2 c;
        public final /* synthetic */ long d;
        public final /* synthetic */ psw e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2 g2Var, long j, psw pswVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = g2Var;
            this.d = j;
            this.e = pswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mp20.b bVar;
            y5b y5bVar = y5b.a;
            int i = this.b;
            g2 g2Var = this.c;
            if (i == 0) {
                uj50.b(obj);
                if (g2Var.u2()) {
                    long j = zr7.a;
                    this.b = 1;
                    if (hkd.b(j, this) != y5bVar) {
                    }
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = this.a;
                uj50.b(obj);
            }
            g2Var.Q = bVar;
            return Unit.a;
            mp20.b bVar2 = new mp20.b(this.d);
            this.a = bVar2;
            this.b = 2;
            if (this.e.a(bVar2, this) != y5bVar) {
                bVar = bVar2;
                g2Var.Q = bVar;
                return Unit.a;
            }
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(ip20 ip20Var, long j, psw pswVar, g2 g2Var, v1b<? super j2> v1bVar) {
        super(2, v1bVar);
        this.d = ip20Var;
        this.e = j;
        this.f = pswVar;
        this.i = g2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j2 j2Var = new j2(this.d, this.e, this.f, this.i, v1bVar);
        j2Var.c = obj;
        return j2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r14.a(r2, r16) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r14.a(r3, r16) == r1) goto L40;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            y5b r1 = defpackage.y5b.a
            int r2 = r0.b
            g2 r4 = r0.i
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            psw r14 = r0.f
            r15 = 0
            if (r2 == 0) goto L40
            if (r2 == r13) goto L36
            if (r2 == r12) goto L30
            if (r2 == r11) goto L28
            if (r2 == r10) goto L23
            if (r2 != r9) goto L1d
            goto L23
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r15
        L23:
            defpackage.uj50.b(r17)
            goto Lbd
        L28:
            java.lang.Object r2 = r0.c
            mp20$c r2 = (mp20.c) r2
            defpackage.uj50.b(r17)
            goto L96
        L30:
            boolean r2 = r0.a
            defpackage.uj50.b(r17)
            goto L7c
        L36:
            java.lang.Object r2 = r0.c
            c9p r2 = (defpackage.c9p) r2
            defpackage.uj50.b(r17)
            r3 = r17
            goto L62
        L40:
            defpackage.uj50.b(r17)
            java.lang.Object r2 = r0.c
            v5b r2 = (defpackage.v5b) r2
            j2$a r3 = new j2$a
            psw r7 = r0.f
            r8 = 0
            long r5 = r0.e
            r3.<init>(r4, r5, r7, r8)
            jvd0 r2 = defpackage.ej5.c(r2, r15, r15, r3, r11)
            r0.c = r2
            r0.b = r13
            ip20 r3 = r0.d
            java.lang.Object r3 = r3.Y(r0)
            if (r3 != r1) goto L62
            goto Lbc
        L62:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r5 = r2.isActive()
            if (r5 == 0) goto La1
            r0.c = r15
            r0.a = r3
            r0.b = r12
            java.lang.Object r2 = defpackage.i9p.c(r2, r0)
            if (r2 != r1) goto L7b
            goto Lbc
        L7b:
            r2 = r3
        L7c:
            if (r2 == 0) goto Lbd
            mp20$b r2 = new mp20$b
            long r5 = r0.e
            r2.<init>(r5)
            mp20$c r3 = new mp20$c
            r3.<init>(r2)
            r0.c = r3
            r0.b = r11
            java.lang.Object r2 = r14.a(r2, r0)
            if (r2 != r1) goto L95
            goto Lbc
        L95:
            r2 = r3
        L96:
            r0.c = r15
            r0.b = r10
            java.lang.Object r0 = r14.a(r2, r0)
            if (r0 != r1) goto Lbd
            goto Lbc
        La1:
            mp20$b r2 = r4.Q
            if (r2 == 0) goto Lbd
            if (r3 == 0) goto Lad
            mp20$c r3 = new mp20$c
            r3.<init>(r2)
            goto Lb2
        Lad:
            mp20$a r3 = new mp20$a
            r3.<init>(r2)
        Lb2:
            r0.c = r15
            r0.b = r9
            java.lang.Object r0 = r14.a(r3, r0)
            if (r0 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            r4.Q = r15
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
