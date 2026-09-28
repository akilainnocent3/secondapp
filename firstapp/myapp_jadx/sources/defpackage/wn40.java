package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.redblack.views.fragments.RedBlackFragment$progressBarVisibility$1$2", f = "RedBlackFragment.kt", l = {2819}, m = "invokeSuspend", v = 1)
public final class wn40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nn40 b;

    @c0d(c = "com.sportygames.redblack.views.fragments.RedBlackFragment$progressBarVisibility$1$2$1", f = "RedBlackFragment.kt", l = {2833}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ nn40 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nn40 nn40Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = nn40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
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
                this.a = 1;
                if (hkd.b(100L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            nn40 nn40Var = this.b;
            xo40 xo40Var = (xo40) nn40Var.b;
            if (xo40Var != null && xo40Var.A.getVisibility() == 8) {
                xo40 xo40Var2 = (xo40) nn40Var.b;
                if (xo40Var2 != null) {
                    xo40Var2.A.setVisibility(0);
                }
                xo40 xo40Var3 = (xo40) nn40Var.b;
                if (xo40Var3 != null) {
                    nn40Var.G0(xo40Var3.A, 0);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn40(nn40 nn40Var, v1b<? super wn40> v1bVar) {
        super(2, v1bVar);
        this.b = nn40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wn40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wn40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(150L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        nn40 nn40Var = this.b;
        xo40 xo40Var = (xo40) nn40Var.b;
        if (xo40Var != null) {
            xo40Var.V.setVisibility(8);
        }
        xo40 xo40Var2 = (xo40) nn40Var.b;
        if (xo40Var2 != null) {
            xo40Var2.V.N();
        }
        if (nn40Var.m0) {
            SharedPreferences sharedPreferences = nn40Var.Q;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("MUSIC", true)) : null;
            xo40 xo40Var3 = (xo40) nn40Var.b;
            if (xo40Var3 != null) {
                ProgressMeterComponent progressMeterComponent = xo40Var3.V;
                ypa0 ypa0Var = nn40Var.z;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = nn40Var.getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0Var, boolValueOf, string);
            }
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new a(nn40Var, null), 3);
            if (!nn40Var.isRemoving()) {
                if (yju.a("br")) {
                    nn40Var.R0(true, new i84(nn40Var, 2));
                } else {
                    nn40Var.H0();
                }
            }
        }
        return Unit.a;
    }
}
