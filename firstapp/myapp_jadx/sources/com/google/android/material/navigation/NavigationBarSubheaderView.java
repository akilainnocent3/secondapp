package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import com.sportybet.android.gp.tz.R;
import defpackage.bkx;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationBarSubheaderView extends FrameLayout implements bkx {
    public final TextView a;
    public boolean b;
    public boolean c;
    public h d;
    public ColorStateList e;

    public NavigationBarSubheaderView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.a = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void a() {
        h hVar = this.d;
        if (hVar != null) {
            setVisibility((!hVar.isVisible() || (!this.b && this.c)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.d = hVar;
        hVar.setCheckable(false);
        this.a.setText(hVar.e);
        a();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.d;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // defpackage.bkx
    public void setExpanded(boolean z) {
        this.b = z;
        a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // defpackage.bkx
    public void setOnlyShowWhenExpanded(boolean z) {
        this.c = z;
        a();
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        TextView textView = this.a;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.e = colorStateList;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
    }
}
