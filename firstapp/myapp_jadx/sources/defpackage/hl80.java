package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.navigation.fragment.NavHostFragment;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import com.sportybet.android.activity.LanguagePreferenceActivity;
import com.sportybet.android.activity.oddsformat.OddsFormatPreferenceActivity;
import com.sportybet.android.auth.AuthActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.settings.popovers.PopoverSettingsActivity;
import com.sportybet.feature.country.ChangeRegionActivity;
import com.sportybet.feature.playtimecontrol.PlayTimeControlActivity;
import com.sportybet.feature.profile.ProfileActivity;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteBaseActivity;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lhl80;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Lk9j;", "Lj9j;", "", "Lfe00;", "<init>", "()V", "", "shouldShowNewLabel", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hl80 extends v2m implements View.OnClickListener, k9j, j9j, kv0, fe00 {
    public static final /* synthetic */ ohp<Object>[] N = {new d630(0, hl80.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentSettingsBinding;")};
    public bnh0 A;
    public azm B;
    public bge C;
    public iym D;
    public yi5 E;
    public ee<Intent> F;
    public ee<Intent> G;
    public ik80 H;
    public String I;
    public Boolean J;
    public final ee<String> K;
    public final d L;
    public ge00 M;
    public final /* synthetic */ gv0 f = new gv0();
    public final i6i0 i = g5e.a(b.a);
    public final q8i0 v;
    public final q8i0 w;
    public uqm y;
    public psm z;

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ThemeConfig.values().length];
            try {
                iArr[ThemeConfig.THEME_CONFIG_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeConfig.THEME_CONFIG_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class b extends saj implements Function1<View, txi> {
        public static final b a = new b(1, txi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentSettingsBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final txi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.account_deactivation;
            TextView textView = (TextView) h5e.a(R.id.account_deactivation, view2);
            if (textView != null) {
                i = R.id.account_insights_compose_view;
                ComposeView composeView = (ComposeView) h5e.a(R.id.account_insights_compose_view, view2);
                if (composeView != null) {
                    i = R.id.add_widgets_compose_view;
                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.add_widgets_compose_view, view2);
                    if (composeView2 != null) {
                        i = R.id.auto_update_switch;
                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.auto_update_switch, view2);
                        if (constraintLayout != null) {
                            i = R.id.back_icon;
                            ImageButton imageButton = (ImageButton) h5e.a(R.id.back_icon, view2);
                            if (imageButton != null) {
                                i = R.id.back_title;
                                if (((TextView) h5e.a(R.id.back_title, view2)) != null) {
                                    i = R.id.betslip_customization;
                                    TextView textView2 = (TextView) h5e.a(R.id.betslip_customization, view2);
                                    if (textView2 != null) {
                                        i = R.id.betslip_customization_divider;
                                        View viewA = h5e.a(R.id.betslip_customization_divider, view2);
                                        if (viewA != null) {
                                            i = R.id.betslip_customization_top_divider;
                                            View viewA2 = h5e.a(R.id.betslip_customization_top_divider, view2);
                                            if (viewA2 != null) {
                                                i = R.id.change_pass_word;
                                                TextView textView3 = (TextView) h5e.a(R.id.change_pass_word, view2);
                                                if (textView3 != null) {
                                                    i = R.id.change_pass_word_divider;
                                                    View viewA3 = h5e.a(R.id.change_pass_word_divider, view2);
                                                    if (viewA3 != null) {
                                                        i = R.id.change_region;
                                                        TextView textView4 = (TextView) h5e.a(R.id.change_region, view2);
                                                        if (textView4 != null) {
                                                            i = R.id.compose_footer;
                                                            ComposeView composeView3 = (ComposeView) h5e.a(R.id.compose_footer, view2);
                                                            if (composeView3 != null) {
                                                                i = R.id.country;
                                                                TextView textView5 = (TextView) h5e.a(R.id.country, view2);
                                                                if (textView5 != null) {
                                                                    i = R.id.dark_mode;
                                                                    if (((TextView) h5e.a(R.id.dark_mode, view2)) != null) {
                                                                        i = R.id.dark_mode_off;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.dark_mode_off, view2);
                                                                        if (textView6 != null) {
                                                                            i = R.id.dark_mode_off_divider;
                                                                            View viewA4 = h5e.a(R.id.dark_mode_off_divider, view2);
                                                                            if (viewA4 != null) {
                                                                                i = R.id.dark_mode_on;
                                                                                TextView textView7 = (TextView) h5e.a(R.id.dark_mode_on, view2);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.dark_mode_on_divider;
                                                                                    View viewA5 = h5e.a(R.id.dark_mode_on_divider, view2);
                                                                                    if (viewA5 != null) {
                                                                                        i = R.id.dark_mode_system;
                                                                                        TextView textView8 = (TextView) h5e.a(R.id.dark_mode_system, view2);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.dark_mode_system_divider;
                                                                                            View viewA6 = h5e.a(R.id.dark_mode_system_divider, view2);
                                                                                            if (viewA6 != null) {
                                                                                                i = R.id.device_management;
                                                                                                TextView textView9 = (TextView) h5e.a(R.id.device_management, view2);
                                                                                                if (textView9 != null) {
                                                                                                    i = R.id.device_management_divider;
                                                                                                    View viewA7 = h5e.a(R.id.device_management_divider, view2);
                                                                                                    if (viewA7 != null) {
                                                                                                        i = R.id.device_management_layout;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.device_management_layout, view2);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i = R.id.home;
                                                                                                            ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, view2);
                                                                                                            if (imageButton2 != null) {
                                                                                                                i = R.id.item_auto_update_switch;
                                                                                                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.item_auto_update_switch, view2);
                                                                                                                if (linearLayout != null) {
                                                                                                                    i = R.id.item_change_region;
                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.item_change_region, view2);
                                                                                                                    if (linearLayout2 != null) {
                                                                                                                        i = R.id.item_footer;
                                                                                                                        if (((LinearLayout) h5e.a(R.id.item_footer, view2)) != null) {
                                                                                                                            i = R.id.language;
                                                                                                                            TextView textView10 = (TextView) h5e.a(R.id.language, view2);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i = R.id.language_preference;
                                                                                                                                TextView textView11 = (TextView) h5e.a(R.id.language_preference, view2);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    i = R.id.language_preference_divider;
                                                                                                                                    View viewA8 = h5e.a(R.id.language_preference_divider, view2);
                                                                                                                                    if (viewA8 != null) {
                                                                                                                                        i = R.id.limits_compose_view;
                                                                                                                                        ComposeView composeView4 = (ComposeView) h5e.a(R.id.limits_compose_view, view2);
                                                                                                                                        if (composeView4 != null) {
                                                                                                                                            i = R.id.live_event_notifications_divider;
                                                                                                                                            View viewA9 = h5e.a(R.id.live_event_notifications_divider, view2);
                                                                                                                                            if (viewA9 != null) {
                                                                                                                                                i = R.id.live_event_notifications_switch;
                                                                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.live_event_notifications_switch, view2);
                                                                                                                                                if (constraintLayout3 != null) {
                                                                                                                                                    i = R.id.live_event_notifications_switch_img;
                                                                                                                                                    ImageView imageView = (ImageView) h5e.a(R.id.live_event_notifications_switch_img, view2);
                                                                                                                                                    if (imageView != null) {
                                                                                                                                                        i = R.id.live_event_notifications_switch_title;
                                                                                                                                                        if (((TextView) h5e.a(R.id.live_event_notifications_switch_title, view2)) != null) {
                                                                                                                                                            i = R.id.multifactor_authentication;
                                                                                                                                                            TextView textView12 = (TextView) h5e.a(R.id.multifactor_authentication, view2);
                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                i = R.id.multifactor_authentication_divider;
                                                                                                                                                                View viewA10 = h5e.a(R.id.multifactor_authentication_divider, view2);
                                                                                                                                                                if (viewA10 != null) {
                                                                                                                                                                    i = R.id.my_favorite_setting;
                                                                                                                                                                    TextView textView13 = (TextView) h5e.a(R.id.my_favorite_setting, view2);
                                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                                        i = R.id.my_favorite_setting_divider;
                                                                                                                                                                        View viewA11 = h5e.a(R.id.my_favorite_setting_divider, view2);
                                                                                                                                                                        if (viewA11 != null) {
                                                                                                                                                                            i = R.id.my_stakes;
                                                                                                                                                                            TextView textView14 = (TextView) h5e.a(R.id.my_stakes, view2);
                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                i = R.id.my_stakes_divider;
                                                                                                                                                                                View viewA12 = h5e.a(R.id.my_stakes_divider, view2);
                                                                                                                                                                                if (viewA12 != null) {
                                                                                                                                                                                    i = R.id.new_icon_device_management;
                                                                                                                                                                                    TextView textView15 = (TextView) h5e.a(R.id.new_icon_device_management, view2);
                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                        i = R.id.new_icon_language;
                                                                                                                                                                                        TextView textView16 = (TextView) h5e.a(R.id.new_icon_language, view2);
                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                            i = R.id.new_icon_multi_factor;
                                                                                                                                                                                            TextView textView17 = (TextView) h5e.a(R.id.new_icon_multi_factor, view2);
                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                i = R.id.new_icon_odds_format;
                                                                                                                                                                                                TextView textView18 = (TextView) h5e.a(R.id.new_icon_odds_format, view2);
                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                    i = R.id.notification_settings_compose_view;
                                                                                                                                                                                                    ComposeView composeView5 = (ComposeView) h5e.a(R.id.notification_settings_compose_view, view2);
                                                                                                                                                                                                    if (composeView5 != null) {
                                                                                                                                                                                                        i = R.id.notification_switch;
                                                                                                                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.notification_switch, view2);
                                                                                                                                                                                                        if (constraintLayout4 != null) {
                                                                                                                                                                                                            i = R.id.notification_switch_img;
                                                                                                                                                                                                            ImageView imageView2 = (ImageView) h5e.a(R.id.notification_switch_img, view2);
                                                                                                                                                                                                            if (imageView2 != null) {
                                                                                                                                                                                                                i = R.id.notification_switch_title;
                                                                                                                                                                                                                if (((TextView) h5e.a(R.id.notification_switch_title, view2)) != null) {
                                                                                                                                                                                                                    i = R.id.notifications;
                                                                                                                                                                                                                    if (((TextView) h5e.a(R.id.notifications, view2)) != null) {
                                                                                                                                                                                                                        i = R.id.odds_format;
                                                                                                                                                                                                                        TextView textView19 = (TextView) h5e.a(R.id.odds_format, view2);
                                                                                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                                                                                            i = R.id.odds_format_divider;
                                                                                                                                                                                                                            View viewA13 = h5e.a(R.id.odds_format_divider, view2);
                                                                                                                                                                                                                            if (viewA13 != null) {
                                                                                                                                                                                                                                i = R.id.odds_format_layout;
                                                                                                                                                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.odds_format_layout, view2);
                                                                                                                                                                                                                                if (constraintLayout5 != null) {
                                                                                                                                                                                                                                    i = R.id.odds_format_preference;
                                                                                                                                                                                                                                    if (((TextView) h5e.a(R.id.odds_format_preference, view2)) != null) {
                                                                                                                                                                                                                                        i = R.id.others;
                                                                                                                                                                                                                                        TextView textView20 = (TextView) h5e.a(R.id.others, view2);
                                                                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                                                                            i = R.id.playtime_control;
                                                                                                                                                                                                                                            TextView textView21 = (TextView) h5e.a(R.id.playtime_control, view2);
                                                                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                                                                i = R.id.playtime_control_divider;
                                                                                                                                                                                                                                                View viewA14 = h5e.a(R.id.playtime_control_divider, view2);
                                                                                                                                                                                                                                                if (viewA14 != null) {
                                                                                                                                                                                                                                                    i = R.id.popovers;
                                                                                                                                                                                                                                                    TextView textView22 = (TextView) h5e.a(R.id.popovers, view2);
                                                                                                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                                                                                                        i = R.id.popovers_divider;
                                                                                                                                                                                                                                                        View viewA15 = h5e.a(R.id.popovers_divider, view2);
                                                                                                                                                                                                                                                        if (viewA15 != null) {
                                                                                                                                                                                                                                                            i = R.id.preference;
                                                                                                                                                                                                                                                            if (((TextView) h5e.a(R.id.preference, view2)) != null) {
                                                                                                                                                                                                                                                                i = R.id.profile;
                                                                                                                                                                                                                                                                TextView textView23 = (TextView) h5e.a(R.id.profile, view2);
                                                                                                                                                                                                                                                                if (textView23 != null) {
                                                                                                                                                                                                                                                                    i = R.id.responsible_gaming;
                                                                                                                                                                                                                                                                    if (((TextView) h5e.a(R.id.responsible_gaming, view2)) != null) {
                                                                                                                                                                                                                                                                        i = R.id.scroll_layout;
                                                                                                                                                                                                                                                                        ScrollView scrollView = (ScrollView) h5e.a(R.id.scroll_layout, view2);
                                                                                                                                                                                                                                                                        if (scrollView != null) {
                                                                                                                                                                                                                                                                            i = R.id.select_language_layout;
                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.select_language_layout, view2);
                                                                                                                                                                                                                                                                            if (constraintLayout6 != null) {
                                                                                                                                                                                                                                                                                i = R.id.settings_dark_mode_container;
                                                                                                                                                                                                                                                                                if (((LinearLayout) h5e.a(R.id.settings_dark_mode_container, view2)) != null) {
                                                                                                                                                                                                                                                                                    i = R.id.time_alert_compose_view;
                                                                                                                                                                                                                                                                                    ComposeView composeView6 = (ComposeView) h5e.a(R.id.time_alert_compose_view, view2);
                                                                                                                                                                                                                                                                                    if (composeView6 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.title_bar;
                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.title_bar, view2);
                                                                                                                                                                                                                                                                                        if (constraintLayout7 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.update_switch_img;
                                                                                                                                                                                                                                                                                            ImageView imageView3 = (ImageView) h5e.a(R.id.update_switch_img, view2);
                                                                                                                                                                                                                                                                                            if (imageView3 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.update_title;
                                                                                                                                                                                                                                                                                                if (((TextView) h5e.a(R.id.update_title, view2)) != null) {
                                                                                                                                                                                                                                                                                                    return new txi((ConstraintLayout) view2, textView, composeView, composeView2, constraintLayout, imageButton, textView2, viewA, viewA2, textView3, viewA3, textView4, composeView3, textView5, textView6, viewA4, textView7, viewA5, textView8, viewA6, textView9, viewA7, constraintLayout2, imageButton2, linearLayout, linearLayout2, textView10, textView11, viewA8, composeView4, viewA9, constraintLayout3, imageView, textView12, viewA10, textView13, viewA11, textView14, viewA12, textView15, textView16, textView17, textView18, composeView5, constraintLayout4, imageView2, textView19, viewA13, constraintLayout5, textView20, textView21, viewA14, textView22, viewA15, textView23, scrollView, constraintLayout6, composeView6, constraintLayout7, imageView3);
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
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.settings.SettingsFragment$onViewCreated$$inlined$collectWithLifecycle$default$1", f = "SettingsFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ hl80 d;

        @c0d(c = "com.sportybet.feature.settings.SettingsFragment$onViewCreated$$inlined$collectWithLifecycle$default$1$1", f = "SettingsFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ hl80 d;

            /* JADX INFO: renamed from: hl80$c$a$a, reason: collision with other inner class name */
            public static final class C0645a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ hl80 b;

                public C0645a(v5b v5bVar, hl80 hl80Var) {
                    this.b = hl80Var;
                    this.a = v5bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    bm80 bm80Var = (bm80) t;
                    ohp<Object>[] ohpVarArr = hl80.N;
                    hl80 hl80Var = this.b;
                    hl80Var.m0().L.setVisibility(bm80Var.a ? 0 : 8);
                    hl80Var.m0().K.setVisibility(bm80Var.a ? 0 : 8);
                    if (bm80Var.b) {
                        ibs viewLifecycleOwner = hl80Var.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new ql80(null, hl80Var), 3);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, hl80 hl80Var) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = hl80Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0645a c0645a = new C0645a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0645a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ibs ibsVar, lyh lyhVar, v1b v1bVar, hl80 hl80Var) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = lyhVar;
            this.d = hl80Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new c(this.b, this.c, v1bVar, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends ee<String> {
        public d() {
        }

        @Override // defpackage.ee
        public final vd<String, ?> a() {
            return hl80.this.K.a();
        }

        @Override // defpackage.ee
        public final void b(Object obj) {
            String str = (String) obj;
            str.getClass();
            hl80 hl80Var = hl80.this;
            hl80Var.I = str;
            if (str.equals("android.permission.POST_NOTIFICATIONS") && Build.VERSION.SDK_INT >= 33) {
                hl80Var.J = Boolean.valueOf(o0b.a(hl80Var.requireContext(), str) == 0);
            }
            hl80Var.K.b(str);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class e implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public e(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? hl80.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class g extends qlr implements Function0<Fragment> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return hl80.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class h extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.a = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class i extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class j extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class k extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? hl80.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class l extends qlr implements Function0<Fragment> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return hl80.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class m extends qlr implements Function0<w8i0> {
        public final /* synthetic */ l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.a = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class n extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class o extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public hl80() {
        g gVar = new g();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new h(gVar));
        this.v = new q8i0(jq40.a(nm80.class), new i(ttrVarA), new k(ttrVarA), new j(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new m(new l()));
        this.w = new q8i0(jq40.a(cky.class), new n(ttrVarA2), new f(ttrVarA2), new o(ttrVarA2));
        ee<String> eeVarRegisterForActivityResult = registerForActivityResult(new be(), new ud() { // from class: dl80
            @Override // defpackage.ud
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                ohp<Object>[] ohpVarArr = hl80.N;
                bool.getClass();
                hl80 hl80Var = this.a;
                if (Intrinsics.g(hl80Var.I, "android.permission.POST_NOTIFICATIONS")) {
                    Boolean bool2 = hl80Var.J;
                    if (bool2 == null || !bool2.equals(bool)) {
                        boolean zBooleanValue = bool.booleanValue();
                        iym iymVar = hl80Var.D;
                        if (zBooleanValue) {
                            if (iymVar == null) {
                                Intrinsics.n("openTelemetryLogger");
                                throw null;
                            }
                            gym.a(iymVar, l0y.a);
                        } else {
                            if (iymVar == null) {
                                Intrinsics.n("openTelemetryLogger");
                                throw null;
                            }
                            gym.a(iymVar, k0y.a);
                        }
                    }
                    hl80Var.J = null;
                }
                ge00 ge00Var = hl80Var.M;
                if (ge00Var != null) {
                    ge00Var.a(bool.booleanValue());
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.K = eeVarRegisterForActivityResult;
        this.L = new d();
    }

    @Override // defpackage.fe00
    public final ee<String> B0() {
        return this.L;
    }

    @Override // defpackage.kv0
    public final void E(Context context, ThemeConfig themeConfig) {
        context.getClass();
        themeConfig.getClass();
        this.f.E(context, themeConfig);
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.y;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        return hl80.class.getSimpleName();
    }

    @Override // defpackage.fe00
    public final void l0(ge00 ge00Var) {
        this.M = ge00Var;
    }

    public final txi m0() {
        return (txi) this.i.a(this, N[0]);
    }

    public final psm n0() {
        psm psmVar = this.z;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final String o0() {
        String phone;
        if (getAccountHelper().getAccount() == null) {
            return "";
        }
        if (n0().r()) {
            phone = getAccountHelper().getAccountInfo().getPhone();
        } else {
            phone = getAccountHelper().getAccount().name;
            phone.getClass();
        }
        return (!TextUtils.isDigitsOnly(phone) || phone.length() <= 5) ? phone : fu5.a("(?<=\\d{2})\\d(?=\\d)", phone, "*");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yfx yfxVarA;
        yfx yfxVarA2 = null;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.back_icon) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.change_region) {
            yrh0.s(requireContext(), ChangeRegionActivity.z1(requireContext()), true);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.auto_update_switch) {
            nm80 nm80VarP0 = p0();
            ej5.c(o8i0.d(nm80VarP0), null, null, new jm80(nm80VarP0, null), 3);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.notification_switch) {
            ej5.c(ebs.a(getLifecycle()), null, null, new tl80(null, this), 3);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.live_event_notifications_switch) {
            nm80 nm80VarP1 = p0();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            kks kksVar = kks.b;
            kksVar.getClass();
            boolean zB = true ^ vn20.b(contextRequireContext, "live_event", kksVar.b("liveEventNotificationEnabled"), true);
            jvd0 jvd0Var = nm80VarP1.w;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            nm80VarP1.w = ej5.c(o8i0.d(nm80VarP1), null, null, new gm80(nm80VarP1, contextRequireContext, zB, null), 3);
            nm80VarP1.y.j(Boolean.TRUE);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.profile) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                getAccountHelper().demandAccount(activity2, new tit() { // from class: sk80
                    @Override // defpackage.tit
                    public final void w(Account account, boolean z) {
                        ohp<Object>[] ohpVarArr = hl80.N;
                        if (account != null) {
                            this.a.q0(true);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.popovers) {
            startActivity(new Intent(requireContext(), (Class<?>) PopoverSettingsActivity.class));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.my_stakes) {
            final androidx.fragment.app.e activity3 = getActivity();
            if (activity3 != null) {
                getAccountHelper().demandAccount(activity3, new tit() { // from class: jk80
                    @Override // defpackage.tit
                    public final void w(Account account, boolean z) {
                        ohp<Object>[] ohpVarArr = hl80.N;
                        if (account != null) {
                            MyFavoriteBaseActivity.z1(activity3, MyFavoriteTypeEnum.DEFAULT_STAKE);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.my_favorite_setting) {
            final androidx.fragment.app.e activity4 = getActivity();
            if (activity4 != null) {
                getAccountHelper().demandAccount(activity4, new tit() { // from class: zk80
                    @Override // defpackage.tit
                    public final void w(Account account, boolean z) {
                        ohp<Object>[] ohpVarArr = hl80.N;
                        if (account != null) {
                            if (izw.a()) {
                                izw.c(null);
                            } else {
                                hl80 hl80Var = this.a;
                                hl80Var.getAccountHelper().refreshMyFavoriteSelectedSports(new ml80(hl80Var, activity4));
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.language_preference) {
            vn20.f(requireContext(), "Settings", getAccountHelper().getUserId(), true, false);
            ee<Intent> eeVar = this.F;
            if (eeVar != null) {
                eeVar.b(new Intent(requireContext(), (Class<?>) LanguagePreferenceActivity.class));
                return;
            } else {
                Intrinsics.n("languagePreferenceLauncher");
                throw null;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.odds_format_layout) {
            vn20.f(requireContext(), "Settings", yk10.a(getAccountHelper().getUserId(), "odds_setting"), true, false);
            ee<Intent> eeVar2 = this.G;
            if (eeVar2 != null) {
                eeVar2.b(new Intent(requireContext(), (Class<?>) OddsFormatPreferenceActivity.class));
                return;
            } else {
                Intrinsics.n("oddsFormatPreferenceLauncher");
                throw null;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.playtime_control) {
            if (n0().W()) {
                yrh0.t(requireContext(), PlayTimeControlActivity.class, true);
                return;
            } else {
                sh8.c().e(o7d.a(wae.SELF_EXECLUSION));
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.change_pass_word) {
            startActivity(new Intent(requireContext(), (Class<?>) AuthActivity.class).putExtra(AuthActivity.KEY_IS_CHANGE_PASSWORD, true));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.multifactor_authentication) {
            nm80 nm80VarP2 = p0();
            ej5.c(o8i0.d(nm80VarP2), null, null, new lm80(nm80VarP2, null), 3);
            try {
                if (isAdded()) {
                    yfxVarA2 = NavHostFragment.a.a(this);
                }
            } catch (IllegalStateException e2) {
                itf0.a.f(e2, "Failed to find NavController", new Object[0]);
            }
            if (yfxVarA2 != null) {
                yfx.i(yfxVarA2, "multi_factor_auth_route", bjx.a(new r8a(1, new kkx())), 4);
            }
            p0().x1(new tmw(0), k00.d);
            p0().x1(jzf.a, k00.c);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.device_management) {
            nm80 nm80VarP3 = p0();
            ej5.c(o8i0.d(nm80VarP3), null, null, new km80(nm80VarP3, null), 3);
            nm80 nm80VarP4 = p0();
            ej5.c(o8i0.d(nm80VarP4), null, null, new hm80(nm80VarP4, null), 3);
            p0().x1(ka.a, k00.d);
            try {
                yfxVarA = isAdded() ? NavHostFragment.a.a(this) : null;
            } catch (IllegalStateException e3) {
                itf0.a.f(e3, "Failed to find NavController", new Object[0]);
            }
            if (yfxVarA != null) {
                bge bgeVar = this.C;
                if (bgeVar != null) {
                    bgeVar.b(yfxVarA);
                    return;
                } else {
                    Intrinsics.n("deviceManagementNavigator");
                    throw null;
                }
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.account_deactivation) {
            sh8.c().e(o7d.a(wae.ACCOUNT_DEACTIVATE));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.betslip_customization) {
            p0().x1(gx3.a, k00.d);
            try {
                if (isAdded()) {
                    yfxVarA2 = NavHostFragment.a.a(this);
                }
            } catch (IllegalStateException e4) {
                itf0.a.f(e4, "Failed to find NavController", new Object[0]);
            }
            if (yfxVarA2 != null) {
                yfx.i(yfxVarA2, siPCzPFw.lcZkvZpthVpx, bjx.a(new r8a(1, new kkx())), 4);
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.dark_mode_on) {
            p0().y1(ThemeConfig.THEME_CONFIG_DARK);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.dark_mode_off) {
            p0().y1(ThemeConfig.THEME_CONFIG_LIGHT);
        } else if (numValueOf != null && numValueOf.intValue() == R.id.dark_mode_system) {
            p0().y1(ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Bundle extras;
        super.onCreate(bundle);
        nm80 nm80VarP0 = p0();
        androidx.fragment.app.e activity = getActivity();
        nm80VarP0.I = (activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null) ? false : extras.getBoolean("show_two_fa_hint");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ik80 ik80Var = this.H;
        if (ik80Var != null) {
            m0().s0.getViewTreeObserver().removeOnScrollChangedListener(ik80Var);
            this.H = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ej5.c(ebs.a(getLifecycle()), null, null, new ul80(null, this), 3);
        t0();
        try {
            zi50.a aVar = zi50.b;
            getAccountHelper().loadAccountInfo(new w8() { // from class: al80
                @Override // defpackage.w8
                public final void a(AccountInfo accountInfo, String str, String str2) {
                    e activity;
                    ohp<Object>[] ohpVarArr = hl80.N;
                    if (accountInfo != null || (activity = this.a.getActivity()) == null) {
                        return;
                    }
                    activity.finish();
                }
            });
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [ik80] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strD;
        view.getClass();
        super.onViewCreated(view, bundle);
        final ComposeView composeView = m0().d;
        u6i0.c cVar = u6i0.c.a;
        composeView.setViewCompositionStrategy(cVar);
        composeView.setContent(new op8(1605899757, new Function2() { // from class: qk80
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = hl80.N;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1016025014, new l0r(composeView), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.i(m0().g0, new op8(12037958, new Function2() { // from class: nk80
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = hl80.N;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final hl80 hl80Var = this.a;
                    or0.a(null, false, false, null, pp8.b(-1617310513, new Function2() { // from class: rk80
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ohp<Object>[] ohpVarArr2 = hl80.N;
                            int i2 = 1;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                hl80 hl80Var2 = hl80Var;
                                ytw ytwVarB = n95.b(hl80Var2.p0().J, aVar2);
                                boolean zA = aVar2.A(hl80Var2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new mc00(hl80Var2, i2);
                                    aVar2.r(objY);
                                }
                                ck80.e(null, (Function0) objY, ((Boolean) ytwVarB.getValue()).booleanValue(), aVar2, 0, 1);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        boolean localVisibleRect = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        m0().S.setVisibility(n0().W() ? 0 : 8);
        if (n0().W()) {
            ComposeView composeView2 = m0().S;
            composeView2.setViewCompositionStrategy(cVar);
            composeView2.setContent(new op8(-2120316246, new lk80(composeView2, objArr2 == true ? 1 : 0), true));
        }
        boolean zW = n0().W();
        m0().u0.setVisibility(zW ? 0 : 8);
        if (zW) {
            final ComposeView composeView3 = m0().u0;
            composeView3.setViewCompositionStrategy(cVar);
            composeView3.setContent(new op8(-1533696735, new Function2() { // from class: mk80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ohp<Object>[] ohpVarArr = hl80.N;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final ComposeView composeView4 = composeView3;
                        or0.a(null, false, false, null, pp8.b(1815663210, new Function2() { // from class: uk80
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ohp<Object>[] ohpVarArr2 = hl80.N;
                                int i2 = 2;
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ComposeView composeView5 = composeView4;
                                    boolean zA = aVar2.A(composeView5);
                                    Object objY = aVar2.y();
                                    if (zA || objY == a.C0041a.a) {
                                        objY = new pl3(composeView5, i2);
                                        aVar2.r(objY);
                                    }
                                    ck80.c((Function0) objY, aVar2, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, aVar), aVar, 24576);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        if (n0().W()) {
            Bundle bundleA = x6.a("data_enable_default_action_bar", false);
            bnh0 bnh0Var = this.A;
            if (bnh0Var == null) {
                Intrinsics.n("urlCreator");
                throw null;
            }
            Uri uri = Uri.parse(bnh0Var.h("wv/account-insights"));
            m0().c.setVisibility(0);
            mla.i(m0().c, new op8(-1386519265, new a0r(this, uri, bundleA), true));
        }
        ypi.a(m0().B, new Function0() { // from class: pk80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ohp<Object>[] ohpVarArr = hl80.N;
                this.a.m0().s0.scrollTo(0, 0);
                return Unit.a;
            }
        });
        if ((n0().S() || n0().o()) && !n0().F()) {
            m0().Q.setOnClickListener(this);
            m0().P.setText(getAccountHelper().getLanguageName());
            s0();
        } else {
            m0().t0.setVisibility(8);
        }
        u0();
        m0().l0.setOnClickListener(this);
        m0().f.setOnClickListener(this);
        m0().r0.setOnClickListener(this);
        m0().F.setOnClickListener(this);
        m0().D.setOnClickListener(this);
        m0().H.setOnClickListener(this);
        m0().p0.setOnClickListener(this);
        m0().a0.setOnClickListener(this);
        m0().Y.setOnClickListener(this);
        m0().i.setOnClickListener(this);
        m0().y.setOnClickListener(this);
        m0().W.setOnClickListener(this);
        m0().J.setOnClickListener(this);
        TextView textView = m0().n0;
        if (n0().O()) {
            strD = sn5.d(this, R.string.wap_setting__self_exclusion__ZA, new Object[0]);
        } else {
            strD = n0().W() ? sn5.d(this, R.string.playtime_control__title, new Object[0]) : sn5.d(this, R.string.wap_setting__self_exclusion, new Object[0]);
        }
        textView.setText(strD);
        m0().n0.setOnClickListener(this);
        if (y7.b) {
            m0().b.setVisibility(0);
            m0().b.setOnClickListener(this);
        } else {
            m0().b.setVisibility(8);
        }
        m0().A.setOnClickListener(this);
        m0().C.setText(getString(n0().Z()));
        boolean zI = n0().i(requireContext());
        LinearLayout linearLayout = m0().O;
        yi5 yi5Var = this.E;
        if (yi5Var == null) {
            Intrinsics.n("buildConfiguration");
            throw null;
        }
        linearLayout.setVisibility((yi5Var.b().f() || !zI) ? 8 : 0);
        LinearLayout linearLayout2 = m0().N;
        yi5 yi5Var2 = this.E;
        if (yi5Var2 == null) {
            Intrinsics.n("buildConfiguration");
            throw null;
        }
        linearLayout2.setVisibility(yi5Var2.b().f() ? 8 : 0);
        m0().m0.setVisibility((m0().O.getVisibility() == 0 || m0().N.getVisibility() == 0) ? 0 : 8);
        m0().e.setOnClickListener(this);
        m0().h0.setOnClickListener(this);
        kks kksVar = kks.b;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (kksVar.a(contextRequireContext)) {
            m0().U.setOnClickListener(this);
        } else {
            m0().U.setVisibility(8);
        }
        m0().M.setOnClickListener(new el80());
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: fl80
            @Override // defpackage.ud
            public final void a(Object obj) {
                ohp<Object>[] ohpVarArr = hl80.N;
                ((ActivityResult) obj).getClass();
                this.a.s0();
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.F = eeVarRegisterForActivityResult;
        ee<Intent> eeVarRegisterForActivityResult2 = registerForActivityResult(new ce(), new ud() { // from class: gl80
            @Override // defpackage.ud
            public final void a(Object obj) {
                ohp<Object>[] ohpVarArr = hl80.N;
                ((ActivityResult) obj).getClass();
                this.a.u0();
            }
        });
        eeVarRegisterForActivityResult2.getClass();
        this.G = eeVarRegisterForActivityResult2;
        q8i0 q8i0Var = this.w;
        ((cky) q8i0Var.getValue()).f.f(getViewLifecycleOwner(), new e(new bl80(this, objArr == true ? 1 : 0)));
        ((cky) q8i0Var.getValue()).x1();
        p0().y.f(getViewLifecycleOwner(), new e(new Function1() { // from class: cl80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ohp<Object>[] ohpVarArr = hl80.N;
                this.a.t0();
                return Unit.a;
            }
        }));
        s9s.b bVar = s9s.b.a;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new nl80(this, null, this), 3);
        final TextView textView2 = m0().W;
        if (p0().I) {
            if (textView2.isShown()) {
                Rect rect = new Rect();
                m0().s0.getHitRect(rect);
                localVisibleRect = textView2.getLocalVisibleRect(rect);
            }
            if (localVisibleRect) {
                ibs viewLifecycleOwner2 = getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new sl80(this, textView2, null), 3);
            } else {
                this.H = new ViewTreeObserver.OnScrollChangedListener() { // from class: ik80
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        boolean localVisibleRect2;
                        ohp<Object>[] ohpVarArr = hl80.N;
                        TextView textView3 = textView2;
                        boolean zIsShown = textView3.isShown();
                        hl80 hl80Var = this.a;
                        if (zIsShown) {
                            Rect rect2 = new Rect();
                            hl80Var.m0().s0.getHitRect(rect2);
                            localVisibleRect2 = textView3.getLocalVisibleRect(rect2);
                        } else {
                            localVisibleRect2 = false;
                        }
                        if (localVisibleRect2) {
                            ibs viewLifecycleOwner3 = hl80Var.getViewLifecycleOwner();
                            viewLifecycleOwner3.getClass();
                            ej5.c(ebs.a(viewLifecycleOwner3.getLifecycle()), null, null, new sl80(hl80Var, textView3, null), 3);
                            hl80Var.m0().s0.getViewTreeObserver().removeOnScrollChangedListener(hl80Var.H);
                            hl80Var.H = null;
                        }
                    }
                };
                m0().s0.getViewTreeObserver().addOnScrollChangedListener(this.H);
            }
        }
        p0().x1(hx3.a, k00.d);
        v340 v340Var = p0().E;
        ibs viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        ej5.c(ebs.a(viewLifecycleOwner3.getLifecycle()), null, null, new c(viewLifecycleOwner3, v340Var, null, this), 3);
    }

    public final nm80 p0() {
        return (nm80) this.v.getValue();
    }

    public final void q0(boolean z) {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        try {
            zi50.a aVar = zi50.b;
            AccountInfo accountInfo = getAccountHelper().getAccountInfo();
            if (accountInfo != null) {
                Intent intent = new Intent(activity, (Class<?>) ProfileActivity.class);
                intent.putExtra("first_name", accountInfo.getFirstName());
                intent.putExtra("last_name", accountInfo.getLastName());
                intent.putExtra("account_number", o0());
                intent.putExtra("email", accountInfo.getEmail());
                intent.putExtra("date_of_birth", accountInfo.getBirthday());
                intent.putExtra("user_name", accountInfo.getNickname());
                intent.putExtra("avatar", accountInfo.getAvatar());
                intent.putExtra("state", accountInfo.getState());
                intent.putExtra("area", accountInfo.getArea());
                intent.putExtra("editableLastName", accountInfo.getEditableBirthday());
                intent.putExtra("editableFirstName", accountInfo.getEditableFirstName());
                intent.putExtra("editableFirstName", accountInfo.getEditableLastName());
                activity.startActivity(intent);
            } else if (z) {
                getAccountHelper().loadAccountInfo(new w8() { // from class: ok80
                    @Override // defpackage.w8
                    public final void a(AccountInfo accountInfo2, String str, String str2) {
                        ohp<Object>[] ohpVarArr = hl80.N;
                        this.a.q0(false);
                    }
                });
            } else {
                zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again);
            }
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    public final void r0(View view, int i2, Function0<Unit> function0) {
        View view2 = getView();
        if (!(view2 instanceof ViewGroup)) {
            view2 = null;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        if (viewGroup != null) {
            v9m.a(viewGroup, view, m0().v0, sn5.d(this, i2, new Object[0]), 251, 16, b120.c, 24, new kk80(0, function0));
        }
    }

    public final void s0() {
        m0().d0.setVisibility(vn20.b(requireContext(), "Settings", getAccountHelper().getUserId(), false) ? 8 : 0);
        m0().P.setText(getAccountHelper().getLanguageName());
    }

    public final void t0() {
        ImageView imageView = m0().V;
        Context contextRequireContext = requireContext();
        p0();
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        kks kksVar = kks.b;
        kksVar.getClass();
        imageView.setImageDrawable(gr0.a(contextRequireContext, vn20.b(contextRequireContext2, "live_event", kksVar.b("liveEventNotificationEnabled"), true) ? R.drawable.banker_switch_on : R.drawable.banker_switch_off));
    }

    public final void u0() {
        Context contextRequireContext = requireContext();
        String userId = getAccountHelper().getUserId();
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append("odds_setting");
        m0().f0.setVisibility(vn20.b(contextRequireContext, "Settings", sb.toString(), false) ? 8 : 0);
        TextView textView = m0().j0;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        textView.setText(sn5.d(this, gky.b(contextRequireContext2).a, new Object[0]));
    }
}
