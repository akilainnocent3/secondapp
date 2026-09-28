package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pc2 implements PointerInputEventHandler {
    public final /* synthetic */ b1g0 a;

    @c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {249}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ u020 c;
        public final /* synthetic */ b1g0 d;

        /* JADX INFO: renamed from: pc2$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {253}, m = "invokeSuspend")
        public static final class C0966a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
            public c020 b;
            public int c;
            public /* synthetic */ Object d;
            public final /* synthetic */ v5b e;
            public final /* synthetic */ b1g0 f;

            /* JADX INFO: renamed from: pc2$a$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {258}, m = "invokeSuspend")
            public static final class C0967a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ b1g0 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0967a(b1g0 b1g0Var, v1b<? super C0967a> v1bVar) {
                    super(2, v1bVar);
                    this.b = b1g0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0967a(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0967a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        huw huwVar = huw.b;
                        this.a = 1;
                        if (this.b.c(huwVar, this) == y5bVar) {
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
            public C0966a(v5b v5bVar, b1g0 b1g0Var, v1b<? super C0966a> v1bVar) {
                super(2, v1bVar);
                this.e = v5bVar;
                this.f = b1g0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0966a c0966a = new C0966a(this.e, this.f, v1bVar);
                c0966a.d = obj;
                return c0966a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
                ((C0966a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:14:0x0041  */
            /* JADX WARN: Code duplicated, block: B:16:0x0048  */
            /* JADX WARN: Code duplicated, block: B:17:0x0054  */
            /* JADX WARN: Code duplicated, block: B:19:0x0057  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r7.c
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1a
                    if (r1 != r3) goto L14
                    c020 r1 = r7.b
                    java.lang.Object r4 = r7.d
                    vp1 r4 = (defpackage.vp1) r4
                    defpackage.uj50.b(r8)
                    goto L31
                L14:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r7)
                    return r2
                L1a:
                    defpackage.uj50.b(r8)
                    java.lang.Object r8 = r7.d
                    vp1 r8 = (defpackage.vp1) r8
                    c020 r1 = defpackage.c020.b
                    r4 = r8
                L24:
                    r7.d = r4
                    r7.b = r1
                    r7.c = r3
                    java.lang.Object r8 = r4.l1(r1, r7)
                    if (r8 != r0) goto L31
                    return r0
                L31:
                    b020 r8 = (defpackage.b020) r8
                    java.util.List<m020> r5 = r8.a
                    r6 = 0
                    java.lang.Object r5 = r5.get(r6)
                    m020 r5 = (defpackage.m020) r5
                    int r5 = r5.i
                    r6 = 2
                    if (r5 != r6) goto L24
                    int r8 = r8.e
                    r5 = 4
                    b1g0 r6 = r7.f
                    if (r8 != r5) goto L54
                    pc2$a$a$a r8 = new pc2$a$a$a
                    r8.<init>(r6, r2)
                    r5 = 3
                    v5b r6 = r7.e
                    defpackage.ej5.c(r6, r2, r2, r8, r5)
                    goto L24
                L54:
                    r5 = 5
                    if (r8 != r5) goto L24
                    r6.a()
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: pc2.a.C0966a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u020 u020Var, b1g0 b1g0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = u020Var;
            this.d = b1g0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
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
                C0966a c0966a = new C0966a((v5b) this.b, this.d, null);
                this.a = 1;
                if (this.c.x0(c0966a, this) == y5bVar) {
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

    public pc2(b1g0 b1g0Var) {
        this.a = b1g0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objD = w5b.d(new a(u020Var, this.a, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
