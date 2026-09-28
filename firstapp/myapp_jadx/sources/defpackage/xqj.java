package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.BetChipContainerSpin2Win;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.viewmodels.FbgData;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spin2win.model.response.GameDetailsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xqj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xqj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        List<GiftItem> entityList;
        GiftItem giftItem;
        String currency;
        boolean z;
        a aVar;
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                float f = ((gu00) obj2).a;
                a7lVar.k(f);
                a7lVar.v(f);
                a7lVar.z0(brj.b);
                return Unit.a;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                Double dValueOf = Double.valueOf(0.0d);
                int i2 = a1b0.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        List<GiftItem> entityList2 = promotionGiftsResponse.getEntityList();
                        entityList2.getClass();
                        ArrayList arrayList = (ArrayList) entityList2;
                        p48.A(arrayList, new n4f(1));
                        a1b0Var.V = PromotionGiftsResponse.copy$default(promotionGiftsResponse, arrayList, 0, 0, 0, 14, null);
                        if (!a1b0Var.isRemoving() && a1b0Var.K) {
                            try {
                                GameDetails gameDetails = a1b0Var.i;
                                if (gameDetails == null || gameDetails.getDisplayName() == null) {
                                    z = false;
                                } else {
                                    new brr();
                                    z = true;
                                }
                            } catch (Exception unused) {
                            }
                            SharedPreferences sharedPreferences = a1b0Var.y;
                            if (sharedPreferences != null && !sharedPreferences.getBoolean("spin2win_one_tap", false) && z) {
                                Context context = a1b0Var.getContext();
                                String string = context != null ? context.getString(R.string.one_tap_choice_label) : null;
                                if (string == null) {
                                    string = "";
                                }
                                Context context2 = a1b0Var.getContext();
                                if (context2 != null) {
                                    e activity = a1b0Var.getActivity();
                                    FragmentManager supportFragmentManager2 = activity != null ? activity.getSupportFragmentManager() : null;
                                    op5 op5Var = op5.a;
                                    String string2 = a1b0Var.getString(R.string.otb_dialog_msg_cms);
                                    string2.getClass();
                                    op5Var.getClass();
                                    String strB = op5.b(string2, string, null);
                                    String string3 = a1b0Var.getString(R.string.yes_btn_cms);
                                    string3.getClass();
                                    String string4 = a1b0Var.getString(R.string.yes_bet);
                                    string4.getClass();
                                    String strB2 = op5.b(string3, string4, null);
                                    String string5 = a1b0Var.getString(R.string.no_btn_cms);
                                    string5.getClass();
                                    String string6 = a1b0Var.getString(R.string.no_bet);
                                    string6.getClass();
                                    a aVarA = a.C0437a.a("Spin2Win", "one tap bet", strB, "", strB2, op5.b(string5, string6, null), new n8f(a1b0Var, 2), new w0b0(), context2.getColor(R.color.redblack_confirm_dialog_left_button), context2.getColor(R.color.redblack_confirm_dialog_right_button), 12288);
                                    e activity2 = a1b0Var.getActivity();
                                    if (!(((activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a) && (((aVar = a1b0Var.A) == null || !aVar.isVisible()) && supportFragmentManager2 != null)) {
                                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                                        aVar2.f(R.id.flContent, aVarA, null);
                                        aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                                        aVar2.d();
                                    }
                                }
                            }
                        }
                        PromotionGiftsResponse promotionGiftsResponse2 = a1b0Var.V;
                        if (promotionGiftsResponse2 == null || (entityList = promotionGiftsResponse2.getEntityList()) == null || !(!entityList.isEmpty()) || !a1b0Var.K) {
                            a1b0Var.K = false;
                        } else {
                            PromotionGiftsResponse promotionGiftsResponse3 = a1b0Var.V;
                            List<GiftItem> entityList3 = promotionGiftsResponse3 != null ? promotionGiftsResponse3.getEntityList() : null;
                            if (entityList3 == null) {
                                entityList3 = m2g.a;
                            }
                            entityList3.getClass();
                            Iterator<T> it = entityList3.iterator();
                            double curBal = 0.0d;
                            while (it.hasNext()) {
                                curBal += ((GiftItem) it.next()).getCurBal();
                            }
                            PromotionGiftsResponse promotionGiftsResponse4 = a1b0Var.V;
                            List<GiftItem> entityList4 = promotionGiftsResponse4 != null ? promotionGiftsResponse4.getEntityList() : null;
                            if (entityList4 != null && (giftItem = entityList4.get(0)) != null && (currency = giftItem.getCurrency()) != null) {
                                wxi wxiVar = a1b0Var.v;
                                if (wxiVar != null) {
                                    GiftToast giftToast = wxiVar.C;
                                    op5.a.getClass();
                                    GiftToast.setToastText$default(giftToast, op5.i(currency), curBal, null, 4, null);
                                }
                                wxi wxiVar2 = a1b0Var.v;
                                if (wxiVar2 != null) {
                                    wxiVar2.C.setClickable(true);
                                }
                                ssw<FbgData> sswVar = jbh.a;
                                Double dValueOf2 = Double.valueOf(curBal);
                                op5.a.getClass();
                                sswVar.j(new FbgData(true, dValueOf2, op5.i(currency)));
                            }
                            wxi wxiVar3 = a1b0Var.v;
                            if (wxiVar3 != null) {
                                wxiVar3.C.setVisibility(0);
                            }
                            wxi wxiVar4 = a1b0Var.v;
                            if (wxiVar4 != null) {
                                wxiVar4.C.startAnimation(AnimationUtils.loadAnimation(a1b0Var.getContext(), R.anim.fade_in_fade_out_toast));
                            }
                            ej5.c(ebs.a(a1b0Var.getLifecycle()), null, null, new d1b0(a1b0Var, null), 3);
                        }
                        PromotionGiftsResponse promotionGiftsResponse5 = a1b0Var.V;
                        List<GiftItem> entityList5 = promotionGiftsResponse5 != null ? promotionGiftsResponse5.getEntityList() : null;
                        if (entityList5 == null || entityList5.isEmpty()) {
                            wxi wxiVar5 = a1b0Var.v;
                            if (wxiVar5 != null) {
                                BetChipContainerSpin2Win betChipContainerSpin2Win = wxiVar5.c;
                                GameDetailsResponse gameDetailsResponse = a1b0Var.T;
                                betChipContainerSpin2Win.F(gameDetailsResponse != null ? gameDetailsResponse.getBetChipList() : null);
                            }
                            wxi wxiVar6 = a1b0Var.v;
                            if (wxiVar6 != null) {
                                wxiVar6.c.setIfFbgAvailable(false);
                            }
                        } else {
                            wxi wxiVar7 = a1b0Var.v;
                            if (wxiVar7 != null) {
                                wxiVar7.c.setIfFbgAvailable(true);
                            }
                            wxi wxiVar8 = a1b0Var.v;
                            if (wxiVar8 != null) {
                                BetChipContainerSpin2Win betChipContainerSpin2Win2 = wxiVar8.c;
                                GameDetailsResponse gameDetailsResponse2 = a1b0Var.T;
                                ArrayList<Double> betChipList = gameDetailsResponse2 != null ? gameDetailsResponse2.getBetChipList() : null;
                                ArrayList<Double> arrayList2 = new ArrayList<>();
                                arrayList2.add(Double.valueOf(-1.0d));
                                if (betChipList != null) {
                                    arrayList2.addAll(betChipList);
                                }
                                betChipContainerSpin2Win2.F(arrayList2);
                            }
                        }
                        wxi wxiVar9 = a1b0Var.v;
                        if (wxiVar9 != null) {
                            wxiVar9.c.setMinMaxChip(dValueOf, dValueOf);
                        }
                        wxi wxiVar10 = a1b0Var.v;
                        if (wxiVar10 != null) {
                            wxiVar10.c.setBetAmount(dValueOf, dValueOf);
                        }
                        wxi wxiVar11 = a1b0Var.v;
                        if (wxiVar11 != null) {
                            wxiVar11.c.E(false);
                        }
                    }
                } else if (i2 != 2 && i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
