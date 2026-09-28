package defpackage;

import android.util.Range;
import com.sporty.android.core.model.multimaker.MultiMakerConstKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class ejw implements lyh<Unit> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ tjw b;

    @c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$registerUiStates$$inlined$combine$2", f = "MultiMakerViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ejw.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[4];
        }
    }

    @c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$registerUiStates$$inlined$combine$2$3", f = "MultiMakerViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super Unit>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ tjw d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, tjw tjwVar) {
            super(3, v1bVar);
            this.d = tjwVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Unit> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v11, types: [m2g] */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ?? arrayList;
            Object value;
            kiw kiwVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Object obj3 = objArr[1];
                if (!(obj3 instanceof Range)) {
                    obj3 = null;
                }
                Range<Float> defaultTotalOddsBoundary = (Range) obj3;
                if (defaultTotalOddsBoundary == null) {
                    defaultTotalOddsBoundary = MultiMakerConstKt.getDefaultTotalOddsBoundary();
                }
                Range<Float> range = defaultTotalOddsBoundary;
                Object obj4 = objArr[2];
                obj4.getClass();
                mhw mhwVar = (mhw) obj4;
                Object obj5 = objArr[3];
                List list = obj5 instanceof List ? (List) obj5 : null;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj6 : list) {
                        if (obj6 instanceof Pair) {
                            arrayList.add(obj6);
                        }
                    }
                } else {
                    arrayList = m2g.a;
                }
                wwd0 wwd0Var = this.d.g0;
                lhw lhwVarC1 = tjw.C1(arrayList, mhw.a);
                lhw lhwVarC2 = tjw.C1(arrayList, mhw.b);
                Range<Float> selectionOddsSeekBarProgressBoundary = MultiMakerConstKt.getSelectionOddsSeekBarProgressBoundary();
                Range<Float> defaultSelectionOddsBoundary = MultiMakerConstKt.getDefaultSelectionOddsBoundary();
                wwd0Var.getClass();
                selectionOddsSeekBarProgressBoundary.getClass();
                defaultSelectionOddsBoundary.getClass();
                range.getClass();
                do {
                    value = wwd0Var.getValue();
                    kiwVar = (kiw) value;
                } while (!wwd0Var.g(value, kiw.a(kiwVar, null, null, liw.c(kiwVar.c, zBooleanValue, mhwVar, lhwVarC1, lhwVarC2, selectionOddsSeekBarProgressBoundary, defaultSelectionOddsBoundary, range), null, null, 0, false, false, false, false, 1019)));
                Unit unit = Unit.a;
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(unit, this) == y5bVar) {
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

    public ejw(lyh[] lyhVarArr, tjw tjwVar) {
        this.a = lyhVarArr;
        this.b = tjwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
