package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.views.fragment.FavouriteFragment$observeDeleteFavouriteData$1$3", f = "FavouriteFragment.kt", l = {325}, m = "invokeSuspend", v = 1)
public final class ebh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ bbh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebh(bbh bbhVar, v1b<? super ebh> v1bVar) {
        super(2, v1bVar);
        this.b = bbhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ebh(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ebh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jct jctVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        bbh bbhVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            long j = bbhVar.z;
            this.a = 1;
            if (hkd.b(j, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (bbhVar.getView() != null && (jctVar = (jct) bbhVar.a) != null) {
            ibs viewLifecycleOwner = bbhVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            jctVar.E1(viewLifecycleOwner, 20);
        }
        return Unit.a;
    }
}
