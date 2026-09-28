package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool$downloadAllSoundFiles$2", f = "SGSoundPool.kt", l = {428}, m = "invokeSuspend", v = 1)
public final class uk60 extends tje0 implements Function2<v5b, v1b<? super List<? extends rk60.a>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rk60 c;

    @c0d(c = "com.sportygames.commons.utils.SGSoundPool$downloadAllSoundFiles$2$deferred$2$1", f = "SGSoundPool.kt", l = {425}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super rk60.a>, Object> {
        public int a;
        public final /* synthetic */ rk60 b;
        public final /* synthetic */ Pair<String, rk60.a> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rk60 rk60Var, Pair pair, v1b v1bVar) {
            super(2, v1bVar);
            this.b = rk60Var;
            this.c = pair;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super rk60.a> v1bVar) {
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
            rk60.a aVar = this.c.b;
            this.a = 1;
            HashMap<String, rk60.b> map = rk60.n;
            Object objA = this.b.a(aVar, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk60(rk60 rk60Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = rk60Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uk60 uk60Var = new uk60(this.c, v1bVar);
        uk60Var.b = obj;
        return uk60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends rk60.a>> v1bVar) {
        return ((uk60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        rk60 rk60Var = this.c;
        List listN = mpu.n(rk60Var.c);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listN) {
            if (!((rk60.a) ((Pair) obj2).b).c) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            arrayList2.add(ej5.a(v5bVar, null, new a(rk60Var, (Pair) obj3, null), 3));
        }
        this.b = null;
        this.a = 1;
        Object objA = up1.a(arrayList2, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
