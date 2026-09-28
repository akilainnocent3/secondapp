package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.models.EligibilityCriteria;
import com.sportygames.commons.models.PrizeInfo;
import com.sportygames.commons.models.TournamentConfigVO;
import com.sportygames.commons.models.UserPlayInfo;
import com.sportygames.commons.tournament.model.TournamentRankResponse;
import com.sportygames.commons.tournament.util.DigitTextView;
import com.sportygames.commons.utils.CasinoLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh4g0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h4g0 extends Fragment {
    public kyi a;
    public TournamentConfigVO b;
    public UserPlayInfo c;
    public i4g0 d;
    public czb0 f;
    public dzb0 i;
    public ezb0 v;
    public ObjectAnimator w;
    public boolean z;
    public String e = "";
    public final ArrayList y = new ArrayList();

    public static boolean m0(int i, List list) {
        PrizeInfo prizeInfo = (PrizeInfo) CollectionsKt.d0(list);
        if (prizeInfo != null) {
            Integer endRank = prizeInfo.getEndRank();
            if (i <= (endRank != null ? endRank.intValue() : 0)) {
                return true;
            }
        }
        return false;
    }

    public static void n0(String str) {
        op5.a.getClass();
        String str2 = op5.c;
        if (str2 == null) {
            str2 = "";
        }
        wz.a(str, krh0.e(str2), new String[0]);
        CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
        String str3 = op5.c;
        casinoLogger.logEventToCasino(str, vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, krh0.e(str3 != null ? str3 : "")), new Pair("Platform", "ANDROID")));
    }

    public static void t0(h4g0 h4g0Var, int i, int i2) {
        ArrayList arrayList = h4g0Var.y;
        if (h4g0Var.z || i == i2) {
            return;
        }
        arrayList.clear();
        Iterable iterableJ = i > i2 ? f.j(i, i2) : new IntRange(i, i2, 1);
        for (int i3 = 0; i3 < 6; i3++) {
            p48.w(iterableJ, arrayList);
        }
        arrayList.add(Integer.valueOf(i2));
        h4g0Var.z = true;
        kyi kyiVar = h4g0Var.a;
        if (kyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        kyiVar.Q.setValueWithAnimation(arrayList, true);
        kyi kyiVar2 = h4g0Var.a;
        if (kyiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        kyiVar2.Q.a(i2, i);
        h4g0Var.z = false;
    }

    public final void j0(Context context, String str) {
        String startTime;
        String str2;
        int i;
        String str3;
        if (k94.a(str)) {
            kyi kyiVar = this.a;
            if (kyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = kyiVar.d0;
            TournamentConfigVO tournamentConfigVO = this.b;
            String name = tournamentConfigVO != null ? tournamentConfigVO.getName() : null;
            op5 op5Var = op5.a;
            String string = context.getString(R.string.starts_now_cms);
            string.getClass();
            op5Var.getClass();
            textView.setText(name + "  " + op5.b(string, "Starts now", null) + " ");
            return;
        }
        TournamentConfigVO tournamentConfigVO2 = this.b;
        String str4 = "";
        if (tournamentConfigVO2 == null || (startTime = tournamentConfigVO2.getStartTime()) == null) {
            startTime = "";
        }
        String strG = k94.g(startTime);
        List listSplit$default = StringsKt__StringsKt.split$default(strG, new String[]{" "}, false, 0, 6, null);
        if (listSplit$default != null && (str3 = (String) listSplit$default.get(0)) != null) {
            str4 = str3;
        }
        if (StringsKt.M(strG, "days", false) || StringsKt.M(strG, "day", false)) {
            if (str4.equals("1")) {
                str2 = "1 day";
                i = R.string.day_cms_tourney;
            } else {
                str2 = "{value} days";
                i = R.string.days_cms;
            }
        } else if (StringsKt.M(strG, "hours", false) || StringsKt.M(strG, "hour", false)) {
            if (str4.equals("1")) {
                str2 = "1 hour";
                i = R.string.hour_cms;
            } else {
                str2 = "{value} hours";
                i = R.string.hours_cms;
            }
        } else if (StringsKt.M(strG, "minutes", false) || StringsKt.M(strG, "minute", false)) {
            if (str4.equals("1")) {
                str2 = "1 minute";
                i = R.string.minute_cms;
            } else {
                str2 = "{value} minutes";
                i = R.string.minutes_cms;
            }
        } else if (str4.equals("1")) {
            str2 = "1 second";
            i = R.string.second_cms;
        } else {
            str2 = "{value} seconds";
            i = R.string.seconds_cms;
        }
        HashMap map = new HashMap();
        map.put("{value}", str4);
        kyi kyiVar2 = this.a;
        if (kyiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView2 = kyiVar2.d0;
        TournamentConfigVO tournamentConfigVO3 = this.b;
        String name2 = tournamentConfigVO3 != null ? tournamentConfigVO3.getName() : null;
        op5 op5Var2 = op5.a;
        String string2 = context.getString(R.string.starts_in_cms);
        string2.getClass();
        op5Var2.getClass();
        String strB = op5.b(string2, "Starts in", null);
        String string3 = context.getString(i);
        string3.getClass();
        textView2.setText(name2 + "! " + strB + " " + op5.b(string3, str2, map));
    }

    public final void o0(String str) {
        boolean zEquals = str.equals("up");
        kyi kyiVar = this.a;
        if (zEquals) {
            if (kyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(kyiVar.A, "translationY", 0.0f, -1000.0f);
            this.w = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setDuration(1500L);
            }
            ObjectAnimator objectAnimator = this.w;
            if (objectAnimator != null) {
                objectAnimator.setInterpolator(new LinearInterpolator());
            }
            ObjectAnimator objectAnimator2 = this.w;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
                return;
            }
            return;
        }
        if (kyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(kyiVar.z, "translationY", 0.0f, 1000.0f);
        this.w = objectAnimatorOfFloat2;
        if (objectAnimatorOfFloat2 != null) {
            objectAnimatorOfFloat2.setDuration(1500L);
        }
        ObjectAnimator objectAnimator3 = this.w;
        if (objectAnimator3 != null) {
            objectAnimator3.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator4 = this.w;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_tournament_banner, viewGroup, false);
        int i = R.id.btn_close;
        ImageView imageView = (ImageView) h5e.a(R.id.btn_close, viewInflate);
        if (imageView != null) {
            i = R.id.day;
            TextView textView = (TextView) h5e.a(R.id.day, viewInflate);
            if (textView != null) {
                i = R.id.grp_join_tournament;
                Group group = (Group) h5e.a(R.id.grp_join_tournament, viewInflate);
                if (group != null) {
                    i = R.id.grp_out_of_rank;
                    Group group2 = (Group) h5e.a(R.id.grp_out_of_rank, viewInflate);
                    if (group2 != null) {
                        i = R.id.grp_place_first_bet;
                        Group group3 = (Group) h5e.a(R.id.grp_place_first_bet, viewInflate);
                        if (group3 != null) {
                            i = R.id.grp_timer_banner_new;
                            Group group4 = (Group) h5e.a(R.id.grp_timer_banner_new, viewInflate);
                            if (group4 != null) {
                                i = R.id.grp_timer_banner_old;
                                Group group5 = (Group) h5e.a(R.id.grp_timer_banner_old, viewInflate);
                                if (group5 != null) {
                                    i = R.id.grp_tournament_stopped;
                                    Group group6 = (Group) h5e.a(R.id.grp_tournament_stopped, viewInflate);
                                    if (group6 != null) {
                                        i = R.id.hour;
                                        TextView textView2 = (TextView) h5e.a(R.id.hour, viewInflate);
                                        if (textView2 != null) {
                                            i = R.id.ic_arrow_down;
                                            ImageView imageView2 = (ImageView) h5e.a(R.id.ic_arrow_down, viewInflate);
                                            if (imageView2 != null) {
                                                i = R.id.ic_arrow_up;
                                                ImageView imageView3 = (ImageView) h5e.a(R.id.ic_arrow_up, viewInflate);
                                                if (imageView3 != null) {
                                                    i = R.id.ic_expand_tournament;
                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.ic_expand_tournament, viewInflate);
                                                    if (imageView4 != null) {
                                                        i = R.id.img_trophy;
                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.img_trophy, viewInflate);
                                                        if (imageView5 != null) {
                                                            i = R.id.img_trophy_confetti;
                                                            ImageView imageView6 = (ImageView) h5e.a(R.id.img_trophy_confetti, viewInflate);
                                                            if (imageView6 != null) {
                                                                i = R.id.iv_arrow;
                                                                if (((ImageView) h5e.a(R.id.iv_arrow, viewInflate)) != null) {
                                                                    i = R.id.iv_bg_trophy;
                                                                    if (((ImageView) h5e.a(R.id.iv_bg_trophy, viewInflate)) != null) {
                                                                        i = R.id.join_banner_text_container;
                                                                        if (((LinearLayout) h5e.a(R.id.join_banner_text_container, viewInflate)) != null) {
                                                                            i = R.id.layout_days;
                                                                            if (((LinearLayout) h5e.a(R.id.layout_days, viewInflate)) != null) {
                                                                                i = R.id.layout_first_bet;
                                                                                if (((LinearLayout) h5e.a(R.id.layout_first_bet, viewInflate)) != null) {
                                                                                    i = R.id.layout_hours;
                                                                                    if (((LinearLayout) h5e.a(R.id.layout_hours, viewInflate)) != null) {
                                                                                        i = R.id.layout_in_out_of_rank;
                                                                                        if (((ConstraintLayout) h5e.a(R.id.layout_in_out_of_rank, viewInflate)) != null) {
                                                                                            i = R.id.layout_join_button;
                                                                                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.layout_join_button, viewInflate);
                                                                                            if (linearLayout != null) {
                                                                                                i = R.id.layout_min;
                                                                                                if (((LinearLayout) h5e.a(R.id.layout_min, viewInflate)) != null) {
                                                                                                    i = R.id.layout_timer;
                                                                                                    if (((LinearLayout) h5e.a(R.id.layout_timer, viewInflate)) != null) {
                                                                                                        i = R.id.layout_timer_banner_new;
                                                                                                        if (((LinearLayout) h5e.a(R.id.layout_timer_banner_new, viewInflate)) != null) {
                                                                                                            i = R.id.layout_timer_banner_old;
                                                                                                            if (((LinearLayout) h5e.a(R.id.layout_timer_banner_old, viewInflate)) != null) {
                                                                                                                i = R.id.layout_timer_new;
                                                                                                                if (((LinearLayout) h5e.a(R.id.layout_timer_new, viewInflate)) != null) {
                                                                                                                    i = R.id.layout_tournament_banner;
                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.layout_tournament_banner, viewInflate);
                                                                                                                    if (constraintLayout != null) {
                                                                                                                        i = R.id.minute;
                                                                                                                        TextView textView3 = (TextView) h5e.a(R.id.minute, viewInflate);
                                                                                                                        if (textView3 != null) {
                                                                                                                            i = R.id.prizes_section;
                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.prizes_section, viewInflate)) != null) {
                                                                                                                                i = R.id.rank_section;
                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.rank_section, viewInflate)) != null) {
                                                                                                                                    i = R.id.tournament_stopped;
                                                                                                                                    if (((LinearLayout) h5e.a(R.id.tournament_stopped, viewInflate)) != null) {
                                                                                                                                        i = R.id.tv_colon1;
                                                                                                                                        if (((TextView) h5e.a(R.id.tv_colon1, viewInflate)) != null) {
                                                                                                                                            i = R.id.tv_colon2;
                                                                                                                                            if (((TextView) h5e.a(R.id.tv_colon2, viewInflate)) != null) {
                                                                                                                                                i = R.id.tv_days_new;
                                                                                                                                                TextView textView4 = (TextView) h5e.a(R.id.tv_days_new, viewInflate);
                                                                                                                                                if (textView4 != null) {
                                                                                                                                                    i = R.id.tv_hours;
                                                                                                                                                    TextView textView5 = (TextView) h5e.a(R.id.tv_hours, viewInflate);
                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                        i = R.id.tv_hours_new;
                                                                                                                                                        TextView textView6 = (TextView) h5e.a(R.id.tv_hours_new, viewInflate);
                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                            i = R.id.tv_join;
                                                                                                                                                            TextView textView7 = (TextView) h5e.a(R.id.tv_join, viewInflate);
                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                i = R.id.tv_minutes;
                                                                                                                                                                TextView textView8 = (TextView) h5e.a(R.id.tv_minutes, viewInflate);
                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                    i = R.id.tv_minutes_new;
                                                                                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.tv_minutes_new, viewInflate);
                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                        i = R.id.tv_prizes_label;
                                                                                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.tv_prizes_label, viewInflate);
                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                            i = R.id.tv_prizes_rank_in;
                                                                                                                                                                            TextView textView11 = (TextView) h5e.a(R.id.tv_prizes_rank_in, viewInflate);
                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                i = R.id.tv_prizes_rank_out;
                                                                                                                                                                                TextView textView12 = (TextView) h5e.a(R.id.tv_prizes_rank_out, viewInflate);
                                                                                                                                                                                if (textView12 != null) {
                                                                                                                                                                                    i = R.id.tv_rank;
                                                                                                                                                                                    DigitTextView digitTextView = (DigitTextView) h5e.a(R.id.tv_rank, viewInflate);
                                                                                                                                                                                    if (digitTextView != null) {
                                                                                                                                                                                        i = R.id.tv_rank_label;
                                                                                                                                                                                        TextView textView13 = (TextView) h5e.a(R.id.tv_rank_label, viewInflate);
                                                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                                                            i = R.id.tv_seconds;
                                                                                                                                                                                            TextView textView14 = (TextView) h5e.a(R.id.tv_seconds, viewInflate);
                                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                                i = R.id.tv_starts_in;
                                                                                                                                                                                                TextView textView15 = (TextView) h5e.a(R.id.tv_starts_in, viewInflate);
                                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                                    i = R.id.tv_stopped_amount;
                                                                                                                                                                                                    TextView textView16 = (TextView) h5e.a(R.id.tv_stopped_amount, viewInflate);
                                                                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                                                                        i = R.id.tv_stopped_subtitle;
                                                                                                                                                                                                        TextView textView17 = (TextView) h5e.a(R.id.tv_stopped_subtitle, viewInflate);
                                                                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                                                                            i = R.id.tv_stopped_title;
                                                                                                                                                                                                            TextView textView18 = (TextView) h5e.a(R.id.tv_stopped_title, viewInflate);
                                                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                                                i = R.id.tv_subtitle;
                                                                                                                                                                                                                TextView textView19 = (TextView) h5e.a(R.id.tv_subtitle, viewInflate);
                                                                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                                                                    i = R.id.tv_subtitle_amount;
                                                                                                                                                                                                                    TextView textView20 = (TextView) h5e.a(R.id.tv_subtitle_amount, viewInflate);
                                                                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                                                                        i = R.id.tv_subtitle_first_bet;
                                                                                                                                                                                                                        TextView textView21 = (TextView) h5e.a(R.id.tv_subtitle_first_bet, viewInflate);
                                                                                                                                                                                                                        if (textView21 != null) {
                                                                                                                                                                                                                            i = R.id.tv_subtitle_more;
                                                                                                                                                                                                                            TextView textView22 = (TextView) h5e.a(R.id.tv_subtitle_more, viewInflate);
                                                                                                                                                                                                                            if (textView22 != null) {
                                                                                                                                                                                                                                i = R.id.tv_timer_banner_text_new;
                                                                                                                                                                                                                                TextView textView23 = (TextView) h5e.a(R.id.tv_timer_banner_text_new, viewInflate);
                                                                                                                                                                                                                                if (textView23 != null) {
                                                                                                                                                                                                                                    i = R.id.tv_timer_banner_text_old;
                                                                                                                                                                                                                                    TextView textView24 = (TextView) h5e.a(R.id.tv_timer_banner_text_old, viewInflate);
                                                                                                                                                                                                                                    if (textView24 != null) {
                                                                                                                                                                                                                                        i = R.id.tv_title;
                                                                                                                                                                                                                                        TextView textView25 = (TextView) h5e.a(R.id.tv_title, viewInflate);
                                                                                                                                                                                                                                        if (textView25 != null) {
                                                                                                                                                                                                                                            i = R.id.tv_title_first_bet;
                                                                                                                                                                                                                                            TextView textView26 = (TextView) h5e.a(R.id.tv_title_first_bet, viewInflate);
                                                                                                                                                                                                                                            if (textView26 != null) {
                                                                                                                                                                                                                                                i = R.id.tv_total_rank;
                                                                                                                                                                                                                                                TextView textView27 = (TextView) h5e.a(R.id.tv_total_rank, viewInflate);
                                                                                                                                                                                                                                                if (textView27 != null) {
                                                                                                                                                                                                                                                    i = R.id.user_ranks;
                                                                                                                                                                                                                                                    if (((LinearLayout) h5e.a(R.id.user_ranks, viewInflate)) != null) {
                                                                                                                                                                                                                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                                                                                                                                                                                                        this.a = new kyi(frameLayout, imageView, textView, group, group2, group3, group4, group5, group6, textView2, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, constraintLayout, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, digitTextView, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27);
                                                                                                                                                                                                                                                        frameLayout.getClass();
                                                                                                                                                                                                                                                        return frameLayout;
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (this.a != null) {
            Context context = getContext();
            if (context != null) {
                op5 op5Var = op5.a;
                String string = context.getString(R.string.ic_tournament_trophy_cms);
                string.getClass();
                op5Var.getClass();
                String strB = op5.b(string, "https://s.sporty.net/cms/Trophy_1_3_d403c92442.png", null);
                String str = strB.length() != 0 ? strB : "https://s.sporty.net/cms/Trophy_1_3_d403c92442.png";
                xa50 xa50VarD = com.bumptech.glide.a.b(getContext()).d(this);
                xa50VarD.getClass();
                po80 po80Var = new po80(xa50VarD, str, na7.a(xa50VarD, Drawable.class, str), lo80.a);
                kyi kyiVar = this.a;
                if (kyiVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                po80Var.e(kyiVar.C);
            }
            kyi kyiVar2 = this.a;
            if (kyiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            gr60.a(kyiVar2.b, new Function1() { // from class: f4g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Long id;
                    ((View) obj).getClass();
                    h4g0 h4g0Var = this.a;
                    czb0 czb0Var = h4g0Var.f;
                    if (czb0Var != null) {
                        TournamentConfigVO tournamentConfigVO = h4g0Var.b;
                        czb0Var.invoke(Long.valueOf((tournamentConfigVO == null || (id = tournamentConfigVO.getId()) == null) ? 0L : id.longValue()));
                    }
                    return Unit.a;
                }
            });
            kyi kyiVar3 = this.a;
            if (kyiVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            int i = 1;
            gr60.a(kyiVar3.E, new dyb0(this, i));
            kyi kyiVar4 = this.a;
            if (kyiVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            gr60.a(kyiVar4.F, new mkl(this, i));
            kyi kyiVar5 = this.a;
            if (kyiVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            gr60.a(kyiVar5.B, new Function1() { // from class: g4g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Long id;
                    ((View) obj).getClass();
                    h4g0 h4g0Var = this.a;
                    dzb0 dzb0Var = h4g0Var.i;
                    if (dzb0Var != null) {
                        TournamentConfigVO tournamentConfigVO = h4g0Var.b;
                        dzb0Var.invoke(Long.valueOf((tournamentConfigVO == null || (id = tournamentConfigVO.getId()) == null) ? 0L : id.longValue()));
                    }
                    return Unit.a;
                }
            });
            xag0.a.f(getViewLifecycleOwner(), new m4g0(new Function1() { // from class: c4g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    h4g0 h4g0Var;
                    Object obj2;
                    List list = (List) obj;
                    if (list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            h4g0Var = this.a;
                            obj2 = null;
                            if (!zHasNext) {
                                break;
                            }
                            Object next = it.next();
                            Long id = ((TournamentConfigVO) next).getId();
                            TournamentConfigVO tournamentConfigVO = h4g0Var.b;
                            if (Intrinsics.g(id, tournamentConfigVO != null ? tournamentConfigVO.getId() : null)) {
                                obj2 = next;
                                break;
                            }
                        }
                        h4g0Var.b = (TournamentConfigVO) obj2;
                    }
                    return Unit.a;
                }
            }));
            xag0.c.f(getViewLifecycleOwner(), new m4g0(new byb0(this, i)));
            xag0.e.f(getViewLifecycleOwner(), new m4g0(new Function1() { // from class: d4g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    h4g0 h4g0Var;
                    List<PrizeInfo> prizeInfo;
                    List<PrizeInfo> prizeInfo2;
                    HashMap map = (HashMap) obj;
                    if (map != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            h4g0Var = this.a;
                            if (!zHasNext) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            TournamentConfigVO tournamentConfigVO = h4g0Var.b;
                            if (tournamentConfigVO != null) {
                                long jLongValue = ((Number) entry.getKey()).longValue();
                                Long id = tournamentConfigVO.getId();
                                if (id != null && jLongValue == id.longValue()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            TournamentConfigVO tournamentConfigVO2 = h4g0Var.b;
                            if (tournamentConfigVO2 != null) {
                                long jLongValue2 = ((Number) entry2.getKey()).longValue();
                                Long id2 = tournamentConfigVO2.getId();
                                if (id2 != null && jLongValue2 == id2.longValue()) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                        }
                        Collection collectionValues = linkedHashMap2.values();
                        String str2 = collectionValues != null ? (String) CollectionsKt.U(collectionValues) : null;
                        if (str2 != null && str2.length() != 0) {
                            try {
                                TournamentRankResponse tournamentRankResponse = (TournamentRankResponse) new eal().e(str2, TournamentRankResponse.class);
                                if (tournamentRankResponse != null) {
                                    kyi kyiVar6 = h4g0Var.a;
                                    if (kyiVar6 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    Integer intOrNull = StringsKt.toIntOrNull(kyiVar6.Q.getValue());
                                    int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                                    Integer rank = tournamentRankResponse.getRank();
                                    boolean z = (rank != null ? rank.intValue() : 0) < iIntValue;
                                    Integer rank2 = tournamentRankResponse.getRank();
                                    boolean z2 = iIntValue != 0 && (rank2 != null ? rank2.intValue() : 0) > iIntValue;
                                    Integer rank3 = tournamentRankResponse.getRank();
                                    int iIntValue2 = rank3 != null ? rank3.intValue() : 0;
                                    TournamentConfigVO tournamentConfigVO3 = h4g0Var.b;
                                    if (tournamentConfigVO3 == null || (prizeInfo = tournamentConfigVO3.getPrizeInfo()) == null) {
                                        prizeInfo = m2g.a;
                                    }
                                    if (h4g0.m0(iIntValue2, prizeInfo)) {
                                        Integer rank4 = tournamentRankResponse.getRank();
                                        h4g0Var.r0(rank4 != null ? rank4.intValue() : 0, h4g0Var.b, true);
                                    } else {
                                        Integer rank5 = tournamentRankResponse.getRank();
                                        h4g0Var.s0(rank5 != null ? rank5.intValue() : 0, h4g0Var.b, true);
                                    }
                                    if (z) {
                                        Integer rank6 = tournamentRankResponse.getRank();
                                        int iIntValue3 = rank6 != null ? rank6.intValue() : 0;
                                        TournamentConfigVO tournamentConfigVO4 = h4g0Var.b;
                                        if (tournamentConfigVO4 == null || (prizeInfo2 = tournamentConfigVO4.getPrizeInfo()) == null) {
                                            prizeInfo2 = m2g.a;
                                        }
                                        if (!h4g0.m0(iIntValue3, prizeInfo2)) {
                                            h4g0Var.o0("up");
                                            ej5.c(ebs.a(h4g0Var.getLifecycle()), null, null, new j4g0(h4g0Var, null), 3);
                                        } else if (iIntValue != 0) {
                                            Context context2 = h4g0Var.getContext();
                                            if (context2 != null) {
                                                kyi kyiVar7 = h4g0Var.a;
                                                if (kyiVar7 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                kyiVar7.C.startAnimation(AnimationUtils.loadAnimation(context2, R.anim.tournament_trophy_shake));
                                            }
                                            h4g0Var.p0();
                                            h4g0Var.o0("up");
                                            ej5.c(ebs.a(h4g0Var.getLifecycle()), null, null, new j4g0(h4g0Var, null), 3);
                                        }
                                    } else if (z2) {
                                        h4g0Var.o0("down");
                                        ej5.c(ebs.a(h4g0Var.getLifecycle()), null, null, new k4g0(h4g0Var, null), 3);
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
            xag0.d.f(getViewLifecycleOwner(), new m4g0(new h93(this, i)));
            xag0.b.f(getViewLifecycleOwner(), new m4g0(new Function1() { // from class: e4g0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    h4g0 h4g0Var;
                    TournamentConfigVO tournamentConfigVO;
                    Context context2;
                    Pair pair = (Pair) obj;
                    if (pair != null && (tournamentConfigVO = (h4g0Var = this.a).b) != null) {
                        long jLongValue = ((Number) pair.a).longValue();
                        Long id = tournamentConfigVO.getId();
                        if (id != null && jLongValue == id.longValue()) {
                            kyi kyiVar6 = h4g0Var.a;
                            if (kyiVar6 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            if (kyiVar6.d.getVisibility() == 0 && (context2 = h4g0Var.getContext()) != null) {
                                h4g0Var.j0(context2, (String) pair.b);
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        }
    }

    public final void p0() {
        Context context = getContext();
        if (context != null) {
            op5 op5Var = op5.a;
            String string = context.getString(R.string.tournament_gif);
            string.getClass();
            po80<thk> po80VarA = new mo80(np5.a(context, context)).a(Uri.parse(op5.c(op5Var, string, "")));
            hre.a aVar = hre.a;
            aVar.getClass();
            po80VarA.c(aVar);
            po80VarA.h();
            a aVar2 = new a();
            ea50<thk> ea50VarB = po80VarA.b();
            ea50VarB.L(aVar2, null, ea50VarB, fug.a);
        }
    }

    public final void q0() {
        List<EligibilityCriteria> eligibilityCriteria;
        EligibilityCriteria eligibilityCriteria2;
        Double minimumStakeCriteria;
        Resources resources;
        Resources resources2;
        Context context = getContext();
        if (context != null) {
            this.e = "active";
            kyi kyiVar = this.a;
            if (kyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = kyiVar.C.getLayoutParams();
            Context context2 = getContext();
            layoutParams.width = (context2 == null || (resources2 = context2.getResources()) == null) ? 0 : resources2.getDimensionPixelSize(R.dimen._35sdp);
            Context context3 = getContext();
            layoutParams.height = (context3 == null || (resources = context3.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen._33sdp);
            kyi kyiVar2 = this.a;
            if (kyiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar2.C.setLayoutParams(layoutParams);
            kyi kyiVar3 = this.a;
            if (kyiVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar3.d.setVisibility(8);
            kyi kyiVar4 = this.a;
            if (kyiVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar4.i.setVisibility(8);
            kyi kyiVar5 = this.a;
            if (kyiVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar5.v.setVisibility(8);
            kyi kyiVar6 = this.a;
            if (kyiVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar6.e.setVisibility(8);
            kyi kyiVar7 = this.a;
            if (kyiVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar7.f.setVisibility(0);
            kyi kyiVar8 = this.a;
            if (kyiVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar8.b.setVisibility(8);
            kyi kyiVar9 = this.a;
            if (kyiVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar9.w.setVisibility(8);
            kyi kyiVar10 = this.a;
            if (kyiVar10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar10.B.setVisibility(0);
            kyi kyiVar11 = this.a;
            if (kyiVar11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = kyiVar11.e0;
            TournamentConfigVO tournamentConfigVO = this.b;
            r97.a(textView, tournamentConfigVO != null ? tournamentConfigVO.getName() : null, "! ");
            kyi kyiVar12 = this.a;
            if (kyiVar12 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView2 = kyiVar12.Z;
            op5 op5Var = op5.a;
            String string = context.getString(R.string.place_bet_tournament_cms);
            string.getClass();
            op5Var.getClass();
            textView2.setText(op5.b(string, "Place your first bet of", null));
            kyi kyiVar13 = this.a;
            if (kyiVar13 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView3 = kyiVar13.Y;
            TournamentConfigVO tournamentConfigVO2 = this.b;
            String currency = tournamentConfigVO2 != null ? tournamentConfigVO2.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            String strI = op5.i(currency);
            TreeMap treeMap = pw.a;
            TournamentConfigVO tournamentConfigVO3 = this.b;
            hu1.b(strI, " ", pw.c(pw.n((tournamentConfigVO3 == null || (eligibilityCriteria = tournamentConfigVO3.getEligibilityCriteria()) == null || (eligibilityCriteria2 = eligibilityCriteria.get(0)) == null || (minimumStakeCriteria = eligibilityCriteria2.getMinimumStakeCriteria()) == null) ? 1.0d : minimumStakeCriteria.doubleValue())), textView3);
            kyi kyiVar14 = this.a;
            if (kyiVar14 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView4 = kyiVar14.a0;
            String string2 = context.getString(R.string.or_more_cms);
            string2.getClass();
            textView4.setText(op5.b(string2, "or more", null));
            n0("tournament_first_bet_nudge");
        }
    }

    public final void r0(int i, TournamentConfigVO tournamentConfigVO, boolean z) {
        PrizeInfo prizeInfo;
        Double prize;
        List<PrizeInfo> prizeInfo2;
        Object next;
        Resources resources;
        Resources resources2;
        Context context = getContext();
        if (context != null) {
            kyi kyiVar = this.a;
            if (kyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = kyiVar.C.getLayoutParams();
            Context context2 = getContext();
            layoutParams.width = (context2 == null || (resources2 = context2.getResources()) == null) ? 0 : resources2.getDimensionPixelSize(R.dimen._32sdp);
            Context context3 = getContext();
            layoutParams.height = (context3 == null || (resources = context3.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen._30sdp);
            kyi kyiVar2 = this.a;
            if (kyiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar2.C.setLayoutParams(layoutParams);
            kyi kyiVar3 = this.a;
            if (kyiVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar3.d.setVisibility(8);
            kyi kyiVar4 = this.a;
            if (kyiVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar4.i.setVisibility(8);
            kyi kyiVar5 = this.a;
            if (kyiVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar5.v.setVisibility(8);
            kyi kyiVar6 = this.a;
            if (kyiVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar6.e.setVisibility(0);
            kyi kyiVar7 = this.a;
            if (kyiVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar7.f.setVisibility(8);
            kyi kyiVar8 = this.a;
            if (kyiVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar8.w.setVisibility(8);
            kyi kyiVar9 = this.a;
            if (kyiVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar9.b.setVisibility(8);
            kyi kyiVar10 = this.a;
            if (kyiVar10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar10.B.setVisibility(0);
            kyi kyiVar11 = this.a;
            if (kyiVar11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = kyiVar11.R;
            op5 op5Var = op5.a;
            String string = context.getString(R.string.rank_cms);
            string.getClass();
            op5Var.getClass();
            textView.setText(op5.b(string, "Rank", null));
            kyi kyiVar12 = this.a;
            if (kyiVar12 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView2 = kyiVar12.N;
            String string2 = context.getString(R.string.prizes_cms);
            string2.getClass();
            textView2.setText(op5.b(string2, "Prizes", null));
            if (tournamentConfigVO == null || (prizeInfo2 = tournamentConfigVO.getPrizeInfo()) == null) {
                prizeInfo = null;
            } else {
                Iterator<T> it = prizeInfo2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    PrizeInfo prizeInfo3 = (PrizeInfo) next;
                    Integer startRank = prizeInfo3.getStartRank();
                    if (i >= (startRank != null ? startRank.intValue() : 0)) {
                        Integer endRank = prizeInfo3.getEndRank();
                        if (i <= (endRank != null ? endRank.intValue() : 0)) {
                            break;
                        }
                    }
                }
                prizeInfo = (PrizeInfo) next;
            }
            Integer maxParticipants = tournamentConfigVO != null ? tournamentConfigVO.getMaxParticipants() : null;
            kyi kyiVar13 = this.a;
            if (maxParticipants == null) {
                if (kyiVar13 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                kyiVar13.f0.setText("");
            } else {
                if (kyiVar13 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView3 = kyiVar13.f0;
                TreeMap treeMap = pw.a;
                int iIntValue = tournamentConfigVO.getMaxParticipants().intValue();
                textView3.setText("/" + (iIntValue >= 1000 ? m58.a(iIntValue / 1000, "k") : String.valueOf(iIntValue)));
            }
            kyi kyiVar14 = this.a;
            if (kyiVar14 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView4 = kyiVar14.O;
            op5 op5Var2 = op5.a;
            String currency = tournamentConfigVO != null ? tournamentConfigVO.getCurrency() : null;
            String str = currency != null ? currency : "";
            op5Var2.getClass();
            String strI = op5.i(str);
            TreeMap treeMap2 = pw.a;
            hu1.b(strI, " ", pw.c(pw.n((prizeInfo == null || (prize = prizeInfo.getPrize()) == null) ? 0.0d : prize.doubleValue())), textView4);
            kyi kyiVar15 = this.a;
            if (kyiVar15 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar15.Q.setTextColor(context.getColor(R.color.color_FFCF3F));
            kyi kyiVar16 = this.a;
            if (kyiVar16 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar16.O.setTextColor(context.getColor(R.color.color_FFCF3F));
            kyi kyiVar17 = this.a;
            if (kyiVar17 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar17.F.setBackgroundResource(R.drawable.tournament_banner_bg_gold);
            kyi kyiVar18 = this.a;
            if (kyiVar18 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar18.R.setAlpha(1.0f);
            kyi kyiVar19 = this.a;
            if (kyiVar19 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar19.N.setAlpha(1.0f);
            kyi kyiVar20 = this.a;
            if (kyiVar20 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar20.P.setVisibility(8);
            kyi kyiVar21 = this.a;
            if (kyiVar21 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar21.O.setVisibility(0);
            kyi kyiVar22 = this.a;
            if (kyiVar22 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            Integer intOrNull = StringsKt.toIntOrNull(kyiVar22.Q.getValue());
            int iIntValue2 = intOrNull != null ? intOrNull.intValue() : 0;
            if (z) {
                t0(this, iIntValue2, i);
                return;
            }
            kyi kyiVar23 = this.a;
            if (kyiVar23 != null) {
                kyiVar23.Q.setDataNoAnim(i);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    public final void s0(int i, TournamentConfigVO tournamentConfigVO, boolean z) {
        Integer endRank;
        List<PrizeInfo> prizeInfo;
        Resources resources;
        Resources resources2;
        Context context = getContext();
        if (context != null) {
            kyi kyiVar = this.a;
            if (kyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = kyiVar.C.getLayoutParams();
            Context context2 = getContext();
            layoutParams.width = (context2 == null || (resources2 = context2.getResources()) == null) ? 0 : resources2.getDimensionPixelSize(R.dimen._32sdp);
            Context context3 = getContext();
            layoutParams.height = (context3 == null || (resources = context3.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen._30sdp);
            kyi kyiVar2 = this.a;
            if (kyiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar2.C.setLayoutParams(layoutParams);
            kyi kyiVar3 = this.a;
            if (kyiVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar3.d.setVisibility(8);
            kyi kyiVar4 = this.a;
            if (kyiVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar4.i.setVisibility(8);
            kyi kyiVar5 = this.a;
            if (kyiVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar5.v.setVisibility(8);
            kyi kyiVar6 = this.a;
            if (kyiVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar6.e.setVisibility(0);
            kyi kyiVar7 = this.a;
            if (kyiVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar7.f.setVisibility(8);
            kyi kyiVar8 = this.a;
            if (kyiVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar8.w.setVisibility(8);
            kyi kyiVar9 = this.a;
            if (kyiVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar9.b.setVisibility(8);
            kyi kyiVar10 = this.a;
            if (kyiVar10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar10.B.setVisibility(0);
            kyi kyiVar11 = this.a;
            if (kyiVar11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = kyiVar11.R;
            op5 op5Var = op5.a;
            String string = context.getString(R.string.rank_cms);
            string.getClass();
            op5Var.getClass();
            textView.setText(op5.b(string, "Rank", null));
            kyi kyiVar12 = this.a;
            if (kyiVar12 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView2 = kyiVar12.N;
            String string2 = context.getString(R.string.prize_starts_from_cms);
            string2.getClass();
            textView2.setText(op5.b(string2, "Prizes start from", null));
            PrizeInfo prizeInfo2 = (tournamentConfigVO == null || (prizeInfo = tournamentConfigVO.getPrizeInfo()) == null) ? null : (PrizeInfo) CollectionsKt.d0(prizeInfo);
            Integer maxParticipants = tournamentConfigVO != null ? tournamentConfigVO.getMaxParticipants() : null;
            kyi kyiVar13 = this.a;
            if (maxParticipants == null) {
                if (kyiVar13 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                kyiVar13.f0.setText("");
            } else {
                if (kyiVar13 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView3 = kyiVar13.f0;
                TreeMap treeMap = pw.a;
                int iIntValue = tournamentConfigVO.getMaxParticipants().intValue();
                textView3.setText("/" + (iIntValue >= 1000 ? m58.a(iIntValue / 1000, "k") : String.valueOf(iIntValue)));
            }
            kyi kyiVar14 = this.a;
            if (kyiVar14 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView4 = kyiVar14.P;
            CharSequence text = kyiVar14.R.getText();
            textView4.setText(((Object) text) + " " + ((prizeInfo2 == null || (endRank = prizeInfo2.getEndRank()) == null) ? null : String.valueOf(endRank.intValue())));
            kyi kyiVar15 = this.a;
            if (kyiVar15 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar15.Q.setTextColor(context.getColor(R.color.white));
            kyi kyiVar16 = this.a;
            if (kyiVar16 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar16.P.setTextColor(context.getColor(R.color.color_b3b3b3));
            kyi kyiVar17 = this.a;
            if (kyiVar17 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar17.F.setBackgroundResource(R.drawable.tournament_banner_bg);
            kyi kyiVar18 = this.a;
            if (kyiVar18 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar18.R.setAlpha(0.5f);
            kyi kyiVar19 = this.a;
            if (kyiVar19 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar19.N.setAlpha(0.5f);
            kyi kyiVar20 = this.a;
            if (kyiVar20 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar20.P.setVisibility(0);
            kyi kyiVar21 = this.a;
            if (kyiVar21 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar21.O.setVisibility(8);
            kyi kyiVar22 = this.a;
            if (kyiVar22 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            Integer intOrNull = StringsKt.toIntOrNull(kyiVar22.Q.getValue());
            int iIntValue2 = intOrNull != null ? intOrNull.intValue() : 0;
            if (z) {
                t0(this, iIntValue2, i);
                return;
            }
            kyi kyiVar23 = this.a;
            if (kyiVar23 != null) {
                kyiVar23.Q.setDataNoAnim(i);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    public static final class a extends ujc<thk> {
        public a() {
        }

        @Override // defpackage.d5f0
        public final void e(Object obj) {
            thk thkVar = (thk) obj;
            thkVar.b(1);
            kyi kyiVar = h4g0.this.a;
            if (kyiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            kyiVar.D.setImageDrawable(thkVar);
            thkVar.start();
        }

        @Override // defpackage.d5f0
        public final void h(Drawable drawable) {
        }
    }
}
