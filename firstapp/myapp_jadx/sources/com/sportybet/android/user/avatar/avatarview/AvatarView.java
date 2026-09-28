package com.sportybet.android.user.avatar.avatarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.user.avatar.avatarview.AvatarView;
import com.sportybet.android.user.avatar.avatarview.AvatarView.a;
import defpackage.hwr;
import defpackage.mpe0;
import defpackage.oo1;
import defpackage.op8;
import defpackage.po1;
import defpackage.rk30;
import defpackage.so1;
import defpackage.to1;
import defpackage.tse;
import defpackage.u6i0;
import defpackage.wyh;
import defpackage.xvf;
import defpackage.yo1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/android/user/avatar/avatarview/AvatarView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpo1;", "c", "Lttr;", "getAvatarViewModel", "()Lpo1;", "avatarViewModel", "Lso1;", "uiState", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AvatarView extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final to1 a;
    public final boolean b;
    public final mpe0 c;
    public ComposeView d;

    public static final class a implements tse {
        public final /* synthetic */ ComposeView b;

        public a(ComposeView composeView) {
            this.b = composeView;
        }

        @Override // defpackage.tse
        public final void dispose() {
            ComposeView composeView = this.b;
            AvatarView avatarView = AvatarView.this;
            avatarView.removeView(composeView);
            avatarView.d = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.b, i, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.a = typedArrayObtainStyledAttributes.getBoolean(0, true) ? to1.a : to1.b;
        this.b = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        this.c = hwr.b(new yo1(context, 0));
        this.d = a();
    }

    public static final Unit b(final AvatarView avatarView, final ComposeView composeView, androidx.compose.runtime.a aVar, int i) {
        if (aVar.q(i & 1, (i & 3) != 2)) {
            po1 avatarViewModel = avatarView.getAvatarViewModel();
            to1 to1Var = avatarView.a;
            avatarViewModel.getClass();
            to1Var.getClass();
            oo1.a((so1) wyh.c(avatarView.getAvatarViewModel().a, aVar, 0, 7).getValue(), avatarView.b, null, aVar, 0, 4);
            Unit unit = Unit.a;
            boolean zA = aVar.A(avatarView) | aVar.A(composeView);
            Object objY = aVar.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: ap1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i2 = AvatarView.e;
                        ((use) obj).getClass();
                        return this.a.new a(composeView);
                    }
                };
                aVar.r(objY);
            }
            xvf.c(unit, (Function1) objY, aVar);
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    private final po1 getAvatarViewModel() {
        return (po1) this.c.getValue();
    }

    public final ComposeView a() {
        Context context = getContext();
        context.getClass();
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setViewCompositionStrategy(u6i0.c.a);
        addView(composeView, -1, -1);
        composeView.setContent(new op8(1446173766, new Function2() { // from class: zo1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return AvatarView.b(this.a, composeView, (androidx.compose.runtime.a) obj, iIntValue);
            }
        }, true));
        return composeView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            this.d = a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ AvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
