package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PBBetHistoryViewModel$handleEvent$1", f = "PBBetHistoryViewModel.kt", l = {159}, m = "invokeSuspend", v = 1)
public final class tkz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pkz b;
    public final /* synthetic */ njz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(pkz pkzVar, njz njzVar, v1b<? super tkz> v1bVar) {
        super(2, v1bVar);
        this.b = pkzVar;
        this.c = njzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tkz(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tkz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pkz pkzVar = this.b;
            wwd0 wwd0Var = pkzVar.i;
            final njz njzVar = this.c;
            Function1 function1 = new Function1() { // from class: skz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    okz.e eVar = (okz.e) obj2;
                    uf00<dlz> uf00Var = eVar.a;
                    ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                    for (dlz dlzVar : uf00Var) {
                        int i2 = dlzVar.a;
                        if (i2 == ((njz.a) njzVar).a) {
                            boolean z = !dlzVar.i;
                            String str = dlzVar.b;
                            String str2 = dlzVar.c;
                            double d = dlzVar.d;
                            vkz vkzVar = dlzVar.e;
                            double d2 = dlzVar.f;
                            String str3 = dlzVar.g;
                            String str4 = dlzVar.h;
                            double d3 = dlzVar.j;
                            double d4 = dlzVar.k;
                            double d5 = dlzVar.l;
                            str.getClass();
                            str2.getClass();
                            str3.getClass();
                            str4.getClass();
                            dlzVar = new dlz(i2, str, str2, d, vkzVar, d2, str3, str4, z, d3, d4, d5);
                        }
                        arrayList.add(dlzVar);
                    }
                    uf00 uf00VarF = a4h.f(arrayList);
                    elz elzVar = eVar.b;
                    uf00VarF.getClass();
                    elzVar.getClass();
                    return new okz.e(uf00VarF, elzVar);
                }
            };
            Object value = wwd0Var.getValue();
            okz.e eVar = value instanceof okz.e ? (okz.e) value : null;
            if (eVar != null) {
                wwd0Var.setValue(function1.invoke(eVar));
            }
            yzm yzmVar = pkzVar.c;
            pu00 pu00Var = pu00.JOIN_ROOM_CARD_CLICK;
            this.a = 1;
            if (yzmVar.b("BetHistoryDetailsClick") == y5bVar) {
                return y5bVar;
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
