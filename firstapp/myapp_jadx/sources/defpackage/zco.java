package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sportybet.android.instantwin.presentation.bethistory2.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryViewModel$kickOff$1", f = "InstantWinBetHistoryViewModel.kt", l = {553}, m = "invokeSuspend", v = 2)
public final class zco extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zco(v1b v1bVar, c cVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zco(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zco) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zao zaoVar = this.b.e;
            this.a = 1;
            if (zaoVar.f(this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(lobGSRIlnSGJY.bUME);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
