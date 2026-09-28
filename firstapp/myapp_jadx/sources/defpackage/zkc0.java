package defpackage;

import android.net.Uri;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zkc0 implements ykc0 {
    public final br5 a;
    public final j1b b;
    public jvd0 c;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.SportyLegendsSettlementClipsPreCacheHelperImpl$preCache$1", f = "SportyLegendsSettlementClipsPreCacheHelperImpl.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: zkc0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.data.repository.SportyLegendsSettlementClipsPreCacheHelperImpl$preCache$1$1", f = "SportyLegendsSettlementClipsPreCacheHelperImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1397a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ zkc0 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1397a(zkc0 zkc0Var, v1b<? super C1397a> v1bVar) {
                super(2, v1bVar);
                this.a = zkc0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1397a(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1397a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                gr5.a aVar = new gr5.a();
                zkc0 zkc0Var = this.a;
                br5 br5Var = zkc0Var.a;
                aVar.a = br5Var;
                aVar.c = new idd.a();
                ulc0.a.getClass();
                for (ulc0 ulc0Var : ulc0.a.a()) {
                    String strD = ulc0Var.d();
                    mbd mbdVarB = br5Var.b(strD);
                    mbdVarB.getClass();
                    if (xza.a(mbdVarB) != -1 && !zkc0Var.c(ulc0Var)) {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q("SLClipsPreCacheHelperImpl");
                        aVar2.n("Index inconsistency found for " + strD + ". Removing resource to force re-download.", new Object[0]);
                        br5Var.g(strD);
                    }
                    try {
                        Map map = Collections.EMPTY_MAP;
                        Uri uri = Uri.parse(strD);
                        ly0.h(uri, "The uri must be set.");
                        try {
                            gqc gqcVar = new gqc(uri, 0L, 1, null, map, 0L, -1L, strD, 0);
                            strD = strD;
                            new cs5(aVar.a(), gqcVar).a();
                            itf0.a aVar3 = itf0.a;
                            aVar3.q("SLClipsPreCacheHelperImpl");
                            aVar3.a("cache success: " + strD, new Object[0]);
                        } catch (Exception e) {
                            e = e;
                            strD = strD;
                            itf0.a aVar4 = itf0.a;
                            aVar4.f(e, yv0.a(aVar4, "SLClipsPreCacheHelperImpl", "cache failed for url: ", strD), new Object[0]);
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                itf0.a aVar5 = itf0.a;
                aVar5.q("SLClipsPreCacheHelperImpl");
                aVar5.a("Preload complete", new Object[0]);
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zkc0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    C1397a c1397a = new C1397a(zkc0.this, null);
                    this.a = 1;
                    if (vxf0.b(200000L, c1397a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q("SLClipsPreCacheHelperImpl");
                aVar.f(e, "Preload failed or timed out", new Object[0]);
            }
            return Unit.a;
        }
    }

    public zkc0(br5 br5Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = br5Var;
        this.b = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar));
    }

    @Override // defpackage.ykc0
    public final void a() {
        jvd0 jvd0Var = this.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.c = ej5.c(this.b, null, null, new a(null), 3);
    }

    @Override // defpackage.ykc0
    public final br5 b() {
        return this.a;
    }

    @Override // defpackage.ykc0
    public final boolean c(ulc0 ulc0Var) {
        File file;
        ulc0Var.getClass();
        String strD = ulc0Var.d();
        br5 br5Var = this.a;
        mbd mbdVarB = br5Var.b(strD);
        mbdVarB.getClass();
        long jA = xza.a(mbdVarB);
        if (jA == -1) {
            return false;
        }
        long j = 0;
        if (jA <= 0) {
            return false;
        }
        Iterator it = br5Var.j(strD).iterator();
        it.getClass();
        while (it.hasNext()) {
            xr5 xr5Var = (xr5) it.next();
            if (xr5Var.d && (file = xr5Var.e) != null && file.exists()) {
                j += xr5Var.c;
            }
        }
        return j >= jA;
    }

    @Override // defpackage.ykc0
    public final boolean d() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ulc0.a.getClass();
        List<ulc0> list = ulc0.a.b;
        if (list != null && list.isEmpty()) {
            z = true;
            break;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            if (!c((ulc0) it.next())) {
                z = false;
                break;
            }
        }
        ulc0.a.getClass();
        ArrayList arrayList = ulc0.a.d;
        if (arrayList != null && arrayList.isEmpty()) {
            z2 = false;
            break;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z2 = false;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            if (c((ulc0) obj)) {
                z2 = true;
                break;
            }
        }
        ulc0.a.getClass();
        ArrayList arrayList2 = ulc0.a.e;
        if (arrayList2 != null && arrayList2.isEmpty()) {
            z3 = false;
            break;
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z3 = false;
                break;
            }
            Object obj2 = arrayList2.get(i2);
            i2++;
            if (c((ulc0) obj2)) {
                z3 = true;
                break;
            }
        }
        ulc0.a.getClass();
        ArrayList arrayList3 = ulc0.a.f;
        if (arrayList3 != null && arrayList3.isEmpty()) {
            z4 = false;
            break;
        }
        int size3 = arrayList3.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                z4 = false;
                break;
            }
            Object obj3 = arrayList3.get(i3);
            i3++;
            if (c((ulc0) obj3)) {
                z4 = true;
                break;
            }
        }
        ulc0.a.getClass();
        ArrayList arrayList4 = ulc0.a.g;
        if (arrayList4 != null && arrayList4.isEmpty()) {
            z5 = false;
            break;
        }
        int size4 = arrayList4.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size4) {
                z5 = false;
                break;
            }
            Object obj4 = arrayList4.get(i4);
            i4++;
            if (c((ulc0) obj4)) {
                z5 = true;
                break;
            }
        }
        ulc0.a.getClass();
        ArrayList arrayList5 = ulc0.a.h;
        if (arrayList5 != null && arrayList5.isEmpty()) {
            z6 = false;
            break;
        }
        int size5 = arrayList5.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size5) {
                z6 = false;
                break;
            }
            Object obj5 = arrayList5.get(i5);
            i5++;
            if (c((ulc0) obj5)) {
                z6 = true;
                break;
            }
        }
        ulc0.a.getClass();
        ArrayList arrayList6 = ulc0.a.i;
        if (arrayList6 != null && arrayList6.isEmpty()) {
            z7 = false;
            break;
        }
        int size6 = arrayList6.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size6) {
                z7 = false;
                break;
            }
            Object obj6 = arrayList6.get(i6);
            i6++;
            if (c((ulc0) obj6)) {
                z7 = true;
                break;
            }
        }
        ulc0.a.getClass();
        ArrayList arrayList7 = ulc0.a.j;
        if (arrayList7 != null && arrayList7.isEmpty()) {
            z8 = false;
            break;
        }
        int size7 = arrayList7.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size7) {
                z8 = false;
                break;
            }
            Object obj7 = arrayList7.get(i7);
            i7++;
            if (c((ulc0) obj7)) {
                z8 = true;
                break;
            }
        }
        ulc0.a.getClass();
        ArrayList arrayList8 = ulc0.a.k;
        if (arrayList8 != null && arrayList8.isEmpty()) {
            z9 = false;
            break;
        }
        int size8 = arrayList8.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size8) {
                z9 = false;
                break;
            }
            Object obj8 = arrayList8.get(i8);
            i8++;
            if (c((ulc0) obj8)) {
                z9 = true;
                break;
            }
        }
        return z && z2 && z3 && z4 && z5 && z6 && z7 && z8 && z9;
    }
}
