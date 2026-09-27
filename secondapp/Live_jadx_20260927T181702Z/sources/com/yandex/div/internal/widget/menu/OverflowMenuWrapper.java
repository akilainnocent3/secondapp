package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.w1;
import com.yandex.div.R;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.Views;
import f0.e3;
import k.e0;
import k.k;
import k.p;
import k.u;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class OverflowMenuWrapper {

    @u
    private int mButtonResourceId;

    @NonNull
    private final Context mContext;

    @Nullable
    private View[] mHorizontallyCompetingViews;

    @Nullable
    private Listener mListener;
    private int mMenuGravity;

    @p
    private final int mMenuHorizontalMargin;

    @p
    private final int mMenuVerticalMargin;

    @e0(from = 0, to = e3.f81880d)
    private int mOverflowAlpha;

    @k
    private int mOverflowColor;
    private int mOverflowGravity;

    @Nullable
    private ImageView mOverflowMenuImageView;

    @Nullable
    private final ViewGroup mParentView;

    @Nullable
    private w1 mPopupMenu;

    @Nullable
    private View mResultView;
    private boolean mValid;

    @Nullable
    private View[] mVerticallyCompetingViews;

    @NonNull
    private final View mWrappedView;

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup) {
        this(context, view, viewGroup, R.dimen.overflow_menu_margin_horizontal, R.dimen.overflow_menu_margin_vertical);
    }

    public static /* synthetic */ void a(OverflowMenuWrapper overflowMenuWrapper, View view) {
        overflowMenuWrapper.getClass();
        w1 w1Var = new w1(view.getContext(), view, overflowMenuWrapper.mMenuGravity);
        Listener listener = overflowMenuWrapper.mListener;
        if (listener != null) {
            listener.onMenuCreated(w1Var);
        }
        w1Var.l();
        Listener listener2 = overflowMenuWrapper.mListener;
        if (listener2 != null) {
            listener2.onPopupShown();
        }
        overflowMenuWrapper.mPopupMenu = w1Var;
    }

    @NonNull
    private Drawable createMenuDrawable(View view) {
        Drawable drawableMutate = new BitmapDrawable(this.mContext.getResources(), getBitmapResource(this.mButtonResourceId, view)).mutate();
        drawableMutate.setColorFilter(this.mOverflowColor, PorterDuff.Mode.SRC_IN);
        drawableMutate.setAlpha(this.mOverflowAlpha);
        return drawableMutate;
    }

    private ImageView createOverflowMenuImageView() {
        Resources resources = this.mContext.getResources();
        NonScrollImageView nonScrollImageView = new NonScrollImageView(this.mContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = this.mOverflowGravity;
        nonScrollImageView.setLayoutParams(layoutParams);
        nonScrollImageView.setId(R.id.overflow_menu);
        int dimensionPixelSize = resources.getDimensionPixelSize(this.mMenuHorizontalMargin);
        nonScrollImageView.setPadding(dimensionPixelSize, resources.getDimensionPixelSize(this.mMenuVerticalMargin), dimensionPixelSize, 0);
        return nonScrollImageView;
    }

    @NonNull
    private View createWrapperView(@NonNull ImageView imageView) {
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(this.mWrappedView);
        frameLayout.addView(imageView);
        View[] viewArr = this.mHorizontallyCompetingViews;
        if (viewArr != null) {
            boolean z10 = (this.mOverflowGravity & 5) != 0;
            for (View view : viewArr) {
                Views.setPadding(view, R.dimen.overflow_menu_size, z10 ? 4 : 2);
            }
        }
        View[] viewArr2 = this.mVerticallyCompetingViews;
        if (viewArr2 != null) {
            boolean z11 = (this.mOverflowGravity & 48) != 0;
            for (View view2 : viewArr2) {
                Views.setPadding(view2, R.dimen.overflow_menu_size, z11 ? 8 : 1);
            }
        }
        return frameLayout;
    }

    @NonNull
    public OverflowMenuWrapper alpha(@e0(from = 0, to = e3.f81880d) int i10) {
        this.mOverflowAlpha = i10;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper buttonResourceId(@u int i10) {
        this.mButtonResourceId = i10;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper color(@k int i10) {
        this.mOverflowColor = i10;
        return this;
    }

    public void dismiss() {
        w1 w1Var = this.mPopupMenu;
        if (w1Var != null) {
            w1Var.a();
            this.mPopupMenu = null;
        }
    }

    @NonNull
    public Bitmap getBitmapResource(@u int i10, @NonNull View view) {
        return BitmapFactory.decodeResource(this.mContext.getResources(), i10);
    }

    public View.OnClickListener getOnMenuClickListener() {
        return new View.OnClickListener() { // from class: com.yandex.div.internal.widget.menu.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverflowMenuWrapper.a(this.f76694b, view);
            }
        };
    }

    @NonNull
    public View getView() {
        View view;
        if (this.mValid && (view = this.mResultView) != null) {
            return view;
        }
        if (this.mResultView == null || this.mOverflowMenuImageView == null) {
            ImageView imageViewCreateOverflowMenuImageView = createOverflowMenuImageView();
            this.mOverflowMenuImageView = imageViewCreateOverflowMenuImageView;
            this.mResultView = createWrapperView(imageViewCreateOverflowMenuImageView);
        }
        Assert.assertFalse(this.mValid);
        ImageView imageView = this.mOverflowMenuImageView;
        imageView.setImageDrawable(createMenuDrawable(imageView));
        this.mOverflowMenuImageView.setOnClickListener(getOnMenuClickListener());
        this.mValid = true;
        return this.mResultView;
    }

    @NonNull
    public OverflowMenuWrapper horizontallyCompetingViews(@NonNull View... viewArr) {
        this.mHorizontallyCompetingViews = viewArr;
        return this;
    }

    public void invalidate() {
        this.mValid = false;
    }

    @NonNull
    public OverflowMenuWrapper listener(@NonNull Listener listener) {
        this.mListener = listener;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper menuGravity(int i10) {
        this.mMenuGravity = i10;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper overflowGravity(int i10) {
        this.mOverflowGravity = i10;
        return this;
    }

    public void redrawMenuIcon() {
        if (this.mValid) {
            Assert.assertNotNull("mResultView is null in redrawMenuIcon", this.mResultView);
            ImageView imageView = this.mOverflowMenuImageView;
            imageView.setImageDrawable(createMenuDrawable(imageView));
        }
    }

    public void setMenuVisibility(int i10) {
        if (this.mValid) {
            Assert.assertNotNull("mResultView is null in setMenuVisibility", this.mResultView);
            this.mOverflowMenuImageView.setVisibility(i10);
        }
    }

    @NonNull
    public OverflowMenuWrapper verticallyCompetingViews(@NonNull View... viewArr) {
        this.mVerticallyCompetingViews = viewArr;
        return this;
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup, @p int i10, @p int i11) {
        this.mOverflowGravity = 51;
        this.mOverflowColor = -1;
        this.mOverflowAlpha = 255;
        this.mMenuGravity = 83;
        this.mButtonResourceId = R.drawable.ic_more_vert_white_24dp;
        this.mHorizontallyCompetingViews = null;
        this.mVerticallyCompetingViews = null;
        this.mValid = false;
        this.mContext = context;
        this.mWrappedView = view;
        this.mParentView = viewGroup;
        this.mMenuHorizontalMargin = i10;
        this.mMenuVerticalMargin = i11;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Listener {
        void onMenuCreated(@NonNull w1 w1Var);

        void onPopupShown();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class Simple implements Listener {
            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            public void onPopupShown() {
            }

            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            public void onMenuCreated(@NonNull w1 w1Var) {
            }
        }
    }
}
