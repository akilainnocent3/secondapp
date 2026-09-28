package com.sportybet.plugin.webcontainer.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.utils.Tools;
import defpackage.gr0;
import defpackage.sn5;

/* JADX INFO: loaded from: classes7.dex */
public class AlertMessage {
    public static void show(Context context, String str, boolean z, int i) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TextView textView = new TextView(context);
            int pixelByDip = Tools.getPixelByDip(context, 15);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setBackgroundResource(R.drawable.web_toast_bg);
            textView.setPadding(pixelByDip, pixelByDip, pixelByDip, pixelByDip);
            textView.setText(str);
            textView.setTextSize(18.0f);
            textView.setGravity(17);
            textView.setTextColor(context.getResources().getColor(R.color.white));
            textView.setCompoundDrawablesWithIntrinsicBounds(gr0.a(context, i), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(6);
            Toast toast = new Toast(context);
            textView.setText(str);
            toast.setView(textView);
            toast.setDuration(z ? 1 : 0);
            toast.setGravity(17, 0, 0);
            toast.show();
        } catch (Exception unused) {
        }
    }

    public static void show(Context context, int i) {
        show(context, (CharSequence) sn5.b(context, i, new Object[0]), false, true);
    }

    public static Toast show(Context context, CharSequence charSequence, boolean z, boolean z2) {
        try {
            if (TextUtils.isEmpty(charSequence)) {
                return null;
            }
            TextView textView = new TextView(context);
            int pixelByDip = Tools.getPixelByDip(context, 15);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setBackgroundResource(R.drawable.web_toast_bg);
            textView.setPadding(pixelByDip, pixelByDip, pixelByDip, pixelByDip);
            textView.setText(charSequence);
            textView.setGravity(17);
            textView.setTextColor(context.getResources().getColor(R.color.white));
            textView.setTextSize(14.0f);
            Toast toast = new Toast(context);
            textView.setText(charSequence);
            toast.setView(textView);
            toast.setDuration(z ? 1 : 0);
            if (z2) {
                toast.setGravity(17, 0, 0);
            }
            toast.show();
            return toast;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void show(Context context, int i, boolean z, boolean z2) {
        show(context, sn5.b(context, i, new Object[0]), z, z2);
    }

    public static void show(Context context, View view, boolean z) {
        try {
            Toast toast = new Toast(context);
            toast.setView(view);
            toast.setDuration(z ? 1 : 0);
            toast.setGravity(17, 0, 0);
            toast.show();
        } catch (Exception unused) {
        }
    }

    public static void show(Context context, View view, boolean z, boolean z2) {
        try {
            Toast toast = new Toast(context);
            toast.setView(view);
            toast.setDuration(z ? 1 : 0);
            if (z2) {
                toast.setGravity(17, 0, 0);
            }
            toast.show();
        } catch (Exception unused) {
        }
    }

    public static void show(Context context, String str) {
        show(context, (CharSequence) str, false, true);
    }
}
