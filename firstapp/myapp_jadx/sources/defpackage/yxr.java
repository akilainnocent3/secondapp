package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yxr implements PointerInputEventHandler {
    public final /* synthetic */ zpz a;

    @c0d(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {286}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ u020 b;
        public final /* synthetic */ zpz c;

        /* JADX INFO: renamed from: yxr$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {288, 292}, m = "invokeSuspend")
        public static final class C1371a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
            public m020 b;
            public m020 c;
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ zpz f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1371a(zpz zpzVar, v1b<? super C1371a> v1bVar) {
                super(2, v1bVar);
                this.f = zpzVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1371a c1371a = new C1371a(this.f, v1bVar);
                c1371a.e = obj;
                return c1371a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
                return ((C1371a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0072  */
            /* JADX WARN: Code duplicated, block: B:24:0x0081 A[LOOP:0: B:20:0x0070->B:24:0x0081, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:28:0x0084 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:29:0x007e A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:19:0x0067). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r12.d
                    r2 = 0
                    zpz r3 = r12.f
                    r4 = 2
                    r5 = 0
                    r6 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r6) goto L22
                    if (r1 != r4) goto L1c
                    m020 r1 = r12.c
                    m020 r2 = r12.b
                    java.lang.Object r6 = r12.e
                    vp1 r6 = (defpackage.vp1) r6
                    defpackage.uj50.b(r13)
                    goto L67
                L1c:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r12)
                    return r2
                L22:
                    java.lang.Object r1 = r12.e
                    vp1 r1 = (defpackage.vp1) r1
                    defpackage.uj50.b(r13)
                    goto L3f
                L2a:
                    defpackage.uj50.b(r13)
                    java.lang.Object r13 = r12.e
                    r1 = r13
                    vp1 r1 = (defpackage.vp1) r1
                    c020 r13 = defpackage.c020.a
                    r12.e = r1
                    r12.d = r6
                    java.lang.Object r13 = defpackage.u4f0.a(r1, r5, r13, r12)
                    if (r13 != r0) goto L3f
                    goto L62
                L3f:
                    m020 r13 = (defpackage.m020) r13
                    ytw r6 = r3.c
                    gly r7 = new gly
                    r8 = 0
                    r7.<init>(r8)
                    x5a0 r6 = (defpackage.x5a0) r6
                    r6.setValue(r7)
                    r6 = r1
                L50:
                    if (r2 != 0) goto L90
                    c020 r1 = defpackage.c020.a
                    r12.e = r6
                    r12.b = r13
                    r12.c = r2
                    r12.d = r4
                    java.lang.Object r1 = r6.l1(r1, r12)
                    if (r1 != r0) goto L63
                L62:
                    return r0
                L63:
                    r11 = r2
                    r2 = r13
                    r13 = r1
                    r1 = r11
                L67:
                    b020 r13 = (defpackage.b020) r13
                    java.util.List<m020> r7 = r13.a
                    int r8 = r7.size()
                    r9 = r5
                L70:
                    if (r9 >= r8) goto L84
                    java.lang.Object r10 = r7.get(r9)
                    m020 r10 = (defpackage.m020) r10
                    boolean r10 = defpackage.ovo.d(r10)
                    if (r10 != 0) goto L81
                    r13 = r2
                    r2 = r1
                    goto L50
                L81:
                    int r9 = r9 + 1
                    goto L70
                L84:
                    java.util.List<m020> r13 = r13.a
                    java.lang.Object r13 = r13.get(r5)
                    m020 r13 = (defpackage.m020) r13
                    r11 = r2
                    r2 = r13
                    r13 = r11
                    goto L50
                L90:
                    long r0 = r2.c
                    long r12 = r13.c
                    long r12 = defpackage.gly.e(r0, r12)
                    ytw r0 = r3.c
                    gly r1 = new gly
                    r1.<init>(r12)
                    x5a0 r0 = (defpackage.x5a0) r0
                    r0.setValue(r1)
                    kotlin.Unit r12 = kotlin.Unit.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: yxr.a.C1371a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u020 u020Var, zpz zpzVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = u020Var;
            this.c = zpzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                C1371a c1371a = new C1371a(this.c, null);
                this.a = 1;
                if (dqi.b(this.b, c1371a, this) == y5bVar) {
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

    public yxr(zpz zpzVar) {
        this.a = zpzVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objD = w5b.d(new a(u020Var, this.a, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
