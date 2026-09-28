package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.evenodd.remote.models.UserValidateResponse;
import com.sportygames.evenodd.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class peg implements Function1 {
    public final /* synthetic */ fgg a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ peg(fgg fggVar, boolean z) {
        this.a = fggVar;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01db  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f7  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UserValidateResponse userValidateResponse;
        e activity;
        jhg jhgVar;
        HTTPResponse hTTPResponse;
        String nickName;
        jhg jhgVar2;
        bo1 bo1Var;
        bo1 bo1Var2;
        bo1 bo1Var3;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar2;
        UserValidateResponse userValidateResponse2;
        HTTPResponse hTTPResponse2;
        UserValidateResponse userValidateResponse3;
        LoadingState loadingState = (LoadingState) obj;
        int i = fgg.a.a[loadingState.getStatus().ordinal()];
        int i2 = 0;
        final fgg fggVar = this.a;
        String nickName2 = null;
        int i3 = 1;
        if (i == 1) {
            HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
            if (hTTPResponse3 != null && (userValidateResponse = (UserValidateResponse) hTTPResponse3.getData()) != null) {
                if (userValidateResponse.isAllowedToPlay() && userValidateResponse.getInsufficientBalanceMessage() == null) {
                    jhgVar = (jhg) fggVar.b;
                    if (jhgVar != null) {
                        SGHamburgerMenu sGHamburgerMenu = jhgVar.M;
                        hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse2 != null) {
                            nickName2 = userValidateResponse3.getNickName();
                        }
                        sGHamburgerMenu.setUserDetails(nickName2, userValidateResponse.getAvatarUrl());
                    }
                    fggVar.c = false;
                    hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null) {
                        nickName = "";
                    } else {
                        nickName = "";
                    }
                    fggVar.w = nickName;
                    SportyGamesManager.getInstance().setUserId(userValidateResponse.getUserId());
                    String avatarUrl = userValidateResponse.getAvatarUrl();
                    fggVar.v = avatarUrl != null ? avatarUrl : "";
                    if (this.b) {
                        jhgVar2 = (jhg) fggVar.b;
                        if (jhgVar2 != null) {
                            jhgVar2.W.P();
                        }
                        bo1Var = (bo1) fggVar.a;
                        if (bo1Var != null) {
                            sswVar2.l(fggVar.getViewLifecycleOwner());
                        }
                        bo1Var2 = (bo1) fggVar.a;
                        if (bo1Var2 != null) {
                            bo1Var2.B1();
                        }
                        bo1Var3 = (bo1) fggVar.a;
                        if (bo1Var3 != null) {
                            sswVar.f(fggVar.getViewLifecycleOwner(), new fgg.g(new qfg(fggVar, 1 == true ? 1 : 0)));
                        }
                    }
                } else {
                    xbg xbgVar = fggVar.z;
                    if (xbgVar == null) {
                        Intrinsics.n("errorDialog");
                        throw null;
                    }
                    if (xbgVar.isShowing()) {
                        jhgVar = (jhg) fggVar.b;
                        if (jhgVar != null) {
                            SGHamburgerMenu sGHamburgerMenu2 = jhgVar.M;
                            hTTPResponse2 = (HTTPResponse) loadingState.getData();
                            if (hTTPResponse2 != null && (userValidateResponse3 = (UserValidateResponse) hTTPResponse2.getData()) != null) {
                                nickName2 = userValidateResponse3.getNickName();
                            }
                            sGHamburgerMenu2.setUserDetails(nickName2, userValidateResponse.getAvatarUrl());
                        }
                        fggVar.c = false;
                        hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse != null || (userValidateResponse2 = (UserValidateResponse) hTTPResponse.getData()) == null || (nickName = userValidateResponse2.getNickName()) == null) {
                            nickName = "";
                        }
                        fggVar.w = nickName;
                        SportyGamesManager.getInstance().setUserId(userValidateResponse.getUserId());
                        String avatarUrl2 = userValidateResponse.getAvatarUrl();
                        fggVar.v = avatarUrl2 != null ? avatarUrl2 : "";
                        if (this.b) {
                            jhgVar2 = (jhg) fggVar.b;
                            if (jhgVar2 != null) {
                                jhgVar2.W.P();
                            }
                            bo1Var = (bo1) fggVar.a;
                            if (bo1Var != null && (sswVar2 = bo1Var.v) != null) {
                                sswVar2.l(fggVar.getViewLifecycleOwner());
                            }
                            bo1Var2 = (bo1) fggVar.a;
                            if (bo1Var2 != null) {
                                bo1Var2.B1();
                            }
                            bo1Var3 = (bo1) fggVar.a;
                            if (bo1Var3 != null && (sswVar = bo1Var3.v) != null) {
                                sswVar.f(fggVar.getViewLifecycleOwner(), new fgg.g(new qfg(fggVar, 1 == true ? 1 : 0)));
                            }
                        }
                    } else {
                        Context context = fggVar.getContext();
                        if (context != null && (activity = fggVar.getActivity()) != null) {
                            jhg jhgVar3 = (jhg) fggVar.b;
                            if (jhgVar3 != null) {
                                jhgVar3.W.O(100);
                            }
                            fdg fdgVar = fdg.e;
                            fggVar.D0();
                            jcg.d(fdgVar, activity, "Even-Odd", new ResultWrapper.GenericError(80001, new HTTPResponse(80001, fggVar.getString(R.string.redblack_err_80001), null, null, null, null, null, 64, null)), new Function0() { // from class: lfg
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    fggVar.s0();
                                    return Unit.a;
                                }
                            }, null, null, 0, context.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: mfg
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    String str = (String) obj2;
                                    str.getClass();
                                    fggVar.t0(str);
                                    return Unit.a;
                                }
                            }, null, 97760);
                        }
                    }
                }
            }
        } else if (i != 2) {
            if (i != 3) {
                uhc.a();
                return null;
            }
            e activity2 = fggVar.getActivity();
            if (activity2 != null) {
                jhg jhgVar4 = (jhg) fggVar.b;
                if (jhgVar4 != null) {
                    jhgVar4.W.O(100);
                }
                if (loadingState.getError() != null) {
                    Integer code = loadingState.getError().getCode();
                    if (code == null || code.intValue() != 403 || fggVar.p0) {
                        Integer code2 = loadingState.getError().getCode();
                        if (code2 == null || code2.intValue() != 403) {
                            xbg xbgVar2 = fggVar.z;
                            if (xbgVar2 == null) {
                                Intrinsics.n("errorDialog");
                                throw null;
                            }
                            if (!xbgVar2.isShowing()) {
                                fdg fdgVar2 = fdg.e;
                                fggVar.D0();
                                jcg.d(fdgVar2, activity2, "Even-Odd", loadingState.getError(), new nfg(fggVar, i2), null, null, 0, activity2.getColor(R.color.try_again_color), null, null, null, new ofg(fggVar, 0), null, 97760);
                            }
                        }
                    } else {
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                        fggVar.p0 = true;
                    }
                } else {
                    fdg fdgVar3 = fdg.e;
                    fggVar.D0();
                    jcg.d(fdgVar3, activity2, "Even-Odd", loadingState.getError(), new gw7(fggVar, i3), null, null, 0, activity2.getColor(R.color.try_again_color), null, null, null, new pfg(fggVar, i2), null, 97760);
                }
            }
        }
        return Unit.a;
    }
}
