package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
public final class tik extends s42<GiftDetails> {
    public final boolean A;
    public final int B;
    public final zpk C;
    public final btk D;
    public final boolean f;
    public final Activity i;
    public final String v;
    public final int w;
    public final String y;
    public final long z;

    public class b extends a82 {
        public final TextView A;
        public final ImageView B;
        public final View C;
        public int D;
        public boolean E;
        public final List<Integer> F;
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

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.this.c();
            }
        }

        /* JADX INFO: renamed from: tik$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC1139b implements View.OnClickListener {
            public ViewOnClickListenerC1139b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.this.c();
            }
        }

        public b(View view) {
            super(view);
            this.D = 0;
            this.E = false;
            this.F = Arrays.asList(1, 2, 3, 4, 159, 146, 147, Integer.valueOf(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS), 150, 173, 171, 152, 153);
            this.a = (TextView) view.findViewById(R.id.tv_gift_currency);
            this.b = (TextView) view.findViewById(R.id.tv_gift_cash);
            this.c = (TextView) view.findViewById(R.id.tv_gift_date);
            this.e = (TextView) view.findViewById(R.id.tv_gift_type);
            this.d = (TextView) view.findViewById(R.id.tv_gift_condition);
            this.y = (TextView) view.findViewById(R.id.tv_gift_title);
            this.z = (TextView) view.findViewById(R.id.tv_gift_content);
            this.A = (TextView) view.findViewById(R.id.tv_more);
            this.B = (ImageView) view.findViewById(R.id.iv_more_arrow);
            this.f = (ConstraintLayout) view.findViewById(R.id.layout_top_area);
            this.i = (ImageView) view.findViewById(R.id.selected);
            this.v = (TextView) view.findViewById(R.id.selected_text);
            this.w = (TextView) view.findViewById(R.id.header);
            this.C = view.findViewById(R.id.unusable_gifts_mask);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x04b6  */
        /* JADX WARN: Code duplicated, block: B:103:0x04ba  */
        /* JADX WARN: Code duplicated, block: B:106:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:108:0x04e4 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:124:0x0554  */
        /* JADX WARN: Code duplicated, block: B:130:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x0347  */
        /* JADX WARN: Code duplicated, block: B:62:0x0377  */
        /* JADX WARN: Code duplicated, block: B:64:0x0382  */
        /* JADX WARN: Code duplicated, block: B:65:0x0386  */
        /* JADX WARN: Code duplicated, block: B:71:0x03a6  */
        /* JADX WARN: Code duplicated, block: B:77:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:80:0x03f2  */
        /* JADX WARN: Code duplicated, block: B:82:0x03f6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:83:0x03f8  */
        /* JADX WARN: Code duplicated, block: B:85:0x03fc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:86:0x03fe  */
        /* JADX WARN: Code duplicated, block: B:88:0x0402  */
        /* JADX WARN: Code duplicated, block: B:89:0x0404  */
        /* JADX WARN: Code duplicated, block: B:90:0x0418  */
        /* JADX WARN: Code duplicated, block: B:91:0x042c  */
        /* JADX WARN: Code duplicated, block: B:92:0x0440  */
        /* JADX WARN: Code duplicated, block: B:93:0x0454  */
        /* JADX WARN: Code duplicated, block: B:94:0x045f  */
        /* JADX WARN: Code duplicated, block: B:98:0x047b  */
        /* JADX WARN: Code duplicated, block: B:99:0x049a  */
        /* JADX WARN: Type inference failed for: r13v30, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r13v37 */
        /* JADX WARN: Type inference failed for: r13v45 */
        @Override // defpackage.a82
        public final void a(int i) {
            CharSequence charSequenceB;
            int color;
            TextView textView;
            int i2;
            String displayTitle;
            TextView textView2;
            String displayDescription;
            ImageView imageView;
            TextView textView3;
            int type;
            View view;
            boolean z;
            ?? r13;
            boolean z2;
            int type2;
            TextView textView4;
            int i3;
            TextView textView5;
            Drawable drawableA;
            int color2;
            tik tikVar = tik.this;
            int i4 = tikVar.w;
            String str = tikVar.v;
            Activity activity = tikVar.a;
            Activity activity2 = tikVar.i;
            List<T> list = tikVar.b;
            GiftDetails giftDetails = (GiftDetails) list.get(i - 1);
            String strTrim = a8b.d().trim();
            TextView textView6 = this.a;
            textView6.setText(strTrim);
            Context context = this.itemView.getContext();
            int color3 = context.getColor(R.color.cash_gift_primary);
            int color4 = context.getColor(R.color.cash_gift_primary);
            int kind = giftDetails.getKind();
            ConstraintLayout constraintLayout = this.f;
            TextView textView7 = this.b;
            TextView textView8 = this.d;
            int color5 = color4;
            TextView textView9 = this.e;
            if (kind != 1) {
                if (giftDetails.getKind() == 2) {
                    textView8.setVisibility(0);
                    color3 = context.getColor(R.color.discount_gift_primary);
                    color = context.getColor(R.color.discount_gift_primary);
                    textView9.setText(sn5.b(activity2, R.string.common_functions__discount_gift, new Object[0]));
                    textView9.setTextColor(color3);
                    textView7.setText(sn5.b(activity2, R.string.sporty_bingo__gift_cash_discount, bjb0.V(giftDetails.getCurrentBalance())));
                    textView8.setText(sn5.b(activity2, R.string.component_coupon__on_stakes_of_vcondition_or_more, bjb0.V(giftDetails.getLeastOrderAmount())));
                    Drawable drawableA2 = gr0.a(activity2, R.drawable.iwqk_discount_gift_up);
                    if (drawableA2 != null) {
                        drawableA2.setTint(activity2.getColor(R.color.discount_gift_primary));
                        drawableA2.mutate();
                        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                        constraintLayout.setBackground(drawableA2);
                    }
                    str = str;
                    activity = activity;
                } else {
                    if (giftDetails.getKind() == 3) {
                        textView8.setVisibility(8);
                        color3 = context.getColor(R.color.free_bet_gift_primary);
                        color5 = context.getColor(R.color.free_bet_gift_primary);
                        if (giftDetails.getBizTypeScopes().size() != 1 || giftDetails.getBizTypeScopes().get(0).intValue() == 0) {
                            str = str;
                            activity = activity;
                            textView9.setText(qz3.e(giftDetails.getKind()).e(textView9.getContext()));
                        } else {
                            j7g j7gVar = new j7g(qz3.e(giftDetails.getKind()).e(textView9.getContext()));
                            int iIntValue = giftDetails.getBizTypeScopes().get(0).intValue();
                            Iterator<Integer> it = this.F.iterator();
                            while (it.hasNext()) {
                                Iterator<Integer> it2 = it;
                                if (it.next().intValue() == iIntValue) {
                                    StringBuilder sb = new StringBuilder("   ");
                                    sb.append(sn5.b(activity2, R.string.gift__exclusive_for, new Object[0]));
                                    sb.append(" ");
                                    int iIntValue2 = giftDetails.getBizTypeScopes().get(0).intValue();
                                    List<i0h0> list2 = i0h0.c;
                                    Iterator it3 = i0h0.a.a(null).iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            charSequenceB = sn5.b(activity2, R.string.common_functions__unknown, new Object[0]);
                                            break;
                                        }
                                        i0h0 i0h0Var = (i0h0) it3.next();
                                        Iterator it4 = it3;
                                        if (i0h0Var.a == iIntValue2) {
                                            charSequenceB = i0h0Var.b.e(this.itemView.getContext());
                                            break;
                                        }
                                        it3 = it4;
                                    }
                                    sb.append((Object) charSequenceB);
                                    j7gVar.l(zch0.a(this.itemView.getContext(), 10), sb.toString());
                                    break;
                                }
                                it = it2;
                            }
                            textView9.setText(j7gVar);
                        }
                        textView9.setTextColor(color3);
                        if (giftDetails.getCurrentBalance() != giftDetails.getInitialBalance()) {
                            textView8.setVisibility(0);
                            textView8.setText(sn5.b(activity2, R.string.component_coupon__original_value_colon, new Object[0]) + " " + ((Object) textView6.getText()) + " " + bjb0.V(giftDetails.getInitialBalance()));
                            StringBuilder sb2 = new StringBuilder(bjb0.V(giftDetails.getCurrentBalance()));
                            sb2.append(" ");
                            sb2.append(sn5.b(activity2, R.string.component_coupon__left, new Object[0]));
                            textView7.setText(sb2.toString());
                        } else {
                            textView8.setVisibility(0);
                            textView8.setText(sn5.b(activity2, R.string.component_coupon__stakes_not_returned_with_winnings, new Object[0]));
                            textView7.setText(bjb0.V(giftDetails.getCurrentBalance()) + " " + sn5.b(activity2, R.string.component_coupon__u_off, new Object[0]));
                        }
                        Drawable drawableA3 = gr0.a(activity2, R.drawable.iwqk_free_bet_gift);
                        if (drawableA3 != null) {
                            drawableA3.setTint(activity2.getColor(R.color.free_bet_gift_primary));
                            drawableA3.mutate();
                            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                            constraintLayout.setBackground(drawableA3);
                        }
                    }
                    color = color5;
                }
                if (giftDetails.getStatus() == 20) {
                    giftDetails.setType(40);
                }
                textView = this.w;
                if (i != 1 || i == 0 || list.size() < 2) {
                    i2 = 0;
                    if (giftDetails.getType() == 10) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                    }
                } else if (((GiftDetails) list.get(i - 2)).getType() == giftDetails.getType()) {
                    textView.setVisibility(8);
                    i2 = 0;
                } else {
                    i2 = 0;
                    textView.setVisibility(0);
                }
                displayTitle = giftDetails.getDisplayTitle();
                textView2 = this.y;
                if (displayTitle != null || giftDetails.getDisplayTitle().isEmpty()) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(giftDetails.getDisplayTitle());
                    textView2.setVisibility(i2);
                }
                displayDescription = giftDetails.getDisplayDescription();
                imageView = this.B;
                textView3 = this.A;
                if (displayDescription != null || giftDetails.getDisplayDescription().isEmpty()) {
                    imageView.setVisibility(8);
                    textView3.setVisibility(8);
                } else {
                    this.z.setText(giftDetails.getDisplayDescription());
                    textView3.setOnClickListener(new a());
                    textView3.setVisibility(0);
                    imageView.setOnClickListener(new ViewOnClickListenerC1139b());
                    imageView.setVisibility(0);
                }
                type = giftDetails.getType();
                view = this.C;
                if (type != -10) {
                    if (type != 10) {
                        r13 = 0;
                        textView.setVisibility(8);
                        view.setVisibility(8);
                        z2 = true;
                    } else if (type != 20) {
                        z = false;
                        textView.setText(sn5.b(activity2, R.string.component_coupon__min_stake_required_not_met, new Object[0]));
                        textView9.setTextColor(color);
                        view.setVisibility(0);
                    } else if (type != 30) {
                        z = false;
                        textView.setText(sn5.b(activity2, R.string.sporty_bingo__exclusive_to_mobile_pc, new Object[0]));
                        textView9.setTextColor(color);
                        view.setVisibility(0);
                    } else if (type != 40) {
                        z = false;
                        textView.setText(sn5.b(activity2, R.string.component_coupon__not_in_valid_date, new Object[0]));
                        textView9.setTextColor(color);
                        view.setVisibility(0);
                    } else if (type != 50) {
                        z = false;
                    } else {
                        z = false;
                        textView.setText(sn5.b(activity2, R.string.component_coupon__other_unusable_reasons, new Object[0]));
                        textView9.setTextColor(color);
                        view.setVisibility(0);
                    }
                    type2 = giftDetails.getType();
                    textView4 = this.c;
                    if (type2 == 40) {
                        textView4.setText(sn5.b(activity2, R.string.app_common__var_to_var, bwf0.o(r13, giftDetails.getUsableTime(), r13), bwf0.o(r13, giftDetails.getExpireTime(), r13)));
                    } else {
                        textView4.setText(sn5.b(activity2, R.string.component_coupon__expires_vtime, bwf0.o(r13, giftDetails.getExpireTime(), r13)));
                    }
                    if (giftDetails.getStatus() == 20) {
                        i3 = R.string.common_functions__upcoming;
                    } else {
                        i3 = R.string.gift__use;
                    }
                    textView5 = this.v;
                    textView5.setText(i3);
                    textView5.setVisibility(0);
                    ImageView imageView2 = this.i;
                    imageView2.setVisibility(8);
                    if (z2) {
                        textView5.setTextColor(color);
                        textView5.setBackgroundResource(R.drawable.spr_bg_use_gray);
                        return;
                    }
                    Activity activity3 = activity;
                    textView5.setBackgroundColor(activity3.getColor(R.color.brand_tertiary));
                    textView5.setTextColor(color3);
                    if (!TextUtils.isEmpty(str) || i4 == 0) {
                    }
                    if (TextUtils.equals(str, giftDetails.getGiftId()) && giftDetails.getKind() == i4 && (drawableA = gr0.a(activity3, R.drawable.spr_betslip_gift_seleted)) != null) {
                        drawableA.mutate();
                        drawableA.setBounds(0, 0, this.itemView.getResources().getDimensionPixelSize(R.dimen.twelve), this.itemView.getResources().getDimensionPixelSize(R.dimen.ten));
                        textView5.setVisibility(8);
                        imageView2.setVisibility(0);
                        imageView2.setImageDrawable(drawableA);
                        int kind2 = giftDetails.getKind();
                        if (kind2 != 2) {
                            color2 = kind2 != 3 ? activity3.getColor(R.color.cash_gift_secondary) : activity3.getColor(R.color.free_bet_gift_secondary);
                        } else {
                            color2 = activity3.getColor(R.color.discount_gift_secondary);
                        }
                        imageView2.setBackgroundColor(color2);
                        return;
                    }
                    return;
                }
                z = false;
                textView.setText(sn5.b(activity2, R.string.component_coupon__incompatible_bet_type, new Object[0]));
                textView9.setTextColor(color);
                view.setVisibility(0);
                z2 = z ? 1 : 0;
                r13 = z;
                type2 = giftDetails.getType();
                textView4 = this.c;
                if (type2 == 40) {
                    textView4.setText(sn5.b(activity2, R.string.app_common__var_to_var, bwf0.o(r13, giftDetails.getUsableTime(), r13), bwf0.o(r13, giftDetails.getExpireTime(), r13)));
                } else {
                    textView4.setText(sn5.b(activity2, R.string.component_coupon__expires_vtime, bwf0.o(r13, giftDetails.getExpireTime(), r13)));
                }
                if (giftDetails.getStatus() == 20) {
                    i3 = R.string.common_functions__upcoming;
                } else {
                    i3 = R.string.gift__use;
                }
                textView5 = this.v;
                textView5.setText(i3);
                textView5.setVisibility(0);
                ImageView imageView3 = this.i;
                imageView3.setVisibility(8);
                if (z2) {
                    textView5.setTextColor(color);
                    textView5.setBackgroundResource(R.drawable.spr_bg_use_gray);
                    return;
                }
                Activity activity4 = activity;
                textView5.setBackgroundColor(activity4.getColor(R.color.brand_tertiary));
                textView5.setTextColor(color3);
                if (TextUtils.isEmpty(str)) {
                }
            }
            textView8.setVisibility(8);
            textView9.setText(sn5.b(activity2, R.string.common_functions__cash_gift, new Object[0]));
            textView9.setTextColor(color3);
            if (giftDetails.getCurrentBalance() != giftDetails.getInitialBalance()) {
                textView8.setVisibility(0);
                textView8.setText(sn5.b(activity2, R.string.component_coupon__original_value_colon, new Object[0]) + " " + ((Object) textView6.getText()) + " " + bjb0.V(giftDetails.getInitialBalance()));
                StringBuilder sb3 = new StringBuilder(bjb0.V(giftDetails.getCurrentBalance()));
                sb3.append(" ");
                sb3.append(sn5.b(activity2, R.string.component_coupon__left, new Object[0]));
                textView7.setText(sb3.toString());
            } else {
                textView7.setText(bjb0.V(giftDetails.getCurrentBalance()) + " " + sn5.b(activity2, R.string.component_coupon__u_off, new Object[0]));
            }
            Drawable drawableA4 = gr0.a(activity2, R.drawable.iwqk_cash_gift_up);
            if (drawableA4 != null) {
                drawableA4.setTint(activity.getColor(R.color.cash_gift_primary));
                drawableA4.mutate();
                WeakHashMap<View, g9i0> weakHashMap3 = r6i0.a;
                constraintLayout.setBackground(drawableA4);
            }
            str = str;
            activity = activity;
            color = color5;
            if (giftDetails.getStatus() == 20) {
                giftDetails.setType(40);
            }
            textView = this.w;
            if (i != 1) {
                i2 = 0;
                if (giftDetails.getType() == 10) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                }
            } else {
                i2 = 0;
                if (giftDetails.getType() == 10) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                }
            }
            displayTitle = giftDetails.getDisplayTitle();
            textView2 = this.y;
            if (displayTitle != null) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(8);
            }
            displayDescription = giftDetails.getDisplayDescription();
            imageView = this.B;
            textView3 = this.A;
            if (displayDescription != null) {
                imageView.setVisibility(8);
                textView3.setVisibility(8);
            } else {
                imageView.setVisibility(8);
                textView3.setVisibility(8);
            }
            type = giftDetails.getType();
            view = this.C;
            if (type != -10) {
                if (type != 10) {
                    r13 = 0;
                    textView.setVisibility(8);
                    view.setVisibility(8);
                    z2 = true;
                } else if (type != 20) {
                    z = false;
                    textView.setText(sn5.b(activity2, R.string.component_coupon__min_stake_required_not_met, new Object[0]));
                    textView9.setTextColor(color);
                    view.setVisibility(0);
                } else if (type != 30) {
                    z = false;
                    textView.setText(sn5.b(activity2, R.string.sporty_bingo__exclusive_to_mobile_pc, new Object[0]));
                    textView9.setTextColor(color);
                    view.setVisibility(0);
                } else if (type != 40) {
                    z = false;
                    textView.setText(sn5.b(activity2, R.string.component_coupon__not_in_valid_date, new Object[0]));
                    textView9.setTextColor(color);
                    view.setVisibility(0);
                } else if (type != 50) {
                    z = false;
                } else {
                    z = false;
                    textView.setText(sn5.b(activity2, R.string.component_coupon__other_unusable_reasons, new Object[0]));
                    textView9.setTextColor(color);
                    view.setVisibility(0);
                }
                type2 = giftDetails.getType();
                textView4 = this.c;
                if (type2 == 40) {
                    textView4.setText(sn5.b(activity2, R.string.app_common__var_to_var, bwf0.o(r13, giftDetails.getUsableTime(), r13), bwf0.o(r13, giftDetails.getExpireTime(), r13)));
                } else {
                    textView4.setText(sn5.b(activity2, R.string.component_coupon__expires_vtime, bwf0.o(r13, giftDetails.getExpireTime(), r13)));
                }
                if (giftDetails.getStatus() == 20) {
                    i3 = R.string.common_functions__upcoming;
                } else {
                    i3 = R.string.gift__use;
                }
                textView5 = this.v;
                textView5.setText(i3);
                textView5.setVisibility(0);
                ImageView imageView4 = this.i;
                imageView4.setVisibility(8);
                if (z2) {
                    textView5.setTextColor(color);
                    textView5.setBackgroundResource(R.drawable.spr_bg_use_gray);
                    return;
                }
                Activity activity5 = activity;
                textView5.setBackgroundColor(activity5.getColor(R.color.brand_tertiary));
                textView5.setTextColor(color3);
                if (TextUtils.isEmpty(str)) {
                }
            }
            z = false;
            textView.setText(sn5.b(activity2, R.string.component_coupon__incompatible_bet_type, new Object[0]));
            textView9.setTextColor(color);
            view.setVisibility(0);
            z2 = z ? 1 : 0;
            r13 = z;
            type2 = giftDetails.getType();
            textView4 = this.c;
            if (type2 == 40) {
                textView4.setText(sn5.b(activity2, R.string.app_common__var_to_var, bwf0.o(r13, giftDetails.getUsableTime(), r13), bwf0.o(r13, giftDetails.getExpireTime(), r13)));
            } else {
                textView4.setText(sn5.b(activity2, R.string.component_coupon__expires_vtime, bwf0.o(r13, giftDetails.getExpireTime(), r13)));
            }
            if (giftDetails.getStatus() == 20) {
                i3 = R.string.common_functions__upcoming;
            } else {
                i3 = R.string.gift__use;
            }
            textView5 = this.v;
            textView5.setText(i3);
            textView5.setVisibility(0);
            ImageView imageView5 = this.i;
            imageView5.setVisibility(8);
            if (z2) {
                textView5.setTextColor(color);
                textView5.setBackgroundResource(R.drawable.spr_bg_use_gray);
                return;
            }
            Activity activity6 = activity;
            textView5.setBackgroundColor(activity6.getColor(R.color.brand_tertiary));
            textView5.setTextColor(color3);
            if (TextUtils.isEmpty(str)) {
            }
        }

        @Override // defpackage.a82
        public final void b(int i, View view) {
            double d;
            final tik tikVar = tik.this;
            final GiftDetails giftDetails = (GiftDetails) tikVar.b.get(i - 1);
            if (giftDetails.getType() == 10) {
                if (tikVar.f && tikVar.z == 0) {
                    zyf0.b(R.string.component_coupon__please_choose_from_all_of_games_first, 0);
                    return;
                } else if (!tikVar.C.c(giftDetails)) {
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
                    if (giftDetails.getDeviceChannelScopes() == null || giftDetails.getDeviceChannelScopes().isEmpty()) {
                        zyf0.b(R.string.component_coupon__currently_not_meeting_the_requirements_of_usage, 0);
                        return;
                    }
                    if (giftDetails.getDeviceChannelScopes().contains(0) || (giftDetails.getDeviceChannelScopes().contains(2) && giftDetails.getDeviceChannelScopes().contains(3))) {
                        zyf0.b(R.string.sporty_bingo__exclusive_to_mobile_pc, 0);
                        return;
                    }
                    if (giftDetails.getDeviceChannelScopes().contains(3)) {
                        zyf0.b(R.string.component_coupon__exclusive_to_the_mobile_web, 0);
                        return;
                    } else if (giftDetails.getDeviceChannelScopes().contains(2)) {
                        zyf0.b(R.string.component_coupon__exclusive_to_pc, 0);
                        return;
                    } else {
                        zyf0.b(R.string.component_coupon__currently_not_meeting_the_requirements_of_usage, 0);
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
            if (giftDetails.getKind() == 3) {
                Activity activity = tikVar.a;
                androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(activity);
                View viewInflate = LayoutInflater.from(activity).inflate(R.layout.spr_free_bet_gift_use_dialog, (ViewGroup) null);
                final TextView textView = (TextView) viewInflate.findViewById(R.id.tv_confirm);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_cancel);
                final EditText editText = (EditText) viewInflate.findViewById(R.id.input_value);
                final TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_error_msg);
                TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_value);
                final RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_free_bet);
                radioGroup.check(R.id.rb_all_free_bet);
                if (TextUtils.equals(tikVar.v, giftDetails.getGiftId())) {
                    d = 1.0E-4d;
                    if (giftDetails.getKind() == tikVar.w) {
                        try {
                            double currentBalance = giftDetails.getCurrentBalance() * 1.0E-4d;
                            Locale locale = Locale.US;
                            String strA0 = bjb0.a0(currentBalance, locale);
                            String strP = bjb0.P(tikVar.y, locale);
                            if (TextUtils.equals(strA0, strP)) {
                                radioGroup.check(R.id.rb_all_free_bet);
                            } else {
                                radioGroup.check(R.id.rb_partial_free_bet);
                                editText.setText(strP);
                            }
                        } catch (Exception e) {
                            itf0.a aVar2 = itf0.a;
                            aVar2.q(MyLog.TAG_COMMON);
                            aVar2.a("e =%s", e.getMessage());
                        }
                    }
                } else {
                    d = 1.0E-4d;
                }
                editText.setOnFocusChangeListener(new qik(radioGroup));
                editText.setOnClickListener(new View.OnClickListener() { // from class: mik
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        radioGroup.check(R.id.rb_partial_free_bet);
                    }
                });
                editText.addTextChangedListener(new rik(editText, giftDetails, viewInflate, textView3, textView));
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: nik
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup2, int i2) {
                        EditText editText2 = editText;
                        TextView textView5 = textView;
                        if (i2 != R.id.rb_all_free_bet) {
                            if (i2 == R.id.rb_partial_free_bet) {
                                editText2.setCursorVisible(true);
                                lop.d(editText2);
                                textView5.setEnabled(false);
                                return;
                            }
                            return;
                        }
                        lop.b(editText2, Boolean.FALSE);
                        TextView textView6 = textView3;
                        textView6.setVisibility(4);
                        editText2.setBackgroundResource(R.drawable.spr_bg_input_normal);
                        textView6.setText("");
                        editText2.setText("");
                        editText2.setCursorVisible(false);
                        textView5.setEnabled(true);
                    }
                });
                double currentBalance2 = giftDetails.getCurrentBalance() * d;
                Locale locale2 = Locale.US;
                textView4.setText(bjb0.a0(currentBalance2, locale2));
                editText.setHint(sn5.c(viewInflate, R.string.component_coupon__max_vamount, bjb0.a0(giftDetails.getCurrentBalance() * d, locale2)));
                final androidx.appcompat.app.b bVarCreate = aVar.create();
                bVarCreate.show();
                Window window = bVarCreate.getWindow();
                window.setWindowAnimations(R.style.AnimBottom);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                attributes.width = -2;
                attributes.height = -2;
                window.setAttributes(attributes);
                window.setContentView(viewInflate);
                window.clearFlags(131080);
                try {
                    window.setSoftInputMode(512);
                } catch (Exception unused) {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q("GiftAdapter");
                    aVar3.n("set WindowManager error", new Object[0]);
                }
                editText.setFilters(new InputFilter[]{new sik()});
                textView2.setOnClickListener(new View.OnClickListener() { // from class: oik
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        bVarCreate.dismiss();
                    }
                });
                textView.setOnClickListener(new View.OnClickListener() { // from class: pik
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        EditText editText2 = editText;
                        editText2.clearFocus();
                        lop.b(editText2, Boolean.FALSE);
                        bVarCreate.dismiss();
                        RadioGroup radioGroup2 = radioGroup;
                        int checkedRadioButtonId = radioGroup2.getCheckedRadioButtonId();
                        tik tikVar2 = tikVar;
                        GiftDetails giftDetails2 = giftDetails;
                        if (checkedRadioButtonId == R.id.rb_all_free_bet) {
                            tikVar2.l(giftDetails2, bjb0.W(giftDetails2.getCurrentBalance()));
                        } else if (radioGroup2.getCheckedRadioButtonId() == R.id.rb_partial_free_bet) {
                            tikVar2.l(giftDetails2, editText2.getText().toString());
                        }
                    }
                });
            }
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
    }

    public tik(Activity activity, ArrayList arrayList, boolean z, long j, String str, int i, String str2, zpk zpkVar, int i2, boolean z2, btk btkVar) {
        super(activity, arrayList);
        this.i = activity;
        this.f = z;
        this.z = j;
        this.v = str;
        this.w = i;
        this.y = str2;
        this.B = i2;
        this.C = zpkVar;
        this.A = z2;
        this.D = btkVar;
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
        return i == R.layout.spr_gift_skip_layout ? new a(dzc.a(viewGroup, i, viewGroup, false)) : new b(dzc.a(viewGroup, i, viewGroup, false));
    }

    public final int k() {
        List<T> list = this.b;
        int size = list.size();
        for (T t : list) {
            if (t.getType() != 10 && t.getType() != 20) {
                size--;
            }
        }
        return size;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final void l(GiftDetails giftDetails, String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            string = "";
        } else {
            BigDecimal bigDecimalA = b6y.a(str);
            if (bigDecimalA.compareTo(BigDecimal.ZERO) != 0) {
                string = bigDecimalA.toString();
            } else {
                string = "";
            }
        }
        this.D.V(new SelectedGiftData(string, giftDetails.getKind(), giftDetails.getGiftId(), bjb0.W(giftDetails.getLeastOrderAmount()), k(), giftDetails, false, true, true, null), k());
    }

    public class a extends a82 implements View.OnClickListener {
        public a(View view) {
            int i;
            super(view);
            view.findViewById(R.id.skip).setOnClickListener(this);
            TextView textView = (TextView) view.findViewById(R.id.note);
            textView.setVisibility((tik.this.f || (i = tik.this.B) == 159 || i == 146 || i == 147 || i == 101 || i == 150 || i == 173 || i == 171 || i == 152 || i == 153) ? 8 : 0);
            if (tik.this.A) {
                textView.setText(sn5.c(view, R.string.component_coupon__note_cashout_available_with_free_bet_gift, new Object[0]));
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            tik tikVar = tik.this;
            tikVar.D.V(GiftUtil.newUnselectedGiftData(tikVar.k()), tikVar.k());
        }

        @Override // defpackage.a82
        public final void a(int i) {
        }

        @Override // defpackage.a82
        public final void b(int i, View view) {
        }
    }
}
