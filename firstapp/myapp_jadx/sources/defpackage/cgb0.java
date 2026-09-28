package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.book.domain.entity.SportsMenuData;
import com.sporty.android.book.domain.entity.Tournament;
import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import com.sportybet.plugin.webcontainer.widget.AlertMessage;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1", f = "SportsMenuActivity.kt", l = {170}, m = "invokeSuspend", v = 2)
public final class cgb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SportsMenuActivity b;

    @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1", f = "SportsMenuActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ SportsMenuActivity b;

        /* JADX INFO: renamed from: cgb0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$1", f = "SportsMenuActivity.kt", l = {172}, m = "invokeSuspend", v = 2)
        public static final class C0163a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportsMenuActivity b;

            /* JADX INFO: renamed from: cgb0$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$1$1", f = "SportsMenuActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0164a extends tje0 implements Function2<UIState<? extends Pair<? extends Tournament, ? extends Boolean>>, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ SportsMenuActivity b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0164a(SportsMenuActivity sportsMenuActivity, v1b<? super C0164a> v1bVar) {
                    super(2, v1bVar);
                    this.b = sportsMenuActivity;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0164a c0164a = new C0164a(this.b, v1bVar);
                    c0164a.a = obj;
                    return c0164a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UIState<? extends Pair<? extends Tournament, ? extends Boolean>> uIState, v1b<? super Unit> v1bVar) {
                    return ((C0164a) create(uIState, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    UIState uIState = (UIState) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    SportsMenuActivity sportsMenuActivity = this.b;
                    Toast toast = sportsMenuActivity.f;
                    if (toast != null) {
                        toast.cancel();
                    }
                    if (uIState instanceof UIState.Success) {
                        UIState.Success success = (UIState.Success) uIState;
                        sportsMenuActivity.f = AlertMessage.show((Context) sportsMenuActivity, (CharSequence) sportsMenuActivity.getCMSString(((Boolean) ((Pair) success.getData()).b).booleanValue() ? R.string.sports_menu__favorite_added : R.string.sports_menu__favorite_removed, ((Tournament) ((Pair) success.getData()).a).getName()), false, false);
                    } else if (uIState instanceof UIState.Error) {
                        sportsMenuActivity.f = AlertMessage.show((Context) sportsMenuActivity, (CharSequence) sportsMenuActivity.getCMSString(R.string.common_feedback__something_went_wrong_please_try_again, new Object[0]), false, false);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0163a(SportsMenuActivity sportsMenuActivity, v1b<? super C0163a> v1bVar) {
                super(2, v1bVar);
                this.b = sportsMenuActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0163a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0163a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    int i2 = SportsMenuActivity.i;
                    SportsMenuActivity sportsMenuActivity = this.b;
                    t340 t340Var = sportsMenuActivity.B1().O;
                    C0164a c0164a = new C0164a(sportsMenuActivity, null);
                    this.a = 1;
                    if (kzh.b(t340Var, c0164a, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$2", f = "SportsMenuActivity.kt", l = {203}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportsMenuActivity b;

            /* JADX INFO: renamed from: cgb0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$2$1", f = "SportsMenuActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0165a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
                public /* synthetic */ boolean a;
                public final /* synthetic */ SportsMenuActivity b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0165a(SportsMenuActivity sportsMenuActivity, v1b<? super C0165a> v1bVar) {
                    super(2, v1bVar);
                    this.b = sportsMenuActivity;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0165a c0165a = new C0165a(this.b, v1bVar);
                    c0165a.a = ((Boolean) obj).booleanValue();
                    return c0165a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C0165a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    fgd0 fgd0Var = this.b.a;
                    if (fgd0Var != null) {
                        fgd0Var.e.setVisibility(z ? 0 : 8);
                        return Unit.a;
                    }
                    Intrinsics.n("binding");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SportsMenuActivity sportsMenuActivity, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = sportsMenuActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    int i2 = SportsMenuActivity.i;
                    SportsMenuActivity sportsMenuActivity = this.b;
                    v340 v340Var = sportsMenuActivity.B1().M;
                    C0165a c0165a = new C0165a(sportsMenuActivity, null);
                    this.a = 1;
                    if (kzh.b(v340Var, c0165a, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$3", f = "SportsMenuActivity.kt", l = {208}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportsMenuActivity b;

            /* JADX INFO: renamed from: cgb0$a$c$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$3$1", f = "SportsMenuActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0166a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ SportsMenuActivity b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0166a(SportsMenuActivity sportsMenuActivity, v1b<? super C0166a> v1bVar) {
                    super(2, v1bVar);
                    this.b = sportsMenuActivity;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0166a c0166a = new C0166a(this.b, v1bVar);
                    c0166a.a = obj;
                    return c0166a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, v1b<? super Unit> v1bVar) {
                    return ((C0166a) create(str, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    String str = (String) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    if (Intrinsics.g(str, "my_favourites")) {
                        int i = SportsMenuActivity.i;
                        this.b.B1().x1();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SportsMenuActivity sportsMenuActivity, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = sportsMenuActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    int i2 = SportsMenuActivity.i;
                    SportsMenuActivity sportsMenuActivity = this.b;
                    v340 v340Var = sportsMenuActivity.B1().K;
                    C0166a c0166a = new C0166a(sportsMenuActivity, null);
                    this.a = 1;
                    if (kzh.b(v340Var, c0166a, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$4", f = "SportsMenuActivity.kt", l = {215}, m = "invokeSuspend", v = 2)
        public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportsMenuActivity b;

            /* JADX INFO: renamed from: cgb0$a$d$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$4$1", f = "SportsMenuActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0167a extends tje0 implements Function2<Set<? extends String>, v1b<? super Unit>, Object> {
                public final /* synthetic */ SportsMenuActivity a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0167a(SportsMenuActivity sportsMenuActivity, v1b<? super C0167a> v1bVar) {
                    super(2, v1bVar);
                    this.a = sportsMenuActivity;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0167a(this.a, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Set<? extends String> set, v1b<? super Unit> v1bVar) {
                    return ((C0167a) create(set, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    int i = SportsMenuActivity.i;
                    this.a.A1();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SportsMenuActivity sportsMenuActivity, v1b<? super d> v1bVar) {
                super(2, v1bVar);
                this.b = sportsMenuActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new d(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    int i2 = SportsMenuActivity.i;
                    SportsMenuActivity sportsMenuActivity = this.b;
                    v340 v340Var = sportsMenuActivity.B1().G;
                    C0167a c0167a = new C0167a(sportsMenuActivity, null);
                    this.a = 1;
                    if (kzh.b(v340Var, c0167a, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$5", f = "SportsMenuActivity.kt", l = {220}, m = "invokeSuspend", v = 2)
        public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportsMenuActivity b;

            /* JADX INFO: renamed from: cgb0$a$e$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$5$1", f = "SportsMenuActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0168a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
                public final /* synthetic */ SportsMenuActivity a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0168a(SportsMenuActivity sportsMenuActivity, v1b<? super C0168a> v1bVar) {
                    super(2, v1bVar);
                    this.a = sportsMenuActivity;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0168a(this.a, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, v1b<? super Unit> v1bVar) {
                    return ((C0168a) create(str, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    int i = SportsMenuActivity.i;
                    SportsMenuActivity sportsMenuActivity = this.a;
                    UIState uIState = (UIState) sportsMenuActivity.B1().w.a.getValue();
                    if (uIState instanceof UIState.Success) {
                        sportsMenuActivity.D1((SportsMenuData) ((UIState.Success) uIState).getData());
                        sportsMenuActivity.A1();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SportsMenuActivity sportsMenuActivity, v1b<? super e> v1bVar) {
                super(2, v1bVar);
                this.b = sportsMenuActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new e(this.b, v1bVar);
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
                    int i2 = SportsMenuActivity.i;
                    SportsMenuActivity sportsMenuActivity = this.b;
                    v340 v340Var = sportsMenuActivity.B1().i;
                    C0168a c0168a = new C0168a(sportsMenuActivity, null);
                    this.a = 1;
                    if (kzh.b(v340Var, c0168a, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$6", f = "SportsMenuActivity.kt", l = {230}, m = "invokeSuspend", v = 2)
        public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportsMenuActivity b;

            /* JADX INFO: renamed from: cgb0$a$f$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity$observeViewModelData$1$1$6$1", f = "SportsMenuActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0169a extends tje0 implements Function2<UIState<? extends SportsMenuData>, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ SportsMenuActivity b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0169a(SportsMenuActivity sportsMenuActivity, v1b<? super C0169a> v1bVar) {
                    super(2, v1bVar);
                    this.b = sportsMenuActivity;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0169a c0169a = new C0169a(this.b, v1bVar);
                    c0169a.a = obj;
                    return c0169a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UIState<? extends SportsMenuData> uIState, v1b<? super Unit> v1bVar) {
                    return ((C0169a) create(uIState, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    UIState uIState = (UIState) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    boolean z = uIState instanceof UIState.Success;
                    SportsMenuActivity sportsMenuActivity = this.b;
                    if (z) {
                        SportsMenuData sportsMenuData = (SportsMenuData) ((UIState.Success) uIState).getData();
                        int i = SportsMenuActivity.i;
                        sportsMenuActivity.D1(sportsMenuData);
                        sportsMenuActivity.A1();
                    } else if (uIState instanceof UIState.Error) {
                        Throwable error = ((UIState.Error) uIState).getError();
                        int i2 = SportsMenuActivity.i;
                        if (sportsMenuActivity.e) {
                            if ((error instanceof ConnectException) || (error instanceof UnknownHostException)) {
                                zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                            } else {
                                zyf0.b(R.string.wap_search__failed, 0);
                            }
                            fgd0 fgd0Var = sportsMenuActivity.a;
                            if (fgd0Var == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            fgd0Var.v.setRefreshing(false);
                        } else {
                            fgd0 fgd0Var2 = sportsMenuActivity.a;
                            if (fgd0Var2 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            fgd0Var2.f.I();
                        }
                    } else {
                        int i3 = SportsMenuActivity.i;
                        boolean z2 = sportsMenuActivity.e;
                        fgd0 fgd0Var3 = sportsMenuActivity.a;
                        if (z2) {
                            if (fgd0Var3 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            fgd0Var3.v.setRefreshing(true);
                        } else {
                            if (fgd0Var3 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            LoadingView loadingView = fgd0Var3.f;
                            ViewGroup.LayoutParams layoutParams = loadingView.getLayoutParams();
                            if (layoutParams == null) {
                                bmy.a("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                return null;
                            }
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                            loadingView.setLayoutParams(layoutParams2);
                            loadingView.K();
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(SportsMenuActivity sportsMenuActivity, v1b<? super f> v1bVar) {
                super(2, v1bVar);
                this.b = sportsMenuActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new f(this.b, v1bVar);
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
                    int i2 = SportsMenuActivity.i;
                    SportsMenuActivity sportsMenuActivity = this.b;
                    v340 v340Var = sportsMenuActivity.B1().w;
                    C0169a c0169a = new C0169a(sportsMenuActivity, null);
                    this.a = 1;
                    if (kzh.b(v340Var, c0169a, this) == y5bVar) {
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
        public a(SportsMenuActivity sportsMenuActivity, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = sportsMenuActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            SportsMenuActivity sportsMenuActivity = this.b;
            ej5.c(v5bVar, null, null, new C0163a(sportsMenuActivity, null), 3);
            ej5.c(v5bVar, null, null, new b(sportsMenuActivity, null), 3);
            ej5.c(v5bVar, null, null, new c(sportsMenuActivity, null), 3);
            ej5.c(v5bVar, null, null, new d(sportsMenuActivity, null), 3);
            ej5.c(v5bVar, null, null, new e(sportsMenuActivity, null), 3);
            ej5.c(v5bVar, null, null, new f(sportsMenuActivity, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgb0(SportsMenuActivity sportsMenuActivity, v1b<? super cgb0> v1bVar) {
        super(2, v1bVar);
        this.b = sportsMenuActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cgb0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cgb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s.b bVar = s9s.b.d;
            SportsMenuActivity sportsMenuActivity = this.b;
            a aVar = new a(sportsMenuActivity, null);
            this.a = 1;
            if (m850.b(sportsMenuActivity, bVar, aVar, this) == y5bVar) {
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
