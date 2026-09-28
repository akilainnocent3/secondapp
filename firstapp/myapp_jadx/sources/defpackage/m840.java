package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class m840 extends s42<GiftDetails> {
    public final boolean A;
    public final btk B;
    public final Activity f;
    public final boolean i;
    public final long v;
    public final String w;
    public final Integer y;
    public final zpk z;

    public final class b extends a82 {
        public final TextView A;
        public final ImageView B;
        public final View C;
        public int D;
        public boolean E;
        public final List<Integer> F;
        public final /* synthetic */ m840 G;
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final ConstraintLayout f;
        public final ImageView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m840 m840Var, View view) {
            super(view);
            view.getClass();
            this.G = m840Var;
            View viewFindViewById = view.findViewById(R.id.tv_gift_currency);
            viewFindViewById.getClass();
            this.a = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_gift_cash);
            viewFindViewById2.getClass();
            this.b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tv_gift_date);
            viewFindViewById3.getClass();
            this.c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tv_gift_condition);
            viewFindViewById4.getClass();
            this.d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.tv_gift_type);
            viewFindViewById5.getClass();
            this.e = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.layout_top_area);
            viewFindViewById6.getClass();
            this.f = (ConstraintLayout) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.selected);
            viewFindViewById7.getClass();
            this.i = (ImageView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.selected_text);
            viewFindViewById8.getClass();
            this.v = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.header);
            viewFindViewById9.getClass();
            this.w = (TextView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.tv_gift_title);
            viewFindViewById10.getClass();
            this.y = (TextView) viewFindViewById10;
            View viewFindViewById11 = view.findViewById(R.id.tv_gift_content);
            viewFindViewById11.getClass();
            this.z = (TextView) viewFindViewById11;
            View viewFindViewById12 = view.findViewById(R.id.tv_more);
            viewFindViewById12.getClass();
            this.A = (TextView) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(R.id.iv_more_arrow);
            viewFindViewById13.getClass();
            this.B = (ImageView) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(R.id.unusable_gifts_mask);
            viewFindViewById14.getClass();
            this.C = viewFindViewById14;
            this.F = kotlin.collections.b.k(1, 2, 3, 4);
        }

        @Override // defpackage.a82
        public final void a(int i) {
            int i2;
            int i3;
            boolean z;
            Drawable drawableA;
            int color;
            boolean z2;
            String displayDescription;
            GiftDetails giftDetails;
            m840 m840Var = this.G;
            Integer num = m840Var.y;
            String str = m840Var.w;
            Activity activity = m840Var.a;
            Activity activity2 = m840Var.f;
            List<T> list = m840Var.b;
            GiftDetails giftDetails2 = (GiftDetails) list.get(i - 1);
            if (giftDetails2 == null) {
                return;
            }
            String strD = a8b.d();
            strD.getClass();
            int length = strD.length() - 1;
            int i4 = 0;
            boolean z3 = false;
            while (i4 <= length) {
                boolean z4 = strD.charAt(!z3 ? i4 : length) <= ' ';
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z4) {
                    i4++;
                } else {
                    z3 = true;
                }
            }
            String string = strD.subSequence(i4, length + 1).toString();
            TextView textView = this.a;
            textView.setText(string);
            Context context = this.itemView.getContext();
            int color2 = context.getColor(R.color.cash_gift_primary);
            int color3 = context.getColor(R.color.cash_gift_primary);
            int kind = giftDetails2.getKind();
            ConstraintLayout constraintLayout = this.f;
            TextView textView2 = this.b;
            TextView textView3 = this.e;
            TextView textView4 = this.d;
            if (kind == 3) {
                textView4.setVisibility(8);
                color2 = context.getColor(R.color.free_bet_gift_primary);
                int color4 = context.getColor(R.color.free_bet_gift_primary);
                d(textView3, giftDetails2);
                textView3.setTextColor(color2);
                if (giftDetails2.getCurrentBalance() != giftDetails2.getInitialBalance()) {
                    textView4.setVisibility(0);
                    String strB = sn5.b(activity2, R.string.component_coupon__original_value_colon, new Object[0]);
                    CharSequence text = textView.getText();
                    textView4.setText(strB + " " + ((Object) text) + " " + bjb0.V(giftDetails2.getInitialBalance()));
                    hu1.b(bjb0.V(giftDetails2.getCurrentBalance()), " ", sn5.b(activity2, R.string.component_coupon__left, new Object[0]), textView2);
                } else {
                    textView4.setVisibility(0);
                    textView4.setText(sn5.b(activity2, R.string.component_coupon__stakes_not_returned_with_winnings, new Object[0]));
                    hu1.b(bjb0.V(giftDetails2.getCurrentBalance()), " ", sn5.b(activity2, R.string.component_coupon__u_off, new Object[0]), textView2);
                }
                Drawable drawableA2 = gr0.a(activity2, R.drawable.iwqk_free_bet_gift);
                if (drawableA2 != null) {
                    drawableA2.setTint(activity2.getColor(R.color.free_bet_gift_primary));
                    drawableA2.mutate();
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    constraintLayout.setBackground(drawableA2);
                }
                i2 = color4;
            } else {
                if (giftDetails2.getKind() == 1) {
                    textView4.setVisibility(8);
                    textView3.setText(sn5.b(activity2, R.string.common_functions__cash_gift, new Object[0]));
                    textView3.setTextColor(color2);
                    if (giftDetails2.getCurrentBalance() != giftDetails2.getInitialBalance()) {
                        textView4.setVisibility(0);
                        String strB2 = sn5.b(activity2, R.string.component_coupon__original_value_colon, new Object[0]);
                        CharSequence text2 = textView.getText();
                        textView4.setText(strB2 + " " + ((Object) text2) + " " + bjb0.V(giftDetails2.getInitialBalance()));
                        hu1.b(bjb0.V(giftDetails2.getCurrentBalance()), " ", sn5.b(activity2, R.string.component_coupon__left, new Object[0]), textView2);
                    } else {
                        hu1.b(bjb0.V(giftDetails2.getCurrentBalance()), " ", sn5.b(activity2, R.string.component_coupon__u_off, new Object[0]), textView2);
                    }
                    Drawable drawableA3 = gr0.a(activity2, R.drawable.iwqk_cash_gift_up);
                    if (drawableA3 != null) {
                        drawableA3.setTint(activity.getColor(R.color.cash_gift_primary));
                        drawableA3.mutate();
                        WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                        constraintLayout.setBackground(drawableA3);
                    }
                } else if (giftDetails2.getKind() == 2) {
                    textView4.setVisibility(0);
                    color2 = context.getColor(R.color.discount_gift_primary);
                    int color5 = context.getColor(R.color.discount_gift_primary);
                    textView3.setText(sn5.b(activity2, R.string.common_functions__discount_gift, new Object[0]));
                    textView3.setTextColor(color2);
                    textView2.setText(sn5.b(activity2, R.string.sporty_bingo__gift_cash_discount, bjb0.V(giftDetails2.getCurrentBalance())));
                    textView4.setText(sn5.b(activity2, R.string.component_coupon__on_stakes_of_vcondition_or_more, bjb0.V(giftDetails2.getLeastOrderAmount())));
                    Drawable drawableA4 = gr0.a(activity2, R.drawable.iwqk_discount_gift_up);
                    if (drawableA4 != null) {
                        drawableA4.setTint(activity2.getColor(R.color.discount_gift_primary));
                        drawableA4.mutate();
                        WeakHashMap<View, g9i0> weakHashMap3 = r6i0.a;
                        constraintLayout.setBackground(drawableA4);
                    }
                    i2 = color5;
                } else {
                    textView4.setVisibility(8);
                    d(textView3, giftDetails2);
                    textView3.setTextColor(color2);
                    hu1.b(bjb0.V(giftDetails2.getCurrentBalance()), " ", sn5.b(activity2, R.string.component_coupon__u_off, new Object[0]), textView2);
                }
                i2 = color3;
            }
            if (giftDetails2.getStatus() == 20) {
                giftDetails2.setType(40);
            }
            TextView textView5 = this.w;
            if (i == 1 || i == 0 || list.size() < 2 || (giftDetails = (GiftDetails) list.get(i - 2)) == null || giftDetails.getDisplayGroupType() != giftDetails2.getDisplayGroupType()) {
                i3 = 0;
                textView5.setVisibility(0);
            } else {
                textView5.setVisibility(8);
                i3 = 0;
            }
            String displayTitle = giftDetails2.getDisplayTitle();
            TextView textView6 = this.y;
            if (displayTitle == null || giftDetails2.getDisplayTitle().length() == 0) {
                textView6.setVisibility(8);
            } else {
                textView6.setText(giftDetails2.getDisplayTitle());
                textView6.setVisibility(i3);
            }
            String displayDescription2 = giftDetails2.getDisplayDescription();
            ImageView imageView = this.B;
            TextView textView7 = this.A;
            if (displayDescription2 == null || (displayDescription = giftDetails2.getDisplayDescription()) == null || displayDescription.length() <= 0) {
                imageView.setVisibility(8);
                textView7.setVisibility(8);
            } else {
                this.z.setText(giftDetails2.getDisplayDescription());
                textView7.setOnClickListener(new View.OnClickListener() { // from class: n840
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.c();
                    }
                });
                textView7.setVisibility(0);
                imageView.setOnClickListener(new o840(this, 0));
                imageView.setVisibility(0);
            }
            int displayGroupType = giftDetails2.getDisplayGroupType();
            View view = this.C;
            if (displayGroupType != 0) {
                if (displayGroupType != 1) {
                    z2 = false;
                } else {
                    z2 = false;
                    textView5.setText(sn5.b(activity2, R.string.component_coupon__not_applicable_gift, new Object[0]));
                    textView3.setTextColor(i2);
                    view.setVisibility(0);
                }
                z = z2;
            } else {
                z = true;
                textView5.setText(sn5.b(activity2, R.string.component_coupon__applicable_gift, new Object[0]));
                view.setVisibility(8);
            }
            int type = giftDetails2.getType();
            TextView textView8 = this.c;
            if (type == 40) {
                textView8.setText(sn5.b(activity2, R.string.app_common__var_to_var, bwf0.o((6 & 4) != 0 ? 0 : 1, giftDetails2.getUsableTime(), false), bwf0.o((6 & 4) != 0 ? 0 : 1, giftDetails2.getExpireTime(), false)));
            } else {
                textView8.setText(sn5.b(activity2, R.string.component_coupon__expires_vtime, bwf0.o((6 & 4) != 0 ? 0 : 1, giftDetails2.getExpireTime(), false)));
            }
            int i5 = giftDetails2.getStatus() == 20 ? R.string.common_functions__upcoming : R.string.gift__use;
            TextView textView9 = this.v;
            textView9.setText(i5);
            textView9.setVisibility(0);
            ImageView imageView2 = this.i;
            imageView2.setVisibility(8);
            if (!z) {
                textView9.setTextColor(i2);
                textView9.setBackgroundResource(R.drawable.spr_bg_use_gray);
                return;
            }
            textView9.setBackgroundColor(activity.getColor(R.color.brand_tertiary));
            textView9.setTextColor(color2);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if ((num != null && num.intValue() == 0) || !TextUtils.equals(str, giftDetails2.getGiftId())) {
                return;
            }
            int kind2 = giftDetails2.getKind();
            if (num == null || kind2 != num.intValue() || (drawableA = gr0.a(activity, R.drawable.spr_betslip_gift_seleted)) == null) {
                return;
            }
            drawableA.mutate();
            drawableA.setBounds(0, 0, this.itemView.getResources().getDimensionPixelSize(R.dimen.twelve), this.itemView.getResources().getDimensionPixelSize(R.dimen.ten));
            textView9.setVisibility(8);
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(drawableA);
            int kind3 = giftDetails2.getKind();
            if (kind3 != 2) {
                color = kind3 != 3 ? activity.getColor(R.color.cash_gift_secondary) : activity.getColor(R.color.free_bet_gift_secondary);
            } else {
                color = activity.getColor(R.color.discount_gift_secondary);
            }
            imageView2.setBackgroundColor(color);
        }

        /* JADX WARN: Code duplicated, block: B:78:0x0120  */
        @Override // defpackage.a82
        public final void b(int i, View view) {
            List<Integer> deviceChannelScopes;
            List<Integer> deviceChannelScopes2;
            List<Integer> deviceChannelScopes3;
            String string;
            view.getClass();
            m840 m840Var = this.G;
            GiftDetails giftDetails = (GiftDetails) m840Var.b.get(i - 1);
            if (giftDetails == null) {
                return;
            }
            if (giftDetails.getType() == 10) {
                if (m840Var.i && m840Var.v == 0) {
                    zyf0.b(R.string.component_coupon__please_choose_from_all_of_games_first, 0);
                    return;
                } else if (!m840Var.z.c(giftDetails)) {
                    return;
                }
            } else {
                if (giftDetails.getType() == -10) {
                    zyf0.b(R.string.component_coupon__incompatible_bet_type, 0);
                    return;
                }
                if (giftDetails.getType() == 20) {
                    zyf0.b(R.string.component_coupon__min_stake_required_not_met, 0);
                    return;
                }
                if (giftDetails.getType() == 30) {
                    if (giftDetails.getDeviceChannelScopes() == null || ((deviceChannelScopes = giftDetails.getDeviceChannelScopes()) != null && deviceChannelScopes.isEmpty())) {
                        zyf0.b(R.string.component_coupon__currently_not_meeting_the_requirements_of_usage, 0);
                        return;
                    }
                    List<Integer> deviceChannelScopes4 = giftDetails.getDeviceChannelScopes();
                    if ((deviceChannelScopes4 != null && deviceChannelScopes4.contains(0)) || ((deviceChannelScopes2 = giftDetails.getDeviceChannelScopes()) != null && deviceChannelScopes2.contains(2) && (deviceChannelScopes3 = giftDetails.getDeviceChannelScopes()) != null && deviceChannelScopes3.contains(3))) {
                        zyf0.b(R.string.sporty_bingo__exclusive_to_mobile_pc, 0);
                        return;
                    }
                    List<Integer> deviceChannelScopes5 = giftDetails.getDeviceChannelScopes();
                    if (deviceChannelScopes5 != null && deviceChannelScopes5.contains(3)) {
                        zyf0.b(R.string.component_coupon__exclusive_to_the_mobile_web, 0);
                        return;
                    }
                    List<Integer> deviceChannelScopes6 = giftDetails.getDeviceChannelScopes();
                    if (deviceChannelScopes6 == null || !deviceChannelScopes6.contains(2)) {
                        zyf0.b(R.string.component_coupon__currently_not_meeting_the_requirements_of_usage, 0);
                        return;
                    } else {
                        zyf0.b(R.string.component_coupon__exclusive_to_pc, 0);
                        return;
                    }
                }
                if (giftDetails.getType() == 40) {
                    zyf0.b(R.string.component_coupon__not_in_valid_date, 0);
                    return;
                } else if (giftDetails.getType() == 50) {
                    zyf0.b(R.string.component_coupon__currently_not_meeting_the_requirements_of_usage, 0);
                    return;
                }
            }
            String strW = bjb0.W(giftDetails.getCurrentBalance());
            strW.getClass();
            if (strW.length() > 0) {
                BigDecimal bigDecimalA = b6y.a(strW);
                if (bigDecimalA.compareTo(BigDecimal.ZERO) != 0) {
                    string = bigDecimalA.toString();
                    string.getClass();
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            m840Var.B.V(new SelectedGiftData(string, giftDetails.getKind(), giftDetails.getGiftId(), bjb0.W(giftDetails.getLeastOrderAmount()), m840Var.k(), giftDetails, false, true, true, null), m840Var.k());
        }

        public final void c() {
            this.D += 180;
            ImageView imageView = this.B;
            imageView.setPivotX(imageView.getWidth() / 2.0f);
            imageView.setPivotY(imageView.getHeight() / 2.0f);
            imageView.setRotation(this.D);
            this.z.setVisibility(!this.E ? 0 : 8);
            this.E = !this.E;
        }

        public final void d(TextView textView, GiftDetails giftDetails) {
            CharSequence charSequenceB;
            Activity activity = this.G.f;
            textView.getClass();
            if (giftDetails.getBizTypeScopes().size() != 1 || giftDetails.getBizTypeScopes().get(0).intValue() == 0) {
                UiText uiTextE = qz3.e(giftDetails.getKind());
                Context context = textView.getContext();
                context.getClass();
                textView.setText(uiTextE.e(context));
                return;
            }
            UiText uiTextE2 = qz3.e(giftDetails.getKind());
            Context context2 = textView.getContext();
            context2.getClass();
            j7g j7gVar = new j7g(uiTextE2.e(context2));
            int iIntValue = giftDetails.getBizTypeScopes().get(0).intValue();
            Iterator<Integer> it = this.F.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == iIntValue) {
                    String strB = sn5.b(activity, R.string.gift__exclusive_for, new Object[0]);
                    int iIntValue2 = giftDetails.getBizTypeScopes().get(0).intValue();
                    List<i0h0> list = i0h0.c;
                    Iterator it2 = i0h0.a.a(null).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequenceB = sn5.b(activity, R.string.common_functions__unknown, new Object[0]);
                            break;
                        }
                        i0h0 i0h0Var = (i0h0) it2.next();
                        int i = i0h0Var.a;
                        ResourceUiText resourceUiText = i0h0Var.b;
                        if (i == iIntValue2) {
                            Context context3 = this.itemView.getContext();
                            context3.getClass();
                            charSequenceB = resourceUiText.e(context3);
                            break;
                        }
                    }
                    j7gVar.l(zch0.a(this.itemView.getContext(), 10), "   " + strB + " " + ((Object) charSequenceB));
                    break;
                }
            }
            textView.setText(j7gVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m840(e eVar, ArrayList arrayList, boolean z, long j, String str, Integer num, zpk zpkVar, boolean z2, btk btkVar) {
        super(eVar, arrayList);
        eVar.getClass();
        zpkVar.getClass();
        this.f = eVar;
        this.i = z;
        this.v = j;
        this.w = str;
        this.y = num;
        this.z = zpkVar;
        this.A = z2;
        this.B = btkVar;
    }

    @Override // defpackage.s42, androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<T> list = this.b;
        if (list.size() == 0) {
            return 0;
        }
        return list.size() + 1;
    }

    @Override // defpackage.s42
    public final int i(int i) {
        return i == 0 ? R.layout.spr_gift_skip_layout : R.layout.spr_gift_list_item;
    }

    @Override // defpackage.s42
    public final a82 j(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == R.layout.spr_gift_skip_layout) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
            viewInflate.getClass();
            return new a(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        viewInflate2.getClass();
        return new b(this, viewInflate2);
    }

    public final int k() {
        List<T> list = this.b;
        int size = list.size();
        for (T t : list) {
            if (t == null || t.getType() != 10) {
                if (t == null || t.getType() != 20) {
                    size--;
                }
            }
        }
        return size;
    }

    public final class a extends a82 implements View.OnClickListener {
        public final /* synthetic */ m840 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m840 m840Var, View view) {
            super(view);
            view.getClass();
            this.a = m840Var;
            ((Button) view.findViewById(R.id.skip)).setVisibility(8);
            TextView textView = (TextView) view.findViewById(R.id.note);
            textView.setVisibility(m840Var.i ? 8 : 0);
            if (m840Var.A) {
                textView.setText(sn5.c(view, R.string.component_coupon__note_cashout_available_with_free_bet_gift, new Object[0]));
            }
        }

        @Override // defpackage.a82
        public final void b(int i, View view) {
            view.getClass();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            view.getClass();
            m840 m840Var = this.a;
            SelectedGiftData selectedGiftDataNewUnselectedGiftData = GiftUtil.newUnselectedGiftData(m840Var.k());
            btk btkVar = m840Var.B;
            selectedGiftDataNewUnselectedGiftData.getClass();
            btkVar.V(selectedGiftDataNewUnselectedGiftData, m840Var.k());
        }

        @Override // defpackage.a82
        public final void a(int i) {
        }
    }
}
