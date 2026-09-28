package defpackage;

import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z0j implements Function0 {
    public final /* synthetic */ n2j a;
    public final /* synthetic */ ResultWrapper.GenericError b;

    public /* synthetic */ z0j(n2j n2jVar, ResultWrapper.GenericError genericError) {
        this.a = n2jVar;
        this.b = genericError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ResultWrapper.GenericError genericError = this.b;
        n2j n2jVar = this.a;
        n2jVar.S0(n2jVar.getActivity(), genericError);
        return Unit.a;
    }
}
