package defpackage;

import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sfd implements fr70 {
    public final Function1<Float, Float> a;
    public final b b = new b();
    public final puw c = new puw();
    public final ytw<Boolean> d;
    public final ytw<Boolean> e;
    public final ytw<Boolean> f;

    @c0d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {198}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ huw c;
        public final /* synthetic */ Function2<tp70, v1b<? super Unit>, Object> d;

        /* JADX INFO: renamed from: sfd$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {201}, m = "invokeSuspend")
        public static final class C1093a extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ sfd c;
            public final /* synthetic */ Function2<tp70, v1b<? super Unit>, Object> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1093a(sfd sfdVar, Function2<? super tp70, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super C1093a> v1bVar) {
                super(2, v1bVar);
                this.c = sfdVar;
                this.d = function2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1093a c1093a = new C1093a(this.c, this.d, v1bVar);
                c1093a.b = obj;
                return c1093a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
                return ((C1093a) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                ytw ytwVar = this.c.d;
                y5b y5bVar = y5b.a;
                int i = this.a;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        tp70 tp70Var = (tp70) this.b;
                        ((x5a0) ytwVar).setValue(Boolean.TRUE);
                        Function2<tp70, v1b<? super Unit>, Object> function2 = this.d;
                        this.a = 1;
                        if (function2.invoke(tp70Var, this) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    ytwVar = (x5a0) ytwVar;
                    ytwVar.setValue(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th) {
                    ((x5a0) ytwVar).setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(huw huwVar, Function2<? super tp70, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = huwVar;
            this.d = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return sfd.this.new a(this.c, this.d, v1bVar);
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
                sfd sfdVar = sfd.this;
                puw puwVar = sfdVar.c;
                b bVar = sfdVar.b;
                C1093a c1093a = new C1093a(sfdVar, this.d, null);
                this.a = 1;
                puwVar.getClass();
                if (w5b.d(new ouw(this.c, puwVar, c1093a, bVar, null), this) == y5bVar) {
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

    public static final class b implements tp70 {
        public b() {
        }

        @Override // defpackage.tp70
        public final float e(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            sfd sfdVar = sfd.this;
            float fFloatValue = sfdVar.a.invoke(Float.valueOf(f)).floatValue();
            ((x5a0) sfdVar.e).setValue(Boolean.valueOf(fFloatValue > 0.0f));
            ((x5a0) sfdVar.f).setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sfd(Function1<? super Float, Float> function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = m.b(bool);
        this.e = m.b(bool);
        this.f = m.b(bool);
    }

    @Override // defpackage.fr70
    public final float a(float f) {
        return this.a.invoke(Float.valueOf(f)).floatValue();
    }

    @Override // defpackage.fr70
    public final Object b(huw huwVar, Function2<? super tp70, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super Unit> v1bVar) {
        Object objD = w5b.d(new a(huwVar, function2, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.fr70
    public final boolean c() {
        return ((Boolean) ((x5a0) this.d).getValue()).booleanValue();
    }
}
