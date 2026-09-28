package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.FlexCalculateUtils$computeROutOfNAsync$2", f = "FlexCalculateUtils.kt", l = {88}, m = "invokeSuspend", v = 2)
public final class xuh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ List<Double> e;
    public final /* synthetic */ ConcurrentHashMap<String, Double> f;
    public final /* synthetic */ LinkedHashMap i;

    @c0d(c = "com.sportybet.android.instantwin.utils.FlexCalculateUtils$computeROutOfNAsync$2$1$1", f = "FlexCalculateUtils.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Pair<? extends Integer, ? extends Double>>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ List<Double> d;
        public final /* synthetic */ ConcurrentHashMap<String, Double> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, List<Double> list, ConcurrentHashMap<String, Double> concurrentHashMap, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = i;
            this.c = i2;
            this.d = list;
            this.e = concurrentHashMap;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Pair<? extends Integer, ? extends Double>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            int i2 = this.c;
            if (i == 0) {
                uj50.b(obj);
                zuh zuhVar = zuh.a;
                yc80 yc80Var = new yc80(new yuh(i2, this.b, null));
                this.a = 1;
                obj = w5b.d(new vuh(yc80Var, this.e, this.d, null), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return new Pair(new Integer(i2), new Double(((Number) obj).doubleValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuh(int i, int i2, List list, ConcurrentHashMap concurrentHashMap, LinkedHashMap linkedHashMap, v1b v1bVar) {
        super(2, v1bVar);
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = concurrentHashMap;
        this.i = linkedHashMap;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xuh xuhVar = new xuh(this.c, this.d, this.e, this.f, this.i, v1bVar);
        xuhVar.b = obj;
        return xuhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xuh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            IntRange intRange = new IntRange(this.c, this.d, 1);
            ArrayList arrayList = new ArrayList(l48.r(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (((mwo) it).c) {
                arrayList.add(ej5.a(v5bVar, zuh.b, new a(this.d, ((zvo) it).nextInt(), this.e, this.f, null), 2));
            }
            this.b = null;
            this.a = 1;
            obj = up1.a(arrayList, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        for (Pair pair : (Iterable) obj) {
            int iIntValue = ((Number) pair.a).intValue();
            double dDoubleValue = ((Number) pair.b).doubleValue();
            this.i.put(new Integer(iIntValue), new Double(dDoubleValue));
        }
        return Unit.a;
    }
}
