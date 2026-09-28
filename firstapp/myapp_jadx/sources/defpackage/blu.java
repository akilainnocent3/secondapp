package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel$prefetchSportIcons$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class blu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ oku a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blu(v1b v1bVar, oku okuVar) {
        super(2, v1bVar);
        this.a = okuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new blu(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((blu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayListC = this.a.I.c();
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListC.get(i);
            i++;
            ((mfb0) obj2).t();
        }
        return Unit.a;
    }
}
