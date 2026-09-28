package com.sportybet.plugin.realsports.outrights;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;
import defpackage.aff;
import defpackage.bmy;
import defpackage.bxu;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.ibz;
import defpackage.mpe0;
import defpackage.nlz;
import defpackage.r13;
import defpackage.rz70;
import defpackage.uw70;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/sportybet/plugin/realsports/outrights/SearchMarketView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Laff;", "dropdownListener", "Lrz70;", "searchTextListener", "", "setupSearchableView", "(Laff;Lrz70;)V", "", "show", "setViewStatus", "(Z)V", "Landroid/graphics/drawable/Drawable;", "G", "Lttr;", "getClear", "()Landroid/graphics/drawable/Drawable;", "clear", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SearchMarketView extends ConstraintLayout {
    public static final /* synthetic */ int K = 0;
    public final ibz F;
    public final mpe0 G;
    public aff H;
    public rz70 I;
    public String J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMarketView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.outright_search_view, this);
        int i2 = R.id.market_title;
        TextView textView = (TextView) h5e.a(R.id.market_title, this);
        if (textView != null) {
            i2 = R.id.search;
            final AppCompatEditText appCompatEditText = (AppCompatEditText) h5e.a(R.id.search, this);
            if (appCompatEditText != null) {
                i2 = R.id.search_btn;
                TextView textView2 = (TextView) h5e.a(R.id.search_btn, this);
                if (textView2 != null) {
                    ibz ibzVar = new ibz(this, textView, appCompatEditText, textView2);
                    this.F = ibzVar;
                    int i3 = 1;
                    this.G = hwr.b(new bxu(context, i3));
                    appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: tw70
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            AppCompatEditText appCompatEditText2 = appCompatEditText;
                            int i4 = SearchMarketView.K;
                            try {
                                zi50.a aVar = zi50.b;
                                SearchMarketView searchMarketView = this;
                                if (z) {
                                    appCompatEditText2.setText((CharSequence) null);
                                    view.getClass();
                                    view.requestFocus();
                                    Object systemService = view.getContext().getSystemService("input_method");
                                    systemService.getClass();
                                    ((InputMethodManager) systemService).showSoftInput(view, 0);
                                } else {
                                    view.getClass();
                                    c8i0.g(view);
                                    String str = searchMarketView.J;
                                    if (str != null) {
                                        ibz ibzVar2 = searchMarketView.F;
                                        AppCompatEditText appCompatEditText3 = ibzVar2.c;
                                        TextView textView3 = ibzVar2.b;
                                        appCompatEditText3.setText("");
                                        searchMarketView.clearFocus();
                                        searchMarketView.J = str;
                                        textView3.setVisibility(0);
                                        textView3.setText(str);
                                    }
                                }
                                aff affVar = searchMarketView.H;
                                if (affVar != null) {
                                    ((vbz) affVar).a(z);
                                    Unit unit = Unit.a;
                                }
                            } catch (Throwable unused) {
                                zi50.a aVar2 = zi50.b;
                            }
                        }
                    });
                    appCompatEditText.addTextChangedListener(new uw70(appCompatEditText, this));
                    textView2.setOnClickListener(new r13(this, 2));
                    textView.setOnClickListener(new nlz(this, ibzVar, i3));
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getClear() {
        return (Drawable) this.G.getValue();
    }

    public final void setViewStatus(boolean show) {
        ibz ibzVar = this.F;
        ibzVar.c.setVisibility(show ? 0 : 8);
        ibzVar.d.setVisibility(show ? 0 : 8);
        ibzVar.b.setVisibility(show ? 8 : 0);
        if (show) {
            return;
        }
        ibzVar.c.clearFocus();
    }

    public final void setupSearchableView(aff dropdownListener, rz70 searchTextListener) {
        dropdownListener.getClass();
        searchTextListener.getClass();
        this.H = dropdownListener;
        this.I = searchTextListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchMarketView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchMarketView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SearchMarketView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
