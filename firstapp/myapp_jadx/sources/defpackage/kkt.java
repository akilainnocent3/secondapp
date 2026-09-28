package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
public final class kkt extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u020 b;
    public final /* synthetic */ fff0 c;

    @c0d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {77}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ u020 b;
        public final /* synthetic */ fff0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u020 u020Var, fff0 fff0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = u020Var;
            this.c = fff0Var;
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
            Object obj2 = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objB = dqi.b(this.b, new lkt(this.c, null), this);
                if (objB != obj2) {
                    objB = Unit.a;
                }
                if (objB == obj2) {
                    return obj2;
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

    @c0d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {78}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ u020 b;
        public final /* synthetic */ fff0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u020 u020Var, fff0 fff0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = u020Var;
            this.c = fff0Var;
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
            Object obj2 = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                final fff0 fff0Var = this.c;
                Object objE = y8f.e(this.b, new ikt(fff0Var, 0), new wla(fff0Var, 1), new xla(fff0Var, 2), new Function2() { // from class: jkt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        fff0Var.e(((gly) obj4).a);
                        return Unit.a;
                    }
                }, this);
                if (objE != obj2) {
                    objE = Unit.a;
                }
                if (objE == obj2) {
                    return obj2;
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
    public kkt(u020 u020Var, fff0 fff0Var, v1b<? super kkt> v1bVar) {
        super(2, v1bVar);
        this.b = u020Var;
        this.c = fff0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kkt kktVar = new kkt(this.b, this.c, v1bVar);
        kktVar.a = obj;
        return kktVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
        return ((kkt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        v5b v5bVar = (v5b) this.a;
        a6b a6bVar = a6b.d;
        u020 u020Var = this.b;
        fff0 fff0Var = this.c;
        ej5.c(v5bVar, null, a6bVar, new a(u020Var, fff0Var, null), 1);
        return ej5.c(v5bVar, null, a6bVar, new b(u020Var, fff0Var, null), 1);
    }
}
