package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CustomProgressButton;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.QuickInputItemListView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zd8 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        re8.a aVar = re8.P;
        view.getClass();
        int i = R.id.amount;
        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, view);
        if (clearEditText != null) {
            i = R.id.amount_container;
            if (((FrameLayout) h5e.a(R.id.amount_container, view)) != null) {
                i = R.id.amount_details;
                TextView textView = (TextView) h5e.a(R.id.amount_details, view);
                if (textView != null) {
                    i = R.id.amount_label;
                    TextView textView2 = (TextView) h5e.a(R.id.amount_label, view);
                    if (textView2 != null) {
                        i = R.id.amount_warning;
                        TextView textView3 = (TextView) h5e.a(R.id.amount_warning, view);
                        if (textView3 != null) {
                            i = R.id.balance;
                            TextView textView4 = (TextView) h5e.a(R.id.balance, view);
                            if (textView4 != null) {
                                i = R.id.balance_label;
                                TextView textView5 = (TextView) h5e.a(R.id.balance_label, view);
                                if (textView5 != null) {
                                    i = R.id.bounty_details_layout;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.bounty_details_layout, view);
                                    if (constraintLayout != null) {
                                        i = R.id.bounty_threshold_description;
                                        TextView textView6 = (TextView) h5e.a(R.id.bounty_threshold_description, view);
                                        if (textView6 != null) {
                                            i = R.id.bounty_title;
                                            TextView textView7 = (TextView) h5e.a(R.id.bounty_title, view);
                                            if (textView7 != null) {
                                                i = R.id.channel;
                                                IconTextSelectorButton iconTextSelectorButton = (IconTextSelectorButton) h5e.a(R.id.channel, view);
                                                if (iconTextSelectorButton != null) {
                                                    i = R.id.charges_amount;
                                                    TextView textView8 = (TextView) h5e.a(R.id.charges_amount, view);
                                                    if (textView8 != null) {
                                                        i = R.id.charges_label;
                                                        TextView textView9 = (TextView) h5e.a(R.id.charges_label, view);
                                                        if (textView9 != null) {
                                                            i = R.id.deposit_amount_quick_adding_buttons;
                                                            AmountQuickAddingButtonGroup amountQuickAddingButtonGroup = (AmountQuickAddingButtonGroup) h5e.a(R.id.deposit_amount_quick_adding_buttons, view);
                                                            if (amountQuickAddingButtonGroup != null) {
                                                                i = R.id.deposit_banner_compose_view;
                                                                ComposeView composeView = (ComposeView) h5e.a(R.id.deposit_banner_compose_view, view);
                                                                if (composeView != null) {
                                                                    i = R.id.deposit_note;
                                                                    if (((TextView) h5e.a(R.id.deposit_note, view)) != null) {
                                                                        i = R.id.description_list_view;
                                                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.description_list_view, view);
                                                                        if (linearLayout != null) {
                                                                            i = R.id.hint_view;
                                                                            TextView textView10 = (TextView) h5e.a(R.id.hint_view, view);
                                                                            if (textView10 != null) {
                                                                                i = R.id.mobile_selector;
                                                                                IconTextSelectorButton iconTextSelectorButton2 = (IconTextSelectorButton) h5e.a(R.id.mobile_selector, view);
                                                                                if (iconTextSelectorButton2 != null) {
                                                                                    i = R.id.next;
                                                                                    CustomProgressButton customProgressButton = (CustomProgressButton) h5e.a(R.id.next, view);
                                                                                    if (customProgressButton != null) {
                                                                                        i = R.id.quick_input_item_list_view;
                                                                                        QuickInputItemListView quickInputItemListView = (QuickInputItemListView) h5e.a(R.id.quick_input_item_list_view, view);
                                                                                        if (quickInputItemListView != null) {
                                                                                            i = R.id.top_container;
                                                                                            LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.top_container, view);
                                                                                            if (linearLayout2 != null) {
                                                                                                i = R.id.total_receive_label;
                                                                                                TextView textView11 = (TextView) h5e.a(R.id.total_receive_label, view);
                                                                                                if (textView11 != null) {
                                                                                                    return new bvi((LinearLayout) view, clearEditText, textView, textView2, textView3, textView4, textView5, constraintLayout, textView6, textView7, iconTextSelectorButton, textView8, textView9, amountQuickAddingButtonGroup, composeView, linearLayout, textView10, iconTextSelectorButton2, customProgressButton, quickInputItemListView, linearLayout2, textView11);
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
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
