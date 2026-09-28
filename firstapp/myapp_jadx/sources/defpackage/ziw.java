package defpackage;

import com.sportybet.android.multimaker.data.dto.MultiMakerLeagueOptionDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$refreshLeagueOptions$1", f = "MultiMakerViewModel.kt", l = {951}, m = "invokeSuspend", v = 2)
public final class ziw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tjw c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ziw(tjw tjwVar, boolean z, v1b<? super ziw> v1bVar) {
        super(2, v1bVar);
        this.c = tjwVar;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ziw ziwVar = new ziw(this.c, this.d, v1bVar);
        ziwVar.b = obj;
        return ziwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ziw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ziw ziwVar;
        Throwable th;
        Object bVar;
        ArrayList arrayList;
        tjw tjwVar = this.c;
        wwd0 wwd0Var = tjwVar.X;
        wwd0 wwd0Var2 = tjwVar.G;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            try {
                zi50.a aVar = zi50.b;
                wwd0Var2.setValue(lk50.b.a);
                h940 h940Var = tjwVar.d;
                String str = (String) tjwVar.V.getValue();
                int iIntValue = ((Number) CollectionsKt.T((List) tjwVar.W.getValue())).intValue();
                Long l = tjwVar.E1().a;
                Long l2 = tjwVar.E1().b;
                this.b = null;
                this.a = 1;
                ziwVar = this;
                try {
                    obj = h940Var.w(str, iIntValue, l, l2, ziwVar);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
            } catch (Throwable th3) {
                th = th3;
                ziwVar = this;
                th = th;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                uj50.b(obj);
                ziwVar = this;
            } catch (Throwable th4) {
                th = th4;
                ziwVar = this;
                zi50.a aVar4 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (List) obj;
        zi50.a aVar5 = zi50.b;
        if (!(bVar instanceof zi50.b)) {
            List list = (List) bVar;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((MultiMakerLeagueOptionDto) obj2).getEventSize() > 0) {
                    arrayList2.add(obj2);
                }
            }
            int i2 = 0;
            if (ziwVar.d || ((List) wwd0Var.getValue()).isEmpty()) {
                arrayList = new ArrayList(l48.r(arrayList2, 10));
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    arrayList.add(((MultiMakerLeagueOptionDto) obj3).getId());
                }
            } else {
                Iterable iterable = (Iterable) wwd0Var.getValue();
                arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    String str2 = (String) obj4;
                    if (!arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj5 = arrayList2.get(i3);
                            i3++;
                            if (Intrinsics.g(((MultiMakerLeagueOptionDto) obj5).getId(), str2)) {
                                arrayList.add(obj4);
                                break;
                            }
                        }
                    }
                }
            }
            wwd0Var.getClass();
            wwd0Var.k(null, arrayList);
            lk50.c cVar = new lk50.c(list);
            wwd0Var2.getClass();
            wwd0Var2.k(null, cVar);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            lk50.a aVar6 = new lk50.a(thA);
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVar6);
        }
        return Unit.a;
    }
}
