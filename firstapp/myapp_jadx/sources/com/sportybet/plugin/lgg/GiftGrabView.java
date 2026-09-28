package com.sportybet.plugin.lgg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.common_ui.widgets.GiftGrabPowerBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.data.GiftGrabViewState;
import defpackage.blk;
import defpackage.bmy;
import defpackage.gbn;
import defpackage.h5e;
import defpackage.sn5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/sportybet/plugin/lgg/GiftGrabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "onClickListener", "", "setChatLayoutOnClickListener", "(Landroid/view/View$OnClickListener;)V", "setGrabOnClickListener", "setInfoClickListener", "", "enable", "setChatEnable", "(Z)V", "Lgbn;", "H", "Lgbn;", "getImageService", "()Lgbn;", "setImageService", "(Lgbn;)V", "imageService", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GiftGrabView extends Hilt_GiftGrabView {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public gbn imageService;
    public final blk I;
    public GiftGrabViewState J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGrabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gift_grab_layout, this);
        int i2 = R.id.chat_group;
        Group group = (Group) h5e.a(R.id.chat_group, this);
        if (group != null) {
            i2 = R.id.divider;
            View viewA = h5e.a(R.id.divider, this);
            if (viewA != null) {
                i2 = R.id.gift_grab_right_chat_icon;
                ImageView imageView = (ImageView) h5e.a(R.id.gift_grab_right_chat_icon, this);
                if (imageView != null) {
                    i2 = R.id.gift_grab_title;
                    TextView textView = (TextView) h5e.a(R.id.gift_grab_title, this);
                    if (textView != null) {
                        i2 = R.id.grab_button;
                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.grab_button, this);
                        if (progressButton != null) {
                            i2 = R.id.how_to_play;
                            ImageView imageView2 = (ImageView) h5e.a(R.id.how_to_play, this);
                            if (imageView2 != null) {
                                i2 = R.id.idle_background;
                                ImageView imageView3 = (ImageView) h5e.a(R.id.idle_background, this);
                                if (imageView3 != null) {
                                    i2 = R.id.idle_group;
                                    Group group2 = (Group) h5e.a(R.id.idle_group, this);
                                    if (group2 != null) {
                                        i2 = R.id.idle_how_to_play;
                                        ImageView imageView4 = (ImageView) h5e.a(R.id.idle_how_to_play, this);
                                        if (imageView4 != null) {
                                            i2 = R.id.idle_title;
                                            TextView textView2 = (TextView) h5e.a(R.id.idle_title, this);
                                            if (textView2 != null) {
                                                i2 = R.id.power_bar;
                                                GiftGrabPowerBar giftGrabPowerBar = (GiftGrabPowerBar) h5e.a(R.id.power_bar, this);
                                                if (giftGrabPowerBar != null) {
                                                    i2 = R.id.running_group;
                                                    Group group3 = (Group) h5e.a(R.id.running_group, this);
                                                    if (group3 != null) {
                                                        this.I = new blk(this, group, viewA, imageView, textView, progressButton, imageView2, imageView3, group2, imageView4, textView2, giftGrabPowerBar, group3);
                                                        progressButton.setLoadingText("");
                                                        progressButton.setButtonText(sn5.b(context, R.string.page_gift_grab__grab_now, new Object[0]));
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
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final gbn getImageService() {
        gbn gbnVar = this.imageService;
        if (gbnVar != null) {
            return gbnVar;
        }
        Intrinsics.n("imageService");
        throw null;
    }

    public final void setChatEnable(boolean enable) {
        this.I.b.setVisibility(enable ? 0 : 8);
    }

    public final void setChatLayoutOnClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        this.I.d.setOnClickListener(onClickListener);
    }

    public final void setGrabOnClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        this.I.f.setOnClickListener(onClickListener);
    }

    public final void setImageService(gbn gbnVar) {
        gbnVar.getClass();
        this.imageService = gbnVar;
    }

    public final void setInfoClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        blk blkVar = this.I;
        blkVar.i.setOnClickListener(onClickListener);
        blkVar.y.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftGrabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftGrabView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ GiftGrabView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
