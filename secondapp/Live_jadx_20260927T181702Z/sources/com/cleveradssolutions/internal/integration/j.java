package com.cleveradssolutions.internal.integration;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m f43552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f43553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f43554c;

    public static int a() {
        return Color.rgb(66, 133, 244);
    }

    public static GradientDrawable b(Context context) {
        m0.p(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(30, 131, 131, 131));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m0.m(displayMetrics);
        gradientDrawable.setCornerRadius((int) ((18 * displayMetrics.density) + 0.5f));
        gradientDrawable.setStroke((int) ((1 * displayMetrics.density) + 0.5f), Color.argb(255, 158, 158, 158));
        return gradientDrawable;
    }

    public static GradientDrawable c(Context context) {
        m0.p(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.argb(128, 1, 114, 253), Color.argb(128, 103, 123, 136)});
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m0.o(displayMetrics, "getDisplayMetrics(...)");
        gradientDrawable.setCornerRadius((int) ((18 * displayMetrics.density) + 0.5f));
        return gradientDrawable;
    }

    public static ImageView d(LinearLayout linearLayout, int i10) {
        m0.p(linearLayout, "<this>");
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setTag("Icon");
        if (i10 != 0) {
            imageView.setImageResource(i10);
        }
        DisplayMetrics displayMetrics = linearLayout.getContext().getResources().getDisplayMetrics();
        m0.m(displayMetrics);
        int i11 = (int) ((24 * displayMetrics.density) + 0.5f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        layoutParams.setMarginStart((int) ((4 * displayMetrics.density) + 0.5f));
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
        return imageView;
    }

    public static LinearLayout e(Context context, GradientDrawable background) {
        m0.p(context, "context");
        m0.p(background, "background");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackground(background);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m0.o(displayMetrics, "getDisplayMetrics(...)");
        int i10 = (int) ((6 * displayMetrics.density) + 0.5f);
        linearLayout.setPadding(i10, i10, i10, i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        m0.o(displayMetrics2, "getDisplayMetrics(...)");
        layoutParams.topMargin = (int) ((8 * displayMetrics2.density) + 0.5f);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    public static TextView g(ViewGroup viewGroup, String label, ViewGroup.LayoutParams layoutParams) {
        m0.p(viewGroup, "<this>");
        m0.p(label, "label");
        TextView textView = new TextView(viewGroup.getContext());
        textView.setText(label);
        if (layoutParams != null) {
            textView.setLayoutParams(layoutParams);
        }
        textView.setTextColor(-1);
        viewGroup.addView(textView);
        return textView;
    }

    public static m h() {
        return f43552a;
    }
}
