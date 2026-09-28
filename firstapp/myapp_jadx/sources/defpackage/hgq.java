package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$LNGroupTab$2$1", f = "LNGroupTab.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class hgq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ ytw<ez00> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ ytw<ez00> a;

        public a(ytw<ez00> ytwVar) {
            this.a = ytwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.setValue((ez00) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgq(zzr zzrVar, ytw<ez00> ytwVar, v1b<? super hgq> v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hgq(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hgq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final zzr zzrVar = this.b;
            or60 or60VarC = n95.c(new Function0() { // from class: ggq
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    i060 i060Var = egq.a;
                    kzr kzrVarJ = zzrVar.j();
                    List<zyr> listK = kzrVarJ.k();
                    ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                    for (zyr zyrVar : listK) {
                        arrayList.add(new cz00(zyrVar.getIndex(), zyrVar.getOffset(), zyrVar.a()));
                    }
                    return new ez00(arrayList, kzrVarJ.f() - kzrVarJ.h());
                }
            });
            a aVar = new a(this.c);
            this.a = 1;
            if (or60VarC.collect(aVar, this) == y5bVar) {
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
