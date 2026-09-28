package defpackage;

import com.sportygames.commons.models.NetworkStateManager;
import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$initResponseListeners$1", f = "FruitHuntFragment.kt", l = {284}, m = "invokeSuspend", v = 1)
public final class d7j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u6j b;

    public static final class a<T> implements myh {
        public final /* synthetic */ u6j a;

        public a(u6j u6jVar) {
            this.a = u6jVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            int iIntValue = ((Number) obj).intValue();
            final u6j u6jVar = this.a;
            if (iIntValue == ((n8j) u6jVar.j0.getValue()).w) {
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    djhVar.G.O(100);
                }
                r750.d(u6jVar.t0(), new Function0() { // from class: q6j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        djh djhVar2 = u6jVar.b;
                        if (djhVar2 != null) {
                            djhVar2.w.B.setVisibility(8);
                        }
                        return Unit.a;
                    }
                });
                u6jVar.y0();
                if (!((Boolean) u6jVar.t0().z.getValue()).booleanValue()) {
                    u6jVar.S0(u6jVar.getActivity(), new ResultWrapper.GenericError(-2, null));
                } else if (Intrinsics.g(NetworkStateManager.INSTANCE.isConnected(), Boolean.FALSE)) {
                    u6jVar.S0(u6jVar.getActivity(), new ResultWrapper.GenericError(-11, null));
                } else {
                    u6jVar.S0(u6jVar.getActivity(), new ResultWrapper.GenericError(-3, null));
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7j(u6j u6jVar, v1b<? super d7j> v1bVar) {
        super(2, v1bVar);
        this.b = u6jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d7j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((d7j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        u6j u6jVar = this.b;
        wwd0 wwd0Var = ((n8j) u6jVar.j0.getValue()).i;
        a aVar = new a(u6jVar);
        this.a = 1;
        wwd0Var.collect(aVar, this);
        return y5bVar;
    }
}
