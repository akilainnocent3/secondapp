package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.framework.loading.LoadingTaskKt$loadingFlow$3", f = "LoadingTask.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ozs extends tje0 implements Function2<kzs<?>, v1b<? super lyh<? extends xxs<? extends Object>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ dq40<Map<kzs<?>, xxs<?>>> b;

    @c0d(c = "com.sportygames.common.framework.loading.LoadingTaskKt$loadingFlow$3$1", f = "LoadingTask.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<xxs<? extends Object>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ dq40<Map<kzs<?>, xxs<?>>> b;
        public final /* synthetic */ kzs<?> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dq40<Map<kzs<?>, xxs<?>>> dq40Var, kzs<?> kzsVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = dq40Var;
            this.c = kzsVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xxs<? extends Object> xxsVar, v1b<? super Unit> v1bVar) {
            return ((a) create(xxsVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xxs<?> xxsVar = (xxs) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Map<kzs<?>, xxs<?>> map = this.b.a;
            if (map != null) {
                map.put(this.c, xxsVar);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozs(dq40<Map<kzs<?>, xxs<?>>> dq40Var, v1b<? super ozs> v1bVar) {
        super(2, v1bVar);
        this.b = dq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ozs ozsVar = new ozs(this.b, v1bVar);
        ozsVar.a = obj;
        return ozsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kzs<?> kzsVar, v1b<? super lyh<? extends xxs<? extends Object>>> v1bVar) {
        return ((ozs) create(kzsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kzs kzsVar = (kzs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new g1i(kzsVar.a, new a(this.b, kzsVar, null));
    }
}
