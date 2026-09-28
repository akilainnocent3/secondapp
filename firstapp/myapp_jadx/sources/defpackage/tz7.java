package defpackage;

import com.sporty.android.core.model.recentcode.RecentShareCodeItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$observeTimer$1", f = "CodeHubViewmodel.kt", l = {522}, m = "invokeSuspend", v = 2)
public final class tz7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mz7 b;
    public final /* synthetic */ List<ji40> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ mz7 a;
        public final /* synthetic */ List<ji40> b;

        public a(mz7 mz7Var, List<ji40> list) {
            this.a = mz7Var;
            this.b = list;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            wwd0 wwd0Var = this.a.M;
            List<ji40> list = this.b;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (ji40 ji40Var : list) {
                li40 li40VarA = ji40.a.a(ji40Var.a);
                RecentShareCodeItem recentShareCodeItem = ji40Var.a;
                li40VarA.getClass();
                arrayList.add(new ji40(recentShareCodeItem, li40VarA));
            }
            bh40.c cVar = new bh40.c(arrayList);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz7(mz7 mz7Var, List<ji40> list, v1b<? super tz7> v1bVar) {
        super(2, v1bVar);
        this.b = mz7Var;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tz7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tz7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mz7 mz7Var = this.b;
            or60 or60Var = mz7Var.S;
            a aVar = new a(mz7Var, this.c);
            this.a = 1;
            if (or60Var.collect(aVar, this) == y5bVar) {
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
