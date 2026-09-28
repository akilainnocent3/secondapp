package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w540 extends pqz<t640, z640> {
    public final t440 A;
    public final y8j d;
    public final h440 e;
    public final q8h f;
    public final i440 i;
    public final j440 v;
    public final wcm w;
    public final c4r y;
    public final r440 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w540(y8j y8jVar, h440 h440Var, q8h q8hVar, i440 i440Var, j440 j440Var, wcm wcmVar, c4r c4rVar, r440 r440Var, t440 t440Var) {
        super(new v540());
        y8jVar.getClass();
        this.d = y8jVar;
        this.e = h440Var;
        this.f = q8hVar;
        this.i = i440Var;
        this.v = j440Var;
        this.w = wcmVar;
        this.y = c4rVar;
        this.z = r440Var;
        this.A = t440Var;
    }

    public static t640 j(w540 w540Var, int i) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = (t640) w540Var.getItem(i);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (t640) bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        TextView textView;
        t640.b bVar;
        Drawable drawableA;
        int i2;
        StringUiText stringUiText;
        t640.a aVar;
        z640 z640Var = (z640) d0Var;
        z640Var.getClass();
        t640 t640VarJ = j(this, i);
        Context context = z640Var.z;
        jjd0 jjd0Var = z640Var.b;
        ConstraintLayout constraintLayout = jjd0Var.a;
        ComposeView composeView = jjd0Var.c;
        TextView textView2 = jjd0Var.B;
        TextView textView3 = jjd0Var.A;
        TextView textView4 = jjd0Var.z;
        TextView textView5 = jjd0Var.y;
        TextView textView6 = jjd0Var.I;
        AppCompatImageView appCompatImageView = jjd0Var.H;
        CheckBox checkBox = jjd0Var.d;
        TextView textView7 = jjd0Var.f;
        TextView textView8 = jjd0Var.Q;
        TextView textView9 = jjd0Var.e;
        TextView textView10 = jjd0Var.i;
        constraintLayout.getClass();
        c8i0.o(constraintLayout, t640VarJ != null);
        if (t640VarJ == null) {
            return;
        }
        t640.d dVar = t640VarJ.m;
        z640Var.A = t640VarJ.f;
        boolean z = t640VarJ.e;
        z640Var.B = z;
        jjd0Var.a.setBackgroundResource(z ? R.color.warning_primary : R.color.brand_secondary_disable);
        jjd0Var.W.setColorFilter(context.getColor(z640Var.B ? R.color.brand_tertiary : R.color.text_disable_type1_primary), PorterDuff.Mode.SRC_IN);
        Long l = t640VarJ.c;
        Long l2 = t640VarJ.d;
        if (l != null) {
            textView = textView4;
            long jLongValue = l.longValue();
            Long l3 = l;
            bwf0 bwf0Var = bwf0.a;
            if (l2 == null) {
                t640.c cVar = t640.c.a;
                String strA = bwf0Var.a(jLongValue);
                StringUiText stringUiText2 = vch0.a;
                bVar = new t640.b(null, cVar, new t640.a(new StringUiText(strA), new StringUiText(bwf0Var.v(jLongValue))));
            } else {
                Long l4 = !vjt.b(l3.longValue(), l2.longValue()) ? l3 : null;
                if (l4 != null) {
                    String strX = bwf0Var.x(l4.longValue());
                    StringUiText stringUiText3 = vch0.a;
                    stringUiText = new StringUiText(strX);
                } else {
                    stringUiText = null;
                }
                t640.c cVar2 = (!vjt.a(l3.longValue(), l2.longValue()) ? l3 : null) != null ? t640.c.a : t640.c.b;
                if (vjt.a(l3.longValue(), l2.longValue())) {
                    l3 = null;
                }
                if (l3 != null) {
                    String strA2 = bwf0Var.a(jLongValue);
                    StringUiText stringUiText4 = vch0.a;
                    aVar = new t640.a(new StringUiText(strA2), new StringUiText(bwf0Var.v(jLongValue)));
                } else {
                    aVar = null;
                }
                bVar = new t640.b(stringUiText, cVar2, aVar);
            }
        } else {
            textView = textView4;
            bVar = new t640.b(null, t640.c.b, null);
        }
        ConstraintLayout constraintLayout2 = jjd0Var.w;
        UiText uiText = bVar.a;
        c8i0.o(constraintLayout2, uiText != null);
        c8i0.o(textView8, uiText != null);
        if (uiText != null) {
            textView8.setText(uiText.e(context));
        }
        View view = jjd0Var.K;
        t640.c cVar3 = t640.c.a;
        t640.c cVar4 = bVar.b;
        c8i0.o(view, cVar4 == cVar3);
        c8i0.o(jjd0Var.v, cVar4 == t640.c.b);
        t640.a aVar2 = bVar.c;
        if (aVar2 != null) {
            textView7.setVisibility(0);
            textView9.setVisibility(0);
            textView7.setText(aVar2.a.a);
            textView9.setText(aVar2.b.a);
        } else {
            textView7.setVisibility(8);
            textView9.setVisibility(8);
        }
        c8i0.o(checkBox, t640VarJ.h);
        checkBox.setChecked(t640VarJ.i);
        int color = context.getColor(t640VarJ.k);
        Drawable drawableA2 = gr0.a(context, R.drawable.spr_ic_keyboard_arrow_right_black_24dp);
        if (drawableA2 != null) {
            drawableA2.setTint(color);
        } else {
            drawableA2 = null;
        }
        jjd0Var.J.setBackgroundColor(context.getColor(t640VarJ.j));
        jjd0Var.P.setText(t640VarJ.l.e(context));
        appCompatImageView.setColorFilter(color);
        c8i0.o(appCompatImageView, t640VarJ.F);
        if (dVar instanceof t640.d.b) {
            textView10.setCompoundDrawablesRelativeWithIntrinsicBounds(s0b.c(context, R.drawable.ic_flexi_outline, new a78.a(color), null, 4), (Drawable) null, (Drawable) null, (Drawable) null);
            textView10.setText(((t640.d.b) dVar).a.e(context));
            textView10.setVisibility(0);
        } else if (Intrinsics.g(dVar, t640.d.C1115d.a)) {
            Drawable drawableC = gug0.c(context);
            if (drawableC != null) {
                drawableC.setTint(color);
            }
            textView10.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
            textView10.setText("");
            textView10.setVisibility(0);
        } else if (Intrinsics.g(dVar, t640.d.a.a)) {
            textView10.setCompoundDrawablesRelativeWithIntrinsicBounds(s0b.c(context, R.drawable.ic_any_win_label, new a78.a(color), null, 4), (Drawable) null, (Drawable) null, (Drawable) null);
            textView10.setText("");
            textView10.setVisibility(0);
        } else {
            if (!Intrinsics.g(dVar, t640.d.c.a)) {
                uhc.a();
                return;
            }
            textView10.setVisibility(8);
        }
        Integer num = t640VarJ.n;
        if (num == null || (drawableA = gr0.a(context, num.intValue())) == null) {
            drawableA = null;
        } else {
            Integer num2 = t640VarJ.o;
            if (num2 != null) {
                drawableA.setTint(context.getColor(num2.intValue()));
            }
        }
        textView6.setText(t640VarJ.p.e(context));
        textView6.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA, (Drawable) null, drawableA2, (Drawable) null);
        jjd0Var.N.setText(sn5.b(context, R.string.component_wap_share_bet__total_stake_vcurrency, t640VarJ.q.e(context).toString()));
        jjd0Var.O.setText(t640VarJ.r.a);
        jjd0Var.L.setText(t640VarJ.s.e(context));
        jjd0Var.M.setText(t640VarJ.t.e(context));
        boolean z2 = t640VarJ.u;
        boolean z3 = t640VarJ.v;
        jjd0Var.C.setVisibility((z2 || z3) ? 0 : 8);
        jjd0Var.F.setVisibility(z2 ? 0 : 8);
        jjd0Var.E.setVisibility(z3 ? 0 : 8);
        UiText uiText2 = t640VarJ.w;
        if (uiText2 != null) {
            textView5.setText(uiText2.e(context));
            i2 = 0;
            textView5.setVisibility(0);
        } else {
            i2 = 0;
            textView5.setVisibility(8);
        }
        UiText uiText3 = t640VarJ.x;
        if (uiText3 != null) {
            TextView textView11 = textView;
            textView11.setText(uiText3.e(context));
            textView11.setVisibility(i2);
        } else {
            textView.setVisibility(8);
        }
        UiText uiText4 = t640VarJ.y;
        if (uiText4 != null) {
            textView3.setText(uiText4.e(context));
            textView3.setVisibility(i2);
        } else {
            textView3.setVisibility(8);
        }
        UiText uiText5 = t640VarJ.z;
        if (uiText5 != null) {
            textView2.setText(uiText5.e(context));
            textView2.setVisibility(i2);
        } else {
            textView2.setVisibility(8);
        }
        c8i0.o(jjd0Var.G, t640VarJ.A);
        c8i0.o(jjd0Var.b, t640VarJ.B);
        c8i0.o(jjd0Var.S, t640VarJ.C);
        c8i0.o(jjd0Var.T, t640VarJ.D);
        String str = t640VarJ.E;
        if (str != null) {
            z640Var.a.c(jjd0Var.R, str);
        }
        String str2 = t640VarJ.g;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                composeView.setVisibility(0);
                szx.b(composeView, str2, t640VarJ.a, e0y.BetHistory, null);
                zi50.a aVar3 = zi50.b;
                return;
            }
        }
        composeView.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.spr_real_bet_history_item, viewGroup, false);
        int i2 = R.id.barrier_end_buttons;
        if (((Barrier) h5e.a(R.id.barrier_end_buttons, viewA)) != null) {
            i2 = R.id.edit_bet;
            TextView textView = (TextView) h5e.a(R.id.edit_bet, viewA);
            if (textView != null) {
                i2 = R.id.guideline_vertical;
                if (((Guideline) h5e.a(R.id.guideline_vertical, viewA)) != null) {
                    i2 = R.id.guideline_vertical_start;
                    if (((Guideline) h5e.a(R.id.guideline_vertical_start, viewA)) != null) {
                        i2 = R.id.note_container;
                        ComposeView composeView = (ComposeView) h5e.a(R.id.note_container, viewA);
                        if (composeView != null) {
                            i2 = R.id.r_bet_bulk_delete_box;
                            CheckBox checkBox = (CheckBox) h5e.a(R.id.r_bet_bulk_delete_box, viewA);
                            if (checkBox != null) {
                                i2 = R.id.r_bet_date;
                                TextView textView2 = (TextView) h5e.a(R.id.r_bet_date, viewA);
                                if (textView2 != null) {
                                    i2 = R.id.r_bet_day;
                                    TextView textView3 = (TextView) h5e.a(R.id.r_bet_day, viewA);
                                    if (textView3 != null) {
                                        i2 = R.id.r_bet_insure;
                                        TextView textView4 = (TextView) h5e.a(R.id.r_bet_insure, viewA);
                                        if (textView4 != null) {
                                            i2 = R.id.r_bet_item_divider_line;
                                            View viewA2 = h5e.a(R.id.r_bet_item_divider_line, viewA);
                                            if (viewA2 != null) {
                                                i2 = R.id.r_bet_item_top_divider_line_layout;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.r_bet_item_top_divider_line_layout, viewA);
                                                if (constraintLayout != null) {
                                                    i2 = R.id.r_bet_match_desc1;
                                                    TextView textView5 = (TextView) h5e.a(R.id.r_bet_match_desc1, viewA);
                                                    if (textView5 != null) {
                                                        i2 = R.id.r_bet_match_desc2;
                                                        TextView textView6 = (TextView) h5e.a(R.id.r_bet_match_desc2, viewA);
                                                        if (textView6 != null) {
                                                            i2 = R.id.r_bet_match_desc3;
                                                            TextView textView7 = (TextView) h5e.a(R.id.r_bet_match_desc3, viewA);
                                                            if (textView7 != null) {
                                                                i2 = R.id.r_bet_match_desc4;
                                                                TextView textView8 = (TextView) h5e.a(R.id.r_bet_match_desc4, viewA);
                                                                if (textView8 != null) {
                                                                    i2 = R.id.r_bet_match_desc_container;
                                                                    if (((ConstraintLayout) h5e.a(R.id.r_bet_match_desc_container, viewA)) != null) {
                                                                        i2 = R.id.r_bet_odds_boost;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.r_bet_odds_boost, viewA);
                                                                        if (constraintLayout2 != null) {
                                                                            i2 = R.id.r_bet_odds_boost_divider_line;
                                                                            View viewA3 = h5e.a(R.id.r_bet_odds_boost_divider_line, viewA);
                                                                            if (viewA3 != null) {
                                                                                i2 = R.id.r_bet_odds_boost_flash_group;
                                                                                Group group = (Group) h5e.a(R.id.r_bet_odds_boost_flash_group, viewA);
                                                                                if (group != null) {
                                                                                    i2 = R.id.r_bet_odds_boost_flash_img;
                                                                                    if (((ImageView) h5e.a(R.id.r_bet_odds_boost_flash_img, viewA)) != null) {
                                                                                        i2 = R.id.r_bet_odds_boost_flash_text;
                                                                                        if (((TextView) h5e.a(R.id.r_bet_odds_boost_flash_text, viewA)) != null) {
                                                                                            i2 = R.id.r_bet_odds_boost_live_group;
                                                                                            Group group2 = (Group) h5e.a(R.id.r_bet_odds_boost_live_group, viewA);
                                                                                            if (group2 != null) {
                                                                                                i2 = R.id.r_bet_odds_boost_live_img;
                                                                                                if (((ImageView) h5e.a(R.id.r_bet_odds_boost_live_img, viewA)) != null) {
                                                                                                    i2 = R.id.r_bet_odds_boost_live_text;
                                                                                                    if (((TextView) h5e.a(R.id.r_bet_odds_boost_live_text, viewA)) != null) {
                                                                                                        i2 = R.id.r_bet_pending_desc;
                                                                                                        TextView textView9 = (TextView) h5e.a(R.id.r_bet_pending_desc, viewA);
                                                                                                        if (textView9 != null) {
                                                                                                            i2 = R.id.r_bet_pending_event_icon;
                                                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.r_bet_pending_event_icon, viewA);
                                                                                                            if (appCompatImageView != null) {
                                                                                                                i2 = R.id.r_bet_status;
                                                                                                                TextView textView10 = (TextView) h5e.a(R.id.r_bet_status, viewA);
                                                                                                                if (textView10 != null) {
                                                                                                                    i2 = R.id.r_bet_title_layout;
                                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.r_bet_title_layout, viewA);
                                                                                                                    if (constraintLayout3 != null) {
                                                                                                                        i2 = R.id.r_bet_top_divider_line;
                                                                                                                        View viewA4 = h5e.a(R.id.r_bet_top_divider_line, viewA);
                                                                                                                        if (viewA4 != null) {
                                                                                                                            i2 = R.id.r_bet_total_return;
                                                                                                                            TextView textView11 = (TextView) h5e.a(R.id.r_bet_total_return, viewA);
                                                                                                                            if (textView11 != null) {
                                                                                                                                i2 = R.id.r_bet_total_return_value;
                                                                                                                                TextView textView12 = (TextView) h5e.a(R.id.r_bet_total_return_value, viewA);
                                                                                                                                if (textView12 != null) {
                                                                                                                                    i2 = R.id.r_bet_total_stake;
                                                                                                                                    TextView textView13 = (TextView) h5e.a(R.id.r_bet_total_stake, viewA);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i2 = R.id.r_bet_total_stake_value;
                                                                                                                                        TextView textView14 = (TextView) h5e.a(R.id.r_bet_total_stake_value, viewA);
                                                                                                                                        if (textView14 != null) {
                                                                                                                                            i2 = R.id.r_bet_type;
                                                                                                                                            TextView textView15 = (TextView) h5e.a(R.id.r_bet_type, viewA);
                                                                                                                                            if (textView15 != null) {
                                                                                                                                                i2 = R.id.r_bet_year;
                                                                                                                                                TextView textView16 = (TextView) h5e.a(R.id.r_bet_year, viewA);
                                                                                                                                                if (textView16 != null) {
                                                                                                                                                    i2 = R.id.remix_bet_button;
                                                                                                                                                    TextView textView17 = (TextView) h5e.a(R.id.remix_bet_button, viewA);
                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                        i2 = R.id.remix_bet_button_container;
                                                                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.remix_bet_button_container, viewA);
                                                                                                                                                        if (constraintLayout4 != null) {
                                                                                                                                                            i2 = R.id.remix_bet_red_dot;
                                                                                                                                                            View viewA5 = h5e.a(R.id.remix_bet_red_dot, viewA);
                                                                                                                                                            if (viewA5 != null) {
                                                                                                                                                                i2 = R.id.space;
                                                                                                                                                                View viewA6 = h5e.a(R.id.space, viewA);
                                                                                                                                                                if (viewA6 != null) {
                                                                                                                                                                    i2 = R.id.swipe_content_view;
                                                                                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.swipe_content_view, viewA);
                                                                                                                                                                    if (constraintLayout5 != null) {
                                                                                                                                                                        i2 = R.id.swipe_delete_icon;
                                                                                                                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.swipe_delete_icon, viewA);
                                                                                                                                                                        if (appCompatImageView2 != null) {
                                                                                                                                                                            jjd0 jjd0Var = new jjd0((ConstraintLayout) viewA, textView, composeView, checkBox, textView2, textView3, textView4, viewA2, constraintLayout, textView5, textView6, textView7, textView8, constraintLayout2, viewA3, group, group2, textView9, appCompatImageView, textView10, constraintLayout3, viewA4, textView11, textView12, textView13, textView14, textView15, textView16, textView17, constraintLayout4, viewA5, viewA6, constraintLayout5, appCompatImageView2);
                                                                                                                                                                            int i3 = 1;
                                                                                                                                                                            return new z640(this.d, jjd0Var, new r540(this), new s540(this), new t540(this), this.z, new pah(this, i3), this.y, new bp3(this, i3), new rah(this, i3));
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        z640 z640Var = (z640) d0Var;
        z640Var.getClass();
        super.onViewRecycled(z640Var);
        z640Var.b(false);
    }
}
