package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.pingpong.utils.ErrorPayload;
import com.sportygames.pingpong.utils.HeaderPayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.views.PingPongFragment$observeSocketResponseHeader$1", f = "PingPongFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class y410 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ m410 a;

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$observeSocketResponseHeader$1$1$1$1$4$1$1", f = "PingPongFragment.kt", l = {1983}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ m410 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m410 m410Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = m410Var;
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
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            m410 m410Var = this.b;
            m410Var.t0 = false;
            m410Var.z0();
            m410Var.m1();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y410(m410 m410Var, v1b<? super y410> v1bVar) {
        super(2, v1bVar);
        this.a = m410Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y410(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y410) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ssw sswVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final m410 m410Var = this.a;
        goa0 goa0Var = (goa0) m410Var.a;
        if (goa0Var != null && (sswVar = goa0Var.A) != null) {
            sswVar.f(m410Var.getViewLifecycleOwner(), new m410.l(new Function1() { // from class: s410
                /* JADX WARN: Type inference failed for: r11v1, types: [v410] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    e activity;
                    final Context context;
                    String str = (String) obj2;
                    if (str != null) {
                        try {
                            if (str.length() != 0) {
                                int i = 0;
                                boolean zM = StringsKt.M(str, "user-name:", false);
                                final m410 m410Var2 = m410Var;
                                if (zM || StringsKt.M(str, "\nuser-name:", false)) {
                                    try {
                                        xbg xbgVar = m410Var2.c0;
                                        if (xbgVar == null) {
                                            Intrinsics.n("errorDialog");
                                            throw null;
                                        }
                                        if (xbgVar.isShowing()) {
                                            xbg xbgVar2 = m410Var2.c0;
                                            if (xbgVar2 == null) {
                                                Intrinsics.n("errorDialog");
                                                throw null;
                                            }
                                            xbgVar2.dismiss();
                                        }
                                        HeaderPayload headerPayload = (HeaderPayload) new eal().e(StringsKt.a0(str, "\nuser-name:"), HeaderPayload.class);
                                        goa0 goa0Var2 = (goa0) m410Var2.a;
                                        if (goa0Var2 != null) {
                                            headerPayload.getClass();
                                            if (m410Var2.T0(headerPayload)) {
                                                goa0Var2.c.j("Success");
                                            }
                                            Unit unit = Unit.a;
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        Unit unit2 = Unit.a;
                                    }
                                } else {
                                    ErrorPayload errorPayload = (ErrorPayload) new eal().e(str, ErrorPayload.class);
                                    m410Var2.D1();
                                    Integer bizCode = errorPayload.getBizCode();
                                    if (bizCode != null && bizCode.intValue() == 403) {
                                        m410Var2.k1();
                                    } else {
                                        xbg xbgVar3 = m410Var2.c0;
                                        if (xbgVar3 == null) {
                                            Intrinsics.n("errorDialog");
                                            throw null;
                                        }
                                        if (!xbgVar3.isShowing() && !m410Var2.l0 && (activity = m410Var2.getActivity()) != null && (context = m410Var2.getContext()) != null) {
                                            vs80 vs80Var = vs80.b;
                                            Integer bizCode2 = errorPayload.getBizCode();
                                            Integer numValueOf = Integer.valueOf(bizCode2 != null ? bizCode2.intValue() : 0);
                                            Integer bizCode3 = errorPayload.getBizCode();
                                            ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(numValueOf, new HTTPResponse(Integer.valueOf(bizCode3 != null ? bizCode3.intValue() : 0), m410Var2.getString(R.string.redblack_err_80001), null, null, Boolean.TRUE, null, null, 64, null));
                                            t410 t410Var = new t410(m410Var2, i);
                                            u410 u410Var = new u410();
                                            thi thiVar = new thi(m410Var2, 1);
                                            ?? r11 = new Function1() { // from class: v410
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj3) {
                                                    String str2 = (String) obj3;
                                                    m410 m410Var3 = m410Var2;
                                                    xbg xbgVar4 = m410Var3.c0;
                                                    if (xbgVar4 == null) {
                                                        Intrinsics.n("errorDialog");
                                                        throw null;
                                                    }
                                                    String string = m410Var3.getString(R.string.label_dialog_tryagain);
                                                    string.getClass();
                                                    xbg.c(xbgVar4, str2, string, new w410(m410Var3, 0), new x410(), context.getColor(R.color.sh_error_btn_color), 224);
                                                    xbgVar4.a();
                                                    return Unit.a;
                                                }
                                            };
                                            context.getColor(R.color.sh_error_btn_color);
                                            vs80Var.c(activity, genericError, t410Var, u410Var, thiVar, 0, (640 & 128) != 0 ? new mm60() : r11, (640 & 512) != 0 ? new xvj(2) : new uhi(m410Var2, 2));
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    return Unit.a;
                }
            }));
        }
        return Unit.a;
    }
}
