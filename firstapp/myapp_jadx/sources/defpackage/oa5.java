package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
public final class oa5 extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pa5 b;
    public final /* synthetic */ ywx c;
    public final /* synthetic */ da5 d;
    public final /* synthetic */ na5 e;

    @c0d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ pa5 b;
        public final /* synthetic */ ywx c;
        public final /* synthetic */ da5 d;

        /* JADX INFO: renamed from: oa5$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0922a extends saj implements Function0<lk40> {
            public final /* synthetic */ pa5 a;
            public final /* synthetic */ ywx b;
            public final /* synthetic */ da5 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0922a(pa5 pa5Var, ywx ywxVar, da5 da5Var) {
                super(0, Intrinsics.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.a = pa5Var;
                this.b = ywxVar;
                this.c = da5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final lk40 invoke() {
                return pa5.p2(this.a, this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pa5 pa5Var, ywx ywxVar, da5 da5Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = pa5Var;
            this.c = ywxVar;
            this.d = da5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objO;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                pa5 pa5Var = this.b;
                nza nzaVar = pa5Var.D;
                C0922a c0922a = new C0922a(pa5Var, this.c, this.d);
                this.a = 1;
                nzaVar.getClass();
                lk40 lk40Var = (lk40) c0922a.invoke();
                if (lk40Var == null || nzaVar.r2(lk40Var, nzaVar.L)) {
                    objO = Unit.a;
                } else {
                    bc6 bc6Var = new bc6(1, yzo.b(this));
                    bc6Var.q();
                    final nza.a aVar = new nza.a(c0922a, bc6Var);
                    final ha5 ha5Var = nzaVar.H;
                    duw<nza.a> duwVar = ha5Var.a;
                    lk40 lk40Var2 = (lk40) c0922a.invoke();
                    if (lk40Var2 == null) {
                        zi50.a aVar2 = zi50.b;
                        bc6Var.resumeWith(Unit.a);
                    } else {
                        bc6Var.t(new Function1() { // from class: ga5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ha5Var.a.j(aVar);
                                return Unit.a;
                            }
                        });
                        IntRange intRangeN = f.n(0, duwVar.c);
                        int i2 = intRangeN.a;
                        int i3 = intRangeN.b;
                        if (i2 > i3) {
                            duwVar.a(0, aVar);
                            break;
                        }
                        while (true) {
                            lk40 lk40Var3 = (lk40) duwVar.a[i3].a.invoke();
                            if (lk40Var3 != null) {
                                lk40 lk40VarF = lk40Var2.f(lk40Var3);
                                if (!lk40VarF.equals(lk40Var2)) {
                                    if (!lk40VarF.equals(lk40Var3)) {
                                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i4 = duwVar.c - 1;
                                        if (i4 <= i3) {
                                            while (true) {
                                                duwVar.a[i3].b.cancel(cancellationException);
                                                if (i4 == i3) {
                                                    break;
                                                }
                                                i4++;
                                            }
                                        }
                                    }
                                } else {
                                    duwVar.a(i3 + 1, aVar);
                                    break;
                                }
                            }
                            if (i3 == i2) {
                                duwVar.a(0, aVar);
                                break;
                            }
                            i3--;
                        }
                        if (!nzaVar.M) {
                            nzaVar.s2();
                        }
                    }
                    objO = bc6Var.o();
                    if (objO != y5b.a) {
                        objO = Unit.a;
                    }
                }
                if (objO == y5bVar) {
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

    @c0d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ pa5 b;
        public final /* synthetic */ na5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pa5 pa5Var, na5 na5Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = pa5Var;
            this.c = na5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (ea5.a(this.b, this.c, this) == y5bVar) {
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
    public oa5(pa5 pa5Var, ywx ywxVar, da5 da5Var, na5 na5Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = pa5Var;
        this.c = ywxVar;
        this.d = da5Var;
        this.e = na5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oa5 oa5Var = new oa5(this.b, this.c, this.d, this.e, v1bVar);
        oa5Var.a = obj;
        return oa5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
        return ((oa5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        v5b v5bVar = (v5b) this.a;
        ywx ywxVar = this.c;
        da5 da5Var = this.d;
        pa5 pa5Var = this.b;
        ej5.c(v5bVar, null, null, new a(pa5Var, ywxVar, da5Var, null), 3);
        return ej5.c(v5bVar, null, null, new b(pa5Var, this.e, null), 3);
    }
}
