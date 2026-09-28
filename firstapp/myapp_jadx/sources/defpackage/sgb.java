package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.crash.utils.ErrorPayload;
import com.sportygames.crash.utils.HeaderPayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sgb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sgb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gvi gviVar;
        gvi gviVar2;
        xbg xbgVar;
        final e activity;
        final Context context;
        gvi gviVar3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final fgb fgbVar = (fgb) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() > 0) {
                    boolean zM = StringsKt.M(str, "user-name:", false);
                    u6i0.c cVar = u6i0.c.a;
                    if (zM || StringsKt.M(str, "\nuser-name:", false)) {
                        xbg xbgVar2 = fgbVar.G0;
                        if (xbgVar2 != null && xbgVar2.isShowing() && (xbgVar = fgbVar.G0) != null) {
                            xbgVar.dismiss();
                        }
                        HeaderPayload headerPayload = (HeaderPayload) new eal().e(StringsKt.a0(str, "\nuser-name:"), HeaderPayload.class);
                        loa0 loa0VarK1 = fgbVar.k1();
                        headerPayload.getClass();
                        if (Intrinsics.g(headerPayload.isBlocked(), Boolean.TRUE)) {
                            final Context context2 = fgbVar.getContext();
                            if (context2 != null && (gviVar2 = fgbVar.z) != null) {
                                final ComposeView composeView = gviVar2.J;
                                composeView.setViewCompositionStrategy(cVar);
                                composeView.setContent(new op8(871936247, new Function2() { // from class: ubb
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar = (a) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            if (composeView.getContext() == null) {
                                                aVar.N(-109372816);
                                            } else {
                                                aVar.N(-109372815);
                                                q8b q8bVar = q8b.d;
                                                final fgb fgbVar2 = fgbVar;
                                                String str2 = (String) ((x5a0) fgbVar2.c1().D).getValue();
                                                ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(80001, new HTTPResponse(9005, fgbVar2.getString(R.string.game_not_available), null, null, null, null, null, 64, null));
                                                Context context3 = context2;
                                                context3.getColor(R.color.sh_error_btn_color);
                                                cj5 cj5VarU0 = fgbVar2.U0();
                                                boolean zA = aVar.A(fgbVar2);
                                                Object objY = aVar.y();
                                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                                if (zA || objY == c0042a) {
                                                    objY = new Function0() { // from class: cdb
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            fgbVar2.M0();
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar.r(objY);
                                                }
                                                Function0 function0 = (Function0) objY;
                                                Object objY2 = aVar.y();
                                                if (objY2 == c0042a) {
                                                    objY2 = new ddb();
                                                    aVar.r(objY2);
                                                }
                                                Function0 function1 = (Function0) objY2;
                                                boolean zA2 = aVar.A(fgbVar2);
                                                Object objY3 = aVar.y();
                                                if (zA2 || objY3 == c0042a) {
                                                    objY3 = new Function0() { // from class: edb
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            fgb fgbVar3 = fgbVar2;
                                                            fgbVar3.B = false;
                                                            fgbVar3.z0();
                                                            fgbVar3.o2();
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar.r(objY3);
                                                }
                                                Function0 function2 = (Function0) objY3;
                                                Object objY4 = aVar.y();
                                                if (objY4 == c0042a) {
                                                    objY4 = new fdb();
                                                    aVar.r(objY4);
                                                }
                                                Function1 function3 = (Function1) objY4;
                                                Object objY5 = aVar.y();
                                                if (objY5 == c0042a) {
                                                    objY5 = new gdb(0);
                                                    aVar.r(objY5);
                                                }
                                                Function1 function4 = (Function1) objY5;
                                                Object objY6 = aVar.y();
                                                if (objY6 == c0042a) {
                                                    objY6 = new hdb();
                                                    aVar.r(objY6);
                                                }
                                                q8bVar.a(context3, str2, genericError, function0, function1, function2, function3, function4, (Function1) objY6, cj5VarU0, aVar, 819486720);
                                            }
                                            aVar.H();
                                        } else {
                                            aVar.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            }
                            loa0VarK1.getClass();
                        } else {
                            ytw<Boolean> ytwVar = gci0.g;
                            Boolean vipStatus = headerPayload.getVipStatus();
                            if (vipStatus == null) {
                                vipStatus = Boolean.FALSE;
                            }
                            ((x5a0) ytwVar).setValue(vipStatus);
                            headerPayload.getCountryCode();
                            String userCountryCode = headerPayload.getUserCountryCode();
                            String str2 = lobGSRIlnSGJY.ukIwMkZKiX;
                            if (userCountryCode == null) {
                                userCountryCode = str2;
                            }
                            fgbVar.w0 = userCountryCode;
                            String currency = headerPayload.getCurrency();
                            if (currency == null) {
                                currency = str2;
                            }
                            fgbVar.y0 = currency;
                            SportyGamesManager.getInstance().setPatronId(String.valueOf(headerPayload.getPuid()));
                            SportyGamesManager.getInstance().setUserId(String.valueOf(headerPayload.getId()));
                            SportyGamesManager.getInstance().setUserId(String.valueOf(headerPayload.getId()));
                            SportyGamesManager.getInstance().setUserImage(String.valueOf(headerPayload.getAvatar()));
                            SportyGamesManager.getInstance().setNickName(String.valueOf(headerPayload.getNickName()));
                            fgbVar.H0 = String.valueOf(headerPayload.getAvatar());
                            String nickName = headerPayload.getNickName();
                            if (nickName != null) {
                                str2 = nickName;
                            }
                            fgbVar.I0 = str2;
                            gvi gviVar4 = fgbVar.z;
                            if (gviVar4 != null) {
                                gviVar4.Q.setUserDetails(str2, fgbVar.H0);
                            }
                            if (fgbVar.y0.length() > 0) {
                                loa0 loa0VarK2 = fgbVar.k1();
                                String str3 = fgbVar.y0;
                                String str4 = fgbVar.w0;
                                loa0VarK2.getClass();
                                str3.getClass();
                                str4.getClass();
                                usm usmVar = loa0VarK2.b;
                                brb brbVar = brb.c;
                                usm.i(usmVar, brbVar, loa0VarK2.c.b(brbVar, str4, str3));
                            }
                            fgbVar.n1().z1();
                            if (!fgbVar.l0 && !fgbVar.L1) {
                                fgbVar.Y0().A1(false);
                                z52 z52Var = fgbVar.X1;
                                if (z52Var == null) {
                                    Intrinsics.n("gameStrings");
                                    throw null;
                                }
                                String strA = z52Var.a();
                                op5 op5Var = op5.a;
                                String string = fgbVar.getString(R.string.finding_you_room_cms);
                                string.getClass();
                                op5Var.getClass();
                                String strB = op5.b(string, strA, null);
                                ((x5a0) fgbVar.c1().H).setValue(strB);
                                ((x5a0) fgbVar.c1().K).setValue(new j58(fgbVar.b1().J0()));
                                ((x5a0) fgbVar.c1().L).setValue(new j58(fgbVar.b1().M0()));
                                if (fgbVar.getView() != null) {
                                    ibs viewLifecycleOwner = fgbVar.getViewLifecycleOwner();
                                    viewLifecycleOwner.getClass();
                                    ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new ngb(fgbVar, strB, null), 3);
                                }
                                fgbVar.L1 = true;
                            }
                            if (!fgbVar.A && (gviVar = fgbVar.z) != null) {
                                gviVar.Y.N();
                            }
                            loa0VarK1.v.j("Success");
                        }
                    } else {
                        final ErrorPayload errorPayload = (ErrorPayload) new eal().e(str, ErrorPayload.class);
                        fgbVar.m3();
                        Integer bizCode = errorPayload.getBizCode();
                        if (bizCode != null && bizCode.intValue() == 403) {
                            fgbVar.m2();
                        } else {
                            xbg xbgVar3 = fgbVar.G0;
                            if (!(xbgVar3 != null ? xbgVar3.isShowing() : false) && !fgbVar.F0 && (activity = fgbVar.getActivity()) != null && (context = fgbVar.getContext()) != null && (gviVar3 = fgbVar.z) != null) {
                                final ComposeView composeView2 = gviVar3.J;
                                composeView2.setViewCompositionStrategy(cVar);
                                composeView2.setContent(new op8(466892138, new Function2() { // from class: vab
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar = (a) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        int i2 = 0;
                                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            if (composeView2.getContext() == null) {
                                                aVar.N(2079786008);
                                            } else {
                                                aVar.N(2079786009);
                                                q8b q8bVar = q8b.d;
                                                final fgb fgbVar2 = fgbVar;
                                                String str5 = (String) ((x5a0) fgbVar2.c1().D).getValue();
                                                ErrorPayload errorPayload2 = errorPayload;
                                                Integer bizCode2 = errorPayload2.getBizCode();
                                                Integer numValueOf = Integer.valueOf(bizCode2 != null ? bizCode2.intValue() : 0);
                                                Integer bizCode3 = errorPayload2.getBizCode();
                                                ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(numValueOf, new HTTPResponse(Integer.valueOf(bizCode3 != null ? bizCode3.intValue() : 0), fgbVar2.getString(R.string.redblack_err_80001), null, null, Boolean.TRUE, null, null, 64, null));
                                                Context context3 = context;
                                                context3.getColor(R.color.sh_error_btn_color);
                                                cj5 cj5VarU0 = fgbVar2.U0();
                                                boolean zA = aVar.A(fgbVar2);
                                                Object objY = aVar.y();
                                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                                if (zA || objY == c0042a) {
                                                    objY = new jcb(fgbVar2, 0);
                                                    aVar.r(objY);
                                                }
                                                Function0 function0 = (Function0) objY;
                                                Object objY2 = aVar.y();
                                                if (objY2 == c0042a) {
                                                    objY2 = new kcb();
                                                    aVar.r(objY2);
                                                }
                                                Function0 function1 = (Function0) objY2;
                                                boolean zA2 = aVar.A(fgbVar2);
                                                Object objY3 = aVar.y();
                                                if (zA2 || objY3 == c0042a) {
                                                    objY3 = new eb2(fgbVar2, 1);
                                                    aVar.r(objY3);
                                                }
                                                Function0 function2 = (Function0) objY3;
                                                boolean zA3 = aVar.A(fgbVar2) | aVar.A(context3);
                                                Object objY4 = aVar.y();
                                                if (zA3 || objY4 == c0042a) {
                                                    objY4 = new lcb(i2, fgbVar2, context3);
                                                    aVar.r(objY4);
                                                }
                                                Function1 function3 = (Function1) objY4;
                                                boolean zA4 = aVar.A(fgbVar2);
                                                Object objY5 = aVar.y();
                                                if (zA4 || objY5 == c0042a) {
                                                    objY5 = new Function1() { // from class: mcb
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj5) {
                                                            String str6 = (String) obj5;
                                                            str6.getClass();
                                                            fgb fgbVar3 = fgbVar2;
                                                            if (fgbVar3.P1) {
                                                                fgbVar3.N0(str6);
                                                            } else {
                                                                fgbVar3.Q1 = str6;
                                                            }
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar.r(objY5);
                                                }
                                                Function1 function4 = (Function1) objY5;
                                                Object objY6 = aVar.y();
                                                if (objY6 == c0042a) {
                                                    objY6 = new ncb(i2);
                                                    aVar.r(objY6);
                                                }
                                                q8bVar.a(activity, str5, genericError, function0, function1, function2, function3, function4, (Function1) objY6, cj5VarU0, aVar, 1597440);
                                            }
                                            aVar.H();
                                        } else {
                                            aVar.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            }
                        }
                    }
                }
                return Unit.a;
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.b(((osw) obj2).D() == 0 ? 0.0f : 1.0f);
                return Unit.a;
        }
    }
}
