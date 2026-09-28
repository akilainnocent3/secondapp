package defpackage;

import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.fruithunt.network.models.FHBetHistoryItem;
import com.sportygames.fruithunt.network.models.FHPlaceBetResponse;
import com.sportygames.fruithunt.network.models.FHUserDataResponse;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo8j;", "Lt3j;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o8j extends t3j {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public final wwd0 D;
    public final v340 E;
    public String F;
    public final wwd0 G;
    public final wwd0 H;
    public final v340 I;
    public final v340 J;
    public final wwd0 K;
    public final wwd0 L;
    public final wwd0 M;
    public final wwd0 N;
    public final wwd0 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final ssw<LoadingState<HTTPResponse<FHPlaceBetResponse>>> R;
    public final ssw<PagingState> S;
    public final ssw<LoadingState<HTTPResponse<List<FHBetHistoryItem>>>> T;
    public final ssw<LoadingState<HTTPResponse<FHUserDataResponse>>> U;
    public boolean V;
    public DetailResponse W;
    public final wwd0 X;
    public final wwd0 Y;
    public final wwd0 y;
    public final wwd0 z;

    public static final class a {
        public final double a;
        public final double b;

        public a(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ffp.a(this.a, "Range(lower=", ", upper=");
            sbA.append(this.b);
            sbA.append(")");
            return sbA.toString();
        }
    }

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$apiCallBetHistory$1", f = "FruitHuntViewModel.kt", l = {210}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return o8j.this.new b(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objD;
            o8j o8jVar = o8j.this;
            ssw<LoadingState<HTTPResponse<List<FHBetHistoryItem>>>> sswVar = o8jVar.T;
            y5b y5bVar = y5b.a;
            int i = this.a;
            int i2 = this.d;
            int i3 = this.c;
            if (i == 0) {
                uj50.b(obj);
                r5h r5hVar = o8jVar.c;
                this.a = 1;
                r5hVar.getClass();
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new a52(new j5h(i3, i2, null), null), this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objD = obj;
            }
            ResultWrapper resultWrapper = (ResultWrapper) objD;
            if (resultWrapper instanceof ResultWrapper.Success) {
                o8jVar.S.j(new PagingState(i3, i2, PagingFetchType.VIEW_MORE));
                sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 28, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 22, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 26, null));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$chipRange$1", f = "FruitHuntViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements gaj<Double, a, v1b<? super a>, Object> {
        public /* synthetic */ double a;
        public /* synthetic */ a b;

        @Override // defpackage.gaj
        public final Object invoke(Double d, a aVar, v1b<? super a> v1bVar) {
            double dDoubleValue = d.doubleValue();
            c cVar = new c(3, v1bVar);
            cVar.a = dDoubleValue;
            cVar.b = aVar;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            double d = this.a;
            a aVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            double d2 = aVar.a;
            double d3 = aVar.b;
            if (d > d3) {
                d = d3;
            }
            return new a(d2, d);
        }
    }

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$chipsState$1", f = "FruitHuntViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements kaj<Boolean, String, a, Double, qcn<? extends mk2>, v1b<? super d4j>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ String b;
        public /* synthetic */ a c;
        public /* synthetic */ double d;
        public /* synthetic */ qcn e;

        public d(v1b<? super d> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(Boolean bool, String str, a aVar, Double d, qcn<? extends mk2> qcnVar, v1b<? super d4j> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            double dDoubleValue = d.doubleValue();
            d dVar = new d(v1bVar);
            dVar.a = zBooleanValue;
            dVar.b = str;
            dVar.c = aVar;
            dVar.d = dDoubleValue;
            dVar.e = qcnVar;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            String str = this.b;
            a aVar = this.c;
            double d = this.d;
            qcn qcnVar = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new d4j(z, d, qcnVar, aVar.a, aVar.b, str);
        }
    }

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$uiChangeKnifeAngle$1", f = "FruitHuntViewModel.kt", l = {85}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o8j b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, v1b v1bVar, o8j o8jVar) {
            super(2, v1bVar);
            this.b = o8jVar;
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.c, v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.b.K;
                Integer num = new Integer(this.c);
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, num);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$uiChangeSliderState$1", f = "FruitHuntViewModel.kt", l = {129}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o8j b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, v1b v1bVar, o8j o8jVar) {
            super(2, v1bVar);
            this.b = o8jVar;
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(this.c, v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.b.O;
                Integer num = new Integer(this.c);
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, num);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$uiOnKnifeMoved$1", f = "FruitHuntViewModel.kt", l = {95, 98, 104, 106, 110, 111, 118}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ o8j c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, v1b v1bVar, o8j o8jVar) {
            super(2, v1bVar);
            this.b = i;
            this.c = o8jVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new g(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0072  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        
            if (kotlin.Unit.a == r4) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (kotlin.Unit.a == r4) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
        
            if (kotlin.Unit.a == r4) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
        
            if (kotlin.Unit.a == r4) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
        
            if (kotlin.Unit.a == r4) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
        
            if (kotlin.Unit.a == r4) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
        
            if (kotlin.Unit.a == r4) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
        
            return r4;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o8j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o8j() {
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.y = wwd0VarA;
        this.z = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new a(0.0d, 0.0d));
        this.A = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(Boolean.TRUE);
        this.B = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a("");
        this.C = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(null);
        this.D = wwd0VarA5;
        v340 v340VarB = e1i.b(wwd0VarA5);
        this.E = v340VarB;
        wwd0 wwd0VarA6 = xwd0.a(Double.valueOf(1.0d));
        this.G = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(n1a0.c);
        this.H = wwd0VarA7;
        v340 v340VarB2 = e1i.b(wwd0VarA6);
        this.I = v340VarB2;
        n1i n1iVar = new n1i(new f1i(v340VarB), wwd0VarA2, new c(3, null));
        et7 et7VarD = o8i0.d(this);
        a aVar = new a(0.0d, 0.0d);
        kwd0 kwd0Var = q490.a.a;
        this.J = e1i.e(r1i.c(wwd0VarA3, wwd0VarA4, e1i.e(n1iVar, et7VarD, kwd0Var, aVar), v340VarB2, wwd0VarA7, new d(null)), o8i0.d(this), kwd0Var, new d4j(0));
        wwd0 wwd0VarA8 = xwd0.a(2);
        this.K = wwd0VarA8;
        this.L = wwd0VarA8;
        wwd0 wwd0VarA9 = xwd0.a(khp.a);
        this.M = wwd0VarA9;
        this.N = wwd0VarA9;
        this.O = xwd0.a(0);
        wwd0 wwd0VarA10 = xwd0.a(null);
        this.P = wwd0VarA10;
        this.Q = wwd0VarA10;
        this.R = new ssw<>();
        this.S = new ssw<>();
        this.T = new ssw<>();
        this.U = new ssw<>();
        this.V = true;
        this.W = new DetailResponse(1.0d, new ArrayList(), 0.0d, 0.0d);
        wwd0 wwd0VarA11 = xwd0.a(null);
        this.X = wwd0VarA11;
        this.Y = wwd0VarA11;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final boolean A1() {
        boolean z;
        wwd0 wwd0Var = this.G;
        double dDoubleValue = ((Number) wwd0Var.getValue()).doubleValue();
        double minAmount = this.W.getMinAmount();
        v340 v340Var = this.E;
        if (dDoubleValue >= minAmount) {
            double dDoubleValue2 = ((Number) wwd0Var.getValue()).doubleValue();
            Double d2 = (Double) v340Var.a.getValue();
            if (dDoubleValue2 <= (d2 != null ? d2.doubleValue() : 0.0d)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z && v340Var.a.getValue() != null && ((Boolean) this.z.getValue()).booleanValue()) {
            D1(3);
        }
        return z;
    }

    public final void B1(int i) {
        wwd0 wwd0Var = this.N;
        if (wwd0Var.getValue() == khp.b || wwd0Var.getValue() == khp.f || wwd0Var.getValue() == khp.a) {
            ej5.c(o8i0.d(this), null, null, new e(i, null, this), 3);
        }
    }

    public final void C1(int i) {
        ej5.c(o8i0.d(this), null, null, new f(i, null, this), 3);
    }

    public final void D1(int i) {
        ej5.c(o8i0.d(this), null, null, new g(i, null, this), 3);
    }

    public final void z1(int i, int i2) {
        this.T.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
        ej5.c(o8i0.d(this), null, null, new b(i, i2, null), 3);
    }
}
