package com.sportygames.spinmatch.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spinmatch.components.SMHeaderContainer;
import defpackage.tk30;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010.\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%¨\u0006/"}, d2 = {"Lcom/sportygames/spinmatch/components/SMHeaderContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function0;", "", "backListener", "setBackListener", "(Lkotlin/jvm/functions/Function0;)V", "navigationListener", "setNavigationListener", "", "visibility", "setBackImageVisible", "(I)V", "", "value", "setListener", "(Z)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "textView", "Landroidx/appcompat/widget/AppCompatImageView;", "c", "Landroidx/appcompat/widget/AppCompatImageView;", "getNavigation", "()Landroidx/appcompat/widget/AppCompatImageView;", "setNavigation", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "navigation", "d", "getRedMark", "setRedMark", "redMark", "e", "getChat", "setChat", "chat", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SMHeaderContainer extends LinearLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView textView;
    public final AppCompatImageView b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public AppCompatImageView navigation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public AppCompatImageView redMark;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public AppCompatImageView chat;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMHeaderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.sg_game_header_sm, this);
        View viewFindViewById = findViewById(R.id.main_title);
        viewFindViewById.getClass();
        this.textView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.backicon);
        viewFindViewById2.getClass();
        this.b = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.chat);
        viewFindViewById3.getClass();
        this.chat = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.navigation);
        viewFindViewById4.getClass();
        this.navigation = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.circle);
        viewFindViewById5.getClass();
        this.redMark = (AppCompatImageView) viewFindViewById5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.f);
        typedArrayObtainStyledAttributes.getClass();
        this.textView.setText(typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final AppCompatImageView getChat() {
        return this.chat;
    }

    public final AppCompatImageView getNavigation() {
        return this.navigation;
    }

    public final AppCompatImageView getRedMark() {
        return this.redMark;
    }

    public final TextView getTextView() {
        return this.textView;
    }

    public final void setBackImageVisible(int visibility) {
        if (this.redMark.getVisibility() == 0) {
            this.f = true;
        }
        this.b.setVisibility(visibility);
        AppCompatImageView appCompatImageView = this.navigation;
        if (visibility == 8) {
            appCompatImageView.setVisibility(4);
        } else {
            appCompatImageView.setVisibility(0);
        }
        if (this.f) {
            this.redMark.setVisibility(visibility);
        }
    }

    public final void setBackListener(final Function0<Unit> backListener) {
        backListener.getClass();
        this.b.setOnClickListener(new View.OnClickListener() { // from class: fo60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SMHeaderContainer.i;
                backListener.invoke();
            }
        });
    }

    public final void setChat(AppCompatImageView appCompatImageView) {
        appCompatImageView.getClass();
        this.chat = appCompatImageView;
    }

    public final void setListener(boolean value) {
        this.b.setClickable(value);
        this.navigation.setClickable(value);
        this.chat.setClickable(value);
    }

    public final void setNavigation(AppCompatImageView appCompatImageView) {
        appCompatImageView.getClass();
        this.navigation = appCompatImageView;
    }

    public final void setNavigationListener(final Function0<Unit> navigationListener) {
        navigationListener.getClass();
        this.navigation.setOnClickListener(new View.OnClickListener() { // from class: go60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SMHeaderContainer.i;
                navigationListener.invoke();
            }
        });
    }

    public final void setRedMark(AppCompatImageView appCompatImageView) {
        appCompatImageView.getClass();
        this.redMark = appCompatImageView;
    }

    public final void setTextView(TextView textView) {
        textView.getClass();
        this.textView = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMHeaderContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
