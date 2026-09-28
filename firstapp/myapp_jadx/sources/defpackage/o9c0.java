package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadAllImages$1", f = "SportyKickViewModel.kt", l = {116}, m = "invokeSuspend", v = 1)
public final class o9c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q9c0 c;

    @c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadAllImages$1$1", f = "SportyKickViewModel.kt", l = {110}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;
        public final /* synthetic */ q9c0 c;
        public final /* synthetic */ List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, q9c0 q9c0Var, List list) {
            super(2, v1bVar);
            this.c = q9c0Var;
            this.d = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                q9c0 q9c0Var = this.c;
                wwd0 wwd0Var2 = q9c0Var.b;
                this.a = wwd0Var2;
                this.b = 1;
                obj = q9c0Var.x1(this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadAllImages$1$2", f = "SportyKickViewModel.kt", l = {111}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;
        public final /* synthetic */ q9c0 c;
        public final /* synthetic */ List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, q9c0 q9c0Var, List list) {
            super(2, v1bVar);
            this.c = q9c0Var;
            this.d = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                q9c0 q9c0Var = this.c;
                wwd0 wwd0Var2 = q9c0Var.d;
                this.a = wwd0Var2;
                this.b = 1;
                obj = q9c0Var.x1(this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadAllImages$1$3", f = "SportyKickViewModel.kt", l = {112}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;
        public final /* synthetic */ q9c0 c;
        public final /* synthetic */ List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, q9c0 q9c0Var, List list) {
            super(2, v1bVar);
            this.c = q9c0Var;
            this.d = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(v1bVar, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                q9c0 q9c0Var = this.c;
                wwd0 wwd0Var2 = q9c0Var.f;
                this.a = wwd0Var2;
                this.b = 1;
                obj = q9c0Var.x1(this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadAllImages$1$4", f = "SportyKickViewModel.kt", l = {113}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;
        public final /* synthetic */ q9c0 c;
        public final /* synthetic */ List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, q9c0 q9c0Var, List list) {
            super(2, v1bVar);
            this.c = q9c0Var;
            this.d = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(v1bVar, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                q9c0 q9c0Var = this.c;
                wwd0 wwd0Var2 = q9c0Var.y;
                this.a = wwd0Var2;
                this.b = 1;
                obj = q9c0Var.x1(this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadAllImages$1$5", f = "SportyKickViewModel.kt", l = {114}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;
        public final /* synthetic */ q9c0 c;
        public final /* synthetic */ List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, q9c0 q9c0Var, List list) {
            super(2, v1bVar);
            this.c = q9c0Var;
            this.d = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(v1bVar, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                q9c0 q9c0Var = this.c;
                wwd0 wwd0Var2 = q9c0Var.v;
                this.a = wwd0Var2;
                this.b = 1;
                obj = q9c0Var.x1(this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadAllImages$1$6", f = "SportyKickViewModel.kt", l = {115}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;
        public final /* synthetic */ q9c0 c;
        public final /* synthetic */ List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v1b v1bVar, q9c0 q9c0Var, List list) {
            super(2, v1bVar);
            this.c = q9c0Var;
            this.d = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(v1bVar, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                q9c0 q9c0Var = this.c;
                wwd0 wwd0Var2 = q9c0Var.A;
                this.a = wwd0Var2;
                this.b = 1;
                obj = q9c0Var.x1(this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9c0(q9c0 q9c0Var, v1b<? super o9c0> v1bVar) {
        super(2, v1bVar);
        this.c = q9c0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o9c0 o9c0Var = new o9c0(this.c, v1bVar);
        o9c0Var.b = obj;
        return o9c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o9c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        q9c0 q9c0Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            List listK = kotlin.collections.b.k(nt8.a(R.string.ball1_url, "ball_1_png:sg_game_name"), nt8.a(R.string.ball2_url, "ball_2_png:sg_game_name"), nt8.a(R.string.ball3_url, "ball_3_png:sg_game_name"), nt8.a(R.string.ball4_url, "ball_4_png:sg_game_name"), nt8.a(R.string.ball5_url, "ball_5_png:sg_game_name"), nt8.a(R.string.ball6_url, "ball_6_png:sg_game_name"), nt8.a(R.string.ball7_url, LGxrN.FEAGRw), nt8.a(R.string.ball8_url, "ball_8_png:sg_game_name"), nt8.a(R.string.ball9_url, "ball_9_png:sg_game_name"));
            List listK2 = kotlin.collections.b.k(nt8.a(R.string.fire_big1_url, "fire_big1_png:sg_game_name"), nt8.a(R.string.fire_big2_url, "fire_big2_png:sg_game_name"), nt8.a(R.string.fire_big3_url, "fire_big3_png:sg_game_name"));
            List listK3 = kotlin.collections.b.k(nt8.a(R.string.fire_circle1_url, "fire_circle_1_png:sg_game_name"), nt8.a(R.string.fire_circle2_url, "fire_circle_2_png:sg_game_name"), nt8.a(R.string.fire_circle3_url, "fire_circle_3_png:sg_game_name"));
            List listK4 = kotlin.collections.b.k(nt8.a(R.string.fire_blue1_url, "fire_blue_1_png:sg_game_name"), nt8.a(R.string.fire_blue2_url, "fire_blue_2_png:sg_game_name"), nt8.a(R.string.fire_blue3_url, "fire_blue_3_png:sg_game_name"));
            List listK5 = kotlin.collections.b.k(nt8.a(R.string.fire_blue_overlay1_url, "fire_blue_overlay_1_png:sg_game_name"), nt8.a(R.string.fire_blue_overlay2_url, "fire_blue_overlay_2_png:sg_game_name"), nt8.a(R.string.fire_blue_overlay3_url, "fire_blue_overlay_3_png:sg_game_name"));
            List listK6 = kotlin.collections.b.k(nt8.a(R.string.fire_small1_url, "fire_small1_png:sg_game_name"), nt8.a(R.string.fire_small2_url, "fire_small2_png:sg_game_name"), nt8.a(R.string.fire_small3_url, "fire_small3_png:sg_game_name"));
            ArrayList arrayListI0 = CollectionsKt.i0(listK6, CollectionsKt.i0(listK5, CollectionsKt.i0(listK4, CollectionsKt.i0(listK3, CollectionsKt.i0(listK2, listK)))));
            if (!arrayListI0.isEmpty()) {
                int size = arrayListI0.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayListI0.get(i2);
                    i2++;
                    if (!StringsKt.U((String) obj2)) {
                        List listK7 = kotlin.collections.b.k(ej5.a(v5bVar, null, new a(null, q9c0Var, listK), 3), ej5.a(v5bVar, null, new b(null, q9c0Var, listK2), 3), ej5.a(v5bVar, null, new c(null, q9c0Var, listK6), 3), ej5.a(v5bVar, null, new d(null, q9c0Var, listK3), 3), ej5.a(v5bVar, null, new e(null, q9c0Var, listK4), 3), ej5.a(v5bVar, null, new f(null, q9c0Var, listK5), 3));
                        this.b = null;
                        this.a = 1;
                        if (up1.a(listK7, this) == y5bVar) {
                            return y5bVar;
                        }
                    }
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        wwd0 wwd0Var = q9c0Var.C;
        Boolean bool = Boolean.TRUE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        return Unit.a;
    }
}
