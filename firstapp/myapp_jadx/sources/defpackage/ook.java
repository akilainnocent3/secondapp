package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.fragment.app.e;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ook implements Function1 {
    public final /* synthetic */ rok a;

    public /* synthetic */ ook(rok rokVar) {
        this.a = rokVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zD;
        List<GiftGroup> list = (List) obj;
        final rok rokVar = this.a;
        thd0 thd0Var = rokVar.i;
        ArrayList<GiftDetails> arrayList = rokVar.z;
        if (thd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        thd0Var.c.E();
        if (list == null || list.isEmpty()) {
            if (rokVar.A) {
                thd0 thd0Var2 = rokVar.i;
                if (thd0Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                thd0Var2.d.n();
            }
            if (arrayList == null || arrayList.size() == 0) {
                thd0 thd0Var3 = rokVar.i;
                if (thd0Var3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                thd0Var3.c.I();
            } else if (((uqm) p7.b.getValue()).isLogin()) {
                zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
            } else {
                rokVar.dismiss();
            }
            return Unit.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (GiftGroup giftGroup : list) {
            if (!giftGroup.getGifts().isEmpty()) {
                Iterator<T> it = giftGroup.getGifts().iterator();
                while (it.hasNext()) {
                    ((GiftDetails) it.next()).setType(giftGroup.getType());
                }
                if (giftGroup.getType() == 10) {
                    List<GiftDetails> gifts = giftGroup.getGifts();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (GiftDetails giftDetails : gifts) {
                        double d = Double.parseDouble(bjb0.X(giftDetails.getLeastOrderAmount()));
                        if (rokVar.G) {
                            long j = rokVar.F;
                            zD = j == 0 || ((double) j) >= d;
                        } else {
                            zpk zpkVar = rokVar.L;
                            if (zpkVar == null) {
                                Intrinsics.n("giftPickerDelegate");
                                throw null;
                            }
                            zD = zpkVar.d(giftDetails);
                        }
                        giftDetails.setAvailable(zD);
                        if (giftDetails.isAvailable()) {
                            zpk zpkVar2 = rokVar.L;
                            if (zpkVar2 == null) {
                                Intrinsics.n("giftPickerDelegate");
                                throw null;
                            }
                            if (zpkVar2.a()) {
                                zpk zpkVar3 = rokVar.L;
                                if (zpkVar3 == null) {
                                    Intrinsics.n("giftPickerDelegate");
                                    throw null;
                                }
                                if (zpkVar3.b(giftDetails)) {
                                    arrayList3.add(giftDetails);
                                } else {
                                    giftDetails.setType(-10);
                                    giftDetails.setDisplayGroupType(1);
                                    arrayList4.add(giftDetails);
                                }
                            } else {
                                int i = rokVar.K;
                                List<Integer> betTypeScopes = giftDetails.getBetTypeScopes();
                                if (!betTypeScopes.isEmpty()) {
                                    Iterator<Integer> it2 = betTypeScopes.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            int iIntValue = it2.next().intValue();
                                            if (iIntValue == i || iIntValue == 0) {
                                                if (giftDetails.getKind() != 3 || giftDetails.getType() != 10 || rokVar.J) {
                                                    arrayList3.add(giftDetails);
                                                }
                                            }
                                        }
                                    }
                                }
                                giftDetails.setType(-10);
                                giftDetails.setDisplayGroupType(1);
                                arrayList4.add(giftDetails);
                            }
                        } else {
                            giftDetails.setType(20);
                            giftDetails.setDisplayGroupType(1);
                            arrayList5.add(giftDetails);
                        }
                    }
                    o48.v(new tok(new uok(new sok(rokVar))), arrayList3);
                    arrayList2.addAll(CollectionsKt.i0(arrayList5, CollectionsKt.i0(arrayList4, arrayList3)));
                } else {
                    arrayList2.addAll(giftGroup.getGifts());
                }
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            GiftDetails giftDetails2 = (GiftDetails) it3.next();
            if (!giftDetails2.shouldVerifyBvn()) {
                zpk zpkVar4 = rokVar.L;
                if (zpkVar4 == null) {
                    Intrinsics.n("giftPickerDelegate");
                    throw null;
                }
                if (!zpkVar4.e(giftDetails2.getKind())) {
                }
            }
            it3.remove();
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        rvi.a(rokVar);
        if (rokVar.B == null) {
            e eVarRequireActivity = rokVar.requireActivity();
            eVarRequireActivity.getClass();
            boolean z = rokVar.G;
            long j2 = rokVar.F;
            String str = rokVar.D;
            Integer numValueOf = Integer.valueOf(rokVar.E);
            zpk zpkVar5 = rokVar.L;
            if (zpkVar5 == null) {
                Intrinsics.n("giftPickerDelegate");
                throw null;
            }
            lq1 lq1Var = rokVar.w;
            if (lq1Var == null) {
                Intrinsics.n("boConfigSource");
                throw null;
            }
            m840 m840Var = new m840(eVarRequireActivity, arrayList, z, j2, str, numValueOf, zpkVar5, qq1.a(lq1Var, BOConfigParam.CashoutSupportGiftEnabled, false), rokVar);
            rokVar.B = m840Var;
            thd0 thd0Var4 = rokVar.i;
            if (thd0Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            thd0Var4.d.setAdapter(m840Var);
        }
        if (rokVar.A) {
            rokVar.A = false;
        }
        if (arrayList.size() == 0) {
            thd0 thd0Var5 = rokVar.i;
            if (thd0Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            thd0Var5.c.getEmptyView().setTextColor(Color.parseColor("#9ca0ab"));
            thd0 thd0Var6 = rokVar.i;
            if (thd0Var6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            thd0Var6.c.getEmptyView().setTextSize(14.0f);
            thd0 thd0Var7 = rokVar.i;
            if (thd0Var7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            LoadingView loadingView = thd0Var7.c;
            Context context = rokVar.getContext();
            loadingView.H(context != null ? sn5.b(context, R.string.component_coupon__you_have_no_available_gifts_at_this_time, new Object[0]) : null);
            thd0 thd0Var8 = rokVar.i;
            if (thd0Var8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            thd0Var8.c.L(new View.OnClickListener() { // from class: pok
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rok rokVar2 = rokVar;
                    thd0 thd0Var9 = rokVar2.i;
                    if (thd0Var9 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    thd0Var9.c.L(null);
                    rokVar2.m0();
                }
            });
        } else {
            m840 m840Var2 = rokVar.B;
            if (m840Var2 != null) {
                m840Var2.notifyDataSetChanged();
            }
            thd0 thd0Var9 = rokVar.i;
            if (thd0Var9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            thd0Var9.d.n();
        }
        return Unit.a;
    }
}
