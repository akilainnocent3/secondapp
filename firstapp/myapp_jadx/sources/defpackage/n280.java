package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FirstSearchResult;
import com.sportybet.plugin.realsports.data.SearchHistoryPreference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln280;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n280 extends j8i0 {
    public r5b A;
    public jvd0 B;
    public jvd0 C;
    public jvd0 D;
    public final h940 a;
    public final xt70 b;
    public final ssw<lk50<FirstSearchResult>> c;
    public final ssw<lk50<List<Event>>> d;
    public final ssw<lk50<List<Event>>> e;
    public final ssw<lk50<BoostResult>> f;
    public final mpe0 i;
    public final mpe0 v;
    public final mpe0 w;
    public SearchHistoryPreference y;
    public r5b z;

    @c0d(c = "com.sportybet.plugin.realsports.search.SearchViewModel$updateSearchHistory$2", f = "SearchViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return n280.this.new a(v1bVar);
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
                n280 n280Var = n280.this;
                xt70 xt70Var = n280Var.b;
                String json = ((JsonSerializeService) n280Var.i.getValue()).toJson(n280Var.y);
                json.getClass();
                this.a = 1;
                if (xt70Var.a(json, this) == y5bVar) {
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

    public n280(h940 h940Var, xt70 xt70Var) {
        h940Var.getClass();
        xt70Var.getClass();
        this.a = h940Var;
        this.b = xt70Var;
        this.c = new ssw<>();
        this.d = new ssw<>();
        this.e = new ssw<>();
        this.f = new ssw<>();
        this.i = hwr.b(new m180());
        this.v = hwr.b(new vr30(1));
        this.w = hwr.b(new p180());
        this.y = new SearchHistoryPreference(null, 1, null);
    }

    public final Object x1(tje0 tje0Var) {
        return new yzh(new y180(this.a.b()), new z180(3, null)).collect(new a280(this), tje0Var);
    }

    public final void y1(String str) {
        List<String> searchList = this.y.getSearchList();
        if (str != null) {
            searchList.remove(str);
            if (searchList.size() >= 10) {
                searchList.remove(searchList.size() - 1);
            }
            searchList.add(0, str);
        } else {
            searchList.clear();
        }
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }
}
