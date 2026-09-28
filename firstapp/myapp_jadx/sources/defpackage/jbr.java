package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$6", f = "LNSearchViewModel.kt", l = {220}, m = "invokeSuspend", v = 2)
public final class jbr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xbr b;

    @c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$6$1", f = "LNSearchViewModel.kt", l = {227}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public xbr a;
        public Iterator b;
        public int c;
        public final /* synthetic */ xbr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xbr xbrVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = xbrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            xbr xbrVar;
            y5b y5bVar = y5b.a;
            int i = this.c;
            if (i == 0) {
                uj50.b(obj);
                xbr xbrVar2 = this.d;
                Map map = (Map) xbrVar2.A.a.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    lk50 lk50Var = (lk50) entry.getValue();
                    if (lk50Var instanceof lk50.a) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    } else if (!Intrinsics.g(lk50Var, lk50.b.a) && !(lk50Var instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                }
                it = linkedHashMap.entrySet().iterator();
                xbrVar = xbrVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = this.b;
                xbrVar = this.a;
                uj50.b(obj);
            }
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                ku90<String> ku90Var = xbrVar.y;
                Object key = entry2.getKey();
                this.a = xbrVar;
                this.b = it;
                this.c = 1;
                if (ku90Var.a.emit(key, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbr(xbr xbrVar, v1b<? super jbr> v1bVar) {
        super(2, v1bVar);
        this.b = xbrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jbr(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jbr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xbr xbrVar = this.b;
            v340 v340Var = xbrVar.i;
            a aVar = new a(xbrVar, null);
            this.a = 1;
            if (kzh.b(v340Var, aVar, this) == y5bVar) {
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
