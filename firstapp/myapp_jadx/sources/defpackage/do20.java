package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class do20 {

    @c0d(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<zn20, v1b<? super zn20>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<jtw, v1b<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super jtw, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(zn20 zn20Var, v1b<? super zn20> v1bVar) {
            return ((a) create(zn20Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                jtw jtwVarD = ((zn20) this.b).d();
                this.b = jtwVarD;
                this.a = 1;
                return this.c.invoke(jtwVarD, this) == y5bVar ? y5bVar : jtwVarD;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jtw jtwVar = (jtw) this.b;
            uj50.b(obj);
            return jtwVar;
        }
    }

    public static final Object a(sqc<zn20> sqcVar, Function2<? super jtw, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super zn20> v1bVar) {
        return sqcVar.l(new a(function2, null), v1bVar);
    }
}
