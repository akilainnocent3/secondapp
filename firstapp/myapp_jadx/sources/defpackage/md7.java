package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.ResultWrapper;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class md7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gvi gviVar;
        Context context;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                td7 td7Var = (td7) obj2;
                ad7 ad7Var = (ad7) obj;
                int i2 = ad7Var == null ? -1 : td7.h.a[ad7Var.ordinal()];
                if (i2 == 1) {
                    qrr qrrVar = td7Var.a;
                    qrrVar.getClass();
                    ConstraintLayout constraintLayout = qrrVar.E;
                    constraintLayout.getClass();
                    lop.b(constraintLayout, Boolean.FALSE);
                    qrr qrrVar2 = td7Var.a;
                    qrrVar2.getClass();
                    qrrVar2.A.clearFocus();
                    qrr qrrVar3 = td7Var.a;
                    qrrVar3.getClass();
                    qrrVar3.E.requestFocus();
                } else if (i2 == 2) {
                    td7Var.n0(false);
                } else if (i2 == 3) {
                    ConstraintLayout constraintLayout2 = td7Var.A;
                    if (constraintLayout2 == null) {
                        Intrinsics.n("bookingCodePreview");
                        throw null;
                    }
                    constraintLayout2.setVisibility(8);
                    qrr qrrVar4 = td7Var.a;
                    qrrVar4.getClass();
                    qrrVar4.G.setVisibility(8);
                    qrr qrrVar5 = td7Var.a;
                    qrrVar5.getClass();
                    qrrVar5.J.setVisibility(8);
                    qrr qrrVar6 = td7Var.a;
                    qrrVar6.getClass();
                    qrrVar6.d.setPadding(0, bqe.a(12.0f), 0, 0);
                }
                return Unit.a;
            case 1:
                final fgb fgbVar = (fgb) obj2;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (context = fgbVar.getContext()) != null) {
                    fgbVar.F = krh0.j(context);
                }
                if (!bool.booleanValue()) {
                    fgbVar.m3();
                    fgbVar.B = false;
                    fgbVar.C = true;
                    fgbVar.D = Long.valueOf(System.currentTimeMillis());
                    fgbVar.E = fgbVar.F;
                    final Context context2 = fgbVar.getContext();
                    if (context2 != null && (gviVar = fgbVar.z) != null) {
                        final ComposeView composeView = gviVar.J;
                        composeView.setViewCompositionStrategy(u6i0.c.a);
                        composeView.setContent(new op8(1139640493, new Function2() { // from class: ofb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                int i3 = 0;
                                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    if (composeView.getContext() == null) {
                                        aVar.N(-686448375);
                                    } else {
                                        aVar.N(-686448374);
                                        fgb fgbVar2 = fgbVar;
                                        fgbVar2.F2(true);
                                        loa0 loa0VarK1 = fgbVar2.k1();
                                        loa0VarK1.K.clear();
                                        loa0VarK1.L.clear();
                                        loa0VarK1.M.clear();
                                        q8b q8bVar = q8b.d;
                                        String str = (String) ((x5a0) fgbVar2.c1().D).getValue();
                                        ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(-11, null);
                                        Context context3 = context2;
                                        context3.getColor(R.color.sh_error_btn_color);
                                        cj5 cj5VarU0 = fgbVar2.U0();
                                        boolean zA = aVar.A(fgbVar2);
                                        Object objY = aVar.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (zA || objY == c0042a) {
                                            objY = new iab(fgbVar2, 0);
                                            aVar.r(objY);
                                        }
                                        Function0 function0 = (Function0) objY;
                                        Object objY2 = aVar.y();
                                        if (objY2 == c0042a) {
                                            objY2 = new jab();
                                            aVar.r(objY2);
                                        }
                                        Function0 function1 = (Function0) objY2;
                                        boolean zA2 = aVar.A(fgbVar2);
                                        Object objY3 = aVar.y();
                                        if (zA2 || objY3 == c0042a) {
                                            objY3 = new kab(fgbVar2, i3);
                                            aVar.r(objY3);
                                        }
                                        Function0 function2 = (Function0) objY3;
                                        Object objY4 = aVar.y();
                                        if (objY4 == c0042a) {
                                            objY4 = new p87(1);
                                            aVar.r(objY4);
                                        }
                                        Function1 function3 = (Function1) objY4;
                                        Object objY5 = aVar.y();
                                        if (objY5 == c0042a) {
                                            objY5 = new lab();
                                            aVar.r(objY5);
                                        }
                                        Function1 function4 = (Function1) objY5;
                                        Object objY6 = aVar.y();
                                        if (objY6 == c0042a) {
                                            objY6 = new nab(0);
                                            aVar.r(objY6);
                                        }
                                        q8bVar.a(context3, str, genericError, function0, function1, function2, function3, function4, (Function1) objY6, cj5VarU0, aVar, 819486720);
                                    }
                                    aVar.H();
                                } else {
                                    aVar.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                    }
                    ((x5a0) q8b.d.b).setValue(Boolean.TRUE);
                }
                if (bool.booleanValue() && fgbVar.C) {
                    fgbVar.B = false;
                    ((x5a0) q8b.d.b).setValue(Boolean.FALSE);
                    fgbVar.z0();
                    fgbVar.o2();
                    try {
                        Long l = fgbVar.D;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            l1z l1zVarE1 = fgbVar.e1();
                            String userId = SportyGamesManager.getInstance().getUserId();
                            String str = (String) ((x5a0) fgbVar.c1().v).getValue();
                            Locale locale = Locale.ENGLISH;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
                            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                            String str2 = simpleDateFormat.format(new Date(jLongValue));
                            str2.getClass();
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
                            simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                            String str3 = simpleDateFormat2.format(new Date(jCurrentTimeMillis));
                            str3.getClass();
                            long j = jCurrentTimeMillis - jLongValue;
                            String str4 = fgbVar.E;
                            String str5 = fgbVar.F;
                            String strValueOf = String.valueOf(SportyGamesManager.getInstance().getVersionCode());
                            String str6 = Build.VERSION.RELEASE;
                            l1zVarE1.g(userId, str, str2, str3, j, str4, str5, strValueOf, SportyGamesManager.getInstance().getCountry());
                            fgbVar.D = null;
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    if (fgbVar.z != null) {
                        ypa0 ypa0VarL1 = fgbVar.l1();
                        Boolean bool2 = Boolean.FALSE;
                        String string = fgbVar.getString(R.string.bg_music);
                        string.getClass();
                        if (bool2.equals(Boolean.TRUE)) {
                            ypa0VarL1.A1(0L, string);
                        }
                    }
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new hgb(fgbVar, null), 3);
                }
                return Unit.a;
            case 2:
                uv20 uv20Var = (uv20) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                uv20Var.b = OtpData.PrimaryPhone.a((OtpData.PrimaryPhone) uv20Var.B1(), oTPResult);
                return Unit.a;
            default:
                xqj0 xqj0Var = (xqj0) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    vtw<spg0> vtwVar = xqj0Var.m;
                    if (vtwVar == null) {
                        Intrinsics.n("tradingUiEventFlow");
                        throw null;
                    }
                    int i3 = vpg0.a;
                    vtwVar.a(spg0.b.a);
                } else {
                    vtw<spg0> vtwVar2 = xqj0Var.m;
                    if (vtwVar2 == null) {
                        Intrinsics.n("tradingUiEventFlow");
                        throw null;
                    }
                    int i4 = vpg0.a;
                    vtwVar2.a(spg0.d.a);
                }
                return Unit.a;
        }
    }
}
