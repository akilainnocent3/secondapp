package com.sportybet.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: loaded from: classes6.dex */
public class ListenableSpinner extends AppCompatSpinner implements ViewTreeObserver.OnWindowFocusChangeListener {
    public a y;
    public boolean z;

    public interface a {
        void b(ListenableSpinner listenableSpinner);

        void c(ListenableSpinner listenableSpinner);
    }

    public ListenableSpinner(Context context) {
        super(context);
        this.z = false;
    }

    public final void b() {
        this.z = false;
        a aVar = this.y;
        if (aVar != null) {
            aVar.b(this);
        }
        if (isAttachedToWindow()) {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnWindowFocusChangeListener(this);
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.z && z) {
            this.z = false;
            a aVar = this.y;
            if (aVar != null) {
                aVar.b(this);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner, android.view.View
    public final boolean performClick() {
        this.z = true;
        a aVar = this.y;
        if (aVar != null) {
            aVar.c(this);
        }
        return super.performClick();
    }

    public void setSpinnerEventsListener(a aVar) {
        this.y = aVar;
    }

    public ListenableSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = false;
    }

    public ListenableSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = false;
    }
}
