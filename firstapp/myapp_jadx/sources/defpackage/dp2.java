package defpackage;

import com.sportygames.crashInitiated.model.response.BetHistoryItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.views.adapters.BetHistoryAdapterBase$addMoreAndSubmitListCrashInitiated$1", f = "BetHistoryAdapterBase.kt", l = {104}, m = "invokeSuspend", v = 1)
public final class dp2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ pn80 e;

    @c0d(c = "com.sportygames.commons.views.adapters.BetHistoryAdapterBase$addMoreAndSubmitListCrashInitiated$1$1", f = "BetHistoryAdapterBase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ pn80 a;
        public final /* synthetic */ ArrayList b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pn80 pn80Var, ArrayList arrayList, v1b v1bVar) {
            super(2, v1bVar);
            this.a = pn80Var;
            this.b = arrayList;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.i(this.b);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp2(ArrayList arrayList, boolean z, boolean z2, pn80 pn80Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = arrayList;
        this.c = z;
        this.d = z2;
        this.e = pn80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dp2(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dp2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListI0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ArrayList arrayList = this.b;
            int i2 = 0;
            if (!arrayList.isEmpty() && this.c) {
                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(new ipc.c((BetHistoryItem) obj2));
                }
                arrayListI0 = CollectionsKt.i0(kotlin.collections.a.c(ipc.n.a), arrayList2);
            } else if (arrayList.isEmpty() || !this.d) {
                ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    arrayList3.add(new ipc.c((BetHistoryItem) obj3));
                }
                arrayListI0 = arrayList3;
            } else {
                ArrayList arrayList4 = new ArrayList(l48.r(arrayList, 10));
                int size3 = arrayList.size();
                while (i2 < size3) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    arrayList4.add(new ipc.c((BetHistoryItem) obj4));
                }
                arrayListI0 = CollectionsKt.i0(kotlin.collections.a.c(ipc.a.a), arrayList4);
            }
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            a aVar = new a(this.e, arrayListI0, null);
            this.a = 1;
            if (ej5.d(wclVar, aVar, this) == y5bVar) {
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
