package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import cs.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.cz2;
import yads.eg;
import yads.fg;
import yads.hj1;
import yads.ij1;
import yads.jg;
import yads.mg2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ExtendedTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ij1 f71832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eg f71833b;

    @SuppressLint({"CustomViewStyleable"})
    @k
    public ExtendedTextView(@l Context context) {
        this(context, null, 0, null, null, 30, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        eg egVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT < 27 && (egVar = this.f71833b) != null) {
            egVar.f148689a.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f71832a.a(i10, i11);
        super.onMeasure(hj1VarA.f150155a, hj1VarA.f150156b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        eg egVar;
        super.onTextChanged(charSequence, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 27 && (egVar = this.f71833b) != null) {
            egVar.f148689a.a();
        }
    }

    public final void setAutoSizeTextType(int i10) {
        if (Build.VERSION.SDK_INT >= 27) {
            setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        eg egVar = this.f71833b;
        if (egVar != null) {
            jg jgVar = egVar.f148689a;
            if (jgVar.f151090g instanceof EditText) {
                return;
            }
            if (i10 == 0) {
                jgVar.f151084a = 0;
                jgVar.f151087d = -1.0f;
                jgVar.f151086c = -1.0f;
                jgVar.f151088e = new int[0];
                jgVar.f151085b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(mg2.a("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = jgVar.f151091h.getResources().getDisplayMetrics();
            float fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float fApplyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (fApplyDimension <= 0.0f) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + fApplyDimension + "px) is less or equal to (0px)");
            }
            if (fApplyDimension2 <= fApplyDimension) {
                throw new IllegalArgumentException("Maximum auto-size text size (" + fApplyDimension2 + "px) is less or equal to minimum auto-size text size (" + fApplyDimension + "px)");
            }
            jgVar.f151084a = 1;
            jgVar.f151087d = fApplyDimension;
            jgVar.f151086c = 1.0f;
            if (jgVar.f151090g instanceof EditText) {
                jgVar.f151085b = false;
            } else {
                int iFloor = ((int) Math.floor((fApplyDimension2 - fApplyDimension) / 1.0f)) + 1;
                int[] iArr = new int[iFloor];
                for (int i11 = 0; i11 < iFloor; i11++) {
                    iArr[i11] = Math.round((i11 * jgVar.f151086c) + jgVar.f151087d);
                }
                if (iFloor != 0) {
                    Arrays.sort(iArr);
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < iFloor; i12++) {
                        int i13 = iArr[i12];
                        if (i13 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i13)) < 0) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    if (iFloor != arrayList.size()) {
                        int size = arrayList.size();
                        iArr = new int[size];
                        for (int i14 = 0; i14 < size; i14++) {
                            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
                        }
                    }
                }
                jgVar.f151088e = iArr;
                jgVar.f151085b = true;
            }
            if (jgVar.f151085b) {
                jgVar.a();
            }
        }
    }

    public final void setMeasureSpecProvider(@l ij1 ij1Var) {
        this.f71832a = ij1Var;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(i10, f10);
            return;
        }
        eg egVar = this.f71833b;
        if (egVar != null) {
            jg jgVar = egVar.f148689a;
            if ((jgVar.f151090g instanceof EditText) || jgVar.f151084a == 0) {
                jgVar.a(i10, f10);
            }
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public ExtendedTextView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public ExtendedTextView(@l Context context, @m AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, null, null, 24, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public ExtendedTextView(@l Context context, @m AttributeSet attributeSet, int i10, @l ij1 ij1Var) {
        this(context, attributeSet, i10, ij1Var, null, 16, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public ExtendedTextView(@l Context context, @m AttributeSet attributeSet, int i10, @l ij1 ij1Var, @l fg fgVar) {
        super(context, attributeSet, i10);
        this.f71832a = ij1Var;
        fgVar.getClass();
        this.f71833b = fg.a(this);
    }

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i10, ij1 ij1Var, fg fgVar, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new cz2() : ij1Var, (i11 & 16) != 0 ? new fg() : fgVar);
    }
}
