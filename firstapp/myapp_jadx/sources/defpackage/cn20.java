package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cn20 implements sqc<zn20> {
    public final sqc<zn20> a;

    @c0d(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<zn20, v1b<? super zn20>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<zn20, v1b<? super zn20>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super zn20, ? super v1b<? super zn20>, ? extends Object> function2, v1b<? super a> v1bVar) {
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
                zn20 zn20Var = (zn20) this.b;
                this.a = 1;
                obj = this.c.invoke(zn20Var, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            zn20 zn20Var2 = (zn20) obj;
            zn20Var2.getClass();
            ((jtw) zn20Var2).b.a.set(true);
            return zn20Var2;
        }
    }

    public cn20(sqc<zn20> sqcVar) {
        this.a = sqcVar;
    }

    @Override // defpackage.sqc
    public final lyh<zn20> k() {
        return this.a.k();
    }

    @Override // defpackage.sqc
    public final Object l(Function2<? super zn20, ? super v1b<? super zn20>, ? extends Object> function2, v1b<? super zn20> v1bVar) {
        return this.a.l(new a(function2, null), v1bVar);
    }
}
