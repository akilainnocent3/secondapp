package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class r750 {

    @c0d(c = "com.sportygames.fruithunt.utils.RenderHelperKt$performAfterDelay$1", f = "RenderHelper.kt", l = {21}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Function0<Unit> c;

        /* JADX INFO: renamed from: r750$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.fruithunt.utils.RenderHelperKt$performAfterDelay$1$1", f = "RenderHelper.kt", l = {22}, m = "invokeSuspend", v = 1)
        public static final class C1038a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ Function0<Unit> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1038a(long j, Function0<Unit> function0, v1b<? super C1038a> v1bVar) {
                super(2, v1bVar);
                this.b = j;
                this.c = function0;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1038a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1038a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (hkd.b(this.b, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                this.c.invoke();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = j;
            this.c = function0;
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
                pfd pfdVar = fse.a;
                odd oddVar = odd.b;
                C1038a c1038a = new C1038a(this.b, this.c, null);
                this.a = 1;
                if (ej5.d(oddVar, c1038a, this) == y5bVar) {
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

    public static final void a(o8j o8jVar, Function0 function0) {
        o8jVar.getClass();
        ej5.c(o8i0.d(o8jVar), null, null, new q750(function0, null), 3);
    }

    public static final void b(j8i0 j8i0Var, long j, Function0<Unit> function0) {
        j8i0Var.getClass();
        ej5.c(o8i0.d(j8i0Var), null, null, new a(j, function0, null), 3);
    }

    public static final void c(ypa0 ypa0Var, String str) {
        ypa0Var.getClass();
        if (str != null) {
            ej5.c(o8i0.d(ypa0Var), null, null, new t750(ypa0Var, str, 0L, null), 3);
        }
    }

    public static final void d(o8j o8jVar, Function0 function0) {
        o8jVar.getClass();
        ej5.c(o8i0.d(o8jVar), null, null, new u750(function0, null), 3);
    }
}
