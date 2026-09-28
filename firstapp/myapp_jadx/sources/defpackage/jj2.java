package defpackage;

import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.Selection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$calculateOdds$5", f = "BetBuilderViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jj2 extends tje0 implements gaj<myh<? super BetBuilderData>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ fj2 a;
    public final /* synthetic */ ArrayList b;

    @c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$calculateOdds$5$1", f = "BetBuilderViewModel.kt", l = {163}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ fj2 b;
        public final /* synthetic */ ArrayList c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fj2 fj2Var, ArrayList arrayList, v1b v1bVar) {
            super(2, v1bVar);
            this.b = fj2Var;
            this.c = arrayList;
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
                if (hkd.b(500L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fj2 fj2Var = this.b;
            HashMap<List<Selection>, Function0<Unit>> map = fj2Var.F;
            HashMap<List<Selection>, Function0<Unit>> map2 = fj2Var.F;
            map.remove(this.c);
            if (!map2.isEmpty()) {
                Set<Map.Entry<List<Selection>, Function0<Unit>>> setEntrySet = map2.entrySet();
                setEntrySet.getClass();
                ((Function0) ((Map.Entry) CollectionsKt.S(setEntrySet)).getValue()).invoke();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj2(fj2 fj2Var, ArrayList arrayList, v1b v1bVar) {
        super(3, v1bVar);
        this.a = fj2Var;
        this.b = arrayList;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BetBuilderData> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new jj2(this.a, this.b, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        fj2 fj2Var = this.a;
        ej5.c(o8i0.d(fj2Var), null, null, new a(fj2Var, this.b, null), 3);
        return Unit.a;
    }
}
