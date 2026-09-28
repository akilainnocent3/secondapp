package com.sportybet.android.bookingcode.presentation.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.widget.ClearEditText;
import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.b9i0;
import defpackage.bmy;
import defpackage.c05;
import defpackage.c45;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.fjd;
import defpackage.fz4;
import defpackage.g05;
import defpackage.g08;
import defpackage.gz4;
import defpackage.h05;
import defpackage.h5e;
import defpackage.hb5;
import defpackage.hj40;
import defpackage.hle0;
import defpackage.i2i;
import defpackage.ibs;
import defpackage.iel;
import defpackage.ij40;
import defpackage.inl;
import defpackage.iu2;
import defpackage.iym;
import defpackage.jj40;
import defpackage.jq40;
import defpackage.kzh;
import defpackage.l15;
import defpackage.lk50;
import defpackage.lop;
import defpackage.lq1;
import defpackage.m05;
import defpackage.mz7;
import defpackage.n05;
import defpackage.o7d;
import defpackage.p05;
import defpackage.pu0;
import defpackage.q05;
import defpackage.qgd0;
import defpackage.qq1;
import defpackage.qzm;
import defpackage.r8i0;
import defpackage.rzm;
import defpackage.s8i0;
import defpackage.sn5;
import defpackage.uqm;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.wae;
import defpackage.wsm;
import defpackage.yy4;
import defpackage.zu7;
import defpackage.zyf0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BookingCodePanel extends inl implements View.OnClickListener, TextWatcher, TextView.OnEditorActionListener {
    public static final /* synthetic */ int e0 = 0;
    public wsm H;
    public uqm I;
    public lq1 J;
    public hle0 K;
    public iym L;
    public qgd0 M;
    public rzm N;
    public qzm O;
    public q05 P;
    public ij40 Q;
    public BetslipActivity R;
    public boolean S;
    public Long T;
    public mz7 U;
    public yy4 V;
    public final int W;
    public final int a0;
    public final int b0;
    public l15 c0;
    public final a d0;

    /* JADX INFO: loaded from: classes7.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Rect rect = new Rect();
            BookingCodePanel bookingCodePanel = BookingCodePanel.this;
            bookingCodePanel.M.a.getWindowVisibleDisplayFrame(rect);
            int height = bookingCodePanel.M.a.getRootView().getHeight();
            double d = height - rect.bottom;
            double d2 = ((double) height) * 0.15d;
            qgd0 qgd0Var = bookingCodePanel.M;
            if (d <= d2) {
                qgd0Var.M.setVisibility(8);
            } else {
                qgd0Var.b.setVisibility(0);
                bookingCodePanel.M.M.setVisibility(0);
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public class b extends ViewPager2.g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void b(float f, int i, int i2) {
            if (i2 != 0) {
                return;
            }
            BookingCodePanel bookingCodePanel = BookingCodePanel.this;
            if (bookingCodePanel.V.getItemCount() <= 1) {
                return;
            }
            if (i == 0) {
                bookingCodePanel.M.V.setCurrentItem(bookingCodePanel.V.getItemCount() - 2, false);
            } else if (i == bookingCodePanel.V.getItemCount() - 1) {
                bookingCodePanel.M.V.setCurrentItem(1, false);
            }
        }
    }

    public BookingCodePanel(Context context) {
        super(context);
        if (!isInEditMode()) {
            E();
        }
        this.S = false;
        this.T = 0L;
        this.W = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start);
        this.a0 = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start_small);
        this.b0 = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_end);
        this.d0 = new a();
        G(context);
    }

    public final void F() {
        this.M.Z.setVisibility(8);
        this.M.A.setVisibility(8);
        this.M.T.setVisibility(8);
        this.M.P.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Context context) {
        int i = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_booking_code_pannel, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.book_bottom;
        RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.book_bottom, viewInflate);
        if (relativeLayout != null) {
            i2 = R.id.book_panel_loading_view;
            LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.book_panel_loading_view, viewInflate);
            if (loadingViewNew != null) {
                i2 = R.id.booking_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.booking_container, viewInflate);
                if (constraintLayout != null) {
                    i2 = R.id.booking_edit_text;
                    ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.booking_edit_text, viewInflate);
                    if (clearEditText != null) {
                        i2 = R.id.booking_error_text;
                        if (((TextView) h5e.a(R.id.booking_error_text, viewInflate)) != null) {
                            i2 = R.id.booking_loading_btn;
                            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.booking_loading_btn, viewInflate);
                            if (progressButton != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                i2 = R.id.booking_title;
                                TextView textView = (TextView) h5e.a(R.id.booking_title, viewInflate);
                                if (textView != null) {
                                    i2 = R.id.booking_title_info;
                                    ImageView imageView = (ImageView) h5e.a(R.id.booking_title_info, viewInflate);
                                    if (imageView != null) {
                                        i2 = R.id.btn_swipe_bet;
                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.btn_swipe_bet, viewInflate);
                                        if (linearLayout != null) {
                                            i2 = R.id.code_hub_btn;
                                            View viewA = h5e.a(R.id.code_hub_btn, viewInflate);
                                            if (viewA != null) {
                                                i2 = R.id.code_hub_container;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.code_hub_container, viewInflate);
                                                if (constraintLayout3 != null) {
                                                    i2 = R.id.code_hub_divider;
                                                    View viewA2 = h5e.a(R.id.code_hub_divider, viewInflate);
                                                    if (viewA2 != null) {
                                                        i2 = R.id.divider_recommended_header;
                                                        View viewA3 = h5e.a(R.id.divider_recommended_header, viewInflate);
                                                        if (viewA3 != null) {
                                                            i2 = R.id.entry_container;
                                                            LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.entry_container, viewInflate);
                                                            if (linearLayout2 != null) {
                                                                i2 = R.id.group_code_hub;
                                                                Group group = (Group) h5e.a(R.id.group_code_hub, viewInflate);
                                                                if (group != null) {
                                                                    i2 = R.id.group_multi_maker;
                                                                    Group group2 = (Group) h5e.a(R.id.group_multi_maker, viewInflate);
                                                                    if (group2 != null) {
                                                                        i2 = R.id.group_recent_code;
                                                                        Group group3 = (Group) h5e.a(R.id.group_recent_code, viewInflate);
                                                                        if (group3 != null) {
                                                                            i2 = R.id.group_swipe_bet;
                                                                            Group group4 = (Group) h5e.a(R.id.group_swipe_bet, viewInflate);
                                                                            if (group4 != null) {
                                                                                i2 = R.id.guideline_left;
                                                                                if (((Guideline) h5e.a(R.id.guideline_left, viewInflate)) != null) {
                                                                                    i2 = R.id.ic_code_hub;
                                                                                    ImageView imageView2 = (ImageView) h5e.a(R.id.ic_code_hub, viewInflate);
                                                                                    if (imageView2 != null) {
                                                                                        i2 = R.id.ic_code_hub_button;
                                                                                        if (((ImageView) h5e.a(R.id.ic_code_hub_button, viewInflate)) != null) {
                                                                                            i2 = R.id.ic_mm;
                                                                                            if (((ImageView) h5e.a(R.id.ic_mm, viewInflate)) != null) {
                                                                                                i2 = R.id.ic_multi_maker;
                                                                                                ImageView imageView3 = (ImageView) h5e.a(R.id.ic_multi_maker, viewInflate);
                                                                                                if (imageView3 != null) {
                                                                                                    i2 = R.id.ic_recent_button;
                                                                                                    if (((ImageView) h5e.a(R.id.ic_recent_button, viewInflate)) != null) {
                                                                                                        i2 = R.id.ic_recent_code;
                                                                                                        ImageView imageView4 = (ImageView) h5e.a(R.id.ic_recent_code, viewInflate);
                                                                                                        if (imageView4 != null) {
                                                                                                            i2 = R.id.ic_swipe_bet;
                                                                                                            ImageView imageView5 = (ImageView) h5e.a(R.id.ic_swipe_bet, viewInflate);
                                                                                                            if (imageView5 != null) {
                                                                                                                i2 = R.id.keyboard_spacer;
                                                                                                                View viewA4 = h5e.a(R.id.keyboard_spacer, viewInflate);
                                                                                                                if (viewA4 != null) {
                                                                                                                    i2 = R.id.load_tip_text;
                                                                                                                    TextView textView2 = (TextView) h5e.a(R.id.load_tip_text, viewInflate);
                                                                                                                    if (textView2 != null) {
                                                                                                                        i2 = R.id.multi_maker_btn;
                                                                                                                        View viewA5 = h5e.a(R.id.multi_maker_btn, viewInflate);
                                                                                                                        if (viewA5 != null) {
                                                                                                                            i2 = R.id.multi_maker_container;
                                                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.multi_maker_container, viewInflate);
                                                                                                                            if (constraintLayout4 != null) {
                                                                                                                                i2 = R.id.multi_maker_divider;
                                                                                                                                View viewA6 = h5e.a(R.id.multi_maker_divider, viewInflate);
                                                                                                                                if (viewA6 != null) {
                                                                                                                                    i2 = R.id.recent_btn;
                                                                                                                                    View viewA7 = h5e.a(R.id.recent_btn, viewInflate);
                                                                                                                                    if (viewA7 != null) {
                                                                                                                                        i2 = R.id.recent_code_divider;
                                                                                                                                        View viewA8 = h5e.a(R.id.recent_code_divider, viewInflate);
                                                                                                                                        if (viewA8 != null) {
                                                                                                                                            i2 = R.id.recent_container;
                                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.recent_container, viewInflate);
                                                                                                                                            if (constraintLayout5 != null) {
                                                                                                                                                i2 = R.id.recommended_code_header_compose_view;
                                                                                                                                                ComposeView composeView = (ComposeView) h5e.a(R.id.recommended_code_header_compose_view, viewInflate);
                                                                                                                                                if (composeView != null) {
                                                                                                                                                    i2 = R.id.recommended_code_view_pager;
                                                                                                                                                    ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.recommended_code_view_pager, viewInflate);
                                                                                                                                                    if (viewPager2 != null) {
                                                                                                                                                        i2 = R.id.recommended_code_view_pager_bottom_merging;
                                                                                                                                                        View viewA9 = h5e.a(R.id.recommended_code_view_pager_bottom_merging, viewInflate);
                                                                                                                                                        if (viewA9 != null) {
                                                                                                                                                            i2 = R.id.recommended_code_view_pager_group;
                                                                                                                                                            Group group5 = (Group) h5e.a(R.id.recommended_code_view_pager_group, viewInflate);
                                                                                                                                                            if (group5 != null) {
                                                                                                                                                                i2 = R.id.router_container;
                                                                                                                                                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) h5e.a(R.id.router_container, viewInflate);
                                                                                                                                                                if (horizontalScrollView != null) {
                                                                                                                                                                    i2 = R.id.swipe_bet_container;
                                                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.swipe_bet_container, viewInflate);
                                                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                                                        i2 = R.id.text_or;
                                                                                                                                                                        if (((TextView) h5e.a(R.id.text_or, viewInflate)) != null) {
                                                                                                                                                                            i2 = R.id.text_or_code_hub;
                                                                                                                                                                            if (((TextView) h5e.a(R.id.text_or_code_hub, viewInflate)) != null) {
                                                                                                                                                                                i2 = R.id.text_or_recent;
                                                                                                                                                                                if (((TextView) h5e.a(R.id.text_or_recent, viewInflate)) != null) {
                                                                                                                                                                                    i2 = R.id.tv_code_hub;
                                                                                                                                                                                    TextView textView3 = (TextView) h5e.a(R.id.tv_code_hub, viewInflate);
                                                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                                                        i2 = R.id.tv_code_hub_button;
                                                                                                                                                                                        if (((TextView) h5e.a(R.id.tv_code_hub_button, viewInflate)) != null) {
                                                                                                                                                                                            i2 = R.id.tv_mm;
                                                                                                                                                                                            if (((TextView) h5e.a(R.id.tv_mm, viewInflate)) != null) {
                                                                                                                                                                                                i2 = R.id.tv_multi_maker;
                                                                                                                                                                                                TextView textView4 = (TextView) h5e.a(R.id.tv_multi_maker, viewInflate);
                                                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                                                    i2 = R.id.tv_recent;
                                                                                                                                                                                                    if (((TextView) h5e.a(R.id.tv_recent, viewInflate)) != null) {
                                                                                                                                                                                                        i2 = R.id.tv_recent_code;
                                                                                                                                                                                                        TextView textView5 = (TextView) h5e.a(R.id.tv_recent_code, viewInflate);
                                                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                                                            i2 = R.id.tv_swipe_bet;
                                                                                                                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.tv_swipe_bet, viewInflate);
                                                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                                                this.M = new qgd0(constraintLayout2, relativeLayout, loadingViewNew, constraintLayout, clearEditText, progressButton, constraintLayout2, textView, imageView, linearLayout, viewA, constraintLayout3, viewA2, viewA3, linearLayout2, group, group2, group3, group4, imageView2, imageView3, imageView4, imageView5, viewA4, textView2, viewA5, constraintLayout4, viewA6, viewA7, viewA8, constraintLayout5, composeView, viewPager2, viewA9, group5, horizontalScrollView, linearLayout3, textView3, textView4, textView5, textView6);
                                                                                                                                                                                                                BetslipActivity betslipActivity = (BetslipActivity) context;
                                                                                                                                                                                                                this.R = betslipActivity;
                                                                                                                                                                                                                betslipActivity.getWindow().setSoftInputMode(18);
                                                                                                                                                                                                                w8i0 w8i0Var = (w8i0) context;
                                                                                                                                                                                                                w8i0Var.getClass();
                                                                                                                                                                                                                v8i0 viewModelStore = w8i0Var.getViewModelStore();
                                                                                                                                                                                                                boolean z = w8i0Var instanceof iel;
                                                                                                                                                                                                                r8i0.c defaultViewModelProviderFactory = z ? ((iel) w8i0Var).getDefaultViewModelProviderFactory() : fjd.a;
                                                                                                                                                                                                                cyb defaultViewModelCreationExtras = z ? ((iel) w8i0Var).getDefaultViewModelCreationExtras() : cyb.a.b;
                                                                                                                                                                                                                viewModelStore.getClass();
                                                                                                                                                                                                                defaultViewModelProviderFactory.getClass();
                                                                                                                                                                                                                defaultViewModelCreationExtras.getClass();
                                                                                                                                                                                                                s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                                                                                                                                                                                                                dq7 dq7VarA = jq40.a(mz7.class);
                                                                                                                                                                                                                String strI = dq7VarA.i();
                                                                                                                                                                                                                if (strI == null) {
                                                                                                                                                                                                                    hb5.a("Local and anonymous classes can not be ViewModels");
                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                mz7 mz7Var = (mz7) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                                                                                                                                                                                                                this.U = mz7Var;
                                                                                                                                                                                                                i2i.b(mz7Var.R).f((ibs) context, new g05(this, i));
                                                                                                                                                                                                                return;
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x0201  */
    /* JADX WARN: Code duplicated, block: B:84:0x0207  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public final void H(Boolean bool) {
        l15 l15Var;
        l15 l15Var2;
        c45 c45Var;
        c45 c45Var2;
        c45 c45Var3;
        qgd0 qgd0Var;
        boolean z;
        qgd0 qgd0Var2;
        boolean z2;
        qgd0 qgd0Var3;
        boolean z3;
        qgd0 qgd0Var4;
        l15 l15Var3;
        boolean z4;
        qgd0 qgd0Var5;
        boolean z5;
        qgd0 qgd0Var6;
        int i = 0;
        boolean zA = qq1.a(this.J, BOConfigParam.MultiMakerToggle, false);
        boolean zA2 = qq1.a(this.J, BOConfigParam.CodehubFilterToggle, false);
        hle0 hle0Var = this.K;
        boolean z6 = hle0Var.a.a("1") && hle0Var.b.h(false, Uri.parse(o7d.a(wae.SWIPE_BET)));
        int i2 = zA2 ? (zA ? 1 : 0) + 1 : zA ? 1 : 0;
        if (bool.booleanValue()) {
            i2++;
        }
        if (z6) {
            i2++;
        }
        int i3 = i2;
        if (i3 != 0) {
            if (i3 != 1) {
                l15Var2 = new l15(zA2, bool.booleanValue(), zA, z6, c45.e, i3 == true ? 1 : 0);
            } else if (zA) {
                l15Var = new l15(false, false, true, false, c45.d, i3 == true ? 1 : 0);
            } else if (zA2) {
                l15Var = new l15(true, false, false, false, c45.c, i3 == true ? 1 : 0);
            } else {
                l15Var = bool.booleanValue() ? new l15(false, true, false, false, c45.b, i3 == true ? 1 : 0) : new l15(false, false, false, true, c45.a, i3 == true ? 1 : 0);
            }
            this.c0 = l15Var2;
            if (l15Var2.f == 0) {
                this.M.Y.setVisibility(8);
                F();
                return;
            }
            c45Var = c45.c;
            c45Var2 = l15Var2.e;
            if (c45Var2 == c45Var) {
                this.M.Y.setVisibility(8);
                if (getContext() instanceof BetslipActivity) {
                    this.M.A.setVisibility(0);
                    this.M.z.setOnClickListener(new View.OnClickListener() { // from class: f05
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = BookingCodePanel.e0;
                            sh8.c().e(o7d.a(wae.CODE_HUB));
                            this.a.R.finish();
                        }
                    });
                    return;
                }
                return;
            }
            if (c45Var2 == c45.d) {
                this.M.Y.setVisibility(8);
                if (getContext() instanceof BetslipActivity) {
                    this.M.P.setVisibility(0);
                    this.M.O.setOnClickListener(new c05(this, i));
                    return;
                }
                return;
            }
            if (c45Var2 == c45.b) {
                this.M.Y.setVisibility(8);
                if (getContext() instanceof BetslipActivity) {
                    this.M.T.setVisibility(0);
                    this.M.R.setOnClickListener(new View.OnClickListener() { // from class: d05
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = BookingCodePanel.e0;
                            BookingCodePanel bookingCodePanel = this.a;
                            if (!bookingCodePanel.I.isLogin()) {
                                bookingCodePanel.N.a();
                                return;
                            }
                            mg40 mg40Var = new mg40();
                            BetslipActivity betslipActivity = bookingCodePanel.R;
                            if (betslipActivity != null) {
                                mg40Var.show(betslipActivity.getSupportFragmentManager(), "recentCode");
                            }
                        }
                    });
                    return;
                }
                return;
            }
            c45Var3 = c45.a;
            qgd0Var = this.M;
            if (c45Var2 == c45Var3) {
                qgd0Var.Y.setVisibility(8);
                if (getContext() instanceof BetslipActivity) {
                    this.M.Z.setVisibility(0);
                    this.M.y.setOnClickListener(new View.OnClickListener() { // from class: e05
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = BookingCodePanel.e0;
                            qzm qzmVar = this.a.O;
                            if (qzmVar != null) {
                                qzmVar.a();
                            }
                        }
                    });
                    return;
                }
                return;
            }
            qgd0Var.Y.setVisibility(0);
            F();
            z = this.c0.a;
            qgd0Var2 = this.M;
            if (z) {
                qgd0Var2.E.setVisibility(0);
                m05 m05Var = new m05(this, i);
                this.M.a0.setOnClickListener(m05Var);
                this.M.I.setOnClickListener(m05Var);
            } else {
                qgd0Var2.E.setVisibility(8);
            }
            z2 = this.c0.b;
            qgd0Var3 = this.M;
            if (z2) {
                qgd0Var3.G.setVisibility(0);
                n05 n05Var = new n05(this, i);
                this.M.K.setOnClickListener(n05Var);
                this.M.c0.setOnClickListener(n05Var);
            } else {
                qgd0Var3.G.setVisibility(8);
            }
            z3 = this.c0.c;
            qgd0Var4 = this.M;
            if (z3) {
                qgd0Var4.F.setVisibility(0);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o05
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = BookingCodePanel.e0;
                        BookingCodePanel bookingCodePanel = this.a;
                        yrh0.s(bookingCodePanel.getContext(), new Intent(bookingCodePanel.getContext(), (Class<?>) MultiMakerActivity.class), true);
                        bookingCodePanel.R.finish();
                    }
                };
                this.M.J.setOnClickListener(onClickListener);
                this.M.b0.setOnClickListener(onClickListener);
            } else {
                qgd0Var4.F.setVisibility(8);
            }
            l15Var3 = this.c0;
            if (!l15Var3.c && l15Var3.a && l15Var3.b) {
                this.M.H.setVisibility(8);
                this.M.Q.setVisibility(8);
                return;
            }
            z4 = l15Var3.d;
            qgd0Var5 = this.M;
            if (z4) {
                qgd0Var5.H.setVisibility(8);
                this.M.Q.setVisibility(8);
                return;
            }
            qgd0Var5.H.setVisibility(0);
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: b05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = BookingCodePanel.e0;
                    qzm qzmVar = this.a.O;
                    if (qzmVar != null) {
                        qzmVar.a();
                    }
                }
            };
            z5 = this.c0.c;
            qgd0Var6 = this.M;
            if (z5) {
                qgd0Var6.Q.setVisibility(0);
            } else {
                qgd0Var6.Q.setVisibility(8);
            }
            this.M.L.setOnClickListener(onClickListener2);
            this.M.d0.setOnClickListener(onClickListener2);
        }
        l15Var = new l15(false, false, false, false, c45.e, i3 == true ? 1 : 0);
        l15Var2 = l15Var;
        this.c0 = l15Var2;
        if (l15Var2.f == 0) {
            this.M.Y.setVisibility(8);
            F();
            return;
        }
        c45Var = c45.c;
        c45Var2 = l15Var2.e;
        if (c45Var2 == c45Var) {
            this.M.Y.setVisibility(8);
            if (getContext() instanceof BetslipActivity) {
                this.M.A.setVisibility(0);
                this.M.z.setOnClickListener(new View.OnClickListener() { // from class: f05
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = BookingCodePanel.e0;
                        sh8.c().e(o7d.a(wae.CODE_HUB));
                        this.a.R.finish();
                    }
                });
                return;
            }
            return;
        }
        if (c45Var2 == c45.d) {
            this.M.Y.setVisibility(8);
            if (getContext() instanceof BetslipActivity) {
                return;
            }
            this.M.P.setVisibility(0);
            this.M.O.setOnClickListener(new c05(this, i));
            return;
        }
        if (c45Var2 == c45.b) {
            this.M.Y.setVisibility(8);
            if (getContext() instanceof BetslipActivity) {
                this.M.T.setVisibility(0);
                this.M.R.setOnClickListener(new View.OnClickListener() { // from class: d05
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = BookingCodePanel.e0;
                        BookingCodePanel bookingCodePanel = this.a;
                        if (!bookingCodePanel.I.isLogin()) {
                            bookingCodePanel.N.a();
                            return;
                        }
                        mg40 mg40Var = new mg40();
                        BetslipActivity betslipActivity = bookingCodePanel.R;
                        if (betslipActivity != null) {
                            mg40Var.show(betslipActivity.getSupportFragmentManager(), "recentCode");
                        }
                    }
                });
                return;
            }
            return;
        }
        c45Var3 = c45.a;
        qgd0Var = this.M;
        if (c45Var2 == c45Var3) {
            qgd0Var.Y.setVisibility(8);
            if (getContext() instanceof BetslipActivity) {
                this.M.Z.setVisibility(0);
                this.M.y.setOnClickListener(new View.OnClickListener() { // from class: e05
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = BookingCodePanel.e0;
                        qzm qzmVar = this.a.O;
                        if (qzmVar != null) {
                            qzmVar.a();
                        }
                    }
                });
                return;
            }
            return;
        }
        qgd0Var.Y.setVisibility(0);
        F();
        z = this.c0.a;
        qgd0Var2 = this.M;
        if (z) {
            qgd0Var2.E.setVisibility(0);
            m05 m05Var2 = new m05(this, i);
            this.M.a0.setOnClickListener(m05Var2);
            this.M.I.setOnClickListener(m05Var2);
        } else {
            qgd0Var2.E.setVisibility(8);
        }
        z2 = this.c0.b;
        qgd0Var3 = this.M;
        if (z2) {
            qgd0Var3.G.setVisibility(0);
            n05 n05Var2 = new n05(this, i);
            this.M.K.setOnClickListener(n05Var2);
            this.M.c0.setOnClickListener(n05Var2);
        } else {
            qgd0Var3.G.setVisibility(8);
        }
        z3 = this.c0.c;
        qgd0Var4 = this.M;
        if (z3) {
            qgd0Var4.F.setVisibility(0);
            View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: o05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = BookingCodePanel.e0;
                    BookingCodePanel bookingCodePanel = this.a;
                    yrh0.s(bookingCodePanel.getContext(), new Intent(bookingCodePanel.getContext(), (Class<?>) MultiMakerActivity.class), true);
                    bookingCodePanel.R.finish();
                }
            };
            this.M.J.setOnClickListener(onClickListener3);
            this.M.b0.setOnClickListener(onClickListener3);
        } else {
            qgd0Var4.F.setVisibility(8);
        }
        l15Var3 = this.c0;
        if (!l15Var3.c) {
        }
        z4 = l15Var3.d;
        qgd0Var5 = this.M;
        if (z4) {
            qgd0Var5.H.setVisibility(8);
            this.M.Q.setVisibility(8);
            return;
        }
        qgd0Var5.H.setVisibility(0);
        View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: b05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = BookingCodePanel.e0;
                qzm qzmVar = this.a.O;
                if (qzmVar != null) {
                    qzmVar.a();
                }
            }
        };
        z5 = this.c0.c;
        qgd0Var6 = this.M;
        if (z5) {
            qgd0Var6.Q.setVisibility(0);
        } else {
            qgd0Var6.Q.setVisibility(8);
        }
        this.M.L.setOnClickListener(onClickListener4);
        this.M.d0.setOnClickListener(onClickListener4);
    }

    public final void I() {
        lop.b(this.M.e, Boolean.FALSE);
        String string = this.M.e.getText().toString();
        if (TextUtils.isEmpty(string)) {
            zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again, 0);
            this.H.g("share code incorrect", "Booking Code Panel", new Exception("share code empty "), null);
            return;
        }
        K(null);
        q05 q05Var = this.P;
        if (q05Var != null) {
            g08 g08Var = g08.UNKNOWN;
            q05Var.a(new p05(string));
        }
    }

    public final void J() {
        b9i0.a(this.M.V, true, this.W, this.a0, this.b0);
        if (getResources().getConfiguration().screenWidthDp >= 600) {
            this.M.V.post(new Runnable() { // from class: i05
                @Override // java.lang.Runnable
                public final void run() {
                    int i = BookingCodePanel.e0;
                    BookingCodePanel bookingCodePanel = this.a;
                    View childAt = bookingCodePanel.M.V.getChildAt(0);
                    if (childAt instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) childAt;
                        int width = bookingCodePanel.M.V.getWidth();
                        if (width <= 0) {
                            return;
                        }
                        int i2 = bookingCodePanel.W;
                        int i3 = width - i2;
                        recyclerView.setPadding(i2, 0, i3 - ((i3 - bookingCodePanel.b0) / 2), 0);
                    }
                }
            });
        }
    }

    public final void K(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        qgd0 qgd0Var = this.M;
        if (zIsEmpty) {
            qgd0Var.e.setError((String) null);
            this.M.d.setActivated(false);
        } else {
            qgd0Var.e.setError(str);
            this.M.d.setActivated(true);
        }
    }

    public final void L() {
        if (!this.S || this.R == null) {
            return;
        }
        getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.d0);
        this.S = false;
        this.M.e.setOnTouchCallBack(null);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.booking_loading_btn) {
            I();
            return;
        }
        if (id != R.id.booking_title && id != R.id.booking_title_info) {
            lop.b(this.M.e, Boolean.FALSE);
            return;
        }
        androidx.appcompat.app.b.a title = new androidx.appcompat.app.b.a(getContext()).setTitle(sn5.c(this, R.string.component_betslip__what_is_booking_code, new Object[0]));
        String strC = sn5.c(this, R.string.component_betslip__a_booking_code_enable_you_to_book_tip, new Object[0]);
        AlertController.b bVar = title.a;
        bVar.f = strC;
        bVar.k = true;
        title.c(sn5.c(this, R.string.common_functions__ok, new Object[0]), null);
        title.f();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        I();
        lop.b(this.M.e, Boolean.FALSE);
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.M.f.setEnabled(!TextUtils.isEmpty(charSequence));
        K(null);
    }

    public void setBookingCodeTextFieldWarningUiText(UiText uiText) {
        K(uiText != null ? uiText.g(getContext()) : null);
    }

    public void setFeaturedCodesUiState(lk50<List<gz4>> lk50Var) {
        if (lk50Var instanceof lk50.c) {
            J();
            this.V.j((List) ((lk50.c) lk50Var).a, new Runnable() { // from class: j05
                @Override // java.lang.Runnable
                public final void run() {
                    int i = BookingCodePanel.e0;
                    BookingCodePanel bookingCodePanel = this.a;
                    if (bookingCodePanel.V.getItemCount() <= 1 || bookingCodePanel.M.V.getCurrentItem() != 0) {
                        return;
                    }
                    bookingCodePanel.M.V.setCurrentItem(1, false);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public void setHideRouterContainer() {
        int i;
        if (this.c0 == null) {
            return;
        }
        HorizontalScrollView horizontalScrollView = this.M.Y;
        if (iu2.m()) {
            l15 l15Var = this.c0;
            if (l15Var.f == 0 || l15Var.e != c45.e) {
                i = 8;
            } else {
                i = 0;
            }
        } else {
            i = 8;
        }
        horizontalScrollView.setVisibility(i);
    }

    public void setIsLoadButtonLoading(boolean z) {
        this.M.f.setLoading(z);
    }

    public void setOnTabClickListener(rzm rzmVar) {
        this.N = rzmVar;
    }

    public void setRecommendedCodeHeaderToggleListener(ij40 ij40Var) {
        this.Q = ij40Var;
    }

    public void setRecommendedCodeHeaderUiState(jj40 jj40Var) {
        hj40.c(this.M.U, jj40Var, new h05(this, 0));
        this.M.X.setVisibility(jj40Var instanceof jj40.b ? 0 : 8);
    }

    public void setRecommendedCodeUiActionListener(fz4 fz4Var) {
        this.V.b = fz4Var;
    }

    public void setSwipeBetClickListener(qzm qzmVar) {
        this.O = qzmVar;
    }

    public void setUiActionListener(q05 q05Var) {
        this.P = q05Var;
    }

    public void setupCodeInputFilter() {
        final String strI = qq1.i(this.J, BOConfigParam.CodeHubCustomCodeSeparator, "_");
        this.M.e.setFilters(new InputFilter[]{new InputFilter() { // from class: l05
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                int i5 = BookingCodePanel.e0;
                while (i < i2) {
                    char cCharAt = charSequence.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != strI.charAt(0)) {
                        return "";
                    }
                    i++;
                }
                return null;
            }
        }});
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.M.v.setOnClickListener(this);
        this.M.w.setOnClickListener(this);
        this.M.i.setOnClickListener(this);
        ClearEditText clearEditText = this.M.e;
        String str = OdQr.nPJKzcRBhntbgO;
        clearEditText.setText(str);
        this.M.e.addTextChangedListener(this);
        this.M.e.setOnEditorActionListener(this);
        this.M.e.setErrorView((TextView) findViewById(R.id.booking_error_text));
        this.M.f.setOnClickListener(this);
        this.M.f.setEnabled(false);
        this.M.f.setButtonText(R.string.common_functions__load);
        this.M.f.setLoadingText(str);
        this.M.f.setTextSize(12.0f);
        setupCodeInputFilter();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: a05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = BookingCodePanel.e0;
                BetslipActivity betslipActivity = this.a.R;
                if (betslipActivity != null) {
                    betslipActivity.finish();
                }
                sh8.c().e((String) view.getTag());
            }
        };
        int i = 1;
        for (int childCount = this.M.D.getChildCount() - 1; childCount >= 0; childCount--) {
            this.M.D.getChildAt(childCount).setOnClickListener(onClickListener);
        }
        if (getContext() instanceof BetslipActivity) {
            lop.b(this.M.e, Boolean.FALSE);
        }
        kzh.d(this.U.i.d(pu0.c.a), zu7.a());
        this.V = new yy4(null);
        ViewPager2 viewPager2 = this.M.V;
        if (getResources().getConfiguration().screenWidthDp >= 600) {
            i = 2;
        }
        viewPager2.setOffscreenPageLimit(i);
        this.M.V.setAdapter(this.V);
        this.M.V.c(new b());
    }

    public BookingCodePanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            E();
        }
        this.S = false;
        this.T = 0L;
        this.W = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start);
        this.a0 = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start_small);
        this.b0 = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_end);
        this.d0 = new a();
        G(context);
    }

    public BookingCodePanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = false;
        this.T = 0L;
        this.W = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start);
        this.a0 = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start_small);
        this.b0 = getContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_end);
        this.d0 = new a();
        G(context);
    }
}
