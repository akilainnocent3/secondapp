package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$updateSubscriber$1", f = "MultiMakerViewModel.kt", l = {1355}, m = "invokeSuspend", v = 2)
public final class sjw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tjw b;
    public final /* synthetic */ List<MultiMakerItem> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjw(tjw tjwVar, List<MultiMakerItem> list, v1b<? super sjw> v1bVar) {
        super(2, v1bVar);
        this.b = tjwVar;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sjw(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sjw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            hus husVar = this.b.a;
            this.a = 1;
            husVar.getClass();
            pfd pfdVar = fse.a;
            Object objD = ej5.d(odd.b, new gus(husVar, this.c, null), this);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
