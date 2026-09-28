package defpackage;

import com.sportybet.android.auth.SportyAccountManagerImpl;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.chat.views.ChatActivity.c;
import com.sportygames.sportyherov2.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e97 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e97(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ha7 ha7Var;
        ha7 ha7Var2;
        ha7 ha7Var3;
        ha7 ha7Var4;
        ha7 ha7Var5;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj2;
                int i2 = ChatActivity.B0;
                MultiplierResponse multiplierResponse = (MultiplierResponse) q97.a(MultiplierResponse.class, (String) obj);
                chatActivity.n0 = multiplierResponse.getRoundId();
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_WAITING")) {
                    oa7 oa7Var = chatActivity.J;
                    if (oa7Var != null) {
                        oa7Var.notifyDataSetChanged();
                    }
                    if (!chatActivity.T && (ha7Var5 = (ha7) chatActivity.a) != null) {
                        ha7Var5.a0.setVisibility(0);
                    }
                    ha7 ha7Var6 = (ha7) chatActivity.a;
                    if (ha7Var6 != null) {
                        ha7Var6.P.setVisibility(8);
                    }
                    ha7 ha7Var7 = (ha7) chatActivity.a;
                    if (ha7Var7 != null) {
                        ha7Var7.U.setMax(10000);
                    }
                    if (!chatActivity.k0) {
                        if (!chatActivity.T && (ha7Var4 = (ha7) chatActivity.a) != null) {
                            ha7Var4.a0.setVisibility(0);
                        }
                        ha7 ha7Var8 = (ha7) chatActivity.a;
                        if (ha7Var8 != null) {
                            ha7Var8.P.setVisibility(8);
                        }
                        multiplierResponse.getTotalMillis();
                        chatActivity.k0 = true;
                        ha7 ha7Var9 = (ha7) chatActivity.a;
                        if (ha7Var9 != null) {
                            ha7Var9.U.setMax(multiplierResponse.getTotalMillis());
                        }
                        pfd pfdVar = fse.a;
                        chatActivity.j0 = w5b.a(gku.a);
                        chatActivity.l0 = multiplierResponse.getMillisLeft();
                        chatActivity.m0 = multiplierResponse.getMillisLeft();
                        ej5.c(chatActivity.j0, null, null, chatActivity.new c(null), 3);
                    }
                }
                if (multiplierResponse.getMessageType().equals("ROUND_PRE_START")) {
                    chatActivity.k0 = false;
                    ha7 ha7Var10 = (ha7) chatActivity.a;
                    if (ha7Var10 != null) {
                        ha7Var10.a0.setVisibility(8);
                    }
                    if (!chatActivity.T && (ha7Var3 = (ha7) chatActivity.a) != null) {
                        ha7Var3.P.setVisibility(0);
                    }
                    ha7 ha7Var11 = (ha7) chatActivity.a;
                    if (ha7Var11 != null) {
                        ha7Var11.C.setVisibility(8);
                    }
                    ha7 ha7Var12 = (ha7) chatActivity.a;
                    if (ha7Var12 != null) {
                        ha7Var12.H.setVisibility(8);
                    }
                }
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING")) {
                    chatActivity.k0 = false;
                    ha7 ha7Var13 = (ha7) chatActivity.a;
                    if (ha7Var13 != null) {
                        ha7Var13.C.setVisibility(0);
                    }
                    ha7 ha7Var14 = (ha7) chatActivity.a;
                    if (ha7Var14 != null) {
                        ha7Var14.a0.setVisibility(8);
                    }
                    if (!chatActivity.T && (ha7Var2 = (ha7) chatActivity.a) != null) {
                        ha7Var2.P.setVisibility(0);
                    }
                    ha7 ha7Var15 = (ha7) chatActivity.a;
                    if (ha7Var15 != null) {
                        ha7Var15.H.setVisibility(8);
                    }
                    ha7 ha7Var16 = (ha7) chatActivity.a;
                    if (ha7Var16 != null) {
                        r97.a(ha7Var16.C, multiplierResponse.getCurrentMultiplier(), "x");
                    }
                    ha7 ha7Var17 = (ha7) chatActivity.a;
                    if (ha7Var17 != null) {
                        ha7Var17.C.setTextColor(chatActivity.getColor(R.color.white));
                    }
                }
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
                    chatActivity.k0 = false;
                    ha7 ha7Var18 = (ha7) chatActivity.a;
                    if (ha7Var18 != null) {
                        r97.a(ha7Var18.C, multiplierResponse.getCurrentMultiplier(), "x");
                    }
                    ha7 ha7Var19 = (ha7) chatActivity.a;
                    if (ha7Var19 != null) {
                        ha7Var19.C.setVisibility(0);
                    }
                    ha7 ha7Var20 = (ha7) chatActivity.a;
                    if (ha7Var20 != null) {
                        ha7Var20.a0.setVisibility(8);
                    }
                    if (!chatActivity.T && (ha7Var = (ha7) chatActivity.a) != null) {
                        ha7Var.P.setVisibility(0);
                    }
                    ha7 ha7Var21 = (ha7) chatActivity.a;
                    if (ha7Var21 != null) {
                        ha7Var21.C.setTextColor(chatActivity.getColor(R.color.sh_seekbar));
                    }
                    ha7 ha7Var22 = (ha7) chatActivity.a;
                    if (ha7Var22 != null) {
                        ha7Var22.H.setVisibility(0);
                    }
                }
                return Unit.a;
            default:
                return SportyAccountManagerImpl.setLastAvatarUrl$lambda$0((String) obj2, (t8) obj);
        }
    }
}
