package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend")
public final class we0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public c77 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l67<Object> d;
    public final /* synthetic */ wd0<Object, Object> e;
    public final /* synthetic */ ytw f;
    public final /* synthetic */ ytw i;

    @c0d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ wd0<Object, Object> c;
        public final /* synthetic */ ytw d;
        public final /* synthetic */ ytw e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, wd0 wd0Var, ytw ytwVar, ytw ytwVar2, v1b v1bVar) {
            super(2, v1bVar);
            this.b = obj;
            this.c = wd0Var;
            this.d = ytwVar;
            this.e = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            a aVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            wd0<Object, Object> wd0Var = this.c;
            if (i == 0) {
                uj50.b(obj);
                if (!Intrinsics.g(this.b, ((x5a0) wd0Var.e).getValue())) {
                    fkd0<Float> fkd0Var = xe0.a;
                    xi0 xi0Var = (xi0) this.d.getValue();
                    this.a = 1;
                    aVar = this;
                    if (wd0.a(this.c, this.b, xi0Var, null, null, aVar, 12) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            aVar = this;
            fkd0<Float> fkd0Var2 = xe0.a;
            Function1 function1 = (Function1) aVar.e.getValue();
            if (function1 != null) {
                function1.invoke(wd0Var.d());
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we0(l67 l67Var, wd0 wd0Var, ytw ytwVar, ytw ytwVar2, v1b v1bVar) {
        super(2, v1bVar);
        this.d = l67Var;
        this.e = wd0Var;
        this.f = ytwVar;
        this.i = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        we0 we0Var = new we0(this.d, this.e, this.f, this.i, v1bVar);
        we0Var.c = obj;
        return we0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((we0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r13.b
            r2 = 0
            l67<java.lang.Object> r3 = r13.d
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L16
            c77 r1 = r13.a
            java.lang.Object r5 = r13.c
            v5b r5 = (defpackage.v5b) r5
            defpackage.uj50.b(r14)
            goto L35
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r2
        L1c:
            defpackage.uj50.b(r14)
            java.lang.Object r14 = r13.c
            v5b r14 = (defpackage.v5b) r14
            c77 r1 = r3.iterator()
            r5 = r14
        L28:
            r13.c = r5
            r13.a = r1
            r13.b = r4
            java.lang.Object r14 = r1.b(r13)
            if (r14 != r0) goto L35
            return r0
        L35:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L5f
            java.lang.Object r14 = r1.next()
            java.lang.Object r6 = r3.h()
            java.lang.Object r6 = defpackage.h77.b(r6)
            if (r6 != 0) goto L4d
            r8 = r14
            goto L4e
        L4d:
            r8 = r6
        L4e:
            we0$a r7 = new we0$a
            ytw r11 = r13.i
            r12 = 0
            wd0<java.lang.Object, java.lang.Object> r9 = r13.e
            ytw r10 = r13.f
            r7.<init>(r8, r9, r10, r11, r12)
            r14 = 3
            defpackage.ej5.c(r5, r2, r2, r7, r14)
            goto L28
        L5f:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
