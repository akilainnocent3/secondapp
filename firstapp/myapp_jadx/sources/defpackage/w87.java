package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.crash.models.RainUiAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w87 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w87(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ha7 ha7Var;
        oa7 oa7Var;
        ha7 ha7Var2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj2;
                int i2 = ChatActivity.B0;
                ChatListResponse chatListResponse = (ChatListResponse) q97.a(ChatListResponse.class, (String) obj);
                if (ChatActivity.I1(chatListResponse)) {
                    chatActivity.G.add(0, chatListResponse);
                    LinearLayoutManager linearLayoutManager = chatActivity.I;
                    if (linearLayoutManager == null) {
                        Intrinsics.n("linearLayoutManager");
                        throw null;
                    }
                    if (linearLayoutManager.f1() == 0) {
                        ha7Var = (ha7) chatActivity.a;
                        if (ha7Var != null) {
                            ha7Var.M.setVisibility(8);
                        }
                        oa7Var = chatActivity.J;
                        if (oa7Var != null) {
                            Intrinsics.n("chatListAdapter");
                            throw null;
                        }
                        oa7Var.notifyItemInserted(0);
                        ha7Var2 = (ha7) chatActivity.a;
                        if (ha7Var2 != null) {
                            ha7Var2.A.o0(0);
                        }
                    } else {
                        LinearLayoutManager linearLayoutManager2 = chatActivity.I;
                        if (linearLayoutManager2 == null) {
                            Intrinsics.n("linearLayoutManager");
                            throw null;
                        }
                        if (linearLayoutManager2.f1() != -1) {
                            oa7 oa7Var2 = chatActivity.J;
                            if (oa7Var2 == null) {
                                Intrinsics.n("chatListAdapter");
                                throw null;
                            }
                            oa7Var2.notifyItemInserted(0);
                            ha7 ha7Var3 = (ha7) chatActivity.a;
                            if (ha7Var3 != null) {
                                ha7Var3.M.setVisibility(0);
                            }
                        } else {
                            ha7Var = (ha7) chatActivity.a;
                            if (ha7Var != null) {
                                ha7Var.M.setVisibility(8);
                            }
                            oa7Var = chatActivity.J;
                            if (oa7Var != null) {
                                Intrinsics.n("chatListAdapter");
                                throw null;
                            }
                            oa7Var.notifyItemInserted(0);
                            ha7Var2 = (ha7) chatActivity.a;
                            if (ha7Var2 != null) {
                                ha7Var2.A.o0(0);
                            }
                        }
                    }
                }
                return Unit.a;
            case 1:
                fgb fgbVar = (fgb) obj2;
                RainUiAction rainUiAction = (RainUiAction) obj;
                if (rainUiAction instanceof RainUiAction.SetCloudIcon) {
                    RainUiAction.SetCloudIcon setCloudIcon = (RainUiAction.SetCloudIcon) rainUiAction;
                    fgbVar.l3(setCloudIcon.getType(), setCloudIcon.getEnabled());
                } else if (Intrinsics.g(rainUiAction, RainUiAction.HideToasts.INSTANCE)) {
                    fgbVar.p2 = false;
                    fgbVar.o2 = false;
                    fgbVar.s1();
                } else if (rainUiAction instanceof RainUiAction.ShowActiveToast) {
                    fgbVar.c3(((RainUiAction.ShowActiveToast) rainUiAction).getTopicResponse());
                } else {
                    if (!Intrinsics.g(rainUiAction, RainUiAction.DeferActiveToastUntilMultiplierVisible.INSTANCE)) {
                        uhc.a();
                        return null;
                    }
                    fgbVar.y1 = true;
                }
                return Unit.a;
            default:
                ((Function1) obj2).invoke(new pvp.e(((Boolean) obj).booleanValue()));
                return Unit.a;
        }
    }
}
