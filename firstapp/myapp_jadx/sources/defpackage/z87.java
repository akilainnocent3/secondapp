package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sportygames.chat.remote.models.AddGroupResponse;
import com.sportygames.chat.remote.models.RainDetailInfoResponse;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.StatusChat;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z87 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z87(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean nickNameAvailable;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final ChatActivity chatActivity = (ChatActivity) obj2;
                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                int i2 = ChatActivity.B0;
                int i3 = ChatActivity.a.a[loadingStateChat.getStatus().ordinal()];
                if (i3 == 1) {
                    AddGroupResponse addGroupResponse = (AddGroupResponse) loadingStateChat.getData();
                    boolean zBooleanValue = (addGroupResponse == null || (nickNameAvailable = addGroupResponse.getNickNameAvailable()) == null) ? false : nickNameAvailable.booleanValue();
                    chatActivity.i = zBooleanValue;
                    if (!zBooleanValue) {
                        ha7 ha7Var = (ha7) chatActivity.a;
                        if (ha7Var != null) {
                            ha7Var.K.setFocusable(false);
                        }
                        ha7 ha7Var2 = (ha7) chatActivity.a;
                        if (ha7Var2 != null) {
                            ha7Var2.K.setClickable(true);
                        }
                    }
                    chatActivity.G1().b.l(chatActivity);
                    sh7 sh7VarG1 = chatActivity.G1();
                    String str = chatActivity.L;
                    AddGroupResponse addGroupResponse2 = (AddGroupResponse) loadingStateChat.getData();
                    String strValueOf = String.valueOf(addGroupResponse2 != null ? Integer.valueOf(addGroupResponse2.getLastMessageNo()) : null);
                    str.getClass();
                    ej5.c(o8i0.d(sh7VarG1), null, null, new mh7(sh7VarG1, str, strValueOf, null), 3);
                    chatActivity.G1().d.f(chatActivity, new v97(new Function1() { // from class: f97
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            LoadingStateChat loadingStateChat2 = (LoadingStateChat) obj3;
                            int i4 = ChatActivity.B0;
                            int i5 = ChatActivity.a.a[loadingStateChat2.getStatus().ordinal()];
                            ChatActivity chatActivity2 = chatActivity;
                            if (i5 == 1) {
                                chatActivity2.G1().d.l(chatActivity2);
                                ha7 ha7Var3 = (ha7) chatActivity2.a;
                                if (ha7Var3 != null) {
                                    ha7Var3.W.setVisibility(8);
                                }
                                ha7 ha7Var4 = (ha7) chatActivity2.a;
                                if (ha7Var4 != null) {
                                    ha7Var4.F.setVisibility(8);
                                }
                                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, true);
                                chatActivity2.I = linearLayoutManager;
                                ha7 ha7Var5 = (ha7) chatActivity2.a;
                                if (ha7Var5 != null) {
                                    ha7Var5.A.setLayoutManager(linearLayoutManager);
                                }
                                List<ChatListResponse> listB = y8h0.b(loadingStateChat2.getData());
                                listB.getClass();
                                chatActivity2.G = listB;
                                if (listB.size() > 0) {
                                    List<ChatListResponse> list = chatActivity2.G;
                                    String str2 = chatActivity2.d;
                                    c28 c28Var = (c28) chatActivity2.D.getValue();
                                    y720 y720Var = (y720) chatActivity2.F.getValue();
                                    i97 i97Var = new i97(chatActivity2, 0);
                                    oa7 oa7Var = new oa7();
                                    oa7Var.a = chatActivity2;
                                    oa7Var.b = list;
                                    oa7Var.c = str2;
                                    oa7Var.d = c28Var;
                                    oa7Var.e = y720Var;
                                    oa7Var.f = chatActivity2;
                                    oa7Var.i = i97Var;
                                    chatActivity2.J = oa7Var;
                                    ha7 ha7Var6 = (ha7) chatActivity2.a;
                                    if (ha7Var6 != null) {
                                        ha7Var6.A.setAdapter(oa7Var);
                                    }
                                    ha7 ha7Var7 = (ha7) chatActivity2.a;
                                    if (ha7Var7 != null) {
                                        ha7Var7.A.setItemViewCacheSize(chatActivity2.G.size());
                                    }
                                    op5 op5Var = op5.a;
                                    ha7 ha7Var8 = (ha7) chatActivity2.a;
                                    op5.r(op5Var, b.f(ha7Var8 != null ? ha7Var8.Q : null, ha7Var8 != null ? ha7Var8.y : null, ha7Var8 != null ? ha7Var8.N : null, ha7Var8 != null ? ha7Var8.K : null, ha7Var8 != null ? ha7Var8.c.C : null, ha7Var8 != null ? ha7Var8.c.J : null, ha7Var8 != null ? ha7Var8.c.K : null, ha7Var8 != null ? ha7Var8.c.C : null, ha7Var8 != null ? ha7Var8.c.b : null, ha7Var8 != null ? ha7Var8.V : null), null, 4);
                                } else {
                                    ha7 ha7Var9 = (ha7) chatActivity2.a;
                                    if (ha7Var9 != null) {
                                        ha7Var9.O.setVisibility(0);
                                    }
                                    op5 op5Var2 = op5.a;
                                    ha7 ha7Var10 = (ha7) chatActivity2.a;
                                    op5.r(op5Var2, b.f(ha7Var10 != null ? ha7Var10.Q : null, ha7Var10 != null ? ha7Var10.y : null, ha7Var10 != null ? ha7Var10.O : null), null, 4);
                                }
                            } else if (i5 == 2) {
                                op5 op5Var3 = op5.a;
                                ha7 ha7Var11 = (ha7) chatActivity2.a;
                                op5.r(op5Var3, b.f(ha7Var11 != null ? ha7Var11.Q : null, ha7Var11 != null ? ha7Var11.y : null, ha7Var11 != null ? ha7Var11.S : null, ha7Var11 != null ? ha7Var11.Y : null), null, 4);
                                ha7 ha7Var12 = (ha7) chatActivity2.a;
                                if (ha7Var12 != null) {
                                    ha7Var12.W.setVisibility(8);
                                }
                                ha7 ha7Var13 = (ha7) chatActivity2.a;
                                if (ha7Var13 != null) {
                                    ha7Var13.F.setVisibility(0);
                                }
                            } else {
                                if (i5 != 3) {
                                    uhc.a();
                                    return null;
                                }
                                ha7 ha7Var14 = (ha7) chatActivity2.a;
                                if (ha7Var14 != null) {
                                    ha7Var14.W.setVisibility(0);
                                }
                            }
                            return Unit.a;
                        }
                    }));
                } else if (i3 == 2) {
                    ha7 ha7Var3 = (ha7) chatActivity.a;
                    if (ha7Var3 != null) {
                        ha7Var3.W.setVisibility(8);
                    }
                    ha7 ha7Var4 = (ha7) chatActivity.a;
                    if (ha7Var4 != null) {
                        ha7Var4.F.setVisibility(0);
                    }
                }
                break;
            default:
                LoadingStateChat loadingStateChat2 = (LoadingStateChat) obj;
                lw30 lw30VarI1 = ((fgb) obj2).i1();
                vv30 vv30Var = lw30VarI1.a;
                ssw<RainDetailInfoResponse> sswVar = lw30VarI1.y;
                StatusChat status = loadingStateChat2 != null ? loadingStateChat2.getStatus() : null;
                int i4 = status == null ? -1 : lw30.a.a[status.ordinal()];
                if (i4 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat2.getData();
                    RainDetailInfoResponse rainDetailInfoResponse = hTTPResponse != null ? (RainDetailInfoResponse) hTTPResponse.getData() : null;
                    vv30Var.getClass();
                    sswVar.m(rainDetailInfoResponse);
                } else if (i4 == 2) {
                    vv30Var.getClass();
                    sswVar.m(null);
                }
                break;
        }
        return Unit.a;
    }
}
