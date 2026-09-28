package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spin2win.model.response.ChatRoomResponse;
import com.sportygames.spin2win.model.response.WalletInfoResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d4y implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<ChatRoomResponse> list;
        ChatRoomResponse chatRoomResponse;
        ChatRoomResponse chatRoomResponse2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((t3y) ((List) obj2).get(((Integer) obj).intValue())).a());
            case 1:
                a1b0 a1b0Var = (a1b0) obj2;
                ((View) obj).getClass();
                try {
                    Context context = a1b0Var.getContext();
                    if (context != null && (list = a1b0Var.Q) != null && !list.isEmpty()) {
                        GameDetails gameDetails = a1b0Var.i;
                        wz.a("ChatClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                        Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
                        String string = a1b0Var.getString(R.string.room_id);
                        List<ChatRoomResponse> list2 = a1b0Var.Q;
                        String chatRoomId = (list2 == null || (chatRoomResponse2 = list2.get(0)) == null) ? null : chatRoomResponse2.getChatRoomId();
                        String str = "";
                        if (chatRoomId == null) {
                            chatRoomId = "";
                        }
                        intent.putExtra(string, chatRoomId);
                        String string2 = a1b0Var.getString(R.string.bot_id);
                        List<ChatRoomResponse> list3 = a1b0Var.Q;
                        String botUserId = (list3 == null || (chatRoomResponse = list3.get(0)) == null) ? null : chatRoomResponse.getBotUserId();
                        if (botUserId == null) {
                            botUserId = "";
                        }
                        intent.putExtra(string2, botUserId);
                        intent.putExtra(a1b0Var.getString(R.string.color), R.color.toolbar_strip_bottle);
                        String string3 = a1b0Var.getString(R.string.game_name);
                        GameDetails gameDetails2 = a1b0Var.i;
                        String name = gameDetails2 != null ? gameDetails2.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        intent.putExtra(string3, name);
                        intent.putExtra(a1b0Var.getString(R.string.sound), a1b0Var.i);
                        op5 op5Var = op5.a;
                        WalletInfoResponse walletInfoResponse = a1b0Var.P;
                        String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
                        if (currency != null) {
                            str = currency;
                        }
                        op5Var.getClass();
                        intent.putExtra("currency", op5.i(str));
                        String string4 = a1b0Var.getString(R.string.sound_on);
                        SharedPreferences sharedPreferences = a1b0Var.y;
                        intent.putExtra(string4, sharedPreferences != null ? sharedPreferences.getBoolean("spin2win_sound", true) : false);
                        a1b0Var.g0.b(intent);
                    }
                    break;
                } catch (Exception unused) {
                }
                return Unit.a;
            default:
                vi0 vi0Var = (vi0) obj;
                ((Function2) obj2).invoke(((x5a0) vi0Var.e).getValue(), gjs.b.b.invoke(vi0Var.f));
                return Unit.a;
        }
    }
}
