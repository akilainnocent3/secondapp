package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {1544}, m = "invokeSuspend")
public final class l10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function0<Object> c;
    public final /* synthetic */ Function2<Object, v1b<? super Unit>, Object> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ dq40<c9p> a;
        public final /* synthetic */ v5b b;
        public final /* synthetic */ Function2<Object, v1b<? super Unit>, Object> c;

        /* JADX INFO: renamed from: l10$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1551}, m = "invokeSuspend")
        public static final class C0801a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function2<Object, v1b<? super Unit>, Object> b;
            public final /* synthetic */ Object c;
            public final /* synthetic */ v5b d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0801a(Function2<Object, ? super v1b<? super Unit>, ? extends Object> function2, Object obj, v5b v5bVar, v1b<? super C0801a> v1bVar) {
                super(2, v1bVar);
                this.b = function2;
                this.c = obj;
                this.d = v5bVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0801a(this.b, this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0801a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (this.b.invoke(this.c, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                w5b.c(this.d, new r00());
                return Unit.a;
            }
        }

        @c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {1547}, m = "emit")
        public static final class b extends x1b {
            public Object a;
            public c9p b;
            public /* synthetic */ Object c;
            public final /* synthetic */ a<T> d;
            public int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, v1b<? super b> v1bVar) {
                super(v1bVar);
                this.d = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return this.d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(dq40<c9p> dq40Var, v5b v5bVar, Function2<Object, ? super v1b<? super Unit>, ? extends Object> function2) {
            this.a = dq40Var;
            this.b = v5bVar;
            this.c = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b<? super Unit> v1bVar) {
            b bVar;
            if (v1bVar instanceof b) {
                bVar = (b) v1bVar;
                int i = bVar.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bVar.e = i - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, v1bVar);
                }
            } else {
                bVar = new b(this, v1bVar);
            }
            Object obj2 = bVar.c;
            y5b y5bVar = y5b.a;
            int i2 = bVar.e;
            dq40<c9p> dq40Var = this.a;
            if (i2 == 0) {
                uj50.b(obj2);
                c9p c9pVar = dq40Var.a;
                if (c9pVar != null) {
                    c9pVar.cancel((CancellationException) new r00());
                    bVar.a = obj;
                    bVar.b = c9pVar;
                    bVar.e = 1;
                    if (c9pVar.join(bVar) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = bVar.a;
                uj50.b(obj2);
            }
            a6b a6bVar = a6b.d;
            Function2<Object, v1b<? super Unit>, Object> function2 = this.c;
            v5b v5bVar = this.b;
            dq40Var.a = (T) ej5.c(v5bVar, null, a6bVar, new C0801a(function2, obj, v5bVar, null), 1);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l10(Function0<Object> function0, Function2<Object, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super l10> v1bVar) {
        super(2, v1bVar);
        this.c = function0;
        this.d = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l10 l10Var = new l10(this.c, this.d, v1bVar);
        l10Var.b = obj;
        return l10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            v5b v5bVar = (v5b) this.b;
            dq40 dq40Var = new dq40();
            or60 or60VarC = n95.c(this.c);
            a aVar = new a(dq40Var, v5bVar, this.d);
            this.a = 1;
            if (or60VarC.collect(aVar, this) == y5bVar) {
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
