package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.environment.UrlConfigDataSource$observeRemoteChanges$2", f = "UrlConfigDataSource.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class vmh0 extends tje0 implements Function2<Map<CountryCodeName, ? extends f750>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zmh0 c;

    @c0d(c = "com.sportybet.core.environment.UrlConfigDataSource$observeRemoteChanges$2$1", f = "UrlConfigDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Map<CountryCodeName, f750> b;
        public final /* synthetic */ zmh0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<CountryCodeName, f750> map, zmh0 zmh0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = map;
            this.c = zmh0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((a) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i;
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Set<zn20.a<?>> setKeySet = jtwVar.a().keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (c.u(((zn20.a) next).a, "url_ovr_", false)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                jtwVar.f((zn20.a) obj2);
            }
            for (Map.Entry<CountryCodeName, f750> entry : this.b.entrySet()) {
                CountryCodeName key = entry.getKey();
                f750 value = entry.getValue();
                String lowerCase = key.getCode().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                jtwVar.h(new zn20.a<>("url_ovr_".concat(lowerCase)), this.c.c.toJson(value));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmh0(zmh0 zmh0Var, v1b<? super vmh0> v1bVar) {
        super(2, v1bVar);
        this.c = zmh0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vmh0 vmh0Var = new vmh0(this.c, v1bVar);
        vmh0Var.b = obj;
        return vmh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<CountryCodeName, ? extends f750> map, v1b<? super Unit> v1bVar) {
        return ((vmh0) create(map, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zmh0 zmh0Var = this.c;
            sqc<zn20> sqcVar = zmh0Var.b.a.a;
            a aVar = new a(map, zmh0Var, null);
            this.b = null;
            this.a = 1;
            if (do20.a(sqcVar, aVar, this) == y5bVar) {
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
