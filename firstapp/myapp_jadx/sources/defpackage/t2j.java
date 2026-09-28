package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.fruithunt.network.models.FHIsAvailable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t2j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final n2j n2jVar = (n2j) obj2;
                final LoadingState loadingState = (LoadingState) obj;
                if (loadingState != null) {
                    n2jVar.n0(new Function0() { // from class: u2j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Integer code;
                            final LoadingState loadingState2 = loadingState;
                            ResultWrapper.GenericError error = loadingState2.getError();
                            final n2j n2jVar2 = n2jVar;
                            if (error == null || (code = error.getCode()) == null || code.intValue() != 503) {
                                n2jVar2.w0(loadingState2.getStatus(), loadingState2.getError(), new Function0() { // from class: v2j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        FHIsAvailable fHIsAvailable;
                                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState2.getData();
                                        boolean zG = (hTTPResponse == null || (fHIsAvailable = (FHIsAvailable) hTTPResponse.getData()) == null) ? false : Intrinsics.g(fHIsAvailable.isAvailable(), Boolean.TRUE);
                                        int i2 = 1;
                                        n2j n2jVar3 = n2jVar2;
                                        if (zG) {
                                            o8j o8jVarT0 = n2jVar3.t0();
                                            ej5.c(o8i0.d(o8jVarT0), null, null, new v3j(o8jVarT0, null), 3);
                                            n2jVar3.X0(true);
                                        } else {
                                            n2jVar3.o0(new l6e(n2jVar3, i2));
                                        }
                                        return Unit.a;
                                    }
                                });
                            } else {
                                n2jVar2.S0(n2jVar2.getActivity(), new ResultWrapper.GenericError(8002, null));
                            }
                            return Unit.a;
                        }
                    });
                }
                break;
            default:
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                wwd0 wwd0Var = ((pts) obj2).c;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, lk50Var));
                break;
        }
        return Unit.a;
    }
}
