package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class k extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f50686e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50687f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Calendar f50688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50690d;

    static {
        f50687f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public k() {
        Calendar calendarX = c0.x();
        this.f50688b = calendarX;
        this.f50689c = calendarX.getMaximum(7);
        this.f50690d = calendarX.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f50689c) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public final int b(int i10) {
        int i11 = i10 + this.f50690d;
        int i12 = this.f50689c;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f50689c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ih.a.k.f92533v0, viewGroup, false);
        }
        this.f50688b.set(7, b(i10));
        textView.setText(this.f50688b.getDisplayName(7, f50687f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ih.a.m.f92590m1), this.f50688b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public k(int i10) {
        Calendar calendarX = c0.x();
        this.f50688b = calendarX;
        this.f50689c = calendarX.getMaximum(7);
        this.f50690d = i10;
    }
}
