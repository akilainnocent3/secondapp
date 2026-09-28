package defpackage;

import android.content.Context;
import com.sportygames.common.business.CommonGameDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.domain.usecase.NNDRecommendUseCaseImpl$preloadImages$2", f = "NNDRecommendUseCaseImpl.kt", l = {55}, m = "invokeSuspend", v = 1)
public final class xax extends tje0 implements Function2<v5b, v1b<? super List<? extends Unit>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<CommonGameDetails> c;
    public final /* synthetic */ wax d;

    @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDRecommendUseCaseImpl$preloadImages$2$3$1", f = "NNDRecommendUseCaseImpl.kt", l = {54}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wax b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wax waxVar, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = waxVar;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Context context = this.b.b;
                nan.a aVar = new nan.a(context);
                aVar.c = this.c;
                abn.a(aVar, false);
                wr5 wr5Var = wr5.c;
                aVar.l = wr5Var;
                aVar.m = wr5Var;
                Object objB = qw90.a(context).b(aVar.a(), this);
                if (objB != y5bVar) {
                    objB = Unit.a;
                }
                if (objB == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xax(List<CommonGameDetails> list, wax waxVar, v1b<? super xax> v1bVar) {
        super(2, v1bVar);
        this.c = list;
        this.d = waxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xax xaxVar = new xax(this.c, this.d, v1bVar);
        xaxVar.b = obj;
        return xaxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends Unit>> v1bVar) {
        return ((xax) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            List<CommonGameDetails> list = this.c;
            if (list != null) {
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CommonGameDetails) it.next()).getImageUrl());
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    String str = (String) obj2;
                    if (str == null || str.length() == 0) {
                        arrayList2.add(obj2);
                    }
                }
                List listT0 = CollectionsKt.t0(CollectionsKt.R(arrayList2), 4);
                if (listT0 != null) {
                    ArrayList arrayList3 = new ArrayList(l48.r(listT0, 10));
                    Iterator it2 = listT0.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(ej5.a(v5bVar, null, new a(this.d, (String) it2.next(), null), 3));
                    }
                    this.b = null;
                    this.a = 1;
                    obj = up1.a(arrayList3, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        return (List) obj;
    }
}
