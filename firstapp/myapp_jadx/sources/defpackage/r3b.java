package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.viewmodels.FbgData;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spinmatch.components.BetChips;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r3b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3b(Object obj, int i) {
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
        Context context;
        a aVar;
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((x5a0) ((n6s) obj2).q).setValue(bool);
                return Unit.a;
            default:
                kab0 kab0Var = (kab0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = kab0.a.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        List<GiftItem> entityList2 = promotionGiftsResponse.getEntityList();
                        entityList2.getClass();
                        ArrayList arrayList = (ArrayList) entityList2;
                        p48.A(arrayList, new k9b0());
                        kab0Var.A = PromotionGiftsResponse.copy$default(promotionGiftsResponse, arrayList, 0, 0, 0, 14, null);
                        if (!kab0Var.isRemoving() && kab0Var.C) {
                            try {
                                GameDetails gameDetails = kab0Var.b;
                                if (gameDetails == null || gameDetails.getDisplayName() == null) {
                                    z = false;
                                } else {
                                    new brr();
                                    z = true;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            SharedPreferences sharedPreferences = kab0Var.D;
                            if (sharedPreferences != null && !sharedPreferences.getBoolean("spin_match_one_tap", false) && z) {
                                Context context2 = kab0Var.getContext();
                                String string = context2 != null ? context2.getString(R.string.one_tap_choice_label) : null;
                                if (string != null && (context = kab0Var.getContext()) != null) {
                                    e activity = kab0Var.getActivity();
                                    FragmentManager supportFragmentManager2 = activity != null ? activity.getSupportFragmentManager() : null;
                                    op5 op5Var = op5.a;
                                    String string2 = kab0Var.getString(R.string.otb_dialog_msg_cms);
                                    string2.getClass();
                                    op5Var.getClass();
                                    String strB = op5.b(string2, string, null);
                                    String string3 = kab0Var.getString(R.string.yes_btn_cms);
                                    string3.getClass();
                                    String string4 = kab0Var.getString(R.string.yes_bet);
                                    string4.getClass();
                                    String strB2 = op5.b(string3, string4, null);
                                    String string5 = kab0Var.getString(R.string.no_btn_cms);
                                    string5.getClass();
                                    String string6 = kab0Var.getString(R.string.no_bet);
                                    string6.getClass();
                                    a aVarA = a.C0437a.a("Spin Match", Chyeyik.bTEMAJhhzIZyQn, strB, "", strB2, op5.b(string5, string6, null), new n22(kab0Var, i3), new c8b(1), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 12288);
                                    e activity2 = kab0Var.getActivity();
                                    if (!(((activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a) && (((aVar = kab0Var.V) == null || !aVar.isVisible()) && supportFragmentManager2 != null)) {
                                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                                        aVar2.f(R.id.flContent, aVarA, null);
                                        aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                                        aVar2.d();
                                    }
                                }
                            }
                        }
                        PromotionGiftsResponse promotionGiftsResponse2 = kab0Var.A;
                        if (promotionGiftsResponse2 == null || (entityList = promotionGiftsResponse2.getEntityList()) == null || !(!entityList.isEmpty()) || !kab0Var.C) {
                            kab0Var.C = false;
                        } else {
                            PromotionGiftsResponse promotionGiftsResponse3 = kab0Var.A;
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
                            PromotionGiftsResponse promotionGiftsResponse4 = kab0Var.A;
                            List<GiftItem> entityList4 = promotionGiftsResponse4 != null ? promotionGiftsResponse4.getEntityList() : null;
                            if (entityList4 != null && (giftItem = entityList4.get(0)) != null && (currency = giftItem.getCurrency()) != null) {
                                fo80 fo80Var = kab0Var.c;
                                if (fo80Var != null) {
                                    GiftToast giftToast = fo80Var.E;
                                    op5.a.getClass();
                                    GiftToast.setToastText$default(giftToast, op5.i(currency), curBal, null, 4, null);
                                }
                                fo80 fo80Var2 = kab0Var.c;
                                if (fo80Var2 != null) {
                                    fo80Var2.E.setClickable(true);
                                }
                                ssw<FbgData> sswVar = jbh.a;
                                Double dValueOf = Double.valueOf(curBal);
                                op5.a.getClass();
                                sswVar.j(new FbgData(true, dValueOf, op5.i(currency)));
                            }
                            fo80 fo80Var3 = kab0Var.c;
                            if (fo80Var3 != null) {
                                fo80Var3.E.setVisibility(0);
                            }
                            fo80 fo80Var4 = kab0Var.c;
                            if (fo80Var4 != null) {
                                fo80Var4.E.startAnimation(AnimationUtils.loadAnimation(kab0Var.getContext(), R.anim.fade_in_fade_out_toast));
                            }
                            ej5.c(ebs.a(kab0Var.getLifecycle()), null, null, new mab0(kab0Var, null), 3);
                        }
                        PromotionGiftsResponse promotionGiftsResponse5 = kab0Var.A;
                        List<GiftItem> entityList5 = promotionGiftsResponse5 != null ? promotionGiftsResponse5.getEntityList() : null;
                        if (entityList5 == null || entityList5.isEmpty()) {
                            fo80 fo80Var5 = kab0Var.c;
                            if (fo80Var5 != null) {
                                fo80Var5.i.setIfFbgAvailable(false);
                            }
                            fo80 fo80Var6 = kab0Var.c;
                            if (fo80Var6 != null) {
                                fo80Var6.i.G(kab0Var.w);
                            }
                        } else {
                            fo80 fo80Var7 = kab0Var.c;
                            if (fo80Var7 != null) {
                                fo80Var7.i.setIfFbgAvailable(true);
                            }
                            fo80 fo80Var8 = kab0Var.c;
                            if (fo80Var8 != null) {
                                BetChips betChips = fo80Var8.i;
                                ArrayList<Double> arrayList2 = kab0Var.w;
                                ArrayList<Double> arrayList3 = new ArrayList<>();
                                arrayList3.add(Double.valueOf(-1.0d));
                                if (arrayList2 != null) {
                                    arrayList3.addAll(arrayList2);
                                }
                                betChips.G(arrayList3);
                            }
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
