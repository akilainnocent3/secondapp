package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class tbw extends j8i0 {
    public final v340 A;
    public final wwd0 B;
    public final v340 C;
    public final wwd0 D;
    public final v340 E;
    public final wwd0 F;
    public final v340 G;
    public final z8k a;
    public final a9k b;
    public final wwd0 c;
    public final v340 d;
    public final wwd0 e;
    public final v340 f;
    public final wwd0 i;
    public final v340 v;
    public final wwd0 w;
    public final v340 y;
    public final wwd0 z;

    @c0d(c = "com.sportygames.multilevel.common.viewmodel.MultiLevelLevelConfigViewModel$fetchLevelConfig$1", f = "MultiLevelLevelConfigViewModel.kt", l = {66}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tbw.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tbw tbwVar = tbw.this;
            wwd0 wwd0Var = tbwVar.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0Var.setValue(y6s.c.a);
                z8k z8kVar = tbwVar.a;
                this.a = 1;
                sbw sbwVar = z8kVar.a;
                obj = ej5.d(sbwVar.a, new a52(new qbw(sbwVar, null), null), this);
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
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                HTTPResponse hTTPResponse = (HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue();
                Integer bizCode = hTTPResponse.getBizCode();
                if (bizCode != null && bizCode.intValue() == 10000) {
                    List list = (List) hTTPResponse.getData();
                    if (list == null) {
                        list = m2g.a;
                    }
                    y6s.d dVar = new y6s.d(list);
                    wwd0Var.getClass();
                    wwd0Var.k(null, dVar);
                } else {
                    y6s.a aVar = new y6s.a(hTTPResponse.getMessage());
                    wwd0Var.getClass();
                    wwd0Var.k(null, aVar);
                }
            } else if (resultWrapper instanceof ResultWrapper.GenericError) {
                HTTPResponse<Object> error = ((ResultWrapper.GenericError) resultWrapper).getError();
                y6s.a aVar2 = new y6s.a(error != null ? error.getMessage() : null);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar2);
            } else {
                if (!Intrinsics.g(resultWrapper, ResultWrapper.NetworkError.INSTANCE)) {
                    uhc.a();
                    return null;
                }
                y6s.a aVar3 = new y6s.a(null);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar3);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.multilevel.common.viewmodel.MultiLevelLevelConfigViewModel$fetchUserLevelProgress$1", f = "MultiLevelLevelConfigViewModel.kt", l = {94}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tbw.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tbw tbwVar = tbw.this;
            wwd0 wwd0Var = tbwVar.e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0Var.setValue(jph0.c.a);
                a9k a9kVar = tbwVar.b;
                this.a = 1;
                sbw sbwVar = a9kVar.a;
                obj = ej5.d(sbwVar.a, new a52(new rbw(sbwVar, null), null), this);
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
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                HTTPResponse hTTPResponse = (HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue();
                Integer bizCode = hTTPResponse.getBizCode();
                if (bizCode != null && bizCode.intValue() == 10000) {
                    UserLevelProgressDto userLevelProgressDto = (UserLevelProgressDto) hTTPResponse.getData();
                    if (userLevelProgressDto != null) {
                        jph0.d dVar = new jph0.d(userLevelProgressDto);
                        wwd0Var.getClass();
                        wwd0Var.k(null, dVar);
                    } else {
                        jph0.a aVar = new jph0.a(hTTPResponse.getMessage());
                        wwd0Var.getClass();
                        wwd0Var.k(null, aVar);
                    }
                } else {
                    jph0.a aVar2 = new jph0.a(hTTPResponse.getMessage());
                    wwd0Var.getClass();
                    wwd0Var.k(null, aVar2);
                }
            } else if (resultWrapper instanceof ResultWrapper.GenericError) {
                HTTPResponse<Object> error = ((ResultWrapper.GenericError) resultWrapper).getError();
                jph0.a aVar3 = new jph0.a(error != null ? error.getMessage() : null);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar3);
            } else {
                if (!Intrinsics.g(resultWrapper, ResultWrapper.NetworkError.INSTANCE)) {
                    uhc.a();
                    return null;
                }
                jph0.a aVar4 = new jph0.a(null);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar4);
            }
            return Unit.a;
        }
    }

    public tbw(z8k z8kVar, a9k a9kVar) {
        this.a = z8kVar;
        this.b = a9kVar;
        wwd0 wwd0VarA = xwd0.a(y6s.b.a);
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(jph0.b.a);
        this.e = wwd0VarA2;
        this.f = e1i.b(wwd0VarA2);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.i = wwd0VarA3;
        this.v = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(bool);
        this.w = wwd0VarA4;
        this.y = e1i.b(wwd0VarA4);
        wwd0 wwd0VarA5 = xwd0.a(m2g.a);
        this.z = wwd0VarA5;
        this.A = e1i.b(wwd0VarA5);
        wwd0 wwd0VarA6 = xwd0.a("");
        this.B = wwd0VarA6;
        this.C = e1i.b(wwd0VarA6);
        wwd0 wwd0VarA7 = xwd0.a(bool);
        this.D = wwd0VarA7;
        this.E = e1i.b(wwd0VarA7);
        wwd0 wwd0VarA8 = xwd0.a(bool);
        this.F = wwd0VarA8;
        this.G = e1i.b(wwd0VarA8);
    }

    public final void A1() {
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var = this.D;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        wwd0 wwd0Var2 = this.F;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool);
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public final void z1(boolean z) {
        osa0.a(z, this.F, null);
        Boolean bool = Boolean.TRUE;
        wwd0 wwd0Var = this.D;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }
}
