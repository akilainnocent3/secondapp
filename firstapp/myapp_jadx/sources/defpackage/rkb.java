package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.crashInitiated.model.response.WalletInfoResponse;
import com.sportygames.sportyherov2.components.OverUnderComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rkb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rkb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hvi hviVar;
        WalletInfoResponse walletInfoResponse;
        WalletInfoResponse walletInfoResponse2;
        WalletInfoResponse walletInfoResponse3;
        WalletInfoResponse walletInfoResponse4;
        ResultWrapper.GenericError error;
        final Context context;
        hvi hviVar2;
        Integer code;
        hvi hviVar3;
        String strValueOf;
        String strValueOf2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final zqy zqyVar = (zqy) obj2;
                final LoadingState loadingState = (LoadingState) obj;
                int i2 = enb.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    ytw<Boolean> ytwVar = zqyVar.p0().g0;
                    Boolean bool = Boolean.FALSE;
                    ((x5a0) ytwVar).setValue(bool);
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    String currency = (hTTPResponse == null || (walletInfoResponse4 = (WalletInfoResponse) hTTPResponse.getData()) == null) ? null : walletInfoResponse4.getCurrency();
                    if (currency != null && !StringsKt.U(currency)) {
                        zqyVar.b0 = 0;
                    } else {
                        if (zqyVar.b0 < 3) {
                            zqyVar.w0().z1();
                            zqyVar.b0++;
                            return Unit.a;
                        }
                        if (!zqyVar.K && (hviVar = zqyVar.a) != null) {
                            hviVar.E.O(100);
                        }
                        e activity = zqyVar.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                    ((x5a0) zqyVar.u0().R).setValue(bool);
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    zqyVar.T = String.valueOf((hTTPResponse2 == null || (walletInfoResponse3 = (WalletInfoResponse) hTTPResponse2.getData()) == null) ? null : walletInfoResponse3.getCurrency());
                    ip8 ip8VarS0 = zqyVar.s0();
                    HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                    String strValueOf3 = String.valueOf((hTTPResponse3 == null || (walletInfoResponse2 = (WalletInfoResponse) hTTPResponse3.getData()) == null) ? null : walletInfoResponse2.getBalance());
                    op5 op5Var = op5.a;
                    HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                    String strValueOf4 = String.valueOf((hTTPResponse4 == null || (walletInfoResponse = (WalletInfoResponse) hTTPResponse4.getData()) == null) ? null : walletInfoResponse.getCurrency());
                    op5Var.getClass();
                    ip8VarS0.z1(strValueOf3, op5.i(strValueOf4));
                    ((x5a0) zqyVar.s0().c).setValue(Boolean.TRUE);
                    ej5.c(ebs.a(zqyVar.getLifecycle()), null, null, new inb(null, zqyVar, loadingState), 3);
                } else if (i2 == 2) {
                    ((x5a0) zqyVar.u0().R).setValue(Boolean.TRUE);
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    if (zqyVar.b0 < 3) {
                        zqyVar.w0().z1();
                        zqyVar.b0++;
                        return Unit.a;
                    }
                    if (!zqyVar.K && (hviVar3 = zqyVar.a) != null) {
                        hviVar3.E.O(100);
                    }
                    final e activity2 = zqyVar.getActivity();
                    if (activity2 != null && ((error = loadingState.getError()) == null || (code = error.getCode()) == null || code.intValue() != 403)) {
                        xbg xbgVar = zqyVar.H;
                        xbgVar.getClass();
                        if (!xbgVar.isShowing() && (context = zqyVar.getContext()) != null && (hviVar2 = zqyVar.a) != null) {
                            final ComposeView composeView = hviVar2.f;
                            composeView.setViewCompositionStrategy(u6i0.c.a);
                            composeView.setContent(new op8(2058194668, new Function2() { // from class: hmb
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
                                    int i3 = 0;
                                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        if (composeView.getContext() == null) {
                                            aVar.N(724388531);
                                        } else {
                                            aVar.N(724388532);
                                            mhb mhbVar = mhb.d;
                                            zqy zqyVar2 = zqyVar;
                                            String str = (String) ((x5a0) zqyVar2.u0().i).getValue();
                                            ResultWrapper.GenericError error2 = loadingState.getError();
                                            context.getColor(R.color.sh_error_btn_color);
                                            cj5 cj5VarR0 = zqyVar2.r0();
                                            boolean zA = aVar.A(zqyVar2);
                                            Object objY = aVar.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA || objY == c0042a) {
                                                objY = new yib(zqyVar2, i3);
                                                aVar.r(objY);
                                            }
                                            Function0 function0 = (Function0) objY;
                                            Object objY2 = aVar.y();
                                            if (objY2 == c0042a) {
                                                objY2 = new zib();
                                                aVar.r(objY2);
                                            }
                                            Function0 function1 = (Function0) objY2;
                                            boolean zA2 = aVar.A(zqyVar2);
                                            Object objY3 = aVar.y();
                                            if (zA2 || objY3 == c0042a) {
                                                objY3 = new ajb(zqyVar2, 0);
                                                aVar.r(objY3);
                                            }
                                            Function0 function2 = (Function0) objY3;
                                            Object objY4 = aVar.y();
                                            if (objY4 == c0042a) {
                                                objY4 = new bjb();
                                                aVar.r(objY4);
                                            }
                                            Function1 function3 = (Function1) objY4;
                                            Object objY5 = aVar.y();
                                            if (objY5 == c0042a) {
                                                objY5 = new cjb();
                                                aVar.r(objY5);
                                            }
                                            Function1 function4 = (Function1) objY5;
                                            Object objY6 = aVar.y();
                                            if (objY6 == c0042a) {
                                                objY6 = new djb();
                                                aVar.r(objY6);
                                            }
                                            Function1 function5 = (Function1) objY6;
                                            boolean zA3 = aVar.A(zqyVar2);
                                            Object objY7 = aVar.y();
                                            if (zA3 || objY7 == c0042a) {
                                                objY7 = new ejb(zqyVar2, 0);
                                                aVar.r(objY7);
                                            }
                                            mhbVar.a(activity2, str, error2, function0, function1, function2, function3, function4, function5, (Function0) objY7, cj5VarR0, aVar, 819486720, 6);
                                            ((x5a0) mhbVar.b).setValue(Boolean.TRUE);
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
                return Unit.a;
            case 1:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) ((chp) obj2)).invoke(new yxk.h(ijf0Var));
                return Unit.a;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj2;
                int i3 = OverUnderComponent.b0;
                ((View) obj).getClass();
                if (overUnderComponent.giftItem != null) {
                    return Unit.a;
                }
                SHKeypadContainer sHKeypadContainer = overUnderComponent.R;
                if (sHKeypadContainer == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                if (sHKeypadContainer.getVisibility() == 0) {
                    SHKeypadContainer sHKeypadContainer2 = overUnderComponent.R;
                    if (sHKeypadContainer2 == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                    sHKeypadContainer2.performClick();
                }
                boolean z = overUnderComponent.M;
                GiftItem giftItem = overUnderComponent.giftItem;
                String str = "";
                if (z) {
                    if (giftItem != null && (strValueOf2 = String.valueOf(giftItem.getCurBal())) != null) {
                        str = strValueOf2;
                    }
                    wz.a("BetAmountClicked", "Sporty Hero", "OVER_UNDER", "1", str);
                } else {
                    if (giftItem != null && (strValueOf = String.valueOf(giftItem.getCurBal())) != null) {
                        str = strValueOf;
                    }
                    wz.a("BetAmountClicked", "Sporty Hero", "OVER_UNDER", "2", str);
                }
                SHKeypadContainer sHKeypadContainer3 = overUnderComponent.R;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                sHKeypadContainer3.setVisibility(0);
                overUnderComponent.binding.j0.setEnabled(true);
                overUnderComponent.binding.l0.setEnabled(false);
                overUnderComponent.z = 1;
                overUnderComponent.j();
                return Unit.a;
        }
    }
}
