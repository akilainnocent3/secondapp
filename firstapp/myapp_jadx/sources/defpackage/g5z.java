package defpackage;

import com.sporty.android.platform.features.newotp.model.AuthenticationMethodData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g5z<T> implements myh {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ Function1<Object, Unit> c;
    public final /* synthetic */ T d;
    public final /* synthetic */ Function1<T, Object> e;

    /* JADX WARN: Multi-variable type inference failed */
    public g5z(h5z h5zVar, Function0<Unit> function0, Function0<Unit> function1, Function1<Object, Unit> function2, T t, Function1<? super T, Object> function3) {
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = t;
        this.e = function3;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        lk50 lk50Var = (lk50) obj;
        boolean z = lk50Var instanceof lk50.b;
        Function0<Unit> function0 = this.a;
        if (z) {
            function0.invoke();
        } else {
            boolean z2 = lk50Var instanceof lk50.c;
            Function1<Object, Unit> function1 = this.c;
            T t = this.d;
            Function1<T, Object> function2 = this.e;
            if (z2) {
                AuthenticationMethodData authenticationMethodData = (AuthenticationMethodData) ((lk50.c) lk50Var).a;
                if (authenticationMethodData.getAccountVerificationResult() != null && (authenticationMethodData.getAccountVerificationResult() instanceof lk50.c)) {
                    this.b.invoke();
                } else if (Intrinsics.g(authenticationMethodData.getAccountVerificationResult(), lk50.b.a)) {
                    function0.invoke();
                } else {
                    function1.invoke(function2.invoke(t));
                    Unit unit = Unit.a;
                }
            } else {
                if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                function1.invoke(function2.invoke(t));
            }
        }
        return Unit.a;
    }
}
