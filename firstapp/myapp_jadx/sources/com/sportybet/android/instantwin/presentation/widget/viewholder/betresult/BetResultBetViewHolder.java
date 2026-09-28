package com.sportybet.android.instantwin.presentation.widget.viewholder.betresult;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import defpackage.ge3;
import defpackage.gky;
import defpackage.jrn;
import defpackage.kx2;
import defpackage.oxc;
import defpackage.sn5;
import defpackage.sw2;
import defpackage.z4p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/widget/viewholder/betresult/BetResultBetViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lz4p;", "binding", "", "isBNG", "<init>", "(Lz4p;Z)V", "", "tooltipText", "Landroid/widget/PopupWindow;", "createOrGetStatusPopupWindow", "(Ljava/lang/String;)Landroid/widget/PopupWindow;", "Lge3;", "item", "", "setData", "(Lge3;)V", "Lz4p;", "Z", "statusPopupWindow", "Landroid/widget/PopupWindow;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetResultBetViewHolder extends BaseViewHolder {
    public static final int $stable = 8;
    private final z4p binding;
    private final boolean isBNG;
    private PopupWindow statusPopupWindow;

    /* JADX WARN: Illegal instructions before constructor call */
    public BetResultBetViewHolder(z4p z4pVar, boolean z) {
        z4pVar.getClass();
        RelativeLayout relativeLayout = z4pVar.a;
        relativeLayout.getClass();
        super(relativeLayout);
        this.binding = z4pVar;
        this.isBNG = z;
    }

    private final PopupWindow createOrGetStatusPopupWindow(String tooltipText) {
        View contentView;
        PopupWindow popupWindow = this.statusPopupWindow;
        if (popupWindow != null && (contentView = popupWindow.getContentView()) != null) {
            View viewFindViewById = contentView.findViewById(R.id.status_text);
            viewFindViewById.getClass();
            ((TextView) viewFindViewById).setText(tooltipText);
            return this.statusPopupWindow;
        }
        View viewInflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.layout_selection_status_popup, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.status_text)).setText(tooltipText);
        PopupWindow popupWindow2 = new PopupWindow(viewInflate, -2, -2);
        this.statusPopupWindow = popupWindow2;
        popupWindow2.setOutsideTouchable(true);
        return this.statusPopupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$0$0(BetResultBetViewHolder betResultBetViewHolder, View view) {
        view.getClass();
        if (view.getTag() instanceof String) {
            Object tag = view.getTag();
            tag.getClass();
            PopupWindow popupWindowCreateOrGetStatusPopupWindow = betResultBetViewHolder.createOrGetStatusPopupWindow((String) tag);
            if (popupWindowCreateOrGetStatusPopupWindow != null) {
                popupWindowCreateOrGetStatusPopupWindow.showAsDropDown(view);
            }
        }
    }

    public final void setData(ge3 item) {
        int i;
        int i2;
        String strA;
        item.getClass();
        z4p z4pVar = this.binding;
        sw2 sw2Var = item.E;
        boolean zIsEmpty = TextUtils.isEmpty(sw2Var.a);
        TextView textView = z4pVar.c;
        View view = z4pVar.e;
        View view2 = z4pVar.b;
        TextView textView2 = z4pVar.v;
        TextView textView3 = z4pVar.d;
        ImageView imageView = z4pVar.i;
        textView.setText(sw2Var.a);
        String strA2 = sw2Var.b;
        String str = sw2Var.c;
        int i3 = 0;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            strA2 = oxc.a(strA2, " @", gky.a.a(str, false));
        }
        textView3.setText(strA2);
        boolean z = sw2Var.g;
        int i4 = R.color.transparent;
        if (z) {
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            textView3.setBackgroundColor(this.itemView.getResources().getColor(R.color.transparent));
            textView2.setText("");
        } else {
            imageView.setVisibility(0);
            jrn jrnVar = sw2Var.h;
            if (jrnVar == jrn.ONE_X_TWO_ONE_UP) {
                i = R.drawable.ic__feature__match_status_1up;
                i2 = R.string.bet_history__1up_early_payout;
            } else if (jrnVar == jrn.ONE_X_TWO_TWO_UP) {
                i = R.drawable.ic__feature__match_status_2up;
                i2 = R.string.bet_history__2up_early_payout;
            } else if (sw2Var.e) {
                i = this.isBNG ? R.drawable.ic_bng_selection_status_win : R.drawable.ic_selection_status_win;
                i2 = R.string.bet_history__won;
            } else {
                i = R.drawable.ic_selection_status_lost;
                i2 = R.string.bet_history__lost;
            }
            imageView.setImageResource(i);
            View view3 = this.itemView;
            view3.getClass();
            imageView.setTag(sn5.c(view3, i2, new Object[0]));
            imageView.setOnClickListener(new kx2(this, i3));
            Resources resources = this.itemView.getResources();
            if (zIsEmpty) {
                i4 = R.color.bg_surface_secondary;
            }
            textView3.setBackgroundColor(resources.getColor(i4));
            if (this.isBNG) {
                Context context = this.itemView.getContext();
                context.getClass();
                strA = sn5.b(context, R.string.component_betslip__single, new Object[0]);
            } else {
                strA = sw2Var.d.a(textView2.getContext());
            }
            textView2.setText(strA);
        }
        if (sw2Var.f) {
            view2.setVisibility(8);
            view.setVisibility(8);
        } else {
            boolean z2 = item.a == 3;
            view2.setVisibility(!z2 ? 0 : 8);
            view.setVisibility((!z2 || this.isBNG) ? 8 : 0);
        }
    }

    public /* synthetic */ BetResultBetViewHolder(z4p z4pVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4pVar, (i & 2) != 0 ? false : z);
    }
}
