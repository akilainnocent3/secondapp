package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.util.SportyBetImagePreloader$preloadGifResources$results$1", f = "SportyBetImagePreloader.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class sib0 extends tje0 implements Function2<v5b, v1b<? super List<? extends Boolean>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<su6> c;
    public final /* synthetic */ wib0 d;

    @c0d(c = "com.sporty.android.compose.ui.util.SportyBetImagePreloader$preloadGifResources$results$1$1$1", f = "SportyBetImagePreloader.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public final /* synthetic */ wib0 a;
        public final /* synthetic */ su6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wib0 wib0Var, su6 su6Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = wib0Var;
            this.b = su6Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            su6 su6Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = false;
            try {
                wib0 wib0Var = this.a;
                m9n m9nVar = wib0Var.b;
                Context context = wib0Var.a;
                String url = su6Var.getUrl();
                url.getClass();
                gan.d(m9nVar, context, url, false);
                itf0.a aVar = itf0.a;
                aVar.q("ImagePreloader");
                aVar.a("Preloaded GIF: " + su6Var.getUrl(), new Object[0]);
                z = true;
            } catch (Exception e) {
                itf0.a aVar2 = itf0.a;
                aVar2.q("ImagePreloader");
                aVar2.f(e, inm.a("Failed to preload GIF: ", su6Var.getUrl()), new Object[0]);
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sib0(List<? extends su6> list, wib0 wib0Var, v1b<? super sib0> v1bVar) {
        super(2, v1bVar);
        this.c = list;
        this.d = wib0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sib0 sib0Var = new sib0(this.c, this.d, v1bVar);
        sib0Var.b = obj;
        return sib0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends Boolean>> v1bVar) {
        return ((sib0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
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
        List<su6> list = this.c;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (su6 su6Var : list) {
            wib0 wib0Var = this.d;
            arrayList.add(ej5.a(v5bVar, wib0Var.c, new a(wib0Var, su6Var, null), 2));
        }
        this.b = null;
        this.a = 1;
        Object objA = up1.a(arrayList, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
