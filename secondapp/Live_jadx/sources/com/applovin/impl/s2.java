package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f28597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f28598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f28599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f28600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t2 f28601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28602f;

    public void a(int i10) {
        this.f28602f = i10;
    }

    public t2 b() {
        return this.f28601e;
    }

    public int a() {
        return this.f28602f;
    }

    public void a(t2 t2Var) {
        this.f28601e = t2Var;
        this.f28597a.setText(t2Var.k());
        this.f28597a.setTextColor(t2Var.l());
        if (this.f28598b != null) {
            if (!TextUtils.isEmpty(t2Var.f())) {
                this.f28598b.setTypeface(null, 0);
                this.f28598b.setVisibility(0);
                this.f28598b.setText(t2Var.f());
                this.f28598b.setTextColor(t2Var.g());
                if (t2Var.p()) {
                    this.f28598b.setTypeface(null, 1);
                }
            } else {
                this.f28598b.setVisibility(8);
            }
        }
        if (this.f28599c != null) {
            if (t2Var.h() > 0) {
                this.f28599c.setImageResource(t2Var.h());
                this.f28599c.setColorFilter(t2Var.i());
                this.f28599c.setVisibility(0);
            } else {
                this.f28599c.setVisibility(8);
            }
        }
        if (this.f28600d != null) {
            if (t2Var.d() > 0) {
                this.f28600d.setImageResource(t2Var.d());
                this.f28600d.setColorFilter(t2Var.e());
                this.f28600d.setVisibility(0);
                return;
            }
            this.f28600d.setVisibility(8);
        }
    }
}
