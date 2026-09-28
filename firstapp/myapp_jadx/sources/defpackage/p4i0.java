package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp4i0;", "Lj8i0;", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p4i0 extends j8i0 {
    public final vu60 a;
    public final rgk b;
    public final wck c;
    public final z4i0 d;
    public final wwd0 e;
    public final v340 f;

    @c0d(c = "com.sportybet.feature.dedicatedteampage.article.presentation.viewmodel.VideoDetailViewModel$loadRecommendedVideos$1", f = "VideoDetailViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return p4i0.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object value;
            Object value2;
            p4i0 p4i0Var = p4i0.this;
            wwd0 wwd0Var = p4i0Var.e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wck wckVar = p4i0Var.c;
                this.a = 1;
                objA = wckVar.a(this.c, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            if (zi50.a(objA) == null) {
                List list = (List) objA;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, o4i0.a((o4i0) value2, false, null, null, false, false, a4h.f(list), false, 79)));
            } else {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, o4i0.a((o4i0) value, false, null, null, false, false, null, true, 47)));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.dedicatedteampage.article.presentation.viewmodel.VideoDetailViewModel$uiState$1", f = "VideoDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<o4i0, alc, v1b<? super o4i0>, Object> {
        public /* synthetic */ o4i0 a;
        public /* synthetic */ alc b;

        @Override // defpackage.gaj
        public final Object invoke(o4i0 o4i0Var, alc alcVar, v1b<? super o4i0> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = o4i0Var;
            bVar.b = alcVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            o4i0 o4i0Var = this.a;
            alc alcVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return o4i0.a(o4i0Var, false, null, alcVar, false, false, null, false, 123);
        }
    }

    public p4i0(vu60 vu60Var, rgk rgkVar, wck wckVar, z4i0 z4i0Var) {
        vu60Var.getClass();
        z4i0Var.getClass();
        this.a = vu60Var;
        this.b = rgkVar;
        this.c = wckVar;
        this.d = z4i0Var;
        wwd0 wwd0VarA = xwd0.a(new o4i0(0));
        this.e = wwd0VarA;
        this.f = e1i.e(new n1i(wwd0VarA, z4i0Var.d(), new b(3, null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), new o4i0(0));
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.d.f();
    }

    public final void x1(String str) {
        ej5.c(o8i0.d(this), null, null, new a(str, null), 3);
    }

    public final void y1(String str) {
        Object value;
        if (StringsKt.U(str)) {
            return;
        }
        wwd0 wwd0Var = this.e;
        o3i0 o3i0Var = ((o4i0) wwd0Var.getValue()).b;
        boolean zG = Intrinsics.g(o3i0Var != null ? o3i0Var.a : null, str);
        z4i0 z4i0Var = this.d;
        if (zG && Intrinsics.g(((alc) z4i0Var.d().a.getValue()).a, str)) {
            return;
        }
        this.a.e(str, "article_id");
        if (Intrinsics.g(o3i0Var != null ? o3i0Var.a : null, str)) {
            z4i0Var.g(new z4i0.a(o3i0Var.a, o3i0Var.g));
            return;
        }
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, o4i0.a((o4i0) value, true, null, null, false, true, n1a0.c, false, 6)));
        ej5.c(o8i0.d(this), null, null, new q4i0(this, str, null), 3);
        x1(str);
    }
}
