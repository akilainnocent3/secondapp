package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.GetLotteryFlowUseCase$invoke$1", f = "GetLotteryFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z7k extends tje0 implements jaj<avq, qcn<? extends dsq>, scn<String, ? extends r4q>, qcn<? extends g7q>, v1b<? super qcn<? extends erq>>, Object> {
    public /* synthetic */ avq a;
    public /* synthetic */ qcn b;
    public /* synthetic */ scn c;
    public /* synthetic */ qcn d;
    public final /* synthetic */ b8k e;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Long.valueOf(((erq) t).k).compareTo(Long.valueOf(((erq) t2).k));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7k(v1b v1bVar, b8k b8kVar) {
        super(5, v1bVar);
        this.e = b8kVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[PHI: r0
      0x0076: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v15 java.lang.String) binds: [B:25:0x0069, B:29:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        avq avqVar = this.a;
        qcn<dsq> qcnVar = this.b;
        scn scnVar = this.c;
        qcn qcnVar2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (avqVar == null) {
            return n1a0.c;
        }
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        for (dsq dsqVar : qcnVar) {
            boolean z2 = avqVar.i;
            r4q r4qVar = (r4q) scnVar.get(dsqVar.b);
            String str5 = dsqVar.a;
            String str6 = dsqVar.d;
            int iW = CollectionsKt.W(scnVar.keySet(), dsqVar.b);
            String str7 = dsqVar.b;
            if (r4qVar == null || (str = r4qVar.b) == null) {
                str = "";
            }
            if (r4qVar == null || (str2 = r4qVar.c) == null) {
                str2 = "";
            }
            if (r4qVar == null || (str3 = r4qVar.d) == null) {
                str3 = "";
            }
            qcn qcnVar3 = qcnVar2;
            String str8 = dsqVar.c;
            if (str8 != null) {
                str4 = str8;
            } else {
                str8 = r4qVar != null ? r4qVar.c : null;
                if (str8 == null) {
                    str4 = "";
                } else {
                    str4 = str8;
                }
            }
            if (qcnVar3 != null && qcnVar3.isEmpty()) {
                z = false;
                break;
            }
            Iterator<E> it = qcnVar3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (Intrinsics.g(((g7q) it.next()).a(), dsqVar.a)) {
                    z = true;
                    break;
                }
            }
            avq avqVar2 = avqVar;
            arrayList.add(new erq(str5, str6, iW, str7, str, str2, str3, str4, z, dsqVar.e, dsqVar.f, dsqVar.g, z2 ? dsqVar.h : n1a0.c));
            qcnVar2 = qcnVar3;
            avqVar = avqVar2;
        }
        return a4h.b(CollectionsKt.r0(arrayList, new a()));
    }

    @Override // defpackage.jaj
    public final Object l(avq avqVar, qcn<? extends dsq> qcnVar, scn<String, ? extends r4q> scnVar, qcn<? extends g7q> qcnVar2, v1b<? super qcn<? extends erq>> v1bVar) {
        z7k z7kVar = new z7k(v1bVar, this.e);
        z7kVar.a = avqVar;
        z7kVar.b = qcnVar;
        z7kVar.c = scnVar;
        z7kVar.d = qcnVar2;
        return z7kVar.invokeSuspend(Unit.a);
    }
}
