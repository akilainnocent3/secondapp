package defpackage;

import com.sporty.android.core.model.pocket.globalpay.pix.PixBank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixBankAccountsUseCase$getAllBanks$2", f = "GetPixBankAccountsUseCase.kt", l = {59, 61}, m = "invokeSuspend", v = 2)
public final class wak extends tje0 implements Function2<v5b, v1b<? super List<? extends PixBank>>, Object> {
    public pjd a;
    public List b;
    public Set c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ yak f;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixBankAccountsUseCase$getAllBanks$2$allBanksDeferred$1", f = "GetPixBankAccountsUseCase.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super List<? extends PixBank>>, Object> {
        public int a;
        public final /* synthetic */ yak b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yak yakVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = yakVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super List<? extends PixBank>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            d3k d3kVar = this.b.b;
            this.a = 1;
            Object objA = d3kVar.a(false, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixBankAccountsUseCase$getAllBanks$2$popularBanksDeferred$1", f = "GetPixBankAccountsUseCase.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super List<? extends PixBank>>, Object> {
        public int a;
        public final /* synthetic */ yak b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yak yakVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = yakVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super List<? extends PixBank>> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            d3k d3kVar = this.b.b;
            this.a = 1;
            Object objA = d3kVar.a(true, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wak(yak yakVar, v1b<? super wak> v1bVar) {
        super(2, v1bVar);
        this.f = yakVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wak wakVar = new wak(this.f, v1bVar);
        wakVar.e = obj;
        return wakVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends PixBank>> v1bVar) {
        return ((wak) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        pjd pjdVarA;
        List list;
        Set set;
        ArrayList arrayList;
        v5b v5bVar = (v5b) this.e;
        y5b y5bVar = y5b.a;
        int i = this.d;
        if (i == 0) {
            uj50.b(obj);
            yak yakVar = this.f;
            pjd pjdVarA2 = ej5.a(v5bVar, null, new b(yakVar, null), 3);
            pjdVarA = ej5.a(v5bVar, null, new a(yakVar, null), 3);
            this.e = null;
            this.a = pjdVarA;
            this.d = 1;
            obj = pjdVarA2.q(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            pjdVarA = this.a;
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = this.c;
            list = this.b;
            uj50.b(obj);
        }
        arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (!set.contains(((PixBank) obj2).getIspb())) {
                arrayList.add(obj2);
            }
        }
        return CollectionsKt.i0(arrayList, list);
        List list2 = (List) obj;
        ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PixBank) it.next()).getIspb());
        }
        Set setE0 = CollectionsKt.E0(arrayList2);
        this.e = null;
        this.a = null;
        this.b = list2;
        this.c = setE0;
        this.d = 2;
        Object objAwait = pjdVarA.await(this);
        if (objAwait != y5bVar) {
            obj = objAwait;
            list = list2;
            set = setE0;
            arrayList = new ArrayList();
            while (r9.hasNext()) {
                if (!set.contains(((PixBank) obj2).getIspb())) {
                    arrayList.add(obj2);
                }
            }
            return CollectionsKt.i0(arrayList, list);
        }
        return y5bVar;
    }
}
