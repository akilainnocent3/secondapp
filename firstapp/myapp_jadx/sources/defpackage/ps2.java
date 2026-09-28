package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.pocketrocket.model.response.BetHistoryItem;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ps2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final q820 a;
    public BetHistoryItem b;

    @c0d(c = "com.sportygames.pocketrocket.views.adapter.viewholder.BetHistoryItemViewHolder$fillDetails$2", f = "BetHistoryItemViewHolder.kt", l = {83, 92, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public AppCompatImageView a;
        public int b;
        public final /* synthetic */ BetHistoryItem c;
        public final /* synthetic */ ps2 d;
        public final /* synthetic */ Activity e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BetHistoryItem betHistoryItem, ps2 ps2Var, Activity activity, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = betHistoryItem;
            this.d = ps2Var;
            this.e = activity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            AppCompatImageView appCompatImageView3;
            q820 q820Var = this.d.a;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                String rocketType = this.c.getRocketType();
                boolean zG = Intrinsics.g(rocketType, "RED");
                Activity activity = this.e;
                if (zG) {
                    AppCompatImageView appCompatImageView4 = q820Var.I;
                    s4u<String, Bitmap> s4uVar = r9n.a;
                    this.a = appCompatImageView4;
                    this.b = 1;
                    Object objC = r9n.c(this, activity, "red_rocket_with_fire_png");
                    if (objC != y5bVar) {
                        obj = objC;
                        appCompatImageView3 = appCompatImageView4;
                        appCompatImageView3.setImageBitmap((Bitmap) obj);
                    }
                } else if (Intrinsics.g(rocketType, "BLUE")) {
                    AppCompatImageView appCompatImageView5 = q820Var.I;
                    s4u<String, Bitmap> s4uVar2 = r9n.a;
                    this.a = appCompatImageView5;
                    this.b = 2;
                    Object objC2 = r9n.c(this, activity, "blue_rocket_with_fire_png");
                    if (objC2 != y5bVar) {
                        obj = objC2;
                        appCompatImageView2 = appCompatImageView5;
                        appCompatImageView2.setImageBitmap((Bitmap) obj);
                    }
                } else {
                    AppCompatImageView appCompatImageView6 = q820Var.I;
                    s4u<String, Bitmap> s4uVar3 = r9n.a;
                    this.a = appCompatImageView6;
                    this.b = 3;
                    Object objC3 = r9n.c(this, activity, "purple_rocket_with_fire_png");
                    if (objC3 != y5bVar) {
                        obj = objC3;
                        appCompatImageView = appCompatImageView6;
                        appCompatImageView.setImageBitmap((Bitmap) obj);
                    }
                }
                return y5bVar;
            }
            if (i == 1) {
                appCompatImageView3 = this.a;
                uj50.b(obj);
                appCompatImageView3.setImageBitmap((Bitmap) obj);
            } else if (i == 2) {
                appCompatImageView2 = this.a;
                uj50.b(obj);
                appCompatImageView2.setImageBitmap((Bitmap) obj);
            } else {
                if (i != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                appCompatImageView = this.a;
                uj50.b(obj);
                appCompatImageView.setImageBitmap((Bitmap) obj);
            }
            return Unit.a;
        }
    }

    public static final class b {
    }

    public ps2(q820 q820Var) {
        super(q820Var.a);
        this.a = q820Var;
    }

    public final void a(final Activity activity, final BetHistoryItem betHistoryItem, final String str, final String str2) {
        betHistoryItem.getClass();
        activity.getClass();
        str.getClass();
        str2.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        q820 q820Var = this.a;
        if (zIsExpanded) {
            TextView textView = q820Var.a0;
            UnderLineTextView underLineTextView = q820Var.O;
            textView.setText(activity.getString(R.string.coeff, String.valueOf(betHistoryItem.getHouseCoefficient())));
            q820Var.H.setVisibility(0);
            double giftAmount = betHistoryItem.getGiftAmount();
            ConstraintLayout constraintLayout = q820Var.z;
            if (giftAmount > 0.0d) {
                ConstraintLayout constraintLayout2 = q820Var.D;
                constraintLayout.setVisibility(0);
                TextView textView2 = q820Var.Q;
                TreeMap treeMap = pw.a;
                textView2.setText(pw.d(betHistoryItem.getStakeAmount()));
                q820Var.i.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                q820Var.V.setText(pw.d(betHistoryItem.getActualStakeAmount()));
                double payoutAmount = betHistoryItem.getPayoutAmount();
                ConstraintLayout constraintLayout3 = q820Var.C;
                if (payoutAmount > 0.0d) {
                    constraintLayout3.setVisibility(0);
                    constraintLayout2.setVisibility(0);
                    q820Var.S.setText(pw.d(betHistoryItem.getPayoutAmount()));
                    q820Var.v.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                    q820Var.X.setText(pw.d(betHistoryItem.getActualPayoutAmount()));
                } else {
                    constraintLayout3.setVisibility(8);
                    constraintLayout2.setVisibility(8);
                }
            } else {
                constraintLayout.setVisibility(8);
            }
            q820Var.F.setVisibility(8);
            q820Var.G.setVisibility(0);
            underLineTextView.setText(betHistoryItem.getTicketId());
            q820Var.K.setText(betHistoryItem.getRoundId());
            underLineTextView.setOnClickListener(new vr2(betHistoryItem, 0));
            q820Var.b.setText(R.string.bet_history_hide_detail);
        } else {
            q820Var.H.setVisibility(8);
            q820Var.F.setVisibility(0);
            q820Var.G.setVisibility(8);
            q820Var.b.setText(R.string.bet_history_show_detail);
        }
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new a(betHistoryItem, this, activity, null), 3);
        q820Var.c.setOnClickListener(new View.OnClickListener() { // from class: ds2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wz.a("ShareChat", "Pocket Rockets", "BetHistoryModal");
                Activity activity2 = activity;
                Intent intent = new Intent(activity2, (Class<?>) ChatActivity.class);
                intent.putExtra("roomId", str2);
                intent.putExtra("botId", str);
                intent.putExtra("color", R.color.toolbar_strip_bottle);
                intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Pocket Rockets");
                intent.putExtra("betObject", betHistoryItem);
                intent.putExtra("share_data_type", "bet_history_pocket");
                try {
                    activity2.getClass();
                    Fragment fragmentG = ((GameMainActivity) activity2).getSupportFragmentManager().G(R.id.main_game_container);
                    if (fragmentG instanceof zy10) {
                        ((zy10) fragmentG).d0 = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                activity2.startActivity(intent);
            }
        });
        op5 op5Var = op5.a;
        AppCompatTextView appCompatTextView = q820Var.b;
        op5.r(op5Var, kotlin.collections.b.f(appCompatTextView, q820Var.R, q820Var.w, q820Var.W, appCompatTextView, q820Var.T, q820Var.y, q820Var.Z, q820Var.Y, q820Var.J, q820Var.N, q820Var.e), null, 4);
    }
}
