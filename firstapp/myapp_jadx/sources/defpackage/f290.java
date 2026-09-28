package defpackage;

import android.content.res.Configuration;
import com.appsflyer.internal.m;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.sharewin.ShareWinData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf290;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f290 extends ihb0 {
    public final ku90<r190> A;
    public final t340 B;
    public final ku90<String> C;
    public final t340 D;
    public final b390 E;
    public final t340 F;
    public final wwd0 G;
    public final wwd0 H;
    public final b390 I;
    public final g3z d;
    public final h940 e;
    public final eb90 f;
    public final iym i;
    public final wwd0 v;
    public final v340 w;
    public final wwd0 y;
    public final v340 z;

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$1", f = "ShareWinViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ f290 b;

        /* JADX INFO: renamed from: f290$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$1$1$1", f = "ShareWinViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0544a extends tje0 implements gaj<String, String, v1b<? super String>, Object> {
            public /* synthetic */ String a;
            public /* synthetic */ String b;

            @Override // defpackage.gaj
            public final Object invoke(String str, String str2, v1b<? super String> v1bVar) {
                C0544a c0544a = new C0544a(3, v1bVar);
                c0544a.a = str;
                c0544a.b = str2;
                return c0544a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String str = this.a;
                String str2 = this.b;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return str + str2;
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ f290 a;

            public b(f290 f290Var) {
                this.a = f290Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.E.a(new y190.c((String) obj));
                return Unit.a;
            }
        }

        @c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ShareWinViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super String>, Unit, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object c;
            public final /* synthetic */ f290 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v1b v1bVar, f290 f290Var) {
                super(3, v1bVar);
                this.d = f290Var;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super String> myhVar, Unit unit, v1b<? super Unit> v1bVar) {
                c cVar = new c(v1bVar, this.d);
                cVar.b = myhVar;
                cVar.c = unit;
                return cVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    f290 f290Var = this.d;
                    i0i i0iVar = new i0i(new n1i(new f1i(f290Var.G), new f1i(f290Var.H), new C0544a(3, null)));
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (kzh.c(myhVar, i0iVar, this) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, f290 f290Var) {
            super(2, v1bVar);
            this.b = f290Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b);
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
                f290 f290Var = this.b;
                b77 b77VarF = r0i.f(f290Var.I, new c(null, f290Var));
                b bVar = new b(f290Var);
                this.a = 1;
                if (b77VarF.collect(bVar, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f290(g3z g3zVar, h940 h940Var, eb90 eb90Var, iym iymVar) {
        super(0);
        g3zVar.getClass();
        h940Var.getClass();
        iymVar.getClass();
        this.d = g3zVar;
        this.e = h940Var;
        this.f = eb90Var;
        this.i = iymVar;
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.v = wwd0VarA;
        this.w = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.y = wwd0VarA2;
        this.z = e1i.b(wwd0VarA2);
        ku90<r190> ku90Var = new ku90<>();
        this.A = ku90Var;
        this.B = e1i.a(ku90Var);
        ku90<String> ku90Var2 = new ku90<>();
        this.C = ku90Var2;
        this.D = e1i.a(ku90Var2);
        pb5 pb5Var = pb5.b;
        b390 b390VarA = d390.a(0, 1, pb5Var);
        this.E = b390VarA;
        this.F = e1i.a(b390VarA);
        this.G = xwd0.a(null);
        this.H = xwd0.a(null);
        this.I = d390.a(0, 1, pb5Var);
        ej5.c(o8i0.d(this), null, null, new a(null, this), 3);
    }

    public final void A1(String str, boolean z) {
        str.getClass();
        ema emaVarY1 = y1();
        ct90<BaseResponse<ShareWinData>> ct90VarB = this.d.n(str, z).d(wm70.c).b(va0.a());
        final a290 a290Var = new a290(this);
        pya pyaVar = new pya() { // from class: b290
            @Override // defpackage.pya
            public final void accept(Object obj) {
                a290Var.invoke(obj);
            }
        };
        final x6w x6wVar = new x6w(this, 2);
        rya ryaVar = new rya(pyaVar, new pya() { // from class: c290
            @Override // defpackage.pya
            public final void accept(Object obj) {
                x6wVar.invoke(obj);
            }
        });
        ct90VarB.a(ryaVar);
        emaVarY1.b(ryaVar);
    }

    public final ct90<z190> B1(String str, MultipartBody.Part part, boolean z) {
        str.getClass();
        part.getClass();
        ct90<BaseResponse<ShareWinData>> ct90VarB = this.d.o(str, part, z).d(wm70.c).b(va0.a());
        final v64 v64Var = new v64(1);
        return new av90(new xu90(ct90VarB, new faj() { // from class: d290
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                obj.getClass();
                return (z190) v64Var.invoke(obj);
            }
        }), new e290());
    }

    @Override // defpackage.ihb0, defpackage.j8i0
    public final void onCleared() {
        this.e.x();
        super.onCleared();
    }

    public final void z1(String str, Configuration configuration, String str2, String str3, x9h x9hVar) {
        q190 q190Var = q190.a;
        m.a(str, str2, str3);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var = this.v;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        this.G.setValue(null);
        this.H.setValue(null);
        ej5.c(o8i0.d(this), null, null, new j290(this, str, configuration, str2, str3, x9hVar, null), 3);
    }
}
