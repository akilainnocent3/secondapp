package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zk50 extends RecyclerView.f<c> {
    public List<JackpotElement> a;

    public class b extends c implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.result_index);
            this.b = (TextView) view.findViewById(R.id.result_time);
            this.c = (TextView) view.findViewById(R.id.home_team_name);
            this.d = (TextView) view.findViewById(R.id.away_team_name);
            this.e = (TextView) view.findViewById(R.id.result_score);
            TextView textView = (TextView) view.findViewById(R.id.result_result);
            this.f = textView;
            textView.setOnClickListener(this);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0082  */
        /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:32:0x011b  */
        @Override // zk50.c
        public final void a(int i) {
            String str;
            boolean z;
            TextView textView;
            TextView textView2;
            JackpotElement jackpotElement = zk50.this.a.get(i - 1);
            this.a.setText(String.valueOf(i));
            this.c.setText(jackpotElement.home);
            this.d.setText(jackpotElement.away);
            this.b.setText(bwf0.a.g(jackpotElement.date));
            int i2 = jackpotElement.result;
            if (i2 == 0) {
                str = "-:-";
            } else if (i2 == 1) {
                str = "1";
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        z = i2 == 4;
                        str = "";
                    } else {
                        str = "2";
                    }
                    textView = this.f;
                    textView.setText(str);
                    textView2 = this.e;
                    if (z) {
                        textView.setText(sn5.c(textView2, R.string.bet_history__void, new Object[0]));
                        textView2.setText(sn5.c(textView2, R.string.bet_history__void, new Object[0]));
                        textView2.setTextColor(textView2.getContext().getColor(R.color.text_type2_primary));
                    } else if (!TextUtils.isEmpty(jackpotElement.homeScore) || TextUtils.isEmpty(jackpotElement.awayScore)) {
                        textView2.setText("");
                    } else {
                        textView2.setText(jackpotElement.homeScore + "\n" + jackpotElement.awayScore);
                        textView2.setTextColor(textView2.getContext().getColor(R.color.brand_secondary_variable_type3));
                    }
                    if (z) {
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setTag(null);
                        return;
                    }
                    Context context = this.itemView.getContext();
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(context, R.drawable.spr_info, textView.getContext().getColor(R.color.text_type2_tertiary)), (Drawable) null);
                    PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(context).inflate(R.layout.jap_layout_show_tips2, (ViewGroup) null), context.getResources().getDimensionPixelSize(R.dimen.cmn_tip_pop_bg_width), context.getResources().getDimensionPixelSize(R.dimen.tip_pop_bg_height_2));
                    popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                    popupWindow.setAnimationStyle(R.style.cmn_ShowTipsAnimation);
                    popupWindow.setFocusable(true);
                    popupWindow.setOutsideTouchable(true);
                    textView.setTag(popupWindow);
                }
                str = AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X;
            }
            z = false;
            textView = this.f;
            textView.setText(str);
            textView2 = this.e;
            if (z) {
                textView.setText(sn5.c(textView2, R.string.bet_history__void, new Object[0]));
                textView2.setText(sn5.c(textView2, R.string.bet_history__void, new Object[0]));
                textView2.setTextColor(textView2.getContext().getColor(R.color.text_type2_primary));
            } else if (TextUtils.isEmpty(jackpotElement.homeScore)) {
                textView2.setText("");
            } else {
                textView2.setText("");
            }
            if (z) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setTag(null);
                return;
            }
            Context context2 = this.itemView.getContext();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(context2, R.drawable.spr_info, textView.getContext().getColor(R.color.text_type2_tertiary)), (Drawable) null);
            PopupWindow popupWindow2 = new PopupWindow(LayoutInflater.from(context2).inflate(R.layout.jap_layout_show_tips2, (ViewGroup) null), context2.getResources().getDimensionPixelSize(R.dimen.cmn_tip_pop_bg_width), context2.getResources().getDimensionPixelSize(R.dimen.tip_pop_bg_height_2));
            popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow2.setAnimationStyle(R.style.cmn_ShowTipsAnimation);
            popupWindow2.setFocusable(true);
            popupWindow2.setOutsideTouchable(true);
            textView.setTag(popupWindow2);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PopupWindow popupWindow;
            if (!(view instanceof TextView) || (popupWindow = (PopupWindow) view.getTag()) == null) {
                return;
            }
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
            } else {
                popupWindow.showAsDropDown(view, ((-view.getMeasuredWidth()) * 2) + 5, ((-view.getMeasuredHeight()) * 3) / 2);
            }
        }
    }

    public static abstract class c extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        if (this.a.size() > 0) {
            return this.a.size() + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((c) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 0 ? new b(dzc.a(viewGroup, R.layout.jackpot_results_item, viewGroup, false)) : new a(dzc.a(viewGroup, R.layout.jackpot_winnings_title, viewGroup, false));
    }

    public class a extends c {
        @Override // zk50.c
        public final void a(int i) {
        }
    }
}
