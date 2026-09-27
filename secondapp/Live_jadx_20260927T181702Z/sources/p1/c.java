package p1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public interface c extends MenuItem {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f120317g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f120318h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f120319i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f120320j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f120321k = 8;

    @NonNull
    c a(@Nullable f2.b bVar);

    @Nullable
    f2.b b();

    boolean c();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @Nullable
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @Nullable
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @Nullable
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(int i10);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(@Nullable View view);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    @NonNull
    /* bridge */ /* synthetic */ MenuItem setContentDescription(@Nullable CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    c setContentDescription(@Nullable CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(@Nullable ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(@Nullable PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    @Override // android.view.MenuItem
    void setShowAsAction(int i10);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShowAsActionFlags(int i10);

    @Override // android.view.MenuItem
    @NonNull
    /* bridge */ /* synthetic */ MenuItem setTooltipText(@Nullable CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    c setTooltipText(@Nullable CharSequence charSequence);
}
