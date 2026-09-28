package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.spindabottle.remote.models.UserValidateResponse;
import com.sportygames.spindabottle.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w6b0 implements Function1 {
    public final /* synthetic */ b8b0 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ w6b0(b8b0 b8b0Var, boolean z) {
        this.a = b8b0Var;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x021b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    /* JADX WARN: Code duplicated, block: B:70:0x018d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01df  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UserValidateResponse userValidateResponse;
        dcb0 dcb0Var;
        HTTPResponse hTTPResponse;
        String nickName;
        HTTPResponse hTTPResponse2;
        String userId;
        fm1 fm1Var;
        fm1 fm1Var2;
        dcb0 dcb0Var2;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar;
        UserValidateResponse userValidateResponse2;
        UserValidateResponse userValidateResponse3;
        HTTPResponse hTTPResponse3;
        UserValidateResponse userValidateResponse4;
        LoadingState loadingState = (LoadingState) obj;
        int i = b8b0.a.a[loadingState.getStatus().ordinal()];
        final b8b0 b8b0Var = this.a;
        String nickName2 = null;
        int i2 = 1;
        if (i == 1) {
            HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
            if (hTTPResponse4 != null && (userValidateResponse = (UserValidateResponse) hTTPResponse4.getData()) != null) {
                if (userValidateResponse.getInsufficientBalanceMessage() == null) {
                    dcb0Var = (dcb0) b8b0Var.b;
                    if (dcb0Var != null) {
                        SGHamburgerMenu sGHamburgerMenu = dcb0Var.F;
                        hTTPResponse3 = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse3 != null && (userValidateResponse4 = (UserValidateResponse) hTTPResponse3.getData()) != null) {
                            nickName2 = userValidateResponse4.getNickName();
                        }
                        sGHamburgerMenu.setUserDetails(nickName2, userValidateResponse.getAvatarUrl());
                    }
                    hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null || (userValidateResponse3 = (UserValidateResponse) hTTPResponse.getData()) == null || (nickName = userValidateResponse3.getNickName()) == null) {
                        nickName = "";
                    }
                    b8b0Var.A = nickName;
                    SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                    hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse2 != null || (userValidateResponse2 = (UserValidateResponse) hTTPResponse2.getData()) == null || (userId = userValidateResponse2.getUserId()) == null) {
                        userId = "";
                    }
                    sportyGamesManager.setUserId(userId);
                    String avatarUrl = userValidateResponse.getAvatarUrl();
                    b8b0Var.z = avatarUrl != null ? avatarUrl : "";
                    if (this.b) {
                        fm1Var = (fm1) b8b0Var.a;
                        if (fm1Var != null) {
                            fm1Var.z1();
                        }
                        fm1Var2 = (fm1) b8b0Var.a;
                        if (fm1Var2 != null && (sswVar = fm1Var2.y) != null) {
                            sswVar.f(b8b0Var.getViewLifecycleOwner(), new b8b0.c(new j7b0(b8b0Var, 1 == true ? 1 : 0)));
                        }
                        dcb0Var2 = (dcb0) b8b0Var.b;
                        if (dcb0Var2 != null) {
                            dcb0Var2.M.P();
                        }
                    }
                } else {
                    xbg xbgVar = b8b0Var.B;
                    if (xbgVar == null) {
                        Intrinsics.n("errorDialog");
                        throw null;
                    }
                    if (xbgVar.isShowing()) {
                        dcb0Var = (dcb0) b8b0Var.b;
                        if (dcb0Var != null) {
                            SGHamburgerMenu sGHamburgerMenu2 = dcb0Var.F;
                            hTTPResponse3 = (HTTPResponse) loadingState.getData();
                            if (hTTPResponse3 != null) {
                                nickName2 = userValidateResponse4.getNickName();
                            }
                            sGHamburgerMenu2.setUserDetails(nickName2, userValidateResponse.getAvatarUrl());
                        }
                        hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse != null) {
                            nickName = "";
                        } else {
                            nickName = "";
                        }
                        b8b0Var.A = nickName;
                        SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
                        hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse2 != null) {
                            userId = "";
                        } else {
                            userId = "";
                        }
                        sportyGamesManager2.setUserId(userId);
                        String avatarUrl2 = userValidateResponse.getAvatarUrl();
                        b8b0Var.z = avatarUrl2 != null ? avatarUrl2 : "";
                        if (this.b) {
                            fm1Var = (fm1) b8b0Var.a;
                            if (fm1Var != null) {
                                fm1Var.z1();
                            }
                            fm1Var2 = (fm1) b8b0Var.a;
                            if (fm1Var2 != null) {
                                sswVar.f(b8b0Var.getViewLifecycleOwner(), new b8b0.c(new j7b0(b8b0Var, 1 == true ? 1 : 0)));
                            }
                            dcb0Var2 = (dcb0) b8b0Var.b;
                            if (dcb0Var2 != null) {
                                dcb0Var2.M.P();
                            }
                        }
                    } else {
                        e activity = b8b0Var.getActivity();
                        if (activity != null) {
                            dcb0 dcb0Var3 = (dcb0) b8b0Var.b;
                            if (dcb0Var3 != null) {
                                dcb0Var3.M.O(100);
                            }
                            u35 u35Var = u35.e;
                            if (b8b0Var.J == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            jcg.d(u35Var, activity, "Spin da' Bottle", new ResultWrapper.GenericError(80001, new HTTPResponse(80001, b8b0Var.getString(R.string.redblack_err_80001), null, null, null, null, null, 64, null)), new cx6(b8b0Var, 1 == true ? 1 : 0), null, null, 0, activity.getColor(R.color.try_again_color), null, null, null, new f7b0(b8b0Var, 0), null, 97760);
                        }
                    }
                }
            }
        } else if (i != 2) {
            if (i != 3) {
                uhc.a();
                return null;
            }
            e activity2 = b8b0Var.getActivity();
            if (activity2 != null) {
                dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                if (dcb0Var4 != null) {
                    dcb0Var4.M.O(100);
                }
                if (loadingState.getError() != null) {
                    Integer code = loadingState.getError().getCode();
                    if (code == null || code.intValue() != 403 || b8b0Var.k0) {
                        Integer code2 = loadingState.getError().getCode();
                        if (code2 == null || code2.intValue() != 403) {
                            xbg xbgVar2 = b8b0Var.B;
                            if (xbgVar2 == null) {
                                Intrinsics.n("errorDialog");
                                throw null;
                            }
                            if (!xbgVar2.isShowing()) {
                                u35 u35Var2 = u35.e;
                                if (b8b0Var.J == null) {
                                    Intrinsics.n("soundViewModel");
                                    throw null;
                                }
                                jcg.d(u35Var2, activity2, "Spin da' Bottle", loadingState.getError(), new fg20(b8b0Var, 1), null, null, 0, activity2.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: g7b0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        String str = (String) obj2;
                                        str.getClass();
                                        b8b0Var.t0(str);
                                        return Unit.a;
                                    }
                                }, null, 97760);
                            }
                        }
                    } else {
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                        b8b0Var.k0 = true;
                    }
                } else {
                    u35 u35Var3 = u35.e;
                    if (b8b0Var.J == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    jcg.d(u35Var3, activity2, "Spin da' Bottle", loadingState.getError(), new ig20(b8b0Var, i2), null, null, 0, activity2.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: h7b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            String str = (String) obj2;
                            str.getClass();
                            b8b0Var.t0(str);
                            return Unit.a;
                        }
                    }, null, 97760);
                }
            }
        }
        return Unit.a;
    }
}
