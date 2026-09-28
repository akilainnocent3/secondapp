package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class daf implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function2<m020, gly, Unit> b;
    public final /* synthetic */ Function1<gly, Unit> c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ v5b e;
    public final /* synthetic */ psw f;
    public final /* synthetic */ ytw<i9f.b> g;
    public final /* synthetic */ Function0<Unit> h;

    @c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableKt$longPressDraggable$4$2$1$1$1$1", f = "Draggable.kt", l = {60}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ psw b;
        public final /* synthetic */ i9f.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(psw pswVar, i9f.b bVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = pswVar;
            this.c = bVar;
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
                psw pswVar = this.b;
                if (pswVar != null) {
                    this.a = 1;
                    obj = pswVar.a(this.c, this);
                    if (obj == y5bVar) {
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
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableKt$longPressDraggable$4$2$1$2$1$1", f = "Draggable.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ psw b;
        public final /* synthetic */ i9f.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(psw pswVar, i9f.b bVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = pswVar;
            this.c = bVar;
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
                psw pswVar = this.b;
                if (pswVar != null) {
                    i9f.c cVar = new i9f.c(this.c);
                    this.a = 1;
                    obj = pswVar.a(cVar, this);
                    if (obj == y5bVar) {
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
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableKt$longPressDraggable$4$2$1$3$1$1", f = "Draggable.kt", l = {83}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ psw b;
        public final /* synthetic */ i9f.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(psw pswVar, i9f.b bVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = pswVar;
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                psw pswVar = this.b;
                if (pswVar != null) {
                    i9f.a aVar = new i9f.a(this.c);
                    this.a = 1;
                    obj = pswVar.a(aVar, this);
                    if (obj == y5bVar) {
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
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public daf(boolean z, Function2<? super m020, ? super gly, Unit> function2, Function1<? super gly, Unit> function1, ytw<Boolean> ytwVar, v5b v5bVar, psw pswVar, ytw<i9f.b> ytwVar2, Function0<Unit> function0) {
        this.a = z;
        this.b = function2;
        this.c = function1;
        this.d = ytwVar;
        this.e = v5bVar;
        this.f = pswVar;
        this.g = ytwVar2;
        this.h = function0;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        if (!this.a) {
            return Unit.a;
        }
        Function1<gly, Unit> function1 = this.c;
        ytw<Boolean> ytwVar = this.d;
        v5b v5bVar = this.e;
        psw pswVar = this.f;
        ytw<i9f.b> ytwVar2 = this.g;
        aaf aafVar = new aaf(function1, ytwVar, v5bVar, pswVar, ytwVar2);
        Function0<Unit> function0 = this.h;
        baf bafVar = new baf(v5bVar, pswVar, ytwVar2, ytwVar, function0);
        caf cafVar = new caf(v5bVar, pswVar, ytwVar2, ytwVar, function0);
        float f = y8f.a;
        Object objB = dqi.b(u020Var, new o8f(aafVar, bafVar, cafVar, this.b, null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }
}
